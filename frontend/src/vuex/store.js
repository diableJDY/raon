import Vue from 'vue';
import Vuex from 'vuex';
//import axios from 'axios';
// 해당 옵션을 사용해줘야 store옵션을 사용 가능함
Vue.use(Vuex);

const resourceHost = 'http://localhost:8739'


const store = new Vuex.Store({
  state: {
    accessToken: null
  },
  mutations: {
    LOGIN (state, {accessToken}) {
      state.accessToken = accessToken
    },
    LOGOUT (state) {
      state.accessToken = null
    }
  },
  actions: {
    LOGIN ({commit}, {email, password}) {
      return Vue.prototype.$http.post('/loginAuth', {email, password})
        .then(({data}) => {
          commit('LOGIN', data)

          // 모든 HTTP 요청 헤더에 Authorization 을 추가한다.
          Vue.prototype.$http.defaults.headers.common['Authorization'] = `Bearer ${data.accessToken}`;
        })
    }
  },
  getters: {
  },
  modules: {

  }
})
export default store

