import Vue from 'vue'
import Router from 'vue-router'
import home from '@/components/common/Home'
import dashboard from '@/components/common/page/Dashboard'
import travelPlan from '@/components/common/page/TravalPlan'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/Dashboard'
    },
    {
      path: '/',
      name: 'Home.vue',
      component: home,
      children: [

        {
          path: '/Dashboard',
          name: 'dashboard',
          component: dashboard
        },
        {
          path: '/TravelPlan',
          name: 'travelPlan',
          component: travelPlan
        }
      ]
    }
  ]
})
