package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes6.dex */
public class C17897a {

    /* renamed from: e */
    public static C17897a f73419e;

    /* renamed from: a */
    public final Object f73420a = new Object();

    /* renamed from: b */
    public final Handler f73421b = new Handler(Looper.getMainLooper(), new C17898a());

    /* renamed from: c */
    public C17900c f73422c;

    /* renamed from: d */
    public C17900c f73423d;

    /* renamed from: com.google.android.material.snackbar.a$a */
    /* loaded from: classes6.dex */
    public class C17898a implements Handler.Callback {
        public C17898a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C17897a.this.m48836d((C17900c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.a$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17899b {
        /* renamed from: a */
        void mo48825a();

        /* renamed from: b */
        void mo48824b(int i);
    }

    /* renamed from: com.google.android.material.snackbar.a$c */
    /* loaded from: classes6.dex */
    public static class C17900c {

        /* renamed from: a */
        public final WeakReference<InterfaceC17899b> f73425a;

        /* renamed from: b */
        public int f73426b;

        /* renamed from: c */
        public boolean f73427c;

        public C17900c(int i, InterfaceC17899b interfaceC17899b) {
            this.f73425a = new WeakReference<>(interfaceC17899b);
            this.f73426b = i;
        }

        /* renamed from: a */
        public boolean m48823a(InterfaceC17899b interfaceC17899b) {
            return interfaceC17899b != null && this.f73425a.get() == interfaceC17899b;
        }
    }

    private C17897a() {
    }

    /* renamed from: c */
    public static C17897a m48837c() {
        if (f73419e == null) {
            f73419e = new C17897a();
        }
        return f73419e;
    }

    /* renamed from: a */
    public final boolean m48839a(C17900c c17900c, int i) {
        InterfaceC17899b interfaceC17899b = c17900c.f73425a.get();
        if (interfaceC17899b != null) {
            this.f73421b.removeCallbacksAndMessages(c17900c);
            interfaceC17899b.mo48824b(i);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m48838b(InterfaceC17899b interfaceC17899b, int i) {
        synchronized (this.f73420a) {
            if (m48834f(interfaceC17899b)) {
                m48839a(this.f73422c, i);
            } else if (m48833g(interfaceC17899b)) {
                m48839a(this.f73423d, i);
            }
        }
    }

    /* renamed from: d */
    public void m48836d(C17900c c17900c) {
        synchronized (this.f73420a) {
            if (this.f73422c == c17900c || this.f73423d == c17900c) {
                m48839a(c17900c, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m48835e(InterfaceC17899b interfaceC17899b) {
        boolean z;
        synchronized (this.f73420a) {
            if (!m48834f(interfaceC17899b) && !m48833g(interfaceC17899b)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean m48834f(InterfaceC17899b interfaceC17899b) {
        C17900c c17900c = this.f73422c;
        return c17900c != null && c17900c.m48823a(interfaceC17899b);
    }

    /* renamed from: g */
    public final boolean m48833g(InterfaceC17899b interfaceC17899b) {
        C17900c c17900c = this.f73423d;
        return c17900c != null && c17900c.m48823a(interfaceC17899b);
    }

    /* renamed from: h */
    public void m48832h(InterfaceC17899b interfaceC17899b) {
        synchronized (this.f73420a) {
            if (m48834f(interfaceC17899b)) {
                this.f73422c = null;
                if (this.f73423d != null) {
                    m48826n();
                }
            }
        }
    }

    /* renamed from: i */
    public void m48831i(InterfaceC17899b interfaceC17899b) {
        synchronized (this.f73420a) {
            if (m48834f(interfaceC17899b)) {
                m48828l(this.f73422c);
            }
        }
    }

    /* renamed from: j */
    public void m48830j(InterfaceC17899b interfaceC17899b) {
        synchronized (this.f73420a) {
            if (m48834f(interfaceC17899b)) {
                C17900c c17900c = this.f73422c;
                if (!c17900c.f73427c) {
                    c17900c.f73427c = true;
                    this.f73421b.removeCallbacksAndMessages(c17900c);
                }
            }
        }
    }

    /* renamed from: k */
    public void m48829k(InterfaceC17899b interfaceC17899b) {
        synchronized (this.f73420a) {
            if (m48834f(interfaceC17899b)) {
                C17900c c17900c = this.f73422c;
                if (c17900c.f73427c) {
                    c17900c.f73427c = false;
                    m48828l(c17900c);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m48828l(C17900c c17900c) {
        int i = c17900c.f73426b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            } else {
                i = 2750;
            }
        }
        this.f73421b.removeCallbacksAndMessages(c17900c);
        Handler handler = this.f73421b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c17900c), i);
    }

    /* renamed from: m */
    public void m48827m(int i, InterfaceC17899b interfaceC17899b) {
        synchronized (this.f73420a) {
            if (m48834f(interfaceC17899b)) {
                C17900c c17900c = this.f73422c;
                c17900c.f73426b = i;
                this.f73421b.removeCallbacksAndMessages(c17900c);
                m48828l(this.f73422c);
                return;
            }
            if (m48833g(interfaceC17899b)) {
                this.f73423d.f73426b = i;
            } else {
                this.f73423d = new C17900c(i, interfaceC17899b);
            }
            C17900c c17900c2 = this.f73422c;
            if (c17900c2 != null && m48839a(c17900c2, 4)) {
                return;
            }
            this.f73422c = null;
            m48826n();
        }
    }

    /* renamed from: n */
    public final void m48826n() {
        C17900c c17900c = this.f73423d;
        if (c17900c != null) {
            this.f73422c = c17900c;
            this.f73423d = null;
            InterfaceC17899b interfaceC17899b = c17900c.f73425a.get();
            if (interfaceC17899b != null) {
                interfaceC17899b.mo48825a();
            } else {
                this.f73422c = null;
            }
        }
    }
}
