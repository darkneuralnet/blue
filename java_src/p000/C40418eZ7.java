package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: eZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40418eZ7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ BinderC43293jP7 f78555f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f78556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40418eZ7(C52032y88 c52032y88, BinderC43293jP7 binderC43293jP7) {
        super(c52032y88, true);
        this.f78556g = c52032y88;
        this.f78555f = binderC43293jP7;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f78556g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).getCachedAppInstanceId(this.f78555f);
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: b */
    public final void mo13996b() {
        this.f78555f.mo30653W0(null);
    }
}
