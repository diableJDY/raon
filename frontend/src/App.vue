<template>
  <section id="app-container">
  <Xheader></Xheader>
    <div id="app">
    <img src="./assets/logo.png">
    <router-view/>
    </div>
  </section>
</template>

<script>
import Xheader from './components/header'
export default {
  name: 'App',
  components: {
    Xheader
  }
}

</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
#app-container{
  position:absolute;
  left:0;
  right:0;
  top:0;
  bottom:0;
  overflow:hidden;
}
</style>
