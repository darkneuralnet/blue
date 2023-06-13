package p000;

import com.polidea.rxandroidble2.exceptions.BleScanException;
/* renamed from: vk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50604vk5 implements InterfaceC50012uk5 {

    /* renamed from: a */
    public final C46978pd5 f114562a;

    /* renamed from: b */
    public final InterfaceC34855Nw2 f114563b;

    public C50604vk5(C46978pd5 c46978pd5, InterfaceC34855Nw2 interfaceC34855Nw2) {
        this.f114562a = c46978pd5;
        this.f114563b = interfaceC34855Nw2;
    }

    @Override // p000.InterfaceC50012uk5
    /* renamed from: a */
    public void mo4754a(boolean z) {
        if (this.f114562a.m19049b()) {
            if (this.f114562a.m19048c()) {
                if (this.f114563b.mo84592a()) {
                    if (z && !this.f114563b.mo84591b()) {
                        throw new BleScanException(4);
                    }
                    return;
                }
                throw new BleScanException(3);
            }
            throw new BleScanException(1);
        }
        throw new BleScanException(2);
    }
}
