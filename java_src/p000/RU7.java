package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: RU7 */
/* loaded from: classes5.dex */
public final class RU7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ String f32109f;

    /* renamed from: g */
    public final /* synthetic */ String f32110g;

    /* renamed from: h */
    public final /* synthetic */ BinderC43293jP7 f32111h;

    /* renamed from: i */
    public final /* synthetic */ C52032y88 f32112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RU7(C52032y88 c52032y88, String str, String str2, BinderC43293jP7 binderC43293jP7) {
        super(c52032y88, true);
        this.f32112i = c52032y88;
        this.f32109f = str;
        this.f32110g = str2;
        this.f32111h = binderC43293jP7;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f32112i.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).getConditionalUserProperties(this.f32109f, this.f32110g, this.f32111h);
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: b */
    public final void mo13996b() {
        this.f32111h.mo30653W0(null);
    }
}
