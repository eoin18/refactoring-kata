package refactor.app.impl;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeycodeTest {

    @Test
    public void testSimpleTestCaseNoEdges() {
        Keycode keycode = new Keycode();
        String code = keycode.findCode(readFile("simple_test_case_no_edges.txt"));
        assertEquals("6918", code);
    }

//    @Test
//    public void testSimpleTestCaseWithEdges() {
//        Keycode keycode = new Keycode();
//        String code = keycode.findCode(readFile("simple_test_case_edges.txt"));
//        assertEquals("1985", code);
//    }
//
//    @Test
//    public void testComplexTestCase() {
//        Keycode keycode = new Keycode();
//        String code = keycode.findCode(readFile("simple_test_case_edges.txt"));
//        assertEquals("56983", code);
//    }

    private static String readFile(String path) {
        try {
            return IOUtils.toString(KeycodeTest.class.getClassLoader().getResourceAsStream(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}