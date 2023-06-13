package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WirePhysicalLock;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC39873de5;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 %2\u00020\u0001:\u0001%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH&J`\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u001228\b\u0002\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0014H&J \u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0018\u0010\"\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010%\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020#H&J\b\u0010&\u001a\u00020\u0004H&R,\u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0'0\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010)¨\u00060"}, m28432d2 = {"LoI5;", "", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "j", "LXl5;", "rideLock", "g", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "f", "LZ84;", "Lco/bird/android/buava/Optional;", "Loe6;", "i", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "Lkotlin/Function0;", "onBleReady", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lde5$a;", TransferTable.COLUMN_STATE, "onBleNotReady", "Lio/reactivex/F;", "LTk5;", "c", "scanResult", "", "count", "Lio/reactivex/c;", "b", "m", "", "waitDelayMilliseconds", C17296a.f69688o, "h", "Lkotlin/Pair;", "k", "()LZ84;", "physicalLockScanResults", "l", "()I", "ridePhysicalUnlockCount", "e", "currentlyAvailablePrimaryRideLock", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oI5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC46193oI5 {

    /* renamed from: a */
    public static final C26896a f101755a = C26896a.f101756a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LoI5$a;", "", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", C17296a.f69688o, "()Ljava/util/UUID;", "LOCK_SERVICE", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: oI5$a */
    /* loaded from: classes2.dex */
    public static final class C26896a {

        /* renamed from: a */
        public static final /* synthetic */ C26896a f101756a = new C26896a();

        /* renamed from: b */
        public static final UUID f101757b;

        static {
            UUID fromString = UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb");
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(\"0000fee7-0000-1000-8000-00805f9b34fb\")");
            f101757b = fromString;
        }

        private C26896a() {
        }

        /* renamed from: a */
        public final UUID m21393a() {
            return f101757b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oI5$b */
    /* loaded from: classes2.dex */
    public static final class C26897b {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: oI5$b$a */
        /* loaded from: classes2.dex */
        public static final class C26898a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public static final C26898a f101758g = new C26898a();

            public C26898a() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "<anonymous parameter 0>", "Lde5$a;", "<anonymous parameter 1>", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePhysicalLock;Lde5$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: oI5$b$b */
        /* loaded from: classes2.dex */
        public static final class C26899b extends Lambda implements Function2<WirePhysicalLock, AbstractC39873de5.EnumC19828a, Unit> {

            /* renamed from: g */
            public static final C26899b f101759g = new C26899b();

            public C26899b() {
                super(2);
            }

            /* renamed from: a */
            public final void m21392a(WirePhysicalLock wirePhysicalLock, AbstractC39873de5.EnumC19828a enumC19828a) {
                Intrinsics.checkNotNullParameter(wirePhysicalLock, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(enumC19828a, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(WirePhysicalLock wirePhysicalLock, AbstractC39873de5.EnumC19828a enumC19828a) {
                m21392a(wirePhysicalLock, enumC19828a);
                return Unit.INSTANCE;
            }
        }

        public static /* synthetic */ AbstractC23461c resetBluetooth$default(InterfaceC46193oI5 interfaceC46193oI5, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = 1000;
                }
                return interfaceC46193oI5.mo21406a(j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetBluetooth");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23442F startScanning$default(InterfaceC46193oI5 interfaceC46193oI5, WirePhysicalLock wirePhysicalLock, Function0 function0, Function2 function2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    function0 = C26898a.f101758g;
                }
                if ((i & 4) != 0) {
                    function2 = C26899b.f101759g;
                }
                return interfaceC46193oI5.mo21404c(wirePhysicalLock, function0, function2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startScanning");
        }
    }

    /* renamed from: a */
    AbstractC23461c mo21406a(long j);

    /* renamed from: b */
    AbstractC23461c mo21405b(C36154Tk5 c36154Tk5, WirePhysicalLock wirePhysicalLock, int i);

    /* renamed from: c */
    AbstractC23442F<C36154Tk5> mo21404c(WirePhysicalLock wirePhysicalLock, Function0<Unit> function0, Function2<? super WirePhysicalLock, ? super AbstractC39873de5.EnumC19828a, Unit> function2);

    /* renamed from: d */
    void mo21403d();

    /* renamed from: e */
    Z84<Optional<C37099Xl5>> mo21402e();

    /* renamed from: f */
    Observable<Unit> mo21401f();

    /* renamed from: g */
    void mo21400g(C37099Xl5 c37099Xl5);

    /* renamed from: h */
    void mo21399h();

    /* renamed from: i */
    Z84<Optional<C46396oe6>> mo21398i();

    /* renamed from: j */
    void mo21397j(ScopeProvider scopeProvider);

    /* renamed from: k */
    Z84<Optional<Pair<C37099Xl5, C36154Tk5>>> mo21396k();

    /* renamed from: l */
    int mo21395l();

    /* renamed from: m */
    AbstractC23461c mo21394m(C36154Tk5 c36154Tk5, WirePhysicalLock wirePhysicalLock);
}
