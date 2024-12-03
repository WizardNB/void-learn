package LogicCal;

import java.util.function.Supplier;

public class WrappedBool implements Supplier<Boolean> {
    public boolean p = false;

    public WrappedBool reverse() {
        p = !p;
        return this;
    }

    @Override
    public Boolean get() {
        return p;
    }
}
