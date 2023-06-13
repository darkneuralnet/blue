package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.NokelockResponseType;
import co.bird.android.model.wire.WireNokelockInsertedData;
import co.bird.android.model.wire.WireNokelockLockingData;
import co.bird.android.model.wire.WireNokelockResponseData;
import co.bird.android.model.wire.WireNokelockStateData;
import co.bird.android.model.wire.WireNokelockTokenResponseData;
import co.bird.android.model.wire.WireNokelockUnknownData;
import co.bird.android.model.wire.WireNokelockUnlockData;
import co.bird.android.smartlock.impl.SmartlockSolebeNotificationResponse;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.NokelockMessage;
import co.bird.api.response.NokelockResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import no.nordicsemi.android.ble.C26613D0;
import no.nordicsemi.android.ble.callback.profile.ProfileReadResponse;
import no.nordicsemi.android.ble.data.Data;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import p000.AbstractC30179xU;
import p000.DK5;
import p000.TC0;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003NOPB7\b\u0007\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u00102\u001a\u00020/\u0012\b\b\u0001\u00105\u001a\u00020 \u0012\b\b\u0001\u00108\u001a\u00020\n\u0012\b\b\u0001\u0010:\u001a\u00020\u000f¢\u0006\u0004\bK\u0010LJ\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\f\u0010\t\u001a\u00020\u0006*\u00020\u0007H\u0002J\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\nH\u0002J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00020\f2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016J=\u0010'\u001a\u00020&*\u00020 2'\u0010%\u001a#\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\"\u0012\u0006\u0012\u0004\u0018\u00010#0!¢\u0006\u0002\b$ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\u0006\u0010*\u001a\u00020\u0014J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\u0006\u0010,\u001a\u00020\u0014J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011J\u0006\u0010.\u001a\u00020\u0014R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010'R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, m28432d2 = {"LyF5;", "LuE5;", "LwK5;", "Lco/bird/api/response/NokelockResponse;", "old", "i0", "", "", "X", "W", "LsE5;", "Y", "LGX2;", "Lkotlin/Function1;", "", "", "excludeIf", "LEu1;", "g0", "V", "", "T", "", "priority", "message", "H", "D", "LxU$b;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "disconnectOnSuccess", "Lio/reactivex/c;", "U", "LZC0;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lzh2;", "Z", "(LZC0;Lkotlin/jvm/functions/Function2;)Lzh2;", "d0", "c0", "b0", "a0", "f0", "e0", "LhI5;", "n", "LhI5;", "smartLockClient", "o", "LZC0;", Action.SCOPE_ATTRIBUTE, "p", "LsE5;", "smartLock", "q", "enableMultipleSmartlockKeys", "Landroid/bluetooth/BluetoothGattCharacteristic;", "r", "Landroid/bluetooth/BluetoothGattCharacteristic;", "writeCharacteristic", "s", "notifyCharacteristic", "LTC0;", "t", "LTC0;", "requestExceptionHandler", "LvE2;", "u", "LvE2;", "currentTokenRequestIndexCache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;LhI5;LZC0;LsE5;Z)V", "v", C17296a.f69688o, "b", "c", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockSolebeDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,592:1\n49#2,4:593\n190#3:597\n190#3:618\n20#4:598\n22#4:602\n20#4:603\n22#4:607\n20#4:608\n22#4:612\n20#4:613\n22#4:617\n50#5:599\n55#5:601\n50#5:604\n55#5:606\n50#5:609\n55#5:611\n50#5:614\n55#5:616\n106#6:600\n106#6:605\n106#6:610\n106#6:615\n*S KotlinDebug\n*F\n+ 1 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n319#1:593,4\n176#1:597\n582#1:618\n340#1:598\n340#1:602\n401#1:603\n401#1:607\n426#1:608\n426#1:612\n458#1:613\n458#1:617\n340#1:599\n340#1:601\n401#1:604\n401#1:606\n426#1:609\n426#1:611\n458#1:614\n458#1:616\n340#1:600\n401#1:605\n426#1:610\n458#1:615\n*E\n"})
/* renamed from: yF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52094yF5 extends AbstractC49714uE5<C50953wK5> {

    /* renamed from: v */
    public static final C30498a f119180v = new C30498a(null);

    /* renamed from: n */
    public final InterfaceC42042hI5 f119181n;

    /* renamed from: o */
    public final ZC0 f119182o;

    /* renamed from: p */
    public final C48528sE5 f119183p;

    /* renamed from: q */
    public final boolean f119184q;

    /* renamed from: r */
    public BluetoothGattCharacteristic f119185r;

    /* renamed from: s */
    public BluetoothGattCharacteristic f119186s;

    /* renamed from: t */
    public final TC0 f119187t;

    /* renamed from: u */
    public final C50303vE2<String, Integer> f119188u;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"LyF5$a;", "", "", "ENABLE_BLUETOOTH_TIMEOUT_MS", "J", "", "LEASE_DUE_BUFER_TTL_SECONDS", "I", "POST_SCAN_CONNECTION_DELAY_MS", "SECONDS_BETWEEN_UNLOCK_ATTEMPTS", "SMARTLOCK_TOKEN_REQUEST_TIMEOUT_SECONDS", "<init>", "()V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yF5$a */
    /* loaded from: classes4.dex */
    public static final class C30498a {
        public /* synthetic */ C30498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30498a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u001c"}, m28432d2 = {"LyF5$b;", "LyU;", "Landroid/bluetooth/BluetoothDevice;", "device", "", "c", "b", DateTokenConverter.CONVERTER_KEY, "m", "k", "", "optionalServicesFound", "h", C17296a.f69688o, "j", "", "value", "l", "g", "n", "f", "", "message", "errorCode", "i", "e", "<init>", "(LyF5;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yF5$b */
    /* loaded from: classes4.dex */
    public final class C30499b implements InterfaceC30597yU {
        public C30499b() {
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: a */
        public void mo3467a(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: b */
        public void mo3466b(BluetoothDevice device) {
            List plus;
            Intrinsics.checkNotNullParameter(device, "device");
            BX2 m79043R = C52094yF5.this.m79043R();
            C50953wK5 c50953wK5 = (C50953wK5) C52094yF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) C52094yF5.this.m79043R().getValue()).m6985e()), EnumC52732zK5.CONNECTED);
            m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: c */
        public void mo3465c(BluetoothDevice device) {
            List plus;
            Intrinsics.checkNotNullParameter(device, "device");
            BX2 m79043R = C52094yF5.this.m79043R();
            C50953wK5 c50953wK5 = (C50953wK5) C52094yF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) C52094yF5.this.m79043R().getValue()).m6985e()), EnumC52732zK5.CONNECTING);
            m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: d */
        public void mo3464d(BluetoothDevice device) {
            List plus;
            Intrinsics.checkNotNullParameter(device, "device");
            BX2 m79043R = C52094yF5.this.m79043R();
            C50953wK5 c50953wK5 = (C50953wK5) C52094yF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) C52094yF5.this.m79043R().getValue()).m6985e()), EnumC52732zK5.DISCONNECTING);
            m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: e */
        public void mo3463e(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            C41318g46.m40163a("SmartlockSolebeCallback onDeviceNotSupported called, nothing to do for " + address, new Object[0]);
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: f */
        public void mo3462f(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: g */
        public void mo3461g(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: h */
        public void mo3460h(BluetoothDevice device, boolean z) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: i */
        public void mo3459i(BluetoothDevice device, String message, int i) {
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(message, "message");
            C41318g46.m40163a("SmartlockSolebeCallback Error " + message + " (errorCode: " + i + ")", new Object[0]);
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: j */
        public boolean mo3458j(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            return false;
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: k */
        public void mo3457k(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: l */
        public void mo3456l(BluetoothDevice device, int i) {
            Intrinsics.checkNotNullParameter(device, "device");
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: m */
        public void mo3455m(BluetoothDevice device) {
            List plus;
            Intrinsics.checkNotNullParameter(device, "device");
            BX2 m79043R = C52094yF5.this.m79043R();
            C50953wK5 c50953wK5 = (C50953wK5) C52094yF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) C52094yF5.this.m79043R().getValue()).m6985e()), EnumC52732zK5.DISCONNECTED);
            m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: n */
        public void mo3454n(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, m28432d2 = {"LyF5$c;", "LxU$b;", "", "o2", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", "S2", "c5", "<init>", "(LyF5;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockSolebeDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback\n+ 2 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,592:1\n73#2:593\n86#2:594\n20#3:595\n22#3:599\n47#3:600\n49#3:604\n50#4:596\n55#4:598\n50#4:601\n55#4:603\n106#5:597\n106#5:602\n*S KotlinDebug\n*F\n+ 1 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback\n*L\n261#1:593\n261#1:594\n262#1:595\n262#1:599\n265#1:600\n265#1:604\n262#1:596\n262#1:598\n265#1:601\n265#1:603\n262#1:597\n265#1:602\n*E\n"})
    /* renamed from: yF5$c */
    /* loaded from: classes4.dex */
    public final class C30500c extends AbstractC30179xU.AbstractC30181b {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "Ln74;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "no.nordicsemi.android.ble.ktx.ValueChangedCallbackExtKt$asValidResponseFlow$1", m28418f = "ValueChangedCallbackExt.kt", m28417i = {}, m28416l = {82}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1\n*L\n1#1,86:1\n*E\n"})
        /* renamed from: yF5$c$a */
        /* loaded from: classes4.dex */
        public static final class C30501a extends SuspendLambda implements Function2<InterfaceC45497n74<? super SmartlockSolebeNotificationResponse>, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f119191h;

            /* renamed from: i */
            public /* synthetic */ Object f119192i;

            /* renamed from: j */
            public final /* synthetic */ C32636Ej6 f119193j;

            @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "Landroid/bluetooth/BluetoothDevice;", "device", "Lno/nordicsemi/android/ble/data/Data;", MessageExtension.FIELD_DATA, "", "b", "(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
            /* renamed from: yF5$c$a$a */
            /* loaded from: classes4.dex */
            public static final class C30502a implements QS0 {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC45497n74<SmartlockSolebeNotificationResponse> f119194b;

                public C30502a(InterfaceC45497n74 interfaceC45497n74) {
                    this.f119194b = interfaceC45497n74;
                }

                @Override // p000.QS0
                /* renamed from: b */
                public final void mo3746b(BluetoothDevice device, Data data) {
                    Intrinsics.checkNotNullParameter(device, "device");
                    Intrinsics.checkNotNullParameter(data, "data");
                    Object newInstance = SmartlockSolebeNotificationResponse.class.newInstance();
                    ProfileReadResponse profileReadResponse = (ProfileReadResponse) newInstance;
                    profileReadResponse.mo3746b(device, data);
                    if (!profileReadResponse.m22627c()) {
                        newInstance = null;
                    }
                    ProfileReadResponse profileReadResponse2 = (ProfileReadResponse) newInstance;
                    if (profileReadResponse2 != null) {
                        this.f119194b.mo2349h(profileReadResponse2);
                    }
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1$2\n*L\n1#1,86:1\n*E\n"})
            /* renamed from: yF5$c$a$b */
            /* loaded from: classes4.dex */
            public static final class C30503b extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C32636Ej6 f119195g;

                @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "Landroid/bluetooth/BluetoothDevice;", "<anonymous parameter 0>", "Lno/nordicsemi/android/ble/data/Data;", "<anonymous parameter 1>", "", "b", "(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1$2$1\n*L\n1#1,86:1\n*E\n"})
                /* renamed from: yF5$c$a$b$a */
                /* loaded from: classes4.dex */
                public static final class C30504a implements QS0 {

                    /* renamed from: b */
                    public static final C30504a f119196b = new C30504a();

                    @Override // p000.QS0
                    /* renamed from: b */
                    public final void mo3746b(BluetoothDevice noName_0, Data noName_1) {
                        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
                        Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C30503b(C32636Ej6 c32636Ej6) {
                    super(0);
                    this.f119195g = c32636Ej6;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f119195g.m108551h(C30504a.f119196b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30501a(C32636Ej6 c32636Ej6, Continuation continuation) {
                super(2, continuation);
                this.f119193j = c32636Ej6;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C30501a c30501a = new C30501a(this.f119193j, continuation);
                c30501a.f119192i = obj;
                return c30501a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC45497n74<? super SmartlockSolebeNotificationResponse> interfaceC45497n74, Continuation<? super Unit> continuation) {
                return ((C30501a) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f119191h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC45497n74 interfaceC45497n74 = (InterfaceC45497n74) this.f119192i;
                    this.f119193j.m108552g(null);
                    this.f119193j.m108551h(new C30502a(interfaceC45497n74));
                    C30503b c30503b = new C30503b(this.f119193j);
                    this.f119191h = 1;
                    if (C43125j74.m31072a(interfaceC45497n74, c30503b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        /* renamed from: yF5$c$b */
        /* loaded from: classes4.dex */
        public static final class C30505b implements InterfaceC32730Eu1<SmartlockSolebeNotificationResponse> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC32730Eu1 f119197b;

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback\n*L\n1#1,222:1\n21#2:223\n22#2:225\n263#3:224\n*E\n"})
            /* renamed from: yF5$c$b$a */
            /* loaded from: classes4.dex */
            public static final class C30506a<T> implements InterfaceC33198Gu1 {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC33198Gu1 f119198b;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback$initialize$$inlined$filter$1$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: yF5$c$b$a$a */
                /* loaded from: classes4.dex */
                public static final class C30507a extends ContinuationImpl {

                    /* renamed from: h */
                    public /* synthetic */ Object f119199h;

                    /* renamed from: i */
                    public int f119200i;

                    public C30507a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f119199h = obj;
                        this.f119200i |= Integer.MIN_VALUE;
                        return C30506a.this.emit(null, this);
                    }
                }

                public C30506a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.f119198b = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C30507a c30507a;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C30507a) {
                        c30507a = (C30507a) continuation;
                        int i2 = c30507a.f119200i;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c30507a.f119200i = i2 - Integer.MIN_VALUE;
                            Object obj2 = c30507a.f119199h;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c30507a.f119200i;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.f119198b;
                                if (((SmartlockSolebeNotificationResponse) obj).m22627c()) {
                                    c30507a.f119200i = 1;
                                    if (interfaceC33198Gu1.emit(obj, c30507a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c30507a = new C30507a(continuation);
                    Object obj22 = c30507a.f119199h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c30507a.f119200i;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public C30505b(InterfaceC32730Eu1 interfaceC32730Eu1) {
                this.f119197b = interfaceC32730Eu1;
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super SmartlockSolebeNotificationResponse> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = this.f119197b.collect(new C30506a(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        /* renamed from: yF5$c$c */
        /* loaded from: classes4.dex */
        public static final class C30508c implements InterfaceC32730Eu1<NokelockResponse> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC32730Eu1 f119202b;

            /* renamed from: c */
            public final /* synthetic */ C52094yF5 f119203c;

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback\n*L\n1#1,222:1\n48#2:223\n266#3,17:224\n*E\n"})
            /* renamed from: yF5$c$c$a */
            /* loaded from: classes4.dex */
            public static final class C30509a<T> implements InterfaceC33198Gu1 {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC33198Gu1 f119204b;

                /* renamed from: c */
                public final /* synthetic */ C52094yF5 f119205c;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback$initialize$$inlined$map$1$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {240, 223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: yF5$c$c$a$a */
                /* loaded from: classes4.dex */
                public static final class C30510a extends ContinuationImpl {

                    /* renamed from: h */
                    public /* synthetic */ Object f119206h;

                    /* renamed from: i */
                    public int f119207i;

                    /* renamed from: j */
                    public Object f119208j;

                    public C30510a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f119206h = obj;
                        this.f119207i |= Integer.MIN_VALUE;
                        return C30509a.this.emit(null, this);
                    }
                }

                public C30509a(InterfaceC33198Gu1 interfaceC33198Gu1, C52094yF5 c52094yF5) {
                    this.f119204b = interfaceC33198Gu1;
                    this.f119205c = c52094yF5;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C30510a c30510a;
                    Object obj2;
                    Object coroutine_suspended;
                    int i;
                    String str;
                    InterfaceC33198Gu1 interfaceC33198Gu1;
                    if (continuation instanceof C30510a) {
                        c30510a = (C30510a) continuation;
                        int i2 = c30510a.f119207i;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c30510a.f119207i = i2 - Integer.MIN_VALUE;
                            obj2 = c30510a.f119206h;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c30510a.f119207i;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        ResultKt.throwOnFailure(obj2);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC33198Gu1 = (InterfaceC33198Gu1) c30510a.f119208j;
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu12 = this.f119204b;
                                SmartlockSolebeNotificationResponse smartlockSolebeNotificationResponse = (SmartlockSolebeNotificationResponse) obj;
                                byte[] m54828e = smartlockSolebeNotificationResponse.m54828e();
                                if (m54828e != null) {
                                    str = C49130tF5.m12552k(m54828e);
                                } else {
                                    str = null;
                                }
                                C41318g46.m40163a("smartlock solebe response: " + str, new Object[0]);
                                InterfaceC42042hI5 interfaceC42042hI5 = this.f119205c.f119181n;
                                String m14511d = this.f119205c.f119183p.m14511d();
                                C52094yF5 c52094yF5 = this.f119205c;
                                byte[] m54828e2 = smartlockSolebeNotificationResponse.m54828e();
                                Intrinsics.checkNotNull(m54828e2);
                                AbstractC23442F<NokelockResponse> m33150P = interfaceC42042hI5.m36546e(new NokelockMessage(m14511d, c52094yF5.m3762W(m54828e2))).m33150P(new DK5.C1446a(C30511d.f119210g));
                                Intrinsics.checkNotNullExpressionValue(m33150P, "smartLockClient.handleNo…          }\n            }");
                                c30510a.f119208j = interfaceC33198Gu12;
                                c30510a.f119207i = 1;
                                Object m25303a = C45199md5.m25303a(m33150P, c30510a);
                                if (m25303a == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = m25303a;
                                interfaceC33198Gu1 = interfaceC33198Gu12;
                            }
                            c30510a.f119208j = null;
                            c30510a.f119207i = 2;
                            if (interfaceC33198Gu1.emit(obj2, c30510a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c30510a = new C30510a(continuation);
                    obj2 = c30510a.f119206h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c30510a.f119207i;
                    if (i == 0) {
                    }
                    c30510a.f119208j = null;
                    c30510a.f119207i = 2;
                    if (interfaceC33198Gu1.emit(obj2, c30510a) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public C30508c(InterfaceC32730Eu1 interfaceC32730Eu1, C52094yF5 c52094yF5) {
                this.f119202b = interfaceC32730Eu1;
                this.f119203c = c52094yF5;
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super NokelockResponse> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = this.f119202b.collect(new C30509a(interfaceC33198Gu1, this.f119203c), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: yF5$c$d */
        /* loaded from: classes4.dex */
        public static final class C30511d extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends NokelockResponse>> {

            /* renamed from: g */
            public static final C30511d f119210g = new C30511d();

            public C30511d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends NokelockResponse> invoke(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if ((throwable instanceof RetrofitException) && ((RetrofitException) throwable).m53927c().m103943b() == 400) {
                    return AbstractC23442F.m33158H(new NokelockResponse(NokelockResponseType.UNKNOWN, WireNokelockUnknownData.INSTANCE));
                }
                return AbstractC23442F.m33100x(throwable);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\u008a@"}, m28432d2 = {"Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "response", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback$initialize$3", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: yF5$c$e */
        /* loaded from: classes4.dex */
        public static final class C30512e extends SuspendLambda implements Function2<NokelockResponse, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f119211h;

            /* renamed from: i */
            public /* synthetic */ Object f119212i;

            /* renamed from: j */
            public final /* synthetic */ C52094yF5 f119213j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30512e(C52094yF5 c52094yF5, Continuation<? super C30512e> continuation) {
                super(2, continuation);
                this.f119213j = c52094yF5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C30512e c30512e = new C30512e(this.f119213j, continuation);
                c30512e.f119212i = obj;
                return c30512e;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(NokelockResponse nokelockResponse, Continuation<? super Unit> continuation) {
                return ((C30512e) create(nokelockResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f119211h == 0) {
                    ResultKt.throwOnFailure(obj);
                    NokelockResponse response = (NokelockResponse) this.f119212i;
                    if (response.getType() == NokelockResponseType.UNKNOWN) {
                        return Unit.INSTANCE;
                    }
                    C52094yF5 c52094yF5 = this.f119213j;
                    Intrinsics.checkNotNullExpressionValue(response, "response");
                    this.f119213j.m79043R().mo10357b(c52094yF5.m3750i0(response, (C50953wK5) this.f119213j.m79043R().getValue()));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m28432d2 = {"LGu1;", "Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "", "exception", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$SmartlockSolebeGattCallback$initialize$4", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: yF5$c$f */
        /* loaded from: classes4.dex */
        public static final class C30513f extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super NokelockResponse>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f119214h;

            /* renamed from: i */
            public /* synthetic */ Object f119215i;

            /* renamed from: j */
            public final /* synthetic */ C52094yF5 f119216j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30513f(C52094yF5 c52094yF5, Continuation<? super C30513f> continuation) {
                super(3, continuation);
                this.f119216j = c52094yF5;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: e */
            public final Object invoke(InterfaceC33198Gu1<? super NokelockResponse> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
                C30513f c30513f = new C30513f(this.f119216j, continuation);
                c30513f.f119215i = th;
                return c30513f.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List plus;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f119214h == 0) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.f119215i;
                    BX2 m79043R = this.f119216j.m79043R();
                    plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) this.f119216j.m79043R().getValue()).m6985e()), EnumC52732zK5.EXCEPTION);
                    m79043R.mo10357b(C50953wK5.copy$default((C50953wK5) this.f119216j.m79043R().getValue(), plus, null, null, null, null, null, th, 62, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C30500c() {
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: S2 */
        public boolean mo3749S2(BluetoothGatt gatt) {
            UUID uuid;
            UUID uuid2;
            UUID uuid3;
            Intrinsics.checkNotNullParameter(gatt, "gatt");
            uuid = DK5.f5528a;
            BluetoothGattService service = gatt.getService(uuid);
            if (service != null) {
                C52094yF5 c52094yF5 = C52094yF5.this;
                uuid2 = DK5.f5529b;
                c52094yF5.f119185r = service.getCharacteristic(uuid2);
                uuid3 = DK5.f5530c;
                c52094yF5.f119186s = service.getCharacteristic(uuid3);
            }
            if (C52094yF5.this.f119185r != null && C52094yF5.this.f119186s != null) {
                return true;
            }
            return false;
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: c5 */
        public void mo3748c5() {
            C52094yF5.this.f119185r = null;
            C52094yF5.this.f119186s = null;
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: o2 */
        public void mo3747o2() {
            super.mo3747o2();
            C52094yF5 c52094yF5 = C52094yF5.this;
            C32636Ej6 m5226M = c52094yF5.m5226M(c52094yF5.f119186s);
            Intrinsics.checkNotNullExpressionValue(m5226M, "setNotificationCallback(notifyCharacteristic)");
            C36708Vu1.m79279I(C36708Vu1.m79280H(C36708Vu1.m79265f(C36708Vu1.m79276L(C36708Vu1.m79280H(new C30508c(new C30505b(C36708Vu1.m79266e(new C30501a(m5226M, null))), C52094yF5.this), T41.m84377b()), new C30512e(C52094yF5.this, null)), new C30513f(C52094yF5.this, null)), T41.m84376c()), C52094yF5.this.f119182o);
            C52094yF5 c52094yF52 = C52094yF5.this;
            c52094yF52.m5215z(c52094yF52.f119186s).mo22507k();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yF5$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C30514d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NokelockResponseType.values().length];
            try {
                iArr[NokelockResponseType.TOKEN_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NokelockResponseType.UNLOCK_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NokelockResponseType.LOCKING_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NokelockResponseType.STATE_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NokelockResponseType.INSERTED_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NokelockResponseType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$launchRequestWithCatch$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {330}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$e */
    /* loaded from: classes4.dex */
    public static final class C30515e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119217h;

        /* renamed from: i */
        public /* synthetic */ Object f119218i;

        /* renamed from: j */
        public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f119219j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30515e(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C30515e> continuation) {
            super(2, continuation);
            this.f119219j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30515e c30515e = new C30515e(this.f119219j, continuation);
            c30515e.f119218i = obj;
            return c30515e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30515e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119217h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function2<ZC0, Continuation<? super Unit>, Object> function2 = this.f119219j;
                this.f119217h = 1;
                if (function2.invoke((ZC0) this.f119218i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestState$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {419}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$f */
    /* loaded from: classes4.dex */
    public static final class C30516f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119220h;

        public C30516f(Continuation<? super C30516f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30516f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30516f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            String m114094b;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119220h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                BK5 m6984f = ((C50953wK5) C52094yF5.this.m79043R().getValue()).m6984f();
                if (m6984f != null && (m114094b = m6984f.m114094b()) != null) {
                    byte[] m3761X = C52094yF5.this.m3761X(m114094b);
                    String m12552k = C49130tF5.m12552k(m3761X);
                    C41318g46.m40163a("writing ble state command " + m12552k, new Object[0]);
                    C52094yF5 c52094yF5 = C52094yF5.this;
                    C26613D0 m22633W = c52094yF5.m5222Q(c52094yF5.f119185r, m3761X, 2).m22633W();
                    Intrinsics.checkNotNullExpressionValue(m22633W, "writeCharacteristic(\n   …\n      )\n        .split()");
                    this.f119220h = 1;
                    if (C42643iJ4.m34230b(m22633W, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new NullPointerException("A valid token response was not present when attempting to request lock state");
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* renamed from: yF5$g */
    /* loaded from: classes4.dex */
    public static final class C30517g implements InterfaceC32730Eu1<C50953wK5> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f119222b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n1#1,222:1\n21#2:223\n22#2:225\n401#3:224\n*E\n"})
        /* renamed from: yF5$g$a */
        /* loaded from: classes4.dex */
        public static final class C30518a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f119223b;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestStateFlow$$inlined$filter$1$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: yF5$g$a$a */
            /* loaded from: classes4.dex */
            public static final class C30519a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f119224h;

                /* renamed from: i */
                public int f119225i;

                public C30519a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f119224h = obj;
                    this.f119225i |= Integer.MIN_VALUE;
                    return C30518a.this.emit(null, this);
                }
            }

            public C30518a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f119223b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C30519a c30519a;
                Object coroutine_suspended;
                int i;
                boolean z;
                if (continuation instanceof C30519a) {
                    c30519a = (C30519a) continuation;
                    int i2 = c30519a.f119225i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c30519a.f119225i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c30519a.f119224h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c30519a.f119225i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f119223b;
                            if (((C50953wK5) obj).m6987c() == EnumC52732zK5.LOCK_STATE_RESPONSE_RECEIVED) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c30519a.f119225i = 1;
                                if (interfaceC33198Gu1.emit(obj, c30519a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c30519a = new C30519a(continuation);
                Object obj22 = c30519a.f119224h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c30519a.f119225i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C30517g(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f119222b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f119222b.collect(new C30518a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "LwK5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestStateFlow$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$h */
    /* loaded from: classes4.dex */
    public static final class C30520h extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super C50953wK5>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119227h;

        public C30520h(Continuation<? super C30520h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30520h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C30520h) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f119227h == 0) {
                ResultKt.throwOnFailure(obj);
                C52094yF5.this.m3758a0();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestToken$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {363}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$i */
    /* loaded from: classes4.dex */
    public static final class C30521i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119229h;

        public C30521i(Continuation<? super C30521i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30521i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30521i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            byte[] bArr;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119229h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("writing request to device to request token response", new Object[0]);
                C52094yF5 c52094yF5 = C52094yF5.this;
                String m3760Y = c52094yF5.m3760Y(c52094yF5.f119183p);
                if (m3760Y != null) {
                    bArr = C52094yF5.this.m3761X(m3760Y);
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    String m12552k = C49130tF5.m12552k(bArr);
                    C41318g46.m40163a("writing ble token command " + m12552k, new Object[0]);
                    C52094yF5 c52094yF52 = C52094yF5.this;
                    C26613D0 m22633W = c52094yF52.m5222Q(c52094yF52.f119185r, bArr, 2).m22633W();
                    Intrinsics.checkNotNullExpressionValue(m22633W, "writeCharacteristic(\n   …\n      )\n        .split()");
                    this.f119229h = 1;
                    if (C42643iJ4.m34230b(m22633W, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new NullPointerException("No next token request to try within requestToken");
                }
            }
            C41318g46.m40163a("token request successfully sent.", new Object[0]);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestToken$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {370}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nSmartlockSolebeDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager$requestToken$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,592:1\n1774#2,4:593\n*S KotlinDebug\n*F\n+ 1 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager$requestToken$2\n*L\n376#1:593,4\n*E\n"})
    /* renamed from: yF5$j */
    /* loaded from: classes4.dex */
    public static final class C30522j extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119231h;

        public C30522j(Continuation<? super C30522j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30522j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30522j) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            boolean z;
            int coerceAtLeast;
            int i;
            boolean z2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f119231h;
            int i3 = 1;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("delaying for 2 seconds before checking for token response from device", new Object[0]);
                this.f119231h = 1;
                if (C48120rZ0.m15768a(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List<EnumC52732zK5> m6985e = ((C50953wK5) C52094yF5.this.m79043R().getValue()).m6985e();
            C41318g46.m40163a("stateHistory " + m6985e, new Object[0]);
            int lastIndexOf = m6985e.lastIndexOf(EnumC52732zK5.TOKEN_RESPONSE_RECEIVED);
            int lastIndexOf2 = m6985e.lastIndexOf(EnumC52732zK5.TOKEN_REQUESTED);
            if (lastIndexOf != -1 && lastIndexOf > lastIndexOf2) {
                z = true;
            } else {
                z = false;
            }
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(lastIndexOf, 0);
            List<EnumC52732zK5> subList = m6985e.subList(coerceAtLeast, m6985e.size());
            if ((subList instanceof Collection) && subList.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (EnumC52732zK5 enumC52732zK5 : subList) {
                    if (enumC52732zK5 == EnumC52732zK5.TOKEN_REQUESTED) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            List<String> m14503l = C52094yF5.this.f119183p.m14503l();
            if (m14503l != null) {
                i3 = RangesKt___RangesKt.coerceAtLeast(m14503l.size(), 1);
            }
            C41318g46.m40163a("lastIndexOfTokenReceived: " + lastIndexOf, new Object[0]);
            C41318g46.m40163a("lastIndexOfTokenRequested: " + lastIndexOf2, new Object[0]);
            C41318g46.m40163a("tokenReceived: " + z, new Object[0]);
            C41318g46.m40163a("tokenRequestAttempts: " + i, new Object[0]);
            C41318g46.m40163a("maxTokenRequests: " + i3, new Object[0]);
            if (!z) {
                if (i < i3) {
                    C41318g46.m40163a("smartlock token request timeout reached but no token response received, retrying", new Object[0]);
                    C52094yF5.this.m3756c0();
                } else {
                    C41318g46.m40163a("smartlock token request timeout reached but no remaining tokens left to try, throwing exception", new Object[0]);
                    throw new Exception("Lock did not respond to any token request attempts, unable to proceed.");
                }
            } else {
                C41318g46.m40163a("smartlock token request timeout reached but token already received, not retrying.", new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* renamed from: yF5$k */
    /* loaded from: classes4.dex */
    public static final class C30523k implements InterfaceC32730Eu1<C50953wK5> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f119233b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n1#1,222:1\n21#2:223\n22#2:225\n340#3:224\n*E\n"})
        /* renamed from: yF5$k$a */
        /* loaded from: classes4.dex */
        public static final class C30524a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f119234b;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestTokenFlow$$inlined$filter$1$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: yF5$k$a$a */
            /* loaded from: classes4.dex */
            public static final class C30525a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f119235h;

                /* renamed from: i */
                public int f119236i;

                public C30525a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f119235h = obj;
                    this.f119236i |= Integer.MIN_VALUE;
                    return C30524a.this.emit(null, this);
                }
            }

            public C30524a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f119234b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C30525a c30525a;
                Object coroutine_suspended;
                int i;
                boolean z;
                if (continuation instanceof C30525a) {
                    c30525a = (C30525a) continuation;
                    int i2 = c30525a.f119236i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c30525a.f119236i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c30525a.f119235h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c30525a.f119236i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f119234b;
                            if (((C50953wK5) obj).m6987c() == EnumC52732zK5.TOKEN_RESPONSE_RECEIVED) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c30525a.f119236i = 1;
                                if (interfaceC33198Gu1.emit(obj, c30525a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c30525a = new C30525a(continuation);
                Object obj22 = c30525a.f119235h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c30525a.f119236i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C30523k(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f119233b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f119233b.collect(new C30524a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "throwable", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yF5$l */
    /* loaded from: classes4.dex */
    public static final class C30526l extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: g */
        public static final C30526l f119238g = new C30526l();

        public C30526l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable th) {
            return Boolean.valueOf(th instanceof RequestFailedException);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "LwK5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestTokenFlow$3", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$m */
    /* loaded from: classes4.dex */
    public static final class C30527m extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super C50953wK5>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119239h;

        public C30527m(Continuation<? super C30527m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30527m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C30527m) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f119239h == 0) {
                ResultKt.throwOnFailure(obj);
                C52094yF5.this.m3756c0();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestUnlock$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {450}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$n */
    /* loaded from: classes4.dex */
    public static final class C30528n extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119241h;

        /* renamed from: j */
        public final /* synthetic */ String f119243j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30528n(String str, Continuation<? super C30528n> continuation) {
            super(2, continuation);
            this.f119243j = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30528n(this.f119243j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30528n) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119241h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                byte[] m3761X = C52094yF5.this.m3761X(this.f119243j);
                String m12552k = C49130tF5.m12552k(m3761X);
                C41318g46.m40163a("writing ble unlock command " + m12552k, new Object[0]);
                C52094yF5 c52094yF5 = C52094yF5.this;
                C26613D0 m22633W = c52094yF5.m5222Q(c52094yF5.f119185r, m3761X, 2).m22633W();
                Intrinsics.checkNotNullExpressionValue(m22633W, "writeCharacteristic(\n   …\n      )\n        .split()");
                this.f119241h = 1;
                if (C42643iJ4.m34230b(m22633W, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* renamed from: yF5$o */
    /* loaded from: classes4.dex */
    public static final class C30529o implements InterfaceC32730Eu1<C50953wK5> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f119244b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n1#1,222:1\n21#2:223\n22#2:225\n426#3:224\n*E\n"})
        /* renamed from: yF5$o$a */
        /* loaded from: classes4.dex */
        public static final class C30530a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f119245b;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestUnlockFlow$$inlined$filter$1$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: yF5$o$a$a */
            /* loaded from: classes4.dex */
            public static final class C30531a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f119246h;

                /* renamed from: i */
                public int f119247i;

                public C30531a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f119246h = obj;
                    this.f119247i |= Integer.MIN_VALUE;
                    return C30530a.this.emit(null, this);
                }
            }

            public C30530a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f119245b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C30531a c30531a;
                Object coroutine_suspended;
                int i;
                boolean z;
                if (continuation instanceof C30531a) {
                    c30531a = (C30531a) continuation;
                    int i2 = c30531a.f119247i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c30531a.f119247i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c30531a.f119246h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c30531a.f119247i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f119245b;
                            C50953wK5 c50953wK5 = (C50953wK5) obj;
                            if (c50953wK5.m6987c() != EnumC52732zK5.UNLOCK_RESPONSE_RECEIVED && c50953wK5.m6987c() != EnumC52732zK5.LOCK_RESPONSE_RECEIVED) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                c30531a.f119247i = 1;
                                if (interfaceC33198Gu1.emit(obj, c30531a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c30531a = new C30531a(continuation);
                Object obj22 = c30531a.f119246h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c30531a.f119247i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C30529o(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f119244b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f119244b.collect(new C30530a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "LwK5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$requestUnlockFlow$2", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$p */
    /* loaded from: classes4.dex */
    public static final class C30532p extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super C50953wK5>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119249h;

        public C30532p(Continuation<? super C30532p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30532p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C30532p) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f119249h == 0) {
                ResultKt.throwOnFailure(obj);
                C52094yF5.this.m3754e0();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, m28432d2 = {"yF5$q", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "LTC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "u", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n1#1,110:1\n320#2,7:111\n*E\n"})
    /* renamed from: yF5$q */
    /* loaded from: classes4.dex */
    public static final class C30533q extends AbstractCoroutineContextElement implements TC0 {

        /* renamed from: b */
        public final /* synthetic */ C52094yF5 f119251b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30533q(TC0.C7679a c7679a, C52094yF5 c52094yF5) {
            super(c7679a);
            this.f119251b = c52094yF5;
        }

        @Override // p000.TC0
        /* renamed from: u */
        public void mo3742u(CoroutineContext coroutineContext, Throwable th) {
            List plus;
            BX2 m79043R = this.f119251b.m79043R();
            C50953wK5 c50953wK5 = (C50953wK5) this.f119251b.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) this.f119251b.m79043R().getValue()).m6985e()), EnumC52732zK5.EXCEPTION);
            m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, th, 62, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$throwOnException$$inlined$flatMapLatest$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n1#1,215:1\n583#2,5:216\n*E\n"})
    /* renamed from: yF5$r */
    /* loaded from: classes4.dex */
    public static final class C30534r extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super C50953wK5>, C50953wK5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119252h;

        /* renamed from: i */
        public /* synthetic */ Object f119253i;

        /* renamed from: j */
        public /* synthetic */ Object f119254j;

        /* renamed from: k */
        public final /* synthetic */ Function1 f119255k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30534r(Continuation continuation, Function1 function1) {
            super(3, continuation);
            this.f119255k = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, C50953wK5 c50953wK5, Continuation<? super Unit> continuation) {
            C30534r c30534r = new C30534r(continuation, this.f119255k);
            c30534r.f119253i = interfaceC33198Gu1;
            c30534r.f119254j = c50953wK5;
            return c30534r.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119252h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC33198Gu1 interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f119253i;
                C50953wK5 c50953wK5 = (C50953wK5) this.f119254j;
                Throwable m6988b = c50953wK5.m6988b();
                if (c50953wK5.m6987c() == EnumC52732zK5.EXCEPTION && m6988b != null) {
                    Function1 function1 = this.f119255k;
                    boolean z = false;
                    if (function1 != null && ((Boolean) function1.invoke(m6988b)).booleanValue()) {
                        z = true;
                    }
                    if (!z) {
                        throw m6988b;
                    }
                }
                InterfaceC32730Eu1 m79281G = C36708Vu1.m79281G(c50953wK5);
                this.f119252h = 1;
                if (C36708Vu1.m79252s(interfaceC33198Gu1, m79281G, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "throwable", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yF5$s */
    /* loaded from: classes4.dex */
    public static final class C30535s extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: g */
        public static final C30535s f119256g = new C30535s();

        public C30535s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable th) {
            return Boolean.valueOf((th instanceof RequestFailedException) && ((RequestFailedException) th).m22613a() == 13);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$unlock$$inlined$flatMapLatest$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,215:1\n177#2,3:216\n190#3:219\n*S KotlinDebug\n*F\n+ 1 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n179#1:219\n*E\n"})
    /* renamed from: yF5$t */
    /* loaded from: classes4.dex */
    public static final class C30536t extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super C50953wK5>, C50953wK5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119257h;

        /* renamed from: i */
        public /* synthetic */ Object f119258i;

        /* renamed from: j */
        public /* synthetic */ Object f119259j;

        /* renamed from: k */
        public final /* synthetic */ C52094yF5 f119260k;

        /* renamed from: l */
        public final /* synthetic */ boolean f119261l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30536t(Continuation continuation, C52094yF5 c52094yF5, boolean z) {
            super(3, continuation);
            this.f119260k = c52094yF5;
            this.f119261l = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, C50953wK5 c50953wK5, Continuation<? super Unit> continuation) {
            C30536t c30536t = new C30536t(continuation, this.f119260k, this.f119261l);
            c30536t.f119258i = interfaceC33198Gu1;
            c30536t.f119259j = c50953wK5;
            return c30536t.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119257h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("received token flow response: " + ((C50953wK5) this.f119259j), new Object[0]);
                InterfaceC32730Eu1 m79271Q = C36708Vu1.m79271Q(this.f119260k.m3757b0(), new C30538v(null, this.f119260k, this.f119261l));
                this.f119257h = 1;
                if (C36708Vu1.m79252s((InterfaceC33198Gu1) this.f119258i, m79271Q, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"LwK5;", MessageExtension.FIELD_DATA, "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$unlock$1$1$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yF5$u */
    /* loaded from: classes4.dex */
    public static final class C30537u extends SuspendLambda implements Function2<C50953wK5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119262h;

        /* renamed from: i */
        public /* synthetic */ Object f119263i;

        /* renamed from: j */
        public final /* synthetic */ boolean f119264j;

        /* renamed from: k */
        public final /* synthetic */ C52094yF5 f119265k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30537u(boolean z, C52094yF5 c52094yF5, Continuation<? super C30537u> continuation) {
            super(2, continuation);
            this.f119264j = z;
            this.f119265k = c52094yF5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30537u c30537u = new C30537u(this.f119264j, this.f119265k, continuation);
            c30537u.f119263i = obj;
            return c30537u;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(C50953wK5 c50953wK5, Continuation<? super Unit> continuation) {
            return ((C30537u) create(c50953wK5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f119262h == 0) {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("received unlock flow response: " + ((C50953wK5) this.f119263i), new Object[0]);
                if (this.f119264j) {
                    C41318g46.m40163a("disconnectOnSuccess was true, disconnecting now", new Object[0]);
                    this.f119265k.m5217x().mo22507k();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockSolebeDeviceManager$unlock$lambda$1$$inlined$flatMapLatest$1", m28418f = "SmartlockSolebeDeviceManager.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 SmartlockSolebeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockSolebeDeviceManager\n*L\n1#1,215:1\n180#2,3:216\n*E\n"})
    /* renamed from: yF5$v */
    /* loaded from: classes4.dex */
    public static final class C30538v extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super C50953wK5>, C50953wK5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f119266h;

        /* renamed from: i */
        public /* synthetic */ Object f119267i;

        /* renamed from: j */
        public /* synthetic */ Object f119268j;

        /* renamed from: k */
        public final /* synthetic */ C52094yF5 f119269k;

        /* renamed from: l */
        public final /* synthetic */ boolean f119270l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30538v(Continuation continuation, C52094yF5 c52094yF5, boolean z) {
            super(3, continuation);
            this.f119269k = c52094yF5;
            this.f119270l = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super C50953wK5> interfaceC33198Gu1, C50953wK5 c50953wK5, Continuation<? super Unit> continuation) {
            C30538v c30538v = new C30538v(continuation, this.f119269k, this.f119270l);
            c30538v.f119267i = interfaceC33198Gu1;
            c30538v.f119268j = c50953wK5;
            return c30538v.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f119266h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("received state flow response: " + ((C50953wK5) this.f119268j), new Object[0]);
                InterfaceC32730Eu1 m79276L = C36708Vu1.m79276L(this.f119269k.m3753f0(), new C30537u(this.f119270l, this.f119269k, null));
                this.f119266h = 1;
                if (C36708Vu1.m79252s((InterfaceC33198Gu1) this.f119267i, m79276L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52094yF5(Context context, InterfaceC42042hI5 smartLockClient, ZC0 scope, C48528sE5 smartLock, boolean z) {
        super(scope, context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smartLockClient, "smartLockClient");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(smartLock, "smartLock");
        this.f119181n = smartLockClient;
        this.f119182o = scope;
        this.f119183p = smartLock;
        this.f119184q = z;
        this.f119187t = new C30533q(TC0.f34895N, this);
        this.f119188u = new C50303vE2<>(5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h0 */
    public static /* synthetic */ InterfaceC32730Eu1 m3751h0(C52094yF5 c52094yF5, GX2 gx2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = C30535s.f119256g;
        }
        return c52094yF5.m3752g0(gx2, function1);
    }

    @Override // p000.AbstractC30179xU
    /* renamed from: C */
    public AbstractC30179xU.AbstractC30181b mo3768C() {
        return new C30500c();
    }

    @Override // p000.AbstractC30179xU
    /* renamed from: D */
    public int mo3767D() {
        return 2;
    }

    @Override // p000.AbstractC30179xU
    /* renamed from: H */
    public void mo3766H(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C41318g46.m40155i(i, message, new Object[0]);
    }

    @Override // p000.AbstractC8883Vy
    /* renamed from: T */
    public void mo3765T() {
        super.mo3765T();
        C41318g46.m40163a("setting gatt callbacks now", new Object[0]);
        mo5227L(new C30499b());
    }

    @Override // p000.AbstractC49714uE5
    /* renamed from: U */
    public AbstractC23461c mo3764U(boolean z) {
        C41318g46.m40163a("calling unlock in smartlock solebe device manager", new Object[0]);
        AbstractC23461c m33159G = C34930Oe5.m91745d(C36708Vu1.m79271Q(m3755d0(), new C30536t(null, this, z)), null, 1, null).firstOrError().m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "requestTokenFlow()\n     …()\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.AbstractC8883Vy
    /* renamed from: V */
    public C50953wK5 dataInitializer() {
        return new C50953wK5(null, null, null, null, null, null, null, 127, null);
    }

    /* renamed from: W */
    public final String m3762W(byte[] bArr) {
        String m108172e = C2029Ey.m108181b().m108172e(bArr);
        Intrinsics.checkNotNullExpressionValue(m108172e, "getEncoder().encodeToString(this)");
        return m108172e;
    }

    /* renamed from: X */
    public final byte[] m3761X(String str) {
        byte[] m108180a = C2029Ey.m108182a().m108180a(str);
        Intrinsics.checkNotNullExpressionValue(m108180a, "getDecoder().decode(this)");
        return m108180a;
    }

    /* renamed from: Y */
    public final String m3760Y(C48528sE5 c48528sE5) {
        String str;
        if (!this.f119184q && c48528sE5.m14504k() != null) {
            str = c48528sE5.m14504k();
        } else {
            Integer m8993d = this.f119188u.m8993d(c48528sE5.m14511d());
            if (m8993d == null) {
                m8993d = 0;
            }
            int intValue = m8993d.intValue();
            List<String> m14503l = c48528sE5.m14503l();
            if (m14503l != null) {
                this.f119188u.m8992e(c48528sE5.m14511d(), Integer.valueOf(intValue + 1));
                str = m14503l.get(intValue % m14503l.size());
            } else {
                str = null;
            }
        }
        C41318g46.m40163a("Using " + str + " as the next token to try in a token request to lock", new Object[0]);
        return str;
    }

    /* renamed from: Z */
    public final InterfaceC52943zh2 m3759Z(ZC0 zc0, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block) {
        InterfaceC45344ms0 m95045b;
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(zc0, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        m95045b = C34486Mh2.m95045b(null, 1, null);
        m73800d = Z30.m73800d(zc0, m95045b.plus(this.f119187t), null, new C30515e(block, null), 2, null);
        return m73800d;
    }

    /* renamed from: a0 */
    public final void m3758a0() {
        List plus;
        if (this.f119185r == null) {
            return;
        }
        BX2 m79043R = m79043R();
        C50953wK5 c50953wK5 = (C50953wK5) m79043R().getValue();
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) m79043R().getValue()).m6985e()), EnumC52732zK5.LOCK_STATE_REQUESTED);
        m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, null, 126, null));
        m3759Z(this.f119182o, new C30516f(null));
    }

    /* renamed from: b0 */
    public final InterfaceC32730Eu1<C50953wK5> m3757b0() {
        return C36708Vu1.m79275M(new C30517g(m3751h0(this, m79043R(), null, 1, null)), new C30520h(null));
    }

    /* renamed from: c0 */
    public final void m3756c0() {
        List plus;
        if (this.f119185r == null) {
            return;
        }
        BX2 m79043R = m79043R();
        C50953wK5 c50953wK5 = (C50953wK5) m79043R().getValue();
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) m79043R().getValue()).m6985e()), EnumC52732zK5.TOKEN_REQUESTED);
        m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, null, 126, null));
        m3759Z(this.f119182o, new C30521i(null));
        m3759Z(this.f119182o, new C30522j(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d0 */
    public final InterfaceC32730Eu1<C50953wK5> m3755d0() {
        return C36708Vu1.m79275M(new C30523k(m3752g0(m79043R(), C30526l.f119238g)), new C30527m(null));
    }

    /* renamed from: e0 */
    public final void m3754e0() {
        List plus;
        List plus2;
        String m114093c;
        if (this.f119185r == null) {
            return;
        }
        BX2 m79043R = m79043R();
        C50953wK5 c50953wK5 = (C50953wK5) m79043R().getValue();
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) m79043R().getValue()).m6985e()), EnumC52732zK5.UNLOCK_REQUESTED);
        m79043R.mo10357b(C50953wK5.copy$default(c50953wK5, plus, null, null, null, null, null, null, 126, null));
        BK5 m6984f = ((C50953wK5) m79043R().getValue()).m6984f();
        if (m6984f != null && (m114093c = m6984f.m114093c()) != null) {
            m3759Z(this.f119182o, new C30528n(m114093c, null));
            return;
        }
        Unit unit = Unit.INSTANCE;
        BX2 m79043R2 = m79043R();
        C50953wK5 c50953wK52 = (C50953wK5) m79043R().getValue();
        plus2 = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) ((C50953wK5) m79043R().getValue()).m6985e()), EnumC52732zK5.EXCEPTION);
        m79043R2.mo10357b(C50953wK5.copy$default(c50953wK52, plus2, null, null, null, null, null, new NullPointerException("A valid token response was not present when attempting to request lock state"), 62, null));
    }

    /* renamed from: f0 */
    public final InterfaceC32730Eu1<C50953wK5> m3753f0() {
        return C36708Vu1.m79275M(new C30529o(m3751h0(this, m79043R(), null, 1, null)), new C30532p(null));
    }

    /* renamed from: g0 */
    public final InterfaceC32730Eu1<C50953wK5> m3752g0(GX2<C50953wK5> gx2, Function1<? super Throwable, Boolean> function1) {
        return C36708Vu1.m79271Q(gx2, new C30534r(null, function1));
    }

    /* renamed from: i0 */
    public final C50953wK5 m3750i0(NokelockResponse nokelockResponse, C50953wK5 c50953wK5) {
        List plus;
        List plus2;
        List plus3;
        List plus4;
        List plus5;
        List plus6;
        WireNokelockTokenResponseData wireNokelockTokenResponseData = null;
        WireNokelockInsertedData wireNokelockInsertedData = null;
        WireNokelockStateData wireNokelockStateData = null;
        WireNokelockLockingData wireNokelockLockingData = null;
        WireNokelockUnlockData wireNokelockUnlockData = null;
        switch (C30514d.$EnumSwitchMapping$0[nokelockResponse.getType().ordinal()]) {
            case 1:
                WireNokelockResponseData data = nokelockResponse.getData();
                if (data instanceof WireNokelockTokenResponseData) {
                    wireNokelockTokenResponseData = (WireNokelockTokenResponseData) data;
                }
                if (wireNokelockTokenResponseData == null) {
                    return c50953wK5;
                }
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) c50953wK5.m6985e()), EnumC52732zK5.TOKEN_RESPONSE_RECEIVED);
                return C50953wK5.copy$default(c50953wK5, plus, new BK5(wireNokelockTokenResponseData.getStateRequest(), wireNokelockTokenResponseData.getUnlockRequest(), wireNokelockTokenResponseData.getLockingRequest()), null, null, null, null, null, 124, null);
            case 2:
                WireNokelockResponseData data2 = nokelockResponse.getData();
                if (data2 instanceof WireNokelockUnlockData) {
                    wireNokelockUnlockData = (WireNokelockUnlockData) data2;
                }
                if (wireNokelockUnlockData == null) {
                    return c50953wK5;
                }
                plus2 = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) c50953wK5.m6985e()), EnumC52732zK5.UNLOCK_RESPONSE_RECEIVED);
                return C50953wK5.copy$default(c50953wK5, plus2, null, null, new CK5(wireNokelockUnlockData.getSuccess()), null, null, null, 118, null);
            case 3:
                WireNokelockResponseData data3 = nokelockResponse.getData();
                if (data3 instanceof WireNokelockLockingData) {
                    wireNokelockLockingData = (WireNokelockLockingData) data3;
                }
                if (wireNokelockLockingData == null) {
                    return c50953wK5;
                }
                plus3 = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) c50953wK5.m6985e()), EnumC52732zK5.LOCK_RESPONSE_RECEIVED);
                return C50953wK5.copy$default(c50953wK5, plus3, null, null, null, new C52139yK5(wireNokelockLockingData.getSuccess()), null, null, 110, null);
            case 4:
                WireNokelockResponseData data4 = nokelockResponse.getData();
                if (data4 instanceof WireNokelockStateData) {
                    wireNokelockStateData = (WireNokelockStateData) data4;
                }
                if (wireNokelockStateData == null) {
                    return c50953wK5;
                }
                plus4 = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) c50953wK5.m6985e()), EnumC52732zK5.LOCK_STATE_RESPONSE_RECEIVED);
                return C50953wK5.copy$default(c50953wK5, plus4, null, new AK5(wireNokelockStateData.isLocked()), null, null, null, null, 122, null);
            case 5:
                WireNokelockResponseData data5 = nokelockResponse.getData();
                if (data5 instanceof WireNokelockInsertedData) {
                    wireNokelockInsertedData = (WireNokelockInsertedData) data5;
                }
                if (wireNokelockInsertedData == null) {
                    return c50953wK5;
                }
                plus5 = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) c50953wK5.m6985e()), EnumC52732zK5.LOCK_INSERTED_RESPONSE_RECEIVED);
                return C50953wK5.copy$default(c50953wK5, plus5, null, null, null, null, new C51546xK5(wireNokelockInsertedData.getSuccess()), null, 94, null);
            case 6:
                plus6 = CollectionsKt___CollectionsKt.plus((Collection<? extends EnumC52732zK5>) ((Collection<? extends Object>) c50953wK5.m6985e()), EnumC52732zK5.UNKNOWN);
                return C50953wK5.copy$default(c50953wK5, plus6, null, null, null, null, null, null, 126, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
