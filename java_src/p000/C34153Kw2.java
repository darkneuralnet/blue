package p000;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.schedulers.C24542a;
@TargetApi(19)
/* renamed from: Kw2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34153Kw2 {

    /* renamed from: a */
    public final Context f20399a;

    /* renamed from: b */
    public final InterfaceC34855Nw2 f20400b;

    /* renamed from: Kw2$a */
    /* loaded from: classes6.dex */
    public class C4629a implements InterfaceC24579z<Boolean> {

        /* renamed from: Kw2$a$a */
        /* loaded from: classes6.dex */
        public class C4630a extends BroadcastReceiver {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC24578y f20402a;

            public C4630a(InterfaceC24578y interfaceC24578y) {
                this.f20402a = interfaceC24578y;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f20402a.onNext(Boolean.valueOf(C34153Kw2.this.f20400b.mo84591b()));
            }
        }

        /* renamed from: Kw2$a$b */
        /* loaded from: classes6.dex */
        public class C4631b implements InterfaceC23483f {

            /* renamed from: b */
            public final /* synthetic */ BroadcastReceiver f20404b;

            public C4631b(BroadcastReceiver broadcastReceiver) {
                this.f20404b = broadcastReceiver;
            }

            @Override // io.reactivex.functions.InterfaceC23483f
            public void cancel() {
                C34153Kw2.this.f20399a.unregisterReceiver(this.f20404b);
            }
        }

        public C4629a() {
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<Boolean> interfaceC24578y) {
            boolean mo84591b = C34153Kw2.this.f20400b.mo84591b();
            C4630a c4630a = new C4630a(interfaceC24578y);
            interfaceC24578y.onNext(Boolean.valueOf(mo84591b));
            C34153Kw2.this.f20399a.registerReceiver(c4630a, new IntentFilter("android.location.MODE_CHANGED"));
            interfaceC24578y.mo11916a(new C4631b(c4630a));
        }
    }

    public C34153Kw2(Context context, InterfaceC34855Nw2 interfaceC34855Nw2) {
        this.f20399a = context;
        this.f20400b = interfaceC34855Nw2;
    }

    /* renamed from: a */
    public Observable<Boolean> m98121a() {
        return Observable.create(new C4629a()).distinctUntilChanged().subscribeOn(C24542a.m31930e()).unsubscribeOn(C24542a.m31930e());
    }
}
