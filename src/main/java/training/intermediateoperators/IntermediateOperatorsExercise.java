package training.intermediateoperators;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperatorsExercise implements StreamIntermediateOperators {

    @Override
    public Stream<String> wordsLongerThanFiveCharacters(List<String> words) {
        return words
                .stream()
                .filter(word -> word.length()>5);
    }

    @Override
    public Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words) {
        return words
                .stream()
                .filter(word -> word.length()>5)
                .limit(3);
    }

    @Override
    public Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words) {
        return words
                .stream()
                .distinct()
                .filter(word -> word.length()>5)
                .limit(3)
                .sorted(Collections.reverseOrder());
    }

    @Override
    public Stream<Integer> lengthOfWords(List<String> words) {
        return words
                .stream()
                .map(String::length);
    }

    @Override
    public Stream<Integer> staircase() {
        return Stream
                .iterate(0, n -> n<8, n -> n+1)
                .flatMap(n -> Stream.iterate(0, m -> m<n, m -> m+1));
    }
}
