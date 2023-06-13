package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, m28432d2 = {"LVh0;", "", "", "size", "", "b", "array", "", C17296a.f69688o, "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "arrays", "I", "charsTotal", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* renamed from: Vh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36590Vh0 {

    /* renamed from: a */
    public final ArrayDeque<char[]> f39473a = new ArrayDeque<>();

    /* renamed from: b */
    public int f39474b;

    /* renamed from: a */
    public final void m79568a(char[] array) {
        int i;
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            int length = this.f39474b + array.length;
            i = C29307uo.f113001a;
            if (length < i) {
                this.f39474b += array.length;
                this.f39473a.addLast(array);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final char[] m79567b(int i) {
        char[] removeLastOrNull;
        synchronized (this) {
            removeLastOrNull = this.f39473a.removeLastOrNull();
            if (removeLastOrNull != null) {
                this.f39474b -= removeLastOrNull.length;
            } else {
                removeLastOrNull = null;
            }
        }
        if (removeLastOrNull == null) {
            return new char[i];
        }
        return removeLastOrNull;
    }
}
