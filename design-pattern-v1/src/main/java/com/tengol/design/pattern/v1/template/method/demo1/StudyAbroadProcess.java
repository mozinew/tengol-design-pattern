package com.tengol.design.pattern.v1.template.method.demo1;

/**
 * StudyAbroadProcess - 用模板方法模式模拟出国留学
 * 分析：出国留学手续一般经过以下流程：索取学校资料，提出入学申请，办理因私出国护照、出境卡和公证，申请签证，体检、订机票、准备行装，抵达目标学校等，
 * 其中有些业务对各个学校是一样的，但有些业务因学校不同而不同，所以比较适合用模板方法模式来实现。
 *
 * @author dongrui
 * @date 2020/3/16 13:41
 */
public class StudyAbroadProcess {
    public static void main(String[] args) {
        //美国留学
        StudyAbroad ab = new StudyInAmerica();
        //美国留学过程
        ab.templateMethod();
    }
}
