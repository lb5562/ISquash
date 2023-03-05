import React from "react";
import {Col,Container,Row,Card} from 'reactstrap';

class PlayerCard extends React.Component{
    render(){
        if(this.props.player === null){
            return(<></>);
        }else{
            console.log(this.props.player);
        return(
            
            <Card>
                <Row><Col>Name :{this.props.player.name}</Col></Row>
                <Row><Col>{}</Col></Row>

                </Card>
        );
        }
    }
    
}
export default PlayerCard;