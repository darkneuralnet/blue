package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.RuntimeRemoteException;
@VisibleForTesting
/* renamed from: vu7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50706vu7 implements InterfaceC31759Aq2 {

    /* renamed from: a */
    public final ViewGroup f114895a;

    /* renamed from: b */
    public final InterfaceC42101hP1 f114896b;

    /* renamed from: c */
    public View f114897c;

    public C50706vu7(ViewGroup viewGroup, InterfaceC42101hP1 interfaceC42101hP1) {
        this.f114896b = (InterfaceC42101hP1) Preconditions.checkNotNull(interfaceC42101hP1);
        this.f114895a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
    }

    /* renamed from: a */
    public final void m7776a(InterfaceC45237mh3 interfaceC45237mh3) {
        try {
            this.f114896b.mo36454J0(new BinderC33429Ht7(this, interfaceC45237mh3));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C40921fP7.m41417b(bundle, bundle2);
            this.f114896b.onCreate(bundle2);
            C40921fP7.m41417b(bundle2, bundle);
            this.f114897c = (View) BinderC36557Vd3.m79637d5(this.f114896b.getView());
            this.f114895a.removeAllViews();
            this.f114895a.addView(this.f114897c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onDestroy() {
        try {
            this.f114896b.onDestroy();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onLowMemory() {
        try {
            this.f114896b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onPause() {
        try {
            this.f114896b.onPause();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onResume() {
        try {
            this.f114896b.onResume();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C40921fP7.m41417b(bundle, bundle2);
            this.f114896b.onSaveInstanceState(bundle2);
            C40921fP7.m41417b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onStart() {
        try {
            this.f114896b.onStart();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onStop() {
        try {
            this.f114896b.onStop();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
