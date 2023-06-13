package p000;

import co.bird.android.model.RentalPlan;
import com.uber.autodispose.ScopeProvider;
/* renamed from: jB2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43162jB2 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f92266a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f92267b;

    public C43162jB2(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942) {
        this.f92266a = y94;
        this.f92267b = y942;
    }

    /* renamed from: a */
    public static C43162jB2 m31030a(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942) {
        return new C43162jB2(y94, y942);
    }

    /* renamed from: c */
    public static C41383gB2 m31028c(C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, QA2 qa2, ScopeProvider scopeProvider, C47195pz2<RentalPlan> c47195pz2, InterfaceC40099e13 interfaceC40099e13) {
        return new C41383gB2(c36207Tq4, interfaceC1880Ea, qa2, scopeProvider, c47195pz2, interfaceC40099e13);
    }

    /* renamed from: b */
    public C41383gB2 m31029b(QA2 qa2, ScopeProvider scopeProvider, C47195pz2<RentalPlan> c47195pz2, InterfaceC40099e13 interfaceC40099e13) {
        return m31028c(this.f92266a.get(), this.f92267b.get(), qa2, scopeProvider, c47195pz2, interfaceC40099e13);
    }
}
