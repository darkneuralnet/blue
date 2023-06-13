package p000;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* renamed from: kK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC43840kK6 extends BinderC42654iK6<ParcelFileDescriptor> {
    public BinderC43840kK6(C49769uK6 c49769uK6, C37929aO6<ParcelFileDescriptor> c37929aO6) {
        super(c49769uK6, c37929aO6);
    }

    @Override // p000.BinderC42654iK6, p000.InterfaceC42699iP6
    /* renamed from: P1 */
    public final void mo29051P1(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo29051P1(bundle, bundle2);
        this.f87177a.m71485e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
