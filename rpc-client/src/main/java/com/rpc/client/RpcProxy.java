package com.rpc.client;

import com.xxx.rpc.registry.ServiceDiscovery;

public class RpcProxy {
    private String serviceAddress;
    private ServiceDiscovery serviceDiscovery;
    public RpcProxy(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public RpcProxy(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

}
