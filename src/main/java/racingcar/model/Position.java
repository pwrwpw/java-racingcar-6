package racingcar.model;

public record Position(int position) {

    public Position move() {
        return new Position(position + 1);
    }
}
