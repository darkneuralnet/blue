package p000;

import android.content.Context;
import co.bird.android.feature.coreinventory.scan.CoreInventoryScanActivity;
import co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter;
import co.bird.android.feature.coreinventory.scan.adapters.CoreInventoryScanConverter;
import p000.PB0;
/* renamed from: pI0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46781pI0 {

    /* renamed from: pI0$a */
    /* loaded from: classes3.dex */
    public static final class C27243a implements PB0 {

        /* renamed from: a */
        public final InterfaceC44393lG2 f103436a;

        /* renamed from: b */
        public final C27243a f103437b;

        @Override // p000.PB0
        /* renamed from: a */
        public void mo19568a(CoreInventoryScanActivity coreInventoryScanActivity) {
            m19565d(coreInventoryScanActivity);
        }

        /* renamed from: b */
        public final CoreInventoryScanConverter m19567b() {
            return new CoreInventoryScanConverter((Context) C51679xZ3.m5003d(this.f103436a.mo27552R1()));
        }

        /* renamed from: c */
        public final CoreInventoryScanPresenter m19566c() {
            return new CoreInventoryScanPresenter((TB0) C51679xZ3.m5003d(this.f103436a.mo27593C()), (InterfaceC44647lh6) C51679xZ3.m5003d(this.f103436a.mo27459x1()), (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f103436a.mo27571K2()), (C36207Tq4) C51679xZ3.m5003d(this.f103436a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f103436a.mo27461w2()));
        }

        /* renamed from: d */
        public final CoreInventoryScanActivity m19565d(CoreInventoryScanActivity coreInventoryScanActivity) {
            C4650Ky.m98043b(coreInventoryScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f103436a.mo27461w2()));
            C4650Ky.m98042c(coreInventoryScanActivity, (C22454gl) C51679xZ3.m5003d(this.f103436a.mo27479r()));
            C4650Ky.m98041d(coreInventoryScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f103436a.mo27595B1()));
            C43169jC0.m31020c(coreInventoryScanActivity, m19566c());
            C43169jC0.m31022a(coreInventoryScanActivity, m19567b());
            return coreInventoryScanActivity;
        }

        public C27243a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f103437b = this;
            this.f103436a = interfaceC44393lG2;
        }
    }

    /* renamed from: pI0$b */
    /* loaded from: classes3.dex */
    public static final class C27244b implements PB0.InterfaceC6291a {
        @Override // p000.PB0.InterfaceC6291a
        /* renamed from: a */
        public PB0 mo19564a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C27243a(interfaceC44393lG2);
        }

        private C27244b() {
        }
    }

    private C46781pI0() {
    }

    /* renamed from: a */
    public static PB0.InterfaceC6291a m19569a() {
        return new C27244b();
    }
}
