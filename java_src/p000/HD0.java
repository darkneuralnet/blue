package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: HD0 */
/* loaded from: classes2.dex */
public final class HD0 {

    /* renamed from: a */
    public final Y94<V74> f13091a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f13092b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f13093c;

    public HD0(Y94<V74> y94, Y94<InterfaceC40099e13> y942, Y94<C36207Tq4> y943) {
        this.f13091a = y94;
        this.f13092b = y942;
        this.f13093c = y943;
    }

    /* renamed from: a */
    public static HD0 m104176a(Y94<V74> y94, Y94<InterfaceC40099e13> y942, Y94<C36207Tq4> y943) {
        return new HD0(y94, y942, y943);
    }

    /* renamed from: c */
    public static ED0 m104174c(V74 v74, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4, ID0 id0, ScopeProvider scopeProvider) {
        return new ED0(v74, interfaceC40099e13, c36207Tq4, id0, scopeProvider);
    }

    /* renamed from: b */
    public ED0 m104175b(ID0 id0, ScopeProvider scopeProvider) {
        return m104174c(this.f13091a.get(), this.f13092b.get(), this.f13093c.get(), id0, scopeProvider);
    }
}
