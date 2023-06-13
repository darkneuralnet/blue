package p000;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u001e\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$0#¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00102\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006("}, m28432d2 = {"LrR3;", "K", "V", "T", "", "LpR3;", "next", "()Ljava/lang/Object;", "", "remove", "key", "newValue", "j", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "keyHash", "Lqa6;", "node", "pathIndex", "i", "(ILqa6;Ljava/lang/Object;I)V", "h", "g", "LqR3;", "e", "LqR3;", "builder", "f", "Ljava/lang/Object;", "lastIteratedKey", "", "Z", "nextWasInvoked", "I", "expectedModCount", "", "Lra6;", "path", "<init>", "(LqR3;[Lra6;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rR3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48051rR3<K, V, T> extends AbstractC46865pR3<K, V, T> implements KMutableIterator {

    /* renamed from: e */
    public final C47458qR3<K, V> f107068e;

    /* renamed from: f */
    public K f107069f;

    /* renamed from: g */
    public boolean f107070g;

    /* renamed from: h */
    public int f107071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48051rR3(C47458qR3<K, V> builder, AbstractC48135ra6<K, V, T>[] path) {
        super(builder.m17513c(), path);
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f107068e = builder;
        this.f107071h = builder.m17514b();
    }

    /* renamed from: g */
    public final void m15972g() {
        if (this.f107068e.m17514b() == this.f107071h) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: h */
    public final void m15971h() {
        if (this.f107070g) {
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public final void m15970i(int i, C47542qa6<?, ?> c47542qa6, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            m19309d()[i2].m15734j(c47542qa6.m17391p(), c47542qa6.m17391p().length, 0);
            while (!Intrinsics.areEqual(m19309d()[i2].m15743a(), k)) {
                m19309d()[i2].m15737g();
            }
            m19307f(i2);
            return;
        }
        int m10016f = 1 << C49913ua6.m10016f(i, i3);
        if (c47542qa6.m17390q(m10016f)) {
            m19309d()[i2].m15734j(c47542qa6.m17391p(), c47542qa6.m17394m() * 2, c47542qa6.m17393n(m10016f));
            m19307f(i2);
            return;
        }
        int m17415O = c47542qa6.m17415O(m10016f);
        C47542qa6<?, ?> m17416N = c47542qa6.m17416N(m17415O);
        m19309d()[i2].m15734j(c47542qa6.m17391p(), c47542qa6.m17394m() * 2, m17415O);
        m15970i(i, m17416N, k, i2 + 1);
    }

    /* renamed from: j */
    public final void m15969j(K k, V v) {
        int i;
        if (!this.f107068e.containsKey(k)) {
            return;
        }
        if (hasNext()) {
            K m19311b = m19311b();
            this.f107068e.put(k, v);
            if (m19311b != null) {
                i = m19311b.hashCode();
            } else {
                i = 0;
            }
            m15970i(i, this.f107068e.m17513c(), m19311b, 0);
        } else {
            this.f107068e.put(k, v);
        }
        this.f107071h = this.f107068e.m17514b();
    }

    @Override // p000.AbstractC46865pR3, java.util.Iterator
    public T next() {
        m15972g();
        this.f107069f = m19311b();
        this.f107070g = true;
        return (T) super.next();
    }

    @Override // p000.AbstractC46865pR3, java.util.Iterator
    public void remove() {
        int i;
        m15971h();
        if (hasNext()) {
            K m19311b = m19311b();
            TypeIntrinsics.asMutableMap(this.f107068e).remove(this.f107069f);
            if (m19311b != null) {
                i = m19311b.hashCode();
            } else {
                i = 0;
            }
            m15970i(i, this.f107068e.m17513c(), m19311b, 0);
        } else {
            TypeIntrinsics.asMutableMap(this.f107068e).remove(this.f107069f);
        }
        this.f107069f = null;
        this.f107070g = false;
        this.f107071h = this.f107068e.m17514b();
    }
}
