package p000;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: O58 */
/* loaded from: classes5.dex */
public final class O58 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ Activity f25637f;

    /* renamed from: g */
    public final /* synthetic */ C43139j88 f25638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O58(C43139j88 c43139j88, Activity activity) {
        super(c43139j88.f92214b, true);
        this.f25638g = c43139j88;
        this.f25637f = activity;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f25638g.f92214b.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).onActivityResumed(BinderC36557Vd3.m79636e5(this.f25637f), this.f103109c);
    }
}
