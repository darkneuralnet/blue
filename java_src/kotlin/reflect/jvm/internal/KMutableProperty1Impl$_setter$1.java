package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "T", "V", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class KMutableProperty1Impl$_setter$1 extends Lambda implements Function0<KMutableProperty1Impl.Setter<T, V>> {
    final /* synthetic */ KMutableProperty1Impl<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl$_setter$1(KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
        super(0);
        this.this$0 = kMutableProperty1Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final KMutableProperty1Impl.Setter<T, V> invoke() {
        return new KMutableProperty1Impl.Setter<>(this.this$0);
    }
}
