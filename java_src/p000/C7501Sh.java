package p000;

import android.content.Intent;
import java.util.UUID;
/* renamed from: Sh */
/* loaded from: classes5.dex */
public class C7501Sh {

    /* renamed from: d */
    public static C7501Sh f34059d;

    /* renamed from: a */
    public UUID f34060a;

    /* renamed from: b */
    public Intent f34061b;

    /* renamed from: c */
    public int f34062c;

    public C7501Sh(int i) {
        this(i, UUID.randomUUID());
    }

    /* renamed from: b */
    public static C7501Sh m85130b() {
        if (TD0.m84203d(C7501Sh.class)) {
            return null;
        }
        try {
            return f34059d;
        } catch (Throwable th) {
            TD0.m84205b(th, C7501Sh.class);
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized boolean m85127e(C7501Sh c7501Sh) {
        synchronized (C7501Sh.class) {
            boolean z = false;
            if (TD0.m84203d(C7501Sh.class)) {
                return false;
            }
            C7501Sh m85130b = m85130b();
            f34059d = c7501Sh;
            if (m85130b != null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public UUID m85131a() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f34060a;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public int m85129c() {
        if (TD0.m84203d(this)) {
            return 0;
        }
        try {
            return this.f34062c;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return 0;
        }
    }

    /* renamed from: d */
    public Intent m85128d() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f34061b;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    public boolean m85126f() {
        if (TD0.m84203d(this)) {
            return false;
        }
        try {
            return m85127e(this);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }

    /* renamed from: g */
    public void m85125g(Intent intent) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f34061b = intent;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public C7501Sh(int i, UUID uuid) {
        this.f34060a = uuid;
        this.f34062c = i;
    }
}
