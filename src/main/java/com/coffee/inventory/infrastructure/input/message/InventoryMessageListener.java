package com.coffee.inventory.infrastructure.input.message;

import com.coffee.inventory.application.handler.IInventoryHandler;
import com.coffee.inventory.infrastructure.out.jpa.entity.InventoryProduct;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class InventoryMessageListener {
    private final IInventoryHandler inventoryHandler;
    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryMessageListener.class);
    public static final String QUEUE = "queue_demo_json";

    @RabbitListener(queues = QUEUE)
    public void consumeMessageFromQueue(InventoryProduct inventoryProduct) {
        LOGGER.info(String.format("Recieved JSON message -> %s", inventoryProduct.toString()));
    }
}
