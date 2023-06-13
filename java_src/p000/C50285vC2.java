package p000;

import android.app.Activity;
import android.content.Context;
import com.uber.autodispose.ScopeProvider;
/* renamed from: vC2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50285vC2 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f113675a;

    /* renamed from: b */
    public final Y94<InterfaceC44647lh6> f113676b;

    /* renamed from: c */
    public final Y94<InterfaceC42586iD1> f113677c;

    /* renamed from: d */
    public final Y94<InterfaceC32292Cx4> f113678d;

    /* renamed from: e */
    public final Y94<Context> f113679e;

    /* renamed from: f */
    public final Y94<AM3> f113680f;

    /* renamed from: g */
    public final Y94<InterfaceC46820pM3> f113681g;

    public C50285vC2(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC42586iD1> y943, Y94<InterfaceC32292Cx4> y944, Y94<Context> y945, Y94<AM3> y946, Y94<InterfaceC46820pM3> y947) {
        this.f113675a = y94;
        this.f113676b = y942;
        this.f113677c = y943;
        this.f113678d = y944;
        this.f113679e = y945;
        this.f113680f = y946;
        this.f113681g = y947;
    }

    /* renamed from: a */
    public static C50285vC2 m9028a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC42586iD1> y943, Y94<InterfaceC32292Cx4> y944, Y94<Context> y945, Y94<AM3> y946, Y94<InterfaceC46820pM3> y947) {
        return new C50285vC2(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C44950mC2 m9026c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC42586iD1 interfaceC42586iD1, InterfaceC32292Cx4 interfaceC32292Cx4, Context context, AM3 am3, InterfaceC46820pM3 interfaceC46820pM3, QA2 qa2, ScopeProvider scopeProvider, C51471xC2 c51471xC2, Activity activity, InterfaceC40099e13 interfaceC40099e13) {
        return new C44950mC2(interfaceC1880Ea, interfaceC44647lh6, interfaceC42586iD1, interfaceC32292Cx4, context, am3, interfaceC46820pM3, qa2, scopeProvider, c51471xC2, activity, interfaceC40099e13);
    }

    /* renamed from: b */
    public C44950mC2 m9027b(QA2 qa2, ScopeProvider scopeProvider, C51471xC2 c51471xC2, Activity activity, InterfaceC40099e13 interfaceC40099e13) {
        return m9026c(this.f113675a.get(), this.f113676b.get(), this.f113677c.get(), this.f113678d.get(), this.f113679e.get(), this.f113680f.get(), this.f113681g.get(), qa2, scopeProvider, c51471xC2, activity, interfaceC40099e13);
    }
}
