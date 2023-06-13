package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/FilterOption;", "T", "", "label", "", "value", "(ILjava/lang/Object;)V", "getLabel", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lco/bird/android/model/FilterOption;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FilterOption<T> {
    private final int label;
    private final T value;

    public FilterOption(int i, T t) {
        this.label = i;
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterOption copy$default(FilterOption filterOption, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = filterOption.label;
        }
        if ((i2 & 2) != 0) {
            obj = filterOption.value;
        }
        return filterOption.copy(i, obj);
    }

    public final int component1() {
        return this.label;
    }

    public final T component2() {
        return this.value;
    }

    public final FilterOption<T> copy(int i, T t) {
        return new FilterOption<>(i, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterOption) {
            FilterOption filterOption = (FilterOption) obj;
            return this.label == filterOption.label && Intrinsics.areEqual(this.value, filterOption.value);
        }
        return false;
    }

    public final int getLabel() {
        return this.label;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.label) * 31;
        T t = this.value;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        int i = this.label;
        T t = this.value;
        return "FilterOption(label=" + i + ", value=" + t + ")";
    }
}
