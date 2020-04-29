package com.Teksystems.Assessment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PhoneNumberPermutations implements PhoneNumberPermutationsInterface {

    private static final Map<Integer, char[]> phoneKeyPadMap;

    static {
        Map<Integer, char[]> tempMap = new HashMap<>(8);
        tempMap.put(2, new char[]{'a', 'b', 'c'});
        tempMap.put(3, new char[]{'d', 'e', 'f'});
        tempMap.put(4, new char[]{'g', 'h', 'i'});
        tempMap.put(5, new char[]{'j', 'k', 'l'});
        tempMap.put(6, new char[]{'m', 'n', 'o'});
        tempMap.put(7, new char[]{'p', 'q', 'r', 's'});
        tempMap.put(8, new char[]{'t', 'u', 'v'});
        tempMap.put(9, new char[]{'w', 'x', 'y', 'z'});
        phoneKeyPadMap = Collections.unmodifiableMap(tempMap);
    }

    private static final Logger logger = LoggerFactory.getLogger(PhoneNumberPermutations.class);

    @Override
    public List<String> createAllPermutations(String phoneNumber) {
        List<String> allCombinations = new ArrayList<>();

        char[] charArray = phoneNumber.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            char x = charArray[i];
            char[] underlyingKeyPadChars = phoneKeyPadMap.get(Integer.parseInt(String.valueOf(x)));
            if (Objects.nonNull(underlyingKeyPadChars)) {
                for (char keypadChar : underlyingKeyPadChars) {
                    allCombinations.add(substituteChar(phoneNumber, i, keypadChar));
                }
            }
        }
        logger.info("Request phone number {} created {} combinations", phoneNumber, allCombinations.size());
        return allCombinations;
    }

    private String substituteChar(String input, int i, char keypadChar) {
        return input.substring(0, i) + keypadChar + input.substring(i + 1);
    }
}
