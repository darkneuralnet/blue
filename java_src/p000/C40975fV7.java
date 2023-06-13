package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: fV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40975fV7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f80242f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f80243g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40975fV7(C52032y88 c52032y88, String str) {
        super(c52032y88, true);
        this.f80243g = c52032y88;
        this.f80242f = str;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f80243g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).setUserId(this.f80242f, this.f103108b);
    }
}
