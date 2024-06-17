package com.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        FizzBuzz.fizzBuzz();

        String[] lines = outContent.toString().split(System.lineSeparator());

        // Asegúrate de que haya suficientes líneas generadas
        assertEquals(100, lines.length, "Debe haber 100 líneas generadas por FizzBuzz");

        // Verifica algunas líneas específicas según la lógica de FizzBuzz
        assertEquals("1", lines[0].trim());
        assertEquals("2", lines[1].trim());
        assertEquals("Fizz", lines[2].trim()); // Tercera línea, debe ser "Fizz"
        assertEquals("4", lines[3].trim());
        assertEquals("Buzz", lines[4].trim()); // Quinta línea, debe ser "Buzz"
        assertEquals("Fizz", lines[5].trim()); // Sexta línea, debe ser "Fizz"
        assertEquals("7", lines[6].trim());
        assertEquals("8", lines[7].trim());
        assertEquals("Fizz", lines[8].trim()); // Novena línea, debe ser "Fizz"
        assertEquals("Buzz", lines[9].trim()); // Décima línea, debe ser "Buzz"
        assertEquals("11", lines[10].trim());
        assertEquals("Fizz", lines[11].trim()); // Duodécima línea, debe ser "Fizz"
        assertEquals("13", lines[12].trim());
        assertEquals("14", lines[13].trim());
        assertEquals("FizzBuzz", lines[14].trim()); // Decimoquinta línea, debe ser "FizzBuzz"
        assertEquals("16", lines[15].trim());
        assertEquals("17", lines[16].trim());
        assertEquals("Fizz", lines[17].trim()); // Decimoctava línea, debe ser "Fizz"
        assertEquals("19", lines[18].trim());
        assertEquals("Buzz", lines[19].trim()); // Vigésima línea, debe ser "Buzz"
        assertEquals("Fizz", lines[20].trim()); // Vigésima primera línea, debe ser "Fizz"
        // Continúa verificando las líneas según sea necesario

        System.setOut(System.out);
    }
}
