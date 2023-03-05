import React from "react";
import {Col,Container,Row} from 'reactstrap';
import PlayerCard from './PlayerCard.js';


class Setup extends React.Component{

    displayOption(){
        if(this.props.players === []){
            return <option value="" disabled>Select a Player</option>
            
        }
        else{
        return(this.props.players?.map(f=>(
            <option key={f.id} value={f} onClick={i=>this.props.onClick(i)}>{f.name}</option>
        )))
        }
    }
    render(){

        console.log(this.props.players[0]);
        return(
            <Container>
                <Row lg={3}>
                <Col>Select Player #1</Col>

                
                <Col>Set Bet</Col>
               
                <Col>Select Player #2</Col>
                
                </Row>
                <Row lg={3}>
                <Col>
                <Col><select>{this.displayOption()}</select></Col></Col>
                <Col></Col>
                <Col><select>{this.displayOption()}</select></Col>
                </Row>
                <Row lg={3}>
                <Col><PlayerCard
                player={this.props.playerOne}
                /></Col>
                <Col></Col>
                <Col><PlayerCard
                player={this.props.playerTwo}
                /></Col>
                </Row>
            </Container>
        );
    }
    
}

export default Setup;