package p000;

import android.hardware.SensorManager;
import co.bird.android.feature.p010ar.resolution.VpsResolveActivity;
import dagger.MembersInjector;
/* renamed from: wv6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51308wv6 implements MembersInjector<VpsResolveActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f116832a;

    /* renamed from: b */
    public final Y94<C22454gl> f116833b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f116834c;

    /* renamed from: d */
    public final Y94<C36956Wv6> f116835d;

    /* renamed from: e */
    public final Y94<SensorManager> f116836e;

    /* renamed from: f */
    public final Y94<InterfaceC35660Rh6> f116837f;

    /* renamed from: g */
    public final Y94<InterfaceC6097Oh> f116838g;

    /* renamed from: h */
    public final Y94<C22454gl> f116839h;

    /* renamed from: a */
    public static void m6096a(VpsResolveActivity vpsResolveActivity, InterfaceC6097Oh interfaceC6097Oh) {
        vpsResolveActivity.f63199m = interfaceC6097Oh;
    }

    /* renamed from: b */
    public static void m6095b(VpsResolveActivity vpsResolveActivity, C22454gl c22454gl) {
        vpsResolveActivity.f63200n = c22454gl;
    }

    /* renamed from: d */
    public static void m6093d(VpsResolveActivity vpsResolveActivity, C36956Wv6 c36956Wv6) {
        vpsResolveActivity.f63196j = c36956Wv6;
    }

    /* renamed from: e */
    public static void m6092e(VpsResolveActivity vpsResolveActivity, SensorManager sensorManager) {
        vpsResolveActivity.f63197k = sensorManager;
    }

    /* renamed from: f */
    public static void m6091f(VpsResolveActivity vpsResolveActivity, InterfaceC35660Rh6 interfaceC35660Rh6) {
        vpsResolveActivity.f63198l = interfaceC35660Rh6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(VpsResolveActivity vpsResolveActivity) {
        C4650Ky.m98043b(vpsResolveActivity, this.f116832a.get());
        C4650Ky.m98042c(vpsResolveActivity, this.f116833b.get());
        C4650Ky.m98041d(vpsResolveActivity, this.f116834c.get());
        m6093d(vpsResolveActivity, this.f116835d.get());
        m6092e(vpsResolveActivity, this.f116836e.get());
        m6091f(vpsResolveActivity, this.f116837f.get());
        m6096a(vpsResolveActivity, this.f116838g.get());
        m6095b(vpsResolveActivity, this.f116839h.get());
    }
}
