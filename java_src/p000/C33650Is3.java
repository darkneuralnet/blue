package p000;

import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
/* renamed from: Is3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33650Is3 implements InterfaceC33416Hs3 {

    /* renamed from: a */
    public final C33884Js3 f16352a;

    public C33650Is3(C33884Js3 c33884Js3) {
        this.f16352a = c33884Js3;
    }

    /* renamed from: b */
    public static Y94<InterfaceC33416Hs3> m101575b(C33884Js3 c33884Js3) {
        return C39546d52.m44621a(new C33650Is3(c33884Js3));
    }

    @Override // p000.InterfaceC33416Hs3
    /* renamed from: a */
    public C49497ts3 mo101576a(AndroidLifecycleScopeProvider androidLifecycleScopeProvider, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC34766Nm3 interfaceC34766Nm3, InterfaceC32282Cw3 interfaceC32282Cw3, InterfaceC40099e13 interfaceC40099e13, Observable<Boolean> observable, Observable<Boolean> observable2, InterfaceC31776As1 interfaceC31776As1) {
        return this.f16352a.m99614b(androidLifecycleScopeProvider, lifecycleScopeProvider, interfaceC34766Nm3, interfaceC32282Cw3, interfaceC40099e13, observable, observable2, interfaceC31776As1);
    }
}
