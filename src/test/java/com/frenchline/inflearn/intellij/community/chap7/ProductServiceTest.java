package com.frenchline.inflearn.intellij.community.chap7;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @After
    public void tearDown() throws Exception {
        productRepository.deleteAllInBatch();
    }

    @Test
    public void 기본디버깅() {
        //given & when
        Long id = productService.register(1000L, "책");

        //then
        assertThat(id, is(1L));
    }

    @Test
    public void Evaluate사용하기() { // 라이브러리를 분석할때 도움이 되는 evaluete expression
        //given
        productRepository.save(new Product(1000L, "책"));
        productRepository.save(new Product(2000L, "운동화"));
        productRepository.save(new Product(3000L, "냉장고"));

        //when
        Product product = productService.findByName("운동화");

        //then
        assertThat(product.getAmount(), is(2000L));

    }
}