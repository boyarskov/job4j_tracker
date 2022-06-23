//package ru.job4j.stream;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Calendar;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class ProductService {
//    public List<String> generateLabels(List<Product> products) {
//        LocalDateTime today = LocalDateTime.now();
//        float sale = (float) 5;
//        return products.stream()
//                .filter(product -> product.getExpired()
//                        .equals(today.minusDays(2)))
//                .filter(product -> product.getExpired()
//                        .equals(today.minusDays(1)))
//                //.map(product -> product.getPrice() - sale)
//
//    }
//}
