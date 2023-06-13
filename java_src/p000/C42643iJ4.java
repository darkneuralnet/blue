package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import no.nordicsemi.android.ble.AbstractC26684u0;
import no.nordicsemi.android.ble.C26613D0;
import no.nordicsemi.android.ble.data.Data;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"Lno/nordicsemi/android/ble/D0;", "Lno/nordicsemi/android/ble/data/Data;", "b", "(Lno/nordicsemi/android/ble/D0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lno/nordicsemi/android/ble/u0;", "", DateTokenConverter.CONVERTER_KEY, "(Lno/nordicsemi/android/ble/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ble-ktx_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: iJ4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42643iJ4 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "no.nordicsemi.android.ble.ktx.RequestSuspendKt", m28418f = "RequestSuspend.kt", m28417i = {0}, m28416l = {44}, m28415m = "suspend", m28414n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, m28413s = {"L$0"})
    /* renamed from: iJ4$a */
    /* loaded from: classes8.dex */
    public static final class C23188a extends ContinuationImpl {

        /* renamed from: h */
        public Object f87106h;

        /* renamed from: i */
        public /* synthetic */ Object f87107i;

        /* renamed from: j */
        public int f87108j;

        public C23188a(Continuation<? super C23188a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f87107i = obj;
            this.f87108j |= Integer.MIN_VALUE;
            return C42643iJ4.m34230b(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: iJ4$b */
    /* loaded from: classes8.dex */
    public static final class C23189b implements InterfaceC43123j72 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC36779Wc0<Unit> f87109a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC26684u0 f87110b;

        /* JADX WARN: Multi-variable type inference failed */
        public C23189b(InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0, AbstractC26684u0 abstractC26684u0) {
            this.f87109a = interfaceC36779Wc0;
            this.f87110b = abstractC26684u0;
        }

        @Override // p000.InterfaceC43123j72
        /* renamed from: b */
        public final void mo22489b() {
            InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = this.f87109a;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(new InvalidRequestException(this.f87110b))));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/bluetooth/BluetoothDevice;", "<anonymous parameter 0>", "", "status", "", C17296a.f69688o, "(Landroid/bluetooth/BluetoothDevice;I)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: iJ4$c */
    /* loaded from: classes8.dex */
    public static final class C23190c implements InterfaceC32397Dj1 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC26684u0 f87111a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0<Unit> f87112b;

        /* JADX WARN: Multi-variable type inference failed */
        public C23190c(AbstractC26684u0 abstractC26684u0, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
            this.f87111a = abstractC26684u0;
            this.f87112b = interfaceC36779Wc0;
        }

        @Override // p000.InterfaceC32397Dj1
        /* renamed from: a */
        public final void mo22490a(BluetoothDevice noName_0, int i) {
            Throwable bluetoothDisabledException;
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            if (i != -100) {
                if (i != -1) {
                    bluetoothDisabledException = new RequestFailedException(this.f87111a, i);
                } else {
                    bluetoothDisabledException = new DeviceDisconnectedException();
                }
            } else {
                bluetoothDisabledException = new BluetoothDisabledException();
            }
            InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = this.f87112b;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(bluetoothDisabledException)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/bluetooth/BluetoothDevice;", "it", "", "c", "(Landroid/bluetooth/BluetoothDevice;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: iJ4$d */
    /* loaded from: classes8.dex */
    public static final class C23191d implements InterfaceC52220yT5 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC36779Wc0<Unit> f87113a;

        /* JADX WARN: Multi-variable type inference failed */
        public C23191d(InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
            this.f87113a = interfaceC36779Wc0;
        }

        @Override // p000.InterfaceC52220yT5
        /* renamed from: c */
        public final void mo3469c(BluetoothDevice it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = this.f87113a;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m34230b(C26613D0 c26613d0, Continuation<? super Data> continuation) throws BluetoothDisabledException, DeviceDisconnectedException, RequestFailedException, InvalidRequestException {
        C23188a c23188a;
        Object coroutine_suspended;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C23188a) {
            c23188a = (C23188a) continuation;
            int i2 = c23188a.f87108j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c23188a.f87108j = i2 - Integer.MIN_VALUE;
                Object obj = c23188a.f87107i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c23188a.f87108j;
                if (i == 0) {
                    if (i == 1) {
                        objectRef = (Ref.ObjectRef) c23188a.f87106h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    C26613D0 m22632X = c26613d0.m22632X(new SS0() { // from class: hJ4
                        @Override // p000.SS0
                        /* renamed from: a */
                        public final void mo22543a(BluetoothDevice bluetoothDevice, Data data) {
                            C42643iJ4.m34229c(Ref.ObjectRef.this, bluetoothDevice, data);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(m22632X, "this\n\t\t.with { _, data -> result = data }");
                    c23188a.f87106h = objectRef2;
                    c23188a.f87108j = 1;
                    if (m34228d(m22632X, c23188a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                }
                Object obj2 = objectRef.element;
                Intrinsics.checkNotNull(obj2);
                return obj2;
            }
        }
        c23188a = new C23188a(continuation);
        Object obj3 = c23188a.f87107i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c23188a.f87108j;
        if (i == 0) {
        }
        Object obj22 = objectRef.element;
        Intrinsics.checkNotNull(obj22);
        return obj22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final void m34229c(Ref.ObjectRef result, BluetoothDevice noName_0, Data data) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        Intrinsics.checkNotNullParameter(data, "data");
        result.element = data;
    }

    /* renamed from: d */
    public static final Object m34228d(AbstractC26684u0 abstractC26684u0, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        abstractC26684u0.mo22470F(null).mo22460m(new C23189b(c37013Xc0, abstractC26684u0)).mo22461l(new C23190c(abstractC26684u0, c37013Xc0)).mo22462j(new C23191d(c37013Xc0)).mo22507k();
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }
}
