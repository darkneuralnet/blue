package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0014J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000R \u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lkotlin/reflect/jvm/internal/ComputableClassValue;", "V", "Ljava/lang/ClassValue;", "Ljava/lang/ref/SoftReference;", "compute", "Lkotlin/Function1;", "Ljava/lang/Class;", "(Lkotlin/jvm/functions/Function1;)V", "computeValue", "type", "createNewCopy", "kotlin-reflection"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
final class ComputableClassValue<V> extends ClassValue<SoftReference<V>> {
    @JvmField
    public final Function1<Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputableClassValue(Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
    }

    public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
        return m118081computeValue((Class<?>) cls);
    }

    public final ComputableClassValue<V> createNewCopy() {
        return new ComputableClassValue<>(this.compute);
    }

    /* renamed from: computeValue  reason: collision with other method in class */
    public SoftReference<V> m118081computeValue(Class<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new SoftReference<>(this.compute.invoke(type));
    }
}
