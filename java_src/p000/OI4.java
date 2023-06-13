package p000;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: OI4 */
/* loaded from: classes5.dex */
public class OI4<R> implements GA1<R>, TI4<R> {

    /* renamed from: l */
    public static final C5973a f26364l = new C5973a();

    /* renamed from: b */
    public final int f26365b;

    /* renamed from: c */
    public final int f26366c;

    /* renamed from: d */
    public final boolean f26367d;

    /* renamed from: e */
    public final C5973a f26368e;

    /* renamed from: f */
    public R f26369f;

    /* renamed from: g */
    public InterfaceC45599nI4 f26370g;

    /* renamed from: h */
    public boolean f26371h;

    /* renamed from: i */
    public boolean f26372i;

    /* renamed from: j */
    public boolean f26373j;

    /* renamed from: k */
    public GlideException f26374k;

    /* renamed from: OI4$a */
    /* loaded from: classes5.dex */
    public static class C5973a {
        /* renamed from: a */
        public void m92421a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        public void m92420b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public OI4(int i, int i2) {
        this(i, i2, true, f26364l);
    }

    @Override // p000.TI4
    /* renamed from: a */
    public synchronized boolean mo6879a(GlideException glideException, Object obj, LY5<R> ly5, boolean z) {
        this.f26373j = true;
        this.f26374k = glideException;
        this.f26368e.m92421a(this);
        return false;
    }

    /* renamed from: b */
    public final synchronized R m92422b(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f26367d && !isDone()) {
            C47029pi6.m18925a();
        }
        if (!this.f26371h) {
            if (!this.f26373j) {
                if (this.f26372i) {
                    return this.f26369f;
                }
                if (l == null) {
                    this.f26368e.m92420b(this, 0L);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        this.f26368e.m92420b(this, longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.f26373j) {
                        if (!this.f26371h) {
                            if (this.f26372i) {
                                return this.f26369f;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f26374k);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f26374k);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f26371h = true;
            this.f26368e.m92421a(this);
            InterfaceC45599nI4 interfaceC45599nI4 = null;
            if (z) {
                InterfaceC45599nI4 interfaceC45599nI42 = this.f26370g;
                this.f26370g = null;
                interfaceC45599nI4 = interfaceC45599nI42;
            }
            if (interfaceC45599nI4 != null) {
                interfaceC45599nI4.clear();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return m92422b(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.LY5
    public synchronized InterfaceC45599nI4 getRequest() {
        return this.f26370g;
    }

    @Override // p000.LY5
    public void getSize(FB5 fb5) {
        fb5.mo26185d(this.f26365b, this.f26366c);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f26371h;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f26371h && !this.f26372i) {
            if (!this.f26373j) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // p000.InterfaceC32227Cq2
    public void onDestroy() {
    }

    @Override // p000.LY5
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // p000.LY5
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // p000.LY5
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // p000.LY5
    public synchronized void onResourceReady(R r, G96<? super R> g96) {
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStart() {
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStop() {
    }

    @Override // p000.LY5
    public void removeCallback(FB5 fb5) {
    }

    @Override // p000.LY5
    public synchronized void setRequest(InterfaceC45599nI4 interfaceC45599nI4) {
        this.f26370g = interfaceC45599nI4;
    }

    public String toString() {
        InterfaceC45599nI4 interfaceC45599nI4;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            interfaceC45599nI4 = null;
            if (this.f26371h) {
                str = "CANCELLED";
            } else if (this.f26373j) {
                str = "FAILURE";
            } else if (this.f26372i) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                interfaceC45599nI4 = this.f26370g;
            }
        }
        if (interfaceC45599nI4 != null) {
            return str2 + str + ", request=[" + interfaceC45599nI4 + "]]";
        }
        return str2 + str + "]";
    }

    public OI4(int i, int i2, boolean z, C5973a c5973a) {
        this.f26365b = i;
        this.f26366c = i2;
        this.f26367d = z;
        this.f26368e = c5973a;
    }

    @Override // p000.TI4
    public synchronized boolean onResourceReady(R r, Object obj, LY5<R> ly5, ZS0 zs0, boolean z) {
        this.f26372i = true;
        this.f26369f = r;
        this.f26368e.m92421a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m92422b(Long.valueOf(timeUnit.toMillis(j)));
    }
}
