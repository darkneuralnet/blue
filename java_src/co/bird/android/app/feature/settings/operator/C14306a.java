package co.bird.android.app.feature.settings.operator;

import android.content.Context;
import co.bird.android.app.feature.settings.operator.InterfaceC14309b;
/* renamed from: co.bird.android.app.feature.settings.operator.a */
/* loaded from: classes2.dex */
public final class C14306a {

    /* renamed from: co.bird.android.app.feature.settings.operator.a$a */
    /* loaded from: classes2.dex */
    public static final class C14307a implements InterfaceC14309b.InterfaceC14310a {
        @Override // co.bird.android.app.feature.settings.operator.InterfaceC14309b.InterfaceC14310a
        /* renamed from: a */
        public InterfaceC14309b mo59384a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C14308b(interfaceC44393lG2);
        }

        private C14307a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.settings.operator.a$b */
    /* loaded from: classes2.dex */
    public static final class C14308b implements InterfaceC14309b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f62754a;

        /* renamed from: b */
        public final C14308b f62755b;

        @Override // co.bird.android.app.feature.settings.operator.InterfaceC14309b
        /* renamed from: a */
        public void mo59385a(OperatorSettingsActivity operatorSettingsActivity) {
            m59388b(operatorSettingsActivity);
        }

        /* renamed from: b */
        public final OperatorSettingsActivity m59388b(OperatorSettingsActivity operatorSettingsActivity) {
            C4650Ky.m98043b(operatorSettingsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f62754a.mo27461w2()));
            C4650Ky.m98042c(operatorSettingsActivity, (C22454gl) C51679xZ3.m5003d(this.f62754a.mo27479r()));
            C4650Ky.m98041d(operatorSettingsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f62754a.mo27595B1()));
            C45950nt3.m22238c(operatorSettingsActivity, m59386d());
            C45950nt3.m22240a(operatorSettingsActivity, m59387c());
            return operatorSettingsActivity;
        }

        /* renamed from: c */
        public final C47136pt3 m59387c() {
            return new C47136pt3((Context) C51679xZ3.m5003d(this.f62754a.mo27552R1()));
        }

        /* renamed from: d */
        public final C50692vt3 m59386d() {
            return new C50692vt3((C36207Tq4) C51679xZ3.m5003d(this.f62754a.mo27595B1()));
        }

        public C14308b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f62755b = this;
            this.f62754a = interfaceC44393lG2;
        }
    }

    private C14306a() {
    }

    /* renamed from: a */
    public static InterfaceC14309b.InterfaceC14310a m59389a() {
        return new C14307a();
    }
}
