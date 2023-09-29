package com.company.autoservice.screen.order;

import io.jmix.ui.screen.*;
import com.company.autoservice.entity.Order;

@UiController("Order_.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
public class OrderEdit extends StandardEditor<Order> {
}