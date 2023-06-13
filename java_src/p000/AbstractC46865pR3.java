package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0005\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002R2\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e¨\u0006#"}, m28432d2 = {"LpR3;", "K", "V", "T", "", "b", "()Ljava/lang/Object;", "", "hasNext", "next", "", "pathIndex", "e", "", "c", C17296a.f69688o, "", "Lra6;", "[Lra6;", DateTokenConverter.CONVERTER_KEY, "()[Lra6;", "path", "I", "getPathLastIndex", "()I", "f", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "()V", "Lqa6;", "node", "<init>", "(Lqa6;[Lra6;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pR3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46865pR3<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    public final AbstractC48135ra6<K, V, T>[] f103666b;

    /* renamed from: c */
    public int f103667c;

    /* renamed from: d */
    public boolean f103668d;

    public AbstractC46865pR3(C47542qa6<K, V> node, AbstractC48135ra6<K, V, T>[] path) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f103666b = path;
        this.f103668d = true;
        path[0].m15735i(node.m17391p(), node.m17394m() * 2);
        this.f103667c = 0;
        m19310c();
    }

    /* renamed from: a */
    public final void m19312a() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final K m19311b() {
        m19312a();
        return this.f103666b[this.f103667c].m15743a();
    }

    /* renamed from: c */
    public final void m19310c() {
        if (this.f103666b[this.f103667c].m15739e()) {
            return;
        }
        for (int i = this.f103667c; -1 < i; i--) {
            int m19308e = m19308e(i);
            if (m19308e == -1 && this.f103666b[i].m15738f()) {
                this.f103666b[i].m15736h();
                m19308e = m19308e(i);
            }
            if (m19308e != -1) {
                this.f103667c = m19308e;
                return;
            }
            if (i > 0) {
                this.f103666b[i - 1].m15736h();
            }
            this.f103666b[i].m15735i(C47542qa6.f105443e.m17380a().m17391p(), 0);
        }
        this.f103668d = false;
    }

    /* renamed from: d */
    public final AbstractC48135ra6<K, V, T>[] m19309d() {
        return this.f103666b;
    }

    /* renamed from: e */
    public final int m19308e(int i) {
        if (this.f103666b[i].m15739e()) {
            return i;
        }
        if (this.f103666b[i].m15738f()) {
            C47542qa6<? extends K, ? extends V> m15742b = this.f103666b[i].m15742b();
            if (i == 6) {
                this.f103666b[i + 1].m15735i(m15742b.m17391p(), m15742b.m17391p().length);
            } else {
                this.f103666b[i + 1].m15735i(m15742b.m17391p(), m15742b.m17394m() * 2);
            }
            return m19308e(i + 1);
        }
        return -1;
    }

    /* renamed from: f */
    public final void m19307f(int i) {
        this.f103667c = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f103668d;
    }

    @Override // java.util.Iterator
    public T next() {
        m19312a();
        T next = this.f103666b[this.f103667c].next();
        m19310c();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
