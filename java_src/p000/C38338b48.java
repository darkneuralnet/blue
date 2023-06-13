package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: b48  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38338b48 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f56879f;

    /* renamed from: g */
    public final /* synthetic */ String f56880g;

    /* renamed from: h */
    public final /* synthetic */ Object f56881h;

    /* renamed from: i */
    public final /* synthetic */ boolean f56882i;

    /* renamed from: j */
    public final /* synthetic */ C52032y88 f56883j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38338b48(C52032y88 c52032y88, String str, String str2, Object obj, boolean z) {
        super(c52032y88, true);
        this.f56883j = c52032y88;
        this.f56879f = str;
        this.f56880g = str2;
        this.f56881h = obj;
        this.f56882i = z;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f56883j.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).setUserProperty(this.f56879f, this.f56880g, BinderC36557Vd3.m79636e5(this.f56881h), this.f56882i, this.f103108b);
    }
}
