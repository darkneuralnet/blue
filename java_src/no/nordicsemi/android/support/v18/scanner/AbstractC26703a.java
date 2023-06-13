package no.nordicsemi.android.support.v18.scanner;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import no.nordicsemi.android.support.v18.scanner.AbstractC26703a;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;
/* renamed from: no.nordicsemi.android.support.v18.scanner.a */
/* loaded from: classes8.dex */
public abstract class AbstractC26703a {

    /* renamed from: a */
    public static AbstractC26703a f100822a;

    /* renamed from: no.nordicsemi.android.support.v18.scanner.a$a */
    /* loaded from: classes8.dex */
    public static class C26704a {

        /* renamed from: b */
        public final boolean f100824b;

        /* renamed from: c */
        public final boolean f100825c;

        /* renamed from: d */
        public final boolean f100826d;

        /* renamed from: f */
        public final List<ScanFilter> f100828f;

        /* renamed from: g */
        public final ScanSettings f100829g;

        /* renamed from: h */
        public final AbstractC43480jj5 f100830h;

        /* renamed from: i */
        public final Handler f100831i;

        /* renamed from: a */
        public final Object f100823a = new Object();

        /* renamed from: j */
        public final List<ScanResult> f100832j = new ArrayList();

        /* renamed from: k */
        public final Set<String> f100833k = new HashSet();

        /* renamed from: l */
        public final Map<String, ScanResult> f100834l = new HashMap();

        /* renamed from: m */
        public final Runnable f100835m = new RunnableC26705a();

        /* renamed from: e */
        public boolean f100827e = false;

        /* renamed from: no.nordicsemi.android.support.v18.scanner.a$a$a */
        /* loaded from: classes8.dex */
        public class RunnableC26705a implements Runnable {
            public RunnableC26705a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m22383b(ScanResult scanResult) {
                C26704a.this.f100830h.mo30022c(4, scanResult);
            }

            @Override // java.lang.Runnable
            public void run() {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (C26704a.this.f100823a) {
                    Iterator it = C26704a.this.f100834l.values().iterator();
                    while (it.hasNext()) {
                        final ScanResult scanResult = (ScanResult) it.next();
                        if (scanResult.m22431d() < elapsedRealtimeNanos - C26704a.this.f100829g.m22424d()) {
                            it.remove();
                            C26704a.this.f100831i.post(new Runnable() { // from class: mX
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AbstractC26703a.C26704a.RunnableC26705a.this.m22383b(scanResult);
                                }
                            });
                        }
                    }
                    if (!C26704a.this.f100834l.isEmpty()) {
                        C26704a c26704a = C26704a.this;
                        c26704a.f100831i.postDelayed(this, c26704a.f100829g.m22423e());
                    }
                }
            }
        }

        /* renamed from: no.nordicsemi.android.support.v18.scanner.a$a$b */
        /* loaded from: classes8.dex */
        public class RunnableC26706b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Handler f100837b;

