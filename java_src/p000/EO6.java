package p000;

import java.util.concurrent.CountDownLatch;
/* renamed from: EO6 */
/* loaded from: classes6.dex */
public final class EO6 implements InterfaceC45830nh3, InterfaceC34946Og3 {

    /* renamed from: a */
    public final CountDownLatch f7408a = new CountDownLatch(1);

    private EO6() {
    }

    /* renamed from: a */
    public final void m109050a() throws InterruptedException {
        this.f7408a.await();
    }

    @Override // p000.InterfaceC34946Og3
    public final void onFailure(Exception exc) {
        this.f7408a.countDown();
    }

    @Override // p000.InterfaceC45830nh3
    public final void onSuccess(Object obj) {
        this.f7408a.countDown();
    }

    public /* synthetic */ EO6(byte[] bArr) {
    }
}
