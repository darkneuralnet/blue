package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import co.bird.android.model.Detail;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: QT2 */
/* loaded from: classes5.dex */
public final class QT2 implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: f */
    public static final Map<Integer, QT2> f30417f = new HashMap();

    /* renamed from: d */
    public WeakReference<Activity> f30420d;

    /* renamed from: b */
    public final Set<String> f30418b = new HashSet();

    /* renamed from: c */
    public final Handler f30419c = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public AtomicBoolean f30421e = new AtomicBoolean(false);

    /* renamed from: QT2$a */
    /* loaded from: classes5.dex */
    public class RunnableC6781a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f30422b;

        public RunnableC6781a(View view) {
            this.f30422b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                View view = this.f30422b;
                if (!(view instanceof EditText)) {
                    return;
                }
                QT2.m88489a(QT2.this, view);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    public QT2(Activity activity) {
        this.f30420d = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static /* synthetic */ void m88489a(QT2 qt2, View view) {
        if (TD0.m84203d(QT2.class)) {
            return;
        }
        try {
            qt2.m88486d(view);
        } catch (Throwable th) {
            TD0.m84205b(th, QT2.class);
        }
    }

    /* renamed from: b */
    public static String m88488b(String str, String str2) {
        if (TD0.m84203d(QT2.class)) {
            return null;
        }
        try {
            if ("r2".equals(str)) {
                return str2.replaceAll("[^\\d.]", "");
            }
            return str2;
        } catch (Throwable th) {
            TD0.m84205b(th, QT2.class);
            return null;
        }
    }

    /* renamed from: e */
    public static void m88485e(Map<String, String> map, String str, String str2) {
        char c;
        if (TD0.m84203d(QT2.class)) {
            return;
        }
        try {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3586:
                    if (str.equals("r4")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3587:
                    if (str.equals("r5")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3588:
                    if (str.equals("r6")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1 && c != 2) {
                    if (c == 3 && str2.contains(Detail.EMPTY_CHAR)) {
                        str2 = str2.split(Detail.EMPTY_CHAR)[0];
                    }
                } else {
                    str2 = str2.replaceAll("[^a-z]+", "");
                }
            } else {
                if (!str2.startsWith("m") && !str2.startsWith("b") && !str2.startsWith("ge")) {
                    str2 = "f";
                }
                str2 = "m";
            }
            map.put(str, str2);
        } catch (Throwable th) {
            TD0.m84205b(th, QT2.class);
        }
    }

    /* renamed from: h */
    public static void m88482h(Activity activity) {
        QT2 qt2;
        if (TD0.m84203d(QT2.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, QT2> map = f30417f;
            if (!map.containsKey(Integer.valueOf(hashCode))) {
                qt2 = new QT2(activity);
                map.put(Integer.valueOf(activity.hashCode()), qt2);
            } else {
                qt2 = map.get(Integer.valueOf(hashCode));
            }
            qt2.m88483g();
        } catch (Throwable th) {
            TD0.m84205b(th, QT2.class);
        }
    }

    /* renamed from: c */
    public final void m88487c(View view) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m88484f(new RunnableC6781a(view));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: d */
    public final void m88486d(View view) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
            if (!lowerCase.isEmpty() && !this.f30418b.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f30418b.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> m92250b = OT2.m92250b(view);
                List<String> list = null;
                for (PT2 pt2 : PT2.m90213e()) {
                    String m88488b = m88488b(pt2.m90214d(), lowerCase);
                    if (pt2.m90212f().isEmpty() || OT2.m92246f(m88488b, pt2.m90212f())) {
                        if (OT2.m92247e(m92250b, pt2.m90215c())) {
                            m88485e(hashMap, pt2.m90214d(), m88488b);
                        } else {
                            if (list == null) {
                                list = OT2.m92251a(view);
                            }
                            if (OT2.m92247e(list, pt2.m90215c())) {
                                m88485e(hashMap, pt2.m90214d(), m88488b);
                            }
                        }
                    }
                }
                C45485n62.m24334l(hashMap);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: f */
    public final void m88484f(Runnable runnable) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f30419c.post(runnable);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: g */
    public final void m88483g() {
        View m77975e;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (this.f30421e.getAndSet(true) || (m77975e = C9155Wi.m77975e(this.f30420d.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m77975e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (TD0.m84203d(this)) {
            return;
        }
        if (view != null) {
            try {
                m88487c(view);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
                return;
            }
        }
        if (view2 != null) {
            m88487c(view2);
        }
    }
}
