package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.C10990a;
import androidx.appcompat.view.menu.C11025c;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.AbstractC11719f;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.time.DurationKt;
import org.xmlpull.v1.XmlPullParser;
import p000.AbstractC2614G2;
import p000.C37991aV5;
import p000.C43487jk2;
import p000.C49785uM4;
/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends AbstractC10999c implements C11028e.InterfaceC11029a, LayoutInflater.Factory2 {

    /* renamed from: E0 */
    public static final NA5<String, Integer> f51583E0 = new NA5<>();

    /* renamed from: F0 */
    public static final boolean f51584F0 = false;

    /* renamed from: G0 */
    public static final int[] f51585G0 = {16842836};

    /* renamed from: H0 */
    public static final boolean f51586H0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: I0 */
    public static final boolean f51587I0 = true;

    /* renamed from: A */
    public boolean f51588A;

    /* renamed from: A0 */
    public C5345Mi f51589A0;

    /* renamed from: B */
    public boolean f51590B;

    /* renamed from: B0 */
    public C49436tm2 f51591B0;

    /* renamed from: C */
    public ViewGroup f51592C;

    /* renamed from: C0 */
    public OnBackInvokedDispatcher f51593C0;

    /* renamed from: D */
    public TextView f51594D;

    /* renamed from: D0 */
    public OnBackInvokedCallback f51595D0;

    /* renamed from: E */
    public View f51596E;

    /* renamed from: F */
    public boolean f51597F;

    /* renamed from: G */
    public boolean f51598G;

    /* renamed from: H */
    public boolean f51599H;

    /* renamed from: I */
    public boolean f51600I;

    /* renamed from: J */
    public boolean f51601J;

    /* renamed from: K */
    public boolean f51602K;

    /* renamed from: P */
    public boolean f51603P;

    /* renamed from: Q */
    public boolean f51604Q;

    /* renamed from: R */
    public PanelFeatureState[] f51605R;

    /* renamed from: S */
    public PanelFeatureState f51606S;

    /* renamed from: T */
    public boolean f51607T;

    /* renamed from: U */
    public boolean f51608U;

    /* renamed from: W */
    public boolean f51609W;

    /* renamed from: X */
    public boolean f51610X;

    /* renamed from: Y */
    public Configuration f51611Y;

    /* renamed from: Z */
    public int f51612Z;

    /* renamed from: k */
    public final Object f51613k;

    /* renamed from: l */
    public final Context f51614l;

    /* renamed from: m */
    public Window f51615m;

    /* renamed from: n */
    public C10981o f51616n;

    /* renamed from: o */
    public final InterfaceC10819ai f51617o;

    /* renamed from: p */
    public ActionBar f51618p;

    /* renamed from: p0 */
    public int f51619p0;

    /* renamed from: q */
    public MenuInflater f51620q;

    /* renamed from: q0 */
    public int f51621q0;

    /* renamed from: r */
    public CharSequence f51622r;

    /* renamed from: r0 */
    public boolean f51623r0;

    /* renamed from: s */
    public IV0 f51624s;

    /* renamed from: s0 */
    public AbstractC10983q f51625s0;

    /* renamed from: t */
    public C10973h f51626t;

    /* renamed from: t0 */
    public AbstractC10983q f51627t0;

    /* renamed from: u */
    public C10988u f51628u;

    /* renamed from: u0 */
    public boolean f51629u0;

    /* renamed from: v */
    public AbstractC2614G2 f51630v;

    /* renamed from: v0 */
    public int f51631v0;

    /* renamed from: w */
    public ActionBarContextView f51632w;

    /* renamed from: w0 */
    public final Runnable f51633w0;

    /* renamed from: x */
    public PopupWindow f51634x;

    /* renamed from: x0 */
    public boolean f51635x0;

    /* renamed from: y */
    public Runnable f51636y;

    /* renamed from: y0 */
    public Rect f51637y0;

    /* renamed from: z */
    public C34823Ns6 f51638z;

    /* renamed from: z0 */
    public Rect f51639z0;

    /* loaded from: classes.dex */
    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f51640a;

        /* renamed from: b */
        public int f51641b;

        /* renamed from: c */
        public int f51642c;

        /* renamed from: d */
        public int f51643d;

        /* renamed from: e */
        public int f51644e;

        /* renamed from: f */
        public int f51645f;

        /* renamed from: g */
        public ViewGroup f51646g;

        /* renamed from: h */
        public View f51647h;

        /* renamed from: i */
        public View f51648i;

        /* renamed from: j */
        public C11028e f51649j;

        /* renamed from: k */
        public C11025c f51650k;

        /* renamed from: l */
        public Context f51651l;

        /* renamed from: m */
        public boolean f51652m;

        /* renamed from: n */
        public boolean f51653n;

        /* renamed from: o */
        public boolean f51654o;

        /* renamed from: p */
        public boolean f51655p;

        /* renamed from: q */
        public boolean f51656q = false;

        /* renamed from: r */
        public boolean f51657r;

        /* renamed from: s */
        public Bundle f51658s;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C10964a();

            /* renamed from: b */
            public int f51659b;

            /* renamed from: c */
            public boolean f51660c;

            /* renamed from: d */
            public Bundle f51661d;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            /* loaded from: classes.dex */
            public class C10964a implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m70356a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m70356a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            /* renamed from: a */
            public static SavedState m70356a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f51659b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f51660c = z;
                if (z) {
                    savedState.f51661d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f51659b);
                parcel.writeInt(this.f51660c ? 1 : 0);
                if (this.f51660c) {
                    parcel.writeBundle(this.f51661d);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f51640a = i;
        }

        /* renamed from: a */
        public InterfaceC11039j m70360a(InterfaceC11037i.InterfaceC11038a interfaceC11038a) {
            if (this.f51649j == null) {
                return null;
            }
            if (this.f51650k == null) {
                C11025c c11025c = new C11025c(this.f51651l, C32643Ek4.abc_list_menu_item_layout);
                this.f51650k = c11025c;
                c11025c.mo70079j(interfaceC11038a);
                this.f51649j.m70150b(this.f51650k);
            }
            return this.f51650k.m70182c(this.f51646g);
        }

        /* renamed from: b */
        public boolean m70359b() {
            if (this.f51647h == null) {
                return false;
            }
            if (this.f51648i == null && this.f51650k.m70183a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public void m70358c(C11028e c11028e) {
            C11025c c11025c;
            C11028e c11028e2 = this.f51649j;
            if (c11028e == c11028e2) {
                return;
            }
            if (c11028e2 != null) {
                c11028e2.m70161Q(this.f51650k);
            }
            this.f51649j = c11028e;
            if (c11028e != null && (c11025c = this.f51650k) != null) {
                c11028e.m70150b(c11025c);
            }
        }

        /* renamed from: d */
        public void m70357d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C50553vf4.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C50553vf4.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C33588Il4.Theme_AppCompat_CompactMenu, true);
            }
            C37806aB0 c37806aB0 = new C37806aB0(context, 0);
            c37806aB0.getTheme().setTo(newTheme);
            this.f51651l = c37806aB0;
            TypedArray obtainStyledAttributes = c37806aB0.obtainStyledAttributes(C43509jm4.AppCompatTheme);
            this.f51641b = obtainStyledAttributes.getResourceId(C43509jm4.AppCompatTheme_panelBackground, 0);
            this.f51645f = obtainStyledAttributes.getResourceId(C43509jm4.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    /* loaded from: classes.dex */
    public class RunnableC10965a implements Runnable {
        public RunnableC10965a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f51631v0 & 1) != 0) {
                appCompatDelegateImpl.m70376k0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f51631v0 & 4096) != 0) {
                appCompatDelegateImpl2.m70376k0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f51629u0 = false;
            appCompatDelegateImpl3.f51631v0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    /* loaded from: classes.dex */
    public class C10966b implements InterfaceC36332Ue3 {
        public C10966b() {
        }

        @Override // p000.InterfaceC36332Ue3
        /* renamed from: a */
        public DB6 mo7930a(View view, DB6 db6) {
            int m110777m = db6.m110777m();
            int m70381g1 = AppCompatDelegateImpl.this.m70381g1(db6, null);
            if (m110777m != m70381g1) {
                db6 = db6.m110771s(db6.m110779k(), m70381g1, db6.m110778l(), db6.m110780j());
            }
            return C38790bq6.m62480h0(view, db6);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    /* loaded from: classes.dex */
    public class C10967c implements ContentFrameLayout.InterfaceC11087a {
        public C10967c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC11087a
        /* renamed from: a */
        public void mo69907a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC11087a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m70378i0();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    /* loaded from: classes.dex */
    public class RunnableC10968d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        /* loaded from: classes.dex */
        public class C10969a extends C35525Qs6 {
            public C10969a() {
            }

            @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
            /* renamed from: b */
            public void mo4254b(View view) {
                AppCompatDelegateImpl.this.f51632w.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f51638z.m93242h(null);
                AppCompatDelegateImpl.this.f51638z = null;
            }

            @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
            /* renamed from: c */
            public void mo4253c(View view) {
                AppCompatDelegateImpl.this.f51632w.setVisibility(0);
            }
        }

        public RunnableC10968d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f51634x.showAtLocation(appCompatDelegateImpl.f51632w, 55, 0, 0);
            AppCompatDelegateImpl.this.m70375l0();
            if (AppCompatDelegateImpl.this.m70401W0()) {
                AppCompatDelegateImpl.this.f51632w.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f51638z = C38790bq6.m62490e(appCompatDelegateImpl2.f51632w).m93248b(1.0f);
                AppCompatDelegateImpl.this.f51638z.m93242h(new C10969a());
                return;
            }
            AppCompatDelegateImpl.this.f51632w.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f51632w.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    /* loaded from: classes.dex */
    public class C10970e extends C35525Qs6 {
        public C10970e() {
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            AppCompatDelegateImpl.this.f51632w.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f51638z.m93242h(null);
            AppCompatDelegateImpl.this.f51638z = null;
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AppCompatDelegateImpl.this.f51632w.setVisibility(0);
            if (AppCompatDelegateImpl.this.f51632w.getParent() instanceof View) {
                C38790bq6.m62458s0((View) AppCompatDelegateImpl.this.f51632w.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    /* loaded from: classes.dex */
    public class C10971f implements C10990a.InterfaceC10992b {
        public C10971f() {
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: a */
        public Context mo70308a() {
            return AppCompatDelegateImpl.this.m70370q0();
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: b */
        public boolean mo70307b() {
            ActionBar mo28590v = AppCompatDelegateImpl.this.mo28590v();
            if (mo28590v != null && (mo28590v.mo70220j() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: c */
        public Drawable mo70306c() {
            Z46 m73748u = Z46.m73748u(mo70308a(), null, new int[]{C50553vf4.homeAsUpIndicator});
            Drawable m73762g = m73748u.m73762g(0);
            m73748u.m73746w();
            return m73762g;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: d */
        public void mo70305d(Drawable drawable, int i) {
            ActionBar mo28590v = AppCompatDelegateImpl.this.mo28590v();
            if (mo28590v != null) {
                mo28590v.mo70246A(drawable);
                mo28590v.mo70209y(i);
            }
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: e */
        public void mo70304e(int i) {
            ActionBar mo28590v = AppCompatDelegateImpl.this.mo28590v();
            if (mo28590v != null) {
                mo28590v.mo70209y(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    /* loaded from: classes.dex */
    public interface InterfaceC10972g {
        /* renamed from: a */
        boolean mo70247a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    /* loaded from: classes.dex */
    public final class C10973h implements InterfaceC11037i.InterfaceC11038a {
        public C10973h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: b */
        public void mo69982b(C11028e c11028e, boolean z) {
            AppCompatDelegateImpl.this.m70390c0(c11028e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: c */
        public boolean mo69981c(C11028e c11028e) {
            Window.Callback m70363x0 = AppCompatDelegateImpl.this.m70363x0();
            if (m70363x0 != null) {
                m70363x0.onMenuOpened(108, c11028e);
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    /* loaded from: classes.dex */
    public class C10974i implements AbstractC2614G2.InterfaceC2615a {

        /* renamed from: a */
        public AbstractC2614G2.InterfaceC2615a f51670a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        /* loaded from: classes.dex */
        public class C10975a extends C35525Qs6 {
            public C10975a() {
            }

            @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
            /* renamed from: b */
            public void mo4254b(View view) {
                AppCompatDelegateImpl.this.f51632w.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f51634x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f51632w.getParent() instanceof View) {
                    C38790bq6.m62458s0((View) AppCompatDelegateImpl.this.f51632w.getParent());
                }
                AppCompatDelegateImpl.this.f51632w.m70058m();
                AppCompatDelegateImpl.this.f51638z.m93242h(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f51638z = null;
                C38790bq6.m62458s0(appCompatDelegateImpl2.f51592C);
            }
        }

        public C10974i(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
            this.f51670a = interfaceC2615a;
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: a */
        public boolean mo70352a(AbstractC2614G2 abstractC2614G2, MenuItem menuItem) {
            return this.f51670a.mo70352a(abstractC2614G2, menuItem);
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: b */
        public void mo70351b(AbstractC2614G2 abstractC2614G2) {
            this.f51670a.mo70351b(abstractC2614G2);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f51634x != null) {
                appCompatDelegateImpl.f51615m.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f51636y);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f51632w != null) {
                appCompatDelegateImpl2.m70375l0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f51638z = C38790bq6.m62490e(appCompatDelegateImpl3.f51632w).m93248b(0.0f);
                AppCompatDelegateImpl.this.f51638z.m93242h(new C10975a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            InterfaceC10819ai interfaceC10819ai = appCompatDelegateImpl4.f51617o;
            if (interfaceC10819ai != null) {
                interfaceC10819ai.onSupportActionModeFinished(appCompatDelegateImpl4.f51630v);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f51630v = null;
            C38790bq6.m62458s0(appCompatDelegateImpl5.f51592C);
            AppCompatDelegateImpl.this.m70385e1();
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: c */
        public boolean mo70350c(AbstractC2614G2 abstractC2614G2, Menu menu) {
            return this.f51670a.mo70350c(abstractC2614G2, menu);
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: d */
        public boolean mo70349d(AbstractC2614G2 abstractC2614G2, Menu menu) {
            C38790bq6.m62458s0(AppCompatDelegateImpl.this.f51592C);
            return this.f51670a.mo70349d(abstractC2614G2, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    /* loaded from: classes.dex */
    public static class C10976j {
        private C10976j() {
        }

        /* renamed from: a */
        public static Context m70348a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m70347b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        /* renamed from: c */
        public static void m70346c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: d */
        public static void m70345d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    /* loaded from: classes.dex */
    public static class C10977k {
        private C10977k() {
        }

        /* renamed from: a */
        public static boolean m70344a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: b */
        public static String m70343b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    /* loaded from: classes.dex */
    public static class C10978l {
        private C10978l() {
        }

        /* renamed from: a */
        public static void m70342a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        /* renamed from: b */
        public static C50711vv2 m70341b(Configuration configuration) {
            return C50711vv2.m7772b(configuration.getLocales().toLanguageTags());
        }

        /* renamed from: c */
        public static void m70340c(C50711vv2 c50711vv2) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c50711vv2.m7765i()));
        }

        /* renamed from: d */
        public static void m70339d(Configuration configuration, C50711vv2 c50711vv2) {
            configuration.setLocales(LocaleList.forLanguageTags(c50711vv2.m7765i()));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    /* loaded from: classes.dex */
    public static class C10979m {
        private C10979m() {
        }

        /* renamed from: a */
        public static void m70338a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = i7 | (i8 & 3);
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    /* loaded from: classes.dex */
    public static class C10980n {
        private C10980n() {
        }

        /* renamed from: a */
        public static OnBackInvokedDispatcher m70337a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        /* renamed from: b */
        public static OnBackInvokedCallback m70336b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: ji
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.m70420F0();
                }
            };
            C36800We3.m78054a(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* renamed from: c */
        public static void m70335c(Object obj, Object obj2) {
            C36800We3.m78054a(obj).unregisterOnBackInvokedCallback(C37034Xe3.m76742a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    /* loaded from: classes.dex */
    public class C10981o extends Window$CallbackC41980hB6 {

        /* renamed from: c */
        public InterfaceC10972g f51673c;

        /* renamed from: d */
        public boolean f51674d;

        /* renamed from: e */
        public boolean f51675e;

        /* renamed from: f */
        public boolean f51676f;

        public C10981o(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        public boolean m70334b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f51675e = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f51675e = false;
            }
        }

        /* renamed from: c */
        public void m70333c(Window.Callback callback) {
            try {
                this.f51674d = true;
                callback.onContentChanged();
            } finally {
                this.f51674d = false;
            }
        }

        /* renamed from: d */
        public void m70332d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f51676f = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f51676f = false;
            }
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f51675e) {
                return m36634a().dispatchKeyEvent(keyEvent);
            }
            if (!AppCompatDelegateImpl.this.m70377j0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !AppCompatDelegateImpl.this.m70417I0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public void m70331e(InterfaceC10972g interfaceC10972g) {
            this.f51673c = interfaceC10972g;
        }

        /* renamed from: f */
        public final ActionMode m70330f(ActionMode.Callback callback) {
            C37991aV5.C10726a c10726a = new C37991aV5.C10726a(AppCompatDelegateImpl.this.f51614l, callback);
            AbstractC2614G2 mo28600T = AppCompatDelegateImpl.this.mo28600T(c10726a);
            if (mo28600T != null) {
                return c10726a.m71276e(mo28600T);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f51674d) {
                m36634a().onContentChanged();
            }
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i == 0 && !(menu instanceof C11028e)) {
                return false;
            }
            return super.onCreatePanelMenu(i, menu);
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            InterfaceC10972g interfaceC10972g = this.f51673c;
            if (interfaceC10972g != null && (onCreatePanelView = interfaceC10972g.onCreatePanelView(i)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i);
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.m70414L0(i);
            return true;
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f51676f) {
                m36634a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.m70413M0(i);
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C11028e c11028e;
            if (menu instanceof C11028e) {
                c11028e = (C11028e) menu;
            } else {
                c11028e = null;
            }
            if (i == 0 && c11028e == null) {
                return false;
            }
            boolean z = true;
            if (c11028e != null) {
                c11028e.m70143e0(true);
            }
            InterfaceC10972g interfaceC10972g = this.f51673c;
            if (interfaceC10972g == null || !interfaceC10972g.mo70247a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (c11028e != null) {
                c11028e.m70143e0(false);
            }
            return z;
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C11028e c11028e;
            PanelFeatureState m70365v0 = AppCompatDelegateImpl.this.m70365v0(0, true);
            if (m70365v0 != null && (c11028e = m70365v0.f51649j) != null) {
                super.onProvideKeyboardShortcuts(list, c11028e, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // p000.Window$CallbackC41980hB6, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (AppCompatDelegateImpl.this.m70422D0() && i == 0) {
                return m70330f(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    /* loaded from: classes.dex */
    public class C10982p extends AbstractC10983q {

        /* renamed from: c */
        public final PowerManager f51678c;

        public C10982p(Context context) {
            super();
            this.f51678c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC10983q
        /* renamed from: b */
        public IntentFilter mo70327b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC10983q
        /* renamed from: c */
        public int mo70326c() {
            return C10977k.m70344a(this.f51678c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC10983q
        /* renamed from: d */
        public void mo70325d() {
            AppCompatDelegateImpl.this.mo28597f();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    /* loaded from: classes.dex */
    public abstract class AbstractC10983q {

        /* renamed from: a */
        public BroadcastReceiver f51680a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q$a */
        /* loaded from: classes.dex */
        public class C10984a extends BroadcastReceiver {
            public C10984a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC10983q.this.mo70325d();
            }
        }

        public AbstractC10983q() {
        }

        /* renamed from: a */
        public void m70329a() {
            BroadcastReceiver broadcastReceiver = this.f51680a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f51614l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f51680a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo70327b();

        /* renamed from: c */
        public abstract int mo70326c();

        /* renamed from: d */
        public abstract void mo70325d();

        /* renamed from: e */
        public void m70328e() {
            m70329a();
            IntentFilter mo70327b = mo70327b();
            if (mo70327b != null && mo70327b.countActions() != 0) {
                if (this.f51680a == null) {
                    this.f51680a = new C10984a();
                }
                AppCompatDelegateImpl.this.f51614l.registerReceiver(this.f51680a, mo70327b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    /* loaded from: classes.dex */
    public class C10985r extends AbstractC10983q {

        /* renamed from: c */
        public final C50515vb6 f51683c;

        public C10985r(C50515vb6 c50515vb6) {
            super();
            this.f51683c = c50515vb6;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC10983q
        /* renamed from: b */
        public IntentFilter mo70327b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC10983q
        /* renamed from: c */
        public int mo70326c() {
            return this.f51683c.m8389d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC10983q
        /* renamed from: d */
        public void mo70325d() {
            AppCompatDelegateImpl.this.mo28597f();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    /* loaded from: classes.dex */
    public static class C10986s {
        private C10986s() {
        }

        /* renamed from: a */
        public static void m70324a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$t */
    /* loaded from: classes.dex */
    public class C10987t extends ContentFrameLayout {
        public C10987t(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImpl.this.m70377j0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public final boolean m70323g(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m70323g((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.m70386e0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C29611vi.m8248b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$u */
    /* loaded from: classes.dex */
    public final class C10988u implements InterfaceC11037i.InterfaceC11038a {
        public C10988u() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: b */
        public void mo69982b(C11028e c11028e, boolean z) {
            boolean z2;
            C11028e mo70078F = c11028e.mo70078F();
            if (mo70078F != c11028e) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                c11028e = mo70078F;
            }
            PanelFeatureState m70372o0 = appCompatDelegateImpl.m70372o0(c11028e);
            if (m70372o0 != null) {
                if (z2) {
                    AppCompatDelegateImpl.this.m70392b0(m70372o0.f51640a, m70372o0, mo70078F);
                    AppCompatDelegateImpl.this.m70384f0(m70372o0, true);
                    return;
                }
                AppCompatDelegateImpl.this.m70384f0(m70372o0, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: c */
        public boolean mo69981c(C11028e c11028e) {
            Window.Callback m70363x0;
            if (c11028e == c11028e.mo70078F()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f51599H && (m70363x0 = appCompatDelegateImpl.m70363x0()) != null && !AppCompatDelegateImpl.this.f51610X) {
                    m70363x0.onMenuOpened(108, c11028e);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, InterfaceC10819ai interfaceC10819ai) {
        this(activity, null, interfaceC10819ai, activity);
    }

    /* renamed from: p0 */
    public static Configuration m70371p0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            C10978l.m70342a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C10979m.m70338a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C10976j.m70347b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: A */
    public void mo28615A(Configuration configuration) {
        ActionBar mo28590v;
        if (this.f51599H && this.f51590B && (mo28590v = mo28590v()) != null) {
            mo28590v.mo70217n(configuration);
        }
        C27043oi.m20611b().m20606g(this.f51614l);
        this.f51611Y = new Configuration(this.f51614l.getResources().getConfiguration());
        m70402W(false, false);
    }

    /* renamed from: A0 */
    public final boolean m70425A0(PanelFeatureState panelFeatureState) {
        panelFeatureState.m70357d(m70370q0());
        panelFeatureState.f51646g = new C10987t(panelFeatureState.f51651l);
        panelFeatureState.f51642c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: B */
    public void mo28614B(Bundle bundle) {
        String str;
        this.f51608U = true;
        m70404V(false);
        m70373n0();
        Object obj = this.f51613k;
        if (obj instanceof Activity) {
            try {
                str = XY2.m76865c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar m70410P0 = m70410P0();
                if (m70410P0 == null) {
                    this.f51635x0 = true;
                } else {
                    m70410P0.mo70213u(true);
                }
            }
            AbstractC10999c.m70276d(this);
        }
        this.f51611Y = new Configuration(this.f51614l.getResources().getConfiguration());
        this.f51609W = true;
    }

    /* renamed from: B0 */
    public final boolean m70424B0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f51614l;
        int i = panelFeatureState.f51640a;
        if ((i == 0 || i == 108) && this.f51624s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C50553vf4.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C50553vf4.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(C50553vf4.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C37806aB0 c37806aB0 = new C37806aB0(context, 0);
                c37806aB0.getTheme().setTo(theme);
                context = c37806aB0;
            }
        }
        C11028e c11028e = new C11028e(context);
        c11028e.mo70074V(this);
        panelFeatureState.m70358c(c11028e);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo28613C() {
        ActionBar actionBar;
        if (this.f51613k instanceof Activity) {
            AbstractC10999c.m70282I(this);
        }
        if (this.f51629u0) {
            this.f51615m.getDecorView().removeCallbacks(this.f51633w0);
        }
        this.f51610X = true;
        if (this.f51612Z != -100) {
            Object obj = this.f51613k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f51583E0.put(this.f51613k.getClass().getName(), Integer.valueOf(this.f51612Z));
                actionBar = this.f51618p;
                if (actionBar != null) {
                    actionBar.mo70250o();
                }
                m70388d0();
            }
        }
        f51583E0.remove(this.f51613k.getClass().getName());
        actionBar = this.f51618p;
        if (actionBar != null) {
        }
        m70388d0();
    }

    /* renamed from: C0 */
    public final void m70423C0(int i) {
        this.f51631v0 = (1 << i) | this.f51631v0;
        if (!this.f51629u0) {
            C38790bq6.m62468n0(this.f51615m.getDecorView(), this.f51633w0);
            this.f51629u0 = true;
        }
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: D */
    public void mo28612D(Bundle bundle) {
        m70374m0();
    }

    /* renamed from: D0 */
    public boolean m70422D0() {
        return this.f51588A;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: E */
    public void mo28611E() {
        ActionBar mo28590v = mo28590v();
        if (mo28590v != null) {
            mo28590v.mo70244C(true);
        }
    }

    /* renamed from: E0 */
    public int m70421E0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        return m70368s0(context).mo70326c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return m70367t0(context).mo70326c();
            }
        }
        return i;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: F */
    public void mo28610F(Bundle bundle) {
    }

    /* renamed from: F0 */
    public boolean m70420F0() {
        boolean z = this.f51607T;
        this.f51607T = false;
        PanelFeatureState m70365v0 = m70365v0(0, false);
        if (m70365v0 != null && m70365v0.f51654o) {
            if (!z) {
                m70384f0(m70365v0, true);
            }
            return true;
        }
        AbstractC2614G2 abstractC2614G2 = this.f51630v;
        if (abstractC2614G2 != null) {
            abstractC2614G2.mo17560c();
            return true;
        }
        ActionBar mo28590v = mo28590v();
        if (mo28590v == null || !mo28590v.mo70222h()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: G */
    public void mo28609G() {
        m70402W(true, false);
    }

    /* renamed from: G0 */
    public boolean m70419G0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i != 4) {
            if (i == 82) {
                m70418H0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f51607T = z;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: H */
    public void mo28608H() {
        ActionBar mo28590v = mo28590v();
        if (mo28590v != null) {
            mo28590v.mo70244C(false);
        }
    }

    /* renamed from: H0 */
    public final boolean m70418H0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState m70365v0 = m70365v0(i, true);
            if (!m70365v0.f51654o) {
                return m70408R0(m70365v0, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* renamed from: I0 */
    public boolean m70417I0(int i, KeyEvent keyEvent) {
        ActionBar mo28590v = mo28590v();
        if (mo28590v != null && mo28590v.mo70216p(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f51606S;
        if (panelFeatureState != null && m70409Q0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f51606S;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f51653n = true;
            }
            return true;
        }
        if (this.f51606S == null) {
            PanelFeatureState m70365v0 = m70365v0(0, true);
            m70408R0(m70365v0, keyEvent);
            boolean m70409Q0 = m70409Q0(m70365v0, keyEvent.getKeyCode(), keyEvent, 1);
            m70365v0.f51652m = false;
            if (m70409Q0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J0 */
    public boolean m70416J0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                m70415K0(0, keyEvent);
                return true;
            }
        } else if (m70420F0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: K */
    public boolean mo28607K(int i) {
        int m70406T0 = m70406T0(i);
        if (this.f51603P && m70406T0 == 108) {
            return false;
        }
        if (this.f51599H && m70406T0 == 1) {
            this.f51599H = false;
        }
        if (m70406T0 != 1) {
            if (m70406T0 != 2) {
                if (m70406T0 != 5) {
                    if (m70406T0 != 10) {
                        if (m70406T0 != 108) {
                            if (m70406T0 != 109) {
                                return this.f51615m.requestFeature(m70406T0);
                            }
                            m70393a1();
                            this.f51600I = true;
                            return true;
                        }
                        m70393a1();
                        this.f51599H = true;
                        return true;
                    }
                    m70393a1();
                    this.f51601J = true;
                    return true;
                }
                m70393a1();
                this.f51598G = true;
                return true;
            }
            m70393a1();
            this.f51597F = true;
            return true;
        }
        m70393a1();
        this.f51603P = true;
        return true;
    }

    /* renamed from: K0 */
    public final boolean m70415K0(int i, KeyEvent keyEvent) {
        boolean z;
        IV0 iv0;
        if (this.f51630v != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState m70365v0 = m70365v0(i, true);
        if (i == 0 && (iv0 = this.f51624s) != null && iv0.mo70056a() && !ViewConfiguration.get(this.f51614l).hasPermanentMenuKey()) {
            if (!this.f51624s.mo70053d()) {
                if (!this.f51610X && m70408R0(m70365v0, keyEvent)) {
                    z2 = this.f51624s.mo70054c();
                }
                z2 = false;
            } else {
                z2 = this.f51624s.mo70052e();
            }
        } else {
            boolean z3 = m70365v0.f51654o;
            if (!z3 && !m70365v0.f51653n) {
                if (m70365v0.f51652m) {
                    if (m70365v0.f51657r) {
                        m70365v0.f51652m = false;
                        z = m70408R0(m70365v0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m70411O0(m70365v0, keyEvent);
                    }
                }
                z2 = false;
            } else {
                m70384f0(m70365v0, true);
                z2 = z3;
            }
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f51614l.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: L */
    public void mo28606L(int i) {
        m70374m0();
        ViewGroup viewGroup = (ViewGroup) this.f51592C.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f51614l).inflate(i, viewGroup);
        this.f51616n.m70333c(this.f51615m.getCallback());
    }

    /* renamed from: L0 */
    public void m70414L0(int i) {
        ActionBar mo28590v;
        if (i == 108 && (mo28590v = mo28590v()) != null) {
            mo28590v.mo70221i(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: M */
    public void mo28605M(View view) {
        m70374m0();
        ViewGroup viewGroup = (ViewGroup) this.f51592C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f51616n.m70333c(this.f51615m.getCallback());
    }

    /* renamed from: M0 */
    public void m70413M0(int i) {
        if (i == 108) {
            ActionBar mo28590v = mo28590v();
            if (mo28590v != null) {
                mo28590v.mo70221i(false);
            }
        } else if (i == 0) {
            PanelFeatureState m70365v0 = m70365v0(i, true);
            if (m70365v0.f51654o) {
                m70384f0(m70365v0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: N */
    public void mo28604N(View view, ViewGroup.LayoutParams layoutParams) {
        m70374m0();
        ViewGroup viewGroup = (ViewGroup) this.f51592C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f51616n.m70333c(this.f51615m.getCallback());
    }

    /* renamed from: N0 */
    public void m70412N0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70411O0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        if (!panelFeatureState.f51654o && !this.f51610X) {
            if (panelFeatureState.f51640a == 0) {
                if ((this.f51614l.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            Window.Callback m70363x0 = m70363x0();
            if (m70363x0 != null && !m70363x0.onMenuOpened(panelFeatureState.f51640a, panelFeatureState.f51649j)) {
                m70384f0(panelFeatureState, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.f51614l.getSystemService("window");
            if (windowManager == null || !m70408R0(panelFeatureState, keyEvent)) {
                return;
            }
            ViewGroup viewGroup = panelFeatureState.f51646g;
            if (viewGroup != null && !panelFeatureState.f51656q) {
                View view = panelFeatureState.f51648i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    panelFeatureState.f51653n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f51643d, panelFeatureState.f51644e, 1002, 8519680, -3);
                    layoutParams2.gravity = panelFeatureState.f51642c;
                    layoutParams2.windowAnimations = panelFeatureState.f51645f;
                    windowManager.addView(panelFeatureState.f51646g, layoutParams2);
                    panelFeatureState.f51654o = true;
                    if (panelFeatureState.f51640a != 0) {
                        m70385e1();
                        return;
                    }
                    return;
                }
            } else {
                if (viewGroup == null) {
                    if (!m70425A0(panelFeatureState) || panelFeatureState.f51646g == null) {
                        return;
                    }
                } else if (panelFeatureState.f51656q && viewGroup.getChildCount() > 0) {
                    panelFeatureState.f51646g.removeAllViews();
                }
                if (m70361z0(panelFeatureState) && panelFeatureState.m70359b()) {
                    ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f51647h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    panelFeatureState.f51646g.setBackgroundResource(panelFeatureState.f51641b);
                    ViewParent parent = panelFeatureState.f51647h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(panelFeatureState.f51647h);
                    }
                    panelFeatureState.f51646g.addView(panelFeatureState.f51647h, layoutParams3);
                    if (!panelFeatureState.f51647h.hasFocus()) {
                        panelFeatureState.f51647h.requestFocus();
                    }
                } else {
                    panelFeatureState.f51656q = true;
                    return;
                }
            }
            i = -2;
            panelFeatureState.f51653n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f51643d, panelFeatureState.f51644e, 1002, 8519680, -3);
            layoutParams22.gravity = panelFeatureState.f51642c;
            layoutParams22.windowAnimations = panelFeatureState.f51645f;
            windowManager.addView(panelFeatureState.f51646g, layoutParams22);
            panelFeatureState.f51654o = true;
            if (panelFeatureState.f51640a != 0) {
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: P */
    public void mo70279P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo70279P(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f51593C0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f51595D0) != null) {
            C10980n.m70335c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f51595D0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f51613k;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f51593C0 = C10980n.m70337a((Activity) this.f51613k);
                m70385e1();
            }
        }
        this.f51593C0 = onBackInvokedDispatcher;
        m70385e1();
    }

    /* renamed from: P0 */
    public final ActionBar m70410P0() {
        return this.f51618p;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: Q */
    public void mo28603Q(Toolbar toolbar) {
        if (!(this.f51613k instanceof Activity)) {
            return;
        }
        ActionBar mo28590v = mo28590v();
        if (!(mo28590v instanceof C11011f)) {
            this.f51620q = null;
            if (mo28590v != null) {
                mo28590v.mo70250o();
            }
            this.f51618p = null;
            if (toolbar != null) {
                C11005e c11005e = new C11005e(toolbar, m70364w0(), this.f51616n);
                this.f51618p = c11005e;
                this.f51616n.m70331e(c11005e.f51721c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f51616n.m70331e(null);
            }
            mo28588x();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    /* renamed from: Q0 */
    public final boolean m70409Q0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C11028e c11028e;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f51652m || m70408R0(panelFeatureState, keyEvent)) && (c11028e = panelFeatureState.f51649j) != null) {
            z = c11028e.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f51624s == null) {
            m70384f0(panelFeatureState, true);
        }
        return z;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: R */
    public void mo28602R(int i) {
        this.f51619p0 = i;
    }

    /* renamed from: R0 */
    public final boolean m70408R0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        IV0 iv0;
        int i;
        boolean z2;
        IV0 iv02;
        IV0 iv03;
        if (this.f51610X) {
            return false;
        }
        if (panelFeatureState.f51652m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f51606S;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m70384f0(panelFeatureState2, false);
        }
        Window.Callback m70363x0 = m70363x0();
        if (m70363x0 != null) {
            panelFeatureState.f51648i = m70363x0.onCreatePanelView(panelFeatureState.f51640a);
        }
        int i2 = panelFeatureState.f51640a;
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (iv03 = this.f51624s) != null) {
            iv03.setMenuPrepared();
        }
        if (panelFeatureState.f51648i == null && (!z || !(m70410P0() instanceof C11005e))) {
            C11028e c11028e = panelFeatureState.f51649j;
            if (c11028e == null || panelFeatureState.f51657r) {
                if (c11028e == null && (!m70424B0(panelFeatureState) || panelFeatureState.f51649j == null)) {
                    return false;
                }
                if (z && this.f51624s != null) {
                    if (this.f51626t == null) {
                        this.f51626t = new C10973h();
                    }
                    this.f51624s.setMenu(panelFeatureState.f51649j, this.f51626t);
                }
                panelFeatureState.f51649j.m70139h0();
                if (!m70363x0.onCreatePanelMenu(panelFeatureState.f51640a, panelFeatureState.f51649j)) {
                    panelFeatureState.m70358c(null);
                    if (z && (iv0 = this.f51624s) != null) {
                        iv0.setMenu(null, this.f51626t);
                    }
                    return false;
                }
                panelFeatureState.f51657r = false;
            }
            panelFeatureState.f51649j.m70139h0();
            Bundle bundle = panelFeatureState.f51658s;
            if (bundle != null) {
                panelFeatureState.f51649j.m70160R(bundle);
                panelFeatureState.f51658s = null;
            }
            if (!m70363x0.onPreparePanel(0, panelFeatureState.f51648i, panelFeatureState.f51649j)) {
                if (z && (iv02 = this.f51624s) != null) {
                    iv02.setMenu(null, this.f51626t);
                }
                panelFeatureState.f51649j.m70140g0();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f51655p = z2;
            panelFeatureState.f51649j.setQwertyMode(z2);
            panelFeatureState.f51649j.m70140g0();
        }
        panelFeatureState.f51652m = true;
        panelFeatureState.f51653n = false;
        this.f51606S = panelFeatureState;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: S */
    public final void mo28601S(CharSequence charSequence) {
        this.f51622r = charSequence;
        IV0 iv0 = this.f51624s;
        if (iv0 != null) {
            iv0.setWindowTitle(charSequence);
        } else if (m70410P0() != null) {
            m70410P0().mo70241F(charSequence);
        } else {
            TextView textView = this.f51594D;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: S0 */
    public final void m70407S0(boolean z) {
        IV0 iv0 = this.f51624s;
        if (iv0 != null && iv0.mo70056a() && (!ViewConfiguration.get(this.f51614l).hasPermanentMenuKey() || this.f51624s.mo70051f())) {
            Window.Callback m70363x0 = m70363x0();
            if (this.f51624s.mo70053d() && z) {
                this.f51624s.mo70052e();
                if (!this.f51610X) {
                    m70363x0.onPanelClosed(108, m70365v0(0, true).f51649j);
                    return;
                }
                return;
            } else if (m70363x0 != null && !this.f51610X) {
                if (this.f51629u0 && (this.f51631v0 & 1) != 0) {
                    this.f51615m.getDecorView().removeCallbacks(this.f51633w0);
                    this.f51633w0.run();
                }
                PanelFeatureState m70365v0 = m70365v0(0, true);
                C11028e c11028e = m70365v0.f51649j;
                if (c11028e != null && !m70365v0.f51657r && m70363x0.onPreparePanel(0, m70365v0.f51648i, c11028e)) {
                    m70363x0.onMenuOpened(108, m70365v0.f51649j);
                    this.f51624s.mo70054c();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        PanelFeatureState m70365v02 = m70365v0(0, true);
        m70365v02.f51656q = true;
        m70384f0(m70365v02, false);
        m70411O0(m70365v02, null);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: T */
    public AbstractC2614G2 mo28600T(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
        InterfaceC10819ai interfaceC10819ai;
        if (interfaceC2615a != null) {
            AbstractC2614G2 abstractC2614G2 = this.f51630v;
            if (abstractC2614G2 != null) {
                abstractC2614G2.mo17560c();
            }
            C10974i c10974i = new C10974i(interfaceC2615a);
            ActionBar mo28590v = mo28590v();
            if (mo28590v != null) {
                AbstractC2614G2 mo70239H = mo28590v.mo70239H(c10974i);
                this.f51630v = mo70239H;
                if (mo70239H != null && (interfaceC10819ai = this.f51617o) != null) {
                    interfaceC10819ai.onSupportActionModeStarted(mo70239H);
                }
            }
            if (this.f51630v == null) {
                this.f51630v = m70395Z0(c10974i);
            }
            m70385e1();
            return this.f51630v;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: T0 */
    public final int m70406T0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i;
        }
    }

    /* renamed from: U0 */
    public void m70405U0(Configuration configuration, C50711vv2 c50711vv2) {
        C10978l.m70339d(configuration, c50711vv2);
    }

    /* renamed from: V */
    public final boolean m70404V(boolean z) {
        return m70402W(z, true);
    }

    /* renamed from: V0 */
    public void m70403V0(C50711vv2 c50711vv2) {
        C10978l.m70340c(c50711vv2);
    }

    /* renamed from: W */
    public final boolean m70402W(boolean z, boolean z2) {
        C50711vv2 c50711vv2;
        if (this.f51610X) {
            return false;
        }
        int m70394a0 = m70394a0();
        int m70421E0 = m70421E0(this.f51614l, m70394a0);
        if (Build.VERSION.SDK_INT < 33) {
            c50711vv2 = m70396Z(this.f51614l);
        } else {
            c50711vv2 = null;
        }
        if (!z2 && c50711vv2 != null) {
            c50711vv2 = m70366u0(this.f51614l.getResources().getConfiguration());
        }
        boolean m70387d1 = m70387d1(m70421E0, c50711vv2, z);
        if (m70394a0 == 0) {
            m70367t0(this.f51614l).m70328e();
        } else {
            AbstractC10983q abstractC10983q = this.f51625s0;
            if (abstractC10983q != null) {
                abstractC10983q.m70329a();
            }
        }
        if (m70394a0 == 3) {
            m70368s0(this.f51614l).m70328e();
        } else {
            AbstractC10983q abstractC10983q2 = this.f51627t0;
            if (abstractC10983q2 != null) {
                abstractC10983q2.m70329a();
            }
        }
        return m70387d1;
    }

    /* renamed from: W0 */
    public final boolean m70401W0() {
        ViewGroup viewGroup;
        return this.f51590B && (viewGroup = this.f51592C) != null && C38790bq6.m62504Z(viewGroup);
    }

    /* renamed from: X */
    public final void m70400X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f51592C.findViewById(16908290);
        View decorView = this.f51615m.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f51614l.obtainStyledAttributes(C43509jm4.AppCompatTheme);
        obtainStyledAttributes.getValue(C43509jm4.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.m69909e());
        obtainStyledAttributes.getValue(C43509jm4.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.m69908f());
        int i = C43509jm4.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.m69911c());
        }
        int i2 = C43509jm4.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.m69910d());
        }
        int i3 = C43509jm4.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.m69913a());
        }
        int i4 = C43509jm4.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.m69912b());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: X0 */
    public final boolean m70399X0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f51615m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C38790bq6.m62506Y((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: Y */
    public final void m70398Y(Window window) {
        if (this.f51615m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C10981o)) {
                C10981o c10981o = new C10981o(callback);
                this.f51616n = c10981o;
                window.setCallback(c10981o);
                Z46 m73748u = Z46.m73748u(this.f51614l, null, f51585G0);
                Drawable m73761h = m73748u.m73761h(0);
                if (m73761h != null) {
                    window.setBackgroundDrawable(m73761h);
                }
                m73748u.m73746w();
                this.f51615m = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f51593C0 == null) {
                    mo70279P(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: Y0 */
    public boolean m70397Y0() {
        if (this.f51593C0 == null) {
            return false;
        }
        PanelFeatureState m70365v0 = m70365v0(0, false);
        if ((m70365v0 == null || !m70365v0.f51654o) && this.f51630v == null) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public C50711vv2 m70396Z(Context context) {
        C50711vv2 m70267u;
        if (Build.VERSION.SDK_INT >= 33 || (m70267u = AbstractC10999c.m70267u()) == null) {
            return null;
        }
        C50711vv2 m70366u0 = m70366u0(context.getApplicationContext().getResources().getConfiguration());
        C50711vv2 m113b = C53083zv2.m113b(m70267u, m70366u0);
        if (!m113b.m7767g()) {
            return m113b;
        }
        return m70366u0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC2614G2 m70395Z0(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
        AbstractC2614G2 abstractC2614G2;
        Context context;
        AbstractC2614G2 abstractC2614G22;
        InterfaceC10819ai interfaceC10819ai;
        m70375l0();
        AbstractC2614G2 abstractC2614G23 = this.f51630v;
        if (abstractC2614G23 != null) {
            abstractC2614G23.mo17560c();
        }
        if (!(interfaceC2615a instanceof C10974i)) {
            interfaceC2615a = new C10974i(interfaceC2615a);
        }
        InterfaceC10819ai interfaceC10819ai2 = this.f51617o;
        if (interfaceC10819ai2 != null && !this.f51610X) {
            try {
                abstractC2614G2 = interfaceC10819ai2.onWindowStartingSupportActionMode(interfaceC2615a);
            } catch (AbstractMethodError unused) {
            }
            if (abstractC2614G2 == null) {
                this.f51630v = abstractC2614G2;
            } else {
                boolean z = true;
                if (this.f51632w == null) {
                    if (this.f51602K) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f51614l.getTheme();
                        theme.resolveAttribute(C50553vf4.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f51614l.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new C37806aB0(this.f51614l, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f51614l;
                        }
                        this.f51632w = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, C50553vf4.actionModePopupWindowStyle);
                        this.f51634x = popupWindow;
                        BY3.m113874b(popupWindow, 2);
                        this.f51634x.setContentView(this.f51632w);
                        this.f51634x.setWidth(-1);
                        context.getTheme().resolveAttribute(C50553vf4.actionBarSize, typedValue, true);
                        this.f51632w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f51634x.setHeight(-2);
                        this.f51636y = new RunnableC10968d();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f51592C.findViewById(C39902dh4.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(m70370q0()));
                            this.f51632w = (ActionBarContextView) viewStubCompat.m69734a();
                        }
                    }
                }
                if (this.f51632w != null) {
                    m70375l0();
                    this.f51632w.m70058m();
                    Context context2 = this.f51632w.getContext();
                    ActionBarContextView actionBarContextView = this.f51632w;
                    if (this.f51634x != null) {
                        z = false;
                    }
                    C47433qO5 c47433qO5 = new C47433qO5(context2, actionBarContextView, interfaceC2615a, z);
                    if (interfaceC2615a.mo70350c(c47433qO5, c47433qO5.mo17558e())) {
                        c47433qO5.mo17554k();
                        this.f51632w.m70061j(c47433qO5);
                        this.f51630v = c47433qO5;
                        if (m70401W0()) {
                            this.f51632w.setAlpha(0.0f);
                            C34823Ns6 m93248b = C38790bq6.m62490e(this.f51632w).m93248b(1.0f);
                            this.f51638z = m93248b;
                            m93248b.m93242h(new C10970e());
                        } else {
                            this.f51632w.setAlpha(1.0f);
                            this.f51632w.setVisibility(0);
                            if (this.f51632w.getParent() instanceof View) {
                                C38790bq6.m62458s0((View) this.f51632w.getParent());
                            }
                        }
                        if (this.f51634x != null) {
                            this.f51615m.getDecorView().post(this.f51636y);
                        }
                    } else {
                        this.f51630v = null;
                    }
                }
            }
            abstractC2614G22 = this.f51630v;
            if (abstractC2614G22 != null && (interfaceC10819ai = this.f51617o) != null) {
                interfaceC10819ai.onSupportActionModeStarted(abstractC2614G22);
            }
            m70385e1();
            return this.f51630v;
        }
        abstractC2614G2 = null;
        if (abstractC2614G2 == null) {
        }
        abstractC2614G22 = this.f51630v;
        if (abstractC2614G22 != null) {
            interfaceC10819ai.onSupportActionModeStarted(abstractC2614G22);
        }
        m70385e1();
        return this.f51630v;
    }

    @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
    /* renamed from: a */
    public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
        PanelFeatureState m70372o0;
        Window.Callback m70363x0 = m70363x0();
        if (m70363x0 != null && !this.f51610X && (m70372o0 = m70372o0(c11028e.mo70078F())) != null) {
            return m70363x0.onMenuItemSelected(m70372o0.f51640a, menuItem);
        }
        return false;
    }

    /* renamed from: a0 */
    public final int m70394a0() {
        int i = this.f51612Z;
        return i != -100 ? i : AbstractC10999c.m70269p();
    }

    /* renamed from: a1 */
    public final void m70393a1() {
        if (!this.f51590B) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
    /* renamed from: b */
    public void mo5019b(C11028e c11028e) {
        m70407S0(true);
    }

    /* renamed from: b0 */
    public void m70392b0(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f51605R;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f51649j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f51654o) && !this.f51610X) {
            this.f51616n.m70332d(this.f51615m.getCallback(), i, menu);
        }
    }

    /* renamed from: b1 */
    public final AppCompatActivity m70391b1() {
        for (Context context = this.f51614l; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: c0 */
    public void m70390c0(C11028e c11028e) {
        if (this.f51604Q) {
            return;
        }
        this.f51604Q = true;
        this.f51624s.mo70049h();
        Window.Callback m70363x0 = m70363x0();
        if (m70363x0 != null && !this.f51610X) {
            m70363x0.onPanelClosed(108, c11028e);
        }
        this.f51604Q = false;
    }

    /* renamed from: c1 */
    public final void m70389c1(Configuration configuration) {
        Activity activity = (Activity) this.f51613k;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().mo67007b().m67013b(AbstractC11719f.EnumC11724b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f51609W && !this.f51610X) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: d0 */
    public final void m70388d0() {
        AbstractC10983q abstractC10983q = this.f51625s0;
        if (abstractC10983q != null) {
            abstractC10983q.m70329a();
        }
        AbstractC10983q abstractC10983q2 = this.f51627t0;
        if (abstractC10983q2 != null) {
            abstractC10983q2.m70329a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m70387d1(int i, C50711vv2 c50711vv2, boolean z) {
        C50711vv2 m70366u0;
        int i2;
        boolean z2;
        Configuration m70382g0 = m70382g0(this.f51614l, i, c50711vv2, null, false);
        int m70369r0 = m70369r0(this.f51614l);
        Configuration configuration = this.f51611Y;
        if (configuration == null) {
            configuration = this.f51614l.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = m70382g0.uiMode & 48;
        C50711vv2 m70366u02 = m70366u0(configuration);
        if (c50711vv2 == null) {
            m70366u0 = null;
        } else {
            m70366u0 = m70366u0(m70382g0);
        }
        boolean z3 = false;
        if (i3 != i4) {
            i2 = 512;
        } else {
            i2 = 0;
        }
        if (m70366u0 != null && !m70366u02.equals(m70366u0)) {
            i2 = i2 | 4 | 8192;
        }
        boolean z4 = true;
        if (((~m70369r0) & i2) != 0 && z && this.f51608U && (f51586H0 || this.f51609W)) {
            Object obj = this.f51613k;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                C25883m3.m26449t((Activity) this.f51613k);
                z2 = true;
                if (z2 && i2 != 0) {
                    if ((i2 & m70369r0) == i2) {
                        z3 = true;
                    }
                    m70383f1(i4, m70366u0, z3, null);
                } else {
                    z4 = z2;
                }
                if (z4) {
                    Object obj2 = this.f51613k;
                    if (obj2 instanceof AppCompatActivity) {
                        if ((i2 & 512) != 0) {
                            ((AppCompatActivity) obj2).onNightModeChanged(i);
                        }
                        if ((i2 & 4) != 0) {
                            ((AppCompatActivity) this.f51613k).onLocalesChanged(c50711vv2);
                        }
                    }
                }
                if (z4 && m70366u0 != null) {
                    m70403V0(m70366u0(this.f51614l.getResources().getConfiguration()));
                }
                return z4;
            }
        }
        z2 = false;
        if (z2) {
        }
        z4 = z2;
        if (z4) {
        }
        if (z4) {
            m70403V0(m70366u0(this.f51614l.getResources().getConfiguration()));
        }
        return z4;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: e */
    public void mo28598e(View view, ViewGroup.LayoutParams layoutParams) {
        m70374m0();
        ((ViewGroup) this.f51592C.findViewById(16908290)).addView(view, layoutParams);
        this.f51616n.m70333c(this.f51615m.getCallback());
    }

    /* renamed from: e0 */
    public void m70386e0(int i) {
        m70384f0(m70365v0(i, true), true);
    }

    /* renamed from: e1 */
    public void m70385e1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean m70397Y0 = m70397Y0();
            if (m70397Y0 && this.f51595D0 == null) {
                this.f51595D0 = C10980n.m70336b(this.f51593C0, this);
            } else if (!m70397Y0 && (onBackInvokedCallback = this.f51595D0) != null) {
                C10980n.m70335c(this.f51593C0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: f */
    public boolean mo28597f() {
        return m70404V(true);
    }

    /* renamed from: f0 */
    public void m70384f0(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        IV0 iv0;
        if (z && panelFeatureState.f51640a == 0 && (iv0 = this.f51624s) != null && iv0.mo70053d()) {
            m70390c0(panelFeatureState.f51649j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f51614l.getSystemService("window");
        if (windowManager != null && panelFeatureState.f51654o && (viewGroup = panelFeatureState.f51646g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m70392b0(panelFeatureState.f51640a, panelFeatureState, null);
            }
        }
        panelFeatureState.f51652m = false;
        panelFeatureState.f51653n = false;
        panelFeatureState.f51654o = false;
        panelFeatureState.f51647h = null;
        panelFeatureState.f51656q = true;
        if (this.f51606S == panelFeatureState) {
            this.f51606S = null;
        }
        if (panelFeatureState.f51640a == 0) {
            m70385e1();
        }
    }

    /* renamed from: f1 */
    public final void m70383f1(int i, C50711vv2 c50711vv2, boolean z, Configuration configuration) {
        Resources resources = this.f51614l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (c50711vv2 != null) {
            m70405U0(configuration2, c50711vv2);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C52749zM4.m1513a(resources);
        }
        int i2 = this.f51619p0;
        if (i2 != 0) {
            this.f51614l.setTheme(i2);
            this.f51614l.getTheme().applyStyle(this.f51619p0, true);
        }
        if (z && (this.f51613k instanceof Activity)) {
            m70389c1(configuration2);
        }
    }

    /* renamed from: g0 */
    public final Configuration m70382g0(Context context, int i, C50711vv2 c50711vv2, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c50711vv2 != null) {
            m70405U0(configuration2, c50711vv2);
        }
        return configuration2;
    }

    /* renamed from: g1 */
    public final int m70381g1(DB6 db6, Rect rect) {
        int i;
        boolean z;
        int m110779k;
        int m110778l;
        boolean z2;
        int i2 = 0;
        if (db6 != null) {
            i = db6.m110777m();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f51632w;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f51632w.getLayoutParams();
            boolean z3 = true;
            if (this.f51632w.isShown()) {
                if (this.f51637y0 == null) {
                    this.f51637y0 = new Rect();
                    this.f51639z0 = new Rect();
                }
                Rect rect2 = this.f51637y0;
                Rect rect3 = this.f51639z0;
                if (db6 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(db6.m110779k(), db6.m110777m(), db6.m110778l(), db6.m110780j());
                }
                C37406Yt6.m74028a(this.f51592C, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                DB6 m62534K = C38790bq6.m62534K(this.f51592C);
                if (m62534K == null) {
                    m110779k = 0;
                } else {
                    m110779k = m62534K.m110779k();
                }
                if (m62534K == null) {
                    m110778l = 0;
                } else {
                    m110778l = m62534K.m110778l();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 > 0 && this.f51596E == null) {
                    View view = new View(this.f51614l);
                    this.f51596E = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m110779k;
                    layoutParams.rightMargin = m110778l;
                    this.f51592C.addView(this.f51596E, -1, layoutParams);
                } else {
                    View view2 = this.f51596E;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != m110779k || marginLayoutParams2.rightMargin != m110778l) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = m110779k;
                            marginLayoutParams2.rightMargin = m110778l;
                            this.f51596E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f51596E;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m70379h1(this.f51596E);
                }
                if (!this.f51601J && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f51632w.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view4 = this.f51596E;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: h0 */
    public final ViewGroup m70380h0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f51614l.obtainStyledAttributes(C43509jm4.AppCompatTheme);
        int i = C43509jm4.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C43509jm4.AppCompatTheme_windowNoTitle, false)) {
                mo28607K(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo28607K(108);
            }
            if (obtainStyledAttributes.getBoolean(C43509jm4.AppCompatTheme_windowActionBarOverlay, false)) {
                mo28607K(109);
            }
            if (obtainStyledAttributes.getBoolean(C43509jm4.AppCompatTheme_windowActionModeOverlay, false)) {
                mo28607K(10);
            }
            this.f51602K = obtainStyledAttributes.getBoolean(C43509jm4.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m70373n0();
            this.f51615m.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f51614l);
            if (!this.f51603P) {
                if (this.f51602K) {
                    viewGroup = (ViewGroup) from.inflate(C32643Ek4.abc_dialog_title_material, (ViewGroup) null);
                    this.f51600I = false;
                    this.f51599H = false;
                } else if (this.f51599H) {
                    TypedValue typedValue = new TypedValue();
                    this.f51614l.getTheme().resolveAttribute(C50553vf4.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C37806aB0(this.f51614l, typedValue.resourceId);
                    } else {
                        context = this.f51614l;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C32643Ek4.abc_screen_toolbar, (ViewGroup) null);
                    IV0 iv0 = (IV0) viewGroup.findViewById(C39902dh4.decor_content_parent);
                    this.f51624s = iv0;
                    iv0.setWindowCallback(m70363x0());
                    if (this.f51600I) {
                        this.f51624s.mo70050g(109);
                    }
                    if (this.f51597F) {
                        this.f51624s.mo70050g(2);
                    }
                    if (this.f51598G) {
                        this.f51624s.mo70050g(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f51601J ? (ViewGroup) from.inflate(C32643Ek4.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C32643Ek4.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                C38790bq6.m62531L0(viewGroup, new C10966b());
                if (this.f51624s == null) {
                    this.f51594D = (TextView) viewGroup.findViewById(C39902dh4.title);
                }
                C37406Yt6.m74026c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C39902dh4.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f51615m.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f51615m.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C10967c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f51599H + ", windowActionBarOverlay: " + this.f51600I + ", android:windowIsFloating: " + this.f51602K + ", windowActionModeOverlay: " + this.f51601J + ", windowNoTitle: " + this.f51603P + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: h1 */
    public final void m70379h1(View view) {
        boolean z;
        int m94301c;
        if ((C38790bq6.m62520R(view) & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m94301c = NA0.m94301c(this.f51614l, C34236Lf4.abc_decor_view_status_guard_light);
        } else {
            m94301c = NA0.m94301c(this.f51614l, C34236Lf4.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(m94301c);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: i */
    public Context mo28596i(Context context) {
        Configuration configuration;
        boolean z = true;
        this.f51608U = true;
        int m70421E0 = m70421E0(context, m70394a0());
        if (AbstractC10999c.m70266y(context)) {
            AbstractC10999c.m70278U(context);
        }
        C50711vv2 m70396Z = m70396Z(context);
        if (f51587I0 && (context instanceof ContextThemeWrapper)) {
            try {
                C10986s.m70324a((ContextThemeWrapper) context, m70382g0(context, m70421E0, m70396Z, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C37806aB0) {
            try {
                ((C37806aB0) context).m71803a(m70382g0(context, m70421E0, m70396Z, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f51586H0) {
            return super.mo28596i(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C10976j.m70348a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m70371p0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration m70382g0 = m70382g0(context, m70421E0, m70396Z, configuration, true);
        C37806aB0 c37806aB0 = new C37806aB0(context, C33588Il4.Theme_AppCompat_Empty);
        c37806aB0.m71803a(m70382g0);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C49785uM4.C29184f.m10374a(c37806aB0.getTheme());
        }
        return super.mo28596i(c37806aB0);
    }

    /* renamed from: i0 */
    public void m70378i0() {
        C11028e c11028e;
        IV0 iv0 = this.f51624s;
        if (iv0 != null) {
            iv0.mo70049h();
        }
        if (this.f51634x != null) {
            this.f51615m.getDecorView().removeCallbacks(this.f51636y);
            if (this.f51634x.isShowing()) {
                try {
                    this.f51634x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f51634x = null;
        }
        m70375l0();
        PanelFeatureState m70365v0 = m70365v0(0, false);
        if (m70365v0 != null && (c11028e = m70365v0.f51649j) != null) {
            c11028e.close();
        }
    }

    /* renamed from: j0 */
    public boolean m70377j0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f51613k;
        boolean z = true;
        if (((obj instanceof C43487jk2.InterfaceC24999a) || (obj instanceof DialogC26167mi)) && (decorView = this.f51615m.getDecorView()) != null && C43487jk2.m30010d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f51616n.m70334b(this.f51615m.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        if (z) {
            return m70419G0(keyCode, keyEvent);
        }
        return m70416J0(keyCode, keyEvent);
    }

    /* renamed from: k0 */
    public void m70376k0(int i) {
        PanelFeatureState m70365v0;
        PanelFeatureState m70365v02 = m70365v0(i, true);
        if (m70365v02.f51649j != null) {
            Bundle bundle = new Bundle();
            m70365v02.f51649j.m70158T(bundle);
            if (bundle.size() > 0) {
                m70365v02.f51658s = bundle;
            }
            m70365v02.f51649j.m70139h0();
            m70365v02.f51649j.clear();
        }
        m70365v02.f51657r = true;
        m70365v02.f51656q = true;
        if ((i == 108 || i == 0) && this.f51624s != null && (m70365v0 = m70365v0(0, false)) != null) {
            m70365v0.f51652m = false;
            m70408R0(m70365v0, null);
        }
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: l */
    public View mo28595l(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f51589A0 == null) {
            String string = this.f51614l.obtainStyledAttributes(C43509jm4.AppCompatTheme).getString(C43509jm4.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f51589A0 = new C5345Mi();
            } else {
                try {
                    this.f51589A0 = (C5345Mi) this.f51614l.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f51589A0 = new C5345Mi();
                }
            }
        }
        boolean z3 = f51584F0;
        if (z3) {
            if (this.f51591B0 == null) {
                this.f51591B0 = new C49436tm2();
            }
            if (this.f51591B0.m11799a(attributeSet)) {
                z = true;
                return this.f51589A0.m95018r(view, str, context, attributeSet, z, z3, true, C38137ak6.m70803c());
            } else if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
            } else {
                z2 = m70399X0((ViewParent) view);
            }
        }
        z = z2;
        return this.f51589A0.m95018r(view, str, context, attributeSet, z, z3, true, C38137ak6.m70803c());
    }

    /* renamed from: l0 */
    public void m70375l0() {
        C34823Ns6 c34823Ns6 = this.f51638z;
        if (c34823Ns6 != null) {
            c34823Ns6.m93247c();
        }
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: m */
    public <T extends View> T mo28594m(int i) {
        m70374m0();
        return (T) this.f51615m.findViewById(i);
    }

    /* renamed from: m0 */
    public final void m70374m0() {
        if (!this.f51590B) {
            this.f51592C = m70380h0();
            CharSequence m70364w0 = m70364w0();
            if (!TextUtils.isEmpty(m70364w0)) {
                IV0 iv0 = this.f51624s;
                if (iv0 != null) {
                    iv0.setWindowTitle(m70364w0);
                } else if (m70410P0() != null) {
                    m70410P0().mo70241F(m70364w0);
                } else {
                    TextView textView = this.f51594D;
                    if (textView != null) {
                        textView.setText(m70364w0);
                    }
                }
            }
            m70400X();
            m70412N0(this.f51592C);
            this.f51590B = true;
            PanelFeatureState m70365v0 = m70365v0(0, false);
            if (!this.f51610X) {
                if (m70365v0 == null || m70365v0.f51649j == null) {
                    m70423C0(108);
                }
            }
        }
    }

    /* renamed from: n0 */
    public final void m70373n0() {
        if (this.f51615m == null) {
            Object obj = this.f51613k;
            if (obj instanceof Activity) {
                m70398Y(((Activity) obj).getWindow());
            }
        }
        if (this.f51615m != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: o */
    public Context mo70270o() {
        return this.f51614l;
    }

    /* renamed from: o0 */
    public PanelFeatureState m70372o0(Menu menu) {
        int i;
        PanelFeatureState[] panelFeatureStateArr = this.f51605R;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f51649j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo28595l(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: q */
    public final C10990a.InterfaceC10992b mo28593q() {
        return new C10971f();
    }

    /* renamed from: q0 */
    public final Context m70370q0() {
        Context context;
        ActionBar mo28590v = mo28590v();
        if (mo28590v != null) {
            context = mo28590v.mo70219k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f51614l;
        }
        return context;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: r */
    public int mo28592r() {
        return this.f51612Z;
    }

    /* renamed from: r0 */
    public final int m70369r0(Context context) {
        int i;
        if (!this.f51623r0 && (this.f51613k instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else {
                    i = 786432;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f51613k.getClass()), i);
                if (activityInfo != null) {
                    this.f51621q0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f51621q0 = 0;
            }
        }
        this.f51623r0 = true;
        return this.f51621q0;
    }

    /* renamed from: s0 */
    public final AbstractC10983q m70368s0(Context context) {
        if (this.f51627t0 == null) {
            this.f51627t0 = new C10982p(context);
        }
        return this.f51627t0;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: t */
    public MenuInflater mo28591t() {
        Context context;
        if (this.f51620q == null) {
            m70362y0();
            ActionBar actionBar = this.f51618p;
            if (actionBar != null) {
                context = actionBar.mo70219k();
            } else {
                context = this.f51614l;
            }
            this.f51620q = new C39177cV5(context);
        }
        return this.f51620q;
    }

    /* renamed from: t0 */
    public final AbstractC10983q m70367t0(Context context) {
        if (this.f51625s0 == null) {
            this.f51625s0 = new C10985r(C50515vb6.m8392a(context));
        }
        return this.f51625s0;
    }

    /* renamed from: u0 */
    public C50711vv2 m70366u0(Configuration configuration) {
        return C10978l.m70341b(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: v */
    public ActionBar mo28590v() {
        m70362y0();
        return this.f51618p;
    }

    /* renamed from: v0 */
    public PanelFeatureState m70365v0(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f51605R;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f51605R = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: w */
    public void mo28589w() {
        LayoutInflater from = LayoutInflater.from(this.f51614l);
        if (from.getFactory() == null) {
            C50029um2.m9787a(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: w0 */
    public final CharSequence m70364w0() {
        Object obj = this.f51613k;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f51622r;
    }

    @Override // androidx.appcompat.app.AbstractC10999c
    /* renamed from: x */
    public void mo28588x() {
        if (m70410P0() != null && !mo28590v().mo70251m()) {
            m70423C0(0);
        }
    }

    /* renamed from: x0 */
    public final Window.Callback m70363x0() {
        return this.f51615m.getCallback();
    }

    /* renamed from: y0 */
    public final void m70362y0() {
        m70374m0();
        if (this.f51599H && this.f51618p == null) {
            Object obj = this.f51613k;
            if (obj instanceof Activity) {
                this.f51618p = new C11011f((Activity) this.f51613k, this.f51600I);
            } else if (obj instanceof Dialog) {
                this.f51618p = new C11011f((Dialog) this.f51613k);
            }
            ActionBar actionBar = this.f51618p;
            if (actionBar != null) {
                actionBar.mo70213u(this.f51635x0);
            }
        }
    }

    /* renamed from: z0 */
    public final boolean m70361z0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f51648i;
        if (view != null) {
            panelFeatureState.f51647h = view;
            return true;
        } else if (panelFeatureState.f51649j == null) {
            return false;
        } else {
            if (this.f51628u == null) {
                this.f51628u = new C10988u();
            }
            View view2 = (View) panelFeatureState.m70360a(this.f51628u);
            panelFeatureState.f51647h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, InterfaceC10819ai interfaceC10819ai) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC10819ai, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, InterfaceC10819ai interfaceC10819ai, Object obj) {
        NA5<String, Integer> na5;
        Integer num;
        AppCompatActivity m70391b1;
        this.f51638z = null;
        this.f51588A = true;
        this.f51612Z = -100;
        this.f51633w0 = new RunnableC10965a();
        this.f51614l = context;
        this.f51617o = interfaceC10819ai;
        this.f51613k = obj;
        if (this.f51612Z == -100 && (obj instanceof Dialog) && (m70391b1 = m70391b1()) != null) {
            this.f51612Z = m70391b1.getDelegate().mo28592r();
        }
        if (this.f51612Z == -100 && (num = (na5 = f51583E0).get(obj.getClass().getName())) != null) {
            this.f51612Z = num.intValue();
            na5.remove(obj.getClass().getName());
        }
        if (window != null) {
            m70398Y(window);
        }
        C27043oi.m20605h();
    }
}
