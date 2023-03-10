import React from 'react';
import './App.css';
import Setup from './Set-Up-Pages/Setup.js';

import { Container } from 'reactstrap';

class App extends React.Component{
  constructor(props){
    super(props);
    this.state={
      user: [],
      players:[],

    };
  }

  fetchPlayers=()=>{
  fetch('http://localhost:8080/players').then(
    (response) => 
    {
       if (response.status === 200)
       {
          return (response.json()) ;
       }
       else
       {
           console.log("HTTP error:" + response.status + ":" +  response.statusText);
           return ([ ["status ", response.status]]);
       }
    }
    )//The promise response is returned, then we extract the json data
.then ((jsonOutput) => //jsonOutput now has result of the data extraction
         {
             this.setPlayers(jsonOutput);
         }
     )
.catch((error) => 
       {console.log(error);} )

    }

    setPlayers(p){
      console.log(p);
      this.setState({
        players:p
      });
    }
  componentDidMount(){
    this.fetchPlayers();
    console.log(this.state.players);
  }

  render(){
    const playerList = this.state.players;
    return(
      <Container>
        <Setup
        players = {playerList}
        />
       
      </Container>
    )
  }
}



export default App;
