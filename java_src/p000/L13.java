package p000;

import com.uber.autodispose.ScopeProvider;
import io.reactivex.subjects.AbstractC24569h;
import kotlin.Pair;
/* renamed from: L13 */
/* loaded from: classes2.dex */
public final class L13 implements InterfaceC48812sj1<K13> {

    /* renamed from: a */
    public final Y94<C22454gl> f20606a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f20607b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f20608c;

    /* renamed from: d */
    public final Y94<M13> f20609d;

    /* renamed from: e */
    public final Y94<AbstractC24569h<Pair<Integer, Integer>>> f20610e;

    /* renamed from: f */
    public final Y94<AbstractC24569h<Integer>> f20611f;

    public L13(Y94<C22454gl> y94, Y94<C36207Tq4> y942, Y94<ScopeProvider> y943, Y94<M13> y944, Y94<AbstractC24569h<Pair<Integer, Integer>>> y945, Y94<AbstractC24569h<Integer>> y946) {
        this.f20606a = y94;
        this.f20607b = y942;
        this.f20608c = y943;
        this.f20609d = y944;
        this.f20610e = y945;
        this.f20611f = y946;
    }

    /* renamed from: a */
    public static L13 m97924a(Y94<C22454gl> y94, Y94<C36207Tq4> y942, Y94<ScopeProvider> y943, Y94<M13> y944, Y94<AbstractC24569h<Pair<Integer, Integer>>> y945, Y94<AbstractC24569h<Integer>> y946) {
        return new L13(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static K13 m97922c(C22454gl c22454gl, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, M13 m13, AbstractC24569h<Pair<Integer, Integer>> abstractC24569h, AbstractC24569h<Integer> abstractC24569h2) {
        return new K13(c22454gl, c36207Tq4, scopeProvider, m13, abstractC24569h, abstractC24569h2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public K13 get() {
        return m97922c(this.f20606a.get(), this.f20607b.get(), this.f20608c.get(), this.f20609d.get(), this.f20610e.get(), this.f20611f.get());
    }
}
