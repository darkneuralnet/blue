package p000;

import io.reactivex.functions.InterfaceC23492o;
/* renamed from: x62  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51413x62 implements InterfaceC23492o<C51730xe5, C36154Tk5> {

    /* renamed from: b */
    public final C48766se5 f117100b;

    public C51413x62(C48766se5 c48766se5) {
        this.f117100b = c48766se5;
    }

    @Override // io.reactivex.functions.InterfaceC23492o
    /* renamed from: a */
    public C36154Tk5 apply(C51730xe5 c51730xe5) {
        return new C36154Tk5(this.f117100b.m13911a(c51730xe5.m4909a().getAddress()), c51730xe5.m4908b(), c51730xe5.m4906d(), c51730xe5.m4907c(), c51730xe5.getScanRecord(), c51730xe5.m4905e());
    }
}
