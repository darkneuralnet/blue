package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: BX7 */
/* loaded from: classes5.dex */
public final class BX7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f2487f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f2488g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BX7(C52032y88 c52032y88, String str) {
        super(c52032y88, true);
        this.f2488g = c52032y88;
        this.f2487f = str;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f2488g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).endAdUnitExposure(this.f2487f, this.f103109c);
    }
}
