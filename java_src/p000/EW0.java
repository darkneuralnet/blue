package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.C11925l;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.p037ui.SquareTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p000.C33116Gl0;
import p000.C39011cD1;
import p000.InterfaceC32648El0;
/* renamed from: EW0 */
/* loaded from: classes6.dex */
public class EW0<T extends InterfaceC32648El0> implements InterfaceC33350Hl0<T> {
    private int clusterColor;
    private C33116Gl0.InterfaceC2934b<T> mClickListener;
    private final C33116Gl0<T> mClusterManager;
    private Set<? extends InterfaceC32414Dl0<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final AP1 mIconGenerator;
    private C33116Gl0.InterfaceC2935c<T> mInfoWindowClickListener;
    private C33116Gl0.InterfaceC2936d<T> mItemClickListener;
    private C33116Gl0.InterfaceC2937e<T> mItemInfoWindowClickListener;
    private final C39011cD1 mMap;
    private float mZoom;
    private static final boolean SHOULD_ANIMATE = true;
    private static final int[] BUCKETS = {10, 20, 50, 100, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, 500, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private Set<C1850i> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<C6378PT> mIcons = new SparseArray<>();
    private C1848g<T> mMarkerCache = new C1848g<>();
    private int mMinClusterSize = 4;
    private Map<C40889fM2, InterfaceC32414Dl0<T>> mMarkerToCluster = new HashMap();
    private Map<InterfaceC32414Dl0<T>, C40889fM2> mClusterToMarker = new HashMap();
    private final EW0<T>.HandlerC1852k mViewModifier = new HandlerC1852k();
    private boolean mAnimate = true;

    /* renamed from: EW0$a */
    /* loaded from: classes6.dex */
    public class C1842a implements C39011cD1.InterfaceC13470l {
        public C1842a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.C39011cD1.InterfaceC13470l
        /* renamed from: c */
        public boolean mo27413c(C40889fM2 c40889fM2) {
            return EW0.this.mItemClickListener != null && EW0.this.mItemClickListener.mo78587a((InterfaceC32648El0) EW0.this.mMarkerCache.m108893b(c40889fM2));
        }
    }

    /* renamed from: EW0$b */
    /* loaded from: classes6.dex */
    public class C1843b implements C39011cD1.InterfaceC13466h {
        public C1843b() {
        }

        @Override // p000.C39011cD1.InterfaceC13466h
        /* renamed from: b */
        public void mo27414b(C40889fM2 c40889fM2) {
            EW0.this.getClass();
        }
    }

    /* renamed from: EW0$c */
    /* loaded from: classes6.dex */
    public class C1844c implements C39011cD1.InterfaceC13470l {
        public C1844c() {
        }

        @Override // p000.C39011cD1.InterfaceC13470l
        /* renamed from: c */
        public boolean mo27413c(C40889fM2 c40889fM2) {
            return EW0.this.mClickListener != null && EW0.this.mClickListener.onClusterClick((InterfaceC32414Dl0) EW0.this.mMarkerToCluster.get(c40889fM2));
        }
    }

    /* renamed from: EW0$d */
    /* loaded from: classes6.dex */
    public class C1845d implements C39011cD1.InterfaceC13466h {
        public C1845d() {
        }

        @Override // p000.C39011cD1.InterfaceC13466h
        /* renamed from: b */
        public void mo27414b(C40889fM2 c40889fM2) {
            EW0.this.getClass();
        }
    }

    @TargetApi(12)
    /* renamed from: EW0$e */
    /* loaded from: classes6.dex */
    public class C1846e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final C1850i f7559a;

        /* renamed from: b */
        public final C40889fM2 f7560b;

        /* renamed from: c */
        public final LatLng f7561c;

        /* renamed from: d */
        public final LatLng f7562d;

        /* renamed from: e */
        public boolean f7563e;

        /* renamed from: f */
        public C44447lM2 f7564f;

        /* renamed from: a */
        public void m108898a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(EW0.ANIMATION_INTERP);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: b */
        public void m108897b(C44447lM2 c44447lM2) {
            this.f7564f = c44447lM2;
            this.f7563e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7563e) {
                EW0.this.mClusterToMarker.remove((InterfaceC32414Dl0) EW0.this.mMarkerToCluster.get(this.f7560b));
                EW0.this.mMarkerCache.m108891d(this.f7560b);
                EW0.this.mMarkerToCluster.remove(this.f7560b);
                this.f7564f.m27410f(this.f7560b);
            }
            this.f7559a.f7582b = this.f7562d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f7562d;
            double d = latLng.f71430b;
            LatLng latLng2 = this.f7561c;
            double d2 = latLng2.f71430b;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.f71431c - latLng2.f71431c;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.f7560b.m41521m(new LatLng(d4, (d5 * d3) + this.f7561c.f71431c));
        }

