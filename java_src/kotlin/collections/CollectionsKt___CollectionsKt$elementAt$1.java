package kotlin.collections;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "T", "it", "", "invoke", "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class CollectionsKt___CollectionsKt$elementAt$1 extends Lambda implements Function1<Integer, T> {
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsKt___CollectionsKt$elementAt$1(int i) {
        super(1);
        this.$index = i;
    }

    public final T invoke(int i) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.$index + CoreConstants.DOT);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}