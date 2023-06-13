package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p000.AbstractC30874z2;
/* renamed from: iT3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42732iT3 {

    /* renamed from: o */
    public static final Handler f87356o = new HandlerC23261a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: p */
    public static volatile C42732iT3 f87357p = null;

    /* renamed from: a */
    public final InterfaceC23268g f87358a;

    /* renamed from: b */
    public final C23263c f87359b;

    /* renamed from: c */
    public final List<PI4> f87360c;

    /* renamed from: d */
    public final Context f87361d;

    /* renamed from: e */
    public final Q41 f87362e;

    /* renamed from: f */
    public final InterfaceC37777a80 f87363f;

    /* renamed from: g */
    public final C44486lQ5 f87364g;

    /* renamed from: h */
    public final Map<Object, AbstractC30874z2> f87365h;

    /* renamed from: i */
    public final Map<ImageView, ViewTreeObserver$OnPreDrawListenerC43969kZ0> f87366i;

    /* renamed from: j */
    public final ReferenceQueue<Object> f87367j;

    /* renamed from: k */
    public final Bitmap.Config f87368k;

    /* renamed from: l */
    public boolean f87369l;

    /* renamed from: m */
    public volatile boolean f87370m;

    /* renamed from: n */
    public boolean f87371n;

    /* renamed from: iT3$a */
    /* loaded from: classes6.dex */
    public static class HandlerC23261a extends Handler {
        public HandlerC23261a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i != 8) {
                    if (i == 13) {
                        List list = (List) message.obj;
                        int size = list.size();
                        while (i2 < size) {
                            AbstractC30874z2 abstractC30874z2 = (AbstractC30874z2) list.get(i2);
                            abstractC30874z2.f120628a.m33875n(abstractC30874z2);
                            i2++;
                        }
                        return;
                    }
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    RunnableC9043WT runnableC9043WT = (RunnableC9043WT) list2.get(i2);
                    runnableC9043WT.f41088c.m33885d(runnableC9043WT);
                    i2++;
                }
                return;
            }
            AbstractC30874z2 abstractC30874z22 = (AbstractC30874z2) message.obj;
            if (abstractC30874z22.m1984g().f87370m) {
                C32861Fi6.m106692t("Main", "canceled", abstractC30874z22.f120629b.m17647d(), "target got garbage collected");
            }
            abstractC30874z22.f120628a.m33888a(abstractC30874z22.m1980k());
        }
    }

    /* renamed from: iT3$b */
    /* loaded from: classes6.dex */
    public static class C23262b {

        /* renamed from: a */
        public final Context f87372a;

        /* renamed from: b */
        public InterfaceC38351b61 f87373b;

        /* renamed from: c */
        public ExecutorService f87374c;

        /* renamed from: d */
        public InterfaceC37777a80 f87375d;

        /* renamed from: e */
        public InterfaceC23268g f87376e;

        /* renamed from: f */
        public List<PI4> f87377f;

        /* renamed from: g */
        public Bitmap.Config f87378g;

        /* renamed from: h */
        public boolean f87379h;

        /* renamed from: i */
        public boolean f87380i;

        public C23262b(Context context) {
            if (context != null) {
                this.f87372a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C42732iT3 m33872a() {
            Context context = this.f87372a;
            if (this.f87373b == null) {
                this.f87373b = new C33992Ke3(context);
            }
            if (this.f87375d == null) {
                this.f87375d = new C48525sE2(context);
            }
            if (this.f87374c == null) {
                this.f87374c = new C43918kT3();
            }
            if (this.f87376e == null) {
                this.f87376e = InterfaceC23268g.f87394a;
            }
            C44486lQ5 c44486lQ5 = new C44486lQ5(this.f87375d);
            return new C42732iT3(context, new Q41(context, this.f87374c, C42732iT3.f87356o, this.f87373b, this.f87375d, c44486lQ5), this.f87375d, null, this.f87376e, this.f87377f, c44486lQ5, this.f87378g, this.f87379h, this.f87380i);
        }

        /* renamed from: b */
        public C23262b m33871b(Bitmap.Config config) {
            if (config != null) {
                this.f87378g = config;
                return this;
            }
            throw new IllegalArgumentException("Bitmap config must not be null.");
        }

        /* renamed from: c */
        public C23262b m33870c(InterfaceC38351b61 interfaceC38351b61) {
            if (interfaceC38351b61 != null) {
                if (this.f87373b == null) {
                    this.f87373b = interfaceC38351b61;
                    return this;
                }
                throw new IllegalStateException("Downloader already set.");
            }
            throw new IllegalArgumentException("Downloader must not be null.");
        }

        /* renamed from: d */
        public C23262b m33869d(ExecutorService executorService) {
            if (executorService != null) {
                if (this.f87374c == null) {
                    this.f87374c = executorService;
                    return this;
                }
                throw new IllegalStateException("Executor service already set.");
            }
            throw new IllegalArgumentException("Executor service must not be null.");
        }
    }

    /* renamed from: iT3$c */
    /* loaded from: classes6.dex */
    public static class C23263c extends Thread {

        /* renamed from: b */
        public final ReferenceQueue<Object> f87381b;

        /* renamed from: c */
        public final Handler f87382c;

        /* renamed from: iT3$c$a */
        /* loaded from: classes6.dex */
        public class RunnableC23264a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Exception f87383b;

            public RunnableC23264a(Exception exc) {
                this.f87383b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f87383b);
            }
        }

        public C23263c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f87381b = referenceQueue;
            this.f87382c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC30874z2.C30875a c30875a = (AbstractC30874z2.C30875a) this.f87381b.remove(1000L);
                    Message obtainMessage = this.f87382c.obtainMessage();
                    if (c30875a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c30875a.f120640a;
                        this.f87382c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f87382c.post(new RunnableC23264a(e));
                    return;
                }
            }
        }
    }

    /* renamed from: iT3$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC23265d {
    }

    /* renamed from: iT3$e */
    /* loaded from: classes6.dex */
    public enum EnumC23266e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: b */
        public final int f87389b;

        EnumC23266e(int i) {
            this.f87389b = i;
        }
    }

    /* renamed from: iT3$f */
    /* loaded from: classes6.dex */
    public enum EnumC23267f {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: iT3$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC23268g {

        /* renamed from: a */
        public static final InterfaceC23268g f87394a = new C23269a();

        /* renamed from: iT3$g$a */
        /* loaded from: classes6.dex */
        public static class C23269a implements InterfaceC23268g {
            @Override // p000.C42732iT3.InterfaceC23268g
            /* renamed from: a */
            public C47378qI4 mo33868a(C47378qI4 c47378qI4) {
                return c47378qI4;
            }
        }

        /* renamed from: a */
        C47378qI4 mo33868a(C47378qI4 c47378qI4);
    }

    public C42732iT3(Context context, Q41 q41, InterfaceC37777a80 interfaceC37777a80, InterfaceC23265d interfaceC23265d, InterfaceC23268g interfaceC23268g, List<PI4> list, C44486lQ5 c44486lQ5, Bitmap.Config config, boolean z, boolean z2) {
        int i;
        this.f87361d = context;
        this.f87362e = q41;
        this.f87363f = interfaceC37777a80;
        this.f87358a = interfaceC23268g;
        this.f87368k = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new C48599sM4(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C49564tz0(context));
        arrayList.add(new IP2(context));
        arrayList.add(new GA0(context));
        arrayList.add(new C9995Yo(context));
        arrayList.add(new C47647ql1(context));
        arrayList.add(new K73(q41.f29785d, c44486lQ5));
        this.f87360c = Collections.unmodifiableList(arrayList);
        this.f87364g = c44486lQ5;
        this.f87365h = new WeakHashMap();
        this.f87366i = new WeakHashMap();
        this.f87369l = z;
        this.f87370m = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f87367j = referenceQueue;
        C23263c c23263c = new C23263c(referenceQueue, f87356o);
        this.f87359b = c23263c;
        c23263c.start();
    }

    /* renamed from: h */
    public static C42732iT3 m33881h() {
        if (f87357p == null) {
            synchronized (C42732iT3.class) {
                if (f87357p == null) {
                    Context context = PicassoProvider.f75247b;
                    if (context != null) {
                        f87357p = new C23262b(context).m33872a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f87357p;
    }

    /* renamed from: a */
    public void m33888a(Object obj) {
        C32861Fi6.m106709c();
        AbstractC30874z2 remove = this.f87365h.remove(obj);
        if (remove != null) {
            remove.mo1990a();
            this.f87362e.m88976c(remove);
        }
        if (obj instanceof ImageView) {
            ViewTreeObserver$OnPreDrawListenerC43969kZ0 remove2 = this.f87366i.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.m28836a();
            }
        }
    }

    /* renamed from: b */
    public void m33887b(MY5 my5) {
        if (my5 != null) {
            m33888a(my5);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    /* renamed from: c */
    public void m33886c(ImageView imageView) {
        if (imageView != null) {
            m33888a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* renamed from: d */
    public void m33885d(RunnableC9043WT runnableC9043WT) {
        boolean z;
        AbstractC30874z2 m78363h = runnableC9043WT.m78363h();
        List<AbstractC30874z2> m78362i = runnableC9043WT.m78362i();
        boolean z2 = true;
        if (m78362i != null && !m78362i.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (m78363h == null && !z) {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        Uri uri = runnableC9043WT.m78361j().f105059d;
        Exception m78360k = runnableC9043WT.m78360k();
        Bitmap m78352s = runnableC9043WT.m78352s();
        EnumC23266e m78356o = runnableC9043WT.m78356o();
        if (m78363h != null) {
            m33883f(m78352s, m78356o, m78363h, m78360k);
        }
        if (z) {
            int size = m78362i.size();
            for (int i = 0; i < size; i++) {
                m33883f(m78352s, m78356o, m78362i.get(i), m78360k);
            }
        }
    }

    /* renamed from: e */
    public void m33884e(ImageView imageView, ViewTreeObserver$OnPreDrawListenerC43969kZ0 viewTreeObserver$OnPreDrawListenerC43969kZ0) {
        if (this.f87366i.containsKey(imageView)) {
            m33888a(imageView);
        }
        this.f87366i.put(imageView, viewTreeObserver$OnPreDrawListenerC43969kZ0);
    }

    /* renamed from: f */
    public final void m33883f(Bitmap bitmap, EnumC23266e enumC23266e, AbstractC30874z2 abstractC30874z2, Exception exc) {
        if (abstractC30874z2.m1979l()) {
            return;
        }
        if (!abstractC30874z2.m1978m()) {
            this.f87365h.remove(abstractC30874z2.m1980k());
        }
        if (bitmap != null) {
            if (enumC23266e != null) {
                abstractC30874z2.mo1989b(bitmap, enumC23266e);
                if (this.f87370m) {
                    String m17647d = abstractC30874z2.f120629b.m17647d();
                    C32861Fi6.m106692t("Main", "completed", m17647d, "from " + enumC23266e);
                    return;
                }
                return;
            }
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC30874z2.mo1988c(exc);
        if (this.f87370m) {
            C32861Fi6.m106692t("Main", "errored", abstractC30874z2.f120629b.m17647d(), exc.getMessage());
        }
    }

    /* renamed from: g */
    public void m33882g(AbstractC30874z2 abstractC30874z2) {
        Object m1980k = abstractC30874z2.m1980k();
        if (m1980k != null && this.f87365h.get(m1980k) != abstractC30874z2) {
            m33888a(m1980k);
            this.f87365h.put(m1980k, abstractC30874z2);
        }
        m33874o(abstractC30874z2);
    }

    /* renamed from: i */
    public List<PI4> m33880i() {
        return this.f87360c;
    }

    /* renamed from: j */
    public FI4 m33879j(Uri uri) {
        return new FI4(this, uri, 0);
    }

    /* renamed from: k */
    public FI4 m33878k(File file) {
        if (file == null) {
            return new FI4(this, null, 0);
        }
        return m33879j(Uri.fromFile(file));
    }

    /* renamed from: l */
    public FI4 m33877l(String str) {
        if (str == null) {
            return new FI4(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return m33879j(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* renamed from: m */
    public Bitmap m33876m(String str) {
        Bitmap bitmap = this.f87363f.get(str);
        if (bitmap != null) {
            this.f87364g.m27308d();
        } else {
            this.f87364g.m27307e();
        }
        return bitmap;
    }

    /* renamed from: n */
    public void m33875n(AbstractC30874z2 abstractC30874z2) {
        Bitmap bitmap;
        if (TP2.m83671a(abstractC30874z2.f120632e)) {
            bitmap = m33876m(abstractC30874z2.m1987d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            EnumC23266e enumC23266e = EnumC23266e.MEMORY;
            m33883f(bitmap, enumC23266e, abstractC30874z2, null);
            if (this.f87370m) {
                C32861Fi6.m106692t("Main", "completed", abstractC30874z2.f120629b.m17647d(), "from " + enumC23266e);
                return;
            }
            return;
        }
        m33882g(abstractC30874z2);
        if (this.f87370m) {
            C32861Fi6.m106693s("Main", "resumed", abstractC30874z2.f120629b.m17647d());
        }
    }

    /* renamed from: o */
    public void m33874o(AbstractC30874z2 abstractC30874z2) {
        this.f87362e.m88971h(abstractC30874z2);
    }

    /* renamed from: p */
    public C47378qI4 m33873p(C47378qI4 c47378qI4) {
        C47378qI4 mo33868a = this.f87358a.mo33868a(c47378qI4);
        if (mo33868a != null) {
            return mo33868a;
        }
        throw new IllegalStateException("Request transformer " + this.f87358a.getClass().getCanonicalName() + " returned null for " + c47378qI4);
    }
}
