package com.epam.collections.inventory_processor.controller;

import com.epam.collections.inventory_processor.InventoryProcessor;
import com.epam.collections.inventory_processor.model.Product;
import com.epam.collections.inventory_processor.view.ProductView;

import java.util.ArrayList;
import java.util.List;


public class ProductController {
    public void run(String src){
        InventoryProcessor inventoryProcessor = new InventoryProcessor();
        ProductView productView = new ProductView();
        List<Product> originalProductList = inventoryProcessor.originalList(inventoryProcessor.readFile(src));
        List<Product> sortedProductList = inventoryProcessor.sort(originalProductList);
        List<Product> distinctProductList = inventoryProcessor.distinct(sortedProductList);
        productView.printListOriginal(originalProductList);
        productView.printSortedList(sortedProductList);
        productView.printDistinctList(distinctProductList);
    }
}
