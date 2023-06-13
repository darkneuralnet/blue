package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC10999c;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.app.C11002d;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000.AbstractC2614G2;
/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public abstract class AbstractC10999c {

    /* renamed from: b */
    public static C11002d.ExecutorC11003a f51706b = new C11002d.ExecutorC11003a(new C11002d.ExecutorC11004b());

    /* renamed from: c */
    public static int f51707c = -100;

    /* renamed from: d */
    public static C50711vv2 f51708d = null;

    /* renamed from: e */
    public static C50711vv2 f51709e = null;

    /* renamed from: f */
    public static Boolean f51710f = null;

    /* renamed from: g */
    public static boolean f51711g = false;

    /* renamed from: h */
    public static final C30704yo<WeakReference<AbstractC10999c>> f51712h = new C30704yo<>();

    /* renamed from: i */
    public static final Object f51713i = new Object();

    /* renamed from: j */
    public static final Object f51714j = new Object();

    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    public static class C11000a {
        private C11000a() {
        }

        /* renamed from: a */
        public static LocaleList m70264a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: androidx.appcompat.app.c$b */
    /* loaded from: classes.dex */
    public static class C11001b {
        private C11001b() {
        }

        /* renamed from: a */
        public static LocaleList m70263a(Object obj) {
            LocaleList applicationLocales;
            applicationLocales = C20089ei.m42616a(obj).getApplicationLocales();
            return applicationLocales;
        }

        /* renamed from: b */
        public static void m70262b(Object obj, LocaleList localeList) {
            C20089ei.m42616a(obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: I */
    public static void m70282I(AbstractC10999c abstractC10999c) {
        synchronized (f51713i) {
            m70281J(abstractC10999c);
        }
    }

    /* renamed from: J */
    public static void m70281J(AbstractC10999c abstractC10999c) {
        synchronized (f51713i) {
            Iterator<WeakReference<AbstractC10999c>> it = f51712h.iterator();
            while (it.hasNext()) {
                AbstractC10999c abstractC10999c2 = it.next().get();
                if (abstractC10999c2 == abstractC10999c || abstractC10999c2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: O */
    public static void m70280O(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f51707c != i) {
            f51707c = i;
            m70275g();
        }
    }

    /* renamed from: U */
    public static void m70278U(final Context context) {
        if (!m70266y(context)) {
            return;
        }
        if (T30.m84398c()) {
            if (!f51711g) {
                f51706b.execute(new Runnable() { // from class: di
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC10999c.m70265z(context);
                    }
                });
                return;
            }
            return;
        }
        synchronized (f51714j) {
            C50711vv2 c50711vv2 = f51708d;
            if (c50711vv2 == null) {
                if (f51709e == null) {
                    f51709e = C50711vv2.m7772b(C11002d.m70260b(context));
                }
                if (f51709e.m7767g()) {
                    return;
                }
                f51708d = f51709e;
            } else if (!c50711vv2.equals(f51709e)) {
                C50711vv2 c50711vv22 = f51708d;
                f51709e = c50711vv22;
                C11002d.m70261a(context, c50711vv22.m7765i());
            }
        }
    }

    /* renamed from: d */
    public static void m70276d(AbstractC10999c abstractC10999c) {
        synchronized (f51713i) {
            m70281J(abstractC10999c);
            f51712h.add(new WeakReference<>(abstractC10999c));
        }
    }

    /* renamed from: g */
    public static void m70275g() {
        synchronized (f51713i) {
            Iterator<WeakReference<AbstractC10999c>> it = f51712h.iterator();
            while (it.hasNext()) {
                AbstractC10999c abstractC10999c = it.next().get();
                if (abstractC10999c != null) {
                    abstractC10999c.mo28597f();
                }
            }
        }
    }

    /* renamed from: j */
    public static AbstractC10999c m70273j(Activity activity, InterfaceC10819ai interfaceC10819ai) {
        return new AppCompatDelegateImpl(activity, interfaceC10819ai);
    }

    /* renamed from: k */
    public static AbstractC10999c m70272k(Dialog dialog, InterfaceC10819ai interfaceC10819ai) {
        return new AppCompatDelegateImpl(dialog, interfaceC10819ai);
    }

    /* renamed from: n */
    public static C50711vv2 m70271n() {
        if (T30.m84398c()) {
            Object m70268s = m70268s();
            if (m70268s != null) {
                return C50711vv2.m7764j(C11001b.m70263a(m70268s));
            }
        } else {
            C50711vv2 c50711vv2 = f51708d;
            if (c50711vv2 != null) {
                return c50711vv2;
            }
        }
        return C50711vv2.m7768f();
    }

    /* renamed from: p */
    public static int m70269p() {
        return f51707c;
    }

    /* renamed from: s */
    public static Object m70268s() {
        Context mo70270o;
        Iterator<WeakReference<AbstractC10999c>> it = f51712h.iterator();
        while (it.hasNext()) {
            AbstractC10999c abstractC10999c = it.next().get();
            if (abstractC10999c != null && (mo70270o = abstractC10999c.mo70270o()) != null) {
                return mo70270o.getSystemService("locale");
            }
        }
        return null;
    }

    /* renamed from: u */
    public static C50711vv2 m70267u() {
        return f51708d;
    }

    /* renamed from: y */
    public static boolean m70266y(Context context) {
        if (f51710f == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.m70322a(context).metaData;
                if (bundle != null) {
                    f51710f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f51710f = Boolean.FALSE;
            }
        }
        return f51710f.booleanValue();
    }

    /* renamed from: z */
    public static /* synthetic */ void m70265z(Context context) {
        C11002d.m70259c(context);
        f51711g = true;
    }

    /* renamed from: A */
    public abstract void mo28615A(Configuration configuration);

    /* renamed from: B */
    public abstract void mo28614B(Bundle bundle);

    /* renamed from: C */
    public abstract void mo28613C();

    /* renamed from: D */
    public abstract void mo28612D(Bundle bundle);

    /* renamed from: E */
    public abstract void mo28611E();

    /* renamed from: F */
    public abstract void mo28610F(Bundle bundle);

    /* renamed from: G */
    public abstract void mo28609G();

    /* renamed from: H */
    public abstract void mo28608H();

    /* renamed from: K */
    public abstract boolean mo28607K(int i);

    /* renamed from: L */
    public abstract void mo28606L(int i);

    /* renamed from: M */
    public abstract void mo28605M(View view);

    /* renamed from: N */
    public abstract void mo28604N(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: P */
    public void mo70279P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: Q */
    public abstract void mo28603Q(Toolbar toolbar);

    /* renamed from: R */
    public void mo28602R(int i) {
    }

    /* renamed from: S */
    public abstract void mo28601S(CharSequence charSequence);

    /* renamed from: T */
    public abstract AbstractC2614G2 mo28600T(AbstractC2614G2.InterfaceC2615a interfaceC2615a);

    /* renamed from: e */
    public abstract void mo28598e(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: f */
    public abstract boolean mo28597f();

    @Deprecated
    /* renamed from: h */
    public void m70274h(Context context) {
    }

    /* renamed from: i */
    public Context mo28596i(Context context) {
        m70274h(context);
        return context;
    }

    /* renamed from: l */
    public abstract View mo28595l(View view, String str, Context context, AttributeSet attributeSet);

    /* renamed from: m */
    public abstract <T extends View> T mo28594m(int i);

    /* renamed from: o */
    public Context mo70270o() {
        return null;
    }

    /* renamed from: q */
    public abstract C10990a.InterfaceC10992b mo28593q();

    /* renamed from: r */
    public int mo28592r() {
        return -100;
    }

    /* renamed from: t */
    public abstract MenuInflater mo28591t();

    /* renamed from: v */
    public abstract ActionBar mo28590v();

    /* renamed from: w */
    public abstract void mo28589w();

    /* renamed from: x */
    public abstract void mo28588x();
}
