package com.example.you.bmicalculator;

/**
 * Created by You on 23/10/2559.
 */

    public class InputDigits {

        private String mDigits;

        public InputDigits(String digits){
            this.mDigits = digits;
        }

        public void add(int digit){
            mDigits += String.valueOf(digit);
        }

        public void clear(){
            mDigits = "";
        }

        public String get() {
            return mDigits;
        }

    }

