package p000;

import com.polidea.rxandroidble2.exceptions.BleScanException;
import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import p000.AbstractC39873de5;
import p000.C45792nd5;
import p000.InterfaceC41706gk0;
/* renamed from: ie5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42837ie5 extends AbstractC39873de5 {

    /* renamed from: a */
    public final InterfaceC34043Kk0 f87630a;

    /* renamed from: b */
    public final C33112Gk5 f87631b;

    /* renamed from: c */
    public final C48766se5 f87632c;

    /* renamed from: d */
    public final InterfaceC39332cl5 f87633d;

    /* renamed from: e */
    public final InterfaceC50012uk5 f87634e;

    /* renamed from: f */
    public final InterfaceC23492o<C51730xe5, C36154Tk5> f87635f;

    /* renamed from: g */
    public final InterfaceC41706gk0.InterfaceC22420b f87636g;

    /* renamed from: h */
    public final AbstractC23437E f87637h;

    /* renamed from: i */
    public final Map<Set<UUID>, Observable<Object>> f87638i = new HashMap();

    /* renamed from: j */
    public final C8307UX f87639j;

    /* renamed from: k */
    public final C46978pd5 f87640k;

    /* renamed from: l */
    public final Observable<C45792nd5.C26559b> f87641l;

    /* renamed from: m */
    public final InterfaceC34855Nw2 f87642m;

    /* renamed from: n */
    public final InterfaceC38163an2<C34979Ok0> f87643n;

    /* renamed from: o */
    public final InterfaceC19908dw f87644o;

    /* renamed from: p */
    public final C31919Bi0 f87645p;

    /* renamed from: q */
    public final C50579vi0 f87646q;

    public C42837ie5(C8307UX c8307ux, C46978pd5 c46978pd5, InterfaceC34043Kk0 interfaceC34043Kk0, Observable<C45792nd5.C26559b> observable, C33112Gk5 c33112Gk5, InterfaceC34855Nw2 interfaceC34855Nw2, InterfaceC38163an2<C34979Ok0> interfaceC38163an2, C48766se5 c48766se5, InterfaceC39332cl5 interfaceC39332cl5, InterfaceC50012uk5 interfaceC50012uk5, InterfaceC23492o<C51730xe5, C36154Tk5> interfaceC23492o, AbstractC23437E abstractC23437E, InterfaceC41706gk0.InterfaceC22420b interfaceC22420b, InterfaceC19908dw interfaceC19908dw, C31919Bi0 c31919Bi0, C50579vi0 c50579vi0) {
        this.f87630a = interfaceC34043Kk0;
        this.f87639j = c8307ux;
        this.f87640k = c46978pd5;
        this.f87641l = observable;
        this.f87631b = c33112Gk5;
        this.f87642m = interfaceC34855Nw2;
        this.f87643n = interfaceC38163an2;
        this.f87632c = c48766se5;
        this.f87633d = interfaceC39332cl5;
        this.f87634e = interfaceC50012uk5;
        this.f87635f = interfaceC23492o;
        this.f87637h = abstractC23437E;
        this.f87636g = interfaceC22420b;
        this.f87644o = interfaceC19908dw;
        this.f87645p = c31919Bi0;
        this.f87646q = c50579vi0;
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m33632l(C45792nd5.C26559b c26559b) throws Exception {
        return c26559b != C45792nd5.C26559b.f100227c;
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC24574u m33631m(C45792nd5.C26559b c26559b) throws Exception {
        return AbstractC24507p.m32023v(new BleScanException(1));
    }

    /* renamed from: n */
    public static /* synthetic */ void m33630n(C36154Tk5 c36154Tk5) throws Exception {
        if (C52323ye5.m3120i()) {
            C52323ye5.m3118k("%s", c36154Tk5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ InterfaceC23434B m33629o(ScanSettings scanSettings, ScanFilter[] scanFilterArr) throws Exception {
        this.f87634e.mo4754a(scanSettings.m45826i());
        C38739bl5 mo35887a = this.f87633d.mo35887a(scanSettings, scanFilterArr);
        return this.f87630a.mo14979a(mo35887a.f58043a).unsubscribeOn(this.f87637h).compose(mo35887a.f58044b).map(this.f87635f).doOnNext(new InterfaceC23484g() { // from class: fe5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42837ie5.m33630n((C36154Tk5) obj);
            }
        }).mergeWith(m33634j());
    }

    @Override // p000.AbstractC39873de5
    /* renamed from: b */
    public InterfaceC45802ne5 mo33642b(String str) {
        m33633k();
        return this.f87632c.m13911a(str);
    }

    @Override // p000.AbstractC39873de5
    /* renamed from: c */
    public AbstractC39873de5.EnumC19828a mo33641c() {
        if (!this.f87640k.m19049b()) {
            return AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_AVAILABLE;
        }
        if (!this.f87642m.mo84592a()) {
            return AbstractC39873de5.EnumC19828a.LOCATION_PERMISSION_NOT_GRANTED;
        }
        if (!this.f87640k.m19048c()) {
            return AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_ENABLED;
        }
        if (!this.f87642m.mo84591b()) {
            return AbstractC39873de5.EnumC19828a.LOCATION_SERVICES_NOT_ENABLED;
        }
        return AbstractC39873de5.EnumC19828a.READY;
    }

    @Override // p000.AbstractC39873de5
    /* renamed from: d */
    public Observable<AbstractC39873de5.EnumC19828a> mo33640d() {
        return this.f87643n.get();
    }

    @Override // p000.AbstractC39873de5
    /* renamed from: e */
    public Observable<C36154Tk5> mo33639e(final ScanSettings scanSettings, final ScanFilter... scanFilterArr) {
        return Observable.defer(new Callable() { // from class: ee5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m33629o;
                m33629o = C42837ie5.this.m33629o(scanSettings, scanFilterArr);
                return m33629o;
            }
        });
    }

    public void finalize() throws Throwable {
        this.f87636g.mo37836a();
        super.finalize();
    }

    /* renamed from: j */
    public <T> Observable<T> m33634j() {
        return this.f87641l.filter(new InterfaceC23494q() { // from class: ge5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m33632l;
                m33632l = C42837ie5.m33632l((C45792nd5.C26559b) obj);
                return m33632l;
            }
        }).firstElement().m32021x(new InterfaceC23492o() { // from class: he5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m33631m;
                m33631m = C42837ie5.m33631m((C45792nd5.C26559b) obj);
                return m33631m;
            }
        }).m32045d0();
    }

    /* renamed from: k */
    public final void m33633k() {
        if (this.f87640k.m19049b()) {
            return;
        }
        throw new UnsupportedOperationException("RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use 'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble'");
    }
}
