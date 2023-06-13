package co.bird.android.model;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/IntervalFilter;", "T", "", "", "min", "max", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getMax", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getMin", "component1", "component2", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "copy", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lco/bird/android/model/IntervalFilter;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IntervalFilter<T extends Comparable<? super T>> {
    private final T max;
    private final T min;

    public IntervalFilter(T min, T max) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        this.min = min;
        this.max = max;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntervalFilter copy$default(IntervalFilter intervalFilter, Comparable comparable, Comparable comparable2, int i, Object obj) {
        if ((i & 1) != 0) {
            comparable = intervalFilter.min;
        }
        if ((i & 2) != 0) {
            comparable2 = intervalFilter.max;
        }
        return intervalFilter.copy(comparable, comparable2);
    }

    public final T component1() {
        return this.min;
    }

    public final T component2() {
        return this.max;
    }

    public final boolean contains(T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T t = this.min;
        if (value.compareTo(this.max) > 0 || value.compareTo(t) < 0) {
            return false;
        }
        return true;
    }

    public final IntervalFilter<T> copy(T min, T max) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        return new IntervalFilter<>(min, max);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntervalFilter) {
            IntervalFilter intervalFilter = (IntervalFilter) obj;
            return Intrinsics.areEqual(this.min, intervalFilter.min) && Intrinsics.areEqual(this.max, intervalFilter.max);
        }
        return false;
    }

    public final T getMax() {
        return this.max;
    }

    public final T getMin() {
        return this.min;
    }

    public int hashCode() {
        return (this.min.hashCode() * 31) + this.max.hashCode();
    }

    public String toString() {
        T t = this.min;
        T t2 = this.max;
        return "IntervalFilter(min=" + t + ", max=" + t2 + ")";
    }
}
