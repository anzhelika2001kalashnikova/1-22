package com.company;

public class RandomNumber {
    private long seed;
    private void rannumber() {
        int m = 2147483647;
        int a = 16807;
        seed = System.nanoTime() * a % m;

    }
    public int randomInt(int z) { // z - диапазон от 1 до z генерируемых случайных чисел
        rannumber();
        return (int)seed % z ;
    }

    public double randomDouble(int z ) { //z - диапазон от 1 до z генерируемых чисел, x - порядок числа (10- десятичные, 100 - сотые и т.д)
        rannumber();
        return ((double) seed % z /z);
    }

    public long randomLong(long z) { // z - диапазон от 1 до z генерируемых случайных чисел
        rannumber();
        return ((long) seed % z);
    }

    public byte randomByte(int z) { // z - диапазон от 1 до z генерируемых случайных чисел
        rannumber();
        return (byte) (seed % z );
    }
}