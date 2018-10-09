import Vue from 'vue'

import Router from 'vue-router'
import IndexPage from '../components/IndexPage'
import Show from '../components/ShowPage'
import Login from '../components/Login'


Vue.use(Router)


export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'index',
      component: IndexPage
    },
    {
      path: '/movie',
      name: 'index',
      component: IndexPage
    },
    {
      path: '/movie/:id',
      name: 'show',
      component: Show
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    }
  ]
})
