import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { Header, Avatar, MyCustomLeftComponent } from 'react-native-elements';
import Datepicker from './Datepicker.js';

export default class App extends React.Component {
  render() {
    return (
      <View>
        <Header
          statusBarProps={{ barStyle: 'light-content' }}
          centerComponent={{ text: 'Một cái tiêu đề', style: { color: '#fff' } }}
          outerContainerStyles={{ backgroundColor: '#3D6DCC' }}
          innerContainerStyles={{ justifyContent: 'space-around', }}
        />
        <View style={styles.head}>
          <Avatar
            large
            rounded
            source={{ uri: "https://s3.amazonaws.com/uifaces/faces/twitter/brynn/128.jpg" }}
            onPress={() => console.log("Works!")}
            activeOpacity={0.7}
          />
          <Text> Tú đẹp trai </Text>
        </View>
        <View style={styles.body} >
          <Text> Ngày sinh của bạn </Text>
          <Datepicker />
        </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  head: {
    marginTop: 20,
    alignItems: "center",
  },
  body: {
    marginTop: 20,
    alignItems: "center",
  },
});
