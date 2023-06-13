package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: p18  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46627p18 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f102964f;

    /* renamed from: g */
    public final /* synthetic */ BinderC43293jP7 f102965g;

    /* renamed from: h */
    public final /* synthetic */ C52032y88 f102966h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46627p18(C52032y88 c52032y88, String str, BinderC43293jP7 binderC43293jP7) {
        super(c52032y88, true);
        this.f102966h = c52032y88;
        this.f102964f = str;
        this.f102965g = binderC43293jP7;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f102966h.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).getMaxUserProperties(this.f102964f, this.f102965g);
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: b */
    public final void mo13996b() {
        this.f102965g.mo30653W0(null);
    }
}
