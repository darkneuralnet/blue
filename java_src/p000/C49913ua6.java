package p000;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aG\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"", "index", "shift", "f", "K", "V", "", "", "keyIndex", "key", "value", "g", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Lqa6;", "newNode", "j", "([Ljava/lang/Object;IILqa6;)[Ljava/lang/Object;", "k", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "h", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "i", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ua6 */
/* loaded from: classes.dex */
public final class C49913ua6 {
    /* renamed from: a */
    public static final /* synthetic */ Object[] m10021a(Object[] objArr, int i, Object obj, Object obj2) {
        return m10015g(objArr, i, obj, obj2);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object[] m10020b(Object[] objArr, int i) {
        return m10014h(objArr, i);
    }

    /* renamed from: c */
    public static final /* synthetic */ Object[] m10019c(Object[] objArr, int i) {
        return m10013i(objArr, i);
    }

    /* renamed from: d */
    public static final /* synthetic */ Object[] m10018d(Object[] objArr, int i, int i2, C47542qa6 c47542qa6) {
        return m10012j(objArr, i, i2, c47542qa6);
    }

    /* renamed from: e */
    public static final /* synthetic */ Object[] m10017e(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        return m10011k(objArr, i, i2, obj, obj2);
    }

    /* renamed from: f */
    public static final int m10016f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* renamed from: g */
    public static final <K, V> Object[] m10015g(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    /* renamed from: h */
    public static final Object[] m10014h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: i */
    public static final Object[] m10013i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* renamed from: j */
    public static final Object[] m10012j(Object[] objArr, int i, int i2, C47542qa6<?, ?> c47542qa6) {
        int i3 = i2 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i, i + 2, i2);
        objArr2[i3] = c47542qa6;
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i3 + 1, i2, objArr.length);
        return objArr2;
    }

    /* renamed from: k */
    public static final <K, V> Object[] m10011k(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        ArraysKt___ArraysJvmKt.copyInto(copyOf, copyOf, i + 2, i + 1, objArr.length);
        ArraysKt___ArraysJvmKt.copyInto(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}