        public C1846e(C1850i c1850i, LatLng latLng, LatLng latLng2) {
            this.f7559a = c1850i;
            this.f7560b = c1850i.f7581a;
            this.f7561c = latLng;
            this.f7562d = latLng2;
        }
    }

    /* renamed from: EW0$f */
    /* loaded from: classes6.dex */
    public class C1847f {

        /* renamed from: a */
        public final InterfaceC32414Dl0<T> f7566a;

        /* renamed from: b */
        public final Set<C1850i> f7567b;

        /* renamed from: c */
        public final LatLng f7568c;

        public C1847f(InterfaceC32414Dl0<T> interfaceC32414Dl0, Set<C1850i> set, LatLng latLng) {
            this.f7566a = interfaceC32414Dl0;
            this.f7567b = set;
            this.f7568c = latLng;
        }

        /* renamed from: b */
        public final void m108895b(EW0<T>.HandlerC1849h handlerC1849h) {
            C1850i c1850i;
            C1850i c1850i2;
            if (!EW0.this.shouldRenderAsCluster(this.f7566a)) {
                for (T t : this.f7566a.mo75548b()) {
                    C40889fM2 m108894a = EW0.this.mMarkerCache.m108894a(t);
                    if (m108894a == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.f7568c;
                        if (latLng != null) {
                            markerOptions.m50643u1(latLng);
                        } else {
                            markerOptions.m50643u1(t.getPosition());
                        }
                        if (t.getTitle() != null && t.getSnippet() != null) {
                            markerOptions.m50658L1(t.getTitle());
                            markerOptions.m50661J1(t.getSnippet());
                        } else if (t.getSnippet() != null) {
                            markerOptions.m50658L1(t.getSnippet());
                        } else if (t.getTitle() != null) {
                            markerOptions.m50658L1(t.getTitle());
                        }
                        markerOptions.m50651Y1(t.getZIndex());
                        EW0.this.onBeforeClusterItemRendered(t, markerOptions);
                        m108894a = EW0.this.mClusterManager.m104799m().m27405e(markerOptions);
                        c1850i2 = new C1850i(m108894a);
                        EW0.this.mMarkerCache.m108892c(t, m108894a);
                        LatLng latLng2 = this.f7568c;
                        if (latLng2 != null) {
                            handlerC1849h.m108889b(c1850i2, latLng2, t.getPosition());
                        }
                    } else {
                        c1850i2 = new C1850i(m108894a);
                    }
                    EW0.this.onClusterItemRendered(t, m108894a);
                    this.f7567b.add(c1850i2);
                }
                return;
            }
            C40889fM2 c40889fM2 = (C40889fM2) EW0.this.mClusterToMarker.get(this.f7566a);
            if (c40889fM2 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.f7568c;
                if (latLng3 == null) {
                    latLng3 = this.f7566a.getPosition();
                }
                MarkerOptions m50643u1 = markerOptions2.m50643u1(latLng3);
                EW0.this.onBeforeClusterRendered(this.f7566a, m50643u1);
                c40889fM2 = EW0.this.mClusterManager.m104800l().m27405e(m50643u1);
                EW0.this.mMarkerToCluster.put(c40889fM2, this.f7566a);
                EW0.this.mClusterToMarker.put(this.f7566a, c40889fM2);
                c1850i = new C1850i(c40889fM2);
                LatLng latLng4 = this.f7568c;
                if (latLng4 != null) {
                    handlerC1849h.m108889b(c1850i, latLng4, this.f7566a.getPosition());
                }
            } else {
                c1850i = new C1850i(c40889fM2);
            }
            EW0.this.onClusterRendered(this.f7566a, c40889fM2);
            this.f7567b.add(c1850i);
        }
    }

    /* renamed from: EW0$g */
    /* loaded from: classes6.dex */
    public static class C1848g<T> {

        /* renamed from: a */
        public Map<T, C40889fM2> f7570a;

        /* renamed from: b */
        public Map<C40889fM2, T> f7571b;

        /* renamed from: a */
        public C40889fM2 m108894a(T t) {
            return this.f7570a.get(t);
        }

        /* renamed from: b */
        public T m108893b(C40889fM2 c40889fM2) {
            return this.f7571b.get(c40889fM2);
        }

        /* renamed from: c */
        public void m108892c(T t, C40889fM2 c40889fM2) {
            this.f7570a.put(t, c40889fM2);
            this.f7571b.put(c40889fM2, t);
        }

        /* renamed from: d */
        public void m108891d(C40889fM2 c40889fM2) {
            T t = this.f7571b.get(c40889fM2);
            this.f7571b.remove(c40889fM2);
            this.f7570a.remove(t);
        }

        private C1848g() {
            this.f7570a = new HashMap();
            this.f7571b = new HashMap();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: EW0$h */
    /* loaded from: classes6.dex */
    public class HandlerC1849h extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: b */
        public final Lock f7572b;

        /* renamed from: c */
        public final Condition f7573c;

        /* renamed from: d */
        public Queue<EW0<T>.C1847f> f7574d;

        /* renamed from: e */
        public Queue<EW0<T>.C1847f> f7575e;

        /* renamed from: f */
        public Queue<C40889fM2> f7576f;

        /* renamed from: g */
        public Queue<C40889fM2> f7577g;

        /* renamed from: h */
        public Queue<EW0<T>.C1846e> f7578h;

        /* renamed from: i */
        public boolean f7579i;

        /* renamed from: a */
        public void m108890a(boolean z, EW0<T>.C1847f c1847f) {
            this.f7572b.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f7575e.add(c1847f);
            } else {
                this.f7574d.add(c1847f);
            }
            this.f7572b.unlock();
        }

        /* renamed from: b */
        public void m108889b(C1850i c1850i, LatLng latLng, LatLng latLng2) {
            this.f7572b.lock();
            this.f7578h.add(new C1846e(c1850i, latLng, latLng2));
            this.f7572b.unlock();
        }

        @TargetApi(11)
        /* renamed from: c */
        public void m108888c(C1850i c1850i, LatLng latLng, LatLng latLng2) {
            this.f7572b.lock();
            EW0<T>.C1846e c1846e = new C1846e(c1850i, latLng, latLng2);
            c1846e.m108897b(EW0.this.mClusterManager.m104798n());
            this.f7578h.add(c1846e);
            this.f7572b.unlock();
        }

        /* renamed from: d */
        public boolean m108887d() {
            boolean z;
            try {
                this.f7572b.lock();
                if (this.f7574d.isEmpty() && this.f7575e.isEmpty() && this.f7577g.isEmpty() && this.f7576f.isEmpty()) {
                    if (this.f7578h.isEmpty()) {
                        z = false;
                        return z;
                    }
                }
                z = true;
                return z;
            } finally {
                this.f7572b.unlock();
            }
        }

        @TargetApi(11)
        /* renamed from: e */
        public final void m108886e() {
            if (!this.f7577g.isEmpty()) {
                m108884g(this.f7577g.poll());
            } else if (!this.f7578h.isEmpty()) {
                this.f7578h.poll().m108898a();
            } else if (!this.f7575e.isEmpty()) {
                this.f7575e.poll().m108895b(this);
            } else if (!this.f7574d.isEmpty()) {
                this.f7574d.poll().m108895b(this);
            } else if (!this.f7576f.isEmpty()) {
                m108884g(this.f7576f.poll());
            }
        }

        /* renamed from: f */
        public void m108885f(boolean z, C40889fM2 c40889fM2) {
            this.f7572b.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f7577g.add(c40889fM2);
            } else {
                this.f7576f.add(c40889fM2);
            }
            this.f7572b.unlock();
        }

        /* renamed from: g */
        public final void m108884g(C40889fM2 c40889fM2) {
            EW0.this.mClusterToMarker.remove((InterfaceC32414Dl0) EW0.this.mMarkerToCluster.get(c40889fM2));
            EW0.this.mMarkerCache.m108891d(c40889fM2);
            EW0.this.mMarkerToCluster.remove(c40889fM2);
            EW0.this.mClusterManager.m104798n().m27410f(c40889fM2);
        }

        /* renamed from: h */
        public void m108883h() {
            while (m108887d()) {
                sendEmptyMessage(0);
                this.f7572b.lock();
                try {
                    try {
                        if (m108887d()) {
                            this.f7573c.await();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    this.f7572b.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f7579i) {
                Looper.myQueue().addIdleHandler(this);
                this.f7579i = true;
            }
            removeMessages(0);
            this.f7572b.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    m108886e();
                } finally {
                    this.f7572b.unlock();
                }
            }
            if (!m108887d()) {
                this.f7579i = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f7573c.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10L);
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public HandlerC1849h() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f7572b = reentrantLock;
            this.f7573c = reentrantLock.newCondition();
            this.f7574d = new LinkedList();
            this.f7575e = new LinkedList();
            this.f7576f = new LinkedList();
            this.f7577g = new LinkedList();
            this.f7578h = new LinkedList();
        }
    }

    /* renamed from: EW0$i */
    /* loaded from: classes6.dex */
    public static class C1850i {

        /* renamed from: a */
        public final C40889fM2 f7581a;

        /* renamed from: b */
        public LatLng f7582b;

        public boolean equals(Object obj) {
            if (obj instanceof C1850i) {
                return this.f7581a.equals(((C1850i) obj).f7581a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7581a.hashCode();
        }

        public C1850i(C40889fM2 c40889fM2) {
            this.f7581a = c40889fM2;
            this.f7582b = c40889fM2.m41532b();
        }
    }

    /* renamed from: EW0$j */
    /* loaded from: classes6.dex */
    public class RunnableC1851j implements Runnable {

        /* renamed from: b */
        public final Set<? extends InterfaceC32414Dl0<T>> f7583b;

        /* renamed from: c */
        public Runnable f7584c;

        /* renamed from: d */
        public U74 f7585d;

        /* renamed from: e */
        public QN5 f7586e;

        /* renamed from: f */
        public float f7587f;

        /* renamed from: a */
        public void m108879a(Runnable runnable) {
            this.f7584c = runnable;
        }

        /* renamed from: b */
        public void m108878b(float f) {
            this.f7587f = f;
            this.f7586e = new QN5(Math.pow(2.0d, Math.min(f, EW0.this.mZoom)) * 256.0d);
        }

        /* renamed from: c */
        public void m108877c(U74 u74) {
            this.f7585d = u74;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            boolean z;
            ArrayList arrayList;
            if (this.f7583b.equals(EW0.this.mClusters)) {
                this.f7584c.run();
                return;
            }
            ArrayList arrayList2 = null;
            HandlerC1849h handlerC1849h = new HandlerC1849h();
            float f = this.f7587f;
            if (f > EW0.this.mZoom) {
                z = true;
            } else {
                z = false;
            }
            float f2 = f - EW0.this.mZoom;
            Set<C1850i> set = EW0.this.mMarkers;
            LatLngBounds latLngBounds = this.f7585d.m81934b().f71509f;
            if (EW0.this.mClusters != null && EW0.SHOULD_ANIMATE) {
                arrayList = new ArrayList();
                for (InterfaceC32414Dl0<T> interfaceC32414Dl0 : EW0.this.mClusters) {
                    if (EW0.this.shouldRenderAsCluster(interfaceC32414Dl0) && latLngBounds.m50669u(interfaceC32414Dl0.getPosition())) {
                        arrayList.add(this.f7586e.m88534b(interfaceC32414Dl0.getPosition()));
                    }
                }
            } else {
                arrayList = null;
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (InterfaceC32414Dl0<T> interfaceC32414Dl02 : this.f7583b) {
                boolean m50669u = latLngBounds.m50669u(interfaceC32414Dl02.getPosition());
                if (z && m50669u && EW0.SHOULD_ANIMATE) {
                    GW3 findClosestCluster = EW0.findClosestCluster(arrayList, this.f7586e.m88534b(interfaceC32414Dl02.getPosition()));
                    if (findClosestCluster != null && EW0.this.mAnimate) {
                        handlerC1849h.m108890a(true, new C1847f(interfaceC32414Dl02, newSetFromMap, this.f7586e.m88535a(findClosestCluster)));
                    } else {
                        handlerC1849h.m108890a(true, new C1847f(interfaceC32414Dl02, newSetFromMap, null));
                    }
                } else {
                    handlerC1849h.m108890a(m50669u, new C1847f(interfaceC32414Dl02, newSetFromMap, null));
                }
            }
            handlerC1849h.m108883h();
            set.removeAll(newSetFromMap);
            if (EW0.SHOULD_ANIMATE) {
                arrayList2 = new ArrayList();
                for (InterfaceC32414Dl0<T> interfaceC32414Dl03 : this.f7583b) {
                    if (EW0.this.shouldRenderAsCluster(interfaceC32414Dl03) && latLngBounds.m50669u(interfaceC32414Dl03.getPosition())) {
                        arrayList2.add(this.f7586e.m88534b(interfaceC32414Dl03.getPosition()));
                    }
                }
            }
            for (C1850i c1850i : set) {
                boolean m50669u2 = latLngBounds.m50669u(c1850i.f7582b);
                if (!z && f2 > -3.0f && m50669u2 && EW0.SHOULD_ANIMATE) {
                    GW3 findClosestCluster2 = EW0.findClosestCluster(arrayList2, this.f7586e.m88534b(c1850i.f7582b));
                    if (findClosestCluster2 != null && EW0.this.mAnimate) {
                        handlerC1849h.m108888c(c1850i, c1850i.f7582b, this.f7586e.m88535a(findClosestCluster2));
                    } else {
                        handlerC1849h.m108885f(true, c1850i.f7581a);
                    }
                } else {
                    handlerC1849h.m108885f(m50669u2, c1850i.f7581a);
                }
            }
            handlerC1849h.m108883h();
            EW0.this.mMarkers = newSetFromMap;
            EW0.this.mClusters = this.f7583b;
            EW0.this.mZoom = f;
            this.f7584c.run();
        }

        public RunnableC1851j(Set<? extends InterfaceC32414Dl0<T>> set) {
            this.f7583b = set;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: EW0$k */
    /* loaded from: classes6.dex */
    public class HandlerC1852k extends Handler {

        /* renamed from: a */
        public boolean f7589a;

        /* renamed from: b */
        public EW0<T>.RunnableC1851j f7590b;

        /* renamed from: EW0$k$a */
        /* loaded from: classes6.dex */
        public class RunnableC1853a implements Runnable {
            public RunnableC1853a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                HandlerC1852k.this.sendEmptyMessage(1);
            }
        }

        /* renamed from: a */
        public void m108876a(Set<? extends InterfaceC32414Dl0<T>> set) {
            synchronized (this) {
                this.f7590b = new RunnableC1851j(set);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            EW0<T>.RunnableC1851j runnableC1851j;
            if (message.what == 1) {
                this.f7589a = false;
                if (this.f7590b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f7589a || this.f7590b == null) {
                return;
            }
            U74 m61677k = EW0.this.mMap.m61677k();
            synchronized (this) {
                runnableC1851j = this.f7590b;
                this.f7590b = null;
                this.f7589a = true;
            }
            runnableC1851j.m108879a(new RunnableC1853a());
            runnableC1851j.m108877c(m61677k);
            runnableC1851j.m108878b(EW0.this.mMap.m61679i().f71395c);
            new Thread(runnableC1851j).start();
        }

        public HandlerC1852k() {
            this.f7589a = false;
            this.f7590b = null;
        }
    }

    public EW0(Context context, C39011cD1 c39011cD1, C33116Gl0<T> c33116Gl0) {
        this.mMap = c39011cD1;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        AP1 ap1 = new AP1(context);
        this.mIconGenerator = ap1;
        ap1.m115821g(makeSquareTextView(context));
        ap1.m115819i(C50613vl4.amu_ClusterIcon_TextAppearance);
        ap1.m115823e(makeClusterBackground());
        this.mClusterManager = c33116Gl0;
        this.clusterColor = context.getResources().getColor(C32364Df4.brandAccent);
    }

    private static double distanceSquared(GW3 gw3, GW3 gw32) {
        double d = gw3.f12013a;
        double d2 = gw32.f12013a;
        double d3 = (d - d2) * (d - d2);
        double d4 = gw3.f12014b;
        double d5 = gw32.f12014b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GW3 findClosestCluster(List<GW3> list, GW3 gw3) {
        GW3 gw32 = null;
        if (list != null && !list.isEmpty()) {
            double d = 10000.0d;
            for (GW3 gw33 : list) {
                double distanceSquared = distanceSquared(gw33, gw3);
                if (distanceSquared < d) {
                    gw32 = gw33;
                    d = distanceSquared;
                }
            }
        }
        return gw32;
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(C34029Ki4.amu_text);
        int i = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i, i, i, i);
        return squareTextView;
    }

    public void deselectItem(T t, C40889fM2 c40889fM2) {
    }

    public int getBucket(InterfaceC32414Dl0<T> interfaceC32414Dl0) {
        int mo75549a = interfaceC32414Dl0.mo75549a();
        int i = 0;
        if (mo75549a <= BUCKETS[0]) {
            return mo75549a;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i < iArr.length - 1) {
                int i2 = i + 1;
                if (mo75549a < iArr[i2]) {
                    return iArr[i];
                }
                i = i2;
            } else {
                return iArr[iArr.length - 1];
            }
        }
    }

    public InterfaceC32414Dl0<T> getCluster(C40889fM2 c40889fM2) {
        return this.mMarkerToCluster.get(c40889fM2);
    }

    public T getClusterItem(C40889fM2 c40889fM2) {
        return this.mMarkerCache.m108893b(c40889fM2);
    }

    public String getClusterText(int i) {
        if (i < BUCKETS[0]) {
            return String.valueOf(i);
        }
        return String.valueOf(i) + "+";
    }

    public int getColor(int i) {
        return this.clusterColor;
    }

    public C40889fM2 getMarker(T t) {
        return this.mMarkerCache.m108894a(t);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // p000.InterfaceC33350Hl0
    public void onAdd() {
        this.mClusterManager.m104799m().m27401i(new C1842a());
        this.mClusterManager.m104799m().m27402h(new C1843b());
        this.mClusterManager.m104800l().m27401i(new C1844c());
        this.mClusterManager.m104800l().m27402h(new C1845d());
    }

    public void onBeforeClusterItemRendered(T t, MarkerOptions markerOptions) {
    }

    public void onBeforeClusterRendered(InterfaceC32414Dl0<T> interfaceC32414Dl0, MarkerOptions markerOptions) {
        int bucket = getBucket(interfaceC32414Dl0);
        C6378PT c6378pt = this.mIcons.get(bucket);
        if (c6378pt == null) {
            this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
            c6378pt = C6780QT.m88495a(this.mIconGenerator.m115824d(getClusterText(bucket)));
            this.mIcons.put(bucket, c6378pt);
        }
        markerOptions.m50657N0(c6378pt);
    }

    public void onClusterItemRendered(T t, C40889fM2 c40889fM2) {
    }

    public void onClusterRendered(InterfaceC32414Dl0<T> interfaceC32414Dl0, C40889fM2 c40889fM2) {
    }

    @Override // p000.InterfaceC33350Hl0
    public void onClustersChanged(Set<? extends InterfaceC32414Dl0<T>> set) {
        this.mViewModifier.m108876a(set);
    }

    @Override // p000.InterfaceC33350Hl0
    public void onRemove() {
        this.mClusterManager.m104799m().m27401i(null);
        this.mClusterManager.m104799m().m27402h(null);
        this.mClusterManager.m104800l().m27401i(null);
        this.mClusterManager.m104800l().m27402h(null);
    }

    public void renderMapMarkerState(T t, C40889fM2 c40889fM2) {
    }

    public void selectItem(T t, C40889fM2 c40889fM2) {
    }

    public void setAnimation(boolean z) {
        this.mAnimate = z;
    }

    public void setMinClusterSize(int i) {
        this.mMinClusterSize = i;
    }

    @Override // p000.InterfaceC33350Hl0
    public void setOnClusterClickListener(C33116Gl0.InterfaceC2934b<T> interfaceC2934b) {
        this.mClickListener = interfaceC2934b;
    }

    @Override // p000.InterfaceC33350Hl0
    public void setOnClusterInfoWindowClickListener(C33116Gl0.InterfaceC2935c<T> interfaceC2935c) {
    }

    @Override // p000.InterfaceC33350Hl0
    public void setOnClusterItemClickListener(C33116Gl0.InterfaceC2936d<T> interfaceC2936d) {
        this.mItemClickListener = interfaceC2936d;
    }

    @Override // p000.InterfaceC33350Hl0
    public void setOnClusterItemInfoWindowClickListener(C33116Gl0.InterfaceC2937e<T> interfaceC2937e) {
    }

    public boolean shouldRenderAsCluster(InterfaceC32414Dl0<T> interfaceC32414Dl0) {
        return interfaceC32414Dl0.mo75549a() > this.mMinClusterSize;
    }

    public void startMarkerAnimation() {
    }

    public C40889fM2 getMarker(InterfaceC32414Dl0<T> interfaceC32414Dl0) {
        return this.mClusterToMarker.get(interfaceC32414Dl0);
    }
}
