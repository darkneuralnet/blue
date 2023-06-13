package p000;

import android.os.CancellationSignal;
/* renamed from: dd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39858dd0 {

    /* renamed from: a */
    public boolean f76903a;

    /* renamed from: b */
    public InterfaceC19813b f76904b;

    /* renamed from: c */
    public Object f76905c;

    /* renamed from: d */
    public boolean f76906d;

    /* renamed from: dd0$a */
    /* loaded from: classes.dex */
    public static class C19812a {
        private C19812a() {
        }

        /* renamed from: a */
        public static void m44009a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        public static CancellationSignal m44008b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: dd0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC19813b {
        /* renamed from: a */
        void mo44007a();
    }

    /* renamed from: a */
    public void m44012a() {
        synchronized (this) {
            if (this.f76903a) {
                return;
            }
            this.f76903a = true;
            this.f76906d = true;
            InterfaceC19813b interfaceC19813b = this.f76904b;
            Object obj = this.f76905c;
            if (interfaceC19813b != null) {
                try {
                    interfaceC19813b.mo44007a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f76906d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                C19812a.m44009a(obj);
            }
            synchronized (this) {
                this.f76906d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public void m44011b(InterfaceC19813b interfaceC19813b) {
        synchronized (this) {
            m44010c();
            if (this.f76904b == interfaceC19813b) {
                return;
            }
            this.f76904b = interfaceC19813b;
            if (this.f76903a && interfaceC19813b != null) {
                interfaceC19813b.mo44007a();
            }
        }
    }

    /* renamed from: c */
    public final void m44010c() {
        while (this.f76906d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
