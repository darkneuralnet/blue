package p000;

import co.bird.android.feature.transferorder.scrap.overview.ScrapOrderOverviewActivity;
import p000.InterfaceC47671qn5;
/* renamed from: eQ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40330eQ0 {

    /* renamed from: eQ0$a */
    /* loaded from: classes3.dex */
    public static final class C20038a implements InterfaceC47671qn5.InterfaceC27689a {
        @Override // p000.InterfaceC47671qn5.InterfaceC27689a
        /* renamed from: a */
        public InterfaceC47671qn5 mo17052a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C20039b(interfaceC44393lG2);
        }

        private C20038a() {
        }
    }

    /* renamed from: eQ0$b */
    /* loaded from: classes3.dex */
    public static final class C20039b implements InterfaceC47671qn5 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f78381a;

        /* renamed from: b */
        public final C20039b f78382b;

        @Override // p000.InterfaceC47671qn5
        /* renamed from: a */
        public void mo17053a(ScrapOrderOverviewActivity scrapOrderOverviewActivity) {
            m42891b(scrapOrderOverviewActivity);
        }

        /* renamed from: b */
        public final ScrapOrderOverviewActivity m42891b(ScrapOrderOverviewActivity scrapOrderOverviewActivity) {
            C4650Ky.m98043b(scrapOrderOverviewActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f78381a.mo27461w2()));
            C4650Ky.m98042c(scrapOrderOverviewActivity, (C22454gl) C51679xZ3.m5003d(this.f78381a.mo27479r()));
            C4650Ky.m98041d(scrapOrderOverviewActivity, (C36207Tq4) C51679xZ3.m5003d(this.f78381a.mo27595B1()));
            C42344ho5.m35844c(scrapOrderOverviewActivity, m42889d());
            C42344ho5.m35845b(scrapOrderOverviewActivity, m42890c());
            return scrapOrderOverviewActivity;
        }

        /* renamed from: c */
        public final C31744Ao5 m42890c() {
            return new C31744Ao5((O86) C51679xZ3.m5003d(this.f78381a.mo27485p()), (InterfaceC44647lh6) C51679xZ3.m5003d(this.f78381a.mo27459x1()), (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f78381a.mo27571K2()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f78381a.mo27461w2()));
        }

        /* renamed from: d */
        public final C32069By6 m42889d() {
            return new C32069By6((InterfaceC44647lh6) C51679xZ3.m5003d(this.f78381a.mo27459x1()), (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f78381a.mo27571K2()), (C36207Tq4) C51679xZ3.m5003d(this.f78381a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f78381a.mo27461w2()));
        }

        public C20039b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f78382b = this;
            this.f78381a = interfaceC44393lG2;
        }
    }

    private C40330eQ0() {
    }

    /* renamed from: a */
    public static InterfaceC47671qn5.InterfaceC27689a m42892a() {
        return new C20038a();
    }
}
