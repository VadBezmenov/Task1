package com.company;

public class Main {

    public static void main(String[] args) {

        int examStartH = 9;            // Часы начала экзамена
        float examStartM = 0.0f;      // Минуты начала экзамена, где 0.0 - ноль минут

        int   examFinishH = 9;        // Часы завершения экзамена
        float examFinishM = 0.5f;     // Минуты завершения экзамена, где 0.5 - полчаса(30 мин)

        int StudCominH = 8;          // Часы приходя студента на экзамен
        float StudCominM = 0.5f;    // Минуты прихода студента на экзамен, где 0.5 - полчаса(30 мин)

if ((StudCominH < examStartH) && (StudCominM < examStartM))
        {
            System.out.println("Студент пришел заранее");

        }
if ((StudCominH < examStartH) && (StudCominM - StudCominM == 0))
        {
            System.out.println("Студент пришел слишком рано");
        }
if ((StudCominH > examStartH) && (StudCominM > examStartM))
        {
            System.out.println("Студент опоздал");
        }
        }

}
/* Сложно, даже не знаю, что и придумать. Может через Scanner, чтобы вводить в окно output числовые значения ???
Было бы неплохо, если бы показали несколько вариантов решения. Спасибо! */
