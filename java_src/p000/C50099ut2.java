package p000;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C11759u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p000.AbstractC49506tt2;
import p000.C48913st2;
/* renamed from: ut2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50099ut2 extends AbstractC49506tt2 {

    /* renamed from: c */
    public static boolean f113148c = false;

    /* renamed from: a */
    public final LifecycleOwner f113149a;

    /* renamed from: b */
    public final C29328c f113150b;

    /* renamed from: ut2$a */
    /* loaded from: classes.dex */
    public static class C29326a<D> extends C49882uX2<D> implements C48913st2.InterfaceC28423b<D> {

        /* renamed from: a */
        public final int f113151a;

        /* renamed from: b */
        public final Bundle f113152b;

        /* renamed from: c */
        public final C48913st2<D> f113153c;

        /* renamed from: d */
        public LifecycleOwner f113154d;

        /* renamed from: e */
        public C29327b<D> f113155e;

        /* renamed from: f */
        public C48913st2<D> f113156f;

        public C29326a(int i, Bundle bundle, C48913st2<D> c48913st2, C48913st2<D> c48913st22) {
            this.f113151a = i;
            this.f113152b = bundle;
            this.f113153c = c48913st2;
            this.f113156f = c48913st22;
            c48913st2.registerListener(i, this);
        }

        @Override // p000.C48913st2.InterfaceC28423b
        /* renamed from: a */
        public void mo9606a(C48913st2<D> c48913st2, D d) {
            if (C50099ut2.f113148c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
                return;
            }
            if (C50099ut2.f113148c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d);
        }

        /* renamed from: b */
        public C48913st2<D> m9605b(boolean z) {
            if (C50099ut2.f113148c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f113153c.cancelLoad();
            this.f113153c.abandon();
            C29327b<D> c29327b = this.f113155e;
            if (c29327b != null) {
                removeObserver(c29327b);
                if (z) {
                    c29327b.m9598c();
                }
            }
            this.f113153c.unregisterListener(this);
            if ((c29327b != null && !c29327b.m9599b()) || z) {
                this.f113153c.reset();
                return this.f113156f;
            }
            return this.f113153c;
        }

        /* renamed from: c */
        public void m9604c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f113151a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f113152b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f113153c);
            C48913st2<D> c48913st2 = this.f113153c;
            c48913st2.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f113155e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f113155e);
                C29327b<D> c29327b = this.f113155e;
                c29327b.m9600a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m9603d().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* renamed from: d */
        public C48913st2<D> m9603d() {
            return this.f113153c;
        }

        /* renamed from: e */
        public void m9602e() {
            LifecycleOwner lifecycleOwner = this.f113154d;
            C29327b<D> c29327b = this.f113155e;
            if (lifecycleOwner != null && c29327b != null) {
                super.removeObserver(c29327b);
                observe(lifecycleOwner, c29327b);
            }
        }

        /* renamed from: f */
        public C48913st2<D> m9601f(LifecycleOwner lifecycleOwner, AbstractC49506tt2.InterfaceC28959a<D> interfaceC28959a) {
            C29327b<D> c29327b = new C29327b<>(this.f113153c, interfaceC28959a);
            observe(lifecycleOwner, c29327b);
            C29327b<D> c29327b2 = this.f113155e;
            if (c29327b2 != null) {
                removeObserver(c29327b2);
            }
            this.f113154d = lifecycleOwner;
            this.f113155e = c29327b;
            return this.f113153c;
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (C50099ut2.f113148c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f113153c.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (C50099ut2.f113148c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f113153c.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(InterfaceC41056fe3<? super D> interfaceC41056fe3) {
            super.removeObserver(interfaceC41056fe3);
            this.f113154d = null;
            this.f113155e = null;
        }

        @Override // p000.C49882uX2, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            C48913st2<D> c48913st2 = this.f113156f;
            if (c48913st2 != null) {
                c48913st2.reset();
                this.f113156f = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f113151a);
            sb.append(" : ");
            C41561gV0.m39267a(this.f113153c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: ut2$b */
    /* loaded from: classes.dex */
    public static class C29327b<D> implements InterfaceC41056fe3<D> {

        /* renamed from: b */
        public final C48913st2<D> f113157b;

        /* renamed from: c */
        public final AbstractC49506tt2.InterfaceC28959a<D> f113158c;

        /* renamed from: d */
        public boolean f113159d = false;

        public C29327b(C48913st2<D> c48913st2, AbstractC49506tt2.InterfaceC28959a<D> interfaceC28959a) {
            this.f113157b = c48913st2;
            this.f113158c = interfaceC28959a;
        }

        /* renamed from: a */
        public void m9600a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f113159d);
        }

        /* renamed from: b */
        public boolean m9599b() {
            return this.f113159d;
        }

        /* renamed from: c */
        public void m9598c() {
            if (this.f113159d) {
                if (C50099ut2.f113148c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f113157b);
                }
                this.f113158c.onLoaderReset(this.f113157b);
            }
        }

        @Override // p000.InterfaceC41056fe3
        public void onChanged(D d) {
            if (C50099ut2.f113148c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f113157b + ": " + this.f113157b.dataToString(d));
            }
            this.f113158c.onLoadFinished(this.f113157b, d);
            this.f113159d = true;
        }

        public String toString() {
            return this.f113158c.toString();
        }
    }

    /* renamed from: ut2$c */
    /* loaded from: classes.dex */
    public static class C29328c extends AbstractC35048Or6 {

        /* renamed from: c */
        public static final C11759u.InterfaceC11763b f113160c = new C29329a();

        /* renamed from: a */
        public LN5<C29326a> f113161a = new LN5<>();

        /* renamed from: b */
        public boolean f113162b = false;

        /* renamed from: ut2$c$a */
        /* loaded from: classes.dex */
        public static class C29329a implements C11759u.InterfaceC11763b {
            @Override // androidx.lifecycle.C11759u.InterfaceC11763b
            public <T extends AbstractC35048Or6> T create(Class<T> cls) {
                return new C29328c();
            }
        }

        /* renamed from: g */
        public static C29328c m9595g(C36920Wr6 c36920Wr6) {
            return (C29328c) new C11759u(c36920Wr6, f113160c).m66922a(C29328c.class);
        }

        /* renamed from: e */
        public void m9597e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f113161a.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f113161a.size(); i++) {
                    C29326a m96975t = this.f113161a.m96975t(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f113161a.m96979o(i));
                    printWriter.print(": ");
                    printWriter.println(m96975t.toString());
                    m96975t.m9604c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: f */
        public void m9596f() {
            this.f113162b = false;
        }

        /* renamed from: h */
        public <D> C29326a<D> m9594h(int i) {
            return this.f113161a.m96983k(i);
        }

        /* renamed from: i */
        public boolean m9593i() {
            return this.f113162b;
        }

        /* renamed from: j */
        public void m9592j() {
            int size = this.f113161a.size();
            for (int i = 0; i < size; i++) {
                this.f113161a.m96975t(i).m9602e();
            }
        }

        /* renamed from: k */
        public void m9591k(int i, C29326a c29326a) {
            this.f113161a.m96978p(i, c29326a);
        }

        /* renamed from: l */
        public void m9590l() {
            this.f113162b = true;
        }

        @Override // p000.AbstractC35048Or6
        public void onCleared() {
            super.onCleared();
            int size = this.f113161a.size();
            for (int i = 0; i < size; i++) {
                this.f113161a.m96975t(i).m9605b(true);
            }
            this.f113161a.m96988e();
        }
    }

    public C50099ut2(LifecycleOwner lifecycleOwner, C36920Wr6 c36920Wr6) {
        this.f113149a = lifecycleOwner;
        this.f113150b = C29328c.m9595g(c36920Wr6);
    }

    @Override // p000.AbstractC49506tt2
    @Deprecated
    /* renamed from: a */
    public void mo9610a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f113150b.m9597e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p000.AbstractC49506tt2
    /* renamed from: c */
    public <D> C48913st2<D> mo9609c(int i, Bundle bundle, AbstractC49506tt2.InterfaceC28959a<D> interfaceC28959a) {
        if (!this.f113150b.m9593i()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C29326a<D> m9594h = this.f113150b.m9594h(i);
                if (f113148c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (m9594h == null) {
                    return m9607e(i, bundle, interfaceC28959a, null);
                }
                if (f113148c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + m9594h);
                }
                return m9594h.m9601f(this.f113149a, interfaceC28959a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // p000.AbstractC49506tt2
    /* renamed from: d */
    public void mo9608d() {
        this.f113150b.m9592j();
    }

    /* renamed from: e */
    public final <D> C48913st2<D> m9607e(int i, Bundle bundle, AbstractC49506tt2.InterfaceC28959a<D> interfaceC28959a, C48913st2<D> c48913st2) {
        try {
            this.f113150b.m9590l();
            C48913st2<D> onCreateLoader = interfaceC28959a.onCreateLoader(i, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                C29326a c29326a = new C29326a(i, bundle, onCreateLoader, c48913st2);
                if (f113148c) {
                    Log.v("LoaderManager", "  Created new loader " + c29326a);
                }
                this.f113150b.m9591k(i, c29326a);
                this.f113150b.m9596f();
                return c29326a.m9601f(this.f113149a, interfaceC28959a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f113150b.m9596f();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C41561gV0.m39267a(this.f113149a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
