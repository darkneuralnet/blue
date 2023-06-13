package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bluetooth.impl.BleManagerConnectionException;
import co.bird.android.bluetooth.model.ScannedDevice;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23481d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.C26664n0;
import no.nordicsemi.android.support.v18.scanner.AbstractC26703a;
import no.nordicsemi.android.support.v18.scanner.ScanFilter;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;
import org.joda.time.DateTime;
import p000.AbstractC39873de5;
import p000.C2320FX;
import p000.Z21;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u00020\u0001:\u0001\u0007B\u0019\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b2\u00103J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J$\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020 0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050+8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u0012\u0004\b-\u0010.¨\u00067²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002"}, m28432d2 = {"LFX;", "LDX;", "LYk5;", "scanSettings", "LEu1;", "LZ21;", "LYl5;", C17296a.f69688o, "T", "Lvy0;", "connectionSettings", "Lcy0;", DateTokenConverter.CONVERTER_KEY, "LZo2;", "legacyBleOperationSettings", "", "isAdding", "", "c", "LaX;", "LaX;", "f", "()LaX;", "bluetoothDeviceStore", "Lio/reactivex/Observable;", "Lde5$a;", "b", "Lkotlin/Lazy;", "()Lio/reactivex/Observable;", "stateChanges", "Ljava/util/Comparator;", "Ljava/lang/ref/WeakReference;", "LWX;", "Ljava/util/Comparator;", "priorityComparator", "LGX2;", "Ljava/util/concurrent/PriorityBlockingQueue;", "LGX2;", "ongoingOperationRequestsFlow", "LtP5;", "e", "LtP5;", "currentOperationModeFlow", "LTy5;", "LTy5;", "getScanResultsFlow$annotations", "()V", "scanResultsFlow", "Lde5;", "rxBleClient", "<init>", "(Lde5;LaX;)V", "g", "Lci3;", "fallbackSettings", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,333:1\n190#2:334\n230#3,5:335\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n*L\n241#1:334\n322#1:335,5\n*E\n"})
/* renamed from: FX */
/* loaded from: classes2.dex */
public final class C2320FX implements InterfaceC1510DX {

    /* renamed from: g */
    public static final C2321a f9541g = new C2321a(null);

    /* renamed from: a */
    public final C10730aX f9542a;

    /* renamed from: b */
    public final Lazy f9543b;

    /* renamed from: c */
    public final Comparator<WeakReference<InterfaceC9077WX>> f9544c;

    /* renamed from: d */
    public final GX2<PriorityBlockingQueue<WeakReference<InterfaceC9077WX>>> f9545d;

    /* renamed from: e */
    public final InterfaceC49220tP5<InterfaceC9077WX> f9546e;

