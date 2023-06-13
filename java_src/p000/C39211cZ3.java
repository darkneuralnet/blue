package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.util.Log;
import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23466d;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
/* renamed from: cZ3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39211cZ3 implements I73 {

    /* renamed from: cZ3$a */
    /* loaded from: classes5.dex */
    public class C13595a implements InterfaceC24579z<C32063By0> {

        /* renamed from: b */
        public final /* synthetic */ Context f60905b;

        /* renamed from: c */
        public final /* synthetic */ IntentFilter f60906c;

        /* renamed from: cZ3$a$a */
        /* loaded from: classes5.dex */
        public class C13596a extends BroadcastReceiver {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC24578y f60908a;

            public C13596a(InterfaceC24578y interfaceC24578y) {
                this.f60908a = interfaceC24578y;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f60908a.onNext(C32063By0.m113249c(context));
            }
        }

        /* renamed from: cZ3$a$b */
        /* loaded from: classes5.dex */
        public class C13597b implements InterfaceC23478a {

            /* renamed from: b */
            public final /* synthetic */ BroadcastReceiver f60910b;

            public C13597b(BroadcastReceiver broadcastReceiver) {
                this.f60910b = broadcastReceiver;
            }

            @Override // io.reactivex.functions.InterfaceC23478a
            public void run() {
                C13595a c13595a = C13595a.this;
                C39211cZ3.this.m61212e(c13595a.f60905b, this.f60910b);
            }
        }

        public C13595a(Context context, IntentFilter intentFilter) {
            this.f60905b = context;
            this.f60906c = intentFilter;
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<C32063By0> interfaceC24578y) throws Exception {
            C13596a c13596a = new C13596a(interfaceC24578y);
            this.f60905b.registerReceiver(c13596a, this.f60906c);
            interfaceC24578y.mo11915b(C39211cZ3.this.m61214c(new C13597b(c13596a)));
        }
    }

    /* renamed from: cZ3$b */
    /* loaded from: classes5.dex */
    public class C13598b implements InterfaceC23478a {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC23478a f60912b;

        /* renamed from: cZ3$b$a */
        /* loaded from: classes5.dex */
        public class RunnableC13599a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AbstractC23437E.AbstractC23440c f60914b;

            public RunnableC13599a(AbstractC23437E.AbstractC23440c abstractC23440c) {
                this.f60914b = abstractC23440c;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C13598b.this.f60912b.run();
                } catch (Exception e) {
                    C39211cZ3.this.m61213d("Could not unregister receiver in UI Thread", e);
                }
                this.f60914b.dispose();
            }
        }

        public C13598b(InterfaceC23478a interfaceC23478a) {
            this.f60912b = interfaceC23478a;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() throws Exception {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                this.f60912b.run();
                return;
            }
            AbstractC23437E.AbstractC23440c mo8041b = C23454a.m33087a().mo8041b();
            mo8041b.mo32320b(new RunnableC13599a(mo8041b));
        }
    }

    @Override // p000.I73
    /* renamed from: a */
    public Observable<C32063By0> mo21300a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return Observable.create(new C13595a(context, intentFilter)).defaultIfEmpty(C32063By0.m113250b());
    }

    /* renamed from: c */
    public final InterfaceC23465c m61214c(InterfaceC23478a interfaceC23478a) {
        return C23466d.m33021c(new C13598b(interfaceC23478a));
    }

    /* renamed from: d */
    public void m61213d(String str, Exception exc) {
        Log.e("ReactiveNetwork", str, exc);
    }

    /* renamed from: e */
    public void m61212e(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            m61213d("receiver was already unregistered", e);
        }
    }
}
