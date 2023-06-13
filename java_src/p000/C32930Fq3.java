package p000;

import android.os.Handler;
import co.bird.android.app.feature.operator.activity.BluetoothEnableChangeReceiver;
import co.bird.android.app.feature.operator.activity.LocationEnableChangeReceiver;
import co.bird.android.app.feature.operator.permission.p009ui.OperatorPermissionsRequiredActivity;
import dagger.MembersInjector;
/* renamed from: Fq3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32930Fq3 implements MembersInjector<OperatorPermissionsRequiredActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f10324a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f10325b;

    /* renamed from: c */
    public final Y94<Handler> f10326c;

    /* renamed from: d */
    public final Y94<C22454gl> f10327d;

    /* renamed from: e */
    public final Y94<InterfaceC1880Ea> f10328e;

    /* renamed from: f */
    public final Y94<InterfaceC32604Eg1> f10329f;

    /* renamed from: g */
    public final Y94<InterfaceC44647lh6> f10330g;

    /* renamed from: h */
    public final Y94<InterfaceC44637lg6> f10331h;

    /* renamed from: i */
    public final Y94<InterfaceC47617qi1> f10332i;

    /* renamed from: j */
    public final Y94<InterfaceC36675Vq4> f10333j;

    /* renamed from: k */
    public final Y94<InterfaceC43160jB0> f10334k;

    /* renamed from: l */
    public final Y94<FO2> f10335l;

    /* renamed from: m */
    public final Y94<YR4> f10336m;

    /* renamed from: n */
    public final Y94<InterfaceC10636aM> f10337n;

    /* renamed from: o */
    public final Y94<InterfaceC27246pJ> f10338o;

    /* renamed from: p */
    public final Y94<InterfaceC40001dr4> f10339p;

    /* renamed from: q */
    public final Y94<InterfaceC46037o21> f10340q;

    /* renamed from: r */
    public final Y94<GQ3> f10341r;

    /* renamed from: s */
    public final Y94<BluetoothEnableChangeReceiver> f10342s;

    /* renamed from: t */
    public final Y94<LocationEnableChangeReceiver> f10343t;

    /* renamed from: a */
    public static void m106423a(OperatorPermissionsRequiredActivity operatorPermissionsRequiredActivity, BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver) {
        operatorPermissionsRequiredActivity.f61907C = bluetoothEnableChangeReceiver;
    }

    /* renamed from: b */
    public static void m106422b(OperatorPermissionsRequiredActivity operatorPermissionsRequiredActivity, LocationEnableChangeReceiver locationEnableChangeReceiver) {
        operatorPermissionsRequiredActivity.f61908D = locationEnableChangeReceiver;
    }

    /* renamed from: d */
    public static void m106420d(OperatorPermissionsRequiredActivity operatorPermissionsRequiredActivity, GQ3 gq3) {
        operatorPermissionsRequiredActivity.f61906B = gq3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(OperatorPermissionsRequiredActivity operatorPermissionsRequiredActivity) {
        C5135Ly.m96068n(operatorPermissionsRequiredActivity, this.f10324a.get());
        C5135Ly.m96066p(operatorPermissionsRequiredActivity, this.f10325b.get());
        C5135Ly.m96071k(operatorPermissionsRequiredActivity, this.f10326c.get());
        C5135Ly.m96067o(operatorPermissionsRequiredActivity, this.f10327d.get());
        C5135Ly.m96080b(operatorPermissionsRequiredActivity, this.f10328e.get());
        C5135Ly.m96075g(operatorPermissionsRequiredActivity, this.f10329f.get());
        C5135Ly.m96064r(operatorPermissionsRequiredActivity, this.f10330g.get());
        C5135Ly.m96081a(operatorPermissionsRequiredActivity, this.f10331h.get());
        C5135Ly.m96073i(operatorPermissionsRequiredActivity, this.f10332i.get());
        C5135Ly.m96074h(operatorPermissionsRequiredActivity, this.f10333j.get());
        C5135Ly.m96077e(operatorPermissionsRequiredActivity, this.f10334k.get());
        C5135Ly.m96070l(operatorPermissionsRequiredActivity, this.f10335l.get());
        C5135Ly.m96065q(operatorPermissionsRequiredActivity, this.f10336m.get());
        C5135Ly.m96079c(operatorPermissionsRequiredActivity, this.f10337n.get());
        C5135Ly.m96078d(operatorPermissionsRequiredActivity, this.f10338o.get());
        C5135Ly.m96072j(operatorPermissionsRequiredActivity, this.f10339p.get());
        C5135Ly.m96076f(operatorPermissionsRequiredActivity, this.f10340q.get());
        m106420d(operatorPermissionsRequiredActivity, this.f10341r.get());
        m106423a(operatorPermissionsRequiredActivity, this.f10342s.get());
        m106422b(operatorPermissionsRequiredActivity, this.f10343t.get());
    }
}
