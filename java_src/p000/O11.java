package p000;

import android.location.Address;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AddressGuess;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060 0\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"LO11;", "", "", "query", "", "l", "Lco/bird/android/model/AddressGuess;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "j", "LO01;", C17296a.f69688o, "LO01;", "manager", "LAG;", "b", "LAG;", "addressQueryRelay", "Lma4;", "c", "Lma4;", "selectedGuess", "Lio/reactivex/Observable;", "Landroid/location/Address;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "i", "()Lio/reactivex/Observable;", "selectedAddress", "", "e", "g", "clearQueryVisible", "", "f", "addresses", "Lg46$b;", "h", "()Lg46$b;", "logger", "<init>", "(LO01;)V", "destination-rider_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O11 */
/* loaded from: classes3.dex */
public final class O11 {

    /* renamed from: a */
    public final O01 f25513a;

    /* renamed from: b */
    public final C0058AG<String> f25514b;

    /* renamed from: c */
    public final C45168ma4<AddressGuess> f25515c;

    /* renamed from: d */
    public final Observable<Address> f25516d;

    /* renamed from: e */
    public final Observable<Boolean> f25517e;

    /* renamed from: f */
    public final Observable<List<AddressGuess>> f25518f;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "query", "Lio/reactivex/K;", "", "Lco/bird/android/model/AddressGuess;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O11$a */
    /* loaded from: classes3.dex */
    public static final class C5806a extends Lambda implements Function1<String, InterfaceC23447K<? extends List<? extends AddressGuess>>> {
        public C5806a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<AddressGuess>> invoke(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            C41318g46.AbstractC20723b m93003h = O11.this.m93003h();
            m93003h.mo7221o("Loading addresses that match: " + query, new Object[0]);
            return O11.this.f25513a.mo73916a(query);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "query", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O11$b */
    /* loaded from: classes3.dex */
    public static final class C5807b extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C5807b f25520g = new C5807b();

        public C5807b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            return Boolean.valueOf(query.length() > 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/AddressGuess;", "guess", "Lio/reactivex/K;", "Landroid/location/Address;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/AddressGuess;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O11$c */
    /* loaded from: classes3.dex */
    public static final class C5808c extends Lambda implements Function1<AddressGuess, InterfaceC23447K<? extends Address>> {
        public C5808c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Address> invoke(AddressGuess guess) {
            Intrinsics.checkNotNullParameter(guess, "guess");
            return O11.this.f25513a.mo73913d(guess.getId()).m33146T(3L);
        }
    }

    public O11(O01 manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f25513a = manager;
        C0058AG<String> m115950h = C0058AG.m115950h("");
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(\"\")");
        this.f25514b = m115950h;
        C45168ma4<AddressGuess> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create()");
        this.f25515c = m25409g;
        final C5808c c5808c = new C5808c();
        Observable flatMapSingle = m25409g.flatMapSingle(new InterfaceC23492o() { // from class: L11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93000k;
                m93000k = O11.m93000k(Function1.this, obj);
                return m93000k;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "selectedGuess.flatMapSin…ss(guess.id).retry(3)\n  }");
        this.f25516d = flatMapSingle;
        final C5807b c5807b = C5807b.f25520g;
        Observable<Boolean> observeOn = m115950h.map(new InterfaceC23492o() { // from class: M11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m93006e;
                m93006e = O11.m93006e(Function1.this, obj);
                return m93006e;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "addressQueryRelay\n    .m…dSchedulers.mainThread())");
        this.f25517e = observeOn;
        Observable<String> observeOn2 = m115950h.debounce(150L, TimeUnit.MILLISECONDS).distinctUntilChanged().observeOn(C24542a.m31932c());
        final C5806a c5806a = new C5806a();
        Observable<List<AddressGuess>> observeOn3 = observeOn2.switchMapSingle(new InterfaceC23492o() { // from class: N11
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93007d;
                m93007d = O11.m93007d(Function1.this, obj);
                return m93007d;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "addressQueryRelay.deboun…dSchedulers.mainThread())");
        this.f25518f = observeOn3;
    }

    /* renamed from: d */
    public static final InterfaceC23447K m93007d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final Boolean m93006e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final InterfaceC23447K m93000k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public final Observable<List<AddressGuess>> m93005f() {
        return this.f25518f;
    }

    /* renamed from: g */
    public final Observable<Boolean> m93004g() {
        return this.f25517e;
    }

    /* renamed from: h */
    public final C41318g46.AbstractC20723b m93003h() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("destination-search-vm");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"destination-search-vm\")");
        return m40153k;
    }

    /* renamed from: i */
    public final Observable<Address> m93002i() {
        return this.f25516d;
    }

    /* renamed from: j */
    public final void m93001j(AddressGuess address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f25515c.accept(address);
    }

    /* renamed from: l */
    public final void m92999l(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f25514b.accept(query);
    }
}
