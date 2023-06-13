package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.UserManager;
import android.util.Log;
/* renamed from: sj7 */
/* loaded from: classes5.dex */
public abstract class AbstractC48818sj7<T> {

    /* renamed from: h */
    public static final Object f109159h = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i */
    public static Context f109160i = null;

    /* renamed from: j */
    public static boolean f109161j = false;

    /* renamed from: k */
    public static volatile Boolean f109162k;

    /* renamed from: l */
    public static volatile Boolean f109163l;

    /* renamed from: a */
    public final C41200fs7 f109164a;

    /* renamed from: b */
    public final String f109165b;

    /* renamed from: c */
    public final String f109166c;

    /* renamed from: d */
    public final T f109167d;

    /* renamed from: e */
    public T f109168e;

    /* renamed from: f */
    public volatile C34014Kg7 f109169f;

    /* renamed from: g */
    public volatile SharedPreferences f109170g;

    public AbstractC48818sj7(C41200fs7 c41200fs7, String str, T t) {
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        Uri uri2;
        this.f109168e = null;
        this.f109169f = null;
        this.f109170g = null;
        str2 = c41200fs7.f80985a;
        if (str2 == null) {
            uri2 = c41200fs7.f80986b;
            if (uri2 == null) {
                throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            }
        }
        str3 = c41200fs7.f80985a;
        if (str3 != null) {
            uri = c41200fs7.f80986b;
            if (uri != null) {
                throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
            }
        }
        this.f109164a = c41200fs7;
        str4 = c41200fs7.f80987c;
        String valueOf = String.valueOf(str4);
        String valueOf2 = String.valueOf(str);
        this.f109166c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        str5 = c41200fs7.f80988d;
        String valueOf3 = String.valueOf(str5);
        String valueOf4 = String.valueOf(str);
        this.f109165b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        this.f109167d = t;
    }

    /* renamed from: b */
    public static void m13761b(Context context) {
        Context applicationContext;
        if (f109160i == null) {
            synchronized (f109159h) {
                if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (f109160i != context) {
                    f109162k = null;
                }
                f109160i = context;
            }
            f109161j = false;
        }
    }

    /* renamed from: d */
    public static <V> V m13759d(InterfaceC51852xq7<V> interfaceC51852xq7) {
        try {
            return interfaceC51852xq7.mo4563d();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC51852xq7.mo4563d();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: e */
    public static <T> AbstractC48818sj7<T> m13758e(C41200fs7 c41200fs7, String str, T t, InterfaceC46527or7<T> interfaceC46527or7) {
        return new C32691Ep7(c41200fs7, str, t, interfaceC46527or7);
    }

    /* renamed from: f */
    public static AbstractC48818sj7<String> m13757f(C41200fs7 c41200fs7, String str, String str2) {
        return new C34554Mo7(c41200fs7, str, str2);
    }

    /* renamed from: g */
    public static AbstractC48818sj7<Boolean> m13756g(C41200fs7 c41200fs7, String str, boolean z) {
        return new C35949Sn7(c41200fs7, str, Boolean.valueOf(z));
    }

    /* renamed from: h */
    public static boolean m13755h(String str, boolean z) {
        if (m13747p()) {
            return ((Boolean) m13759d(new InterfaceC51852xq7(str, false) { // from class: em7

                /* renamed from: a */
                public final String f78846a;

                /* renamed from: b */
                public final boolean f78847b = false;

                {
                    this.f78846a = str;
                }

                @Override // p000.InterfaceC51852xq7
                /* renamed from: d */
                public final Object mo4563d() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(Fx9.m106153h(AbstractC48818sj7.f109160i.getContentResolver(), this.f78846a, this.f78847b));
                    return valueOf;
                }
            })).booleanValue();
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m13747p() {
        if (f109162k == null) {
            Context context = f109160i;
            if (context == null) {
                return false;
            }
            f109162k = Boolean.valueOf(C49227tQ3.m12383a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f109162k.booleanValue();
    }

    /* renamed from: a */
    public final T m13762a() {
        boolean z;
        if (f109160i != null) {
            z = this.f109164a.f80990f;
            if (z) {
                T m13748o = m13748o();
                if (m13748o != null) {
                    return m13748o;
                }
                T m13749n = m13749n();
                if (m13749n != null) {
                    return m13749n;
                }
            } else {
                T m13749n2 = m13749n();
                if (m13749n2 != null) {
                    return m13749n2;
                }
                T m13748o2 = m13748o();
                if (m13748o2 != null) {
                    return m13748o2;
                }
            }
            return this.f109167d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* renamed from: c */
    public abstract T mo13760c(SharedPreferences sharedPreferences);

    /* renamed from: j */
    public abstract T mo13753j(String str);

    @TargetApi(24)
    /* renamed from: n */
    public final T m13749n() {
        Uri uri;
        String str;
        boolean z;
        String str2;
        Uri uri2;
        if (m13755h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f109165b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else {
            uri = this.f109164a.f80986b;
            if (uri != null) {
                if (this.f109169f == null) {
                    ContentResolver contentResolver = f109160i.getContentResolver();
                    uri2 = this.f109164a.f80986b;
                    this.f109169f = C34014Kg7.m98525a(contentResolver, uri2);
                }
                String str3 = (String) m13759d(new InterfaceC51852xq7(this, this.f109169f) { // from class: mk7

                    /* renamed from: a */
                    public final AbstractC48818sj7 f98660a;

                    /* renamed from: b */
                    public final C34014Kg7 f98661b;

                    {
                        this.f98660a = this;
                        this.f98661b = r2;
                    }

                    @Override // p000.InterfaceC51852xq7
                    /* renamed from: d */
                    public final Object mo4563d() {
                        return this.f98661b.m98523c().get(this.f98660a.f109165b);
                    }
                });
                if (str3 != null) {
                    return mo13753j(str3);
                }
            } else {
                str = this.f109164a.f80985a;
                if (str != null) {
                    if (f109160i.isDeviceProtectedStorage()) {
                        z = true;
                    } else {
                        if (f109163l == null || !f109163l.booleanValue()) {
                            f109163l = Boolean.valueOf(((UserManager) f109160i.getSystemService(UserManager.class)).isUserUnlocked());
                        }
                        z = f109163l.booleanValue();
                    }
                    if (!z) {
                        return null;
                    }
                    if (this.f109170g == null) {
                        Context context = f109160i;
                        str2 = this.f109164a.f80985a;
                        this.f109170g = context.getSharedPreferences(str2, 0);
                    }
                    SharedPreferences sharedPreferences = this.f109170g;
                    if (sharedPreferences.contains(this.f109165b)) {
                        return mo13760c(sharedPreferences);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    public final T m13748o() {
        boolean z;
        String str;
        z = this.f109164a.f80989e;
        if (z || !m13747p() || (str = (String) m13759d(new InterfaceC51852xq7(this) { // from class: jl7

            /* renamed from: a */
            public final AbstractC48818sj7 f93301a;

            {
                this.f93301a = this;
            }

            @Override // p000.InterfaceC51852xq7
            /* renamed from: d */
            public final Object mo4563d() {
                return this.f93301a.m13746q();
            }
        })) == null) {
            return null;
        }
        return mo13753j(str);
    }

    /* renamed from: q */
    public final /* synthetic */ String m13746q() {
        return Fx9.m106158c(f109160i.getContentResolver(), this.f109166c, null);
    }

    public /* synthetic */ AbstractC48818sj7(C41200fs7 c41200fs7, String str, Object obj, C38168an7 c38168an7) {
        this(c41200fs7, str, obj);
    }
}
