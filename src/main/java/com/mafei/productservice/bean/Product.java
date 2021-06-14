package com.mafei.productservice.bean;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/*
  @Author kalhara@bowsin
  @Created 6/14/2021 5:08 PM  
*/
@Data
public class Product {


    private String productName;
    private String productID;
    private BigDecimal productPrice;

    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    public static class ProductAddDTO extends Product {

    }

    @Data
    @Builder
    public static class ProductUpdateDTO {

    }
}
