package co.bird.android.smartlock.impl;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStates;
import co.bird.android.model.itemlease.LeaseStartResponse;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.PhysicalLock;
import co.bird.android.model.persistence.nestedstructures.Smartlock;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.smartlock.api.SmartLockUnlockWrappedException;
import co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import org.joda.time.DateTime;
import p000.AbstractC39873de5;
import p000.C41318g46;
import p000.InterfaceC42015hF5;
@Metadata(m28433d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 X2\u00020\u0001:\u0004Y*.2BA\b\u0007\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bV\u0010WJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\n0\tH\u0002J$\u0010\u0011\u001a\u00020\u000b*\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0002J\u0018\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r*\u00020\nH\u0002J \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\tH\u0002J%\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0016*\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010!\u001a\u00020 H\u0002J \u0010(\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR8\u0010M\u001a&\u0012\f\u0012\n J*\u0004\u0018\u00010\u001c0\u001c J*\u0012\u0012\f\u0012\n J*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020&0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006\\²\u0006\f\u0010Z\u001a\u00020\u001c8\nX\u008a\u0084\u0002²\u0006\f\u0010[\u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;", "LVX0;", "LLifecycleOwner;", "owner", "", "onStart", "onStop", "Lio/reactivex/disposables/c;", "U", "Lio/reactivex/k;", "LsE5;", "Lio/reactivex/c;", "L", "Lio/reactivex/p;", "Lkotlin/Pair;", "Lcy0;", "LjI5;", "N", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/persistence/Bird;", "bird", "D", "", "z", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;", "action", "", "secondsAgo", "", "P", "(LsE5;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;I)Ljava/lang/Boolean;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;", "type", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "Q", "", "smartLockMacAddress", "Lorg/joda/time/DateTime;", "timeStamp", "T", "Lq54;", "b", "Lq54;", "privateBirdsManager", "LYR4;", "c", "LYR4;", "rideManager", "LMc2;", DateTokenConverter.CONVERTER_KEY, "LMc2;", "itemLeaseManager", "LTq4;", "e", "LTq4;", "reactiveConfig", "LhF5;", "f", "LhF5;", "smartLockManager", "LDX;", "g", "LDX;", "bluetoothManager", "Le13;", "h", "Le13;", "navigator", "Lio/reactivex/disposables/b;", "i", "Lio/reactivex/disposables/b;", "disposables", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/Observable;", "bluetoothReady", "LvE2;", "k", "LvE2;", "recordedActionCache", "Lg46$b;", "B", "()Lg46$b;", "logger", "<init>", "(Lq54;LYR4;LMc2;LTq4;LhF5;LDX;Le13;)V", "l", C17296a.f69688o, "allTypesMatch", "wireBird", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n44#2:482\n180#3:483\n1603#4,9:484\n1855#4:493\n766#4:494\n857#4,2:495\n1856#4:499\n1612#4:500\n1#5:497\n1#5:498\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner\n*L\n87#1:482\n87#1:483\n450#1:484,9\n450#1:493\n451#1:494\n451#1:495,2\n450#1:499\n450#1:500\n450#1:498\n*E\n"})
/* loaded from: classes4.dex */
public final class SmartLockGlobalBluetoothScanner implements VX0 {

    /* renamed from: l */
    public static final C16379b f66996l = new C16379b(null);

    /* renamed from: b */
    public final InterfaceC47256q54 f66997b;

    /* renamed from: c */
    public final YR4 f66998c;

    /* renamed from: d */
    public final InterfaceC34441Mc2 f66999d;

    /* renamed from: e */
    public final C36207Tq4 f67000e;

    /* renamed from: f */
    public final InterfaceC42015hF5 f67001f;

    /* renamed from: g */
    public final InterfaceC1510DX f67002g;

    /* renamed from: h */
    public final InterfaceC40099e13 f67003h;

    /* renamed from: i */
    public final C23464b f67004i;

    /* renamed from: j */
    public final Observable<Boolean> f67005j;

    /* renamed from: k */
    public final C50303vE2<String, DateTime> f67006k;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$a */
    /* loaded from: classes4.dex */
    public enum EnumC16378a {
        UNLOCK,
        NO_OP,
        HELMET_PROMPT
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$b;", "", "", "RECENTLY_PROMPTED_HELMET_IGNORE_THRESHOLD_SECONDS", "I", "RECENTLY_UNLOCKED_IGNORE_THRESHOLD_SECONDS", "<init>", "()V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$b */
    /* loaded from: classes4.dex */
    public static final class C16379b {
        public /* synthetic */ C16379b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16379b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;", "", "LtE5;", "b", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$c */
    /* loaded from: classes4.dex */
    public enum EnumC16380c {
        PRIVATE_BIRD,
        ITEM_LEASE_AVAILABLE_BIRD,
        ITEM_LEASE_RETURNING_BIRD,
        ITEM_LEASE_BIRD,
        RIDING_BIRD;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$c$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C16381a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC16380c.values().length];
                try {
                    iArr[EnumC16380c.PRIVATE_BIRD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC16380c.ITEM_LEASE_AVAILABLE_BIRD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC16380c.ITEM_LEASE_RETURNING_BIRD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC16380c.ITEM_LEASE_BIRD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC16380c.RIDING_BIRD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: b */
        public final EnumC49121tE5 m54897b() {
            int i = C16381a.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EnumC49121tE5.RIDDEN_BIRD;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return EnumC49121tE5.ACTIVE_ITEM_LEASE_BIRD;
                    }
                    return EnumC49121tE5.RETURNING_ITEM_LEASE_BIRD;
                }
                return EnumC49121tE5.PENDING_ITEM_LEASE_BIRD;
            }
            return EnumC49121tE5.PRIVATE_BIRD;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lde5$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$e */
    /* loaded from: classes4.dex */
    public static final class C16383e extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Unit> {
        public C16383e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54890a(AbstractC39873de5.EnumC19828a enumC19828a) {
            C41318g46.AbstractC20723b m54942B = SmartLockGlobalBluetoothScanner.this.m54942B();
            String name = enumC19828a.name();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = name.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            m54942B.mo7221o("bluetooth state: " + lowerCase, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC39873de5.EnumC19828a enumC19828a) {
            m54890a(enumC19828a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lde5$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$f */
    /* loaded from: classes4.dex */
    public static final class C16384f extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Boolean> {

        /* renamed from: g */
        public static final C16384f f67023g = new C16384f();

        public C16384f() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "LsE5;", "locks", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$filterRecentlyActionedSmartLocks$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n766#2:482\n857#2,2:483\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$filterRecentlyActionedSmartLocks$1\n*L\n426#1:482\n426#1:483,2\n*E\n"})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$g */
    /* loaded from: classes4.dex */
    public static final class C16385g extends Lambda implements Function1<List<? extends C48528sE5>, List<? extends C48528sE5>> {
        public C16385g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C48528sE5> invoke(List<C48528sE5> locks) {
            boolean z;
            Intrinsics.checkNotNullParameter(locks, "locks");
            SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = SmartLockGlobalBluetoothScanner.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : locks) {
                C48528sE5 c48528sE5 = (C48528sE5) obj;
                Boolean m54930P = smartLockGlobalBluetoothScanner.m54930P(c48528sE5, EnumC16378a.UNLOCK, 13);
                if (m54930P != null || (m54930P = smartLockGlobalBluetoothScanner.m54930P(c48528sE5, EnumC16378a.NO_OP, 13)) != null) {
                    z = m54930P.booleanValue();
                } else {
                    Boolean m54930P2 = smartLockGlobalBluetoothScanner.m54930P(c48528sE5, EnumC16378a.HELMET_PROMPT, 15);
                    if (m54930P2 != null) {
                        z = m54930P2.booleanValue();
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$h */
    /* loaded from: classes4.dex */
    public static final class C16386h extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C48528sE5 f67026h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16386h(C48528sE5 c48528sE5) {
            super(1);
            this.f67026h = c48528sE5;
        }

        /* renamed from: a */
        public final void m54887a(InterfaceC23465c interfaceC23465c) {
            SmartLockGlobalBluetoothScanner.this.f67001f.mo19731a(this.f67026h, EnumC50899wE5.LEASE_STARTED);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m54887a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$i */
    /* loaded from: classes4.dex */
    public static final class C16387i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16387i f67027g = new C16387i();

        public C16387i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while connecting to lock in handlePendingItemLeaseConnection with active lease", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$j */
    /* loaded from: classes4.dex */
    public static final class C16388j extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C48528sE5 f67029h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16388j(C48528sE5 c48528sE5) {
            super(1);
            this.f67029h = c48528sE5;
        }

        /* renamed from: a */
        public final void m54886a(InterfaceC23465c interfaceC23465c) {
            SmartLockGlobalBluetoothScanner.this.f67001f.mo19731a(this.f67029h, EnumC50899wE5.STARTING_LEASE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m54886a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseStartResponse;", "it", "Lio/reactivex/u;", "Lcy0;", "LjI5;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/itemlease/LeaseStartResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$k */
    /* loaded from: classes4.dex */
    public static final class C16389k extends Lambda implements Function1<LeaseStartResponse, InterfaceC24574u<? extends C39475cy0<InterfaceC43228jI5>>> {

        /* renamed from: h */
        public final /* synthetic */ C48528sE5 f67031h;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcy0;", "LjI5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcy0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$k$a */
        /* loaded from: classes4.dex */
        public static final class C16390a extends Lambda implements Function1<C39475cy0<InterfaceC43228jI5>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67032g;

            /* renamed from: h */
            public final /* synthetic */ C48528sE5 f67033h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16390a(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner, C48528sE5 c48528sE5) {
                super(1);
                this.f67032g = smartLockGlobalBluetoothScanner;
                this.f67033h = c48528sE5;
            }

            /* renamed from: a */
            public final void m54881a(C39475cy0<InterfaceC43228jI5> c39475cy0) {
                this.f67032g.f67001f.mo19731a(this.f67033h, EnumC50899wE5.LEASE_STARTED);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C39475cy0<InterfaceC43228jI5> c39475cy0) {
                m54881a(c39475cy0);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$k$b */
        /* loaded from: classes4.dex */
        public static final class C16391b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C16391b f67034g = new C16391b();

            public C16391b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while connecting to lock in handlePendingItemLeaseConnection after starting lease", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16389k(C48528sE5 c48528sE5) {
            super(1);
            this.f67031h = c48528sE5;
        }

        /* renamed from: d */
        public static final void m54882d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends C39475cy0<InterfaceC43228jI5>> invoke(LeaseStartResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("lease started, connecting to lock now", new Object[0]);
            AbstractC23442F mo19729c = SmartLockGlobalBluetoothScanner.this.f67001f.mo19729c(this.f67031h, Duration.Companion.m118240getINFINITEUwyO8pc());
            final C16390a c16390a = new C16390a(SmartLockGlobalBluetoothScanner.this, this.f67031h);
            AbstractC23442F m33101w = mo19729c.m33101w(new InterfaceC23484g() { // from class: OE5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartLockGlobalBluetoothScanner.C16389k.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C16391b c16391b = C16391b.f67034g;
            return m33101w.m33106t(new InterfaceC23484g() { // from class: PE5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartLockGlobalBluetoothScanner.C16389k.m54882d(Function1.this, obj);
                }
            }).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$l */
    /* loaded from: classes4.dex */
    public static final class C16392l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16392l f67035g = new C16392l();

        public C16392l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while attempting to start lease and connect: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LsE5;", "smartLock", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "h", "(LsE5;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$handlePreUnlockAndConnectionStep$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1549#2:482\n1620#2,3:483\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$handlePreUnlockAndConnectionStep$1\n*L\n312#1:482\n312#1:483,3\n*E\n"})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m */
    /* loaded from: classes4.dex */
    public static final class C16393m extends Lambda implements Function1<C48528sE5, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m$a */
        /* loaded from: classes4.dex */
        public static final class C16394a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48528sE5 f67037g;

            /* renamed from: h */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67038h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16394a(C48528sE5 c48528sE5, SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner) {
                super(1);
                this.f67037g = c48528sE5;
                this.f67038h = smartLockGlobalBluetoothScanner;
            }

            /* renamed from: a */
            public final void m54866a(InterfaceC23465c interfaceC23465c) {
                if (Intrinsics.areEqual(this.f67037g.m14510e(), Boolean.TRUE)) {
                    SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = this.f67038h;
                    String m14509f = this.f67037g.m14509f();
                    DateTime now = DateTime.now();
                    Intrinsics.checkNotNullExpressionValue(now, "now()");
                    smartLockGlobalBluetoothScanner.m54926T(m14509f, now, EnumC16378a.NO_OP);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m54866a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lcy0;", "LjI5;", "it", "Lkotlin/Pair;", "LsE5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcy0;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m$b */
        /* loaded from: classes4.dex */
        public static final class C16395b extends Lambda implements Function1<C39475cy0<InterfaceC43228jI5>, Pair<? extends C39475cy0<InterfaceC43228jI5>, ? extends C48528sE5>> {

            /* renamed from: g */
            public final /* synthetic */ C48528sE5 f67039g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16395b(C48528sE5 c48528sE5) {
                super(1);
                this.f67039g = c48528sE5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<C39475cy0<InterfaceC43228jI5>, C48528sE5> invoke(C39475cy0<InterfaceC43228jI5> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f67039g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lcy0;", "LjI5;", "it", "Lkotlin/Pair;", "LsE5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcy0;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m$c */
        /* loaded from: classes4.dex */
        public static final class C16396c extends Lambda implements Function1<C39475cy0<InterfaceC43228jI5>, Pair<? extends C39475cy0<InterfaceC43228jI5>, ? extends C48528sE5>> {

            /* renamed from: g */
            public final /* synthetic */ C48528sE5 f67040g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16396c(C48528sE5 c48528sE5) {
                super(1);
                this.f67040g = c48528sE5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<C39475cy0<InterfaceC43228jI5>, C48528sE5> invoke(C39475cy0<InterfaceC43228jI5> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f67040g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m$d */
        /* loaded from: classes4.dex */
        public static final class C16397d extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48528sE5 f67041g;

            /* renamed from: h */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67042h;

            /* renamed from: i */
            public final /* synthetic */ Lazy<WireBird> f67043i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16397d(C48528sE5 c48528sE5, SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner, Lazy<WireBird> lazy) {
                super(1);
                this.f67041g = c48528sE5;
                this.f67042h = smartLockGlobalBluetoothScanner;
                this.f67043i = lazy;
            }

            /* renamed from: a */
            public final void m54863a(InterfaceC23465c interfaceC23465c) {
                EnumC49121tE5 m14512c = this.f67041g.m14512c();
                String m14511d = this.f67041g.m14511d();
                C41318g46.m40163a("redirecting to helmet lease prompt before starting item lease (context=" + m14512c + ", smartlock id = " + m14511d + ")", new Object[0]);
                SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = this.f67042h;
                String m14509f = this.f67041g.m14509f();
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                smartLockGlobalBluetoothScanner.m54926T(m14509f, now, EnumC16378a.HELMET_PROMPT);
                this.f67042h.f67003h.mo36986m(C16393m.m54872i(this.f67043i), 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m54863a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m$e */
        /* loaded from: classes4.dex */
        public static final class C16398e extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67044g;

            /* renamed from: h */
            public final /* synthetic */ C48528sE5 f67045h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16398e(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner, C48528sE5 c48528sE5) {
                super(1);
                this.f67044g = smartLockGlobalBluetoothScanner;
                this.f67045h = c48528sE5;
            }

            /* renamed from: a */
            public final void m54862a(InterfaceC23465c interfaceC23465c) {
                SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = this.f67044g;
                String m14509f = this.f67045h.m14509f();
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                smartLockGlobalBluetoothScanner.m54926T(m14509f, now, EnumC16378a.NO_OP);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m54862a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m$f */
        /* loaded from: classes4.dex */
        public static final class C16399f extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67046g;

            /* renamed from: h */
            public final /* synthetic */ C48528sE5 f67047h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16399f(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner, C48528sE5 c48528sE5) {
                super(1);
                this.f67046g = smartLockGlobalBluetoothScanner;
                this.f67047h = c48528sE5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                C41318g46.m40161c(it, "Error on in smart lock connect step: ", new Object[0]);
                InterfaceC42015hF5 interfaceC42015hF5 = this.f67046g.f67001f;
                C48528sE5 smartLock = this.f67047h;
                Intrinsics.checkNotNullExpressionValue(smartLock, "smartLock");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                interfaceC42015hF5.mo19730b(smartLock, it);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "b", "()Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$m$g */
        /* loaded from: classes4.dex */
        public static final class C16400g extends Lambda implements Function0<WireBird> {

            /* renamed from: g */
            public final /* synthetic */ Bird f67048g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16400g(Bird bird) {
                super(0);
                this.f67048g = bird;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final WireBird invoke() {
                Bird bird = this.f67048g;
                WireBird m73298p = bird != null ? C10235ZK.m73298p(bird) : null;
                Intrinsics.checkNotNull(m73298p);
                return m73298p;
            }
        }

        public C16393m() {
            super(1);
        }

        /* renamed from: i */
        public static final WireBird m54872i(Lazy<WireBird> lazy) {
            return lazy.getValue();
        }

        public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final void m54871j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final Pair m54870k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final void m54869l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: m */
        public static final void m54868m(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: n */
        public static final void m54867n(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: h */
        public final InterfaceC23496h invoke(C48528sE5 smartLock) {
            Lazy lazy;
            String str;
            AbstractC24507p m32067H;
            List<PhysicalLock> physicalLocks;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(smartLock, "smartLock");
            Bird m14513b = smartLock.m14513b();
            lazy = LazyKt__LazyJVMKt.lazy(new C16400g(m14513b));
            SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = SmartLockGlobalBluetoothScanner.this;
            if (smartLock.m14512c() == EnumC49121tE5.RETURNING_ITEM_LEASE_BIRD && m14513b != null) {
                C41318g46.m40163a("no action for context = " + smartLock.m14512c() + " since only scan is required, smart lock id = " + smartLock.m14511d() + " locked state = " + smartLock.m14510e(), new Object[0]);
                AbstractC24507p m32024u = AbstractC24507p.m32024u();
                final C16394a c16394a = new C16394a(smartLock, SmartLockGlobalBluetoothScanner.this);
                m32067H = m32024u.m32027r(new InterfaceC23484g() { // from class: QE5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        SmartLockGlobalBluetoothScanner.C16393m.m54871j(Function1.this, obj);
                    }
                });
            } else if (smartLock.m14512c() == EnumC49121tE5.PENDING_ITEM_LEASE_BIRD && m14513b != null) {
                C41318g46.m40163a("attempting to handle pending item lease connection flow (start lease + connect) for smartlock id = " + smartLock.m14511d(), new Object[0]);
                AbstractC24507p m54940D = SmartLockGlobalBluetoothScanner.this.m54940D(smartLock, m14513b);
                final C16395b c16395b = new C16395b(smartLock);
                m32067H = m54940D.m32067H(new InterfaceC23492o() { // from class: RE5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$2;
                        invoke$lambda$2 = SmartLockGlobalBluetoothScanner.C16393m.invoke$lambda$2(Function1.this, obj);
                        return invoke$lambda$2;
                    }
                });
            } else {
                if (smartLock.m14512c() != EnumC49121tE5.PRIVATE_BIRD && smartLock.m14512c() != EnumC49121tE5.ACTIVE_ITEM_LEASE_BIRD && m14513b != null) {
                    InterfaceC34441Mc2 interfaceC34441Mc2 = SmartLockGlobalBluetoothScanner.this.f66999d;
                    WireBird m54872i = m54872i(lazy);
                    ItemLeaseType itemLeaseType = ItemLeaseType.HELMET;
                    if (interfaceC34441Mc2.mo55655t(m54872i, itemLeaseType)) {
                        if (SmartLockGlobalBluetoothScanner.this.f66999d.mo55655t(m54872i(lazy), itemLeaseType) && !SmartLockGlobalBluetoothScanner.this.f66999d.mo55663n(m54872i(lazy), itemLeaseType) && !Intrinsics.areEqual(SmartLockGlobalBluetoothScanner.this.m54930P(smartLock, EnumC16378a.HELMET_PROMPT, 15), Boolean.FALSE)) {
                            AbstractC24507p m32024u2 = AbstractC24507p.m32024u();
                            final C16397d c16397d = new C16397d(smartLock, SmartLockGlobalBluetoothScanner.this, lazy);
                            m32067H = m32024u2.m32027r(new InterfaceC23484g() { // from class: TE5
                                @Override // io.reactivex.functions.InterfaceC23484g
                                public final void accept(Object obj) {
                                    SmartLockGlobalBluetoothScanner.C16393m.m54869l(Function1.this, obj);
                                }
                            });
                        } else {
                            C41318g46.m40163a("no action for context = " + smartLock.m14512c() + ", smart lock id = " + smartLock.m14511d() + " ", new Object[0]);
                            AbstractC24507p m32024u3 = AbstractC24507p.m32024u();
                            final C16398e c16398e = new C16398e(SmartLockGlobalBluetoothScanner.this, smartLock);
                            m32067H = m32024u3.m32027r(new InterfaceC23484g() { // from class: UE5
                                @Override // io.reactivex.functions.InterfaceC23484g
                                public final void accept(Object obj) {
                                    SmartLockGlobalBluetoothScanner.C16393m.m54868m(Function1.this, obj);
                                }
                            });
                        }
                    }
                }
                EnumC49121tE5 m14512c = smartLock.m14512c();
                String m14511d = smartLock.m14511d();
                ArrayList arrayList = null;
                if (m14513b != null) {
                    str = m14513b.getId();
                } else {
                    str = null;
                }
                if (m14513b != null && (physicalLocks = m14513b.getPhysicalLocks()) != null) {
                    List<PhysicalLock> list = physicalLocks;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault);
                    for (PhysicalLock physicalLock : list) {
                        arrayList.add(physicalLock.getId());
                    }
                }
                C41318g46.m40163a("attempting to unlock smart lock now (context=" + m14512c + ", smartlock id = " + m14511d + ", bird id = " + str + ", physical lock ids = " + arrayList + ")", new Object[0]);
                AbstractC24507p m54941C = SmartLockGlobalBluetoothScanner.this.m54941C(smartLock);
                final C16396c c16396c = new C16396c(smartLock);
                m32067H = m54941C.m32067H(new InterfaceC23492o() { // from class: SE5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m54870k;
                        m54870k = SmartLockGlobalBluetoothScanner.C16393m.m54870k(Function1.this, obj);
                        return m54870k;
                    }
                });
            }
            final C16399f c16399f = new C16399f(SmartLockGlobalBluetoothScanner.this, smartLock);
            AbstractC24507p m32065J = m32067H.m32029p(new InterfaceC23484g() { // from class: VE5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartLockGlobalBluetoothScanner.C16393m.m54867n(Function1.this, obj);
                }
            }).m32065J();
            Intrinsics.checkNotNullExpressionValue(m32065J, "private fun Flowable<Sma…/* maxConcurrency */)\n  }");
            return smartLockGlobalBluetoothScanner.m54932N(m32065J);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$o */
    /* loaded from: classes4.dex */
    public static final class C16403o extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C16403o f67054g = new C16403o();

        public C16403o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabledV2", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$p */
    /* loaded from: classes4.dex */
    public static final class C16404p extends Lambda implements Function1<Boolean, Unit> {
        public C16404p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabledV2) {
            Intrinsics.checkNotNullExpressionValue(enabledV2, "enabledV2");
            if (enabledV2.booleanValue()) {
                SmartLockGlobalBluetoothScanner.this.m54942B().mo7221o("Starting v2 physical/smart lock bluetooth scanning on start", new Object[0]);
                SmartLockGlobalBluetoothScanner.this.f67004i.mo32983c(SmartLockGlobalBluetoothScanner.this.m54925U());
                return;
            }
            SmartLockGlobalBluetoothScanner.this.m54942B().mo7221o("Stopping v2 physical/smart lock bluetooth scanning due to config change", new Object[0]);
            SmartLockGlobalBluetoothScanner.this.f67004i.m33026d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "isReady", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$q */
    /* loaded from: classes4.dex */
    public static final class C16405q extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Unit>> {

        /* renamed from: g */
        public static final C16405q f67056g = new C16405q();

        public C16405q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Boolean isReady) {
            Intrinsics.checkNotNullParameter(isReady, "isReady");
            if (isReady.booleanValue()) {
                return Observable.just(Unit.INSTANCE);
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$r */
    /* loaded from: classes4.dex */
    public static final class C16406r extends Lambda implements Function1<Unit, InterfaceC23434B<? extends List<? extends C16382d>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$r$a */
        /* loaded from: classes4.dex */
        public static final class C16407a extends Lambda implements Function1<List<? extends WireBird>, List<? extends C16382d>> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67058g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16407a(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner) {
                super(1);
                this.f67058g = smartLockGlobalBluetoothScanner;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<C16382d> invoke(List<WireBird> birds) {
                Intrinsics.checkNotNullParameter(birds, "birds");
                return this.f67058g.m54929Q(birds, EnumC16380c.PRIVATE_BIRD);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n766#2:482\n857#2,2:483\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$2\n*L\n166#1:482\n166#1:483,2\n*E\n"})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$r$b */
        /* loaded from: classes4.dex */
        public static final class C16408b extends Lambda implements Function1<List<? extends WireBird>, List<? extends C16382d>> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67059g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16408b(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner) {
                super(1);
                this.f67059g = smartLockGlobalBluetoothScanner;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<C16382d> invoke(List<WireBird> birds) {
                Object firstOrNull;
                Intrinsics.checkNotNullParameter(birds, "birds");
                ArrayList arrayList = new ArrayList();
                for (Object obj : this.f67059g.m54929Q(birds, EnumC16380c.ITEM_LEASE_BIRD)) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) ((C16382d) obj).m54893d());
                    WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) firstOrNull;
                    boolean z = false;
                    if (wirePhysicalLock != null && wirePhysicalLock.isSolebe()) {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "", "Lco/bird/android/model/wire/WireBird;", "birds", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$r$c */
        /* loaded from: classes4.dex */
        public static final class C16409c extends Lambda implements Function1<Map<ItemLeaseType, ? extends List<? extends WireBird>>, List<? extends C16382d>> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67060g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16409c(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner) {
                super(1);
                this.f67060g = smartLockGlobalBluetoothScanner;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<C16382d> invoke(Map<ItemLeaseType, ? extends List<WireBird>> birds) {
                List<C16382d> emptyList;
                List<C16382d> m54929Q;
                Intrinsics.checkNotNullParameter(birds, "birds");
                List<WireBird> list = birds.get(ItemLeaseType.HELMET);
                if (list == null || (m54929Q = this.f67060g.m54929Q(list, EnumC16380c.ITEM_LEASE_AVAILABLE_BIRD)) == null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    return emptyList;
                }
                return m54929Q;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "", "Lco/bird/android/model/wire/WireBird;", "birds", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$r$d */
        /* loaded from: classes4.dex */
        public static final class C16410d extends Lambda implements Function1<Map<ItemLeaseType, ? extends List<? extends WireBird>>, List<? extends C16382d>> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67061g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16410d(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner) {
                super(1);
                this.f67061g = smartLockGlobalBluetoothScanner;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<C16382d> invoke(Map<ItemLeaseType, ? extends List<WireBird>> birds) {
                List<C16382d> emptyList;
                List<C16382d> m54929Q;
                Intrinsics.checkNotNullParameter(birds, "birds");
                List<WireBird> list = birds.get(ItemLeaseType.HELMET);
                if (list == null || (m54929Q = this.f67061g.m54929Q(list, EnumC16380c.ITEM_LEASE_RETURNING_BIRD)) == null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    return emptyList;
                }
                return m54929Q;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "rideStates", "", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1603#2,9:482\n1855#2:491\n1747#2,3:492\n766#2:495\n857#2,2:496\n1856#2:499\n1612#2:500\n1#3:498\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$5\n*L\n184#1:482,9\n184#1:491\n186#1:492,3\n192#1:495\n192#1:496,2\n184#1:499\n184#1:500\n184#1:498\n*E\n"})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$r$e */
        /* loaded from: classes4.dex */
        public static final class C16411e extends Lambda implements Function1<RideStates, List<? extends C16382d>> {

            /* renamed from: g */
            public static final C16411e f67062g = new C16411e();

            public C16411e() {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List<C16382d> invoke(RideStates rideStates) {
                boolean z;
                boolean z2;
                WireBird wireBird;
                List emptyList;
                ArrayList arrayList;
                boolean z3;
                boolean z4;
                boolean z5;
                Intrinsics.checkNotNullParameter(rideStates, "rideStates");
                ArrayList arrayList2 = new ArrayList();
                for (RideState rideState : rideStates.getRideStates()) {
                    WireBird bird = rideState.getRide().getBird();
                    C16382d c16382d = null;
                    if (bird != null) {
                        List<WirePhysicalLock> physicalLocks = bird.getPhysicalLocks();
                        if (physicalLocks != null) {
                            List<WirePhysicalLock> list = physicalLocks;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (WirePhysicalLock wirePhysicalLock : list) {
                                    if (!wirePhysicalLock.isBrainLock() && !wirePhysicalLock.isSolebe()) {
                                        z4 = true;
                                        continue;
                                    } else {
                                        z4 = false;
                                        continue;
                                    }
                                    if (z4) {
                                        z5 = true;
                                        break;
                                    }
                                }
                            }
                            z5 = false;
                            if (z5) {
                                z = true;
                                if (!z && RideStateKt.isInRide(rideState)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    wireBird = bird;
                                } else {
                                    wireBird = null;
                                }
                                if (wireBird != null) {
                                    EnumC16380c enumC16380c = EnumC16380c.RIDING_BIRD;
                                    String id = wireBird.getId();
                                    List<WirePhysicalLock> physicalLocks2 = wireBird.getPhysicalLocks();
                                    if (physicalLocks2 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj : physicalLocks2) {
                                            WirePhysicalLock wirePhysicalLock2 = (WirePhysicalLock) obj;
                                            if (!wirePhysicalLock2.isBrainLock() && !wirePhysicalLock2.isSolebe()) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                arrayList3.add(obj);
                                            }
                                        }
                                        arrayList = arrayList3;
                                    } else {
                                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                                        arrayList = emptyList;
                                    }
                                    c16382d = new C16382d(enumC16380c, id, wireBird, arrayList, rideState.getRide().getId());
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                        z2 = false;
                        if (!z2) {
                        }
                        if (wireBird != null) {
                        }
                    }
                    if (c16382d != null) {
                        arrayList2.add(c16382d);
                    }
                }
                return arrayList2;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "privateBirds", "itemLeaseBirds", "itemLeasePendingBirds", "itemLeaseReturningBirds", "ridingBirds", C17296a.f69688o, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1603#2,9:482\n1855#2:491\n1856#2:493\n1612#2:494\n1603#2,9:495\n1855#2:504\n1856#2:506\n1612#2:507\n1603#2,9:508\n1855#2:517\n1856#2:519\n1612#2:520\n1603#2,9:521\n1855#2:530\n1856#2:532\n1612#2:533\n1603#2,9:534\n1855#2:543\n1856#2:545\n1612#2:546\n1655#2,8:547\n1#3:492\n1#3:505\n1#3:518\n1#3:531\n1#3:544\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$2$6\n*L\n201#1:482,9\n201#1:491\n201#1:493\n201#1:494\n202#1:495,9\n202#1:504\n202#1:506\n202#1:507\n203#1:508,9\n203#1:517\n203#1:519\n203#1:520\n204#1:521,9\n204#1:530\n204#1:532\n204#1:533\n205#1:534,9\n205#1:543\n205#1:545\n205#1:546\n206#1:547,8\n201#1:492\n202#1:505\n203#1:518\n204#1:531\n205#1:544\n*E\n"})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$r$f */
        /* loaded from: classes4.dex */
        public static final class C16412f extends Lambda implements Function5<List<? extends C16382d>, List<? extends C16382d>, List<? extends C16382d>, List<? extends C16382d>, List<? extends C16382d>, List<? extends C16382d>> {

            /* renamed from: g */
            public static final C16412f f67063g = new C16412f();

            public C16412f() {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            /* renamed from: a */
            public final List<C16382d> invoke(List<C16382d> privateBirds, List<C16382d> itemLeaseBirds, List<C16382d> itemLeasePendingBirds, List<C16382d> itemLeaseReturningBirds, List<C16382d> ridingBirds) {
                List plus;
                List plus2;
                List plus3;
                List plus4;
                Object firstOrNull;
                String str;
                WireSmartlock smartlock;
                Object firstOrNull2;
                String str2;
                WireSmartlock smartlock2;
                Object firstOrNull3;
                String str3;
                WireSmartlock smartlock3;
                Object firstOrNull4;
                String str4;
                WireSmartlock smartlock4;
                Object firstOrNull5;
                WireSmartlock smartlock5;
                Intrinsics.checkNotNullParameter(privateBirds, "privateBirds");
                Intrinsics.checkNotNullParameter(itemLeaseBirds, "itemLeaseBirds");
                Intrinsics.checkNotNullParameter(itemLeasePendingBirds, "itemLeasePendingBirds");
                Intrinsics.checkNotNullParameter(itemLeaseReturningBirds, "itemLeaseReturningBirds");
                Intrinsics.checkNotNullParameter(ridingBirds, "ridingBirds");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = privateBirds.iterator();
                while (true) {
                    String str5 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    firstOrNull5 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) ((C16382d) it.next()).m54893d());
                    WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) firstOrNull5;
                    if (wirePhysicalLock != null && (smartlock5 = wirePhysicalLock.getSmartlock()) != null) {
                        str5 = smartlock5.getMacAddress();
                    }
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                }
                C41318g46.m40163a("private bird smartlock mac addresses: " + arrayList, new Object[0]);
                List<C16382d> list = itemLeaseBirds;
                ArrayList arrayList2 = new ArrayList();
                for (C16382d c16382d : list) {
                    firstOrNull4 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c16382d.m54893d());
                    WirePhysicalLock wirePhysicalLock2 = (WirePhysicalLock) firstOrNull4;
                    if (wirePhysicalLock2 != null && (smartlock4 = wirePhysicalLock2.getSmartlock()) != null) {
                        str4 = smartlock4.getMacAddress();
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        arrayList2.add(str4);
                    }
                }
                C41318g46.m40163a("item lease bird smartlock mac addresses: " + arrayList2, new Object[0]);
                List<C16382d> list2 = itemLeasePendingBirds;
                ArrayList arrayList3 = new ArrayList();
                for (C16382d c16382d2 : list2) {
                    firstOrNull3 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c16382d2.m54893d());
                    WirePhysicalLock wirePhysicalLock3 = (WirePhysicalLock) firstOrNull3;
                    if (wirePhysicalLock3 != null && (smartlock3 = wirePhysicalLock3.getSmartlock()) != null) {
                        str3 = smartlock3.getMacAddress();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        arrayList3.add(str3);
                    }
                }
                C41318g46.m40163a("pending item lease bird smartlock mac addresses: " + arrayList3, new Object[0]);
                List<C16382d> list3 = itemLeaseReturningBirds;
                ArrayList arrayList4 = new ArrayList();
                for (C16382d c16382d3 : list3) {
                    firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c16382d3.m54893d());
                    WirePhysicalLock wirePhysicalLock4 = (WirePhysicalLock) firstOrNull2;
                    if (wirePhysicalLock4 != null && (smartlock2 = wirePhysicalLock4.getSmartlock()) != null) {
                        str2 = smartlock2.getMacAddress();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList4.add(str2);
                    }
                }
                C41318g46.m40163a("returning item lease bird smartlock mac addresses: " + arrayList4, new Object[0]);
                List<C16382d> list4 = ridingBirds;
                ArrayList arrayList5 = new ArrayList();
                for (C16382d c16382d4 : list4) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c16382d4.m54893d());
                    WirePhysicalLock wirePhysicalLock5 = (WirePhysicalLock) firstOrNull;
                    if (wirePhysicalLock5 != null && (smartlock = wirePhysicalLock5.getSmartlock()) != null) {
                        str = smartlock.getMacAddress();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        arrayList5.add(str);
                    }
                }
                C41318g46.m40163a("riding bird smartlock mac addresses: " + arrayList5, new Object[0]);
                plus = CollectionsKt___CollectionsKt.plus((Collection) privateBirds, (Iterable) list3);
                plus2 = CollectionsKt___CollectionsKt.plus((Collection) plus, (Iterable) list);
                plus3 = CollectionsKt___CollectionsKt.plus((Collection) plus2, (Iterable) list2);
                plus4 = CollectionsKt___CollectionsKt.plus((Collection) plus3, (Iterable) list4);
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj : plus4) {
                    if (hashSet.add(((C16382d) obj).m54894c())) {
                        arrayList6.add(obj);
                    }
                }
                return arrayList6;
            }
        }

        public C16406r() {
            super(1);
        }

        /* renamed from: f */
        public static final List m54852f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final List m54851g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final List m54850h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final List m54849i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final List m54848j(Function5 tmp0, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj, obj2, obj3, obj4, obj5);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends List<C16382d>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Observable<List<WireBird>> distinctUntilChanged = SmartLockGlobalBluetoothScanner.this.f66997b.mo18198p().distinctUntilChanged();
            final C16407a c16407a = new C16407a(SmartLockGlobalBluetoothScanner.this);
            InterfaceC23434B map = distinctUntilChanged.map(new InterfaceC23492o() { // from class: YE5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m54852f;
                    m54852f = SmartLockGlobalBluetoothScanner.C16406r.m54852f(Function1.this, obj);
                    return m54852f;
                }
            });
            Observable<List<WireBird>> distinctUntilChanged2 = SmartLockGlobalBluetoothScanner.this.f66999d.mo55679d().distinctUntilChanged();
            final C16408b c16408b = new C16408b(SmartLockGlobalBluetoothScanner.this);
            InterfaceC23434B map2 = distinctUntilChanged2.map(new InterfaceC23492o() { // from class: ZE5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m54851g;
                    m54851g = SmartLockGlobalBluetoothScanner.C16406r.m54851g(Function1.this, obj);
                    return m54851g;
                }
            });
            Observable<Map<ItemLeaseType, List<WireBird>>> distinctUntilChanged3 = SmartLockGlobalBluetoothScanner.this.f66999d.mo55705D().distinctUntilChanged();
            final C16409c c16409c = new C16409c(SmartLockGlobalBluetoothScanner.this);
            InterfaceC23434B map3 = distinctUntilChanged3.map(new InterfaceC23492o() { // from class: aF5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m54850h;
                    m54850h = SmartLockGlobalBluetoothScanner.C16406r.m54850h(Function1.this, obj);
                    return m54850h;
                }
            });
            Observable<Map<ItemLeaseType, List<WireBird>>> distinctUntilChanged4 = SmartLockGlobalBluetoothScanner.this.f66999d.mo55652w().distinctUntilChanged();
            final C16410d c16410d = new C16410d(SmartLockGlobalBluetoothScanner.this);
            InterfaceC23434B map4 = distinctUntilChanged4.map(new InterfaceC23492o() { // from class: bF5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m54849i;
                    m54849i = SmartLockGlobalBluetoothScanner.C16406r.m54849i(Function1.this, obj);
                    return m54849i;
                }
            });
            Observable distinctUntilChanged5 = C37279Yf5.m74575T(SmartLockGlobalBluetoothScanner.this.f66998c.mo75032o0(), C16411e.f67062g).distinctUntilChanged();
            final C16412f c16412f = C16412f.f67063g;
            return Observable.combineLatest(map, map2, map3, map4, distinctUntilChanged5, new InterfaceC23487j() { // from class: cF5
                @Override // io.reactivex.functions.InterfaceC23487j
                public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    List m54848j;
                    m54848j = SmartLockGlobalBluetoothScanner.C16406r.m54848j(Function5.this, obj, obj2, obj3, obj4, obj5);
                    return m54848j;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "scannableBirds", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1549#2:482\n1620#2,2:483\n1603#2,9:485\n1855#2:494\n1856#2:496\n1612#2,11:497\n1#3:495\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$3\n*L\n211#1:482\n211#1:483,2\n211#1:485,9\n211#1:494\n211#1:496\n211#1:497,11\n211#1:495\n*E\n"})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$s */
    /* loaded from: classes4.dex */
    public static final class C16413s extends Lambda implements Function1<List<? extends C16382d>, Pair<? extends List<? extends C16382d>, ? extends Set<? extends String>>> {

        /* renamed from: g */
        public static final C16413s f67064g = new C16413s();

        public C16413s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<C16382d>, Set<String>> invoke(List<C16382d> scannableBirds) {
            int collectionSizeOrDefault;
            List flatten;
            Set set;
            String str;
            Intrinsics.checkNotNullParameter(scannableBirds, "scannableBirds");
            List<C16382d> list = scannableBirds;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (C16382d c16382d : list) {
                ArrayList arrayList2 = new ArrayList();
                for (WirePhysicalLock wirePhysicalLock : c16382d.m54893d()) {
                    WireSmartlock smartlock = wirePhysicalLock.getSmartlock();
                    if (smartlock != null) {
                        str = smartlock.getMacAddress();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                arrayList.add(arrayList2);
            }
            flatten = CollectionsKt__IterablesKt.flatten(arrayList);
            set = CollectionsKt___CollectionsKt.toSet(flatten);
            return TuplesKt.m28425to(scannableBirds, set);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00002\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "", "", "one", "two", "", C17296a.f69688o, "(Lkotlin/Pair;Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$t */
    /* loaded from: classes4.dex */
    public static final class C16414t extends Lambda implements Function2<Pair<? extends List<? extends C16382d>, ? extends Set<? extends String>>, Pair<? extends List<? extends C16382d>, ? extends Set<? extends String>>, Boolean> {

        /* renamed from: g */
        public static final C16414t f67065g = new C16414t();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$4$allTypesMatch$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1549#2:482\n1620#2,3:483\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$4$allTypesMatch$2\n*L\n216#1:482\n216#1:483,3\n*E\n"})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$t$a */
        /* loaded from: classes4.dex */
        public static final class C16415a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Pair<List<C16382d>, Set<String>> f67066g;

            /* renamed from: h */
            public final /* synthetic */ Pair<List<C16382d>, Set<String>> f67067h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C16415a(Pair<? extends List<C16382d>, ? extends Set<String>> pair, Pair<? extends List<C16382d>, ? extends Set<String>> pair2) {
                super(0);
                this.f67066g = pair;
                this.f67067h = pair2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                int collectionSizeOrDefault;
                Set set;
                int collectionSizeOrDefault2;
                Set set2;
                List<C16382d> first = this.f67066g.getFirst();
                Intrinsics.checkNotNullExpressionValue(first, "one.first");
                List<C16382d> list = first;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (C16382d c16382d : list) {
                    arrayList.add(c16382d.m54891f());
                }
                set = CollectionsKt___CollectionsKt.toSet(arrayList);
                List<C16382d> first2 = this.f67067h.getFirst();
                Intrinsics.checkNotNullExpressionValue(first2, "two.first");
                List<C16382d> list2 = first2;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (C16382d c16382d2 : list2) {
                    arrayList2.add(c16382d2.m54891f());
                }
                set2 = CollectionsKt___CollectionsKt.toSet(arrayList2);
                return Boolean.valueOf(Intrinsics.areEqual(set, set2));
            }
        }

        public C16414t() {
            super(2);
        }

        /* renamed from: b */
        public static final boolean m54839b(Lazy<Boolean> lazy) {
            return lazy.getValue().booleanValue();
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Pair<? extends List<C16382d>, ? extends Set<String>> one, Pair<? extends List<C16382d>, ? extends Set<String>> two) {
            Lazy lazy;
            boolean z;
            Intrinsics.checkNotNullParameter(one, "one");
            Intrinsics.checkNotNullParameter(two, "two");
            lazy = LazyKt__LazyJVMKt.lazy(new C16415a(one, two));
            if (Intrinsics.areEqual(one.getSecond(), two.getSecond()) && m54839b(lazy)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public SmartLockGlobalBluetoothScanner(InterfaceC47256q54 privateBirdsManager, YR4 rideManager, InterfaceC34441Mc2 itemLeaseManager, C36207Tq4 reactiveConfig, InterfaceC42015hF5 smartLockManager, InterfaceC1510DX bluetoothManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(smartLockManager, "smartLockManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f66997b = privateBirdsManager;
        this.f66998c = rideManager;
        this.f66999d = itemLeaseManager;
        this.f67000e = reactiveConfig;
        this.f67001f = smartLockManager;
        this.f67002g = bluetoothManager;
        this.f67003h = navigator;
        this.f67004i = new C23464b();
        Observable<AbstractC39873de5.EnumC19828a> mo107063b = bluetoothManager.mo107063b();
        final C16383e c16383e = new C16383e();
        Observable<AbstractC39873de5.EnumC19828a> doOnNext = mo107063b.doOnNext(new InterfaceC23484g() { // from class: xE5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartLockGlobalBluetoothScanner.m54902x(Function1.this, obj);
            }
        });
        final C16384f c16384f = C16384f.f67023g;
        this.f67005j = doOnNext.map(new InterfaceC23492o() { // from class: FE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m54901y;
                m54901y = SmartLockGlobalBluetoothScanner.m54901y(Function1.this, obj);
                return m54901y;
            }
        }).distinctUntilChanged();
        this.f67006k = new C50303vE2<>(25);
    }

    /* renamed from: A */
    public static final List m54943A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m54939E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m54938G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m54937H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC24574u m54936J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m54935K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23496h m54933M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23496h m54931O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final Boolean m54928R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m54927S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23434B m54924V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23434B m54923W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final Pair m54922X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final boolean m54921Y(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: Z */
    public static final InterfaceC23496h m54920Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m54902x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Boolean m54901y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final C41318g46.AbstractC20723b m54942B() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("smartlock-global-ble-scanner");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"smartlock-global-ble-scanner\")");
        return m40153k;
    }

    /* renamed from: C */
    public final AbstractC24507p<C39475cy0<InterfaceC43228jI5>> m54941C(C48528sE5 c48528sE5) {
        C41318g46.m40163a("attempting to connect to smart lock now", new Object[0]);
        AbstractC24507p<C39475cy0<InterfaceC43228jI5>> m33125j0 = this.f67001f.mo19729c(c48528sE5, Duration.Companion.m118240getINFINITEUwyO8pc()).m33125j0();
        Intrinsics.checkNotNullExpressionValue(m33125j0, "smartLockManager.connect…E,\n    )\n      .toMaybe()");
        return m33125j0;
    }

    /* renamed from: D */
    public final AbstractC24507p<C39475cy0<InterfaceC43228jI5>> m54940D(C48528sE5 c48528sE5, Bird bird) {
        WireBird m73298p = C10235ZK.m73298p(bird);
        if (this.f66999d.mo55666l(m73298p, ItemLeaseType.HELMET)) {
            C41318g46.m40163a("handlePendingItemLeaseConnection called, we already have a helmet lease so just connecting now", new Object[0]);
            AbstractC23442F mo19729c = this.f67001f.mo19729c(c48528sE5, Duration.Companion.m118240getINFINITEUwyO8pc());
            final C16386h c16386h = new C16386h(c48528sE5);
            AbstractC23442F m33102v = mo19729c.m33102v(new InterfaceC23484g() { // from class: AE5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartLockGlobalBluetoothScanner.m54939E(Function1.this, obj);
                }
            });
            final C16387i c16387i = C16387i.f67027g;
            AbstractC24507p<C39475cy0<InterfaceC43228jI5>> m33125j0 = m33102v.m33106t(new InterfaceC23484g() { // from class: BE5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartLockGlobalBluetoothScanner.m54938G(Function1.this, obj);
                }
            }).m33125j0();
            Intrinsics.checkNotNullExpressionValue(m33125j0, "private fun SmartLock.ha…d connect: \") }\n    }\n  }");
            return m33125j0;
        }
        this.f66998c.mo75022y();
        C41318g46.m40163a("handlePendingItemLeaseConnection called, starting lease before connecting", new Object[0]);
        AbstractC23442F<LeaseStartResponse> mo55704E = this.f66999d.mo55704E(m73298p);
        final C16388j c16388j = new C16388j(c48528sE5);
        AbstractC23442F<LeaseStartResponse> m33102v2 = mo55704E.m33102v(new InterfaceC23484g() { // from class: CE5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartLockGlobalBluetoothScanner.m54937H(Function1.this, obj);
            }
        });
        final C16389k c16389k = new C16389k(c48528sE5);
        AbstractC24507p<R> m33163C = m33102v2.m33163C(new InterfaceC23492o() { // from class: DE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m54936J;
                m54936J = SmartLockGlobalBluetoothScanner.m54936J(Function1.this, obj);
                return m54936J;
            }
        });
        final C16392l c16392l = C16392l.f67035g;
        AbstractC24507p<C39475cy0<InterfaceC43228jI5>> m32029p = m33163C.m32029p(new InterfaceC23484g() { // from class: EE5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartLockGlobalBluetoothScanner.m54935K(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32029p, "private fun SmartLock.ha…d connect: \") }\n    }\n  }");
        return m32029p;
    }

    /* renamed from: L */
    public final AbstractC23461c m54934L(AbstractC24490k<C48528sE5> abstractC24490k) {
        final C16393m c16393m = new C16393m();
        AbstractC23461c m32160a0 = abstractC24490k.m32160a0(new InterfaceC23492o() { // from class: ME5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m54933M;
                m54933M = SmartLockGlobalBluetoothScanner.m54933M(Function1.this, obj);
                return m54933M;
            }
        }, false, 1);
        Intrinsics.checkNotNullExpressionValue(m32160a0, "private fun Flowable<Sma…/* maxConcurrency */)\n  }");
        return m32160a0;
    }

    /* renamed from: N */
    public final AbstractC23461c m54932N(AbstractC24507p<Pair<C39475cy0<InterfaceC43228jI5>, C48528sE5>> abstractC24507p) {
        final C16401n c16401n = new C16401n();
        AbstractC23461c m32074A = abstractC24507p.m32074A(new InterfaceC23492o() { // from class: zE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m54931O;
                m54931O = SmartLockGlobalBluetoothScanner.m54931O(Function1.this, obj);
                return m54931O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "private fun Maybe<Pair<C…ErrorComplete()\n    }\n  }");
        return m32074A;
    }

    /* renamed from: P */
    public final Boolean m54930P(C48528sE5 c48528sE5, EnumC16378a enumC16378a, int i) {
        DateTime plusSeconds;
        C50303vE2<String, DateTime> c50303vE2 = this.f67006k;
        String m14509f = c48528sE5.m14509f();
        DateTime m8993d = c50303vE2.m8993d(m14509f + enumC16378a);
        if (m8993d != null && (plusSeconds = m8993d.plusSeconds(i)) != null) {
            return Boolean.valueOf(plusSeconds.isBeforeNow());
        }
        return null;
    }

    /* renamed from: Q */
    public final List<C16382d> m54929Q(List<WireBird> list, EnumC16380c enumC16380c) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (WireBird wireBird : list) {
            List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
            C16382d c16382d = null;
            if (physicalLocks != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : physicalLocks) {
                    if (!((WirePhysicalLock) obj).isBrainLock()) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    c16382d = new C16382d(enumC16380c, wireBird.getId(), wireBird, arrayList, null, 16, null);
                }
            }
            if (c16382d != null) {
                arrayList2.add(c16382d);
            }
        }
        return arrayList2;
    }

    /* renamed from: T */
    public final void m54926T(String str, DateTime dateTime, EnumC16378a enumC16378a) {
        C50303vE2<String, DateTime> c50303vE2 = this.f67006k;
        c50303vE2.m8992e(str + enumC16378a, dateTime);
    }

    /* renamed from: U */
    public final InterfaceC23465c m54925U() {
        Observable<Boolean> observable = this.f67005j;
        final C16405q c16405q = C16405q.f67056g;
        Observable<R> switchMap = observable.switchMap(new InterfaceC23492o() { // from class: HE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m54924V;
                m54924V = SmartLockGlobalBluetoothScanner.m54924V(Function1.this, obj);
                return m54924V;
            }
        });
        final C16406r c16406r = new C16406r();
        Observable flatMap = switchMap.flatMap(new InterfaceC23492o() { // from class: IE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m54923W;
                m54923W = SmartLockGlobalBluetoothScanner.m54923W(Function1.this, obj);
                return m54923W;
            }
        });
        final C16413s c16413s = C16413s.f67064g;
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: JE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m54922X;
                m54922X = SmartLockGlobalBluetoothScanner.m54922X(Function1.this, obj);
                return m54922X;
            }
        });
        final C16414t c16414t = C16414t.f67065g;
        Observable distinctUntilChanged = map.distinctUntilChanged(new InterfaceC23481d() { // from class: KE5
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m54921Y;
                m54921Y = SmartLockGlobalBluetoothScanner.m54921Y(Function2.this, obj, obj2);
                return m54921Y;
            }
        });
        final C16416u c16416u = new C16416u();
        InterfaceC23465c subscribe = distinctUntilChanged.switchMapCompletable(new InterfaceC23492o() { // from class: LE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m54920Z;
                m54920Z = SmartLockGlobalBluetoothScanner.m54920Z(Function1.this, obj);
                return m54920Z;
            }
        }).subscribe();
        Intrinsics.checkNotNullExpressionValue(subscribe, "private fun scanAndUnloc…     }\n      .subscribe()");
        return subscribe;
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        Z84<Config> m82623f8 = this.f67000e.m82623f8();
        final C16403o c16403o = C16403o.f67054g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: NE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m54928R;
                m54928R = SmartLockGlobalBluetoothScanner.m54928R(Function1.this, obj);
                return m54928R;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config\n  …  .distinctUntilChanged()");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = distinctUntilChanged.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16404p c16404p = new C16404p();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yE5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartLockGlobalBluetoothScanner.m54927S(Function1.this, obj);
            }
        });
    }

    @Override // p000.VX0
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        if (this.f67004i.m33024h() > 0) {
            m54942B().mo7221o("Stopping v2 physical/smart lock bluetooth scanning on stop", new Object[0]);
            this.f67004i.m33026d();
        }
    }

    /* renamed from: z */
    public final AbstractC24490k<List<C48528sE5>> m54900z(AbstractC24490k<List<C48528sE5>> abstractC24490k) {
        final C16385g c16385g = new C16385g();
        AbstractC24490k m32117q0 = abstractC24490k.m32117q0(new InterfaceC23492o() { // from class: GE5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m54943A;
                m54943A = SmartLockGlobalBluetoothScanner.m54943A(Function1.this, obj);
                return m54943A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32117q0, "private fun Flowable<Lis…?: true\n      }\n    }\n  }");
        return m32117q0;
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!JC\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019¨\u0006\""}, m28432d2 = {"Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;", "type", "", "birdId", "Lco/bird/android/model/wire/WireBird;", "bird", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLocks", "rideId", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;", "f", "()Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lco/bird/android/model/wire/WireBird;", "()Lco/bird/android/model/wire/WireBird;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "e", "<init>", "(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$d */
    /* loaded from: classes4.dex */
    public static final class C16382d {

        /* renamed from: a */
        public final EnumC16380c f67017a;

        /* renamed from: b */
        public final String f67018b;

        /* renamed from: c */
        public final WireBird f67019c;

        /* renamed from: d */
        public final List<WirePhysicalLock> f67020d;

        /* renamed from: e */
        public final String f67021e;

        public C16382d(EnumC16380c type, String birdId, WireBird bird, List<WirePhysicalLock> physicalLocks, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(birdId, "birdId");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(physicalLocks, "physicalLocks");
            this.f67017a = type;
            this.f67018b = birdId;
            this.f67019c = bird;
            this.f67020d = physicalLocks;
            this.f67021e = str;
        }

        public static /* synthetic */ C16382d copy$default(C16382d c16382d, EnumC16380c enumC16380c, String str, WireBird wireBird, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                enumC16380c = c16382d.f67017a;
            }
            if ((i & 2) != 0) {
                str = c16382d.f67018b;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                wireBird = c16382d.f67019c;
            }
            WireBird wireBird2 = wireBird;
            List<WirePhysicalLock> list2 = list;
            if ((i & 8) != 0) {
                list2 = c16382d.f67020d;
            }
            List list3 = list2;
            if ((i & 16) != 0) {
                str2 = c16382d.f67021e;
            }
            return c16382d.m54896a(enumC16380c, str3, wireBird2, list3, str2);
        }

        /* renamed from: a */
        public final C16382d m54896a(EnumC16380c type, String birdId, WireBird bird, List<WirePhysicalLock> physicalLocks, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(birdId, "birdId");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(physicalLocks, "physicalLocks");
            return new C16382d(type, birdId, bird, physicalLocks, str);
        }

        /* renamed from: b */
        public final WireBird m54895b() {
            return this.f67019c;
        }

        /* renamed from: c */
        public final String m54894c() {
            return this.f67018b;
        }

        /* renamed from: d */
        public final List<WirePhysicalLock> m54893d() {
            return this.f67020d;
        }

        /* renamed from: e */
        public final String m54892e() {
            return this.f67021e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16382d) {
                C16382d c16382d = (C16382d) obj;
                return this.f67017a == c16382d.f67017a && Intrinsics.areEqual(this.f67018b, c16382d.f67018b) && Intrinsics.areEqual(this.f67019c, c16382d.f67019c) && Intrinsics.areEqual(this.f67020d, c16382d.f67020d) && Intrinsics.areEqual(this.f67021e, c16382d.f67021e);
            }
            return false;
        }

        /* renamed from: f */
        public final EnumC16380c m54891f() {
            return this.f67017a;
        }

        public int hashCode() {
            int hashCode = ((((((this.f67017a.hashCode() * 31) + this.f67018b.hashCode()) * 31) + this.f67019c.hashCode()) * 31) + this.f67020d.hashCode()) * 31;
            String str = this.f67021e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            EnumC16380c enumC16380c = this.f67017a;
            String str = this.f67018b;
            WireBird wireBird = this.f67019c;
            List<WirePhysicalLock> list = this.f67020d;
            String str2 = this.f67021e;
            return "SmartLockScannableBird(type=" + enumC16380c + ", birdId=" + str + ", bird=" + wireBird + ", physicalLocks=" + list + ", rideId=" + str2 + ")";
        }

        public /* synthetic */ C16382d(EnumC16380c enumC16380c, String str, WireBird wireBird, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC16380c, str, wireBird, list, (i & 16) != 0 ? null : str2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lcy0;", "LjI5;", "LsE5;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$n */
    /* loaded from: classes4.dex */
    public static final class C16401n extends Lambda implements Function1<Pair<? extends C39475cy0<InterfaceC43228jI5>, ? extends C48528sE5>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$n$a */
        /* loaded from: classes4.dex */
        public static final class C16402a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67050g;

            /* renamed from: h */
            public final /* synthetic */ C48528sE5 f67051h;

            /* renamed from: i */
            public final /* synthetic */ C39475cy0<InterfaceC43228jI5> f67052i;

            /* renamed from: j */
            public final /* synthetic */ AbstractC49714uE5<InterfaceC43228jI5> f67053j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16402a(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner, C48528sE5 c48528sE5, C39475cy0<InterfaceC43228jI5> c39475cy0, AbstractC49714uE5<InterfaceC43228jI5> abstractC49714uE5) {
                super(1);
                this.f67050g = smartLockGlobalBluetoothScanner;
                this.f67051h = c48528sE5;
                this.f67052i = c39475cy0;
                this.f67053j = abstractC49714uE5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                C41318g46.m40163a("Error received during ble unlock request (DISCONNECTING): " + it, new Object[0]);
                InterfaceC42015hF5 interfaceC42015hF5 = this.f67050g.f67001f;
                C48528sE5 c48528sE5 = this.f67051h;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                interfaceC42015hF5.mo19730b(c48528sE5, new SmartLockUnlockWrappedException(it));
                SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = this.f67050g;
                String address = this.f67052i.m44792c().getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "connectableDevice.device.address");
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                smartLockGlobalBluetoothScanner.m54926T(address, now, EnumC16378a.UNLOCK);
                this.f67053j.m5217x().mo22507k();
            }
        }

        public C16401n() {
            super(1);
        }

        /* renamed from: c */
        public static final void m54858c(SmartLockGlobalBluetoothScanner this$0, C48528sE5 smartLock, C39475cy0 connectableDevice) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(smartLock, "$smartLock");
            Intrinsics.checkNotNullParameter(connectableDevice, "$connectableDevice");
            C41318g46.m40163a("Successfully unlocked ble smartlock", new Object[0]);
            this$0.f67001f.mo19731a(smartLock, EnumC50899wE5.UNLOCKED);
            String address = connectableDevice.m44792c().getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "connectableDevice.device.address");
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            this$0.m54926T(address, now, EnumC16378a.UNLOCK);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<C39475cy0<InterfaceC43228jI5>, C48528sE5> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final C39475cy0<InterfaceC43228jI5> component1 = pair.component1();
            final C48528sE5 component2 = pair.component2();
            C41318g46.m40163a("Received a connectableDevice " + component1, new Object[0]);
            AbstractC8883Vy<InterfaceC43228jI5> m44791d = component1.m44791d();
            Intrinsics.checkNotNull(m44791d, "null cannot be cast to non-null type co.bird.android.smartlock.api.SmartLockDeviceManager<co.bird.android.smartlock.api.SmartlockData>");
            AbstractC49714uE5 abstractC49714uE5 = (AbstractC49714uE5) m44791d;
            AbstractC23461c mo3764U = abstractC49714uE5.mo3764U(true);
            final C16402a c16402a = new C16402a(SmartLockGlobalBluetoothScanner.this, component2, component1, abstractC49714uE5);
            AbstractC23461c m33084B = mo3764U.m33084B(new InterfaceC23484g() { // from class: WE5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartLockGlobalBluetoothScanner.C16401n.invoke$lambda$0(Function1.this, obj);
                }
            });
            final SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = SmartLockGlobalBluetoothScanner.this;
            return m33084B.m33029z(new InterfaceC23478a() { // from class: XE5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    SmartLockGlobalBluetoothScanner.C16401n.m54858c(SmartLockGlobalBluetoothScanner.this, component2, component1);
                }
            }).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends C39475cy0<InterfaceC43228jI5>, ? extends C48528sE5> pair) {
            return invoke2((Pair<C39475cy0<InterfaceC43228jI5>, C48528sE5>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1#2:482\n*E\n"})
    /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$u */
    /* loaded from: classes4.dex */
    public static final class C16416u extends Lambda implements Function1<Pair<? extends List<? extends C16382d>, ? extends Set<? extends String>>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "LsE5;", "scanResults", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$5$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1603#2,9:482\n1855#2:491\n1856#2:493\n1612#2:494\n1#3:492\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$5$1\n*L\n241#1:482,9\n241#1:491\n241#1:493\n241#1:494\n241#1:492\n*E\n"})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$u$a */
        /* loaded from: classes4.dex */
        public static final class C16417a extends Lambda implements Function1<List<? extends C48528sE5>, List<? extends C48528sE5>> {

            /* renamed from: g */
            public final /* synthetic */ List<C16382d> f67069g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16417a(List<C16382d> list) {
                super(1);
                this.f67069g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<C48528sE5> invoke(List<C48528sE5> scanResults) {
                C48528sE5 c48528sE5;
                String str;
                C48528sE5 c48528sE52;
                Smartlock m73305i;
                Intrinsics.checkNotNullParameter(scanResults, "scanResults");
                List<C16382d> scannableBirds = this.f67069g;
                ArrayList arrayList = new ArrayList();
                for (C48528sE5 c48528sE53 : scanResults) {
                    Intrinsics.checkNotNullExpressionValue(scannableBirds, "scannableBirds");
                    Iterator<T> it = scannableBirds.iterator();
                    do {
                        c48528sE5 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        C16382d c16382d = (C16382d) it.next();
                        Iterator<T> it2 = c16382d.m54893d().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) it2.next();
                            WireSmartlock smartlock = wirePhysicalLock.getSmartlock();
                            if (smartlock != null) {
                                str = smartlock.getMacAddress();
                            } else {
                                str = null;
                            }
                            if (!Intrinsics.areEqual(str, c48528sE53.m14509f())) {
                                smartlock = null;
                            }
                            if (smartlock != null && (m73305i = C10235ZK.m73305i(smartlock)) != null) {
                                c48528sE52 = C49130tF5.m12562a(c48528sE53, m73305i, C10235ZK.m73313a(c16382d.m54895b()), wirePhysicalLock.getPurpose(), c16382d.m54891f().m54897b(), c16382d.m54892e());
                                continue;
                            } else {
                                c48528sE52 = null;
                                continue;
                            }
                            if (c48528sE52 != null) {
                                c48528sE5 = c48528sE52;
                                continue;
                                break;
                            }
                        }
                    } while (c48528sE5 == null);
                    if (c48528sE5 != null) {
                        arrayList.add(c48528sE5);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LsE5;", "list", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSmartLockGlobalBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$5$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1549#2:482\n1620#2,3:483\n*S KotlinDebug\n*F\n+ 1 SmartLockGlobalBluetoothScanner.kt\nco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$scanAndUnlockAvailableSmartLocks$5$2\n*L\n264#1:482\n264#1:483,3\n*E\n"})
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$u$b */
        /* loaded from: classes4.dex */
        public static final class C16418b extends Lambda implements Function1<List<? extends C48528sE5>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ SmartLockGlobalBluetoothScanner f67070g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16418b(SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner) {
                super(1);
                this.f67070g = smartLockGlobalBluetoothScanner;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(List<C48528sE5> list) {
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(list, "list");
                if (!list.isEmpty()) {
                    List<C48528sE5> list2 = list;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (C48528sE5 c48528sE5 : list2) {
                        arrayList.add(c48528sE5.m14509f());
                    }
                    C41318g46.m40163a("flat mapping list of locks to connect " + arrayList, new Object[0]);
                }
                SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = this.f67070g;
                AbstractC24490k m32141i0 = AbstractC24490k.m32141i0(list);
                Intrinsics.checkNotNullExpressionValue(m32141i0, "fromIterable(list)");
                return smartLockGlobalBluetoothScanner.m54934L(m32141i0);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner$u$c */
        /* loaded from: classes4.dex */
        public static final class C16419c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C16419c f67071g = new C16419c();

            public C16419c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error on in smart lock scan/connect flow: ", new Object[0]);
            }
        }

        public C16416u() {
            super(1);
        }

        /* renamed from: d */
        public static final List m54835d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final InterfaceC23496h m54834e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m54833f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<? extends List<C16382d>, ? extends Set<String>> pair) {
            Set ofNotNull;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<C16382d> component1 = pair.component1();
            Set<String> component2 = pair.component2();
            CF5[] cf5Arr = new CF5[2];
            cf5Arr[0] = CF5.NOKE_COMPATIBLE;
            CF5 cf5 = CF5.SOLEBE;
            if (!Intrinsics.areEqual(SmartLockGlobalBluetoothScanner.this.f67000e.m82623f8().m73665a().getRideConfig().getSmartlockConfig().getEnableSolebeLocks(), Boolean.TRUE)) {
                cf5 = null;
            }
            cf5Arr[1] = cf5;
            ofNotNull = SetsKt__SetsKt.setOfNotNull((Object[]) cf5Arr);
            C41318g46.m40163a("macAddresses we're currently scanning for: " + component2, new Object[0]);
            if (!component2.isEmpty()) {
                SmartLockGlobalBluetoothScanner smartLockGlobalBluetoothScanner = SmartLockGlobalBluetoothScanner.this;
                AbstractC24490k m32096y = InterfaceC42015hF5.C22603a.scan$default(smartLockGlobalBluetoothScanner.f67001f, ofNotNull, component2, null, 4, null).m32096y(100L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(m32096y, "smartLockManager.scan(\n …0, TimeUnit.MILLISECONDS)");
                AbstractC24490k m32097x0 = smartLockGlobalBluetoothScanner.m54900z(m32096y).m32097x0();
                final C16417a c16417a = new C16417a(component1);
                AbstractC24490k m32097x02 = m32097x0.m32117q0(new InterfaceC23492o() { // from class: dF5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m54835d;
                        m54835d = SmartLockGlobalBluetoothScanner.C16416u.m54835d(Function1.this, obj);
                        return m54835d;
                    }
                }).m32097x0();
                final C16418b c16418b = new C16418b(SmartLockGlobalBluetoothScanner.this);
                AbstractC23461c m32160a0 = m32097x02.m32160a0(new InterfaceC23492o() { // from class: eF5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m54834e;
                        m54834e = SmartLockGlobalBluetoothScanner.C16416u.m54834e(Function1.this, obj);
                        return m54834e;
                    }
                }, false, 1);
                final C16419c c16419c = C16419c.f67071g;
                return m32160a0.m33084B(new InterfaceC23484g() { // from class: fF5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        SmartLockGlobalBluetoothScanner.C16416u.m54833f(Function1.this, obj);
                    }
                }).m33069Q();
            }
            return AbstractC23461c.m33039p();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends List<? extends C16382d>, ? extends Set<? extends String>> pair) {
            return invoke2((Pair<? extends List<C16382d>, ? extends Set<String>>) pair);
        }
    }
}
