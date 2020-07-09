package com.frenchline.inflearn.intellij.community.chap7;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);

}
