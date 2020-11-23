package training.creation;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExercise implements StreamCreator {

    @Override
    public IntStream positiveDigitsUsingOf() {
        return IntStream
                .of(1,2,3,4,5,6,7,8,9);
    }

    @Override
    public IntStream positiveDigitsUsingRange() {
        return IntStream
                .range(1,10);
    }

    @Override
    public IntStream positiveDigitsUsingIterate() {
        return IntStream
                .iterate(1, n -> n<10, n -> n+1);
    }

    @Override
    public IntStream powersOfTwo() {
        return IntStream
                .iterate(2, n -> n<=1024, n -> n*2);
    }

    @Override
    public DoubleStream from0Till1WithTenSteps() {
        return IntStream
                .iterate(0, n -> n<10, n -> n+1)
                .asDoubleStream()
                .map(n -> n/10);
    }

    @Override
    public Stream<String> alphabet() {
        return IntStream
                .iterate(65, n -> n<=90, n -> n+1)
                .mapToObj(Character::toString);
    }

}
