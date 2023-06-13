package p000;

import co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity;
import dagger.MembersInjector;
/* renamed from: t02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48982t02 implements MembersInjector<InboundScanActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f109662a;

    /* renamed from: b */
    public final Y94<C22454gl> f109663b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f109664c;

    /* renamed from: d */
    public final Y94<C37709a12> f109665d;

    /* renamed from: e */
    public final Y94<C50760w02> f109666e;

    /* renamed from: a */
    public static void m13257a(InboundScanActivity inboundScanActivity, C50760w02 c50760w02) {
        inboundScanActivity.f65728m = c50760w02;
    }

    /* renamed from: c */
    public static void m13255c(InboundScanActivity inboundScanActivity, C37709a12 c37709a12) {
        inboundScanActivity.f65727l = c37709a12;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(InboundScanActivity inboundScanActivity) {
        C4650Ky.m98043b(inboundScanActivity, this.f109662a.get());
        C4650Ky.m98042c(inboundScanActivity, this.f109663b.get());
        C4650Ky.m98041d(inboundScanActivity, this.f109664c.get());
        m13255c(inboundScanActivity, this.f109665d.get());
        m13257a(inboundScanActivity, this.f109666e.get());
    }
}
