package p000;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: xV4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51644xV4 implements InterfaceC48812sj1<C51051wV4> {

    /* renamed from: a */
    public final Y94<WU4> f117719a;

    /* renamed from: b */
    public final Y94<AM3> f117720b;

    /* renamed from: c */
    public final Y94<InterfaceC42586iD1> f117721c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f117722d;

    /* renamed from: e */
    public final Y94<InterfaceC35660Rh6> f117723e;

    /* renamed from: f */
    public final Y94<Handler> f117724f;

    /* renamed from: g */
    public final Y94<String> f117725g;

    /* renamed from: h */
    public final Y94<JV4> f117726h;

    /* renamed from: i */
    public final Y94<ScopeProvider> f117727i;

    /* renamed from: j */
    public final Y94<InterfaceC40099e13> f117728j;

    /* renamed from: k */
    public final Y94<BaseActivity> f117729k;

    /* renamed from: l */
    public final Y94<C36207Tq4> f117730l;

    public C51644xV4(Y94<WU4> y94, Y94<AM3> y942, Y94<InterfaceC42586iD1> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC35660Rh6> y945, Y94<Handler> y946, Y94<String> y947, Y94<JV4> y948, Y94<ScopeProvider> y949, Y94<InterfaceC40099e13> y9410, Y94<BaseActivity> y9411, Y94<C36207Tq4> y9412) {
        this.f117719a = y94;
        this.f117720b = y942;
        this.f117721c = y943;
        this.f117722d = y944;
        this.f117723e = y945;
        this.f117724f = y946;
        this.f117725g = y947;
        this.f117726h = y948;
        this.f117727i = y949;
        this.f117728j = y9410;
        this.f117729k = y9411;
        this.f117730l = y9412;
    }

    /* renamed from: a */
    public static C51644xV4 m5112a(Y94<WU4> y94, Y94<AM3> y942, Y94<InterfaceC42586iD1> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC35660Rh6> y945, Y94<Handler> y946, Y94<String> y947, Y94<JV4> y948, Y94<ScopeProvider> y949, Y94<InterfaceC40099e13> y9410, Y94<BaseActivity> y9411, Y94<C36207Tq4> y9412) {
        return new C51644xV4(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412);
    }

    /* renamed from: c */
    public static C51051wV4 m5110c(WU4 wu4, AM3 am3, InterfaceC42586iD1 interfaceC42586iD1, InterfaceC1880Ea interfaceC1880Ea, InterfaceC35660Rh6 interfaceC35660Rh6, Handler handler, String str, JV4 jv4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, BaseActivity baseActivity, C36207Tq4 c36207Tq4) {
        return new C51051wV4(wu4, am3, interfaceC42586iD1, interfaceC1880Ea, interfaceC35660Rh6, handler, str, jv4, scopeProvider, interfaceC40099e13, baseActivity, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51051wV4 get() {
        return m5110c(this.f117719a.get(), this.f117720b.get(), this.f117721c.get(), this.f117722d.get(), this.f117723e.get(), this.f117724f.get(), this.f117725g.get(), this.f117726h.get(), this.f117727i.get(), this.f117728j.get(), this.f117729k.get(), this.f117730l.get());
    }
}
