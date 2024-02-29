<template>
  <div id="app">
    <Header v-bind="headerParams"/>

    <Loader id="load" v-if="loading"/>
    <div id="contentContainer" v-else>
      <router-view/>
      <notifications group="error" position="bottom right" max="5" />
      <notifications group="success" position="bottom right" max="5" />
    </div>


  </div>
</template>

<script>
import Header from "@/components/Header";
import Loader from "@/components/Loader";

export default {
  name: 'App',
  components: {
    Header,
    Loader
  },
  data(){
    return {
      headerParams: {
        title: "Лабораторная работа №4",
        authorName1: "Трофимов Владислав",
        authorUrl1: "https://github.com/viladit",
        authorName2: "Боринский Игорь",
        authorUrl2: "https://github.com/xmnlssv",
        varUrl: "https://github.com/viladit/webLab4"
      },
      footerParams: {
        authorLogoPath1: "/assets/vlad.png",
        authorUrl1: "https://github.com/viladit",
        authorLogoPath2: "/assets/igot.png",
        authorUrl2: "https://github.com/xmnlssv",
      },
      loading: true
    }
  },
  mounted(){
    setTimeout(() => {this.loading = false}, 1000)
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

body{
  margin: 0;
  padding: 0;
  height: 100%;
  background-color: whitesmoke;
}

#contentContainer{
  margin-top: 100px;
  margin-bottom: 90px;
}
#load{
  position: absolute;
  top: 50%;
  left: 50%;
  margin-right: -50%;
  transform: translate(-50%, -50%);
  color: grey;
}
</style>
