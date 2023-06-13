package co.bird.android.app.feature.privatebirds;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24535i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC39873de5;
import p000.C41318g46;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002J:\u0010\u000e\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\n0\n\u0018\u00010\f0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR8\u0010\"\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u001f0\u001f \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u001f0\u001f\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!RP\u0010\u000b\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \r*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \r*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \r*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006."}, m28432d2 = {"Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;", "LVX0;", "LLifecycleOwner;", "owner", "", "onStart", "onStop", "Lio/reactivex/disposables/c;", "A", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLocks", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "x", "LTq4;", "b", "LTq4;", "reactiveConfig", "LoI5;", "c", "LoI5;", "smartlockManager", "LMD;", DateTokenConverter.CONVERTER_KEY, "LMD;", "baseBluetoothManager", "Lio/reactivex/disposables/b;", "e", "Lio/reactivex/disposables/b;", "disposables", "", "f", "Lio/reactivex/Observable;", "bluetoothReady", "g", "Lg46$b;", "t", "()Lg46$b;", "logger", "Lde5;", "bleClient", "Lq54;", "privateBirdsManager", "<init>", "(Lde5;Lq54;LTq4;LoI5;LMD;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockBluetoothScanner.kt\nco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,130:1\n44#2:131\n180#3:132\n*S KotlinDebug\n*F\n+ 1 SmartlockBluetoothScanner.kt\nco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner\n*L\n59#1:131\n59#1:132\n*E\n"})
/* loaded from: classes2.dex */
public final class SmartlockBluetoothScanner implements VX0 {

    /* renamed from: b */
    public final C36207Tq4 f62314b;

    /* renamed from: c */
    public final InterfaceC46193oI5 f62315c;

    /* renamed from: d */
    public final InterfaceC5225MD f62316d;

    /* renamed from: e */
    public final C23464b f62317e;

    /* renamed from: f */
    public final Observable<Boolean> f62318f;

    /* renamed from: g */
    public final Observable<List<WirePhysicalLock>> f62319g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", "old", "new", "", C17296a.f69688o, "(Lde5$a;Lde5$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$a */
    /* loaded from: classes2.dex */
    public static final class C14195a extends Lambda implements Function2<AbstractC39873de5.EnumC19828a, AbstractC39873de5.EnumC19828a, Boolean> {

        /* renamed from: g */
        public static final C14195a f62320g = new C14195a();

        public C14195a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(AbstractC39873de5.EnumC19828a old, AbstractC39873de5.EnumC19828a enumC19828a) {
            boolean z;
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(enumC19828a, "new");
            if (old == enumC19828a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lde5$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$b */
    /* loaded from: classes2.dex */
    public static final class C14196b extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Unit> {
        public C14196b() {
            super(1);
        }

        /* renamed from: a */
        public final void m59628a(AbstractC39873de5.EnumC19828a enumC19828a) {
            C41318g46.AbstractC20723b m59636t = SmartlockBluetoothScanner.this.m59636t();
            String lowerCase = enumC19828a.name().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            m59636t.mo7221o("bluetooth state: " + lowerCase, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC39873de5.EnumC19828a enumC19828a) {
            m59628a(enumC19828a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lde5$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$c */
    /* loaded from: classes2.dex */
    public static final class C14197c extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Boolean> {

        /* renamed from: g */
        public static final C14197c f62322g = new C14197c();

        public C14197c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC39873de5.EnumC19828a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == AbstractC39873de5.EnumC19828a.READY) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$d */
    /* loaded from: classes2.dex */
    public static final class C14198d extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C14198d f62323g = new C14198d();

        public C14198d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!Intrinsics.areEqual(it.getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE) && it.getPrivateBirdConfig().getScanForSmartlockInForeground());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$e */
    /* loaded from: classes2.dex */
    public static final class C14199e extends Lambda implements Function1<Boolean, Unit> {
        public C14199e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            if (enabled.booleanValue()) {
                SmartlockBluetoothScanner.this.m59636t().mo7221o("Starting legacy private physical lock bluetooth scanning due to FF enabled", new Object[0]);
                SmartlockBluetoothScanner.this.f62317e.mo32983c(SmartlockBluetoothScanner.this.m59652A());
                return;
            }
            SmartlockBluetoothScanner.this.m59636t().mo7221o("Stopping legacy private physical lock bluetooth scanning due to FF disabled", new Object[0]);
            SmartlockBluetoothScanner.this.f62317e.m33026d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "birds", "Lco/bird/android/model/wire/WirePhysicalLock;", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockBluetoothScanner.kt\nco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$physicalLocks$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1603#2,9:131\n1855#2:140\n1856#2:142\n1612#2:143\n766#2:144\n857#2,2:145\n1#3:141\n*S KotlinDebug\n*F\n+ 1 SmartlockBluetoothScanner.kt\nco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$physicalLocks$1\n*L\n48#1:131,9\n48#1:140\n48#1:142\n48#1:143\n48#1:144\n48#1:145,2\n48#1:141\n*E\n"})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$f */
    /* loaded from: classes2.dex */
    public static final class C14200f extends Lambda implements Function1<Optional<List<? extends WireBird>>, List<? extends WirePhysicalLock>> {

        /* renamed from: g */
        public static final C14200f f62325g = new C14200f();

        public C14200f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WirePhysicalLock> invoke(Optional<List<WireBird>> birds) {
            boolean z;
            Intrinsics.checkNotNullParameter(birds, "birds");
            List<WireBird> m59035e = birds.m59035e();
            if (m59035e != null) {
                ArrayList arrayList = new ArrayList();
                for (WireBird wireBird : m59035e) {
                    WirePhysicalLock physicalLock = wireBird.getPhysicalLock();
                    if (physicalLock != null) {
                        arrayList.add(physicalLock);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((WirePhysicalLock) obj).getSmartlock() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "physicalLocks", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$g */
    /* loaded from: classes2.dex */
    public static final class C14201g extends Lambda implements Function1<List<? extends WirePhysicalLock>, Unit> {
        public C14201g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WirePhysicalLock> list) {
            invoke2((List<WirePhysicalLock>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WirePhysicalLock> list) {
            C41318g46.AbstractC20723b m59636t = SmartlockBluetoothScanner.this.m59636t();
            int size = list.size();
            m59636t.mo7221o("Found " + size + " physical locks to listen for", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$h */
    /* loaded from: classes2.dex */
    public static final class C14202h extends Lambda implements Function1<C36154Tk5, InterfaceC24574u<? extends WirePhysicalLock>> {

        /* renamed from: g */
        public final /* synthetic */ List<WirePhysicalLock> f62327g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14202h(List<WirePhysicalLock> list) {
            super(1);
            this.f62327g = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WirePhysicalLock> invoke(C36154Tk5 scanResult) {
            Object obj;
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            if (!C12325bE.m64814b(scanResult)) {
                return AbstractC24507p.m32024u();
            }
            Iterator<T> it = this.f62327g.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                WireSmartlock smartlock = ((WirePhysicalLock) next).getSmartlock();
                if (smartlock != null) {
                    obj = smartlock.getMacAddress();
                }
                if (Intrinsics.areEqual(obj, scanResult.m83016a().mo17280e())) {
                    obj = next;
                    break;
                }
            }
            WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) obj;
            if (wirePhysicalLock == null) {
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(wirePhysicalLock);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$i */
    /* loaded from: classes2.dex */
    public static final class C14203i extends Lambda implements Function1<Observable<Throwable>, InterfaceC23434B<?>> {
        public C14203i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<?> invoke(Observable<Throwable> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockBluetoothScanner.this.f62318f;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "bluetoothReady", "Lio/reactivex/B;", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$j */
    /* loaded from: classes2.dex */
    public static final class C14204j extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends List<? extends WirePhysicalLock>>> {
        public C14204j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends List<WirePhysicalLock>> invoke(Boolean bluetoothReady) {
            Intrinsics.checkNotNullParameter(bluetoothReady, "bluetoothReady");
            if (bluetoothReady.booleanValue()) {
                return SmartlockBluetoothScanner.this.f62319g;
            }
            SmartlockBluetoothScanner.this.m59636t().mo7228a("Not scanning for smart locks via BLE since bluetooth is not ready", new Object[0]);
            SmartlockBluetoothScanner.this.f62315c.mo21403d();
            return Observable.never();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLocks", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$k */
    /* loaded from: classes2.dex */
    public static final class C14205k extends Lambda implements Function1<List<? extends WirePhysicalLock>, InterfaceC23434B<? extends WirePhysicalLock>> {
        public C14205k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WirePhysicalLock> invoke(List<WirePhysicalLock> physicalLocks) {
            Intrinsics.checkNotNullParameter(physicalLocks, "physicalLocks");
            if (!physicalLocks.isEmpty()) {
                SmartlockBluetoothScanner.this.m59636t().mo7221o("Starting physical lock bluetooth scanning", new Object[0]);
                return SmartlockBluetoothScanner.this.m59632x(physicalLocks);
            }
            SmartlockBluetoothScanner.this.m59636t().mo7228a("Stopping physical lock bluetooth scanning due to having 0 locks to scan for", new Object[0]);
            SmartlockBluetoothScanner.this.f62315c.mo21403d();
            return Observable.never();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$l */
    /* loaded from: classes2.dex */
    public static final class C14206l extends Lambda implements Function1<Throwable, Unit> {
        public C14206l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            SmartlockBluetoothScanner.this.m59636t().mo7212z(throwable, "Error while listening for physical locks", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", "physicalLock", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePhysicalLock;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner$m */
    /* loaded from: classes2.dex */
    public static final class C14207m extends Lambda implements Function1<WirePhysicalLock, Unit> {
        public C14207m() {
            super(1);
        }

        /* renamed from: a */
        public final void m59623a(WirePhysicalLock physicalLock) {
            C41318g46.AbstractC20723b m59636t = SmartlockBluetoothScanner.this.m59636t();
            m59636t.mo7221o("Attempting to unlock: " + physicalLock, new Object[0]);
            InterfaceC46193oI5 interfaceC46193oI5 = SmartlockBluetoothScanner.this.f62315c;
            Intrinsics.checkNotNullExpressionValue(physicalLock, "physicalLock");
            interfaceC46193oI5.mo21400g(new C37099Xl5(physicalLock, null, null, 6, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePhysicalLock wirePhysicalLock) {
            m59623a(wirePhysicalLock);
            return Unit.INSTANCE;
        }
    }

    public SmartlockBluetoothScanner(AbstractC39873de5 bleClient, InterfaceC47256q54 privateBirdsManager, C36207Tq4 reactiveConfig, InterfaceC46193oI5 smartlockManager, InterfaceC5225MD baseBluetoothManager) {
        Intrinsics.checkNotNullParameter(bleClient, "bleClient");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        this.f62314b = reactiveConfig;
        this.f62315c = smartlockManager;
        this.f62316d = baseBluetoothManager;
        this.f62317e = new C23464b();
        Observable<AbstractC39873de5.EnumC19828a> startWith = bleClient.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) bleClient.mo33641c());
        final C14195a c14195a = C14195a.f62320g;
        Observable<AbstractC39873de5.EnumC19828a> distinctUntilChanged = startWith.distinctUntilChanged(new InterfaceC23481d() { // from class: aI5
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m59639p;
                m59639p = SmartlockBluetoothScanner.m59639p(Function2.this, obj, obj2);
                return m59639p;
            }
        });
        final C14196b c14196b = new C14196b();
        Observable<AbstractC39873de5.EnumC19828a> doOnNext = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: bI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockBluetoothScanner.m59638q(Function1.this, obj);
            }
        });
        final C14197c c14197c = C14197c.f62322g;
        this.f62318f = doOnNext.map(new InterfaceC23492o() { // from class: cI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m59637s;
                m59637s = SmartlockBluetoothScanner.m59637s(Function1.this, obj);
                return m59637s;
            }
        });
        Observable distinctUntilChanged2 = C37279Yf5.m74575T(privateBirdsManager.mo18213a(), C14200f.f62325g).distinctUntilChanged();
        final C14201g c14201g = new C14201g();
        this.f62319g = distinctUntilChanged2.doOnNext(new InterfaceC23484g() { // from class: dI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockBluetoothScanner.m59633w(Function1.this, obj);
            }
        });
    }

    /* renamed from: B */
    public static final InterfaceC23434B m59651B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23434B m59650C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final boolean m59639p(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: q */
    public static final void m59638q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final Boolean m59637s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final Boolean m59635u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m59634v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m59633w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC24574u m59631y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23434B m59630z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final InterfaceC23465c m59652A() {
        Observable<Boolean> observable = this.f62318f;
        final C14204j c14204j = new C14204j();
        Observable<R> switchMap = observable.switchMap(new InterfaceC23492o() { // from class: eI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m59651B;
                m59651B = SmartlockBluetoothScanner.m59651B(Function1.this, obj);
                return m59651B;
            }
        });
        final C14205k c14205k = new C14205k();
        Observable flatMap = switchMap.flatMap(new InterfaceC23492o() { // from class: fI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m59650C;
                m59650C = SmartlockBluetoothScanner.m59650C(Function1.this, obj);
                return m59650C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun start(): Dis…hysical locks\")\n    }\n  )");
        return C24535i.m31935f(flatMap, new C14206l(), null, new C14207m(), 2, null);
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        Z84<Config> m82623f8 = this.f62314b.m82623f8();
        final C14198d c14198d = C14198d.f62323g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: YH5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m59635u;
                m59635u = SmartlockBluetoothScanner.m59635u(Function1.this, obj);
                return m59635u;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config\n  …  .distinctUntilChanged()");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = distinctUntilChanged.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14199e c14199e = new C14199e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZH5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockBluetoothScanner.m59634v(Function1.this, obj);
            }
        });
    }

    @Override // p000.VX0
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        if (this.f62317e.m33024h() > 0) {
            m59636t().mo7221o("Stopping legacy private physical lock bluetooth scanning on background", new Object[0]);
            this.f62317e.m33026d();
        }
    }

    /* renamed from: t */
    public final C41318g46.AbstractC20723b m59636t() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("smartlock-ble-scanner");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"smartlock-ble-scanner\")");
        return m40153k;
    }

    /* renamed from: x */
    public final Observable<WirePhysicalLock> m59632x(List<WirePhysicalLock> list) {
        if (!list.isEmpty()) {
            Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(this.f62316d, 1, false, null, 4, null);
            final C14202h c14202h = new C14202h(list);
            Observable flatMapMaybe = scanBleDevices$default.flatMapMaybe(new InterfaceC23492o() { // from class: WH5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m59631y;
                    m59631y = SmartlockBluetoothScanner.m59631y(Function1.this, obj);
                    return m59631y;
                }
            });
            final C14203i c14203i = new C14203i();
            return flatMapMaybe.retryWhen(new InterfaceC23492o() { // from class: XH5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m59630z;
                    m59630z = SmartlockBluetoothScanner.m59630z(Function1.this, obj);
                    return m59630z;
                }
            });
        }
        return Observable.never();
    }
}
