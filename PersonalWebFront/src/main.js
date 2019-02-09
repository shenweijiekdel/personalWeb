// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import router from './router'
// import VueAMap from 'vue-amap';
Vue.use(ElementUI);
Vue.config.productionTip = false;

/**
 * Amap组件
 */
/*Vue.use(VueAMap);
VueAMap.initAMapApiLoader({
  key: '160cab8ad6c50752175d76e61ef92c50',
  plugin: ['AMap.Autocomplete', 'AMap.PlaceSearch', 'AMap.Scale', 'AMap.OverView', 'AMap.ToolBar', 'AMap.MapType', 'AMap.PolyEditor', 'AMap.CircleEditor','AMap.Geocoder'],
  // 默认高德 sdk 版本为 1.4.4
  v: '1.4.4'
});*/
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
});
