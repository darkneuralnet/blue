package p000;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
@VisibleForTesting
/* renamed from: bm7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38751bm7 extends AbstractC43376jZ0<C41130fl7> {

    /* renamed from: e */
    public final ViewGroup f58122e;

    /* renamed from: f */
    public final Context f58123f;

    /* renamed from: g */
    public InterfaceC46403of3<C41130fl7> f58124g;

    /* renamed from: h */
    public final GoogleMapOptions f58125h;

    /* renamed from: i */
    public final List<InterfaceC36350Ug3> f58126i = new ArrayList();

    @VisibleForTesting
    public C38751bm7(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f58122e = viewGroup;
        this.f58123f = context;
        this.f58125h = googleMapOptions;
    }

    @Override // p000.AbstractC43376jZ0
    /* renamed from: a */
    public final void mo22167a(InterfaceC46403of3<C41130fl7> interfaceC46403of3) {
        this.f58124g = interfaceC46403of3;
        m64029s();
    }

    /* renamed from: r */
    public final void m64030r(InterfaceC36350Ug3 interfaceC36350Ug3) {
        if (m30341b() != null) {
            m30341b().m40887a(interfaceC36350Ug3);
        } else {
            this.f58126i.add(interfaceC36350Ug3);
        }
    }

    /* renamed from: s */
    public final void m64029s() {
        if (this.f58124g != null && m30341b() == null) {
            try {
                C38500bM2.m64632a(this.f58123f);
                QO1 mo9913f3 = EQ7.m109024a(this.f58123f, null).mo9913f3(BinderC36557Vd3.m79636e5(this.f58123f), this.f58125h);
                if (mo9913f3 == null) {
                    return;
                }
                this.f58124g.mo20683a(new C41130fl7(this.f58122e, mo9913f3));
                for (InterfaceC36350Ug3 interfaceC36350Ug3 : this.f58126i) {
                    m30341b().m40887a(interfaceC36350Ug3);
                }
                this.f58126i.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
