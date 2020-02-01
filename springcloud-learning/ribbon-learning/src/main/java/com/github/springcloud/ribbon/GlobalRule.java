package com.github.springcloud.ribbon;


import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author huorong
 */
public class GlobalRule implements IRule {

    private ILoadBalancer iLoadBalancer;

    @Override
    public Server choose(Object o) {
        List<Server> servers = iLoadBalancer.getAllServers();
        return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.iLoadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.iLoadBalancer;
    }
}
