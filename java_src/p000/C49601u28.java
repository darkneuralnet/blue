package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: u28  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49601u28 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ boolean f111615f;

    /* renamed from: g */
    public final /* synthetic */ C52032y88 f111616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49601u28(C52032y88 c52032y88, boolean z) {
        super(c52032y88, true);
        this.f111616g = c52032y88;
        this.f111615f = z;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f111616g.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).setDataCollectionEnabled(this.f111615f);
    }
}
