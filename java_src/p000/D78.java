package p000;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: D78 */
/* loaded from: classes5.dex */
public final class D78 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ Activity f5267f;

    /* renamed from: g */
    public final /* synthetic */ BinderC43293jP7 f5268g;

    /* renamed from: h */
    public final /* synthetic */ C43139j88 f5269h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D78(C43139j88 c43139j88, Activity activity, BinderC43293jP7 binderC43293jP7) {
        super(c43139j88.f92214b, true);
        this.f5269h = c43139j88;
        this.f5267f = activity;
        this.f5268g = binderC43293jP7;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f5269h.f92214b.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).onActivitySaveInstanceState(BinderC36557Vd3.m79636e5(this.f5267f), this.f5268g, this.f103109c);
    }
}
