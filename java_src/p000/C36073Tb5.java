package p000;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C36073Tb5;
/* renamed from: Tb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36073Tb5 {

    /* renamed from: b */
    public final OrientationEventListener f35738b;

    /* renamed from: a */
    public final Object f35737a = new Object();

    /* renamed from: c */
    public final Map<InterfaceC7886b, C7887c> f35739c = new HashMap();

    /* renamed from: d */
    public boolean f35740d = false;

    /* renamed from: Tb5$a */
    /* loaded from: classes.dex */
    public class C7885a extends OrientationEventListener {

        /* renamed from: a */
        public int f35741a;

        public C7885a(Context context) {
            super(context);
            this.f35741a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int m83355b;
            ArrayList<C7887c> arrayList;
            if (i != -1 && this.f35741a != (m83355b = C36073Tb5.m83355b(i))) {
                this.f35741a = m83355b;
                synchronized (C36073Tb5.this.f35737a) {
                    arrayList = new ArrayList(C36073Tb5.this.f35739c.values());
                }
                if (!arrayList.isEmpty()) {
                    for (C7887c c7887c : arrayList) {
                        c7887c.m83350d(m83355b);
                    }
                }
            }
        }
    }

    /* renamed from: Tb5$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7886b {
        /* renamed from: a */
        void mo36172a(int i);
    }

    /* renamed from: Tb5$c */
    /* loaded from: classes.dex */
    public static class C7887c {

        /* renamed from: a */
        public final InterfaceC7886b f35743a;

        /* renamed from: b */
        public final Executor f35744b;

        /* renamed from: c */
        public final AtomicBoolean f35745c = new AtomicBoolean(true);

        public C7887c(InterfaceC7886b interfaceC7886b, Executor executor) {
            this.f35743a = interfaceC7886b;
            this.f35744b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m83351c(int i) {
            if (this.f35745c.get()) {
                this.f35743a.mo36172a(i);
            }
        }

        /* renamed from: b */
        public void m83352b() {
            this.f35745c.set(false);
        }

        /* renamed from: d */
        public void m83350d(final int i) {
            this.f35744b.execute(new Runnable() { // from class: Ub5
                @Override // java.lang.Runnable
                public final void run() {
                    C36073Tb5.C7887c.this.m83351c(i);
                }
            });
        }
    }

    public C36073Tb5(Context context) {
        this.f35738b = new C7885a(context);
    }

    /* renamed from: b */
    public static int m83355b(int i) {
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        return i >= 135 ? 2 : 3;
    }

    /* renamed from: a */
    public boolean m83356a(Executor executor, InterfaceC7886b interfaceC7886b) {
        synchronized (this.f35737a) {
            if (!this.f35738b.canDetectOrientation() && !this.f35740d) {
                return false;
            }
            this.f35739c.put(interfaceC7886b, new C7887c(interfaceC7886b, executor));
            this.f35738b.enable();
            return true;
        }
    }

    /* renamed from: c */
    public void m83354c(InterfaceC7886b interfaceC7886b) {
        synchronized (this.f35737a) {
            C7887c c7887c = this.f35739c.get(interfaceC7886b);
            if (c7887c != null) {
                c7887c.m83352b();
                this.f35739c.remove(interfaceC7886b);
            }
            if (this.f35739c.isEmpty()) {
                this.f35738b.disable();
            }
        }
    }
}
