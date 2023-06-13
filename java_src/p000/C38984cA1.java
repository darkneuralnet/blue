package p000;

import android.content.Intent;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38984cA1;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LcA1;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", "kotlin.jvm.PlatformType", C17296a.f69688o, "LTq4;", "LTq4;", "config", "LQz1;", "b", "LQz1;", "frequentFlyerManager", "Le13;", "c", "Le13;", "navigator", "<init>", "(LTq4;LQz1;Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cA1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38984cA1 implements MV0 {

    /* renamed from: a */
    public final C36207Tq4 f60229a;

    /* renamed from: b */
    public final InterfaceC35583Qz1 f60230b;

    /* renamed from: c */
    public final InterfaceC40099e13 f60231c;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cA1$a */
    /* loaded from: classes3.dex */
    public static final class C13424a extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C13424a f60232g = new C13424a();

        public C13424a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getFrequentFlyer().getEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "enabled", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cA1$b */
    /* loaded from: classes3.dex */
    public static final class C13425b extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Optional<WireFrequentFlyerView>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cA1$b$a */
        /* loaded from: classes3.dex */
        public static final class C13426a extends Lambda implements Function1<Optional<WireFrequentFlyerView>, Boolean> {

            /* renamed from: g */
            public static final C13426a f60234g = new C13426a();

            public C13426a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<WireFrequentFlyerView> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.m59037c());
            }
        }

        public C13425b() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Optional<WireFrequentFlyerView>> invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            if (enabled.booleanValue()) {
                Z84<Optional<WireFrequentFlyerView>> data = C38984cA1.this.f60230b.getData();
                final C13426a c13426a = C13426a.f60234g;
                return data.filter(new InterfaceC23494q() { // from class: dA1
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = C38984cA1.C13425b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return Observable.just(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "kotlin.jvm.PlatformType", "frequentFlyerView", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFrequentFlyerNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerNavigator.kt\nco/bird/android/lib/deeplink/navigators/FrequentFlyerNavigator$navigate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
    /* renamed from: cA1$c */
    /* loaded from: classes3.dex */
    public static final class C13427c extends Lambda implements Function1<Optional<WireFrequentFlyerView>, Unit> {
        public C13427c() {
            super(1);
        }

        /* renamed from: a */
        public final void m61808a(Optional<WireFrequentFlyerView> optional) {
            InterfaceC40099e13.C19924a.goToRider$default(C38984cA1.this.f60231c, false, false, null, 7, null);
            WireFrequentFlyerView m59035e = optional.m59035e();
            if (m59035e != null) {
                C38984cA1.this.f60231c.mo37053a4(m59035e);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireFrequentFlyerView> optional) {
            m61808a(optional);
            return Unit.INSTANCE;
        }
    }

    public C38984cA1(C36207Tq4 config, InterfaceC35583Qz1 frequentFlyerManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(frequentFlyerManager, "frequentFlyerManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f60229a = config;
        this.f60230b = frequentFlyerManager;
        this.f60231c = navigator;
    }

    /* renamed from: e */
    public static final Boolean m61813e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final InterfaceC23434B m61812f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m61811g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Z84<Config> m82623f8 = this.f60229a.m82623f8();
        final C13424a c13424a = C13424a.f60232g;
        Observable<R> map = m82623f8.map(new InterfaceC23492o() { // from class: Zz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m61813e;
                m61813e = C38984cA1.m61813e(Function1.this, obj);
                return m61813e;
            }
        });
        final C13425b c13425b = new C13425b();
        AbstractC23442F firstOrError = map.switchMap(new InterfaceC23492o() { // from class: aA1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m61812f;
                m61812f = C38984cA1.m61812f(Function1.this, obj);
                return m61812f;
            }
        }).firstOrError();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Optional.C14443a c14443a = Optional.f63040c;
        AbstractC23442F m33148R = firstOrError.m33136d0(10L, timeUnit, AbstractC23442F.m33158H(c14443a.m59034a())).m33148R(c14443a.m59034a());
        final C13427c c13427c = new C13427c();
        return m33148R.m33101w(new InterfaceC23484g() { // from class: bA1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38984cA1.m61811g(Function1.this, obj);
            }
        }).m33159G();
    }
}
