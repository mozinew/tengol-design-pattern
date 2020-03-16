package com.tengol.design.pattern.mooc.structural.decorator.d1;

import javax.security.auth.Subject;

/**
 * MorriganAensland
 *
 * @author dongrui
 * @date 2020/2/25 22:39
 */
public class MorriganAensland {
    public static void main(String[] args) {
        Morrigan m0 = new OriginalMorrigan();
        m0.display();

        Morrigan m1 = new Succubus(m0);
        m1.display();

        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}
