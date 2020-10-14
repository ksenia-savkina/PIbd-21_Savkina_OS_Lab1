package com.company;

import java.util.LinkedHashMap;

public class SystemCore {
    private Stack stack;

    private LinkedHashMap<Integer, SystemCall> sysCalls;

    private final int countSysCalls = 5;

    public SystemCore(Stack stack) {
        sysCalls = new LinkedHashMap<>(5);
        sysCalls.put(0, new SystemCall(new Object[]{"hey", 0.5}, "Строка и дробное число"));
        sysCalls.put(1, new SystemCall(new Object[]{1, ""}, "Целое число и строка"));
        sysCalls.put(2, new SystemCall(new Object[]{5.5, 2}, "Дробное число и целое число"));
        sysCalls.put(3, new SystemCall(new Object[]{"a", "b", "c", "d"}, "Четыре строки"));
        sysCalls.put(4, new SystemCall(new Object[]{9, 8, 7, 6, 5}, "5 целых чисел"));
        this.stack = stack;
    }

    public void getListOfSysCalls() {
        System.out.println("Список системных вызовов:");
        for (int key : sysCalls.keySet()) {
            System.out.print("Системный вызов с индексом " + key + " принимает параметры: ");
            for (int i = 0; i < sysCalls.get(key).getObject().length; i++) {
                System.out.print(sysCalls.get(key).getObject()[i] + " ");
            }
            System.out.println("- " + sysCalls.get(key).getDescription());
        }
    }

    public void systemCall(int index) {
        String str = "";
        if (index >= countSysCalls) {
            System.out.println("Нет системного вызова с индексом " + index);
            stack.clear();
            return;
        }
        if (!this.stack.isEmpty()) {
            if (stack.countObj() == (sysCalls.get(index).getObject()).length) {
                for (int i = stack.countObj() - 1; i >= 0; i--) {
                    Object node = stack.pop();
                    if (node != null) {
                        if (node.getClass() != sysCalls.get(index).getObject()[i].getClass()) {
                            System.out.println("В системном вызове по индексу " + index + " были неправильно указаны аргументы");
                            stack.clear();
                            return;
                        }
                        str = node.toString() + " " + str;
                    }
                }
                System.out.println("Вызывается системный вызов по индексу " + index + ": " + str);
            } else {
                System.out.println("Количество аргументов в системном вызове " + index + " неверное");
                stack.clear();
            }
        } else {
            System.out.println("В стеке закончились системные вызовы!");
        }
    }
}