package com.minzzigle.codetoenglish.hackerrank.question1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArraysTest {
    private Arrays arrays = new Arrays();

    // green
    @Test
    public void solutions() throws Exception {
        // given
        int [] input = {1, 4, 3, 2};

        // when
        String result = arrays.solutions(input, input.length);

        // then
        assertThat(result, is("2 3 4 1 "));
    }

    // red
    @Test
    public void solutions_blank() throws Exception {
        // given
        int [] input = {1, 4, 3, 2};

        // when
        String result = arrays.solutions(input, input.length);

        // then
        assertThat(result, is("2 3 4 1"));
    }

    // green
    @Test
    public void solutions_empty() throws Exception {
        // given
        int [] input = {};

        // when
        String result = arrays.solutions(input, input.length);

        // then
        assertThat(result, is(""));
    }

    // red
    @Test
    public void solutions_recursive() throws Exception {
        // given
        int [] input = {1, 4, 3, 2};

        // when
        String result = arrays.solutions_recursive(input, 0);

        // then
        assertThat(result, is("2 3 4 1"));
    }



}