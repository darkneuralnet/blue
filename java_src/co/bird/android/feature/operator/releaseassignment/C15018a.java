package co.bird.android.feature.operator.releaseassignment;

import android.app.Activity;
import co.bird.android.feature.operator.releaseassignment.InterfaceC15021b;
/* renamed from: co.bird.android.feature.operator.releaseassignment.a */
/* loaded from: classes3.dex */
public final class C15018a {

    /* renamed from: co.bird.android.feature.operator.releaseassignment.a$a */
    /* loaded from: classes3.dex */
    public static final class C15019a implements InterfaceC15021b.InterfaceC15022a {
        @Override // co.bird.android.feature.operator.releaseassignment.InterfaceC15021b.InterfaceC15022a
        /* renamed from: a */
        public InterfaceC15021b mo57874a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            return new C15020b(interfaceC44393lG2, activity);
        }

        private C15019a() {
        }
    }

    /* renamed from: co.bird.android.feature.operator.releaseassignment.a$b */
    /* loaded from: classes3.dex */
    public static final class C15020b implements InterfaceC15021b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64287a;

        /* renamed from: b */
        public final C15020b f64288b;

        @Override // co.bird.android.feature.operator.releaseassignment.InterfaceC15021b
        /* renamed from: a */
        public void mo57875a(ReleaseAssignmentActivity releaseAssignmentActivity) {
            m57877b(releaseAssignmentActivity);
        }

        /* renamed from: b */
        public final ReleaseAssignmentActivity m57877b(ReleaseAssignmentActivity releaseAssignmentActivity) {
            C4650Ky.m98043b(releaseAssignmentActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64287a.mo27461w2()));
            C4650Ky.m98042c(releaseAssignmentActivity, (C22454gl) C51679xZ3.m5003d(this.f64287a.mo27479r()));
            C4650Ky.m98041d(releaseAssignmentActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64287a.mo27595B1()));
            C39439cu4.m44855d(releaseAssignmentActivity, m57876c());
            C39439cu4.m44858a(releaseAssignmentActivity, new C40031du4());
            C39439cu4.m44857b(releaseAssignmentActivity, new C41217fu4());
            return releaseAssignmentActivity;
        }

        /* renamed from: c */
        public final C50111uu4 m57876c() {
            return new C50111uu4((InterfaceC42996iu4) C51679xZ3.m5003d(this.f64287a.mo27521c0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64287a.mo27461w2()));
        }

        public C15020b(InterfaceC44393lG2 interfaceC44393lG2, Activity activity) {
            this.f64288b = this;
            this.f64287a = interfaceC44393lG2;
        }
    }

    private C15018a() {
    }

    /* renamed from: a */
    public static InterfaceC15021b.InterfaceC15022a m57878a() {
        return new C15019a();
    }
}
