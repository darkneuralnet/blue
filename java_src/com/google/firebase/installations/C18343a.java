package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C18343a;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC48443s56;
import p000.Z42;
/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes6.dex */
public class C18343a implements InterfaceC35934Sm1 {

    /* renamed from: m */
    public static final Object f74271m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f74272n = new ThreadFactoryC18344a();

    /* renamed from: a */
    public final C31722Am1 f74273a;

    /* renamed from: b */
    public final C34764Nm1 f74274b;

    /* renamed from: c */
    public final C45086mR3 f74275c;

    /* renamed from: d */
    public final C35201Pi6 f74276d;

    /* renamed from: e */
    public final C37339Ym2<C46908pW1> f74277e;

    /* renamed from: f */
    public final C40554en4 f74278f;

    /* renamed from: g */
    public final Object f74279g;

    /* renamed from: h */
    public final ExecutorService f74280h;

    /* renamed from: i */
    public final Executor f74281i;

    /* renamed from: j */
    public String f74282j;

    /* renamed from: k */
    public Set<InterfaceC35214Pk1> f74283k;

    /* renamed from: l */
    public final List<AP5> f74284l;

    /* renamed from: com.google.firebase.installations.a$a */
    /* loaded from: classes6.dex */
    public class ThreadFactoryC18344a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f74285b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f74285b.getAndIncrement())));
        }
    }

    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18345b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74286a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f74287b;

        static {
            int[] iArr = new int[AbstractC48443s56.EnumC28177b.values().length];
            f74287b = iArr;
            try {
                iArr[AbstractC48443s56.EnumC28177b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74287b[AbstractC48443s56.EnumC28177b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74287b[AbstractC48443s56.EnumC28177b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Z42.EnumC10112b.values().length];
            f74286a = iArr2;
            try {
                iArr2[Z42.EnumC10112b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74286a[Z42.EnumC10112b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C18343a(final C31722Am1 c31722Am1, X94<InterfaceC49746uI1> x94, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c31722Am1, new C34764Nm1(c31722Am1.m115293j(), x94), new C45086mR3(c31722Am1), C35201Pi6.m89901c(), new C37339Ym2(new X94() { // from class: Qm1
            @Override // p000.X94
            public final Object get() {
                C46908pW1 m47254y;
                m47254y = C18343a.m47254y(C31722Am1.this);
                return m47254y;
            }
        }), new C40554en4());
    }

    /* renamed from: p */
    public static C18343a m47263p() {
        return m47262q(C31722Am1.m115292k());
    }

    /* renamed from: q */
    public static C18343a m47262q(C31722Am1 c31722Am1) {
        boolean z;
        if (c31722Am1 != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Null is not a valid value of FirebaseApp.");
        return (C18343a) c31722Am1.m115294i(InterfaceC35934Sm1.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m47256w() {
        m47255x(false);
    }

    /* renamed from: y */
    public static /* synthetic */ C46908pW1 m47254y(C31722Am1 c31722Am1) {
        return new C46908pW1(c31722Am1);
    }

    /* renamed from: A */
    public final String m47284A(AbstractC45679nR3 abstractC45679nR3) {
        if ((!this.f74273a.m115291l().equals("CHIME_ANDROID_SDK") && !this.f74273a.m115283t()) || !abstractC45679nR3.m23768m()) {
            return this.f74278f.m42559a();
        }
        String m19157f = m47264o().m19157f();
        if (TextUtils.isEmpty(m19157f)) {
            return this.f74278f.m42559a();
        }
        return m19157f;
    }

    /* renamed from: B */
    public final AbstractC45679nR3 m47283B(AbstractC45679nR3 abstractC45679nR3) throws FirebaseInstallationsException {
        String str;
        if (abstractC45679nR3.mo23777d() != null && abstractC45679nR3.mo23777d().length() == 11) {
            str = m47264o().m19154i();
        } else {
            str = null;
        }
        Z42 m93456d = this.f74274b.m93456d(m47267l(), abstractC45679nR3.mo23777d(), m47259t(), m47266m(), str);
        int i = C18345b.f74286a[m93456d.mo73779e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return abstractC45679nR3.m23764q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
        }
        return abstractC45679nR3.m23762s(m93456d.mo73781c(), m93456d.mo73780d(), this.f74276d.m89902b(), m93456d.mo73782b().mo14791c(), m93456d.mo73782b().mo14790d());
    }

    /* renamed from: C */
    public final void m47282C(Exception exc) {
        synchronized (this.f74279g) {
            Iterator<AP5> it = this.f74284l.iterator();
            while (it.hasNext()) {
                if (it.next().mo27682a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: D */
    public final void m47281D(AbstractC45679nR3 abstractC45679nR3) {
        synchronized (this.f74279g) {
            Iterator<AP5> it = this.f74284l.iterator();
            while (it.hasNext()) {
                if (it.next().mo27681b(abstractC45679nR3)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: E */
    public final synchronized void m47280E(String str) {
        this.f74282j = str;
    }

    /* renamed from: F */
    public final synchronized void m47279F(AbstractC45679nR3 abstractC45679nR3, AbstractC45679nR3 abstractC45679nR32) {
        if (this.f74283k.size() != 0 && !TextUtils.equals(abstractC45679nR3.mo23777d(), abstractC45679nR32.mo23777d())) {
            for (InterfaceC35214Pk1 interfaceC35214Pk1 : this.f74283k) {
                interfaceC35214Pk1.m89876a(abstractC45679nR32.mo23777d());
            }
        }
    }

    @Override // p000.InterfaceC35934Sm1
    /* renamed from: a */
    public Task<AbstractC37749a52> mo47278a(final boolean z) {
        m47253z();
        Task<AbstractC37749a52> m47273f = m47273f();
        this.f74280h.execute(new Runnable() { // from class: Om1
            @Override // java.lang.Runnable
            public final void run() {
                C18343a.this.m47255x(z);
            }
        });
        return m47273f;
    }

    /* renamed from: f */
    public final Task<AbstractC37749a52> m47273f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m47271h(new C43763kC1(this.f74276d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public final Task<String> m47272g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m47271h(new C44356lC1(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // p000.InterfaceC35934Sm1
    public Task<String> getId() {
        m47253z();
        String m47265n = m47265n();
        if (m47265n != null) {
            return Tasks.forResult(m47265n);
        }
        Task<String> m47272g = m47272g();
        this.f74280h.execute(new Runnable() { // from class: Pm1
            @Override // java.lang.Runnable
            public final void run() {
                C18343a.this.m47256w();
            }
        });
        return m47272g;
    }

    /* renamed from: h */
    public final void m47271h(AP5 ap5) {
        synchronized (this.f74279g) {
            this.f74284l.add(ap5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m47257v(boolean z) {
        AbstractC45679nR3 m47283B;
        AbstractC45679nR3 m47261r = m47261r();
        try {
            if (!m47261r.m23772i() && !m47261r.m23769l()) {
                if (!z && !this.f74276d.m89898f(m47261r)) {
                    return;
                }
                m47283B = m47268k(m47261r);
                m47258u(m47283B);
                m47279F(m47261r, m47283B);
                if (m47283B.m23770k()) {
                    m47280E(m47283B.mo23777d());
                }
                if (!m47283B.m23772i()) {
                    m47282C(new FirebaseInstallationsException(FirebaseInstallationsException.EnumC18342a.BAD_CONFIG));
                    return;
                } else if (m47283B.m23771j()) {
                    m47282C(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    return;
                } else {
                    m47281D(m47283B);
                    return;
                }
            }
            m47283B = m47283B(m47261r);
            m47258u(m47283B);
            m47279F(m47261r, m47283B);
            if (m47283B.m23770k()) {
            }
            if (!m47283B.m23772i()) {
            }
        } catch (FirebaseInstallationsException e) {
            m47282C(e);
        }
    }

    /* renamed from: j */
    public final void m47255x(final boolean z) {
        AbstractC45679nR3 m47260s = m47260s();
        if (z) {
            m47260s = m47260s.m23765p();
        }
        m47281D(m47260s);
        this.f74281i.execute(new Runnable() { // from class: Rm1
            @Override // java.lang.Runnable
            public final void run() {
                C18343a.this.m47257v(z);
            }
        });
    }

    /* renamed from: k */
    public final AbstractC45679nR3 m47268k(AbstractC45679nR3 abstractC45679nR3) throws FirebaseInstallationsException {
        AbstractC48443s56 m93455e = this.f74274b.m93455e(m47267l(), abstractC45679nR3.mo23777d(), m47259t(), abstractC45679nR3.mo23775f());
        int i = C18345b.f74287b[m93455e.mo14792b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m47280E(null);
                    return abstractC45679nR3.m23763r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC18342a.UNAVAILABLE);
            }
            return abstractC45679nR3.m23764q("BAD CONFIG");
        }
        return abstractC45679nR3.m23766o(m93455e.mo14791c(), m93455e.mo14790d(), this.f74276d.m89902b());
    }

    /* renamed from: l */
    public String m47267l() {
        return this.f74273a.m115290m().m18706b();
    }

    /* renamed from: m */
    public String m47266m() {
        return this.f74273a.m115290m().m18705c();
    }

    /* renamed from: n */
    public final synchronized String m47265n() {
        return this.f74282j;
    }

    /* renamed from: o */
    public final C46908pW1 m47264o() {
        return this.f74277e.get();
    }

    /* renamed from: r */
    public final AbstractC45679nR3 m47261r() {
        AbstractC45679nR3 m25625d;
        synchronized (f74271m) {
            RE0 m87015a = RE0.m87015a(this.f74273a.m115293j(), "generatefid.lock");
            m25625d = this.f74275c.m25625d();
            if (m87015a != null) {
                m87015a.m87014b();
            }
        }
        return m25625d;
    }

    /* renamed from: s */
    public final AbstractC45679nR3 m47260s() {
        AbstractC45679nR3 m25625d;
        synchronized (f74271m) {
            RE0 m87015a = RE0.m87015a(this.f74273a.m115293j(), "generatefid.lock");
            m25625d = this.f74275c.m25625d();
            if (m25625d.m23771j()) {
                m25625d = this.f74275c.m25627b(m25625d.m23761t(m47284A(m25625d)));
            }
            if (m87015a != null) {
                m87015a.m87014b();
            }
        }
        return m25625d;
    }

    /* renamed from: t */
    public String m47259t() {
        return this.f74273a.m115290m().m18703e();
    }

    /* renamed from: u */
    public final void m47258u(AbstractC45679nR3 abstractC45679nR3) {
        synchronized (f74271m) {
            RE0 m87015a = RE0.m87015a(this.f74273a.m115293j(), "generatefid.lock");
            this.f74275c.m25627b(abstractC45679nR3);
            if (m87015a != null) {
                m87015a.m87014b();
            }
        }
    }

    /* renamed from: z */
    public final void m47253z() {
        Preconditions.checkNotEmpty(m47266m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(m47259t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(m47267l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(C35201Pi6.m89896h(m47266m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(C35201Pi6.m89897g(m47267l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C18343a(ExecutorService executorService, Executor executor, C31722Am1 c31722Am1, C34764Nm1 c34764Nm1, C45086mR3 c45086mR3, C35201Pi6 c35201Pi6, C37339Ym2<C46908pW1> c37339Ym2, C40554en4 c40554en4) {
        this.f74279g = new Object();
        this.f74283k = new HashSet();
        this.f74284l = new ArrayList();
        this.f74273a = c31722Am1;
        this.f74274b = c34764Nm1;
        this.f74275c = c45086mR3;
        this.f74276d = c35201Pi6;
        this.f74277e = c37339Ym2;
        this.f74278f = c40554en4;
        this.f74280h = executorService;
        this.f74281i = executor;
    }
}
