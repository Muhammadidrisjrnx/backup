import React, { Component } from 'react';
import { View, Text ,TouchableHighlight} from 'react-native';
import Screen_Two from '.src/screen/screen_two';
class Screen_One extends Component {
  static navigation_option={
      title:"Welcome to Screen 2"
  }

  render() {
    const {navigate} = this.props.navigation
    return (
      <View>
      <TouchableHighlight
      onPress = {()=>navigate("Screen two",{screen : "Screen_Two"})}
      >
      <Text>Screen One</Text>
      </TouchableHighlight>        
      </View>
    );
  }
}
