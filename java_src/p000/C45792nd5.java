package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.schedulers.C24542a;
/* renamed from: nd5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45792nd5 extends Observable<C26559b> {

    /* renamed from: b */
    public final Observable<C26559b> f100220b;

    /* renamed from: nd5$a */
    /* loaded from: classes6.dex */
    public class C26556a implements InterfaceC24579z<C26559b> {

        /* renamed from: b */
        public final /* synthetic */ Context f100221b;

        /* renamed from: nd5$a$a */
        /* loaded from: classes6.dex */
        public class C26557a extends BroadcastReceiver {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC24578y f100223a;

            public C26557a(InterfaceC24578y interfaceC24578y) {
                this.f100223a = interfaceC24578y;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C26559b m23402a = C45792nd5.m23402a(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1));
                C52323ye5.m3118k("Adapter state changed: %s", m23402a);
                this.f100223a.onNext(m23402a);
            }
        }

        /* renamed from: nd5$a$b */
        /* loaded from: classes6.dex */
        public class C26558b implements InterfaceC23483f {

            /* renamed from: b */
            public final /* synthetic */ BroadcastReceiver f100225b;

            public C26558b(BroadcastReceiver broadcastReceiver) {
                this.f100225b = broadcastReceiver;
            }

            @Override // io.reactivex.functions.InterfaceC23483f
            public void cancel() {
                C26556a.this.f100221b.unregisterReceiver(this.f100225b);
            }
        }

        public C26556a(Context context) {
            this.f100221b = context;
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<C26559b> interfaceC24578y) {
            C26557a c26557a = new C26557a(interfaceC24578y);
            this.f100221b.registerReceiver(c26557a, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            interfaceC24578y.mo11916a(new C26558b(c26557a));
        }
    }

    /* renamed from: nd5$b */
    /* loaded from: classes6.dex */
    public static class C26559b {

        /* renamed from: c */
        public static final C26559b f100227c = new C26559b(true, "STATE_ON");

        /* renamed from: d */
        public static final C26559b f100228d = new C26559b(false, "STATE_OFF");

        /* renamed from: e */
        public static final C26559b f100229e = new C26559b(false, "STATE_TURNING_ON");

        /* renamed from: f */
        public static final C26559b f100230f = new C26559b(false, "STATE_TURNING_OFF");

        /* renamed from: a */
        public final boolean f100231a;

        /* renamed from: b */
        public final String f100232b;

        public C26559b(boolean z, String str) {
            this.f100231a = z;
            this.f100232b = str;
        }

        /* renamed from: a */
        public boolean m23401a() {
            return this.f100231a;
        }

        public String toString() {
            return this.f100232b;
        }
    }

    public C45792nd5(Context context) {
        this.f100220b = Observable.create(new C26556a(context)).subscribeOn(C24542a.m31930e()).unsubscribeOn(C24542a.m31930e()).share();
    }

    /* renamed from: a */
    public static C26559b m23402a(int i) {
        switch (i) {
            case 11:
                return C26559b.f100229e;
            case 12:
                return C26559b.f100227c;
            case 13:
                return C26559b.f100230f;
            default:
                return C26559b.f100228d;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super C26559b> interfaceC23436D) {
        this.f100220b.subscribe(interfaceC23436D);
    }
}
