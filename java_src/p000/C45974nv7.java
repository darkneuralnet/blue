package p000;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
@VisibleForTesting
/* renamed from: nv7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45974nv7 extends AbstractC43376jZ0<C50706vu7> {

    /* renamed from: e */
    public final ViewGroup f101086e;

    /* renamed from: f */
    public final Context f101087f;

    /* renamed from: g */
    public InterfaceC46403of3<C50706vu7> f101088g;

    /* renamed from: h */
    public final StreetViewPanoramaOptions f101089h;

    /* renamed from: i */
    public final List<InterfaceC45237mh3> f101090i = new ArrayList();

    @VisibleForTesting
    public C45974nv7(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f101086e = viewGroup;
        this.f101087f = context;
        this.f101089h = streetViewPanoramaOptions;
    }

    @Override // p000.AbstractC43376jZ0
    /* renamed from: a */
    public final void mo22167a(InterfaceC46403of3<C50706vu7> interfaceC46403of3) {
        this.f101088g = interfaceC46403of3;
        m22166r();
    }

    /* renamed from: r */
    public final void m22166r() {
        if (this.f101088g != null && m30341b() == null) {
            try {
                C38500bM2.m64632a(this.f101087f);
                this.f101088g.mo20683a(new C50706vu7(this.f101086e, EQ7.m109024a(this.f101087f, null).mo9915Z1(BinderC36557Vd3.m79636e5(this.f101087f), this.f101089h)));
                for (InterfaceC45237mh3 interfaceC45237mh3 : this.f101090i) {
                    m30341b().m7776a(interfaceC45237mh3);
                }
                this.f101090i.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
