package p000;

import android.os.Handler;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: sS0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48649sS0 {

    /* renamed from: a */
    public final Y94<InterfaceC32874Fk1> f108826a;

    /* renamed from: b */
    public final Y94<Handler> f108827b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f108828c;

    public C48649sS0(Y94<InterfaceC32874Fk1> y94, Y94<Handler> y942, Y94<C36207Tq4> y943) {
        this.f108826a = y94;
        this.f108827b = y942;
        this.f108828c = y943;
    }

    /* renamed from: a */
    public static C48649sS0 m14184a(Y94<InterfaceC32874Fk1> y94, Y94<Handler> y942, Y94<C36207Tq4> y943) {
        return new C48649sS0(y94, y942, y943);
    }

    /* renamed from: c */
    public static C46278oS0 m14182c(InterfaceC32874Fk1 interfaceC32874Fk1, Handler handler, C36207Tq4 c36207Tq4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC49242tS0 interfaceC49242tS0, InterfaceC40099e13 interfaceC40099e13) {
        return new C46278oS0(interfaceC32874Fk1, handler, c36207Tq4, lifecycleScopeProvider, interfaceC49242tS0, interfaceC40099e13);
    }

    /* renamed from: b */
    public C46278oS0 m14183b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC49242tS0 interfaceC49242tS0, InterfaceC40099e13 interfaceC40099e13) {
        return m14182c(this.f108826a.get(), this.f108827b.get(), this.f108828c.get(), lifecycleScopeProvider, interfaceC49242tS0, interfaceC40099e13);
    }
}
