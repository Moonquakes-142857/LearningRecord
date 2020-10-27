import Vue from 'vue'
import Router from 'vue-router'
// 导入刚才编写的组件
import AppIndex from '@/components/home/Appindex'
import Login from '@/components/Login'
import Home from '@/components/Home'
import LibraryIndex from '@/components/library/LibraryIndex'


Vue.use(Router)

export default new Router({
    mode: 'history',

    routes: [
        { path: '/home', name: 'Home', component: Home,
            // home页面并不需要被访问
            redirect: '/index',
            children: [
                { path: '/index', name: 'AppIndex', component: AppIndex, meta: {requireAuth: true}},
                { path: '/library', name: 'Library', component: LibraryIndex, meta: {requireAuth: true}}
            ]
        },
        { path: '/login', name: 'Login', component: Login},
        { path: '/', redirect: '/login' },
        {
            path: '/',
            name: 'index',
            redirect: '/index',
            component: AppIndex,
            meta: {
                requireAuth: true
            }
        },
    ]

    // routes: [
    //     { path: '/', redirect: '/login' },
    //     { path: '/login', name: 'Login', component: Login },
    //     { path: '/index', name: 'Appindex', component: AppIndex,meta: {requireAuth: true} },
    // ]
})