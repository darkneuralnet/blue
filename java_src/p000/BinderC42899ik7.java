package p000;

import android.os.RemoteException;
/* renamed from: ik7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC42899ik7 extends AbstractBinderC33663It7 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC36350Ug3 f87824a;

    public BinderC42899ik7(C41130fl7 c41130fl7, InterfaceC36350Ug3 interfaceC36350Ug3) {
        this.f87824a = interfaceC36350Ug3;
    }

    @Override // p000.InterfaceC51299wu7
    /* renamed from: H4 */
    public final void mo6121H4(InterfaceC49207tO1 interfaceC49207tO1) throws RemoteException {
        this.f87824a.onMapReady(new C39011cD1(interfaceC49207tO1));
    }
}
