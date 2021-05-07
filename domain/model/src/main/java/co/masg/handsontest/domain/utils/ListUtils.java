package co.masg.handsontest.domain.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ListUtils {

    public static <T, S> List<S> convertList(List<T> list, Function<T, S> function){
        return Objects.isNull(list) || list.isEmpty() ? Collections.emptyList() :
                list.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}
