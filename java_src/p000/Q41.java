package p000;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p000.K73;
/* renamed from: Q41 */
/* loaded from: classes6.dex */
public class Q41 {

    /* renamed from: a */
    public final HandlerThreadC6672b f29782a;

    /* renamed from: b */
    public final Context f29783b;

    /* renamed from: c */
    public final ExecutorService f29784c;

    /* renamed from: d */
    public final InterfaceC38351b61 f29785d;

    /* renamed from: e */
    public final Map<String, RunnableC9043WT> f29786e;

    /* renamed from: f */
    public final Map<Object, AbstractC30874z2> f29787f;

    /* renamed from: g */
    public final Map<Object, AbstractC30874z2> f29788g;

    /* renamed from: h */
    public final Set<Object> f29789h;

    /* renamed from: i */
    public final Handler f29790i;

    /* renamed from: j */
    public final Handler f29791j;

    /* renamed from: k */
    public final InterfaceC37777a80 f29792k;

    /* renamed from: l */
    public final C44486lQ5 f29793l;

    /* renamed from: m */
    public final List<RunnableC9043WT> f29794m;

    /* renamed from: n */
    public final C6673c f29795n;

    /* renamed from: o */
    public final boolean f29796o;

    /* renamed from: p */
    public boolean f29797p;

    /* renamed from: Q41$a */
    /* loaded from: classes6.dex */
    public static class HandlerC6670a extends Handler {

        /* renamed from: a */
        public final Q41 f29798a;

        /* renamed from: Q41$a$a */
        /* loaded from: classes6.dex */
        public class RunnableC6671a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Message f29799b;

