package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: DU7 */
/* loaded from: classes5.dex */
public final class DU7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f5778f;

    /* renamed from: g */
    public final /* synthetic */ String f5779g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f5780h;

    /* renamed from: i */
    public final /* synthetic */ C52032y88 f5781i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU7(C52032y88 c52032y88, String str, String str2, Bundle bundle) {
        super(c52032y88, true);
        this.f5781i = c52032y88;
        this.f5778f = str;
        this.f5779g = str2;
        this.f5780h = bundle;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f5781i.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).clearConditionalUserProperty(this.f5778f, this.f5779g, this.f5780h);
    }
}
