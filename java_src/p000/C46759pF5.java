package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bluetooth.model.ScannedDevice;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.SmartlockVendor;
import co.bird.android.model.persistence.Bird;
import co.bird.android.smartlock.api.SmartLockUnlockWrappedException;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.polidea.rxandroidble2.exceptions.BleAdapterDisabledException;
import com.polidea.rxandroidble2.exceptions.BleAlreadyConnectedException;
import com.polidea.rxandroidble2.exceptions.BleCharacteristicNotFoundException;
import com.polidea.rxandroidble2.exceptions.BleConflictingNotificationAlreadySetException;
import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import com.polidea.rxandroidble2.exceptions.BleGattCharacteristicException;
import com.polidea.rxandroidble2.exceptions.BleGattException;
import com.polidea.rxandroidble2.exceptions.BleScanException;
import com.polidea.rxandroidble2.exceptions.BleServiceNotFoundException;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.support.v18.scanner.ScanFilter;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010*\u001a\u00020)\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020>¢\u0006\u0004\bG\u0010HJE\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0013\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016J$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0002J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u0016\u0010(\u001a\u00020\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J,\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u001bH\u0002R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, m28432d2 = {"LpF5;", "LhF5;", "", "LCF5;", "types", "", "macAddresses", "", "rssiThreshold", "Lio/reactivex/k;", "", "LsE5;", "e", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;)Lio/reactivex/k;", "LjI5;", "T", "smartlock", "Lkotlin/time/Duration;", "timeout", "Lio/reactivex/F;", "Lcy0;", "c", "(LsE5;J)Lio/reactivex/F;", "macAddress", "LvE5;", DateTokenConverter.CONVERTER_KEY, "smartLock", "", "exception", "", "b", "LwE5;", "eventType", C17296a.f69688o, "throwable", "w", "Lco/bird/android/smartlock/api/SmartLockUnlockWrappedException;", "t", "u", "list", "z", "LZC0;", Action.SCOPE_ATTRIBUTE, "", "enableMultipleSmartlockKeys", "LuE5;", "s", "error", "y", "LZC0;", "LTq4;", "LTq4;", "reactiveConfig", "LDX;", "LDX;", "bluetoothManager", "LEa;", "LEa;", "analyticsManager", "LwF5;", "LwF5;", "smartLockNokeManagerFactory", "LAF5;", "f", "LAF5;", "smartLockSolebeManagerFactory", "La94;", "", "g", "La94;", "smartLockEventRelay", "<init>", "(LZC0;LTq4;LDX;LEa;LwF5;LAF5;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46759pF5 implements InterfaceC42015hF5 {

    /* renamed from: a */
    public final ZC0 f103319a;

    /* renamed from: b */
    public final C36207Tq4 f103320b;

    /* renamed from: c */
    public final InterfaceC1510DX f103321c;

    /* renamed from: d */
    public final InterfaceC1880Ea f103322d;

    /* renamed from: e */
    public final InterfaceC50908wF5 f103323e;

    /* renamed from: f */
    public final AF5 f103324f;

    /* renamed from: g */
    public final C37791a94<Map<String, C50306vE5>> f103325g;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pF5$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C27193a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CF5.values().length];
            try {
                iArr[CF5.NOKE_REFLASH_COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CF5.NOKE_COMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CF5.SOLEBE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjI5;", "T", "Lcy0;", "device", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcy0;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pF5$b */
    /* loaded from: classes4.dex */
    public static final class C27194b extends Lambda implements Function1<C39475cy0<T>, InterfaceC23434B<? extends C39475cy0<T>>> {

        /* renamed from: g */
        public static final C27194b f103326g = new C27194b();

        public C27194b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends C39475cy0<T>> invoke(C39475cy0<T> device) {
            Intrinsics.checkNotNullParameter(device, "device");
            if (device.m44793b() != null) {
                return Observable.error(device.m44793b());
            }
            return Observable.just(device);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjI5;", "T", "Lcy0;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcy0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pF5$c */
    /* loaded from: classes4.dex */
    public static final class C27195c extends Lambda implements Function1<C39475cy0<T>, Unit> {

        /* renamed from: g */
        public static final C27195c f103327g = new C27195c();

        public C27195c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19704a(C39475cy0<T> c39475cy0) {
            C41318g46.m40163a("Connected device here " + c39475cy0, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m19704a((C39475cy0) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjI5;", "T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pF5$d */
    /* loaded from: classes4.dex */
    public static final class C27196d extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C48528sE5 f103328g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27196d(C48528sE5 c48528sE5) {
            super(1);
            this.f103328g = c48528sE5;
        }

        /* renamed from: a */
        public final void m19703a(InterfaceC23465c interfaceC23465c) {
            String m14509f = this.f103328g.m14509f();
            C41318g46.m40163a("starting attempt to connect to device " + m14509f, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m19703a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"LjI5;", "T", "event", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockManagerImpl$connect$eventJob$1", m28418f = "SmartLockManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: pF5$e */
    /* loaded from: classes4.dex */
    public static final class C27197e extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f103329h;

        /* renamed from: i */
        public /* synthetic */ Object f103330i;

        /* renamed from: k */
        public final /* synthetic */ C48528sE5 f103332k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27197e(C48528sE5 c48528sE5, Continuation<? super C27197e> continuation) {
            super(2, continuation);
            this.f103332k = c48528sE5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27197e c27197e = new C27197e(this.f103332k, continuation);
            c27197e.f103330i = obj;
            return c27197e;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC43228jI5 interfaceC43228jI5, Continuation continuation) {
            return ((C27197e) create(interfaceC43228jI5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            boolean z2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f103329h == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC43228jI5 interfaceC43228jI5 = (InterfaceC43228jI5) this.f103330i;
                C41318g46.m40163a("received smartlock event from ble manager: " + interfaceC43228jI5, new Object[0]);
                EnumC50899wE5 enumC50899wE5 = null;
                boolean z3 = true;
                if (interfaceC43228jI5 instanceof CJ5) {
                    CJ5 cj5 = (CJ5) interfaceC43228jI5;
                    if (cj5.m112355c() == FJ5.CONNECTED) {
                        enumC50899wE5 = EnumC50899wE5.CONNECTED;
                    } else if (cj5.m112355c() == FJ5.DISCONNECTED) {
                        enumC50899wE5 = EnumC50899wE5.DISCONNECTED;
                    } else {
                        if (cj5.m112355c() == FJ5.UNLOCK_RESPONSE_RECEIVED) {
                            IJ5 m112351g = cj5.m112351g();
                            if (m112351g != null && m112351g.m102522b()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                enumC50899wE5 = EnumC50899wE5.UNLOCKED;
                            }
                        }
                        if (cj5.m112355c() == FJ5.LOCK_RESPONSE_RECEIVED) {
                            EJ5 m112354d = cj5.m112354d();
                            if (m112354d == null || !m112354d.m109183b()) {
                                z3 = false;
                            }
                            if (z3) {
                                enumC50899wE5 = EnumC50899wE5.LOCKED;
                            }
                        }
                    }
                } else if (interfaceC43228jI5 instanceof C50953wK5) {
                    C50953wK5 c50953wK5 = (C50953wK5) interfaceC43228jI5;
                    if (c50953wK5.m6987c() == EnumC52732zK5.CONNECTED) {
                        enumC50899wE5 = EnumC50899wE5.CONNECTED;
                    } else if (c50953wK5.m6987c() == EnumC52732zK5.DISCONNECTED) {
                        enumC50899wE5 = EnumC50899wE5.DISCONNECTED;
                    } else {
                        if (c50953wK5.m6987c() == EnumC52732zK5.UNLOCK_RESPONSE_RECEIVED) {
                            CK5 m6983g = c50953wK5.m6983g();
                            if (m6983g != null && m6983g.m112334b()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                enumC50899wE5 = EnumC50899wE5.UNLOCKED;
                            }
                        }
                        if (c50953wK5.m6987c() == EnumC52732zK5.LOCK_RESPONSE_RECEIVED) {
                            C52139yK5 m6986d = c50953wK5.m6986d();
                            if (m6986d == null || !m6986d.m3666b()) {
                                z3 = false;
                            }
                            if (z3) {
                                enumC50899wE5 = EnumC50899wE5.LOCKED;
                            }
                        }
                    }
                }
                if (enumC50899wE5 != null) {
                    C46759pF5 c46759pF5 = C46759pF5.this;
                    C48528sE5 c48528sE5 = this.f103332k;
                    C41318g46.m40163a("setting smartlock event to " + enumC50899wE5, new Object[0]);
                    c46759pF5.mo19731a(c48528sE5, enumC50899wE5);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m28432d2 = {"LjI5;", "T", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockManagerImpl$connect$eventJob$2", m28418f = "SmartLockManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: pF5$f */
    /* loaded from: classes4.dex */
    public static final class C27198f extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super T>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f103333h;

        /* renamed from: i */
        public final /* synthetic */ C48528sE5 f103334i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27198f(C48528sE5 c48528sE5, Continuation<? super C27198f> continuation) {
            super(3, continuation);
            this.f103334i = c48528sE5;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: e */
        public final Object invoke(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
            return new C27198f(this.f103334i, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f103333h == 0) {
                ResultKt.throwOnFailure(obj);
                String m14509f = this.f103334i.m14509f();
                C41318g46.m40163a("eventJob completed, no longer listening for smartlock events for " + m14509f, new Object[0]);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00022&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "LvE5;", "kotlin.jvm.PlatformType", "map", C17296a.f69688o, "(Ljava/util/Map;)LvE5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pF5$g */
    /* loaded from: classes4.dex */
    public static final class C27199g extends Lambda implements Function1<Map<String, ? extends C50306vE5>, C50306vE5> {

        /* renamed from: g */
        public final /* synthetic */ String f103335g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27199g(String str) {
            super(1);
            this.f103335g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C50306vE5 invoke(Map<String, C50306vE5> map) {
            return map.get(this.f103335g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LvE5;", "t1", "t2", "", C17296a.f69688o, "(LvE5;LvE5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pF5$h */
    /* loaded from: classes4.dex */
    public static final class C27200h extends Lambda implements Function2<C50306vE5, C50306vE5, Boolean> {

        /* renamed from: g */
        public static final C27200h f103336g = new C27200h();

        public C27200h() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
            if (r3.compareTo((org.joda.time.base.BaseSingleFieldPeriod) org.joda.time.Seconds.seconds(1)) <= 0) goto L5;
         */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(C50306vE5 t1, C50306vE5 t2) {
            boolean z;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            if (t1.m8985b() == t2.m8985b()) {
                Seconds secondsBetween = Seconds.secondsBetween(t1.m8982e(), t2.m8982e());
                z = true;
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "", "LvE5;", "map", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pF5$i */
    /* loaded from: classes4.dex */
    public static final class C27201i extends Lambda implements Function1<Map<String, ? extends C50306vE5>, Map<String, ? extends C50306vE5>> {

        /* renamed from: g */
        public final /* synthetic */ C48528sE5 f103337g;

        /* renamed from: h */
        public final /* synthetic */ EnumC50899wE5 f103338h;

        /* renamed from: i */
        public final /* synthetic */ Throwable f103339i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27201i(C48528sE5 c48528sE5, EnumC50899wE5 enumC50899wE5, Throwable th) {
            super(1);
            this.f103337g = c48528sE5;
            this.f103338h = enumC50899wE5;
            this.f103339i = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, C50306vE5> invoke(Map<String, C50306vE5> map) {
            Map<String, C50306vE5> mutableMap;
            Intrinsics.checkNotNullParameter(map, "map");
            mutableMap = MapsKt__MapsKt.toMutableMap(map);
            C48528sE5 c48528sE5 = this.f103337g;
            mutableMap.put(c48528sE5.m14509f(), new C50306vE5(c48528sE5, this.f103338h, this.f103339i, null, 8, null));
            return mutableMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LZ21;", "LYl5;", "kotlin.jvm.PlatformType", "it", "", "LsE5;", C17296a.f69688o, "(LZ21;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartLockManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockManagerImpl.kt\nco/bird/android/smartlock/impl/SmartLockManagerImpl$scan$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1603#2,9:370\n1855#2:379\n1856#2:382\n1612#2:383\n1#3:380\n1#3:381\n*S KotlinDebug\n*F\n+ 1 SmartLockManagerImpl.kt\nco/bird/android/smartlock/impl/SmartLockManagerImpl$scan$1\n*L\n92#1:370,9\n92#1:379\n92#1:382\n92#1:383\n92#1:381\n*E\n"})
    /* renamed from: pF5$j */
    /* loaded from: classes4.dex */
    public static final class C27202j extends Lambda implements Function1<Z21<C37333Yl5>, List<? extends C48528sE5>> {

        /* renamed from: h */
        public final /* synthetic */ Set<CF5> f103341h;

        /* renamed from: i */
        public final /* synthetic */ Set<String> f103342i;

        /* renamed from: j */
        public final /* synthetic */ Integer f103343j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27202j(Set<? extends CF5> set, Set<String> set2, Integer num) {
            super(1);
            this.f103341h = set;
            this.f103342i = set2;
            this.f103343j = num;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
            if (r6.m14505j().m59104d() >= r4.intValue()) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0089 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x002b A[SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<C48528sE5> invoke(Z21<C37333Yl5> z21) {
            AT5 at5;
            ArrayList arrayList;
            C37333Yl5 c37333Yl5;
            List<ScannedDevice> m74314b;
            boolean z;
            Set<String> set;
            Set<CF5> set2;
            if (z21 instanceof AT5) {
                at5 = (AT5) z21;
            } else {
                at5 = null;
            }
            if (at5 != null && (c37333Yl5 = (C37333Yl5) at5.m115732b()) != null && (m74314b = c37333Yl5.m74314b()) != null) {
                Set<CF5> set3 = this.f103341h;
                Set<String> set4 = this.f103342i;
                Integer num = this.f103343j;
                arrayList = new ArrayList();
                for (ScannedDevice scannedDevice : m74314b) {
                    boolean z2 = false;
                    C48528sE5 smartLock$default = C49130tF5.toSmartLock$default(scannedDevice, false, 1, null);
                    if (smartLock$default != null) {
                        if (set3 != null) {
                            if (!set3.isEmpty()) {
                                set2 = set3;
                            } else {
                                set2 = null;
                            }
                            if (set2 != null && !set2.contains(smartLock$default.m14502m())) {
                                z = true;
                                if (!z) {
                                    if (set4 != null) {
                                        if (!set4.isEmpty()) {
                                            set = set4;
                                        } else {
                                            set = null;
                                        }
                                        if (set != null && !set.contains(smartLock$default.m14509f())) {
                                            z2 = true;
                                        }
                                    }
                                    if (!z2) {
                                        if (num != null) {
                                        }
                                        if (smartLock$default == null) {
                                            arrayList.add(smartLock$default);
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    smartLock$default = null;
                    if (smartLock$default == null) {
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            C46759pF5.this.m19706z(arrayList);
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "", "LvE5;", "map", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pF5$k */
    /* loaded from: classes4.dex */
    public static final class C27203k extends Lambda implements Function1<Map<String, ? extends C50306vE5>, Map<String, ? extends C50306vE5>> {

        /* renamed from: g */
        public final /* synthetic */ List<C48528sE5> f103344g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27203k(List<C48528sE5> list) {
            super(1);
            this.f103344g = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, C50306vE5> invoke(Map<String, C50306vE5> map) {
            Map<String, C50306vE5> mutableMap;
            EnumC50899wE5 enumC50899wE5;
            Intrinsics.checkNotNullParameter(map, "map");
            mutableMap = MapsKt__MapsKt.toMutableMap(map);
            for (C48528sE5 c48528sE5 : this.f103344g) {
                String m14509f = c48528sE5.m14509f();
                C50306vE5 c50306vE5 = mutableMap.get(m14509f);
                if (c50306vE5 == null || c50306vE5.m8985b() == EnumC50899wE5.DISCONNECTED || c50306vE5.m8985b() == EnumC50899wE5.SCANNED || c50306vE5.m8985b() == EnumC50899wE5.SCANNED_HELMET_PRESENT || c50306vE5.m8985b() == EnumC50899wE5.SCANNED_HELMET_NOT_PRESENT || c50306vE5.m8982e().plusSeconds(30).isBeforeNow()) {
                    Boolean m14510e = c48528sE5.m14510e();
                    if (Intrinsics.areEqual(m14510e, Boolean.TRUE)) {
                        enumC50899wE5 = EnumC50899wE5.SCANNED_HELMET_PRESENT;
                    } else if (Intrinsics.areEqual(m14510e, Boolean.FALSE)) {
                        enumC50899wE5 = EnumC50899wE5.SCANNED_HELMET_NOT_PRESENT;
                    } else if (m14510e == null) {
                        enumC50899wE5 = EnumC50899wE5.SCANNED;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    mutableMap.put(m14509f, new C50306vE5(c48528sE5, enumC50899wE5, null, null, 12, null));
                }
            }
            return mutableMap;
        }
    }

    public C46759pF5(ZC0 scope, C36207Tq4 reactiveConfig, InterfaceC1510DX bluetoothManager, InterfaceC1880Ea analyticsManager, InterfaceC50908wF5 smartLockNokeManagerFactory, AF5 smartLockSolebeManagerFactory) {
        Map emptyMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(smartLockNokeManagerFactory, "smartLockNokeManagerFactory");
        Intrinsics.checkNotNullParameter(smartLockSolebeManagerFactory, "smartLockSolebeManagerFactory");
        this.f103319a = scope;
        this.f103320b = reactiveConfig;
        this.f103321c = bluetoothManager;
        this.f103322d = analyticsManager;
        this.f103323e = smartLockNokeManagerFactory;
        this.f103324f = smartLockSolebeManagerFactory;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f103325g = C37791a94.C10586a.create$default(c10586a, emptyMap, null, 2, null);
    }

    /* renamed from: m */
    public static final InterfaceC23434B m19719m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m19718n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m19717o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m19716p(C48528sE5 smartlock) {
        Intrinsics.checkNotNullParameter(smartlock, "$smartlock");
        String m14509f = smartlock.m14509f();
        C41318g46.m40163a("disposed attempt to connect to device " + m14509f, new Object[0]);
    }

    /* renamed from: q */
    public static final void m19715q(C48528sE5 smartlock) {
        Intrinsics.checkNotNullParameter(smartlock, "$smartlock");
        String m14509f = smartlock.m14509f();
        C41318g46.m40163a("terminated attempt to connect to device " + m14509f, new Object[0]);
    }

    /* renamed from: r */
    public static final void m19714r(C48528sE5 smartlock) {
        Intrinsics.checkNotNullParameter(smartlock, "$smartlock");
        String m14509f = smartlock.m14509f();
        C41318g46.m40163a("completed attempt to connect to device " + m14509f, new Object[0]);
    }

    /* renamed from: v */
    public static final boolean m19710v(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: x */
    public static /* synthetic */ void m19708x(C46759pF5 c46759pF5, C48528sE5 c48528sE5, EnumC50899wE5 enumC50899wE5, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        c46759pF5.m19709w(c48528sE5, enumC50899wE5, th);
    }

    @Override // p000.InterfaceC42015hF5
    /* renamed from: a */
    public void mo19731a(C48528sE5 smartLock, EnumC50899wE5 eventType) {
        Intrinsics.checkNotNullParameter(smartLock, "smartLock");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        m19708x(this, smartLock, eventType, null, 4, null);
        if (eventType == EnumC50899wE5.UNLOCKED) {
            m19711u(smartLock);
        }
    }

    @Override // p000.InterfaceC42015hF5
    /* renamed from: b */
    public void mo19730b(C48528sE5 smartLock, Throwable exception) {
        Intrinsics.checkNotNullParameter(smartLock, "smartLock");
        Intrinsics.checkNotNullParameter(exception, "exception");
        m19709w(smartLock, EnumC50899wE5.EXCEPTION, exception);
        if (exception instanceof SmartLockUnlockWrappedException) {
            m19712t(smartLock, (SmartLockUnlockWrappedException) exception);
        }
    }

    @Override // p000.InterfaceC42015hF5
    /* renamed from: c */
    public <T extends InterfaceC43228jI5> AbstractC23442F<C39475cy0<T>> mo19729c(final C48528sE5 smartlock, long j) {
        Intrinsics.checkNotNullParameter(smartlock, "smartlock");
        AbstractC49714uE5<T> m19713s = m19713s(smartlock, this.f103319a, Intrinsics.areEqual(this.f103320b.m82623f8().m73665a().getEnableMultipleSmartlockKeys(), Boolean.TRUE));
        String m14509f = smartlock.m14509f();
        C41318g46.m40163a("eventJob is being started now to track smartlock events for " + m14509f, new Object[0]);
        C36708Vu1.m79279I(C36708Vu1.m79277K(C36708Vu1.m79276L(m19713s.m79043R(), new C27197e(smartlock, null)), new C27198f(smartlock, null)), this.f103319a);
        Observable m91746c = C34930Oe5.m91746c(this.f103321c.mo107061d(C49130tF5.m12553j(smartlock, m19713s)), this.f103319a.mo18342K());
        final C27194b c27194b = C27194b.f103326g;
        Observable flatMap = m91746c.flatMap(new InterfaceC23492o() { // from class: iF5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m19719m;
                m19719m = C46759pF5.m19719m(Function1.this, obj);
                return m19719m;
            }
        });
        final C27195c c27195c = C27195c.f103327g;
        Observable doOnNext = flatMap.doOnNext(new InterfaceC23484g() { // from class: jF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46759pF5.m19718n(Function1.this, obj);
            }
        });
        final C27196d c27196d = new C27196d(smartlock);
        AbstractC23442F<C39475cy0<T>> firstOrError = doOnNext.doOnSubscribe(new InterfaceC23484g() { // from class: kF5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46759pF5.m19717o(Function1.this, obj);
            }
        }).doOnDispose(new InterfaceC23478a() { // from class: lF5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C46759pF5.m19716p(C48528sE5.this);
            }
        }).doOnTerminate(new InterfaceC23478a() { // from class: mF5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C46759pF5.m19715q(C48528sE5.this);
            }
        }).doOnComplete(new InterfaceC23478a() { // from class: nF5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C46759pF5.m19714r(C48528sE5.this);
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "smartlock: SmartLock,\n  …) }\n      .firstOrError()");
        return firstOrError;
    }

    @Override // p000.InterfaceC42015hF5
    /* renamed from: d */
    public AbstractC24490k<C50306vE5> mo19728d(String macAddress) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Observable<Map<String, C50306vE5>> skip = this.f103325g.skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "smartLockEventRelay\n    …bscription\n      .skip(1)");
        Observable m74575T = C37279Yf5.m74575T(skip, new C27199g(macAddress));
        final C27200h c27200h = C27200h.f103336g;
        AbstractC24490k<C50306vE5> flowable = m74575T.distinctUntilChanged(new InterfaceC23481d() { // from class: oF5
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m19710v;
                m19710v = C46759pF5.m19710v(Function2.this, obj, obj2);
                return m19710v;
            }
        }).toFlowable(EnumC23460b.LATEST);
        Intrinsics.checkNotNullExpressionValue(flowable, "macAddress: String): Flo…kpressureStrategy.LATEST)");
        return flowable;
    }

    @Override // p000.InterfaceC42015hF5
    /* renamed from: e */
    public AbstractC24490k<List<C48528sE5>> mo19727e(Set<? extends CF5> set, Set<String> set2, Integer num) {
        AbstractC24490k m32097x0 = C34930Oe5.m91747b(this.f103321c.mo107064a(new C37324Yk5(EnumC38707bi3.SCAN_LOW_LATENCY, false, 0L, false, new ScanFilter.C26699b().m22443a(), DateTime.now(), 14, null)), this.f103319a.mo18342K()).m32097x0();
        Intrinsics.checkNotNullExpressionValue(m32097x0, "bluetoothManager.scan(\n …    .onBackpressureDrop()");
        return C37279Yf5.m74578Q(m32097x0, new C27202j(set, set2, num));
    }

    /* renamed from: s */
    public final <T extends InterfaceC43228jI5> AbstractC49714uE5<T> m19713s(C48528sE5 c48528sE5, ZC0 zc0, boolean z) {
        int i = C27193a.$EnumSwitchMapping$0[c48528sE5.m14502m().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                C52094yF5 mo114165a = this.f103324f.mo114165a(zc0, c48528sE5, z);
                Intrinsics.checkNotNull(mo114165a, "null cannot be cast to non-null type co.bird.android.smartlock.api.SmartLockDeviceManager<T of co.bird.android.smartlock.impl.SmartLockManagerImpl.getManager>");
                return mo114165a;
            }
            throw new NoWhenBranchMatchedException();
        }
        C49723uF5 mo5618a = this.f103323e.mo5618a(zc0, c48528sE5, z);
        Intrinsics.checkNotNull(mo5618a, "null cannot be cast to non-null type co.bird.android.smartlock.api.SmartLockDeviceManager<T of co.bird.android.smartlock.impl.SmartLockManagerImpl.getManager>");
        return mo5618a;
    }

    /* renamed from: t */
    public final void m19712t(C48528sE5 c48528sE5, SmartLockUnlockWrappedException smartLockUnlockWrappedException) {
        String str;
        String str2;
        String str3;
        String str4;
        Throwable m54944a = smartLockUnlockWrappedException.m54944a();
        String m19707y = m19707y(m54944a);
        if (c48528sE5.m14500o()) {
            InterfaceC1880Ea interfaceC1880Ea = this.f103322d;
            String m12566b = c48528sE5.m14512c().m12566b();
            String m14508g = c48528sE5.m14508g();
            Bird m14513b = c48528sE5.m14513b();
            if (m14513b != null) {
                str = m14513b.getId();
            } else {
                str = null;
            }
            String m14506i = c48528sE5.m14506i();
            SmartlockVendor m14501n = c48528sE5.m14501n();
            if (m14501n != null) {
                str2 = m14501n.name();
            } else {
                str2 = null;
            }
            PhysicalLockPurpose m14507h = c48528sE5.m14507h();
            if (m14507h != null) {
                str3 = m14507h.toString();
            } else {
                str3 = null;
            }
            String m14511d = c48528sE5.m14511d();
            String str5 = m19707y + " - " + m54944a;
            if (Intrinsics.areEqual(m19707y, "network_failure")) {
                str4 = m54944a + " - " + m54944a.getMessage();
            } else {
                str4 = null;
            }
            interfaceC1880Ea.mo55905y(new RS3(null, null, null, m12566b, false, m14511d, m14508g, str, m14506i, str2, str3, str5, str4, 7, null));
        }
    }

    /* renamed from: u */
    public final void m19711u(C48528sE5 c48528sE5) {
        String str;
        String str2;
        String str3;
        C41318g46.m40163a("tracking PhysicalLockSmartlockOpened for smartlock " + c48528sE5.m14509f(), new Object[0]);
        InterfaceC1880Ea interfaceC1880Ea = this.f103322d;
        String m12566b = c48528sE5.m14512c().m12566b();
        String m14508g = c48528sE5.m14508g();
        Bird m14513b = c48528sE5.m14513b();
        if (m14513b != null) {
            str = m14513b.getId();
        } else {
            str = null;
        }
        String m14506i = c48528sE5.m14506i();
        SmartlockVendor m14501n = c48528sE5.m14501n();
        if (m14501n != null) {
            str2 = m14501n.name();
        } else {
            str2 = null;
        }
        PhysicalLockPurpose m14507h = c48528sE5.m14507h();
        if (m14507h != null) {
            str3 = m14507h.toString();
        } else {
            str3 = null;
        }
        interfaceC1880Ea.mo55905y(new RS3(null, null, null, m12566b, true, c48528sE5.m14511d(), m14508g, str, m14506i, str2, str3, null, null, 6151, null));
    }

    /* renamed from: w */
    public final void m19709w(C48528sE5 c48528sE5, EnumC50899wE5 enumC50899wE5, Throwable th) {
        this.f103325g.m71837i(new C27201i(c48528sE5, enumC50899wE5, th));
    }

    /* renamed from: y */
    public final String m19707y(Throwable th) {
        boolean z;
        if (th instanceof TimeoutException) {
            return "connection_failure";
        }
        if (th instanceof RetrofitException) {
            return "network_failure";
        }
        boolean z2 = true;
        if (th instanceof BleServiceNotFoundException) {
            z = true;
        } else {
            z = th instanceof BleCharacteristicNotFoundException;
        }
        if (z) {
            return "invalid_peripheral";
        }
        if (th instanceof BleAdapterDisabledException) {
            return "bluetooth_unavailable";
        }
        if (!(th instanceof BleAlreadyConnectedException)) {
            z2 = th instanceof BleConflictingNotificationAlreadySetException;
        }
        if (z2) {
            return "already_connected";
        }
        if (th instanceof BleDisconnectedException) {
            return "cancelled";
        }
        if (th instanceof BleScanException) {
            return "scan_failure";
        }
        if (th instanceof BleGattCharacteristicException) {
            return "request_write_failure";
        }
        if (th instanceof BleGattException) {
            return "other_ble_gatt_exception";
        }
        if (th instanceof BleException) {
            return "other_ble_exception";
        }
        return LegacyRepairType.OTHER_KEY;
    }

    /* renamed from: z */
    public final void m19706z(List<C48528sE5> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f103325g.m71837i(new C27203k(list));
    }
}
