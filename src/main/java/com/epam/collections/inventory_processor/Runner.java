package com.epam.collections.inventory_processor;

import com.epam.collections.inventory_processor.controller.ProductController;

public class Runner {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        controller.run(args[0]);
    }
}
