package LogicCal;

/**
 * 用于创建包含两个类型的元素的集合
 * @param <L>
 * @param <R>
 */
public class Either<L, R> {
    public final L left;
    public final R right;
    private final boolean isLeft;

    private Either(boolean isLeft, L left, R right) {
        this.isLeft = isLeft;
        this.left = left;
        this.right = right;
    }

    public static <L, R> Either<L, R> left(L left) {
        return new Either<L, R>(true, left, null);
    }
    public static <L, R> Either<L, R> right(R right) {
        return new Either<L, R>(false, null, right);
    }

    public boolean isLeft() {
        return isLeft;
    }
}
