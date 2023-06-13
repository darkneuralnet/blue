package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: mX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45144mX7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f98318f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f98319g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45144mX7(C52032y88 c52032y88, String str) {
        super(c52032y88, true);
        this.f98319g = c52032y88;
        this.f98318f = str;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f98319g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).beginAdUnitExposure(this.f98318f, this.f103109c);
    }
}
