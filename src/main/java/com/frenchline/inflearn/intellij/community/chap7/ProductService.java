package com.frenchline.inflearn.intellij.community.chap7;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Long register(long amount, String name) {
        Product product = new Product(amount, name);
        Product savedProduct = productRepository.save(product);
        return savedProduct.getId();
    }

    @Transactional
    public Product findByName(String name) {
        return productRepository.findByName(name)
                .orElseThrow(() -> new IllegalArgumentException(name + "제품은 없습니다."));
    }
}




