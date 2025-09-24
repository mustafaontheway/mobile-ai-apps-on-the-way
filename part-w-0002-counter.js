import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button } from 'react-native';

import { useState } from 'react';

export default function App() {

  const [counter, setCounter] = useState(0)

  function counterUp() {
    setCounter(counter + 1)
  }

  function counterDown() {
    setCounter(counter - 1)
  }
  return (
    <View style={styles.container}>
      <Button title='Counter ++' onPress={counterUp} />
      <Text style={styles.txt}>Counter value: {counter}</Text>
      <Button title='Counter --' onPress={counterDown} />
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },

  txt: {
    fontSize: 20,
    marginBottom: 5,
    marginTop: 5,
  }
});
