package p000;

import android.view.Surface;
import java.util.concurrent.Executor;
/* renamed from: PV5 */
/* loaded from: classes.dex */
public interface PV5 {

    /* renamed from: PV5$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6398a {
        /* renamed from: c */
        public static AbstractC6398a m90167c(int i, PV5 pv5) {
            return new C25544ku(i, pv5);
        }

        /* renamed from: a */
        public abstract int mo28203a();

        /* renamed from: b */
        public abstract PV5 mo28202b();
    }

    /* renamed from: a */
    Surface mo85337a(Executor executor, InterfaceC48378rz0<AbstractC6398a> interfaceC48378rz0);

    /* renamed from: b */
    void mo85336b(float[] fArr, float[] fArr2);

    void close();

    int getFormat();
}
