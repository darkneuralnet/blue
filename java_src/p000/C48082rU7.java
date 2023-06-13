package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: rU7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48082rU7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ Bundle f107147f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f107148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48082rU7(C52032y88 c52032y88, Bundle bundle) {
        super(c52032y88, true);
        this.f107148g = c52032y88;
        this.f107147f = bundle;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f107148g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).setConditionalUserProperty(this.f107147f, this.f103108b);
    }
}
