package p000;

import android.os.IBinder;
import java.util.List;
/* renamed from: td9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49353td9 extends AbstractRunnableC39054cH8 {

    /* renamed from: c */
    public final /* synthetic */ IBinder f110806c;

    /* renamed from: d */
    public final /* synthetic */ Oo9 f110807d;

    public C49353td9(Oo9 oo9, IBinder iBinder) {
        this.f110807d = oo9;
        this.f110806c = iBinder;
    }

    @Override // p000.AbstractRunnableC39054cH8
    /* renamed from: b */
    public final void mo10054b() {
        List<Runnable> list;
        List list2;
        this.f110807d.f27395b.f27469m = A68.m116091d5(this.f110806c);
        Oq9.m91285n(this.f110807d.f27395b);
        this.f110807d.f27395b.f27463g = false;
        list = this.f110807d.f27395b.f27460d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f110807d.f27395b.f27460d;
        list2.clear();
    }
}
