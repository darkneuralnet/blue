package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: j08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43059j08 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f92004f;

    /* renamed from: g */
    public final /* synthetic */ String f92005g;

    /* renamed from: h */
    public final /* synthetic */ boolean f92006h;

    /* renamed from: i */
    public final /* synthetic */ BinderC43293jP7 f92007i;

    /* renamed from: j */
    public final /* synthetic */ C52032y88 f92008j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43059j08(C52032y88 c52032y88, String str, String str2, boolean z, BinderC43293jP7 binderC43293jP7) {
        super(c52032y88, true);
        this.f92008j = c52032y88;
        this.f92004f = str;
        this.f92005g = str2;
        this.f92006h = z;
        this.f92007i = binderC43293jP7;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f92008j.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).getUserProperties(this.f92004f, this.f92005g, this.f92006h, this.f92007i);
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: b */
    public final void mo13996b() {
        this.f92007i.mo30653W0(null);
    }
}
