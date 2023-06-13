package p000;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.C23466d;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.concurrent.TimeUnit;
import p000.AbstractC39873de5;
import p000.C45792nd5;
/* renamed from: Ok0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34979Ok0 extends Observable<AbstractC39873de5.EnumC19828a> {

    /* renamed from: b */
    public final C46978pd5 f27161b;

    /* renamed from: c */
    public final Observable<C45792nd5.C26559b> f27162c;

    /* renamed from: d */
    public final Observable<Boolean> f27163d;

    /* renamed from: e */
    public final InterfaceC34855Nw2 f27164e;

    /* renamed from: f */
    public final AbstractC23437E f27165f;

    /* renamed from: Ok0$a */
    /* loaded from: classes6.dex */
    public class C6102a implements InterfaceC23492o<Long, Boolean> {
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Boolean apply(Long l) {
            return Boolean.valueOf(l.longValue() == 0);
        }
    }

    /* renamed from: Ok0$b */
    /* loaded from: classes6.dex */
    public class C6103b implements InterfaceC23494q<Long> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC34855Nw2 f27166b;

        public C6103b(InterfaceC34855Nw2 interfaceC34855Nw2) {
            this.f27166b = interfaceC34855Nw2;
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        /* renamed from: a */
        public boolean test(Long l) {
            return !this.f27166b.mo84592a();
        }
    }

    /* renamed from: Ok0$c */
    /* loaded from: classes6.dex */
    public class C6104c implements InterfaceC23492o<C45792nd5.C26559b, Observable<AbstractC39873de5.EnumC19828a>> {

        /* renamed from: b */
        public final /* synthetic */ Observable f27167b;

        /* renamed from: Ok0$c$a */
        /* loaded from: classes6.dex */
        public class C6105a implements InterfaceC23492o<Boolean, AbstractC39873de5.EnumC19828a> {
            public C6105a() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public AbstractC39873de5.EnumC19828a apply(Boolean bool) {
                if (bool.booleanValue()) {
                    return AbstractC39873de5.EnumC19828a.READY;
                }
                return AbstractC39873de5.EnumC19828a.LOCATION_SERVICES_NOT_ENABLED;
            }
        }

        public C6104c(Observable observable) {
            this.f27167b = observable;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Observable<AbstractC39873de5.EnumC19828a> apply(C45792nd5.C26559b c26559b) {
            if (c26559b != C45792nd5.C26559b.f100227c) {
                return Observable.just(AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_ENABLED);
            }
            return this.f27167b.map(new C6105a());
        }
    }

    /* renamed from: Ok0$d */
    /* loaded from: classes6.dex */
    public class C6106d implements InterfaceC23492o<Boolean, Observable<AbstractC39873de5.EnumC19828a>> {
        public C6106d() {
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Observable<AbstractC39873de5.EnumC19828a> apply(Boolean bool) {
            C34979Ok0 c34979Ok0 = C34979Ok0.this;
            Observable<AbstractC39873de5.EnumC19828a> distinctUntilChanged = C34979Ok0.m91598a(c34979Ok0.f27161b, c34979Ok0.f27162c, c34979Ok0.f27163d).distinctUntilChanged();
            if (bool.booleanValue()) {
                return distinctUntilChanged.skip(1L);
            }
            return distinctUntilChanged;
        }
    }

    public C34979Ok0(C46978pd5 c46978pd5, Observable<C45792nd5.C26559b> observable, Observable<Boolean> observable2, InterfaceC34855Nw2 interfaceC34855Nw2, AbstractC23437E abstractC23437E) {
        this.f27161b = c46978pd5;
        this.f27162c = observable;
        this.f27163d = observable2;
        this.f27164e = interfaceC34855Nw2;
        this.f27165f = abstractC23437E;
    }

    /* renamed from: a */
    public static Observable<AbstractC39873de5.EnumC19828a> m91598a(C46978pd5 c46978pd5, Observable<C45792nd5.C26559b> observable, Observable<Boolean> observable2) {
        C45792nd5.C26559b c26559b;
        if (c46978pd5.m19048c()) {
            c26559b = C45792nd5.C26559b.f100227c;
        } else {
            c26559b = C45792nd5.C26559b.f100228d;
        }
        return observable.startWith((Observable<C45792nd5.C26559b>) c26559b).switchMap(new C6104c(observable2));
    }

    /* renamed from: c */
    public static AbstractC23442F<Boolean> m91597c(InterfaceC34855Nw2 interfaceC34855Nw2, AbstractC23437E abstractC23437E) {
        return Observable.interval(0L, 1L, TimeUnit.SECONDS, abstractC23437E).takeWhile(new C6103b(interfaceC34855Nw2)).count().m33157I(new C6102a());
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super AbstractC39873de5.EnumC19828a> interfaceC23436D) {
        if (!this.f27161b.m19049b()) {
            interfaceC23436D.onSubscribe(C23466d.m33022b());
            interfaceC23436D.onComplete();
            return;
        }
        m91597c(this.f27164e, this.f27165f).m33162D(new C6106d()).subscribe(interfaceC23436D);
    }
}
