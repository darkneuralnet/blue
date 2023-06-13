package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C47018ph5<InterfaceC41056fe3<? super T>, LiveData<T>.AbstractC11704c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC11704c implements InterfaceC11728i {

        /* renamed from: f */
        public final LifecycleOwner f54844f;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, InterfaceC41056fe3<? super T> interfaceC41056fe3) {
            super(interfaceC41056fe3);
            this.f54844f = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC11704c
        /* renamed from: b */
        public void mo67043b() {
            this.f54844f.getLifecycle().mo67006d(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC11704c
        /* renamed from: d */
        public boolean mo67042d(LifecycleOwner lifecycleOwner) {
            return this.f54844f == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC11704c
        /* renamed from: e */
        public boolean mo67041e() {
            return this.f54844f.getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC11728i
        public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
            AbstractC11719f.EnumC11724b mo67007b = this.f54844f.getLifecycle().mo67007b();
            if (mo67007b == AbstractC11719f.EnumC11724b.DESTROYED) {
                LiveData.this.removeObserver(this.f54848b);
                return;
            }
            AbstractC11719f.EnumC11724b enumC11724b = null;
            while (enumC11724b != mo67007b) {
                m67044a(mo67041e());
                enumC11724b = mo67007b;
                mo67007b = this.f54844f.getLifecycle().mo67007b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public class RunnableC11702a implements Runnable {
        public RunnableC11702a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    public class C11703b extends LiveData<T>.AbstractC11704c {
        public C11703b(InterfaceC41056fe3<? super T> interfaceC41056fe3) {
            super(interfaceC41056fe3);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC11704c
        /* renamed from: e */
        public boolean mo67041e() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC11704c {

        /* renamed from: b */
        public final InterfaceC41056fe3<? super T> f54848b;

        /* renamed from: c */
        public boolean f54849c;

        /* renamed from: d */
        public int f54850d = -1;

        public AbstractC11704c(InterfaceC41056fe3<? super T> interfaceC41056fe3) {
            this.f54848b = interfaceC41056fe3;
        }

        /* renamed from: a */
        public void m67044a(boolean z) {
            int i;
            if (z == this.f54849c) {
                return;
            }
            this.f54849c = z;
            LiveData liveData = LiveData.this;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            liveData.changeActiveCounter(i);
            if (this.f54849c) {
                LiveData.this.dispatchingValue(this);
            }
        }

        /* renamed from: b */
        public void mo67043b() {
        }

        /* renamed from: d */
        public boolean mo67042d(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* renamed from: e */
        public abstract boolean mo67041e();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new C47018ph5<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new RunnableC11702a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (C1988Em.m108396h().mo23534c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(LiveData<T>.AbstractC11704c abstractC11704c) {
        if (!abstractC11704c.f54849c) {
            return;
        }
        if (!abstractC11704c.mo67041e()) {
            abstractC11704c.m67044a(false);
            return;
        }
        int i = abstractC11704c.f54850d;
        int i2 = this.mVersion;
        if (i >= i2) {
            return;
        }
        abstractC11704c.f54850d = i2;
        abstractC11704c.f54848b.onChanged((Object) this.mData);
    }

    public void changeActiveCounter(int i) {
        boolean z;
        boolean z2;
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 != i3) {
                    if (i2 == 0 && i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        onActive();
                    } else if (z2) {
                        onInactive();
                    }
                    i2 = i3;
                } else {
                    return;
                }
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    public void dispatchingValue(LiveData<T>.AbstractC11704c abstractC11704c) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (abstractC11704c != null) {
                considerNotify(abstractC11704c);
                abstractC11704c = null;
            } else {
                C47018ph5<InterfaceC41056fe3<? super T>, LiveData<T>.AbstractC11704c>.C27337d m18969c = this.mObservers.m18969c();
                while (m18969c.hasNext()) {
                    considerNotify((AbstractC11704c) m18969c.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(LifecycleOwner lifecycleOwner, InterfaceC41056fe3<? super T> interfaceC41056fe3) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, interfaceC41056fe3);
        LiveData<T>.AbstractC11704c mo18966h = this.mObservers.mo18966h(interfaceC41056fe3, lifecycleBoundObserver);
        if (mo18966h != null && !mo18966h.mo67042d(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo18966h != null) {
            return;
        }
        lifecycleOwner.getLifecycle().mo67008a(lifecycleBoundObserver);
    }

    public void observeForever(InterfaceC41056fe3<? super T> interfaceC41056fe3) {
        assertMainThread("observeForever");
        C11703b c11703b = new C11703b(interfaceC41056fe3);
        LiveData<T>.AbstractC11704c mo18966h = this.mObservers.mo18966h(interfaceC41056fe3, c11703b);
        if (!(mo18966h instanceof LifecycleBoundObserver)) {
            if (mo18966h != null) {
                return;
            }
            c11703b.m67044a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (!z) {
            return;
        }
        C1988Em.m108396h().mo23533d(this.mPostValueRunnable);
    }

    public void removeObserver(InterfaceC41056fe3<? super T> interfaceC41056fe3) {
        assertMainThread("removeObserver");
        LiveData<T>.AbstractC11704c mo18965j = this.mObservers.mo18965j(interfaceC41056fe3);
        if (mo18965j == null) {
            return;
        }
        mo18965j.mo67043b();
        mo18965j.m67044a(false);
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<InterfaceC41056fe3<? super T>, LiveData<T>.AbstractC11704c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC41056fe3<? super T>, LiveData<T>.AbstractC11704c> next = it.next();
            if (next.getValue().mo67042d(lifecycleOwner)) {
                removeObserver(next.getKey());
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C47018ph5<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new RunnableC11702a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
