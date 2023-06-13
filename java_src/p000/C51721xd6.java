package p000;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: xd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51721xd6 {

    /* renamed from: a */
    public final InterfaceC45066mP1 f117914a;

    public C51721xd6(InterfaceC45066mP1 interfaceC45066mP1) {
        this.f117914a = interfaceC45066mP1;
    }

    /* renamed from: a */
    public void m4917a(boolean z) {
        try {
            this.f117914a.mo25661S3(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public void m4916b(boolean z) {
        try {
            this.f117914a.mo25660W2(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public void m4915c(boolean z) {
        try {
            this.f117914a.mo25659h2(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public void m4914d(boolean z) {
        try {
            this.f117914a.mo25662M4(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public void m4913e(boolean z) {
        try {
            this.f117914a.mo25658m4(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