            public RunnableC26706b(Handler handler) {
                this.f100837b = handler;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!C26704a.this.f100827e) {
                    C26704a.this.m22389e();
                    this.f100837b.postDelayed(this, C26704a.this.f100829g.m22419j());
                }
            }
        }

        public C26704a(boolean z, boolean z2, List<ScanFilter> list, ScanSettings scanSettings, AbstractC43480jj5 abstractC43480jj5, Handler handler) {
            boolean z3;
            boolean z4;
            this.f100828f = Collections.unmodifiableList(list);
            this.f100829g = scanSettings;
            this.f100830h = abstractC43480jj5;
            this.f100831i = handler;
            boolean z5 = false;
            if (scanSettings.m22426b() != 1 && !scanSettings.m22416m()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f100826d = z3;
            if (!list.isEmpty() && (!z2 || !scanSettings.m22415n())) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f100824b = z4;
            long m22419j = scanSettings.m22419j();
            if (m22419j > 0 && (!z || !scanSettings.m22417l())) {
                z5 = true;
            }
            this.f100825c = z5;
            if (z5) {
                handler.postDelayed(new RunnableC26706b(handler), m22419j);
            }
        }

        /* renamed from: d */
        public void m22390d() {
            this.f100827e = true;
            this.f100831i.removeCallbacksAndMessages(null);
            synchronized (this.f100823a) {
                this.f100834l.clear();
                this.f100833k.clear();
                this.f100832j.clear();
            }
        }

        /* renamed from: e */
        public void m22389e() {
            if (this.f100825c && !this.f100827e) {
                synchronized (this.f100823a) {
                    this.f100830h.mo30024a(new ArrayList(this.f100832j));
                    this.f100832j.clear();
                    this.f100833k.clear();
                }
            }
        }

        /* renamed from: f */
        public void m22388f(int i) {
            this.f100830h.mo30023b(i);
        }

        /* renamed from: g */
        public void m22387g(int i, ScanResult scanResult) {
            boolean isEmpty;
            ScanResult put;
            if (!this.f100827e) {
                if (this.f100828f.isEmpty() || m22385i(scanResult)) {
                    String address = scanResult.m22434a().getAddress();
                    if (this.f100826d) {
                        synchronized (this.f100834l) {
                            isEmpty = this.f100834l.isEmpty();
                            put = this.f100834l.put(address, scanResult);
                        }
                        if (put == null && (this.f100829g.m22426b() & 2) > 0) {
                            this.f100830h.mo30022c(2, scanResult);
                        }
                        if (isEmpty && (this.f100829g.m22426b() & 4) > 0) {
                            this.f100831i.removeCallbacks(this.f100835m);
                            this.f100831i.postDelayed(this.f100835m, this.f100829g.m22423e());
                        }
                    } else if (this.f100825c) {
                        synchronized (this.f100823a) {
                            if (!this.f100833k.contains(address)) {
                                this.f100832j.add(scanResult);
                                this.f100833k.add(address);
                            }
                        }
                    } else {
                        this.f100830h.mo30022c(i, scanResult);
                    }
                }
            }
        }

        /* renamed from: h */
        public void m22386h(List<ScanResult> list) {
            if (this.f100827e) {
                return;
            }
            if (this.f100824b) {
                ArrayList arrayList = new ArrayList();
                for (ScanResult scanResult : list) {
                    if (m22385i(scanResult)) {
                        arrayList.add(scanResult);
                    }
                }
                list = arrayList;
            }
            this.f100830h.mo30024a(list);
        }

        /* renamed from: i */
        public final boolean m22385i(ScanResult scanResult) {
            for (ScanFilter scanFilter : this.f100828f) {
                if (scanFilter.m22449l(scanResult)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public static synchronized AbstractC26703a m22396b() {
        synchronized (AbstractC26703a.class) {
            AbstractC26703a abstractC26703a = f100822a;
            if (abstractC26703a != null) {
                return abstractC26703a;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                C26711c c26711c = new C26711c();
                f100822a = c26711c;
                return c26711c;
            }
            C27612qX c27612qX = new C27612qX();
            f100822a = c27612qX;
            return c27612qX;
        }
    }

    /* renamed from: a */
    public abstract void mo22382a(AbstractC43480jj5 abstractC43480jj5);

    /* renamed from: c */
    public final void m22395c(List<ScanFilter> list, ScanSettings scanSettings, AbstractC43480jj5 abstractC43480jj5) {
        if (abstractC43480jj5 != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            if (list == null) {
                list = Collections.emptyList();
            }
            if (scanSettings == null) {
                scanSettings = new ScanSettings.C26702b().m22412a();
            }
            mo22381d(list, scanSettings, abstractC43480jj5, handler);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    /* renamed from: d */
    public abstract void mo22381d(List<ScanFilter> list, ScanSettings scanSettings, AbstractC43480jj5 abstractC43480jj5, Handler handler);

    /* renamed from: e */
    public final void m22394e(AbstractC43480jj5 abstractC43480jj5) {
        if (abstractC43480jj5 != null) {
            mo22380f(abstractC43480jj5);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    /* renamed from: f */
    public abstract void mo22380f(AbstractC43480jj5 abstractC43480jj5);
}
