package p000;

import co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity;
import co.bird.android.feature.birdplus.p011v1.details.C14537a;
import co.bird.android.feature.birdplus.p011v1.list.BirdPlusLandingActivity;
import co.bird.android.feature.birdplus.p011v1.purchased.BirdPlusPurchasedActivity;
import p000.InterfaceC28299sP;
/* renamed from: bH0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38453bH0 {

    /* renamed from: bH0$a */
    /* loaded from: classes3.dex */
    public static final class C12347a implements InterfaceC28299sP {

        /* renamed from: a */
        public final InterfaceC44393lG2 f57218a;

        /* renamed from: b */
        public final C12347a f57219b;

        @Override // p000.InterfaceC28299sP
        /* renamed from: a */
        public void mo14239a(BirdPlusDetailsActivity birdPlusDetailsActivity) {
            m64725g(birdPlusDetailsActivity);
        }

        @Override // p000.InterfaceC28299sP
        /* renamed from: b */
        public void mo14238b(BirdPlusPurchasedActivity birdPlusPurchasedActivity) {
            m64723i(birdPlusPurchasedActivity);
        }

        @Override // p000.InterfaceC28299sP
        /* renamed from: c */
        public void mo14237c(BirdPlusLandingActivity birdPlusLandingActivity) {
            m64724h(birdPlusLandingActivity);
        }

        /* renamed from: d */
        public final C14537a m64728d() {
            return new C14537a((InterfaceC4077JQ) C51679xZ3.m5003d(this.f57218a.mo27570L()), (AM3) C51679xZ3.m5003d(this.f57218a.mo27471t()), (InterfaceC42586iD1) C51679xZ3.m5003d(this.f57218a.mo27539W2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f57218a.mo27519d0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f57218a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f57218a.mo27595B1()));
        }

        /* renamed from: e */
        public final C2265FQ m64727e() {
            return new C2265FQ((InterfaceC4077JQ) C51679xZ3.m5003d(this.f57218a.mo27570L()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f57218a.mo27461w2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f57218a.mo27519d0()));
        }

        /* renamed from: f */
        public final C19750dR m64726f() {
            return new C19750dR((InterfaceC4077JQ) C51679xZ3.m5003d(this.f57218a.mo27570L()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f57218a.mo27461w2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f57218a.mo27519d0()));
        }

        /* renamed from: g */
        public final BirdPlusDetailsActivity m64725g(BirdPlusDetailsActivity birdPlusDetailsActivity) {
            C4650Ky.m98043b(birdPlusDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f57218a.mo27461w2()));
            C4650Ky.m98042c(birdPlusDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f57218a.mo27479r()));
            C4650Ky.m98041d(birdPlusDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f57218a.mo27595B1()));
            C2235FP.m107257b(birdPlusDetailsActivity, m64728d());
            return birdPlusDetailsActivity;
        }

        /* renamed from: h */
        public final BirdPlusLandingActivity m64724h(BirdPlusLandingActivity birdPlusLandingActivity) {
            C4650Ky.m98043b(birdPlusLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f57218a.mo27461w2()));
            C4650Ky.m98042c(birdPlusLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f57218a.mo27479r()));
            C4650Ky.m98041d(birdPlusLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f57218a.mo27595B1()));
            C30591yQ.m3514b(birdPlusLandingActivity, m64727e());
            return birdPlusLandingActivity;
        }

        /* renamed from: i */
        public final BirdPlusPurchasedActivity m64723i(BirdPlusPurchasedActivity birdPlusPurchasedActivity) {
            C4650Ky.m98043b(birdPlusPurchasedActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f57218a.mo27461w2()));
            C4650Ky.m98042c(birdPlusPurchasedActivity, (C22454gl) C51679xZ3.m5003d(this.f57218a.mo27479r()));
            C4650Ky.m98041d(birdPlusPurchasedActivity, (C36207Tq4) C51679xZ3.m5003d(this.f57218a.mo27595B1()));
            C9017WQ.m78484b(birdPlusPurchasedActivity, m64726f());
            return birdPlusPurchasedActivity;
        }

        public C12347a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f57219b = this;
            this.f57218a = interfaceC44393lG2;
        }
    }

    /* renamed from: bH0$b */
    /* loaded from: classes3.dex */
    public static final class C12348b implements InterfaceC28299sP.InterfaceC28300a {
        @Override // p000.InterfaceC28299sP.InterfaceC28300a
        /* renamed from: a */
        public InterfaceC28299sP mo14236a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C12347a(interfaceC44393lG2);
        }

        private C12348b() {
        }
    }

    private C38453bH0() {
    }

    /* renamed from: a */
    public static InterfaceC28299sP.InterfaceC28300a m64729a() {
        return new C12348b();
    }
}