            public RunnableC6671a(Message message) {
                this.f29799b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f29799b.what);
            }
        }

        public HandlerC6670a(Looper looper, Q41 q41) {
            super(looper);
            this.f29798a = q41;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f29798a.m88957v((AbstractC30874z2) message.obj);
                    return;
                case 2:
                    this.f29798a.m88964o((AbstractC30874z2) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    C42732iT3.f87356o.post(new RunnableC6671a(message));
                    return;
                case 4:
                    this.f29798a.m88963p((RunnableC9043WT) message.obj);
                    return;
                case 5:
                    this.f29798a.m88958u((RunnableC9043WT) message.obj);
                    return;
                case 6:
                    this.f29798a.m88962q((RunnableC9043WT) message.obj, false);
                    return;
                case 7:
                    this.f29798a.m88965n();
                    return;
                case 9:
                    this.f29798a.m88961r((NetworkInfo) message.obj);
                    return;
                case 10:
                    Q41 q41 = this.f29798a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    q41.m88966m(z);
                    return;
                case 11:
                    this.f29798a.m88960s(message.obj);
                    return;
                case 12:
                    this.f29798a.m88959t(message.obj);
                    return;
            }
        }
    }

    /* renamed from: Q41$b */
    /* loaded from: classes6.dex */
    public static class HandlerThreadC6672b extends HandlerThread {
        public HandlerThreadC6672b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: Q41$c */
    /* loaded from: classes6.dex */
    public static class C6673c extends BroadcastReceiver {

        /* renamed from: a */
        public final Q41 f29801a;

        public C6673c(Q41 q41) {
            this.f29801a = q41;
        }

        /* renamed from: a */
        public void m88955a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f29801a.f29796o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f29801a.f29783b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (!intent.hasExtra(TransferTable.COLUMN_STATE)) {
                    return;
                }
                this.f29801a.m88977b(intent.getBooleanExtra(TransferTable.COLUMN_STATE, false));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f29801a.m88973f(((ConnectivityManager) C32861Fi6.m106698n(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public Q41(Context context, ExecutorService executorService, Handler handler, InterfaceC38351b61 interfaceC38351b61, InterfaceC37777a80 interfaceC37777a80, C44486lQ5 c44486lQ5) {
        HandlerThreadC6672b handlerThreadC6672b = new HandlerThreadC6672b();
        this.f29782a = handlerThreadC6672b;
        handlerThreadC6672b.start();
        C32861Fi6.m106704h(handlerThreadC6672b.getLooper());
        this.f29783b = context;
        this.f29784c = executorService;
        this.f29786e = new LinkedHashMap();
        this.f29787f = new WeakHashMap();
        this.f29788g = new WeakHashMap();
        this.f29789h = new LinkedHashSet();
        this.f29790i = new HandlerC6670a(handlerThreadC6672b.getLooper(), this);
        this.f29785d = interfaceC38351b61;
        this.f29791j = handler;
        this.f29792k = interfaceC37777a80;
        this.f29793l = c44486lQ5;
        this.f29794m = new ArrayList(4);
        this.f29797p = C32861Fi6.m106696p(context);
        this.f29796o = C32861Fi6.m106697o(context, "android.permission.ACCESS_NETWORK_STATE");
        C6673c c6673c = new C6673c(this);
        this.f29795n = c6673c;
        c6673c.m88955a();
    }

    /* renamed from: a */
    public final void m88978a(RunnableC9043WT runnableC9043WT) {
        if (runnableC9043WT.m78350u()) {
            return;
        }
        Bitmap bitmap = runnableC9043WT.f41099n;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.f29794m.add(runnableC9043WT);
        if (!this.f29790i.hasMessages(7)) {
            this.f29790i.sendEmptyMessageDelayed(7, 200L);
        }
    }

    /* renamed from: b */
    public void m88977b(boolean z) {
        Handler handler = this.f29790i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* renamed from: c */
    public void m88976c(AbstractC30874z2 abstractC30874z2) {
        Handler handler = this.f29790i;
        handler.sendMessage(handler.obtainMessage(2, abstractC30874z2));
    }

    /* renamed from: d */
    public void m88975d(RunnableC9043WT runnableC9043WT) {
        Handler handler = this.f29790i;
        handler.sendMessage(handler.obtainMessage(4, runnableC9043WT));
    }

    /* renamed from: e */
    public void m88974e(RunnableC9043WT runnableC9043WT) {
        Handler handler = this.f29790i;
        handler.sendMessage(handler.obtainMessage(6, runnableC9043WT));
    }

    /* renamed from: f */
    public void m88973f(NetworkInfo networkInfo) {
        Handler handler = this.f29790i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* renamed from: g */
    public void m88972g(RunnableC9043WT runnableC9043WT) {
        Handler handler = this.f29790i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC9043WT), 500L);
    }

    /* renamed from: h */
    public void m88971h(AbstractC30874z2 abstractC30874z2) {
        Handler handler = this.f29790i;
        handler.sendMessage(handler.obtainMessage(1, abstractC30874z2));
    }

    /* renamed from: i */
    public final void m88970i() {
        if (!this.f29787f.isEmpty()) {
            Iterator<AbstractC30874z2> it = this.f29787f.values().iterator();
            while (it.hasNext()) {
                AbstractC30874z2 next = it.next();
                it.remove();
                if (next.m1984g().f87370m) {
                    C32861Fi6.m106693s("Dispatcher", "replaying", next.m1982i().m17647d());
                }
                m88956w(next, false);
            }
        }
    }

    /* renamed from: j */
    public final void m88969j(List<RunnableC9043WT> list) {
        if (list != null && !list.isEmpty() && list.get(0).m78354q().f87370m) {
            StringBuilder sb = new StringBuilder();
            for (RunnableC9043WT runnableC9043WT : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C32861Fi6.m106702j(runnableC9043WT));
            }
            C32861Fi6.m106693s("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: k */
    public final void m88968k(AbstractC30874z2 abstractC30874z2) {
        Object m1980k = abstractC30874z2.m1980k();
        if (m1980k != null) {
            abstractC30874z2.f120638k = true;
            this.f29787f.put(m1980k, abstractC30874z2);
        }
    }

    /* renamed from: l */
    public final void m88967l(RunnableC9043WT runnableC9043WT) {
        AbstractC30874z2 m78363h = runnableC9043WT.m78363h();
        if (m78363h != null) {
            m88968k(m78363h);
        }
        List<AbstractC30874z2> m78362i = runnableC9043WT.m78362i();
        if (m78362i != null) {
            int size = m78362i.size();
            for (int i = 0; i < size; i++) {
                m88968k(m78362i.get(i));
            }
        }
    }

    /* renamed from: m */
    public void m88966m(boolean z) {
        this.f29797p = z;
    }

    /* renamed from: n */
    public void m88965n() {
        ArrayList arrayList = new ArrayList(this.f29794m);
        this.f29794m.clear();
        Handler handler = this.f29791j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m88969j(arrayList);
    }

    /* renamed from: o */
    public void m88964o(AbstractC30874z2 abstractC30874z2) {
        String m1987d = abstractC30874z2.m1987d();
        RunnableC9043WT runnableC9043WT = this.f29786e.get(m1987d);
        if (runnableC9043WT != null) {
            runnableC9043WT.m78365f(abstractC30874z2);
            if (runnableC9043WT.m78368c()) {
                this.f29786e.remove(m1987d);
                if (abstractC30874z2.m1984g().f87370m) {
                    C32861Fi6.m106693s("Dispatcher", "canceled", abstractC30874z2.m1982i().m17647d());
                }
            }
        }
        if (this.f29789h.contains(abstractC30874z2.m1981j())) {
            this.f29788g.remove(abstractC30874z2.m1980k());
            if (abstractC30874z2.m1984g().f87370m) {
                C32861Fi6.m106692t("Dispatcher", "canceled", abstractC30874z2.m1982i().m17647d(), "because paused request got canceled");
            }
        }
        AbstractC30874z2 remove = this.f29787f.remove(abstractC30874z2.m1980k());
        if (remove != null && remove.m1984g().f87370m) {
            C32861Fi6.m106692t("Dispatcher", "canceled", remove.m1982i().m17647d(), "from replaying");
        }
    }

    /* renamed from: p */
    public void m88963p(RunnableC9043WT runnableC9043WT) {
        if (TP2.m83670b(runnableC9043WT.m78355p())) {
            this.f29792k.set(runnableC9043WT.m78357n(), runnableC9043WT.m78352s());
        }
        this.f29786e.remove(runnableC9043WT.m78357n());
        m88978a(runnableC9043WT);
        if (runnableC9043WT.m78354q().f87370m) {
            C32861Fi6.m106692t("Dispatcher", "batched", C32861Fi6.m106702j(runnableC9043WT), "for completion");
        }
    }

    /* renamed from: q */
    public void m88962q(RunnableC9043WT runnableC9043WT, boolean z) {
        String str;
        if (runnableC9043WT.m78354q().f87370m) {
            String m106702j = C32861Fi6.m106702j(runnableC9043WT);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            if (z) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb.append(str);
            C32861Fi6.m106692t("Dispatcher", "batched", m106702j, sb.toString());
        }
        this.f29786e.remove(runnableC9043WT.m78357n());
        m88978a(runnableC9043WT);
    }

    /* renamed from: r */
    public void m88961r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f29784c;
        if (executorService instanceof C43918kT3) {
            ((C43918kT3) executorService).m28928a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m88970i();
        }
    }

    /* renamed from: s */
    public void m88960s(Object obj) {
        boolean z;
        if (!this.f29789h.add(obj)) {
            return;
        }
        Iterator<RunnableC9043WT> it = this.f29786e.values().iterator();
        while (it.hasNext()) {
            RunnableC9043WT next = it.next();
            boolean z2 = next.m78354q().f87370m;
            AbstractC30874z2 m78363h = next.m78363h();
            List<AbstractC30874z2> m78362i = next.m78362i();
            if (m78362i != null && !m78362i.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (m78363h != null || z) {
                if (m78363h != null && m78363h.m1981j().equals(obj)) {
                    next.m78365f(m78363h);
                    this.f29788g.put(m78363h.m1980k(), m78363h);
                    if (z2) {
                        C32861Fi6.m106692t("Dispatcher", "paused", m78363h.f120629b.m17647d(), "because tag '" + obj + "' was paused");
                    }
                }
                if (z) {
                    for (int size = m78362i.size() - 1; size >= 0; size--) {
                        AbstractC30874z2 abstractC30874z2 = m78362i.get(size);
                        if (abstractC30874z2.m1981j().equals(obj)) {
                            next.m78365f(abstractC30874z2);
                            this.f29788g.put(abstractC30874z2.m1980k(), abstractC30874z2);
                            if (z2) {
                                C32861Fi6.m106692t("Dispatcher", "paused", abstractC30874z2.f120629b.m17647d(), "because tag '" + obj + "' was paused");
                            }
                        }
                    }
                }
                if (next.m78368c()) {
                    it.remove();
                    if (z2) {
                        C32861Fi6.m106692t("Dispatcher", "canceled", C32861Fi6.m106702j(next), "all actions paused");
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public void m88959t(Object obj) {
        if (!this.f29789h.remove(obj)) {
            return;
        }
        Iterator<AbstractC30874z2> it = this.f29788g.values().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC30874z2 next = it.next();
            if (next.m1981j().equals(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
                it.remove();
            }
        }
        if (arrayList != null) {
            Handler handler = this.f29791j;
            handler.sendMessage(handler.obtainMessage(13, arrayList));
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: u */
    public void m88958u(RunnableC9043WT runnableC9043WT) {
        NetworkInfo networkInfo;
        if (runnableC9043WT.m78350u()) {
            return;
        }
        boolean z = false;
        if (this.f29784c.isShutdown()) {
            m88962q(runnableC9043WT, false);
            return;
        }
        if (this.f29796o) {
            networkInfo = ((ConnectivityManager) C32861Fi6.m106698n(this.f29783b, "connectivity")).getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (runnableC9043WT.m78348w(this.f29797p, networkInfo)) {
            if (runnableC9043WT.m78354q().f87370m) {
                C32861Fi6.m106693s("Dispatcher", "retrying", C32861Fi6.m106702j(runnableC9043WT));
            }
            if (runnableC9043WT.m78360k() instanceof K73.C4346a) {
                runnableC9043WT.f41095j |= J73.NO_CACHE.f16870b;
            }
            runnableC9043WT.f41100o = this.f29784c.submit(runnableC9043WT);
            return;
        }
        if (this.f29796o && runnableC9043WT.m78347x()) {
            z = true;
        }
        m88962q(runnableC9043WT, z);
        if (z) {
            m88967l(runnableC9043WT);
        }
    }

    /* renamed from: v */
    public void m88957v(AbstractC30874z2 abstractC30874z2) {
        m88956w(abstractC30874z2, true);
    }

    /* renamed from: w */
    public void m88956w(AbstractC30874z2 abstractC30874z2, boolean z) {
        if (this.f29789h.contains(abstractC30874z2.m1981j())) {
            this.f29788g.put(abstractC30874z2.m1980k(), abstractC30874z2);
            if (abstractC30874z2.m1984g().f87370m) {
                String m17647d = abstractC30874z2.f120629b.m17647d();
                C32861Fi6.m106692t("Dispatcher", "paused", m17647d, "because tag '" + abstractC30874z2.m1981j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC9043WT runnableC9043WT = this.f29786e.get(abstractC30874z2.m1987d());
        if (runnableC9043WT != null) {
            runnableC9043WT.m78369b(abstractC30874z2);
        } else if (this.f29784c.isShutdown()) {
            if (abstractC30874z2.m1984g().f87370m) {
                C32861Fi6.m106692t("Dispatcher", "ignored", abstractC30874z2.f120629b.m17647d(), "because shut down");
            }
        } else {
            RunnableC9043WT m78364g = RunnableC9043WT.m78364g(abstractC30874z2.m1984g(), this, this.f29792k, this.f29793l, abstractC30874z2);
            m78364g.f41100o = this.f29784c.submit(m78364g);
            this.f29786e.put(abstractC30874z2.m1987d(), m78364g);
            if (z) {
                this.f29787f.remove(abstractC30874z2.m1980k());
            }
            if (abstractC30874z2.m1984g().f87370m) {
                C32861Fi6.m106693s("Dispatcher", "enqueued", abstractC30874z2.f120629b.m17647d());
            }
        }
    }
}
