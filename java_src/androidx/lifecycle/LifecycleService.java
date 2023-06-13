package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0017J\"\u0010\r\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "LLifecycleOwner;", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "startId", "onStart", "flags", "onStartCommand", "onDestroy", "Landroidx/lifecycle/s;", "b", "Landroidx/lifecycle/s;", "dispatcher", "Landroidx/lifecycle/f;", "getLifecycle", "()Landroidx/lifecycle/f;", "lifecycle", "<init>", "()V", "lifecycle-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public class LifecycleService extends Service implements LifecycleOwner {

    /* renamed from: b */
    public final C11756s f54843b = new C11756s(this);

    @Override // p000.LifecycleOwner
    public AbstractC11719f getLifecycle() {
        return this.f54843b.m66929a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f54843b.m66928b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f54843b.m66927c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f54843b.m66926d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @Deprecated(message = "Deprecated in Java")
    public void onStart(Intent intent, int i) {
        this.f54843b.m66925e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
