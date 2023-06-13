package p000;

import android.util.SparseArray;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0012J\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0013"}, m28432d2 = {"Ly52;", "E", "", "", "key", "b", "(I)Ljava/lang/Object;", "value", "", "c", "(ILjava/lang/Object;)V", C17296a.f69688o, "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "sparseArray", "<init>", "(Landroid/util/SparseArray;)V", "initialCapacity", "(I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y52  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51996y52<E> {

    /* renamed from: a */
    public final SparseArray<E> f118732a;

    public C51996y52(SparseArray<E> sparseArray) {
        this.f118732a = sparseArray;
    }

    /* renamed from: a */
    public final void m4160a() {
        this.f118732a.clear();
    }

    /* renamed from: b */
    public final E m4159b(int i) {
        return this.f118732a.get(i);
    }

    /* renamed from: c */
    public final void m4158c(int i, E e) {
        this.f118732a.put(i, e);
    }

    public C51996y52(int i) {
        this(new SparseArray(i));
    }

    public /* synthetic */ C51996y52(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
