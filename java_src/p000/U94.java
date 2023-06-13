package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\f"}, m28432d2 = {"LU94;", "T", "Lfu0;", "value", "LW94;", "c", "(Ljava/lang/Object;)LW94;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U94 */
/* loaded from: classes.dex */
public abstract class U94<T> extends AbstractC41213fu0<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U94(Function0<? extends T> defaultFactory) {
        super(defaultFactory, null);
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
    }

    /* renamed from: c */
    public final W94<T> m81907c(T t) {
        return new W94<>(this, t, true);
    }

    /* renamed from: d */
    public final W94<T> m81906d(T t) {
        return new W94<>(this, t, false);
    }
}
