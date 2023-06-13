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
import co.bird.android.model.wire.WireNokelockUnlockData;
import co.bird.android.smartlock.impl.SmartlockNokeNotificationResponse;
import co.bird.api.request.NokelockMessage;
import co.bird.api.response.NokelockResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
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
import p000.AbstractC30179xU;
import p000.TC0;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003KLMB7\b\u0007\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010/\u001a\u00020,\u0012\b\b\u0001\u00102\u001a\u00020\u001d\u0012\b\b\u0001\u00105\u001a\u00020\n\u0012\b\b\u0001\u00107\u001a\u00020\u0019¢\u0006\u0004\bH\u0010IJ\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\f\u0010\t\u001a\u00020\u0006*\u00020\u0007H\u0002J\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\nH\u0002J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r*\b\u0012\u0004\u0012\u00020\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J=\u0010$\u001a\u00020#*\u00020\u001d2'\u0010\"\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001e¢\u0006\u0002\b!ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0006\u0010'\u001a\u00020\u0010J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0006\u0010)\u001a\u00020\u0010J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u0006\u0010+\u001a\u00020\u0010R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010$R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, m28432d2 = {"LuF5;", "LuE5;", "LCJ5;", "Lco/bird/api/response/NokelockResponse;", "old", "h0", "", "", "X", "W", "LsE5;", "Y", "LGX2;", "LEu1;", "g0", "V", "", "T", "", "priority", "message", "H", "D", "LxU$b;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "disconnectOnSuccess", "Lio/reactivex/c;", "U", "LZC0;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lzh2;", "Z", "(LZC0;Lkotlin/jvm/functions/Function2;)Lzh2;", "d0", "c0", "b0", "a0", "f0", "e0", "LhI5;", "n", "LhI5;", "smartLockClient", "o", "LZC0;", Action.SCOPE_ATTRIBUTE, "p", "LsE5;", "smartLock", "q", "enableMultipleSmartlockKeys", "Landroid/bluetooth/BluetoothGattCharacteristic;", "r", "Landroid/bluetooth/BluetoothGattCharacteristic;", "writeCharacteristic", "s", "notifyCharacteristic", "LTC0;", "t", "LTC0;", "requestExceptionHandler", "LvE2;", "u", "LvE2;", "currentTokenRequestIndexCache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;LhI5;LZC0;LsE5;Z)V", "v", C17296a.f69688o, "b", "c", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockNokeDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,550:1\n49#2,4:551\n190#3:555\n190#3:576\n20#4:556\n22#4:560\n20#4:561\n22#4:565\n20#4:566\n22#4:570\n20#4:571\n22#4:575\n50#5:557\n55#5:559\n50#5:562\n55#5:564\n50#5:567\n55#5:569\n50#5:572\n55#5:574\n106#6:558\n106#6:563\n106#6:568\n106#6:573\n*S KotlinDebug\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n300#1:551,4\n172#1:555\n540#1:576\n317#1:556\n317#1:560\n375#1:561\n375#1:565\n396#1:566\n396#1:570\n424#1:571\n424#1:575\n317#1:557\n317#1:559\n375#1:562\n375#1:564\n396#1:567\n396#1:569\n424#1:572\n424#1:574\n317#1:558\n375#1:563\n396#1:568\n424#1:573\n*E\n"})
/* renamed from: uF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49723uF5 extends AbstractC49714uE5<CJ5> {

    /* renamed from: v */
    public static final C29124a f112011v = new C29124a(null);

    /* renamed from: n */
    public final InterfaceC42042hI5 f112012n;

    /* renamed from: o */
    public final ZC0 f112013o;

    /* renamed from: p */
    public final C48528sE5 f112014p;

    /* renamed from: q */
    public final boolean f112015q;

    /* renamed from: r */
    public BluetoothGattCharacteristic f112016r;

    /* renamed from: s */
    public BluetoothGattCharacteristic f112017s;

    /* renamed from: t */
    public final TC0 f112018t;

    /* renamed from: u */
    public final C50303vE2<String, Integer> f112019u;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"LuF5$a;", "", "", "ENABLE_BLUETOOTH_TIMEOUT_MS", "J", "", "LEASE_DUE_BUFER_TTL_SECONDS", "I", "POST_SCAN_CONNECTION_DELAY_MS", "SECONDS_BETWEEN_UNLOCK_ATTEMPTS", "SMARTLOCK_TOKEN_REQUEST_TIMEOUT_SECONDS", "<init>", "()V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uF5$a */
    /* loaded from: classes4.dex */
    public static final class C29124a {
        public /* synthetic */ C29124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29124a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u001c"}, m28432d2 = {"LuF5$b;", "LyU;", "Landroid/bluetooth/BluetoothDevice;", "device", "", "c", "b", DateTokenConverter.CONVERTER_KEY, "m", "k", "", "optionalServicesFound", "h", C17296a.f69688o, "j", "", "value", "l", "g", "n", "f", "", "message", "errorCode", "i", "e", "<init>", "(LuF5;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uF5$b */
    /* loaded from: classes4.dex */
    public final class C29125b implements InterfaceC30597yU {
        public C29125b() {
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
            BX2 m79043R = C49723uF5.this.m79043R();
            CJ5 cj5 = (CJ5) C49723uF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) C49723uF5.this.m79043R().getValue()).m112353e()), FJ5.CONNECTED);
            m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: c */
        public void mo3465c(BluetoothDevice device) {
            List plus;
            Intrinsics.checkNotNullParameter(device, "device");
            BX2 m79043R = C49723uF5.this.m79043R();
            CJ5 cj5 = (CJ5) C49723uF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) C49723uF5.this.m79043R().getValue()).m112353e()), FJ5.CONNECTING);
            m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: d */
        public void mo3464d(BluetoothDevice device) {
            List plus;
            Intrinsics.checkNotNullParameter(device, "device");
            BX2 m79043R = C49723uF5.this.m79043R();
            CJ5 cj5 = (CJ5) C49723uF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) C49723uF5.this.m79043R().getValue()).m112353e()), FJ5.DISCONNECTING);
            m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: e */
        public void mo3463e(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            String address = device.getAddress();
            C41318g46.m40163a("SmartlockNokeCallback onDeviceNotSupported called, nothing to do for " + address, new Object[0]);
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
            C41318g46.m40163a("SmartlockNokeCallback Error " + message + " (errorCode: " + i + ")", new Object[0]);
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
            BX2 m79043R = C49723uF5.this.m79043R();
            CJ5 cj5 = (CJ5) C49723uF5.this.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) C49723uF5.this.m79043R().getValue()).m112353e()), FJ5.DISCONNECTED);
            m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, null, 126, null));
        }

        @Override // p000.InterfaceC30597yU
        /* renamed from: n */
        public void mo3454n(BluetoothDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, m28432d2 = {"LuF5$c;", "LxU$b;", "", "o2", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", "S2", "c5", "<init>", "(LuF5;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockNokeDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$SmartlockNokeGattCallback\n+ 2 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,550:1\n73#2:551\n86#2:552\n20#3:553\n22#3:557\n47#3:558\n49#3:562\n50#4:554\n55#4:556\n50#4:559\n55#4:561\n106#5:555\n106#5:560\n*S KotlinDebug\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$SmartlockNokeGattCallback\n*L\n256#1:551\n256#1:552\n257#1:553\n257#1:557\n258#1:558\n258#1:562\n257#1:554\n257#1:556\n258#1:559\n258#1:561\n257#1:555\n258#1:560\n*E\n"})
    /* renamed from: uF5$c */
    /* loaded from: classes4.dex */
    public final class C29126c extends AbstractC30179xU.AbstractC30181b {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "Ln74;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "no.nordicsemi.android.ble.ktx.ValueChangedCallbackExtKt$asValidResponseFlow$1", m28418f = "ValueChangedCallbackExt.kt", m28417i = {}, m28416l = {82}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1\n*L\n1#1,86:1\n*E\n"})
        /* renamed from: uF5$c$a */
        /* loaded from: classes4.dex */
        public static final class C29127a extends SuspendLambda implements Function2<InterfaceC45497n74<? super SmartlockNokeNotificationResponse>, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f112022h;

            /* renamed from: i */
            public /* synthetic */ Object f112023i;

            /* renamed from: j */
            public final /* synthetic */ C32636Ej6 f112024j;

            @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "Landroid/bluetooth/BluetoothDevice;", "device", "Lno/nordicsemi/android/ble/data/Data;", MessageExtension.FIELD_DATA, "", "b", "(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
            /* renamed from: uF5$c$a$a */
            /* loaded from: classes4.dex */
            public static final class C29128a implements QS0 {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC45497n74<SmartlockNokeNotificationResponse> f112025b;

                public C29128a(InterfaceC45497n74 interfaceC45497n74) {
                    this.f112025b = interfaceC45497n74;
                }

                @Override // p000.QS0
                /* renamed from: b */
                public final void mo3746b(BluetoothDevice device, Data data) {
                    Intrinsics.checkNotNullParameter(device, "device");
                    Intrinsics.checkNotNullParameter(data, "data");
                    Object newInstance = SmartlockNokeNotificationResponse.class.newInstance();
                    ProfileReadResponse profileReadResponse = (ProfileReadResponse) newInstance;
                    profileReadResponse.mo3746b(device, data);
                    if (!profileReadResponse.m22627c()) {
                        newInstance = null;
                    }
                    ProfileReadResponse profileReadResponse2 = (ProfileReadResponse) newInstance;
                    if (profileReadResponse2 != null) {
                        this.f112025b.mo2349h(profileReadResponse2);
                    }
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1$2\n*L\n1#1,86:1\n*E\n"})
            /* renamed from: uF5$c$a$b */
            /* loaded from: classes4.dex */
            public static final class C29129b extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C32636Ej6 f112026g;

                @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "T", "Landroid/bluetooth/BluetoothDevice;", "<anonymous parameter 0>", "Lno/nordicsemi/android/ble/data/Data;", "<anonymous parameter 1>", "", "b", "(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1$2$1\n*L\n1#1,86:1\n*E\n"})
                /* renamed from: uF5$c$a$b$a */
                /* loaded from: classes4.dex */
                public static final class C29130a implements QS0 {

                    /* renamed from: b */
                    public static final C29130a f112027b = new C29130a();

                    @Override // p000.QS0
                    /* renamed from: b */
                    public final void mo3746b(BluetoothDevice noName_0, Data noName_1) {
                        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
                        Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C29129b(C32636Ej6 c32636Ej6) {
                    super(0);
                    this.f112026g = c32636Ej6;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f112026g.m108551h(C29130a.f112027b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29127a(C32636Ej6 c32636Ej6, Continuation continuation) {
                super(2, continuation);
                this.f112024j = c32636Ej6;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C29127a c29127a = new C29127a(this.f112024j, continuation);
                c29127a.f112023i = obj;
                return c29127a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC45497n74<? super SmartlockNokeNotificationResponse> interfaceC45497n74, Continuation<? super Unit> continuation) {
                return ((C29127a) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f112022h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC45497n74 interfaceC45497n74 = (InterfaceC45497n74) this.f112023i;
                    this.f112024j.m108552g(null);
                    this.f112024j.m108551h(new C29128a(interfaceC45497n74));
                    C29129b c29129b = new C29129b(this.f112024j);
                    this.f112022h = 1;
                    if (C43125j74.m31072a(interfaceC45497n74, c29129b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        /* renamed from: uF5$c$b */
        /* loaded from: classes4.dex */
        public static final class C29131b implements InterfaceC32730Eu1<SmartlockNokeNotificationResponse> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC32730Eu1 f112028b;

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$SmartlockNokeGattCallback\n*L\n1#1,222:1\n21#2:223\n22#2:225\n257#3:224\n*E\n"})
            /* renamed from: uF5$c$b$a */
            /* loaded from: classes4.dex */
            public static final class C29132a<T> implements InterfaceC33198Gu1 {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC33198Gu1 f112029b;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$SmartlockNokeGattCallback$initialize$$inlined$filter$1$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: uF5$c$b$a$a */
                /* loaded from: classes4.dex */
                public static final class C29133a extends ContinuationImpl {

                    /* renamed from: h */
                    public /* synthetic */ Object f112030h;

                    /* renamed from: i */
                    public int f112031i;

                    public C29133a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f112030h = obj;
                        this.f112031i |= Integer.MIN_VALUE;
                        return C29132a.this.emit(null, this);
                    }
                }

                public C29132a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.f112029b = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C29133a c29133a;
                    Object coroutine_suspended;
                    int i;
                    if (continuation instanceof C29133a) {
                        c29133a = (C29133a) continuation;
                        int i2 = c29133a.f112031i;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c29133a.f112031i = i2 - Integer.MIN_VALUE;
                            Object obj2 = c29133a.f112030h;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c29133a.f112031i;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.f112029b;
                                if (((SmartlockNokeNotificationResponse) obj).m22627c()) {
                                    c29133a.f112031i = 1;
                                    if (interfaceC33198Gu1.emit(obj, c29133a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c29133a = new C29133a(continuation);
                    Object obj22 = c29133a.f112030h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c29133a.f112031i;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public C29131b(InterfaceC32730Eu1 interfaceC32730Eu1) {
                this.f112028b = interfaceC32730Eu1;
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super SmartlockNokeNotificationResponse> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = this.f112028b.collect(new C29132a(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        /* renamed from: uF5$c$c */
        /* loaded from: classes4.dex */
        public static final class C29134c implements InterfaceC32730Eu1<NokelockResponse> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC32730Eu1 f112033b;

            /* renamed from: c */
            public final /* synthetic */ C49723uF5 f112034c;

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$SmartlockNokeGattCallback\n*L\n1#1,222:1\n48#2:223\n259#3,6:224\n*E\n"})
            /* renamed from: uF5$c$c$a */
            /* loaded from: classes4.dex */
            public static final class C29135a<T> implements InterfaceC33198Gu1 {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC33198Gu1 f112035b;

                /* renamed from: c */
                public final /* synthetic */ C49723uF5 f112036c;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$SmartlockNokeGattCallback$initialize$$inlined$map$1$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {229, 223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: uF5$c$c$a$a */
                /* loaded from: classes4.dex */
                public static final class C29136a extends ContinuationImpl {

                    /* renamed from: h */
                    public /* synthetic */ Object f112037h;

                    /* renamed from: i */
                    public int f112038i;

                    /* renamed from: j */
                    public Object f112039j;

                    public C29136a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f112037h = obj;
                        this.f112038i |= Integer.MIN_VALUE;
                        return C29135a.this.emit(null, this);
                    }
                }

                public C29135a(InterfaceC33198Gu1 interfaceC33198Gu1, C49723uF5 c49723uF5) {
                    this.f112035b = interfaceC33198Gu1;
                    this.f112036c = c49723uF5;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C29136a c29136a;
                    Object obj2;
                    Object coroutine_suspended;
                    int i;
                    InterfaceC33198Gu1 interfaceC33198Gu1;
                    if (continuation instanceof C29136a) {
                        c29136a = (C29136a) continuation;
                        int i2 = c29136a.f112038i;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c29136a.f112038i = i2 - Integer.MIN_VALUE;
                            obj2 = c29136a.f112037h;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c29136a.f112038i;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        ResultKt.throwOnFailure(obj2);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC33198Gu1 = (InterfaceC33198Gu1) c29136a.f112039j;
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu12 = this.f112035b;
                                InterfaceC42042hI5 interfaceC42042hI5 = this.f112036c.f112012n;
                                String m14511d = this.f112036c.f112014p.m14511d();
                                C49723uF5 c49723uF5 = this.f112036c;
                                byte[] m54829e = ((SmartlockNokeNotificationResponse) obj).m54829e();
                                Intrinsics.checkNotNull(m54829e);
                                AbstractC23442F<NokelockResponse> m36546e = interfaceC42042hI5.m36546e(new NokelockMessage(m14511d, c49723uF5.m10511W(m54829e)));
                                c29136a.f112039j = interfaceC33198Gu12;
                                c29136a.f112038i = 1;
                                Object m25303a = C45199md5.m25303a(m36546e, c29136a);
                                if (m25303a == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = m25303a;
                                interfaceC33198Gu1 = interfaceC33198Gu12;
                            }
                            c29136a.f112039j = null;
                            c29136a.f112038i = 2;
                            if (interfaceC33198Gu1.emit(obj2, c29136a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c29136a = new C29136a(continuation);
                    obj2 = c29136a.f112037h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c29136a.f112038i;
                    if (i == 0) {
                    }
                    c29136a.f112039j = null;
                    c29136a.f112038i = 2;
                    if (interfaceC33198Gu1.emit(obj2, c29136a) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public C29134c(InterfaceC32730Eu1 interfaceC32730Eu1, C49723uF5 c49723uF5) {
                this.f112033b = interfaceC32730Eu1;
                this.f112034c = c49723uF5;
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super NokelockResponse> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = this.f112033b.collect(new C29135a(interfaceC33198Gu1, this.f112034c), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\u008a@"}, m28432d2 = {"Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "response", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$SmartlockNokeGattCallback$initialize$3", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: uF5$c$d */
        /* loaded from: classes4.dex */
        public static final class C29137d extends SuspendLambda implements Function2<NokelockResponse, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f112041h;

            /* renamed from: i */
            public /* synthetic */ Object f112042i;

            /* renamed from: j */
            public final /* synthetic */ C49723uF5 f112043j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29137d(C49723uF5 c49723uF5, Continuation<? super C29137d> continuation) {
                super(2, continuation);
                this.f112043j = c49723uF5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C29137d c29137d = new C29137d(this.f112043j, continuation);
                c29137d.f112042i = obj;
                return c29137d;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(NokelockResponse nokelockResponse, Continuation<? super Unit> continuation) {
                return ((C29137d) create(nokelockResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112041h == 0) {
                    ResultKt.throwOnFailure(obj);
                    NokelockResponse response = (NokelockResponse) this.f112042i;
                    C49723uF5 c49723uF5 = this.f112043j;
                    Intrinsics.checkNotNullExpressionValue(response, "response");
                    this.f112043j.m79043R().mo10357b(c49723uF5.m10500h0(response, (CJ5) this.f112043j.m79043R().getValue()));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m28432d2 = {"LGu1;", "Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$SmartlockNokeGattCallback$initialize$4", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: uF5$c$e */
        /* loaded from: classes4.dex */
        public static final class C29138e extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super NokelockResponse>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f112044h;

            public C29138e(Continuation<? super C29138e> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: e */
            public final Object invoke(InterfaceC33198Gu1<? super NokelockResponse> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
                return new C29138e(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112044h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m28432d2 = {"LGu1;", "Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "", "exception", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$SmartlockNokeGattCallback$initialize$5", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: uF5$c$f */
        /* loaded from: classes4.dex */
        public static final class C29139f extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super NokelockResponse>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f112045h;

            /* renamed from: i */
            public /* synthetic */ Object f112046i;

            /* renamed from: j */
            public final /* synthetic */ C49723uF5 f112047j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29139f(C49723uF5 c49723uF5, Continuation<? super C29139f> continuation) {
                super(3, continuation);
                this.f112047j = c49723uF5;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: e */
            public final Object invoke(InterfaceC33198Gu1<? super NokelockResponse> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
                C29139f c29139f = new C29139f(this.f112047j, continuation);
                c29139f.f112046i = th;
                return c29139f.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List plus;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112045h == 0) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.f112046i;
                    BX2 m79043R = this.f112047j.m79043R();
                    plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) this.f112047j.m79043R().getValue()).m112353e()), FJ5.EXCEPTION);
                    m79043R.mo10357b(CJ5.copy$default((CJ5) this.f112047j.m79043R().getValue(), plus, null, null, null, null, null, th, 62, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C29126c() {
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: S2 */
        public boolean mo3749S2(BluetoothGatt gatt) {
            UUID uuid;
            UUID uuid2;
            UUID uuid3;
            Intrinsics.checkNotNullParameter(gatt, "gatt");
            uuid = JJ5.f17346a;
            BluetoothGattService service = gatt.getService(uuid);
            if (service != null) {
                C49723uF5 c49723uF5 = C49723uF5.this;
                uuid2 = JJ5.f17347b;
                c49723uF5.f112016r = service.getCharacteristic(uuid2);
                uuid3 = JJ5.f17348c;
                c49723uF5.f112017s = service.getCharacteristic(uuid3);
            }
            if (C49723uF5.this.f112016r != null && C49723uF5.this.f112017s != null) {
                return true;
            }
            return false;
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: c5 */
        public void mo3748c5() {
            C49723uF5.this.f112016r = null;
            C49723uF5.this.f112017s = null;
        }

        @Override // no.nordicsemi.android.ble.BleManagerHandler
        /* renamed from: o2 */
        public void mo3747o2() {
            super.mo3747o2();
            C49723uF5 c49723uF5 = C49723uF5.this;
            C32636Ej6 m5226M = c49723uF5.m5226M(c49723uF5.f112017s);
            Intrinsics.checkNotNullExpressionValue(m5226M, "setNotificationCallback(notifyCharacteristic)");
            C36708Vu1.m79279I(C36708Vu1.m79280H(C36708Vu1.m79265f(C36708Vu1.m79277K(C36708Vu1.m79276L(C36708Vu1.m79280H(new C29134c(new C29131b(C36708Vu1.m79266e(new C29127a(m5226M, null))), C49723uF5.this), T41.m84377b()), new C29137d(C49723uF5.this, null)), new C29138e(null)), new C29139f(C49723uF5.this, null)), T41.m84376c()), C49723uF5.this.f112013o);
            C49723uF5 c49723uF52 = C49723uF5.this;
            c49723uF52.m5215z(c49723uF52.f112017s).mo22507k();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uF5$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C29140d {
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
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$launchRequestWithCatch$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {311}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$e */
    /* loaded from: classes4.dex */
    public static final class C29141e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112048h;

        /* renamed from: i */
        public /* synthetic */ Object f112049i;

        /* renamed from: j */
        public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f112050j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29141e(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C29141e> continuation) {
            super(2, continuation);
            this.f112050j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29141e c29141e = new C29141e(this.f112050j, continuation);
            c29141e.f112049i = obj;
            return c29141e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29141e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112048h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function2<ZC0, Continuation<? super Unit>, Object> function2 = this.f112050j;
                this.f112048h = 1;
                if (function2.invoke((ZC0) this.f112049i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestState$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {389}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$f */
    /* loaded from: classes4.dex */
    public static final class C29142f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112051h;

        public C29142f(Continuation<? super C29142f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29142f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29142f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            String m104033b;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112051h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                HJ5 m112352f = ((CJ5) C49723uF5.this.m79043R().getValue()).m112352f();
                if (m112352f != null && (m104033b = m112352f.m104033b()) != null) {
                    C49723uF5 c49723uF5 = C49723uF5.this;
                    C26613D0 m5222Q = c49723uF5.m5222Q(c49723uF5.f112016r, C49723uF5.this.m10510X(m104033b), 2);
                    Intrinsics.checkNotNullExpressionValue(m5222Q, "writeCharacteristic(\n   …ITE_TYPE_DEFAULT,\n      )");
                    this.f112051h = 1;
                    if (C42643iJ4.m34230b(m5222Q, this) == coroutine_suspended) {
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
    /* renamed from: uF5$g */
    /* loaded from: classes4.dex */
    public static final class C29143g implements InterfaceC32730Eu1<CJ5> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f112053b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n1#1,222:1\n21#2:223\n22#2:225\n375#3:224\n*E\n"})
        /* renamed from: uF5$g$a */
        /* loaded from: classes4.dex */
        public static final class C29144a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f112054b;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestStateFlow$$inlined$filter$1$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: uF5$g$a$a */
            /* loaded from: classes4.dex */
            public static final class C29145a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f112055h;

                /* renamed from: i */
                public int f112056i;

                public C29145a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f112055h = obj;
                    this.f112056i |= Integer.MIN_VALUE;
                    return C29144a.this.emit(null, this);
                }
            }

            public C29144a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f112054b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C29145a c29145a;
                Object coroutine_suspended;
                int i;
                boolean z;
                if (continuation instanceof C29145a) {
                    c29145a = (C29145a) continuation;
                    int i2 = c29145a.f112056i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c29145a.f112056i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c29145a.f112055h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c29145a.f112056i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f112054b;
                            if (((CJ5) obj).m112355c() == FJ5.LOCK_STATE_RESPONSE_RECEIVED) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c29145a.f112056i = 1;
                                if (interfaceC33198Gu1.emit(obj, c29145a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c29145a = new C29145a(continuation);
                Object obj22 = c29145a.f112055h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29145a.f112056i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C29143g(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f112053b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f112053b.collect(new C29144a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "LCJ5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestStateFlow$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$h */
    /* loaded from: classes4.dex */
    public static final class C29146h extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super CJ5>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112058h;

        public C29146h(Continuation<? super C29146h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29146h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C29146h) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112058h == 0) {
                ResultKt.throwOnFailure(obj);
                C49723uF5.this.m10507a0();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestToken$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {337}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$i */
    /* loaded from: classes4.dex */
    public static final class C29147i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112060h;

        public C29147i(Continuation<? super C29147i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29147i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29147i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            byte[] bArr;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112060h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("writing request to device to request token response", new Object[0]);
                C49723uF5 c49723uF5 = C49723uF5.this;
                String m10509Y = c49723uF5.m10509Y(c49723uF5.f112014p);
                if (m10509Y != null) {
                    bArr = C49723uF5.this.m10510X(m10509Y);
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    C49723uF5 c49723uF52 = C49723uF5.this;
                    C26613D0 m5222Q = c49723uF52.m5222Q(c49723uF52.f112016r, bArr, 2);
                    Intrinsics.checkNotNullExpressionValue(m5222Q, "writeCharacteristic(\n   …RITE_TYPE_DEFAULT\n      )");
                    this.f112060h = 1;
                    if (C42643iJ4.m34230b(m5222Q, this) == coroutine_suspended) {
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
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestToken$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {344}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nSmartlockNokeDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$requestToken$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,550:1\n1774#2,4:551\n*S KotlinDebug\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$requestToken$2\n*L\n350#1:551,4\n*E\n"})
    /* renamed from: uF5$j */
    /* loaded from: classes4.dex */
    public static final class C29148j extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112062h;

        public C29148j(Continuation<? super C29148j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29148j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29148j) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            boolean z;
            int coerceAtLeast;
            int i;
            boolean z2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f112062h;
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
                this.f112062h = 1;
                if (C48120rZ0.m15768a(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List<FJ5> m112353e = ((CJ5) C49723uF5.this.m79043R().getValue()).m112353e();
            C41318g46.m40163a("stateHistory " + m112353e, new Object[0]);
            int lastIndexOf = m112353e.lastIndexOf(FJ5.TOKEN_RESPONSE_RECEIVED);
            int lastIndexOf2 = m112353e.lastIndexOf(FJ5.TOKEN_REQUESTED);
            if (lastIndexOf != -1 && lastIndexOf > lastIndexOf2) {
                z = true;
            } else {
                z = false;
            }
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(lastIndexOf, 0);
            List<FJ5> subList = m112353e.subList(coerceAtLeast, m112353e.size());
            if ((subList instanceof Collection) && subList.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (FJ5 fj5 : subList) {
                    if (fj5 == FJ5.TOKEN_REQUESTED) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            List<String> m14503l = C49723uF5.this.f112014p.m14503l();
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
                    C49723uF5.this.m10505c0();
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
    /* renamed from: uF5$k */
    /* loaded from: classes4.dex */
    public static final class C29149k implements InterfaceC32730Eu1<CJ5> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f112064b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n1#1,222:1\n21#2:223\n22#2:225\n317#3:224\n*E\n"})
        /* renamed from: uF5$k$a */
        /* loaded from: classes4.dex */
        public static final class C29150a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f112065b;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestTokenFlow$$inlined$filter$1$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: uF5$k$a$a */
            /* loaded from: classes4.dex */
            public static final class C29151a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f112066h;

                /* renamed from: i */
                public int f112067i;

                public C29151a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f112066h = obj;
                    this.f112067i |= Integer.MIN_VALUE;
                    return C29150a.this.emit(null, this);
                }
            }

            public C29150a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f112065b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C29151a c29151a;
                Object coroutine_suspended;
                int i;
                boolean z;
                if (continuation instanceof C29151a) {
                    c29151a = (C29151a) continuation;
                    int i2 = c29151a.f112067i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c29151a.f112067i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c29151a.f112066h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c29151a.f112067i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f112065b;
                            if (((CJ5) obj).m112355c() == FJ5.TOKEN_RESPONSE_RECEIVED) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c29151a.f112067i = 1;
                                if (interfaceC33198Gu1.emit(obj, c29151a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c29151a = new C29151a(continuation);
                Object obj22 = c29151a.f112066h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29151a.f112067i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C29149k(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f112064b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f112064b.collect(new C29150a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "LCJ5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestTokenFlow$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$l */
    /* loaded from: classes4.dex */
    public static final class C29152l extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super CJ5>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112069h;

        public C29152l(Continuation<? super C29152l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29152l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C29152l) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112069h == 0) {
                ResultKt.throwOnFailure(obj);
                C49723uF5.this.m10505c0();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestUnlock$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {416}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$m */
    /* loaded from: classes4.dex */
    public static final class C29153m extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112071h;

        /* renamed from: j */
        public final /* synthetic */ String f112073j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29153m(String str, Continuation<? super C29153m> continuation) {
            super(2, continuation);
            this.f112073j = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29153m(this.f112073j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29153m) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112071h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C49723uF5 c49723uF5 = C49723uF5.this;
                C26613D0 m5222Q = c49723uF5.m5222Q(c49723uF5.f112016r, C49723uF5.this.m10510X(this.f112073j), 2);
                Intrinsics.checkNotNullExpressionValue(m5222Q, "writeCharacteristic(\n   …ITE_TYPE_DEFAULT,\n      )");
                this.f112071h = 1;
                if (C42643iJ4.m34230b(m5222Q, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* renamed from: uF5$n */
    /* loaded from: classes4.dex */
    public static final class C29154n implements InterfaceC32730Eu1<CJ5> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f112074b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n1#1,222:1\n21#2:223\n22#2:225\n396#3:224\n*E\n"})
        /* renamed from: uF5$n$a */
        /* loaded from: classes4.dex */
        public static final class C29155a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f112075b;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestUnlockFlow$$inlined$filter$1$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: uF5$n$a$a */
            /* loaded from: classes4.dex */
            public static final class C29156a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f112076h;

                /* renamed from: i */
                public int f112077i;

                public C29156a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f112076h = obj;
                    this.f112077i |= Integer.MIN_VALUE;
                    return C29155a.this.emit(null, this);
                }
            }

            public C29155a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f112075b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C29156a c29156a;
                Object coroutine_suspended;
                int i;
                boolean z;
                if (continuation instanceof C29156a) {
                    c29156a = (C29156a) continuation;
                    int i2 = c29156a.f112077i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c29156a.f112077i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c29156a.f112076h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c29156a.f112077i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f112075b;
                            CJ5 cj5 = (CJ5) obj;
                            if (cj5.m112355c() != FJ5.UNLOCK_RESPONSE_RECEIVED && cj5.m112355c() != FJ5.LOCK_RESPONSE_RECEIVED) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                c29156a.f112077i = 1;
                                if (interfaceC33198Gu1.emit(obj, c29156a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c29156a = new C29156a(continuation);
                Object obj22 = c29156a.f112076h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29156a.f112077i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C29154n(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f112074b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f112074b.collect(new C29155a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "LCJ5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$requestUnlockFlow$2", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$o */
    /* loaded from: classes4.dex */
    public static final class C29157o extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super CJ5>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112079h;

        public C29157o(Continuation<? super C29157o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29157o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C29157o) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112079h == 0) {
                ResultKt.throwOnFailure(obj);
                C49723uF5.this.m10503e0();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, m28432d2 = {"uF5$p", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "LTC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "u", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n1#1,110:1\n301#2,7:111\n*E\n"})
    /* renamed from: uF5$p */
    /* loaded from: classes4.dex */
    public static final class C29158p extends AbstractCoroutineContextElement implements TC0 {

        /* renamed from: b */
        public final /* synthetic */ C49723uF5 f112081b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29158p(TC0.C7679a c7679a, C49723uF5 c49723uF5) {
            super(c7679a);
            this.f112081b = c49723uF5;
        }

        @Override // p000.TC0
        /* renamed from: u */
        public void mo3742u(CoroutineContext coroutineContext, Throwable th) {
            List plus;
            BX2 m79043R = this.f112081b.m79043R();
            CJ5 cj5 = (CJ5) this.f112081b.m79043R().getValue();
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) this.f112081b.m79043R().getValue()).m112353e()), FJ5.EXCEPTION);
            m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, th, 62, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$throwOnException$$inlined$flatMapLatest$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n1#1,215:1\n541#2,5:216\n*E\n"})
    /* renamed from: uF5$q */
    /* loaded from: classes4.dex */
    public static final class C29159q extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super CJ5>, CJ5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112082h;

        /* renamed from: i */
        public /* synthetic */ Object f112083i;

        /* renamed from: j */
        public /* synthetic */ Object f112084j;

        public C29159q(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, CJ5 cj5, Continuation<? super Unit> continuation) {
            C29159q c29159q = new C29159q(continuation);
            c29159q.f112083i = interfaceC33198Gu1;
            c29159q.f112084j = cj5;
            return c29159q.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112082h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC33198Gu1 interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f112083i;
                CJ5 cj5 = (CJ5) this.f112084j;
                Throwable m112356b = cj5.m112356b();
                if (cj5.m112355c() == FJ5.EXCEPTION && m112356b != null) {
                    throw m112356b;
                }
                InterfaceC32730Eu1 m79281G = C36708Vu1.m79281G(cj5);
                this.f112082h = 1;
                if (C36708Vu1.m79252s(interfaceC33198Gu1, m79281G, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$unlock$$inlined$flatMapLatest$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,215:1\n173#2,3:216\n190#3:219\n*S KotlinDebug\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n175#1:219\n*E\n"})
    /* renamed from: uF5$r */
    /* loaded from: classes4.dex */
    public static final class C29160r extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super CJ5>, CJ5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112085h;

        /* renamed from: i */
        public /* synthetic */ Object f112086i;

        /* renamed from: j */
        public /* synthetic */ Object f112087j;

        /* renamed from: k */
        public final /* synthetic */ C49723uF5 f112088k;

        /* renamed from: l */
        public final /* synthetic */ boolean f112089l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29160r(Continuation continuation, C49723uF5 c49723uF5, boolean z) {
            super(3, continuation);
            this.f112088k = c49723uF5;
            this.f112089l = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, CJ5 cj5, Continuation<? super Unit> continuation) {
            C29160r c29160r = new C29160r(continuation, this.f112088k, this.f112089l);
            c29160r.f112086i = interfaceC33198Gu1;
            c29160r.f112087j = cj5;
            return c29160r.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112085h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("received token flow response: " + ((CJ5) this.f112087j), new Object[0]);
                InterfaceC32730Eu1 m79271Q = C36708Vu1.m79271Q(this.f112088k.m10506b0(), new C29162t(null, this.f112088k, this.f112089l));
                this.f112085h = 1;
                if (C36708Vu1.m79252s((InterfaceC33198Gu1) this.f112086i, m79271Q, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"LCJ5;", MessageExtension.FIELD_DATA, "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$unlock$1$1$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uF5$s */
    /* loaded from: classes4.dex */
    public static final class C29161s extends SuspendLambda implements Function2<CJ5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112090h;

        /* renamed from: i */
        public /* synthetic */ Object f112091i;

        /* renamed from: j */
        public final /* synthetic */ boolean f112092j;

        /* renamed from: k */
        public final /* synthetic */ C49723uF5 f112093k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29161s(boolean z, C49723uF5 c49723uF5, Continuation<? super C29161s> continuation) {
            super(2, continuation);
            this.f112092j = z;
            this.f112093k = c49723uF5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29161s c29161s = new C29161s(this.f112092j, this.f112093k, continuation);
            c29161s.f112091i = obj;
            return c29161s;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(CJ5 cj5, Continuation<? super Unit> continuation) {
            return ((C29161s) create(cj5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112090h == 0) {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("received unlock flow response: " + ((CJ5) this.f112091i), new Object[0]);
                if (this.f112092j) {
                    C41318g46.m40163a("disconnectOnSuccess was true, disconnecting now", new Object[0]);
                    this.f112093k.m5217x().mo22507k();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$unlock$lambda$1$$inlined$flatMapLatest$1", m28418f = "SmartlockNokeDeviceManager.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager\n*L\n1#1,215:1\n176#2,3:216\n*E\n"})
    /* renamed from: uF5$t */
    /* loaded from: classes4.dex */
    public static final class C29162t extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super CJ5>, CJ5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112094h;

        /* renamed from: i */
        public /* synthetic */ Object f112095i;

        /* renamed from: j */
        public /* synthetic */ Object f112096j;

        /* renamed from: k */
        public final /* synthetic */ C49723uF5 f112097k;

        /* renamed from: l */
        public final /* synthetic */ boolean f112098l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29162t(Continuation continuation, C49723uF5 c49723uF5, boolean z) {
            super(3, continuation);
            this.f112097k = c49723uF5;
            this.f112098l = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super CJ5> interfaceC33198Gu1, CJ5 cj5, Continuation<? super Unit> continuation) {
            C29162t c29162t = new C29162t(continuation, this.f112097k, this.f112098l);
            c29162t.f112095i = interfaceC33198Gu1;
            c29162t.f112096j = cj5;
            return c29162t.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112094h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C41318g46.m40163a("received state flow response: " + ((CJ5) this.f112096j), new Object[0]);
                InterfaceC32730Eu1 m79276L = C36708Vu1.m79276L(this.f112097k.m10502f0(), new C29161s(this.f112098l, this.f112097k, null));
                this.f112094h = 1;
                if (C36708Vu1.m79252s((InterfaceC33198Gu1) this.f112095i, m79276L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49723uF5(Context context, InterfaceC42042hI5 smartLockClient, ZC0 scope, C48528sE5 smartLock, boolean z) {
        super(scope, context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(smartLockClient, "smartLockClient");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(smartLock, "smartLock");
        this.f112012n = smartLockClient;
        this.f112013o = scope;
        this.f112014p = smartLock;
        this.f112015q = z;
        this.f112018t = new C29158p(TC0.f34895N, this);
        this.f112019u = new C50303vE2<>(5);
    }

    @Override // p000.AbstractC30179xU
    /* renamed from: C */
    public AbstractC30179xU.AbstractC30181b mo3768C() {
        return new C29126c();
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
        mo5227L(new C29125b());
    }

    @Override // p000.AbstractC49714uE5
    /* renamed from: U */
    public AbstractC23461c mo3764U(boolean z) {
        C41318g46.m40163a("calling unlock in smartlock noke device manager", new Object[0]);
        AbstractC23461c m33159G = C34930Oe5.m91745d(C36708Vu1.m79271Q(m10504d0(), new C29160r(null, this, z)), null, 1, null).firstOrError().m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "requestTokenFlow()\n     …()\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.AbstractC8883Vy
    /* renamed from: V */
    public CJ5 dataInitializer() {
        return new CJ5(null, null, null, null, null, null, null, 127, null);
    }

    /* renamed from: W */
    public final String m10511W(byte[] bArr) {
        String m108172e = C2029Ey.m108181b().m108172e(bArr);
        Intrinsics.checkNotNullExpressionValue(m108172e, "getEncoder().encodeToString(this)");
        return m108172e;
    }

    /* renamed from: X */
    public final byte[] m10510X(String str) {
        byte[] m108180a = C2029Ey.m108182a().m108180a(str);
        Intrinsics.checkNotNullExpressionValue(m108180a, "getDecoder().decode(this)");
        return m108180a;
    }

    /* renamed from: Y */
    public final String m10509Y(C48528sE5 c48528sE5) {
        String str;
        if (!this.f112015q && c48528sE5.m14504k() != null) {
            str = c48528sE5.m14504k();
        } else {
            Integer m8993d = this.f112019u.m8993d(c48528sE5.m14511d());
            if (m8993d == null) {
                m8993d = 0;
            }
            int intValue = m8993d.intValue();
            List<String> m14503l = c48528sE5.m14503l();
            if (m14503l != null) {
                this.f112019u.m8992e(c48528sE5.m14511d(), Integer.valueOf(intValue + 1));
                str = m14503l.get(intValue % m14503l.size());
            } else {
                str = null;
            }
        }
        C41318g46.m40163a("Using " + str + " as the next token to try in a token request to lock", new Object[0]);
        return str;
    }

    /* renamed from: Z */
    public final InterfaceC52943zh2 m10508Z(ZC0 zc0, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block) {
        InterfaceC45344ms0 m95045b;
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(zc0, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        m95045b = C34486Mh2.m95045b(null, 1, null);
        m73800d = Z30.m73800d(zc0, m95045b.plus(this.f112018t), null, new C29141e(block, null), 2, null);
        return m73800d;
    }

    /* renamed from: a0 */
    public final void m10507a0() {
        List plus;
        if (this.f112016r == null) {
            return;
        }
        BX2 m79043R = m79043R();
        CJ5 cj5 = (CJ5) m79043R().getValue();
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) m79043R().getValue()).m112353e()), FJ5.LOCK_STATE_REQUESTED);
        m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, null, 126, null));
        m10508Z(this.f112013o, new C29142f(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b0 */
    public final InterfaceC32730Eu1<CJ5> m10506b0() {
        return C36708Vu1.m79275M(new C29143g(m10501g0(m79043R())), new C29146h(null));
    }

    /* renamed from: c0 */
    public final void m10505c0() {
        List plus;
        if (this.f112016r == null) {
            return;
        }
        BX2 m79043R = m79043R();
        CJ5 cj5 = (CJ5) m79043R().getValue();
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) m79043R().getValue()).m112353e()), FJ5.TOKEN_REQUESTED);
        m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, null, 126, null));
        m10508Z(this.f112013o, new C29147i(null));
        m10508Z(this.f112013o, new C29148j(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d0 */
    public final InterfaceC32730Eu1<CJ5> m10504d0() {
        return C36708Vu1.m79275M(new C29149k(m10501g0(m79043R())), new C29152l(null));
    }

    /* renamed from: e0 */
    public final void m10503e0() {
        List plus;
        List plus2;
        String m104032c;
        if (this.f112016r == null) {
            return;
        }
        BX2 m79043R = m79043R();
        CJ5 cj5 = (CJ5) m79043R().getValue();
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) m79043R().getValue()).m112353e()), FJ5.UNLOCK_REQUESTED);
        m79043R.mo10357b(CJ5.copy$default(cj5, plus, null, null, null, null, null, null, 126, null));
        HJ5 m112352f = ((CJ5) m79043R().getValue()).m112352f();
        if (m112352f != null && (m104032c = m112352f.m104032c()) != null) {
            m10508Z(this.f112013o, new C29153m(m104032c, null));
            return;
        }
        Unit unit = Unit.INSTANCE;
        BX2 m79043R2 = m79043R();
        CJ5 cj52 = (CJ5) m79043R().getValue();
        plus2 = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) ((CJ5) m79043R().getValue()).m112353e()), FJ5.EXCEPTION);
        m79043R2.mo10357b(CJ5.copy$default(cj52, plus2, null, null, null, null, null, new NullPointerException("A valid token response was not present when attempting to request lock state"), 62, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f0 */
    public final InterfaceC32730Eu1<CJ5> m10502f0() {
        return C36708Vu1.m79275M(new C29154n(m10501g0(m79043R())), new C29157o(null));
    }

    /* renamed from: g0 */
    public final InterfaceC32730Eu1<CJ5> m10501g0(GX2<CJ5> gx2) {
        return C36708Vu1.m79271Q(gx2, new C29159q(null));
    }

    /* renamed from: h0 */
    public final CJ5 m10500h0(NokelockResponse nokelockResponse, CJ5 cj5) {
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
        switch (C29140d.$EnumSwitchMapping$0[nokelockResponse.getType().ordinal()]) {
            case 1:
                WireNokelockResponseData data = nokelockResponse.getData();
                if (data instanceof WireNokelockTokenResponseData) {
                    wireNokelockTokenResponseData = (WireNokelockTokenResponseData) data;
                }
                if (wireNokelockTokenResponseData == null) {
                    return cj5;
                }
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) cj5.m112353e()), FJ5.TOKEN_RESPONSE_RECEIVED);
                return CJ5.copy$default(cj5, plus, new HJ5(wireNokelockTokenResponseData.getStateRequest(), wireNokelockTokenResponseData.getUnlockRequest(), wireNokelockTokenResponseData.getLockingRequest()), null, null, null, null, null, 124, null);
            case 2:
                WireNokelockResponseData data2 = nokelockResponse.getData();
                if (data2 instanceof WireNokelockUnlockData) {
                    wireNokelockUnlockData = (WireNokelockUnlockData) data2;
                }
                if (wireNokelockUnlockData == null) {
                    return cj5;
                }
                plus2 = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) cj5.m112353e()), FJ5.UNLOCK_RESPONSE_RECEIVED);
                return CJ5.copy$default(cj5, plus2, null, null, new IJ5(wireNokelockUnlockData.getSuccess()), null, null, null, 118, null);
            case 3:
                WireNokelockResponseData data3 = nokelockResponse.getData();
                if (data3 instanceof WireNokelockLockingData) {
                    wireNokelockLockingData = (WireNokelockLockingData) data3;
                }
                if (wireNokelockLockingData == null) {
                    return cj5;
                }
                plus3 = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) cj5.m112353e()), FJ5.LOCK_RESPONSE_RECEIVED);
                return CJ5.copy$default(cj5, plus3, null, null, null, new EJ5(wireNokelockLockingData.getSuccess()), null, null, 110, null);
            case 4:
                WireNokelockResponseData data4 = nokelockResponse.getData();
                if (data4 instanceof WireNokelockStateData) {
                    wireNokelockStateData = (WireNokelockStateData) data4;
                }
                if (wireNokelockStateData == null) {
                    return cj5;
                }
                plus4 = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) cj5.m112353e()), FJ5.LOCK_STATE_RESPONSE_RECEIVED);
                return CJ5.copy$default(cj5, plus4, null, new GJ5(wireNokelockStateData.isLocked()), null, null, null, null, 122, null);
            case 5:
                WireNokelockResponseData data5 = nokelockResponse.getData();
                if (data5 instanceof WireNokelockInsertedData) {
                    wireNokelockInsertedData = (WireNokelockInsertedData) data5;
                }
                if (wireNokelockInsertedData == null) {
                    return cj5;
                }
                plus5 = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) cj5.m112353e()), FJ5.LOCK_INSERTED_RESPONSE_RECEIVED);
                return CJ5.copy$default(cj5, plus5, null, null, null, null, new DJ5(wireNokelockInsertedData.getSuccess()), null, 94, null);
            case 6:
                plus6 = CollectionsKt___CollectionsKt.plus((Collection<? extends FJ5>) ((Collection<? extends Object>) cj5.m112353e()), FJ5.UNKNOWN);
                return CJ5.copy$default(cj5, plus6, null, null, null, null, null, null, 126, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
