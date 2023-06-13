package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: l38  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44275l38 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ U48 f95408f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f95409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44275l38(C52032y88 c52032y88, U48 u48) {
        super(c52032y88, true);
        this.f95409g = c52032y88;
        this.f95408f = u48;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f95409g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).registerOnMeasurementEventListener(this.f95408f);
    }
}
