// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './vuex/store'
import axios from 'axios'
import 'es6-promise/auto'
import Vuex from 'vuex'

Vue.prototype.$http = axios

Vue.use(Vuex)



Vue.config.productionTip = false

/* eslint-disable no-new */
/*new Vue({
  el: '#app',
  router,
  components: { App , Xheader},
  template: '<App/>'
},/!*{
  el: '#xheader',
  router,
  components: { Xheader },
  template: '<Xheader/>'
  }*!/
)*/

new Vue({
  store,
  router,
  render: h => h(App)
}).$mount('#app')
