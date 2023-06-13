package co.bird.android.feature.transferorder.operatorallocationdetails;

import android.content.Context;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.transferorder.operatorallocationdetails.InterfaceC15813b;
/* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.a */
/* loaded from: classes3.dex */
public final class C15810a {

    /* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.a$a */
    /* loaded from: classes3.dex */
    public static final class C15811a implements InterfaceC15813b.InterfaceC15814a {
        @Override // co.bird.android.feature.transferorder.operatorallocationdetails.InterfaceC15813b.InterfaceC15814a
        /* renamed from: a */
        public InterfaceC15813b mo56501a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivityLite.InterfaceC14454a interfaceC14454a, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(interfaceC14454a);
            C51679xZ3.m5005b(str);
            return new C15812b(interfaceC44393lG2, interfaceC14454a, str);
        }

        private C15811a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.a$b */
    /* loaded from: classes3.dex */
    public static final class C15812b implements InterfaceC15813b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65722a;

        /* renamed from: b */
        public final BaseActivityLite.InterfaceC14454a f65723b;

        /* renamed from: c */
        public final String f65724c;

        /* renamed from: d */
        public final C15812b f65725d;

        @Override // co.bird.android.feature.transferorder.operatorallocationdetails.InterfaceC15813b
        /* renamed from: a */
        public void mo56502a(OperatorAllocationDetailsActivity operatorAllocationDetailsActivity) {
            m56505b(operatorAllocationDetailsActivity);
        }

        /* renamed from: b */
        public final OperatorAllocationDetailsActivity m56505b(OperatorAllocationDetailsActivity operatorAllocationDetailsActivity) {
            C4650Ky.m98043b(operatorAllocationDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65722a.mo27461w2()));
            C4650Ky.m98042c(operatorAllocationDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f65722a.mo27479r()));
            C4650Ky.m98041d(operatorAllocationDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65722a.mo27595B1()));
            C49990ui3.m9855c(operatorAllocationDetailsActivity, m56503d());
            C49990ui3.m9857a(operatorAllocationDetailsActivity, new C50582vi3());
            return operatorAllocationDetailsActivity;
        }

        /* renamed from: c */
        public final C51768xi3 m56504c() {
            return new C51768xi3((Context) C51679xZ3.m5003d(this.f65722a.mo27552R1()));
        }

        /* renamed from: d */
        public final C37304Yi3 m56503d() {
            return new C37304Yi3((O86) C51679xZ3.m5003d(this.f65722a.mo27485p()), (DQ3) C51679xZ3.m5003d(this.f65723b.mo58984a()), this.f65724c, m56504c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65722a.mo27461w2()));
        }

        public C15812b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivityLite.InterfaceC14454a interfaceC14454a, String str) {
            this.f65725d = this;
            this.f65722a = interfaceC44393lG2;
            this.f65723b = interfaceC14454a;
            this.f65724c = str;
        }
    }

    private C15810a() {
    }

    /* renamed from: a */
    public static InterfaceC15813b.InterfaceC15814a m56506a() {
        return new C15811a();
    }
}
