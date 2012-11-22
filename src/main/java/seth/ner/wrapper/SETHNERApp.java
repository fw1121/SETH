package seth.ner.wrapper;

import seth.Mutation;

import java.util.List;

/**
 * User: Tim Rocktaeschel
 * Date: 11/9/12
 * Time: 11:12 AM
 */

//Java Wrapper
public class SETHNERApp {
    public static void main(String[] args) {
        System.out.println(args[0]);
        SETHNER seth = new SETHNER();
        List<Mutation> result = seth.extractMutations(args[0]);
        for (Mutation mutation : result) {
            System.out.println(mutation);
        }
        System.out.println("Extracted " + result.size() + " mutations.");
    }
}