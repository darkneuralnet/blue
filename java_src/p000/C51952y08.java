package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: y08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51952y08 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f118610f;

    /* renamed from: g */
    public final /* synthetic */ Object f118611g;

    /* renamed from: h */
    public final /* synthetic */ C52032y88 f118612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51952y08(C52032y88 c52032y88, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(c52032y88, false);
        this.f118612h = c52032y88;
        this.f118610f = str;
        this.f118611g = obj;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f118612h.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).logHealthData(5, this.f118610f, BinderC36557Vd3.m79636e5(this.f118611g), BinderC36557Vd3.m79636e5(null), BinderC36557Vd3.m79636e5(null));
    }
}
