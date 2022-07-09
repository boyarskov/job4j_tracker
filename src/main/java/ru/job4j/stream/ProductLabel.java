package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(x -> x.getStandard() - x.getActual() >= 0)
                .filter(x -> x.getStandard() - x.getActual() <= 3)
                .map(product -> new Label(product.getName(), product.getPrice() / 2).toString())
                .collect(Collectors.toList());
    }
}
