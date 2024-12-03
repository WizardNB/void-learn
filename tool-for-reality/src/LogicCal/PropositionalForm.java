package LogicCal;

import java.util.function.Supplier;

public class PropositionalForm {
    public static Supplier<Boolean> negation(Supplier<Boolean> o) {
        return () -> !o.get();
    }

    public static Supplier<Boolean> conjunction(Supplier<Boolean> p, Supplier<Boolean> q) {
        return () -> p.get() && q.get();
    }

    public static Supplier<Boolean> disjunction(Supplier<Boolean> p, Supplier<Boolean> q) {
        return () -> p.get() || q.get();
    }

    public static Supplier<Boolean> strict_disjunction(Supplier<Boolean> p, Supplier<Boolean> q) {
        return () -> p.get() ^ q.get();
    }

    public static Supplier<Boolean> implication(Supplier<Boolean> p, Supplier<Boolean> q) {
        return () -> (!p.get()) || q.get();
    }

    public static Supplier<Boolean> bicondition(Supplier<Boolean> p, Supplier<Boolean> q) {
        return () -> implication(p,q).get() && implication(q,p).get();
    }
}
