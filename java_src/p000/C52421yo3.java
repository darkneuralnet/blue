package p000;

import co.bird.android.feature.transferorder.operator.OperatorOrderActivity;
import dagger.MembersInjector;
/* renamed from: yo3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52421yo3 implements MembersInjector<OperatorOrderActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f120211a;

    /* renamed from: b */
    public final Y94<C22454gl> f120212b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f120213c;

    /* renamed from: d */
    public final Y94<C34559Mp3> f120214d;

    /* renamed from: e */
    public final Y94<C33155Gp3> f120215e;

    /* renamed from: b */
    public static void m2565b(OperatorOrderActivity operatorOrderActivity, C33155Gp3 c33155Gp3) {
        operatorOrderActivity.f65696k = c33155Gp3;
    }

    /* renamed from: c */
    public static void m2564c(OperatorOrderActivity operatorOrderActivity, C34559Mp3 c34559Mp3) {
        operatorOrderActivity.f65695j = c34559Mp3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(OperatorOrderActivity operatorOrderActivity) {
        C4650Ky.m98043b(operatorOrderActivity, this.f120211a.get());
        C4650Ky.m98042c(operatorOrderActivity, this.f120212b.get());
        C4650Ky.m98041d(operatorOrderActivity, this.f120213c.get());
        m2564c(operatorOrderActivity, this.f120214d.get());
        m2565b(operatorOrderActivity, this.f120215e.get());
    }
}
