package p000;

import co.bird.android.feature.operator.tasklistv2.OperatorTaskListV2Activity;
import dagger.MembersInjector;
/* renamed from: Lv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34379Lv3 implements MembersInjector<OperatorTaskListV2Activity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f22269a;

    /* renamed from: b */
    public final Y94<C22454gl> f22270b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f22271c;

    /* renamed from: d */
    public final Y94<C48944sw3> f22272d;

    /* renamed from: e */
    public final Y94<C36953Wv3> f22273e;

    /* renamed from: a */
    public static void m96156a(OperatorTaskListV2Activity operatorTaskListV2Activity, C36953Wv3 c36953Wv3) {
        operatorTaskListV2Activity.f64314k = c36953Wv3;
    }

    /* renamed from: c */
    public static void m96154c(OperatorTaskListV2Activity operatorTaskListV2Activity, C48944sw3 c48944sw3) {
        operatorTaskListV2Activity.f64313j = c48944sw3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(OperatorTaskListV2Activity operatorTaskListV2Activity) {
        C4650Ky.m98043b(operatorTaskListV2Activity, this.f22269a.get());
        C4650Ky.m98042c(operatorTaskListV2Activity, this.f22270b.get());
        C4650Ky.m98041d(operatorTaskListV2Activity, this.f22271c.get());
        m96154c(operatorTaskListV2Activity, this.f22272d.get());
        m96156a(operatorTaskListV2Activity, this.f22273e.get());
    }
}
