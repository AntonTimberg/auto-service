package com.company.autoservice.listener;

import com.company.autoservice.entity.Order;
import io.jmix.core.event.EntityLoadingEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {

    @EventListener
    public void onOrderLoading(final EntityLoadingEvent<Order> event) {

    }
}