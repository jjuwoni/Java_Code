package com.wanted.inheritance.extend;

public class FireCar extends Car{

    public FireCar() {
        System.out.println("FirreCar 의 기본 생성자 호출됨...");

    }


    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빠아아아아아아니ㅓㅑ어랴ㅓㅑ너야ㅓㄹㄴ~~~어ㅑ러야너ㅏ얼ㅇ");
        } else {
            System.out.println("소방차가 지나갈 수 없습니다. 다 부셔지기 전에 비키세요");
        }
    }

    /* 부모의 것을 가져다 쓸 수도 있고, 본인만의 고유한 필드 or 메서드도 작성 가능하다. */
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.==========>");
    }
}
