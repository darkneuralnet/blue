package co.bird.android.feature.operator.tasklistv2;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.feature.operator.tasklistv2.InterfaceC15041b;
/* renamed from: co.bird.android.feature.operator.tasklistv2.a */
/* loaded from: classes3.dex */
public final class C15038a {

    /* renamed from: co.bird.android.feature.operator.tasklistv2.a$a */
    /* loaded from: classes3.dex */
    public static final class C15039a implements InterfaceC15041b.InterfaceC15042a {
        @Override // co.bird.android.feature.operator.tasklistv2.InterfaceC15041b.InterfaceC15042a
        /* renamed from: a */
        public InterfaceC15041b mo57843a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(abstractC11719f);
            return new C15040b(interfaceC44393lG2, activity, fragmentManager, abstractC11719f);
        }

        private C15039a() {
        }
    }

    /* renamed from: co.bird.android.feature.operator.tasklistv2.a$b */
    /* loaded from: classes3.dex */
    public static final class C15040b implements InterfaceC15041b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64317a;

        /* renamed from: b */
        public final FragmentManager f64318b;

        /* renamed from: c */
        public final AbstractC11719f f64319c;

        /* renamed from: d */
        public final C15040b f64320d;

        @Override // co.bird.android.feature.operator.tasklistv2.InterfaceC15041b
        /* renamed from: a */
        public void mo57844a(OperatorTaskListV2Activity operatorTaskListV2Activity) {
            m57847b(operatorTaskListV2Activity);
        }

        /* renamed from: b */
        public final OperatorTaskListV2Activity m57847b(OperatorTaskListV2Activity operatorTaskListV2Activity) {
            C4650Ky.m98043b(operatorTaskListV2Activity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64317a.mo27461w2()));
            C4650Ky.m98042c(operatorTaskListV2Activity, (C22454gl) C51679xZ3.m5003d(this.f64317a.mo27479r()));
            C4650Ky.m98041d(operatorTaskListV2Activity, (C36207Tq4) C51679xZ3.m5003d(this.f64317a.mo27595B1()));
            C34379Lv3.m96154c(operatorTaskListV2Activity, m57845d());
            C34379Lv3.m96156a(operatorTaskListV2Activity, m57846c());
            return operatorTaskListV2Activity;
        }

        /* renamed from: c */
        public final C36953Wv3 m57846c() {
            return new C36953Wv3(this.f64318b, this.f64319c);
        }

        /* renamed from: d */
        public final C48944sw3 m57845d() {
            return new C48944sw3((InterfaceC46473om3) C51679xZ3.m5003d(this.f64317a.mo27584F0()));
        }

        public C15040b(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
            this.f64320d = this;
            this.f64317a = interfaceC44393lG2;
            this.f64318b = fragmentManager;
            this.f64319c = abstractC11719f;
        }
    }

    private C15038a() {
    }

    /* renamed from: a */
    public static InterfaceC15041b.InterfaceC15042a m57848a() {
        return new C15039a();
    }
}
