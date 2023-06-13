package p000;

import android.content.Context;
import com.uber.autodispose.ScopeProvider;
/* renamed from: Xa5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37000Xa5 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f43426a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f43427b;

    /* renamed from: c */
    public final Y94<Context> f43428c;

    /* renamed from: d */
    public final Y94<InterfaceC41018fa5> f43429d;

    /* renamed from: e */
    public final Y94<InterfaceC30074xG> f43430e;

    /* renamed from: f */
    public final Y94<InterfaceC28249sG> f43431f;

    public C37000Xa5(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942, Y94<Context> y943, Y94<InterfaceC41018fa5> y944, Y94<InterfaceC30074xG> y945, Y94<InterfaceC28249sG> y946) {
        this.f43426a = y94;
        this.f43427b = y942;
        this.f43428c = y943;
        this.f43429d = y944;
        this.f43430e = y945;
        this.f43431f = y946;
    }

    /* renamed from: a */
    public static C37000Xa5 m76845a(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942, Y94<Context> y943, Y94<InterfaceC41018fa5> y944, Y94<InterfaceC30074xG> y945, Y94<InterfaceC28249sG> y946) {
        return new C37000Xa5(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C36298Ua5 m76843c(C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, Context context, InterfaceC41018fa5 interfaceC41018fa5, InterfaceC30074xG interfaceC30074xG, InterfaceC28249sG interfaceC28249sG, ScopeProvider scopeProvider, InterfaceC37468Za5 interfaceC37468Za5, DU2 du2) {
        return new C36298Ua5(c36207Tq4, interfaceC1880Ea, context, interfaceC41018fa5, interfaceC30074xG, interfaceC28249sG, scopeProvider, interfaceC37468Za5, du2);
    }

    /* renamed from: b */
    public C36298Ua5 m76844b(ScopeProvider scopeProvider, InterfaceC37468Za5 interfaceC37468Za5, DU2 du2) {
        return m76843c(this.f43426a.get(), this.f43427b.get(), this.f43428c.get(), this.f43429d.get(), this.f43430e.get(), this.f43431f.get(), scopeProvider, interfaceC37468Za5, du2);
    }
}
