package p000;

import android.content.Context;
import co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity;
import co.bird.android.feature.transferorder.scanner.outbound.OutboundScanActivity;
import co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity;
import p000.InterfaceC36379Uj5;
/* renamed from: SP0 */
/* loaded from: classes3.dex */
public final class SP0 {

    /* renamed from: SP0$a */
    /* loaded from: classes3.dex */
    public static final class C7423a implements InterfaceC36379Uj5.InterfaceC8430a {
        @Override // p000.InterfaceC36379Uj5.InterfaceC8430a
        /* renamed from: a */
        public InterfaceC36379Uj5 mo80956a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C7424b(interfaceC44393lG2);
        }

        private C7423a() {
        }
    }

    /* renamed from: SP0$b */
    /* loaded from: classes3.dex */
    public static final class C7424b implements InterfaceC36379Uj5 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f33623a;

        /* renamed from: b */
        public final C7424b f33624b;

        @Override // p000.InterfaceC36379Uj5
        /* renamed from: a */
        public void mo80960a(InboundScanActivity inboundScanActivity) {
            m85506i(inboundScanActivity);
        }

        @Override // p000.InterfaceC36379Uj5
        /* renamed from: b */
        public void mo80959b(ScrapOrderScanActivity scrapOrderScanActivity) {
            m85504k(scrapOrderScanActivity);
        }

        @Override // p000.InterfaceC36379Uj5
        /* renamed from: c */
        public void mo80958c(C38292b02 c38292b02) {
            m85507h(c38292b02);
        }

        @Override // p000.InterfaceC36379Uj5
        /* renamed from: d */
        public void mo80957d(OutboundScanActivity outboundScanActivity) {
            m85505j(outboundScanActivity);
        }

        /* renamed from: e */
        public final C41274g02 m85510e() {
            return new C41274g02((O86) C51679xZ3.m5003d(this.f33623a.mo27485p()));
        }

        /* renamed from: f */
        public final C50760w02 m85509f() {
            return new C50760w02((Context) C51679xZ3.m5003d(this.f33623a.mo27552R1()));
        }

        /* renamed from: g */
        public final C37709a12 m85508g() {
            return new C37709a12((O86) C51679xZ3.m5003d(this.f33623a.mo27485p()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f33623a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f33623a.mo27595B1()));
        }

        /* renamed from: h */
        public final C38292b02 m85507h(C38292b02 c38292b02) {
            C38885c02.m62040b(c38292b02, m85510e());
            C38885c02.m62039c(c38292b02, (C36207Tq4) C51679xZ3.m5003d(this.f33623a.mo27595B1()));
            return c38292b02;
        }

        /* renamed from: i */
        public final InboundScanActivity m85506i(InboundScanActivity inboundScanActivity) {
            C4650Ky.m98043b(inboundScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f33623a.mo27461w2()));
            C4650Ky.m98042c(inboundScanActivity, (C22454gl) C51679xZ3.m5003d(this.f33623a.mo27479r()));
            C4650Ky.m98041d(inboundScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f33623a.mo27595B1()));
            C48982t02.m13255c(inboundScanActivity, m85508g());
            C48982t02.m13257a(inboundScanActivity, m85509f());
            return inboundScanActivity;
        }

        /* renamed from: j */
        public final OutboundScanActivity m85505j(OutboundScanActivity outboundScanActivity) {
            C4650Ky.m98043b(outboundScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f33623a.mo27461w2()));
            C4650Ky.m98042c(outboundScanActivity, (C22454gl) C51679xZ3.m5003d(this.f33623a.mo27479r()));
            C4650Ky.m98041d(outboundScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f33623a.mo27595B1()));
            C28233sC.m14569a(outboundScanActivity, m85503l());
            C28233sC.m14568b(outboundScanActivity, (C51174wi2) C51679xZ3.m5003d(this.f33623a.mo27492m2()));
            C37448Yy3.m73944b(outboundScanActivity, m85502m());
            return outboundScanActivity;
        }

        /* renamed from: k */
        public final ScrapOrderScanActivity m85504k(ScrapOrderScanActivity scrapOrderScanActivity) {
            C4650Ky.m98043b(scrapOrderScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f33623a.mo27461w2()));
            C4650Ky.m98042c(scrapOrderScanActivity, (C22454gl) C51679xZ3.m5003d(this.f33623a.mo27479r()));
            C4650Ky.m98041d(scrapOrderScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f33623a.mo27595B1()));
            C28233sC.m14569a(scrapOrderScanActivity, m85503l());
            C28233sC.m14568b(scrapOrderScanActivity, (C51174wi2) C51679xZ3.m5003d(this.f33623a.mo27492m2()));
            C36190To5.m82970b(scrapOrderScanActivity, m85501n());
            return scrapOrderScanActivity;
        }

        /* renamed from: l */
        public final C38877bz3 m85503l() {
            return new C38877bz3((Context) C51679xZ3.m5003d(this.f33623a.mo27552R1()));
        }

        /* renamed from: m */
        public final C33011Fz3 m85502m() {
            return new C33011Fz3((O86) C51679xZ3.m5003d(this.f33623a.mo27485p()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f33623a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f33623a.mo27595B1()));
        }

        /* renamed from: n */
        public final C37360Yo5 m85501n() {
            return new C37360Yo5((O86) C51679xZ3.m5003d(this.f33623a.mo27485p()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f33623a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f33623a.mo27595B1()));
        }

        public C7424b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f33624b = this;
            this.f33623a = interfaceC44393lG2;
        }
    }

    private SP0() {
    }

    /* renamed from: a */
    public static InterfaceC36379Uj5.InterfaceC8430a m85511a() {
        return new C7423a();
    }
}
