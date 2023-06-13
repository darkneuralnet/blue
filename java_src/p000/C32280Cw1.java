package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import co.bird.android.model.Detail;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.C34386Lw1;
/* renamed from: Cw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32280Cw1 {

    /* renamed from: a */
    public static final C50303vE2<String, Typeface> f4926a = new C50303vE2<>(16);

    /* renamed from: b */
    public static final ExecutorService f4927b = JI4.m100724a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    public static final Object f4928c = new Object();

    /* renamed from: d */
    public static final NA5<String, ArrayList<InterfaceC48378rz0<C1260e>>> f4929d = new NA5<>();

    /* renamed from: Cw1$a */
    /* loaded from: classes.dex */
    public class CallableC1256a implements Callable<C1260e> {

        /* renamed from: b */
        public final /* synthetic */ String f4930b;

        /* renamed from: c */
        public final /* synthetic */ Context f4931c;

        /* renamed from: d */
        public final /* synthetic */ C53092zw1 f4932d;

        /* renamed from: e */
        public final /* synthetic */ int f4933e;

        public CallableC1256a(String str, Context context, C53092zw1 c53092zw1, int i) {
            this.f4930b = str;
            this.f4931c = context;
            this.f4932d = c53092zw1;
            this.f4933e = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1260e call() {
            return C32280Cw1.m111273c(this.f4930b, this.f4931c, this.f4932d, this.f4933e);
        }
    }

    /* renamed from: Cw1$b */
    /* loaded from: classes.dex */
    public class C1257b implements InterfaceC48378rz0<C1260e> {

        /* renamed from: a */
        public final /* synthetic */ P80 f4934a;

        public C1257b(P80 p80) {
            this.f4934a = p80;
        }

        @Override // p000.InterfaceC48378rz0
        /* renamed from: a */
        public void accept(C1260e c1260e) {
            if (c1260e == null) {
                c1260e = new C1260e(-3);
            }
            this.f4934a.m90713b(c1260e);
        }
    }

    /* renamed from: Cw1$c */
    /* loaded from: classes.dex */
    public class CallableC1258c implements Callable<C1260e> {

        /* renamed from: b */
        public final /* synthetic */ String f4935b;

        /* renamed from: c */
        public final /* synthetic */ Context f4936c;

        /* renamed from: d */
        public final /* synthetic */ C53092zw1 f4937d;

        /* renamed from: e */
        public final /* synthetic */ int f4938e;

        public CallableC1258c(String str, Context context, C53092zw1 c53092zw1, int i) {
            this.f4935b = str;
            this.f4936c = context;
            this.f4937d = c53092zw1;
            this.f4938e = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1260e call() {
            try {
                return C32280Cw1.m111273c(this.f4935b, this.f4936c, this.f4937d, this.f4938e);
            } catch (Throwable unused) {
                return new C1260e(-3);
            }
        }
    }

    /* renamed from: Cw1$d */
    /* loaded from: classes.dex */
    public class C1259d implements InterfaceC48378rz0<C1260e> {

        /* renamed from: a */
        public final /* synthetic */ String f4939a;

        public C1259d(String str) {
            this.f4939a = str;
        }

        @Override // p000.InterfaceC48378rz0
        /* renamed from: a */
        public void accept(C1260e c1260e) {
            synchronized (C32280Cw1.f4928c) {
                NA5<String, ArrayList<InterfaceC48378rz0<C1260e>>> na5 = C32280Cw1.f4929d;
                ArrayList<InterfaceC48378rz0<C1260e>> arrayList = na5.get(this.f4939a);
                if (arrayList == null) {
                    return;
                }
                na5.remove(this.f4939a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(c1260e);
                }
            }
        }
    }

    private C32280Cw1() {
    }

    /* renamed from: a */
    public static String m111275a(C53092zw1 c53092zw1, int i) {
        return c53092zw1.m104d() + Detail.EMPTY_CHAR + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m111274b(C34386Lw1.C5131a c5131a) {
        int i = 1;
        if (c5131a.m96112c() != 0) {
            if (c5131a.m96112c() != 1) {
                return -3;
            }
            return -2;
        }
        C34386Lw1.C5132b[] m96113b = c5131a.m96113b();
        if (m96113b != null && m96113b.length != 0) {
            i = 0;
            for (C34386Lw1.C5132b c5132b : m96113b) {
                int m96110b = c5132b.m96110b();
                if (m96110b != 0) {
                    if (m96110b < 0) {
                        return -3;
                    }
                    return m96110b;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C1260e m111273c(String str, Context context, C53092zw1 c53092zw1, int i) {
        C50303vE2<String, Typeface> c50303vE2 = f4926a;
        Typeface m8993d = c50303vE2.m8993d(str);
        if (m8993d != null) {
            return new C1260e(m8993d);
        }
        try {
            C34386Lw1.C5131a m2243e = C52499yw1.m2243e(context, c53092zw1, null);
            int m111274b = m111274b(m2243e);
            if (m111274b != 0) {
                return new C1260e(m111274b);
            }
            Typeface m100128b = C33734Jb6.m100128b(context, null, m2243e.m96113b(), i);
            if (m100128b != null) {
                c50303vE2.m8992e(str, m100128b);
                return new C1260e(m100128b);
            }
            return new C1260e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1260e(-1);
        }
    }

    /* renamed from: d */
    public static Typeface m111272d(Context context, C53092zw1 c53092zw1, int i, Executor executor, P80 p80) {
        String m111275a = m111275a(c53092zw1, i);
        Typeface m8993d = f4926a.m8993d(m111275a);
        if (m8993d != null) {
            p80.m90713b(new C1260e(m8993d));
            return m8993d;
        }
        C1257b c1257b = new C1257b(p80);
        synchronized (f4928c) {
            NA5<String, ArrayList<InterfaceC48378rz0<C1260e>>> na5 = f4929d;
            ArrayList<InterfaceC48378rz0<C1260e>> arrayList = na5.get(m111275a);
            if (arrayList != null) {
                arrayList.add(c1257b);
                return null;
            }
            ArrayList<InterfaceC48378rz0<C1260e>> arrayList2 = new ArrayList<>();
            arrayList2.add(c1257b);
            na5.put(m111275a, arrayList2);
            CallableC1258c callableC1258c = new CallableC1258c(m111275a, context, c53092zw1, i);
            if (executor == null) {
                executor = f4927b;
            }
            JI4.m100723b(executor, callableC1258c, new C1259d(m111275a));
            return null;
        }
    }

    /* renamed from: e */
    public static Typeface m111271e(Context context, C53092zw1 c53092zw1, P80 p80, int i, int i2) {
        String m111275a = m111275a(c53092zw1, i);
        Typeface m8993d = f4926a.m8993d(m111275a);
        if (m8993d != null) {
            p80.m90713b(new C1260e(m8993d));
            return m8993d;
        } else if (i2 == -1) {
            C1260e m111273c = m111273c(m111275a, context, c53092zw1, i);
            p80.m90713b(m111273c);
            return m111273c.f4940a;
        } else {
            try {
                C1260e c1260e = (C1260e) JI4.m100722c(f4927b, new CallableC1256a(m111275a, context, c53092zw1, i), i2);
                p80.m90713b(c1260e);
                return c1260e.f4940a;
            } catch (InterruptedException unused) {
                p80.m90713b(new C1260e(-3));
                return null;
            }
        }
    }

    /* renamed from: Cw1$e */
    /* loaded from: classes.dex */
    public static final class C1260e {

        /* renamed from: a */
        public final Typeface f4940a;

        /* renamed from: b */
        public final int f4941b;

        public C1260e(int i) {
            this.f4940a = null;
            this.f4941b = i;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m111266a() {
            return this.f4941b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C1260e(Typeface typeface) {
            this.f4940a = typeface;
            this.f4941b = 0;
        }
    }
}
