import java.util.*;
import java.io.*;

class BiCycle {
    String define_me() {
        return "a simple vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    String define_me() {
        return "a two-wheeler with an engine.";
    }

    MotorCycle() {
        System.out.println("Greetings! I am a motorcycle, I am " + define_me());

        
        String temp = super.define_me(); 

        System.out.println("My predecessor is a cycle which is " + temp);
    }
}

class Solution {
    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }
}
