package p000;

import android.content.Context;
import androidx.work.AbstractC12126c;
import androidx.work.WorkerParameters;
/* renamed from: QG6 */
/* loaded from: classes.dex */
public abstract class QG6 {

    /* renamed from: a */
    public static final String f30143a = AbstractC32056Bx2.m113270i("WorkerFactory");

    /* renamed from: QG6$a */
    /* loaded from: classes.dex */
    public class C6756a extends QG6 {
        @Override // p000.QG6
        /* renamed from: a */
        public AbstractC12126c mo88674a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static QG6 m88675c() {
        return new C6756a();
    }

    /* renamed from: a */
    public abstract AbstractC12126c mo88674a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final AbstractC12126c m88676b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        AbstractC12126c mo88674a = mo88674a(context, str, workerParameters);
        if (mo88674a == null) {
            try {
                cls = Class.forName(str).asSubclass(AbstractC12126c.class);
            } catch (Throwable th) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str2 = f30143a;
                m113272e.mo113266d(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    mo88674a = (AbstractC12126c) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                    String str3 = f30143a;
                    m113272e2.mo113266d(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (mo88674a != null && mo88674a.m65567l()) {
            String name = getClass().getName();
            throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return mo88674a;
    }
}
