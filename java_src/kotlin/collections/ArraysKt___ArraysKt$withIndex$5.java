package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class ArraysKt___ArraysKt$withIndex$5 extends Lambda implements Function0<Iterator<? extends Long>> {
    final /* synthetic */ long[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$5(long[] jArr) {
        super(0);
        this.$this_withIndex = jArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Iterator<? extends Long> invoke() {
        return ArrayIteratorsKt.iterator(this.$this_withIndex);
    }
}
