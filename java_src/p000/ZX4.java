package p000;

import androidx.appcompat.app.AppCompatActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: ZX4 */
/* loaded from: classes2.dex */
public final class ZX4 {

    /* renamed from: a */
    public final Y94<NP4> f48731a;

    /* renamed from: b */
    public final Y94<XW2> f48732b;

    /* renamed from: c */
    public final Y94<InterfaceC46820pM3> f48733c;

    public ZX4(Y94<NP4> y94, Y94<XW2> y942, Y94<InterfaceC46820pM3> y943) {
        this.f48731a = y94;
        this.f48732b = y942;
        this.f48733c = y943;
    }

    /* renamed from: a */
    public static ZX4 m72978a(Y94<NP4> y94, Y94<XW2> y942, Y94<InterfaceC46820pM3> y943) {
        return new ZX4(y94, y942, y943);
    }

    /* renamed from: c */
    public static VX4 m72976c(NP4 np4, XW2 xw2, InterfaceC46820pM3 interfaceC46820pM3, C51174wi2 c51174wi2, ScopeProvider scopeProvider, AppCompatActivity appCompatActivity) {
        return new VX4(np4, xw2, interfaceC46820pM3, c51174wi2, scopeProvider, appCompatActivity);
    }

    /* renamed from: b */
    public VX4 m72977b(C51174wi2 c51174wi2, ScopeProvider scopeProvider, AppCompatActivity appCompatActivity) {
        return m72976c(this.f48731a.get(), this.f48732b.get(), this.f48733c.get(), c51174wi2, scopeProvider, appCompatActivity);
    }
}
