
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import BoundedContext185ClientOrderManager from "./components/listers/BoundedContext185ClientOrderCards"
import BoundedContext185ClientOrderDetail from "./components/listers/BoundedContext185ClientOrderDetail"

import BoundedContext46ShopOrderManager from "./components/listers/BoundedContext46ShopOrderCards"
import BoundedContext46ShopOrderDetail from "./components/listers/BoundedContext46ShopOrderDetail"

import BoundedContext1499DeliveryManager from "./components/listers/BoundedContext1499DeliveryCards"
import BoundedContext1499DeliveryDetail from "./components/listers/BoundedContext1499DeliveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/boundedContext185s/clientOrders',
                name: 'BoundedContext185ClientOrderManager',
                component: BoundedContext185ClientOrderManager
            },
            {
                path: '/boundedContext185s/clientOrders/:id',
                name: 'BoundedContext185ClientOrderDetail',
                component: BoundedContext185ClientOrderDetail
            },

            {
                path: '/boundedContext46s/shopOrders',
                name: 'BoundedContext46ShopOrderManager',
                component: BoundedContext46ShopOrderManager
            },
            {
                path: '/boundedContext46s/shopOrders/:id',
                name: 'BoundedContext46ShopOrderDetail',
                component: BoundedContext46ShopOrderDetail
            },

            {
                path: '/boundedContext1499s/deliveries',
                name: 'BoundedContext1499DeliveryManager',
                component: BoundedContext1499DeliveryManager
            },
            {
                path: '/boundedContext1499s/deliveries/:id',
                name: 'BoundedContext1499DeliveryDetail',
                component: BoundedContext1499DeliveryDetail
            },



    ]
})
