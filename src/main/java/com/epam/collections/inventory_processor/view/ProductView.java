package com.epam.collections.inventory_processor.view;

import com.epam.collections.inventory_processor.model.Product;

import java.util.List;

public class ProductView {
    private static final String HEADING_ORIGINAL_LIST_PRODUCT = "Original list:";
    private static final String HEADING_SORTED_LIST_PRODUCT = "Sorted list:";
    private static final String HEADING_DISTINCT_LIST_PRODUCT = "Distinct list:";

    public void printListOriginal(List<Product> list){
        System.out.println(HEADING_ORIGINAL_LIST_PRODUCT);
        printList(list);
    }

    public void printSortedList(List<Product> list){
        System.out.println(HEADING_SORTED_LIST_PRODUCT);
        printList(list);
    }

    public void printDistinctList(List<Product> list){
        System.out.println(HEADING_DISTINCT_LIST_PRODUCT);
        printList(list);
    }

    public void printList(List<Product> list){
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
