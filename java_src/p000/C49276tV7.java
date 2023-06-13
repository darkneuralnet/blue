package p000;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: tV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49276tV7 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ Activity f110556f;

    /* renamed from: g */
    public final /* synthetic */ String f110557g;

    /* renamed from: h */
    public final /* synthetic */ String f110558h;

    /* renamed from: i */
    public final /* synthetic */ C52032y88 f110559i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49276tV7(C52032y88 c52032y88, Activity activity, String str, String str2) {
        super(c52032y88, true);
        this.f110559i = c52032y88;
        this.f110556f = activity;
        this.f110557g = str;
        this.f110558h = str2;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        InterfaceC45683nR7 interfaceC45683nR7;
        interfaceC45683nR7 = this.f110559i.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).setCurrentScreen(BinderC36557Vd3.m79636e5(this.f110556f), this.f110557g, this.f110558h, this.f103108b);
    }
}
