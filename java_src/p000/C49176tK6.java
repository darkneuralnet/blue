package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;
/* renamed from: tK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49176tK6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ IBinder f110304c;

    /* renamed from: d */
    public final /* synthetic */ ServiceConnectionC51547xK6 f110305d;

    public C49176tK6(ServiceConnectionC51547xK6 serviceConnectionC51547xK6, IBinder iBinder) {
        this.f110305d = serviceConnectionC51547xK6;
        this.f110304c = iBinder;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        InterfaceC48583sK6 interfaceC48583sK6;
        List<Runnable> list;
        List list2;
        C52733zK6 c52733zK6 = this.f110305d.f117429b;
        interfaceC48583sK6 = c52733zK6.f121105g;
        c52733zK6.f121109k = (IInterface) interfaceC48583sK6.mo14386a(this.f110304c);
        C52733zK6.m1524j(this.f110305d.f117429b);
        this.f110305d.f117429b.f121103e = false;
        list = this.f110305d.f117429b.f121102d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f110305d.f117429b.f121102d;
        list2.clear();
    }
}
