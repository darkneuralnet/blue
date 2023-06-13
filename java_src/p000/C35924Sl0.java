package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p000.C35456Ql0;
import p000.C41456gJ3;
import p000.C44102km4;
/* renamed from: Sl0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35924Sl0 {

    /* renamed from: f */
    public static final String f34204f = "Sl0";

    /* renamed from: g */
    public static C35924Sl0 f34205g;

    /* renamed from: a */
    public final Handler f34206a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public Set<Activity> f34207b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public Set<ViewTreeObserver$OnGlobalLayoutListenerC7531c> f34208c = new HashSet();

    /* renamed from: d */
    public HashSet<String> f34209d = new HashSet<>();

    /* renamed from: e */
    public HashMap<Integer, HashSet<String>> f34210e = new HashMap<>();

    /* renamed from: Sl0$a */
    /* loaded from: classes5.dex */
    public class RunnableC7529a implements Runnable {
        public RunnableC7529a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C35924Sl0.m84907a(C35924Sl0.this);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: Sl0$b */
    /* loaded from: classes5.dex */
    public static class C7530b {

        /* renamed from: a */
        public WeakReference<View> f34212a;

        /* renamed from: b */
        public String f34213b;

        public C7530b(View view, String str) {
            this.f34212a = new WeakReference<>(view);
            this.f34213b = str;
        }

        /* renamed from: a */
        public View m84898a() {
            WeakReference<View> weakReference = this.f34212a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        /* renamed from: b */
        public String m84897b() {
            return this.f34213b;
        }
    }

    /* renamed from: Sl0$c */
    /* loaded from: classes5.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC7531c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: b */
        public WeakReference<View> f34214b;

        /* renamed from: c */
        public List<C52932zg1> f34215c;

        /* renamed from: d */
        public final Handler f34216d;

        /* renamed from: e */
        public HashSet<String> f34217e;

        /* renamed from: f */
        public final String f34218f;

        public ViewTreeObserver$OnGlobalLayoutListenerC7531c(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f34214b = new WeakReference<>(view);
            this.f34216d = handler;
            this.f34217e = hashSet;
            this.f34218f = str;
            handler.postDelayed(this, 200L);
        }

        /* renamed from: f */
        public static List<C7530b> m84891f(C52932zg1 c52932zg1, View view, List<C41456gJ3> list, int i, int i2, String str) {
            String str2 = str + InstructionFileId.DOT + String.valueOf(i2);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C7530b(view, str2));
            } else {
                C41456gJ3 c41456gJ3 = list.get(i);
                if (c41456gJ3.f81963a.equals(CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> m84890g = m84890g((ViewGroup) parent);
                        int size = m84890g.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m84891f(c52932zg1, m84890g.get(i3), list, i + 1, i3, str2));
                        }
                    }
                    return arrayList;
                } else if (c41456gJ3.f81963a.equals(InstructionFileId.DOT)) {
                    arrayList.add(new C7530b(view, str2));
                    return arrayList;
                } else if (!m84889h(view, c41456gJ3, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C7530b(view, str2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List<View> m84890g2 = m84890g((ViewGroup) view);
                int size2 = m84890g2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m84891f(c52932zg1, m84890g2.get(i4), list, i + 1, i4, str2));
                }
            }
            return arrayList;
        }

        /* renamed from: g */
        public static List<View> m84890g(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L14;
         */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean m84889h(View view, C41456gJ3 c41456gJ3, int i) {
            String valueOf;
            String valueOf2;
            int i2 = c41456gJ3.f81964b;
            if (i2 != -1 && i != i2) {
                return false;
            }
            if (!view.getClass().getCanonicalName().equals(c41456gJ3.f81963a)) {
                if (c41456gJ3.f81963a.matches(".*android\\..*")) {
                    String[] split = c41456gJ3.f81963a.split("\\.");
                    if (split.length > 0) {
                    }
                }
                return false;
            }
            if ((c41456gJ3.f81970h & C41456gJ3.EnumC20822a.ID.m39644a()) > 0 && c41456gJ3.f81965c != view.getId()) {
                return false;
            }
            if ((c41456gJ3.f81970h & C41456gJ3.EnumC20822a.TEXT.m39644a()) > 0) {
                String str = c41456gJ3.f81966d;
                String m22281k = C45933nr6.m22281k(view);
                String m2837h = C52364yi6.m2837h(C52364yi6.m2808v0(m22281k), "");
                if (!str.equals(m22281k) && !str.equals(m2837h)) {
                    return false;
                }
            }
            if ((c41456gJ3.f81970h & C41456gJ3.EnumC20822a.DESCRIPTION.m39644a()) > 0) {
                String str2 = c41456gJ3.f81968f;
                if (view.getContentDescription() == null) {
                    valueOf2 = "";
                } else {
                    valueOf2 = String.valueOf(view.getContentDescription());
                }
                String m2837h2 = C52364yi6.m2837h(C52364yi6.m2808v0(valueOf2), "");
                if (!str2.equals(valueOf2) && !str2.equals(m2837h2)) {
                    return false;
                }
            }
            if ((c41456gJ3.f81970h & C41456gJ3.EnumC20822a.HINT.m39644a()) > 0) {
                String str3 = c41456gJ3.f81969g;
                String m22283i = C45933nr6.m22283i(view);
                String m2837h3 = C52364yi6.m2837h(C52364yi6.m2808v0(m22283i), "");
                if (!str3.equals(m22283i) && !str3.equals(m2837h3)) {
                    return false;
                }
            }
            if ((c41456gJ3.f81970h & C41456gJ3.EnumC20822a.TAG.m39644a()) > 0) {
                String str4 = c41456gJ3.f81967e;
                if (view.getTag() == null) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(view.getTag());
                }
                String m2837h4 = C52364yi6.m2837h(C52364yi6.m2808v0(valueOf), "");
                if (!str4.equals(valueOf) && !str4.equals(m2837h4)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void m84896a(C7530b c7530b, View view, C52932zg1 c52932zg1) {
            if (c52932zg1 == null) {
                return;
            }
            try {
                View m84898a = c7530b.m84898a();
                if (m84898a == null) {
                    return;
                }
                View m22291a = C45933nr6.m22291a(m84898a);
                if (m22291a != null && C45933nr6.m22276p(m84898a, m22291a)) {
                    m84893d(c7530b, view, c52932zg1);
                } else if (m84898a.getClass().getName().startsWith("com.facebook.react")) {
                } else {
                    if (!(m84898a instanceof AdapterView)) {
                        m84895b(c7530b, view, c52932zg1);
                    } else if (m84898a instanceof ListView) {
                        m84894c(c7530b, view, c52932zg1);
                    }
                }
            } catch (Exception e) {
                C52364yi6.m2854X(C35924Sl0.m84906b(), e);
            }
        }

        /* renamed from: b */
        public final void m84895b(C7530b c7530b, View view, C52932zg1 c52932zg1) {
            boolean z;
            View m84898a = c7530b.m84898a();
            if (m84898a == null) {
                return;
            }
            String m84897b = c7530b.m84897b();
            View.OnClickListener m22285g = C45933nr6.m22285g(m84898a);
            if ((m22285g instanceof C35456Ql0.View$OnClickListenerC6858b) && ((C35456Ql0.View$OnClickListenerC6858b) m22285g).m88089a()) {
                z = true;
            } else {
                z = false;
            }
            if (!this.f34217e.contains(m84897b) && !z) {
                m84898a.setOnClickListener(C35456Ql0.m88093b(c52932zg1, view, m84898a));
                this.f34217e.add(m84897b);
            }
        }

        /* renamed from: c */
        public final void m84894c(C7530b c7530b, View view, C52932zg1 c52932zg1) {
            boolean z;
            AdapterView adapterView = (AdapterView) c7530b.m84898a();
            if (adapterView == null) {
                return;
            }
            String m84897b = c7530b.m84897b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if ((onItemClickListener instanceof C35456Ql0.C6859c) && ((C35456Ql0.C6859c) onItemClickListener).m88088a()) {
                z = true;
            } else {
                z = false;
            }
            if (!this.f34217e.contains(m84897b) && !z) {
                adapterView.setOnItemClickListener(C35456Ql0.m88092c(c52932zg1, view, adapterView));
                this.f34217e.add(m84897b);
            }
        }

        /* renamed from: d */
        public final void m84893d(C7530b c7530b, View view, C52932zg1 c52932zg1) {
            boolean z;
            View m84898a = c7530b.m84898a();
            if (m84898a == null) {
                return;
            }
            String m84897b = c7530b.m84897b();
            View.OnTouchListener m22284h = C45933nr6.m22284h(m84898a);
            if ((m22284h instanceof C44102km4.View$OnTouchListenerC25231a) && ((C44102km4.View$OnTouchListenerC25231a) m22284h).m28462a()) {
                z = true;
            } else {
                z = false;
            }
            if (!this.f34217e.contains(m84897b) && !z) {
                m84898a.setOnTouchListener(C44102km4.m28463a(c52932zg1, view, m84898a));
                this.f34217e.add(m84897b);
            }
        }

        /* renamed from: e */
        public void m84892e(C52932zg1 c52932zg1, View view) {
            if (c52932zg1 != null && view != null) {
                if (!TextUtils.isEmpty(c52932zg1.m603a()) && !c52932zg1.m603a().equals(this.f34218f)) {
                    return;
                }
                List<C41456gJ3> m599e = c52932zg1.m599e();
                if (m599e.size() > 25) {
                    return;
                }
                for (C7530b c7530b : m84891f(c52932zg1, view, m599e, 0, -1, this.f34218f)) {
                    m84896a(c7530b, view, c52932zg1);
                }
            }
        }

        /* renamed from: i */
        public final void m84888i() {
            if (this.f34215c != null && this.f34214b.get() != null) {
                for (int i = 0; i < this.f34215c.size(); i++) {
                    m84892e(this.f34215c.get(i), this.f34214b.get());
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m84888i();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m84888i();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C34512Mk1 m93522j = C34746Nk1.m93522j(C17216a.m52740f());
                if (m93522j != null && m93522j.m94980b()) {
                    List<C52932zg1> m598f = C52932zg1.m598f(m93522j.m94976f());
                    this.f34215c = m598f;
                    if (m598f == null || (view = this.f34214b.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    m84888i();
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    private C35924Sl0() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m84907a(C35924Sl0 c35924Sl0) {
        if (TD0.m84203d(C35924Sl0.class)) {
            return;
        }
        try {
            c35924Sl0.m84901g();
        } catch (Throwable th) {
            TD0.m84205b(th, C35924Sl0.class);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ String m84906b() {
        if (TD0.m84203d(C35924Sl0.class)) {
            return null;
        }
        try {
            return f34204f;
        } catch (Throwable th) {
            TD0.m84205b(th, C35924Sl0.class);
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized C35924Sl0 m84903e() {
        synchronized (C35924Sl0.class) {
            if (TD0.m84203d(C35924Sl0.class)) {
                return null;
            }
            if (f34205g == null) {
                f34205g = new C35924Sl0();
            }
            return f34205g;
        }
    }

    /* renamed from: f */
    public static Bundle m84902f(C52932zg1 c52932zg1, View view, View view2) {
        List<C7530b> m84891f;
        if (TD0.m84203d(C35924Sl0.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            if (c52932zg1 == null) {
                return bundle;
            }
            List<FE3> m600d = c52932zg1.m600d();
            if (m600d != null) {
                for (FE3 fe3 : m600d) {
                    String str = fe3.f9060b;
                    if (str != null && str.length() > 0) {
                        bundle.putString(fe3.f9059a, fe3.f9060b);
                    } else if (fe3.f9061c.size() > 0) {
                        if (fe3.f9062d.equals("relative")) {
                            m84891f = ViewTreeObserver$OnGlobalLayoutListenerC7531c.m84891f(c52932zg1, view2, fe3.f9061c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            m84891f = ViewTreeObserver$OnGlobalLayoutListenerC7531c.m84891f(c52932zg1, view, fe3.f9061c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<C7530b> it = m84891f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C7530b next = it.next();
                                if (next.m84898a() != null) {
                                    String m22281k = C45933nr6.m22281k(next.m84898a());
                                    if (m22281k.length() > 0) {
                                        bundle.putString(fe3.f9059a, m22281k);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            TD0.m84205b(th, C35924Sl0.class);
            return null;
        }
    }

    /* renamed from: c */
    public void m84905c(Activity activity) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (C50820w62.m7409b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f34207b.add(activity);
                this.f34209d.clear();
                if (this.f34210e.containsKey(Integer.valueOf(activity.hashCode()))) {
                    this.f34209d = this.f34210e.get(Integer.valueOf(activity.hashCode()));
                }
                m84899i();
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: d */
    public void m84904d(Activity activity) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            this.f34210e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: g */
    public final void m84901g() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f34207b) {
                if (activity != null) {
                    this.f34208c.add(new ViewTreeObserver$OnGlobalLayoutListenerC7531c(C9155Wi.m77975e(activity), this.f34206a, this.f34209d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: h */
    public void m84900h(Activity activity) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (C50820w62.m7409b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f34207b.remove(activity);
                this.f34208c.clear();
                this.f34210e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f34209d.clone());
                this.f34209d.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: i */
    public final void m84899i() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m84901g();
            } else {
                this.f34206a.post(new RunnableC7529a());
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
