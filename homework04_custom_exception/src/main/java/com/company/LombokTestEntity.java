package com.company;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Builder
public class LombokTestEntity {
    private String fieldOne;
    private int fieldTwo;

    public static void main(String[] args) {
        LombokTestEntity entityOne = new LombokTestEntity();
        LombokTestEntity entityTwo = new LombokTestEntity("fieldOne", 12);

        entityOne.setFieldOne("ds");
        entityOne.setFieldTwo(2);
        System.out.println(entityOne.toString());
        System.out.println(entityTwo.hashCode());

        System.out.println(LombokTestEntity.builder().fieldOne("123").fieldTwo(2).build());

    }
}
