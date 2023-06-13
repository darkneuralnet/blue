package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.RuntimeRemoteException;
@VisibleForTesting
/* renamed from: fl7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41130fl7 implements InterfaceC31759Aq2 {

    /* renamed from: a */
    public final ViewGroup f80608a;

    /* renamed from: b */
    public final QO1 f80609b;

    /* renamed from: c */
    public View f80610c;

    public C41130fl7(ViewGroup viewGroup, QO1 qo1) {
        this.f80609b = (QO1) Preconditions.checkNotNull(qo1);
        this.f80608a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
    }

    /* renamed from: a */
    public final void m40887a(InterfaceC36350Ug3 interfaceC36350Ug3) {
        try {
            this.f80609b.mo6787S4(new BinderC42899ik7(this, interfaceC36350Ug3));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C40921fP7.m41417b(bundle, bundle2);
            this.f80609b.onCreate(bundle2);
            C40921fP7.m41417b(bundle2, bundle);
            this.f80610c = (View) BinderC36557Vd3.m79637d5(this.f80609b.getView());
            this.f80608a.removeAllViews();
            this.f80608a.addView(this.f80610c);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onDestroy() {
        try {
            this.f80609b.onDestroy();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onLowMemory() {
        try {
            this.f80609b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onPause() {
        try {
            this.f80609b.onPause();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onResume() {
        try {
            this.f80609b.onResume();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C40921fP7.m41417b(bundle, bundle2);
            this.f80609b.onSaveInstanceState(bundle2);
            C40921fP7.m41417b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onStart() {
        try {
            this.f80609b.onStart();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // p000.InterfaceC31759Aq2
    public final void onStop() {
        try {
            this.f80609b.onStop();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