    /* renamed from: f */
    public final InterfaceC36280Ty5<Z21<C37333Yl5>> f9547f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LFX$a;", "", "", "DEFAULT_INITIAL_CAPACITY", "I", "<init>", "()V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FX$a */
    /* loaded from: classes2.dex */
    public static final class C2321a {
        public /* synthetic */ C2321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2321a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m28432d2 = {"T", "Ln74;", "Lcy0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$connect$1", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {298}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: FX$b */
    /* loaded from: classes2.dex */
    public static final class C2322b extends SuspendLambda implements Function2<InterfaceC45497n74<? super C39475cy0<T>>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f9548h;

        /* renamed from: i */
        public /* synthetic */ Object f9549i;

        /* renamed from: j */
        public final /* synthetic */ C50739vy0<T> f9550j;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "T", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FX$b$a */
        /* loaded from: classes2.dex */
        public static final class C2323a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C26664n0 f9551g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2323a(C26664n0 c26664n0) {
                super(0);
                this.f9551g = c26664n0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f9551g.m22605M();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2322b(C50739vy0<T> c50739vy0, Continuation<? super C2322b> continuation) {
            super(2, continuation);
            this.f9550j = c50739vy0;
        }

        /* renamed from: g */
        public static final void m107055g(InterfaceC45497n74 interfaceC45497n74, C50739vy0 c50739vy0, BluetoothDevice device) {
            C41318g46.m40163a("connected to device " + device, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(device, "device");
            interfaceC45497n74.mo2349h(new C39475cy0(device, c50739vy0.m7688d(), true, null, 8, null));
        }

        /* renamed from: h */
        public static final void m107054h(InterfaceC45497n74 interfaceC45497n74, C50739vy0 c50739vy0, BluetoothDevice device, int i) {
            C41318g46.m40163a("failed to connect to device " + device + " - status - " + i, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(device, "device");
            AbstractC8883Vy m7688d = c50739vy0.m7688d();
            interfaceC45497n74.mo2349h(new C39475cy0(device, m7688d, false, new BleManagerConnectionException("Failed to connect to device " + device + ": '" + i + "'")));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2322b c2322b = new C2322b(this.f9550j, continuation);
            c2322b.f9549i = obj;
            return c2322b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC45497n74<? super C39475cy0<T>> interfaceC45497n74, Continuation<? super Unit> continuation) {
            return ((C2322b) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f9548h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final InterfaceC45497n74 interfaceC45497n74 = (InterfaceC45497n74) this.f9549i;
                C41318g46.m40163a("making request to connect to device now", new Object[0]);
                C26664n0 m7690b = this.f9550j.m7690b();
                final C50739vy0<T> c50739vy0 = this.f9550j;
                C26664n0 mo22462j = m7690b.mo22462j(new InterfaceC52220yT5() { // from class: GX
                    @Override // p000.InterfaceC52220yT5
                    /* renamed from: c */
                    public final void mo3469c(BluetoothDevice bluetoothDevice) {
                        C2320FX.C2322b.m107055g(InterfaceC45497n74.this, c50739vy0, bluetoothDevice);
                    }
                });
                final C50739vy0<T> c50739vy02 = this.f9550j;
                C26664n0 mo22461l = mo22462j.mo22461l(new InterfaceC32397Dj1() { // from class: HX
                    @Override // p000.InterfaceC32397Dj1
                    /* renamed from: a */
                    public final void mo22490a(BluetoothDevice bluetoothDevice, int i2) {
                        C2320FX.C2322b.m107054h(InterfaceC45497n74.this, c50739vy02, bluetoothDevice, i2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(mo22461l, "connectionSettings.conne…            )\n          }");
                mo22461l.mo22507k();
                C2323a c2323a = new C2323a(mo22461l);
                this.f9548h = 1;
                if (C43125j74.m31072a(interfaceC45497n74, c2323a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LGu1;", "Lcy0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$connect$2", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$connect$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,333:1\n230#2,5:334\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$connect$2\n*L\n302#1:334,5\n*E\n"})
    /* renamed from: FX$c */
    /* loaded from: classes2.dex */
    public static final class C2324c extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super C39475cy0<T>>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f9552h;

        /* renamed from: j */
        public final /* synthetic */ WeakReference<InterfaceC9077WX> f9554j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2324c(WeakReference<InterfaceC9077WX> weakReference, Continuation<? super C2324c> continuation) {
            super(2, continuation);
            this.f9554j = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2324c(this.f9554j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super C39475cy0<T>> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C2324c) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            PriorityBlockingQueue priorityBlockingQueue;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9552h == 0) {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40152l("-- Connect flow start event --", new Object[0]);
                GX2 gx2 = C2320FX.this.f9545d;
                WeakReference<InterfaceC9077WX> weakReference = this.f9554j;
                do {
                    value = gx2.getValue();
                    priorityBlockingQueue = (PriorityBlockingQueue) value;
                    priorityBlockingQueue.remove(weakReference);
                    priorityBlockingQueue.add(weakReference);
                } while (!gx2.compareAndSet(value, priorityBlockingQueue));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m28432d2 = {"T", "LGu1;", "Lcy0;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$connect$3", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$connect$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,333:1\n230#2,5:334\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$connect$3\n*L\n310#1:334,5\n*E\n"})
    /* renamed from: FX$d */
    /* loaded from: classes2.dex */
    public static final class C2325d extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super C39475cy0<T>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f9555h;

        /* renamed from: j */
        public final /* synthetic */ WeakReference<InterfaceC9077WX> f9557j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325d(WeakReference<InterfaceC9077WX> weakReference, Continuation<? super C2325d> continuation) {
            super(3, continuation);
            this.f9557j = weakReference;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: e */
        public final Object invoke(InterfaceC33198Gu1<? super C39475cy0<T>> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
            return new C2325d(this.f9557j, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            PriorityBlockingQueue priorityBlockingQueue;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9555h == 0) {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40152l("-- Connect flow complete event --", new Object[0]);
                GX2 gx2 = C2320FX.this.f9545d;
                WeakReference<InterfaceC9077WX> weakReference = this.f9557j;
                do {
                    value = gx2.getValue();
                    priorityBlockingQueue = (PriorityBlockingQueue) value;
                    priorityBlockingQueue.remove(weakReference);
                } while (!gx2.compareAndSet(value, priorityBlockingQueue));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/util/concurrent/PriorityBlockingQueue;", "Ljava/lang/ref/WeakReference;", "LWX;", "it", C17296a.f69688o, "(Ljava/util/concurrent/PriorityBlockingQueue;)LWX;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$currentOperationModeFlow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n1549#2:334\n1620#2,3:335\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$currentOperationModeFlow$1\n*L\n100#1:334\n100#1:335,3\n*E\n"})
    /* renamed from: FX$e */
    /* loaded from: classes2.dex */
    public static final class C2326e extends Lambda implements Function1<PriorityBlockingQueue<WeakReference<InterfaceC9077WX>>, InterfaceC9077WX> {

        /* renamed from: g */
        public static final C2326e f9558g = new C2326e();

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lci3;", "b", "()Lci3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: FX$e$a */
        /* loaded from: classes2.dex */
        public static final class C2327a extends Lambda implements Function0<C39300ci3> {

            /* renamed from: g */
            public static final C2327a f9559g = new C2327a();

            public C2327a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final C39300ci3 invoke() {
                return new C39300ci3(EnumC38707bi3.NO_OP);
            }
        }

        public C2326e() {
            super(1);
        }

        /* renamed from: b */
        public static final C39300ci3 m107051b(Lazy<C39300ci3> lazy) {
            return lazy.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC9077WX invoke(PriorityBlockingQueue<WeakReference<InterfaceC9077WX>> it) {
            int collectionSizeOrDefault;
            InterfaceC9077WX interfaceC9077WX;
            Lazy lazy;
            Object obj;
            Intrinsics.checkNotNullParameter(it, "it");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(it, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it2 = it.iterator();
            while (it2.hasNext()) {
                InterfaceC9077WX interfaceC9077WX2 = (InterfaceC9077WX) ((WeakReference) it2.next()).get();
                if (interfaceC9077WX2 == null || (obj = interfaceC9077WX2.mo7691a()) == null) {
                    obj = "null";
                }
                arrayList.add(obj);
            }
            C41318g46.m40163a("QUEUE: " + arrayList, new Object[0]);
            int size = it.size();
            WeakReference<InterfaceC9077WX> peek = it.peek();
            if (peek != null) {
                interfaceC9077WX = peek.get();
            } else {
                interfaceC9077WX = null;
            }
            lazy = LazyKt__LazyJVMKt.lazy(C2327a.f9559g);
            if (interfaceC9077WX == null) {
                return m107051b(lazy);
            }
            if (size > 1) {
                return new C39300ci3(interfaceC9077WX.mo7691a());
            }
            return interfaceC9077WX;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$scan$$inlined$flatMapLatest$1", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,215:1\n242#2,2:216\n47#3:218\n49#3:222\n50#4:219\n55#4:221\n106#5:220\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n*L\n243#1:218\n243#1:222\n243#1:219\n243#1:221\n243#1:220\n*E\n"})
    /* renamed from: FX$f */
    /* loaded from: classes2.dex */
    public static final class C2328f extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super Z21<C37333Yl5>>, Unit, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f9560h;

        /* renamed from: i */
        public /* synthetic */ Object f9561i;

        /* renamed from: j */
        public /* synthetic */ Object f9562j;

        /* renamed from: k */
        public final /* synthetic */ C2320FX f9563k;

        /* renamed from: l */
        public final /* synthetic */ C37324Yk5 f9564l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2328f(Continuation continuation, C2320FX c2320fx, C37324Yk5 c37324Yk5) {
            super(3, continuation);
            this.f9563k = c2320fx;
            this.f9564l = c37324Yk5;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super Z21<C37333Yl5>> interfaceC33198Gu1, Unit unit, Continuation<? super Unit> continuation) {
            C2328f c2328f = new C2328f(continuation, this.f9563k, this.f9564l);
            c2328f.f9561i = interfaceC33198Gu1;
            c2328f.f9562j = unit;
            return c2328f.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f9560h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Unit unit = (Unit) this.f9562j;
                C2331i c2331i = new C2331i(this.f9563k.f9547f, this.f9564l);
                this.f9560h = 1;
                if (C36708Vu1.m79252s((InterfaceC33198Gu1) this.f9561i, c2331i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$scan$1", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scan$1\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,333:1\n329#2:334\n230#3,5:335\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scan$1\n*L\n233#1:334\n235#1:335,5\n*E\n"})
    /* renamed from: FX$g */
    /* loaded from: classes2.dex */
    public static final class C2329g extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f9565h;

        /* renamed from: j */
        public final /* synthetic */ WeakReference<InterfaceC9077WX> f9567j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2329g(WeakReference<InterfaceC9077WX> weakReference, Continuation<? super C2329g> continuation) {
            super(2, continuation);
            this.f9567j = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2329g(this.f9567j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super Unit> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C2329g) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            PriorityBlockingQueue priorityBlockingQueue;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9565h == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext context = getContext();
                C41318g46.m40152l(context + " -- Scan flow start event --", new Object[0]);
                GX2 gx2 = C2320FX.this.f9545d;
                WeakReference<InterfaceC9077WX> weakReference = this.f9567j;
                do {
                    value = gx2.getValue();
                    priorityBlockingQueue = (PriorityBlockingQueue) value;
                    priorityBlockingQueue.remove(weakReference);
                    priorityBlockingQueue.add(weakReference);
                } while (!gx2.compareAndSet(value, priorityBlockingQueue));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m28432d2 = {"LGu1;", "LZ21;", "LYl5;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$scan$3", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scan$3\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,333:1\n329#2:334\n230#3,5:335\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scan$3\n*L\n258#1:334\n259#1:335,5\n*E\n"})
    /* renamed from: FX$h */
    /* loaded from: classes2.dex */
    public static final class C2330h extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super Z21<C37333Yl5>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f9568h;

        /* renamed from: j */
        public final /* synthetic */ WeakReference<InterfaceC9077WX> f9570j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2330h(WeakReference<InterfaceC9077WX> weakReference, Continuation<? super C2330h> continuation) {
            super(3, continuation);
            this.f9570j = weakReference;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: e */
        public final Object invoke(InterfaceC33198Gu1<? super Z21<C37333Yl5>> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
            return new C2330h(this.f9570j, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            PriorityBlockingQueue priorityBlockingQueue;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9568h == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext context = getContext();
                C41318g46.m40152l(context + " -- Scan flow completion event --", new Object[0]);
                GX2 gx2 = C2320FX.this.f9545d;
                WeakReference<InterfaceC9077WX> weakReference = this.f9570j;
                do {
                    value = gx2.getValue();
                    priorityBlockingQueue = (PriorityBlockingQueue) value;
                    priorityBlockingQueue.remove(weakReference);
                } while (!gx2.compareAndSet(value, priorityBlockingQueue));
                this.f9570j.clear();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* renamed from: FX$i */
    /* loaded from: classes2.dex */
    public static final class C2331i implements InterfaceC32730Eu1<Z21<C37333Yl5>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f9571b;

        /* renamed from: c */
        public final /* synthetic */ C37324Yk5 f9572c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n244#3:224\n245#3,10:226\n329#4:225\n329#4:237\n1#5:236\n1549#6:238\n1620#6,3:239\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl\n*L\n244#1:225\n254#1:237\n254#1:238\n254#1:239,3\n*E\n"})
        /* renamed from: FX$i$a */
        /* loaded from: classes2.dex */
        public static final class C2332a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f9573b;

            /* renamed from: c */
            public final /* synthetic */ C37324Yk5 f9574c;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$scan$lambda$4$$inlined$map$1$2", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: FX$i$a$a */
            /* loaded from: classes2.dex */
            public static final class C2333a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f9575h;

                /* renamed from: i */
                public int f9576i;

                public C2333a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f9575h = obj;
                    this.f9576i |= Integer.MIN_VALUE;
                    return C2332a.this.emit(null, this);
                }
            }

            public C2332a(InterfaceC33198Gu1 interfaceC33198Gu1, C37324Yk5 c37324Yk5) {
                this.f9573b = interfaceC33198Gu1;
                this.f9574c = c37324Yk5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Collection, java.util.ArrayList] */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C2333a c2333a;
                Object coroutine_suspended;
                int i;
                AT5 at5;
                Object obj2;
                C37333Yl5 c37333Yl5;
                List<ScannedDevice> m74314b;
                int collectionSizeOrDefault;
                if (continuation instanceof C2333a) {
                    c2333a = (C2333a) continuation;
                    int i2 = c2333a.f9576i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c2333a.f9576i = i2 - Integer.MIN_VALUE;
                        Object obj3 = c2333a.f9575h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c2333a.f9576i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj3);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f9573b;
                            Object obj4 = (Z21) obj;
                            C41318g46.m40152l(c2333a.getContext() + " -- mapping latest scan flow emission -- ", new Object[0]);
                            ScanFilter m74334d = this.f9574c.m74334d();
                            DateTime m74335c = this.f9574c.m74335c();
                            String str = null;
                            if ((obj4 instanceof AT5) && (m74334d != null || m74335c != null)) {
                                AT5 at52 = (AT5) obj4;
                                obj4 = AT5.copy$default(at52, null, C37567Zl5.m72549b((C37333Yl5) at52.m115732b(), m74334d, m74335c), 1, null);
                            }
                            Object context = c2333a.getContext();
                            Object orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj4.getClass());
                            if (obj4 instanceof AT5) {
                                at5 = (AT5) obj4;
                            } else {
                                at5 = null;
                            }
                            if (at5 != null && (c37333Yl5 = (C37333Yl5) at5.m115732b()) != null && (m74314b = c37333Yl5.m74314b()) != null) {
                                List<ScannedDevice> list = m74314b;
                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                                obj2 = new ArrayList(collectionSizeOrDefault);
                                for (ScannedDevice scannedDevice : list) {
                                    obj2.add(scannedDevice.m59105c());
                                }
                            } else {
                                obj2 = "";
                            }
                            Object mo7691a = this.f9574c.mo7691a();
                            ScanFilter m74334d2 = this.f9574c.m74334d();
                            if (m74334d2 != null) {
                                str = m74334d2.m22459a();
                            }
                            C41318g46.m40152l(context + " -- Received scan results flow update: [" + orCreateKotlinClass + "] " + obj2 + " " + mo7691a + " - " + str, new Object[0]);
                            c2333a.f9576i = 1;
                            if (interfaceC33198Gu1.emit(obj4, c2333a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c2333a = new C2333a(continuation);
                Object obj32 = c2333a.f9575h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2333a.f9576i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C2331i(InterfaceC32730Eu1 interfaceC32730Eu1, C37324Yk5 c37324Yk5) {
            this.f9571b = interfaceC32730Eu1;
            this.f9572c = c37324Yk5;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super Z21<C37333Yl5>> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f9571b.collect(new C2332a(interfaceC33198Gu1, this.f9572c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LWX;", "opSettings", "LEu1;", "LZ21;", "LYl5;", C17296a.f69688o, "(LWX;)LEu1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FX$j */
    /* loaded from: classes2.dex */
    public static final class C2334j extends Lambda implements Function1<InterfaceC9077WX, InterfaceC32730Eu1<? extends Z21<C37333Yl5>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Ln74;", "LZ21;", "LYl5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$scanResultsFlow$1$1", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {203}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: FX$j$a */
        /* loaded from: classes2.dex */
        public static final class C2335a extends SuspendLambda implements Function2<InterfaceC45497n74<? super Z21<C37333Yl5>>, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f9579h;

            /* renamed from: i */
            public /* synthetic */ Object f9580i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC9077WX f9581j;

            /* renamed from: k */
            public final /* synthetic */ C2320FX f9582k;

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: FX$j$a$a */
            /* loaded from: classes2.dex */
            public static final class C2336a extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ AbstractC26703a f9583g;

                /* renamed from: h */
                public final /* synthetic */ AbstractC31946Bl0<Z21<C37333Yl5>> f9584h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2336a(AbstractC26703a abstractC26703a, AbstractC31946Bl0<Z21<C37333Yl5>> abstractC31946Bl0) {
                    super(0);
                    this.f9583g = abstractC26703a;
                    this.f9584h = abstractC31946Bl0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f9583g.mo22382a(this.f9584h);
                    this.f9583g.m22394e(this.f9584h);
                    C41318g46.m40152l("called stopScan in awaitClose!!!", new Object[0]);
                }
            }

            @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, m28432d2 = {"FX$j$a$b", "LBl0;", "LZ21;", "LYl5;", "", "callbackType", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "c", "", "results", C17296a.f69688o, "errorCode", "b", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scanResultsFlow$1$1$scanCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n1549#2:334\n1620#2,3:335\n*S KotlinDebug\n*F\n+ 1 BluetoothManagerImpl.kt\nco/bird/android/bluetooth/impl/BluetoothManagerImpl$scanResultsFlow$1$1$scanCallback$1\n*L\n166#1:334\n166#1:335,3\n*E\n"})
            /* renamed from: FX$j$a$b */
            /* loaded from: classes2.dex */
            public static final class C2337b extends AbstractC31946Bl0<Z21<C37333Yl5>> {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC45497n74<Z21<C37333Yl5>> f9585b;

                /* renamed from: c */
                public final /* synthetic */ C2320FX f9586c;

                /* renamed from: d */
                public final /* synthetic */ InterfaceC9077WX f9587d;

                @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "it", "", C17296a.f69688o, "(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: FX$j$a$b$a */
                /* loaded from: classes2.dex */
                public static final class C2338a extends Lambda implements Function1<ScanResult, Boolean> {

                    /* renamed from: g */
                    public static final C2338a f9588g = new C2338a();

                    public C2338a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final Boolean invoke(ScanResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(it.m22430e());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2337b(InterfaceC45497n74<? super Z21<C37333Yl5>> interfaceC45497n74, C2320FX c2320fx, InterfaceC9077WX interfaceC9077WX) {
                    super(interfaceC45497n74);
                    this.f9585b = interfaceC45497n74;
                    this.f9586c = c2320fx;
                    this.f9587d = interfaceC9077WX;
                }

                @Override // p000.AbstractC43480jj5
                /* renamed from: a */
                public void mo30024a(List<ScanResult> results) {
                    int collectionSizeOrDefault;
                    String str;
                    Intrinsics.checkNotNullParameter(results, "results");
                    super.mo30024a(results);
                    if (this.f9585b.mo2353A()) {
                        return;
                    }
                    List<ScanResult> list = results;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (ScanResult scanResult : list) {
                        arrayList.add(scanResult.m22434a().getAddress());
                    }
                    C41318g46.m40152l("onBatchScanResults " + arrayList + " }}", new Object[0]);
                    if (this.f9586c.m107059f().m71252c(results, true, C2338a.f9588g)) {
                        Object mo2349h = this.f9585b.mo2349h(Z21.f47770a.m73812c(this.f9587d, new C37333Yl5(this.f9586c.m107059f().m71251d())));
                        boolean m88180j = C35420Qh0.m88180j(mo2349h);
                        boolean m88181i = C35420Qh0.m88181i(mo2349h);
                        Throwable m88185e = C35420Qh0.m88185e(mo2349h);
                        if (m88185e != null) {
                            str = m88185e.getMessage();
                        } else {
                            str = null;
                        }
                        InterfaceC45497n74<Z21<C37333Yl5>> interfaceC45497n74 = this.f9585b;
                        C41318g46.m40152l("result: success - " + m88180j + " closed - " + m88181i + " error - " + str + " " + interfaceC45497n74 + " ", new Object[0]);
                    }
                }

                @Override // p000.AbstractC43480jj5
                /* renamed from: b */
                public void mo30023b(int i) {
                    super.mo30023b(i);
                    if (this.f9585b.mo2353A()) {
                        return;
                    }
                    this.f9585b.mo2349h(Z21.C10105a.createError$default(Z21.f47770a, this.f9587d, i, null, 4, null));
                }

                @Override // p000.AbstractC43480jj5
                /* renamed from: c */
                public void mo30022c(int i, ScanResult result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    super.mo30022c(i, result);
                    if (this.f9585b.mo2353A()) {
                        return;
                    }
                    if (result.m22430e()) {
                        this.f9586c.m107059f().m71254a(result);
                    }
                    this.f9585b.mo2349h(Z21.f47770a.m73812c(this.f9587d, new C37333Yl5(this.f9586c.m107059f().m71251d())));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2335a(InterfaceC9077WX interfaceC9077WX, C2320FX c2320fx, Continuation<? super C2335a> continuation) {
                super(2, continuation);
                this.f9581j = interfaceC9077WX;
                this.f9582k = c2320fx;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2335a c2335a = new C2335a(this.f9581j, this.f9582k, continuation);
                c2335a.f9580i = obj;
                return c2335a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC45497n74<? super Z21<C37333Yl5>> interfaceC45497n74, Continuation<? super Unit> continuation) {
                return ((C2335a) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                C37324Yk5 c37324Yk5;
                List<ScanFilter> listOfNotNull;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f9579h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC45497n74 interfaceC45497n74 = (InterfaceC45497n74) this.f9580i;
                    C41318g46.m40152l("new callback flow {" + interfaceC45497n74 + "}", new Object[0]);
                    C2337b c2337b = new C2337b(interfaceC45497n74, this.f9582k, this.f9581j);
                    interfaceC45497n74.mo2349h(Z21.f47770a.m73813b(this.f9581j));
                    ScanSettings m22412a = new ScanSettings.C26702b().m22403j(this.f9581j.mo7691a().m64098b()).m22409d(false).m22404i(500L).m22402k(false).m22412a();
                    Intrinsics.checkNotNullExpressionValue(m22412a, "Builder()\n              …e)\n              .build()");
                    InterfaceC9077WX interfaceC9077WX = this.f9581j;
                    ScanFilter scanFilter = null;
                    if (interfaceC9077WX instanceof C37324Yk5) {
                        c37324Yk5 = (C37324Yk5) interfaceC9077WX;
                    } else {
                        c37324Yk5 = null;
                    }
                    if (c37324Yk5 != null) {
                        scanFilter = c37324Yk5.m74334d();
                    }
                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(scanFilter);
                    AbstractC26703a m22396b = AbstractC26703a.m22396b();
                    Intrinsics.checkNotNullExpressionValue(m22396b, "getScanner()");
                    m22396b.m22395c(listOfNotNull, m22412a, c2337b);
                    C2336a c2336a = new C2336a(m22396b, c2337b);
                    this.f9579h = 1;
                    if (C43125j74.m31072a(interfaceC45497n74, c2336a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "LZ21;", "LYl5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$scanResultsFlow$1$2", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: FX$j$b */
        /* loaded from: classes2.dex */
        public static final class C2339b extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super Z21<C37333Yl5>>, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f9589h;

            public C2339b(Continuation<? super C2339b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2339b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC33198Gu1<? super Z21<C37333Yl5>> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
                return ((C2339b) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f9589h == 0) {
                    ResultKt.throwOnFailure(obj);
                    C41318g46.m40152l("started new callback flow!!!", new Object[0]);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m28432d2 = {"LGu1;", "LZ21;", "LYl5;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.bluetooth.impl.BluetoothManagerImpl$scanResultsFlow$1$3", m28418f = "BluetoothManagerImpl.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: FX$j$c */
        /* loaded from: classes2.dex */
        public static final class C2340c extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super Z21<C37333Yl5>>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f9590h;

            public C2340c(Continuation<? super C2340c> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: e */
            public final Object invoke(InterfaceC33198Gu1<? super Z21<C37333Yl5>> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
                return new C2340c(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f9590h == 0) {
                    ResultKt.throwOnFailure(obj);
                    C41318g46.m40152l("completed callback flow!!!", new Object[0]);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: FX$j$d */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C2341d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC38707bi3.values().length];
                try {
                    iArr[EnumC38707bi3.SCAN_LOW_LATENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC38707bi3.SCAN_BALANCED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC38707bi3.SCAN_LOW_POWER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC38707bi3.SCAN_OPPORTUNISTIC.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC38707bi3.SCAN_LEGACY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC38707bi3.CONNECT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC38707bi3.NO_OP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C2334j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC32730Eu1<Z21<C37333Yl5>> invoke(InterfaceC9077WX opSettings) {
            C37324Yk5 c37324Yk5;
            Object obj;
            ScanFilter m74334d;
            Intrinsics.checkNotNullParameter(opSettings, "opSettings");
            EnumC38707bi3 mo7691a = opSettings.mo7691a();
            if (opSettings instanceof C37324Yk5) {
                c37324Yk5 = (C37324Yk5) opSettings;
            } else {
                c37324Yk5 = null;
            }
            if (c37324Yk5 != null && (m74334d = c37324Yk5.m74334d()) != null) {
                obj = m74334d.m22459a();
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = Reflection.getOrCreateKotlinClass(opSettings.getClass());
            }
            C41318g46.m40152l("operating mode change: " + mo7691a + " - " + obj, new Object[0]);
            switch (C2341d.$EnumSwitchMapping$0[opSettings.mo7691a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return C36708Vu1.m79277K(C36708Vu1.m79275M(C36708Vu1.m79266e(new C2335a(opSettings, C2320FX.this, null)), new C2339b(null)), new C2340c(null));
                case 5:
                case 6:
                case 7:
                    return C36708Vu1.m79281G(new N93(opSettings));
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lde5$a;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FX$k */
    /* loaded from: classes2.dex */
    public static final class C2342k extends Lambda implements Function0<Observable<AbstractC39873de5.EnumC19828a>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC39873de5 f9591g;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", "old", "new", "", C17296a.f69688o, "(Lde5$a;Lde5$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: FX$k$a */
        /* loaded from: classes2.dex */
        public static final class C2343a extends Lambda implements Function2<AbstractC39873de5.EnumC19828a, AbstractC39873de5.EnumC19828a, Boolean> {

            /* renamed from: g */
            public static final C2343a f9592g = new C2343a();

            public C2343a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2342k(AbstractC39873de5 abstractC39873de5) {
            super(0);
            this.f9591g = abstractC39873de5;
        }

        /* renamed from: c */
        public static final boolean m107043c(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<AbstractC39873de5.EnumC19828a> invoke() {
            Observable<AbstractC39873de5.EnumC19828a> startWith = this.f9591g.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) this.f9591g.mo33641c());
            final C2343a c2343a = C2343a.f9592g;
            return startWith.distinctUntilChanged(new InterfaceC23481d() { // from class: IX
                @Override // io.reactivex.functions.InterfaceC23481d
                public final boolean test(Object obj, Object obj2) {
                    boolean m107043c;
                    m107043c = C2320FX.C2342k.m107043c(Function2.this, obj, obj2);
                    return m107043c;
                }
            }).share();
        }
    }

    public C2320FX(AbstractC39873de5 rxBleClient, C10730aX bluetoothDeviceStore) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(bluetoothDeviceStore, "bluetoothDeviceStore");
        this.f9542a = bluetoothDeviceStore;
        lazy = LazyKt__LazyJVMKt.lazy(new C2342k(rxBleClient));
        this.f9543b = lazy;
        Comparator<WeakReference<InterfaceC9077WX>> comparator = new Comparator() { // from class: EX
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m107058g;
                m107058g = C2320FX.m107058g((WeakReference) obj, (WeakReference) obj2);
                return m107058g;
            }
        };
        this.f9544c = comparator;
        GX2<PriorityBlockingQueue<WeakReference<InterfaceC9077WX>>> m8742a = C50405vP5.m8742a(new PriorityBlockingQueue(11, comparator));
        this.f9545d = m8742a;
        InterfaceC49220tP5<InterfaceC9077WX> mapState$default = C52633z96.mapState$default(C36708Vu1.m79269b(m8742a), null, C2326e.f9558g, 1, null);
        this.f9546e = mapState$default;
        this.f9547f = C51447x96.m5768a(mapState$default, null, new N93(new C39300ci3(EnumC38707bi3.NO_OP)), new C2334j());
    }

    /* renamed from: g */
    public static final int m107058g(WeakReference weakReference, WeakReference weakReference2) {
        InterfaceC9077WX interfaceC9077WX = (InterfaceC9077WX) weakReference.get();
        InterfaceC9077WX interfaceC9077WX2 = (InterfaceC9077WX) weakReference2.get();
        if (interfaceC9077WX == null && interfaceC9077WX2 == null) {
            return 0;
        }
        if (interfaceC9077WX != null) {
            if (interfaceC9077WX2 != null) {
                if (interfaceC9077WX.mo7691a().compareTo(interfaceC9077WX2.mo7691a()) >= 0) {
                    if (interfaceC9077WX.mo7691a().compareTo(interfaceC9077WX2.mo7691a()) <= 0 && !(interfaceC9077WX instanceof C37324Yk5)) {
                        if (!(interfaceC9077WX2 instanceof C37324Yk5)) {
                            return 0;
                        }
                    }
                }
            }
            return -1;
        }
        return 1;
    }

    @Override // p000.InterfaceC1510DX
    /* renamed from: a */
    public InterfaceC32730Eu1<Z21<C37333Yl5>> mo107064a(C37324Yk5 scanSettings) {
        Intrinsics.checkNotNullParameter(scanSettings, "scanSettings");
        WeakReference weakReference = new WeakReference(scanSettings);
        InterfaceC36280Ty5<Z21<C37333Yl5>> interfaceC36280Ty5 = this.f9547f;
        C41318g46.m40152l("--- attempting to subscribe to scanResultsFlow: " + interfaceC36280Ty5, new Object[0]);
        return C36708Vu1.m79277K(C36708Vu1.m79271Q(C36708Vu1.m79275M(C36708Vu1.m79281G(Unit.INSTANCE), new C2329g(weakReference, null)), new C2328f(null, this, scanSettings)), new C2330h(weakReference, null));
    }

    @Override // p000.InterfaceC1510DX
    /* renamed from: b */
    public Observable<AbstractC39873de5.EnumC19828a> mo107063b() {
        Object value = this.f9543b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-stateChanges>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC1510DX
    /* renamed from: c */
    public <T> void mo107062c(C37591Zo2<T> legacyBleOperationSettings, boolean z) {
        PriorityBlockingQueue<WeakReference<InterfaceC9077WX>> value;
        PriorityBlockingQueue<WeakReference<InterfaceC9077WX>> priorityBlockingQueue;
        Intrinsics.checkNotNullParameter(legacyBleOperationSettings, "legacyBleOperationSettings");
        WeakReference<InterfaceC9077WX> weakReference = new WeakReference<>(legacyBleOperationSettings);
        GX2<PriorityBlockingQueue<WeakReference<InterfaceC9077WX>>> gx2 = this.f9545d;
        do {
            value = gx2.getValue();
            priorityBlockingQueue = value;
            priorityBlockingQueue.remove(weakReference);
            if (z) {
                priorityBlockingQueue.add(weakReference);
            }
        } while (!gx2.compareAndSet(value, priorityBlockingQueue));
    }

    @Override // p000.InterfaceC1510DX
    /* renamed from: d */
    public <T> InterfaceC32730Eu1<C39475cy0<T>> mo107061d(C50739vy0<T> connectionSettings) {
        Intrinsics.checkNotNullParameter(connectionSettings, "connectionSettings");
        WeakReference weakReference = new WeakReference(connectionSettings);
        return C36708Vu1.m79277K(C36708Vu1.m79275M(C36708Vu1.m79266e(new C2322b(connectionSettings, null)), new C2324c(weakReference, null)), new C2325d(weakReference, null));
    }

    /* renamed from: f */
    public C10730aX m107059f() {
        return this.f9542a;
    }
}
