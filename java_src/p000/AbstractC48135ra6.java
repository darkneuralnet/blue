package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b#\u0010$J-\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0010J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0016J\u0006\u0010\u0018\u001a\u00020\u000bJ\t\u0010\u0019\u001a\u00020\u0010H\u0096\u0002R4\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\"\u0010\n\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, m28432d2 = {"Lra6;", "K", "V", "T", "", "", "", "buffer", "", "dataSize", "index", "", "j", "([Ljava/lang/Object;II)V", "i", "([Ljava/lang/Object;I)V", "", "e", C17296a.f69688o, "()Ljava/lang/Object;", "g", "f", "Lqa6;", "b", "h", "hasNext", "<set-?>", "[Ljava/lang/Object;", "c", "()[Ljava/lang/Object;", "I", DateTokenConverter.CONVERTER_KEY, "()I", "k", "(I)V", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ra6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48135ra6<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    public Object[] f107293b = C47542qa6.f105443e.m17380a().m17391p();

    /* renamed from: c */
    public int f107294c;

    /* renamed from: d */
    public int f107295d;

    /* renamed from: a */
    public final K m15743a() {
        C49464tp0.m11730a(m15739e());
        return (K) this.f107293b[this.f107295d];
    }

    /* renamed from: b */
    public final C47542qa6<? extends K, ? extends V> m15742b() {
        C49464tp0.m11730a(m15738f());
        Object obj = this.f107293b[this.f107295d];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (C47542qa6) obj;
    }

    /* renamed from: c */
    public final Object[] m15741c() {
        return this.f107293b;
    }

    /* renamed from: d */
    public final int m15740d() {
        return this.f107295d;
    }

    /* renamed from: e */
    public final boolean m15739e() {
        return this.f107295d < this.f107294c;
    }

    /* renamed from: f */
    public final boolean m15738f() {
        boolean z;
        if (this.f107295d >= this.f107294c) {
            z = true;
        } else {
            z = false;
        }
        C49464tp0.m11730a(z);
        if (this.f107295d < this.f107293b.length) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m15737g() {
        C49464tp0.m11730a(m15739e());
        this.f107295d += 2;
    }

    /* renamed from: h */
    public final void m15736h() {
        C49464tp0.m11730a(m15738f());
        this.f107295d++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return m15739e();
    }

    /* renamed from: i */
    public final void m15735i(Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        m15734j(buffer, i, 0);
    }

    /* renamed from: j */
    public final void m15734j(Object[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f107293b = buffer;
        this.f107294c = i;
        this.f107295d = i2;
    }

    /* renamed from: k */
    public final void m15733k(int i) {
        this.f107295d = i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
