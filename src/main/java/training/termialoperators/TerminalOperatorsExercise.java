package training.termialoperators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
        set.addAll(stream.collect(Collectors.toSet()));
    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {
        list.addAll(stream.sorted(Collections.reverseOrder()).collect(Collectors.toList()));
    }

    @Override
    public String[] collectToArray(Stream<String> stream) {
        return stream
                .toArray(String[]::new);
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {
        return stream
                .collect(Collectors.toSet());
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {
        return stream
                .collect(Collectors.toList());
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {
        return stream
                .map(Object::toString)
                .collect(Collectors.joining("-", "[", "]"));
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        return stream
                .map(Object::toString)
                .collect(Collectors.joining()).length();
    }

    @Override
    public int longestWordLength(Stream<String> stream) {
        return stream
                .max(Comparator.comparingInt(String::length))
                .orElse("")
                .length();
    }

    @Override
    public String longestWord(Stream<String> stream) {
        return stream
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return stream
                .collect(Collectors.groupingBy(String::length, Collectors.toList()));
    }
}
