package com.wanted.a_generic.b_use;

public class WildcardFarm {
/*                  아까 RabbitFarm에 Rabbit을 넣은 RabbitFarm<Rabbit>을 farm이라는 이름으로 전달 */
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
        /*  Application02의 명령문에서 이미 new RabbitFarm<?>을 선언해서 getAnimal()을 바로 호출 가능 */
        /* getAnimal()실행 -> RabbitFarm의 getAnimal 메소드로 이동 */
        /* 반환된 animal을 갖고 .cry() 실행 -> Application02 이동*/
    }

    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }

}
