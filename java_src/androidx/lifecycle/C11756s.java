package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Landroidx/lifecycle/s;", "", "", "c", "b", "e", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/f$a;", "event", "f", "Landroidx/lifecycle/j;", C17296a.f69688o, "Landroidx/lifecycle/j;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/s$a;", "Landroidx/lifecycle/s$a;", "lastDispatchRunnable", "Landroidx/lifecycle/f;", "()Landroidx/lifecycle/f;", "lifecycle", "LLifecycleOwner;", "provider", "<init>", "(LLifecycleOwner;)V", "lifecycle-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public class C11756s {

    /* renamed from: a */
    public final C11729j f54975a;

    /* renamed from: b */
    public final Handler f54976b;

    /* renamed from: c */
    public RunnableC11757a f54977c;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Landroidx/lifecycle/s$a;", "Ljava/lang/Runnable;", "", "run", "Landroidx/lifecycle/j;", "b", "Landroidx/lifecycle/j;", "registry", "Landroidx/lifecycle/f$a;", "c", "Landroidx/lifecycle/f$a;", "getEvent", "()Landroidx/lifecycle/f$a;", "event", "", DateTokenConverter.CONVERTER_KEY, "Z", "wasExecuted", "<init>", "(Landroidx/lifecycle/j;Landroidx/lifecycle/f$a;)V", "lifecycle-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.s$a */
    /* loaded from: classes.dex */
    public static final class RunnableC11757a implements Runnable {

        /* renamed from: b */
        public final C11729j f54978b;

        /* renamed from: c */
        public final AbstractC11719f.EnumC11720a f54979c;

        /* renamed from: d */
        public boolean f54980d;

        public RunnableC11757a(C11729j registry, AbstractC11719f.EnumC11720a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f54978b = registry;
            this.f54979c = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f54980d) {
                this.f54978b.m67001i(this.f54979c);
                this.f54980d = true;
            }
        }
    }

    public C11756s(LifecycleOwner provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f54975a = new C11729j(provider);
        this.f54976b = new Handler();
    }

    /* renamed from: a */
    public AbstractC11719f m66929a() {
        return this.f54975a;
    }

    /* renamed from: b */
    public void m66928b() {
        m66924f(AbstractC11719f.EnumC11720a.ON_START);
    }

    /* renamed from: c */
    public void m66927c() {
        m66924f(AbstractC11719f.EnumC11720a.ON_CREATE);
    }

    /* renamed from: d */
    public void m66926d() {
        m66924f(AbstractC11719f.EnumC11720a.ON_STOP);
        m66924f(AbstractC11719f.EnumC11720a.ON_DESTROY);
    }

    /* renamed from: e */
    public void m66925e() {
        m66924f(AbstractC11719f.EnumC11720a.ON_START);
    }

    /* renamed from: f */
    public final void m66924f(AbstractC11719f.EnumC11720a enumC11720a) {
        RunnableC11757a runnableC11757a = this.f54977c;
        if (runnableC11757a != null) {
            runnableC11757a.run();
        }
        RunnableC11757a runnableC11757a2 = new RunnableC11757a(this.f54975a, enumC11720a);
        this.f54977c = runnableC11757a2;
        Handler handler = this.f54976b;
        Intrinsics.checkNotNull(runnableC11757a2);
        handler.postAtFrontOfQueue(runnableC11757a2);
    }
}
