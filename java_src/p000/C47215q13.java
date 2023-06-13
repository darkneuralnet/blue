package p000;

import android.content.Context;
import com.uber.autodispose.ScopeProvider;
/* renamed from: q13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47215q13 {

    /* renamed from: a */
    public final Y94<InterfaceC46164oF3> f104487a;

    /* renamed from: b */
    public final Y94<Context> f104488b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f104489c;

    public C47215q13(Y94<InterfaceC46164oF3> y94, Y94<Context> y942, Y94<InterfaceC1880Ea> y943) {
        this.f104487a = y94;
        this.f104488b = y942;
        this.f104489c = y943;
    }

    /* renamed from: a */
    public static C47215q13 m18307a(Y94<InterfaceC46164oF3> y94, Y94<Context> y942, Y94<InterfaceC1880Ea> y943) {
        return new C47215q13(y94, y942, y943);
    }

    /* renamed from: c */
    public static C45436n13 m18305c(InterfaceC46164oF3 interfaceC46164oF3, Context context, InterfaceC1880Ea interfaceC1880Ea, InterfaceC47808r13 interfaceC47808r13, ScopeProvider scopeProvider, C45168ma4<EnumC3010H2> c45168ma4) {
        return new C45436n13(interfaceC46164oF3, context, interfaceC1880Ea, interfaceC47808r13, scopeProvider, c45168ma4);
    }

    /* renamed from: b */
    public C45436n13 m18306b(InterfaceC47808r13 interfaceC47808r13, ScopeProvider scopeProvider, C45168ma4<EnumC3010H2> c45168ma4) {
        return m18305c(this.f104487a.get(), this.f104488b.get(), this.f104489c.get(), interfaceC47808r13, scopeProvider, c45168ma4);
    }
}
