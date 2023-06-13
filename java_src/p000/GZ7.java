package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: GZ7 */
/* loaded from: classes5.dex */
public final class GZ7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ BinderC43293jP7 f12088f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f12089g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZ7(C52032y88 c52032y88, BinderC43293jP7 binderC43293jP7) {
        super(c52032y88, true);
        this.f12089g = c52032y88;
        this.f12088f = binderC43293jP7;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f12089g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).getCurrentScreenName(this.f12088f);
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: b */
    public final void mo13996b() {
        this.f12088f.mo30653W0(null);
    }
}
