package p000;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.C39011cD1;
import p000.C44447lM2;
import p000.InterfaceC32648El0;
/* renamed from: Gl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33116Gl0<T extends InterfaceC32648El0> implements C39011cD1.InterfaceC13461c, C39011cD1.InterfaceC13470l, C39011cD1.InterfaceC13466h {

    /* renamed from: a */
    public final C44447lM2 f12364a;

    /* renamed from: b */
    public final C44447lM2.C25676a f12365b;

    /* renamed from: c */
    public final C44447lM2.C25676a f12366c;

    /* renamed from: d */
    public InterfaceC2175F9<T> f12367d;

    /* renamed from: e */
    public final ReadWriteLock f12368e;

    /* renamed from: f */
    public InterfaceC33350Hl0<T> f12369f;

    /* renamed from: g */
    public C39011cD1 f12370g;

    /* renamed from: h */
    public CameraPosition f12371h;

    /* renamed from: i */
    public C33116Gl0<T>.AsyncTaskC2933a f12372i;

    /* renamed from: j */
    public final ReadWriteLock f12373j;

    /* renamed from: k */
    public InterfaceC2936d<T> f12374k;

    /* renamed from: l */
    public InterfaceC2934b<T> f12375l;

    /* renamed from: Gl0$a */
    /* loaded from: classes6.dex */
    public class AsyncTaskC2933a extends AsyncTask<Float, Void, Set<? extends InterfaceC32414Dl0<T>>> {
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Set<? extends InterfaceC32414Dl0<T>> doInBackground(Float... fArr) {
            C33116Gl0.this.f12368e.readLock().lock();
            try {
                return C33116Gl0.this.f12367d.mo72959f(fArr[0].floatValue());
            } finally {
                C33116Gl0.this.f12368e.readLock().unlock();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Set<? extends InterfaceC32414Dl0<T>> set) {
            C33116Gl0.this.f12369f.onClustersChanged(set);
        }

        public AsyncTaskC2933a() {
        }
    }

    /* renamed from: Gl0$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC2934b<T extends InterfaceC32648El0> {
        boolean onClusterClick(InterfaceC32414Dl0<T> interfaceC32414Dl0);
    }

    /* renamed from: Gl0$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC2935c<T extends InterfaceC32648El0> {
    }

    /* renamed from: Gl0$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC2936d<T extends InterfaceC32648El0> {
        /* renamed from: a */
        boolean mo78587a(T t);
    }

    /* renamed from: Gl0$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC2937e<T extends InterfaceC32648El0> {
    }

    public C33116Gl0(Context context, C39011cD1 c39011cD1) {
        this(context, c39011cD1, new C44447lM2(c39011cD1));
    }

    @Override // p000.C39011cD1.InterfaceC13461c
    /* renamed from: a */
    public void mo61661a() {
        InterfaceC33350Hl0<T> interfaceC33350Hl0 = this.f12369f;
        if (interfaceC33350Hl0 instanceof C39011cD1.InterfaceC13461c) {
            ((C39011cD1.InterfaceC13461c) interfaceC33350Hl0).mo61661a();
        }
        CameraPosition m61679i = this.f12370g.m61679i();
        CameraPosition cameraPosition = this.f12371h;
        if (cameraPosition != null && cameraPosition.f71395c == m61679i.f71395c) {
            return;
        }
        this.f12371h = this.f12370g.m61679i();
        m104802j();
    }

    @Override // p000.C39011cD1.InterfaceC13466h
    /* renamed from: b */
    public void mo27414b(C40889fM2 c40889fM2) {
        m104798n().mo27414b(c40889fM2);
    }

    @Override // p000.C39011cD1.InterfaceC13470l
    /* renamed from: c */
    public boolean mo27413c(C40889fM2 c40889fM2) {
        return m104798n().mo27413c(c40889fM2);
    }

    /* renamed from: g */
    public void m104805g(T t) {
        this.f12368e.writeLock().lock();
        try {
            this.f12367d.mo72962c(t);
        } finally {
            this.f12368e.writeLock().unlock();
        }
    }

    /* renamed from: h */
    public void m104804h(Collection<T> collection) {
        this.f12368e.writeLock().lock();
        try {
            this.f12367d.mo72961d(collection);
        } finally {
            this.f12368e.writeLock().unlock();
        }
    }

    /* renamed from: i */
    public void m104803i() {
        this.f12368e.writeLock().lock();
        try {
            this.f12367d.clearItems();
        } finally {
            this.f12368e.writeLock().unlock();
        }
    }

    /* renamed from: j */
    public void m104802j() {
        this.f12373j.writeLock().lock();
        try {
            this.f12372i.cancel(true);
            C33116Gl0<T>.AsyncTaskC2933a asyncTaskC2933a = new AsyncTaskC2933a();
            this.f12372i = asyncTaskC2933a;
            asyncTaskC2933a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f12370g.m61679i().f71395c));
        } finally {
            this.f12373j.writeLock().unlock();
        }
    }

    /* renamed from: k */
    public InterfaceC2175F9<T> m104801k() {
        return this.f12367d;
    }

    /* renamed from: l */
    public C44447lM2.C25676a m104800l() {
        return this.f12366c;
    }

    /* renamed from: m */
    public C44447lM2.C25676a m104799m() {
        return this.f12365b;
    }

    /* renamed from: n */
    public C44447lM2 m104798n() {
        return this.f12364a;
    }

    /* renamed from: o */
    public void m104797o() {
        this.f12368e.writeLock().lock();
        try {
            Collection<T> mo72963b = this.f12367d.mo72963b();
            this.f12367d.clearItems();
            this.f12367d.mo72961d(mo72963b);
        } finally {
            this.f12368e.writeLock().unlock();
        }
    }

    /* renamed from: p */
    public void m104796p(T t) {
        this.f12368e.writeLock().lock();
        try {
            this.f12367d.mo72960e(t);
        } finally {
            this.f12368e.writeLock().unlock();
        }
    }

    /* renamed from: q */
    public void m104795q(List<T> list) {
        this.f12368e.writeLock().lock();
        try {
            for (T t : list) {
                this.f12367d.mo72960e(t);
            }
        } finally {
            this.f12368e.writeLock().unlock();
        }
    }

    /* renamed from: r */
    public void m104794r(InterfaceC2934b<T> interfaceC2934b) {
        this.f12375l = interfaceC2934b;
        this.f12369f.setOnClusterClickListener(interfaceC2934b);
    }

    /* renamed from: s */
    public void m104793s(InterfaceC2936d<T> interfaceC2936d) {
        this.f12374k = interfaceC2936d;
        this.f12369f.setOnClusterItemClickListener(interfaceC2936d);
    }

    /* renamed from: t */
    public void m104792t(InterfaceC33350Hl0<T> interfaceC33350Hl0) {
        this.f12369f.setOnClusterClickListener(null);
        this.f12369f.setOnClusterItemClickListener(null);
        this.f12366c.m27404f();
        this.f12365b.m27404f();
        this.f12369f.onRemove();
        this.f12369f = interfaceC33350Hl0;
        interfaceC33350Hl0.onAdd();
        this.f12369f.setOnClusterClickListener(this.f12375l);
        this.f12369f.setOnClusterInfoWindowClickListener(null);
        this.f12369f.setOnClusterItemClickListener(this.f12374k);
        this.f12369f.setOnClusterItemInfoWindowClickListener(null);
        m104802j();
    }

    /* renamed from: u */
    public void m104791u(Collection<T> collection) {
        this.f12368e.writeLock().lock();
        try {
            for (T t : collection) {
                this.f12367d.mo72958g(t);
            }
        } finally {
            this.f12368e.writeLock().unlock();
        }
    }

    public C33116Gl0(Context context, C39011cD1 c39011cD1, C44447lM2 c44447lM2) {
        this.f12368e = new ReentrantReadWriteLock();
        this.f12373j = new ReentrantReadWriteLock();
        this.f12370g = c39011cD1;
        this.f12364a = c44447lM2;
        this.f12366c = c44447lM2.m27411e();
        this.f12365b = c44447lM2.m27411e();
        this.f12369f = new EW0(context, c39011cD1, this);
        this.f12367d = new ZY3(new Y83());
        this.f12372i = new AsyncTaskC2933a();
        this.f12369f.onAdd();
    }
}
