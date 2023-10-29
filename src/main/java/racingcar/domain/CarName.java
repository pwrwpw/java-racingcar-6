package racingcar.domain;

import racingcar.constants.ExceptionMessage;

public class CarName {

    private final String name;

    public CarName(final String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(final String name) {
        validateCarNameIsBlank(name);
        validateLengthCarName(name);
    }

    private void validateCarNameIsBlank(final String name) {
        if (name == null || name.trim().isEmpty()) {
            ExceptionMessage.NONE_INPUT_CARS.throwException();
        }
    }

    private void validateLengthCarName(final String name) {
        if (name.length() < 1 || name.length() > 5) {
            ExceptionMessage.CAR_NAME_LIMIT_EXCEEDED.throwException();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
