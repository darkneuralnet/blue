package p000;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdScan;
import co.bird.android.model.Contractor;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.ScanType;
import co.bird.android.model.UserKt;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.ScanStatus;
import co.bird.android.model.extra.ScanBarcodeExtra;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C7427SS;
import p000.H31;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001=BÙ\u0001\b\u0007\u0012\u0006\u0010Z\u001a\u00020X\u0012\u0006\u0010^\u001a\u00020[\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020c\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020o\u0012\u0006\u0010v\u001a\u00020s\u0012\u0006\u0010z\u001a\u00020w\u0012\u0006\u0010~\u001a\u00020{\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u007f\u0012\b\u0010\u0086\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u008a\u0001\u001a\u00030\u0087\u0001\u0012\b\u0010\u008e\u0001\u001a\u00030\u008b\u0001\u0012\b\u0010\u0092\u0001\u001a\u00030\u008f\u0001\u0012\u0011\b\u0001\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u0001\u0012\n\b\u0001\u0010\u009a\u0001\u001a\u00030\u0097\u0001\u0012\n\b\u0001\u0010\u009e\u0001\u001a\u00030\u009b\u0001\u0012\n\b\u0001\u0010¢\u0001\u001a\u00030\u009f\u0001\u0012\t\b\u0003\u0010¤\u0001\u001a\u00020\u0005\u0012\t\b\u0001\u0010¦\u0001\u001a\u00020\u0005¢\u0006\u0006\b¿\u0001\u0010À\u0001J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\f\u0010\f\u001a\u00020\u0005*\u00020\u0003H\u0002J.\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J-\u0010\u0019\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001c\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0012\u0010\"\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010#\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u001a\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002J$\u0010,\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\f\u0010-\u001a\u00020\n*\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\nH\u0002J\b\u0010/\u001a\u00020\nH\u0002J0\u00101\u001a\u00020\n2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0016\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010$\u001a\u00020\u0005H\u0002J \u00105\u001a\u00020\n2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u00106\u001a\u00020\nH\u0002J6\u0010<\u001a\u00020\n2\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00032\b\u00109\u001a\u0004\u0018\u00010\u00032\b\u0010:\u001a\u0004\u0018\u00010\u00032\b\u0010;\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010=\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\nH\u0016J\b\u0010@\u001a\u00020\nH\u0016J\b\u0010A\u001a\u00020\nH\u0016J\u0010\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020BH\u0016J\u0012\u0010G\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016J\u001a\u0010L\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010K\u001a\u00020JH\u0016J\"\u0010P\u001a\u00020\n2\u0006\u0010M\u001a\u00020J2\u0006\u0010N\u001a\u00020J2\b\u0010O\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010Q\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010T\u001a\u00020\n2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001f0RH\u0007J\u0010\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020UH\u0007R\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001e\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b£\u0001\u0010+R\u0016\u0010¦\u0001\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¥\u0001\u0010+R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010+R'\u0010²\u0001\u001a\u0012\u0012\r\u0012\u000b ¯\u0001*\u0004\u0018\u00010\n0\n0®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R \u0010µ\u0001\u001a\u000b ¯\u0001*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R(\u0010¹\u0001\u001a\u0014\u0012\u000f\u0012\r ¯\u0001*\u0005\u0018\u00010·\u00010·\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010¸\u0001R(\u0010»\u0001\u001a\u0014\u0012\u000f\u0012\r ¯\u0001*\u0005\u0018\u00010º\u00010º\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010¸\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001¨\u0006Á\u0001"}, m28432d2 = {"LSS;", "LxS;", "Landroid/hardware/SensorEventListener;", "", "raw", "", "isCameraScan", "validateInput", "h0", Entry.TYPE_TEXT, "", "L", "M", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/constant/BirdAction;", "action", "c0", "merchantQRCode", "i0", "Lco/bird/android/model/wire/WireBird;", "bird", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "supplementIntent", "B", "LNy;", "alert", "l0", "secondaryMessage", "m0", "Lco/bird/android/model/BirdScan;", "scan", "a0", "q0", "b0", "enabled", "K", "Lco/bird/android/model/constant/MapMode;", "mode", "E", "Lco/bird/android/model/constant/ScanStatus;", "scanStatus", "Z", "D", "s0", "O", "A", "birdId", "F", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "o0", "x", "p0", "success", "rawData", "merchantId", "siteId", "placardId", "r0", C17296a.f69688o, "onResume", "onPause", "onBackPressed", "q", "Lem5;", "rawResult", "b", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "N", "LHM4;", "scanResponse", "Y", "", "throwable", "X", "Lgl;", "Lgl;", "preference", "LEg1;", "c", "LEg1;", "eventBus", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LaM;", "e", "LaM;", "birdManager", "LiO;", "f", "LiO;", "birdPayManager", "LQh2;", "g", "LQh2;", "jobProducer", "LYR4;", "h", "LYR4;", "rideManager", "Lde5;", "i", "Lde5;", "rxBleClient", "LTq4;", "j", "LTq4;", "reactiveConfig", "Ldr4;", "k", "Ldr4;", "locationManager", "LVq4;", "l", "LVq4;", "eventStream", "Landroid/hardware/SensorManager;", "m", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/os/Handler;", "n", "Landroid/os/Handler;", "handler", "Lrd5;", "o", "Lrd5;", "bluetoothManagerRxBle", "LpJ;", "p", "LpJ;", "bluetoothManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lco/bird/android/model/extra/ScanBarcodeExtra;", "r", "Lco/bird/android/model/extra/ScanBarcodeExtra;", "extras", "LZS;", "s", "LZS;", "ui", "Le13;", "t", "Le13;", "navigator", "u", "returnResult", "v", "shouldValidateInput", "w", "Lco/bird/android/model/constant/BirdAction;", "getAction", "()Lco/bird/android/model/constant/BirdAction;", "setAction", "(Lco/bird/android/model/constant/BirdAction;)V", "shouldEnableScanner", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "y", "Lio/reactivex/subjects/d;", "bluetoothCheckSubject", "z", "Landroid/hardware/Sensor;", "lightSensor", "LAG;", "", "LAG;", "lightSensorReading", "Lak5;", "scanEntryMode", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/wire/WireBird;", "limitBird", "<init>", "(Lgl;LEg1;LEa;LaM;LiO;LQh2;LYR4;Lde5;LTq4;Ldr4;LVq4;Landroid/hardware/SensorManager;Landroid/os/Handler;Lrd5;LpJ;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZ)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdScanPresenter.kt\nco/bird/android/app/feature/scanner/BirdScanPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,806:1\n180#2:807\n180#2:808\n180#2:809\n180#2:810\n180#2:811\n199#2:813\n180#2:814\n199#2:815\n199#2:816\n199#2:817\n180#2:818\n199#2:819\n237#2:820\n199#2:821\n199#2:822\n1#3:812\n*S KotlinDebug\n*F\n+ 1 BirdScanPresenter.kt\nco/bird/android/app/feature/scanner/BirdScanPresenterImpl\n*L\n161#1:807\n177#1:808\n194#1:809\n202#1:810\n221#1:811\n299#1:813\n390#1:814\n398#1:815\n460#1:816\n467#1:817\n628#1:818\n642#1:819\n718#1:820\n734#1:821\n747#1:822\n*E\n"})
/* renamed from: SS */
/* loaded from: classes2.dex */
public final class C7427SS implements InterfaceC30175xS, SensorEventListener {

    /* renamed from: D */
    public static final C7429a f33682D = new C7429a(null);

    /* renamed from: E */
    public static final int f33683E = 8;

    /* renamed from: A */
    public final C0058AG<Float> f33684A;

    /* renamed from: B */
    public final C0058AG<EnumC38136ak5> f33685B;

    /* renamed from: C */
    public WireBird f33686C;

    /* renamed from: b */
    public final C22454gl f33687b;

    /* renamed from: c */
    public final InterfaceC32604Eg1 f33688c;

    /* renamed from: d */
    public final InterfaceC1880Ea f33689d;

    /* renamed from: e */
    public final InterfaceC10636aM f33690e;

    /* renamed from: f */
    public final InterfaceC23227iO f33691f;

    /* renamed from: g */
    public final InterfaceC35422Qh2 f33692g;

    /* renamed from: h */
    public final YR4 f33693h;

    /* renamed from: i */
    public final AbstractC39873de5 f33694i;

    /* renamed from: j */
    public final C36207Tq4 f33695j;

    /* renamed from: k */
    public final InterfaceC40001dr4 f33696k;

    /* renamed from: l */
    public final InterfaceC36675Vq4 f33697l;

    /* renamed from: m */
    public final SensorManager f33698m;

    /* renamed from: n */
    public final Handler f33699n;

    /* renamed from: o */
    public final InterfaceC48164rd5 f33700o;

    /* renamed from: p */
    public final InterfaceC27246pJ f33701p;

    /* renamed from: q */
    public final LifecycleScopeProvider<EnumC7097RE> f33702q;

    /* renamed from: r */
    public final ScanBarcodeExtra f33703r;

    /* renamed from: s */
    public final InterfaceC10274ZS f33704s;

    /* renamed from: t */
    public final InterfaceC40099e13 f33705t;

    /* renamed from: u */
    public final boolean f33706u;

    /* renamed from: v */
    public final boolean f33707v;

    /* renamed from: w */
    public BirdAction f33708w;

    /* renamed from: x */
    public boolean f33709x;

    /* renamed from: y */
    public final C24558d<Unit> f33710y;

    /* renamed from: z */
    public final Sensor f33711z;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$A */
    /* loaded from: classes2.dex */
    public static final class C7428A extends Lambda implements Function0<Unit> {
        public C7428A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C7427SS.this.m85456K(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LSS$a;", "", "", "ACCEPTABLE_CODE_PREFIX", "Ljava/lang/String;", "", "LIGHT_SENSOR_SAMPLE_RATE_US", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: SS$a */
    /* loaded from: classes2.dex */
    public static final class C7429a {
        public /* synthetic */ C7429a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7429a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7430b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.EXISTING_QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.SERIAL_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.NEW_QR_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BirdAction.values().length];
            try {
                iArr2[BirdAction.WAKE_BIRD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BirdAction.SLEEP_BIRD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BirdAction.UNLOCK_SMARTLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BirdAction.REPLACE_PHYSICAL_LOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$c */
    /* loaded from: classes2.dex */
    public static final class C7431c extends Lambda implements Function1<DialogResponse, Unit> {
        public C7431c() {
            super(1);
        }

        /* renamed from: a */
        public final void m85398a(DialogResponse dialogResponse) {
            C7427SS.this.f33705t.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m85398a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "wireBird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$d */
    /* loaded from: classes2.dex */
    public static final class C7432d extends Lambda implements Function1<WireBird, Unit> {
        public C7432d() {
            super(1);
        }

        /* renamed from: a */
        public final void m85397a(WireBird wireBird) {
            Unit unit;
            WirePhysicalLock physicalLock = wireBird.getPhysicalLock();
            if (physicalLock != null && physicalLock.getSmartlock() != null) {
                C7427SS c7427ss = C7427SS.this;
                InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(c7427ss.f33705t, wireBird.getPhysicalLock(), true, null, null, false, null, 60, null);
                c7427ss.f33705t.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C7427SS.this.m85456K(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m85397a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$e */
    /* loaded from: classes2.dex */
    public static final class C7433e extends Lambda implements Function1<Intent, Unit> {

        /* renamed from: g */
        public static final C7433e f33715g = new C7433e();

        public C7433e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            invoke2(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$f */
    /* loaded from: classes2.dex */
    public static final class C7434f extends Lambda implements Function1<DialogResponse, Unit> {
        public C7434f() {
            super(1);
        }

        /* renamed from: a */
        public final void m85396a(DialogResponse dialogResponse) {
            C7427SS.this.f33705t.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m85396a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$g */
    /* loaded from: classes2.dex */
    public static final class C7435g extends Lambda implements Function1<WireBird, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ boolean f33717g;

        /* renamed from: h */
        public final /* synthetic */ C7427SS f33718h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7435g(boolean z, C7427SS c7427ss) {
            super(1);
            this.f33717g = z;
            this.f33718h = c7427ss;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireBird wireBird) {
            AbstractC23461c abstractC23461c;
            List listOfNotNull;
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            AbstractC23461c abstractC23461c2 = null;
            if (this.f33717g && this.f33718h.f33695j.m82623f8().m73665a().getOperatorConfig().getFeatures().getWakeBirds().getEnableSleepPowerline()) {
                abstractC23461c = this.f33718h.f33690e.mo71594O0(wireBird, new C38431bE5(null, wireBird.getId(), wireBird.getModel(), null, null, uuid, EnumC12346bH.SINGLE.name(), XD5.API.name(), null, null, null, 1817, null)).ignoreElements();
            } else {
                abstractC23461c = null;
            }
            if (BirdModel.Companion.fromString(wireBird.getModel()) != BirdModel.BD) {
                InterfaceC48164rd5 interfaceC48164rd5 = this.f33718h.f33700o;
                VehicleDescriptor m10640b = C49697uC6.m10640b(wireBird);
                boolean z = this.f33717g;
                String id = wireBird.getId();
                EnumC12346bH enumC12346bH = EnumC12346bH.SINGLE;
                abstractC23461c2 = interfaceC48164rd5.mo15678h(m10640b, z, new C4464KY(null, id, wireBird.getModel(), null, null, uuid, null, enumC12346bH.name(), null, null, null, 1881, null), new C38431bE5(null, wireBird.getId(), wireBird.getModel(), null, null, uuid, enumC12346bH.name(), XD5.BLUETOOTH.name(), null, null, null, 1817, null)).m33064V(SN4.m85595i(2L, TimeUnit.SECONDS).m85579g(this.f33718h.f33695j.m82623f8().getValue().getOperatorConfig().getFeatures().getWakeBirds().getBulkWakeMaxRetries()).m85585a());
            }
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new AbstractC23461c[]{abstractC23461c, abstractC23461c2});
            return AbstractC23461c.m33037r(listOfNotNull);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$h */
    /* loaded from: classes2.dex */
    public static final class C7436h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f33719g;

        /* renamed from: h */
        public final /* synthetic */ C7427SS f33720h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7436h(boolean z, C7427SS c7427ss) {
            super(1);
            this.f33719g = z;
            this.f33720h = c7427ss;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f33719g) {
                this.f33720h.f33704s.topToast(C45871nl4.sleep_bird_error, EnumC40735f56.SHORT);
            } else {
                this.f33720h.f33704s.topToast(C45871nl4.wake_bird_error, EnumC40735f56.SHORT);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$i */
    /* loaded from: classes2.dex */
    public static final class C7437i extends Lambda implements Function1<Unit, Unit> {
        public C7437i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C7427SS.this.m85456K(true);
            C7427SS.this.f33704s.dismissDialog();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$j */
    /* loaded from: classes2.dex */
    public static final class C7438j extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: SS$j$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C7439a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC38136ak5.values().length];
                try {
                    iArr[EnumC38136ak5.CODE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC38136ak5.QR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C7438j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C7427SS.this.f33687b.m37682S0();
            boolean isInRegistration = UserKt.isInRegistration(C7427SS.this.f33687b.m37750B0());
            Float f = (Float) C7427SS.this.f33684A.getValue();
            Double valueOf = f != null ? Double.valueOf(f.floatValue()) : null;
            int i = C7439a.$EnumSwitchMapping$0[C7427SS.this.f33704s.mo7477sk().ordinal()];
            if (i == 1) {
                C7427SS.this.f33685B.accept(EnumC38136ak5.CODE);
                C7427SS.this.f33689d.mo55905y(new C39342cm5(null, null, null, Boolean.valueOf(isInRegistration), valueOf, 7, null));
            } else if (i != 2) {
            } else {
                C7427SS.this.f33685B.accept(EnumC38136ak5.QR);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$k */
    /* loaded from: classes2.dex */
    public static final class C7440k extends Lambda implements Function1<Unit, Unit> {
        public C7440k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            boolean mo7485i = C7427SS.this.f33704s.mo7485i();
            InterfaceC1880Ea interfaceC1880Ea = C7427SS.this.f33689d;
            String str = mo7485i ? "on" : "off";
            Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(C7427SS.this.f33687b.m37750B0()));
            Float f = (Float) C7427SS.this.f33684A.getValue();
            Double valueOf2 = f != null ? Double.valueOf(f.floatValue()) : null;
            EnumC38136ak5 enumC38136ak5 = (EnumC38136ak5) C7427SS.this.f33685B.getValue();
            interfaceC1880Ea.mo55905y(new C38749bm5(null, null, null, str, valueOf, valueOf2, enumC38136ak5 != null ? enumC38136ak5.name() : null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXK;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXK;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$l */
    /* loaded from: classes2.dex */
    public static final class C7441l extends Lambda implements Function1<C9400XK, Unit> {
        public C7441l() {
            super(1);
        }

        /* renamed from: a */
        public final void m85394a(C9400XK c9400xk) {
            C7427SS.this.f33704s.mo7482jl();
            C7427SS.this.f33687b.m37686R0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C9400XK c9400xk) {
            m85394a(c9400xk);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXK;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXK;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$m */
    /* loaded from: classes2.dex */
    public static final class C7442m extends Lambda implements Function1<C9400XK, Unit> {
        public C7442m() {
            super(1);
        }

        /* renamed from: a */
        public final void m85393a(C9400XK c9400xk) {
            C7427SS.this.m85455L(c9400xk.m77124b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C9400XK c9400xk) {
            m85393a(c9400xk);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$n */
    /* loaded from: classes2.dex */
    public static final class C7443n extends Lambda implements Function1<Unit, Unit> {
        public C7443n() {
            super(1);
        }

        /* renamed from: b */
        public static final void m85391b(C7427SS this$0, RideConfig this_with) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            if (this$0.f33685B.getValue() == EnumC38136ak5.QR) {
                this$0.f33704s.mo7502Qa(this_with.getScannerCodeEntryTooltipLocalizedCopy(), true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            final RideConfig rideConfig = C7427SS.this.f33695j.m82623f8().m73665a().getRideConfig();
            final C7427SS c7427ss = C7427SS.this;
            if (!rideConfig.getEnableScannerCodeEntryTooltip() || c7427ss.f33687b.m37568u() >= rideConfig.getScannerCodeEntryTooltipMaxEntries() || c7427ss.f33687b.m37564v() >= rideConfig.getScannerCodeEntryTooltipMaxViews()) {
                return;
            }
            c7427ss.f33699n.postDelayed(new Runnable() { // from class: TS
                @Override // java.lang.Runnable
                public final void run() {
                    C7427SS.C7443n.m85391b(C7427SS.this, rideConfig);
                }
            }, TimeUnit.MILLISECONDS.convert(rideConfig.getScannerCodeEntryTooltipMaxDuration(), TimeUnit.SECONDS));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "enteredText", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$o */
    /* loaded from: classes2.dex */
    public static final class C7444o extends Lambda implements Function1<String, Unit> {
        public C7444o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String enteredText) {
            boolean startsWith;
            int maxBirdCodeLength = C7427SS.this.f33695j.m82623f8().getValue().getRideConfig().getMaxBirdCodeLength();
            Intrinsics.checkNotNullExpressionValue(enteredText, "enteredText");
            startsWith = StringsKt__StringsJVMKt.startsWith(enteredText, "no.", true);
            if (startsWith) {
                C7427SS.this.f33704s.mo7492d2(maxBirdCodeLength + 3);
            } else {
                C7427SS.this.f33704s.mo7492d2(maxBirdCodeLength);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LH31$b;", "kotlin.jvm.PlatformType", "dialogWithResponse", "", C17296a.f69688o, "(LH31$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$p */
    /* loaded from: classes2.dex */
    public static final class C7445p extends Lambda implements Function1<H31.AbstractC3016b, Unit> {
        public C7445p() {
            super(1);
        }

        /* renamed from: a */
        public final void m85390a(H31.AbstractC3016b abstractC3016b) {
            if (abstractC3016b instanceof H31.AbstractC3016b.C3019c) {
                C7427SS.this.m85455L(((H31.AbstractC3016b.C3019c) abstractC3016b).m104470b());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(H31.AbstractC3016b abstractC3016b) {
            m85390a(abstractC3016b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/BirdScan;", "scanResponse", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$q */
    /* loaded from: classes2.dex */
    public static final class C7446q extends Lambda implements Function1<HM4<BirdScan>, InterfaceC23434B<? extends HM4<BirdScan>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "dialogResponse", "Lio/reactivex/B;", "LHM4;", "Lco/bird/android/model/BirdScan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: SS$q$a */
        /* loaded from: classes2.dex */
        public static final class C7447a extends Lambda implements Function1<DialogResponse, InterfaceC23434B<? extends HM4<BirdScan>>> {

            /* renamed from: g */
            public final /* synthetic */ HM4<BirdScan> f33730g;

            /* renamed from: h */
            public final /* synthetic */ C7427SS f33731h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: SS$q$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C7448a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DialogResponse.values().length];
                    try {
                        iArr[DialogResponse.OK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7447a(HM4<BirdScan> hm4, C7427SS c7427ss) {
                super(1);
                this.f33730g = hm4;
                this.f33731h = c7427ss;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<? extends HM4<BirdScan>> invoke(DialogResponse dialogResponse) {
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                if (C7448a.$EnumSwitchMapping$0[dialogResponse.ordinal()] == 1) {
                    return Observable.just(this.f33730g);
                }
                this.f33731h.f33705t.mo37030e3();
                return Observable.empty();
            }
        }

        public C7446q() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23434B m85387c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends HM4<BirdScan>> invoke(HM4<BirdScan> scanResponse) {
            ScanStatus scanStatus;
            Intrinsics.checkNotNullParameter(scanResponse, "scanResponse");
            BirdScan m103944a = scanResponse.m103944a();
            if (m103944a != null) {
                scanStatus = m103944a.getStatus();
            } else {
                scanStatus = null;
            }
            if (scanStatus == ScanStatus.SHOW_PRECAPTURE_MODAL) {
                AbstractC23442F agreementDialog$default = H31.C3014a.agreementDialog$default(C7427SS.this.f33704s, C49419tk5.f110960d, false, false, 4, null);
                final C7447a c7447a = new C7447a(scanResponse, C7427SS.this);
                return agreementDialog$default.m33162D(new InterfaceC23492o() { // from class: US
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m85387c;
                        m85387c = C7427SS.C7446q.m85387c(Function1.this, obj);
                        return m85387c;
                    }
                });
            }
            return Observable.just(scanResponse);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/BirdScan;", "kotlin.jvm.PlatformType", "scanResponse", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$r */
    /* loaded from: classes2.dex */
    public static final class C7449r extends Lambda implements Function1<HM4<BirdScan>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BirdAction f33732g;

        /* renamed from: h */
        public final /* synthetic */ C7427SS f33733h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7449r(BirdAction birdAction, C7427SS c7427ss) {
            super(1);
            this.f33732g = birdAction;
            this.f33733h = c7427ss;
        }

        /* renamed from: a */
        public final void m85385a(HM4<BirdScan> hm4) {
            BirdScan m103944a = hm4.m103944a();
            if (m103944a != null) {
                BirdAction birdAction = this.f33732g;
                C7427SS c7427ss = this.f33733h;
                if (birdAction == BirdAction.GET_CODE) {
                    c7427ss.m85440a0(m103944a);
                    return;
                }
                WireBird bird = m103944a.getBird();
                if (bird != null) {
                    c7427ss.f33688c.mo104915c(new C12395bT(bird, birdAction));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BirdScan> hm4) {
            m85385a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$s */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7450s extends FunctionReferenceImpl implements Function1<HM4<BirdScan>, Unit> {
        public C7450s(Object obj) {
            super(1, obj, C7427SS.class, "onScanSuccess", "onScanSuccess(Lretrofit2/Response;)V", 0);
        }

        /* renamed from: a */
        public final void m85384a(HM4<BirdScan> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C7427SS) this.receiver).m85442Y(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BirdScan> hm4) {
            m85384a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$t */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7451t extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C7451t(Object obj) {
            super(1, obj, C7427SS.class, "onScanError", "onScanError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C7427SS) this.receiver).m85443X(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "LbT2;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SS$u */
    /* loaded from: classes2.dex */
    public static final class C7452u extends Lambda implements Function1<HM4<C38563bT2>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f33735h;

        /* renamed from: i */
        public final /* synthetic */ String f33736i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7452u(String str, String str2) {
            super(1);
            this.f33735h = str;
            this.f33736i = str2;
        }

        /* renamed from: a */
        public final void m85383a(HM4<C38563bT2> response) {
            String str;
            String str2;
            WireMerchantSite m64517b;
            WireMerchantSite m64517b2;
            WireMerchantDescription merchant;
            C38563bT2 m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                String id = m103944a.m64517b().getId();
                C7427SS.this.m85408r0(true, this.f33735h, m103944a.m64517b().getMerchant().getId(), id, this.f33736i);
                C7427SS.this.f33705t.mo37116O3(id, this.f33736i, true);
                C7427SS.this.f33705t.close();
                return;
            }
            C7427SS c7427ss = C7427SS.this;
            String str3 = this.f33735h;
            String str4 = null;
            if (m103944a != null && (m64517b2 = m103944a.m64517b()) != null && (merchant = m64517b2.getMerchant()) != null) {
                str = merchant.getId();
            } else {
                str = null;
            }
            if (m103944a != null && (m64517b = m103944a.m64517b()) != null) {
                str2 = m64517b.getId();
            } else {
                str2 = null;
            }
            c7427ss.m85408r0(true, str3, str, str2, this.f33736i);
            InterfaceC10274ZS interfaceC10274ZS = C7427SS.this.f33704s;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str4 = m94017d.m11932c();
            }
            interfaceC10274ZS.error(str4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<C38563bT2> hm4) {
            m85383a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$v */
    /* loaded from: classes2.dex */
    public static final class C7453v extends Lambda implements Function1<Throwable, Unit> {
        public C7453v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            InterfaceC10274ZS interfaceC10274ZS = C7427SS.this.f33704s;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            interfaceC10274ZS.error(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$w */
    /* loaded from: classes2.dex */
    public static final class C7454w extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC5751Ny f33738g;

        /* renamed from: h */
        public final /* synthetic */ C7427SS f33739h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7454w(AbstractC5751Ny abstractC5751Ny, C7427SS c7427ss) {
            super(0);
            this.f33738g = abstractC5751Ny;
            this.f33739h = c7427ss;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f33738g instanceof C34621Mw2) {
                this.f33739h.f33705t.mo37192C();
            } else {
                this.f33739h.m85456K(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$x */
    /* loaded from: classes2.dex */
    public static final class C7455x extends Lambda implements Function0<Unit> {
        public C7455x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C7427SS.this.m85456K(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$y */
    /* loaded from: classes2.dex */
    public static final class C7456y extends Lambda implements Function0<Unit> {
        public C7456y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC40099e13 interfaceC40099e13 = C7427SS.this.f33705t;
            Intent putExtra = new Intent().putExtra("navigate_to_long_term_rental", true);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras…O_LONG_TERM_RENTAL, true)");
            interfaceC40099e13.mo37029e4(-1, putExtra);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SS$z */
    /* loaded from: classes2.dex */
    public static final class C7457z extends Lambda implements Function0<Unit> {
        public C7457z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C7427SS.this.m85456K(true);
        }
    }

    public C7427SS(C22454gl preference, InterfaceC32604Eg1 eventBus, InterfaceC1880Ea analyticsManager, InterfaceC10636aM birdManager, InterfaceC23227iO birdPayManager, InterfaceC35422Qh2 jobProducer, YR4 rideManager, AbstractC39873de5 rxBleClient, C36207Tq4 reactiveConfig, InterfaceC40001dr4 locationManager, InterfaceC36675Vq4 eventStream, SensorManager sensorManager, Handler handler, InterfaceC48164rd5 bluetoothManagerRxBle, InterfaceC27246pJ bluetoothManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, ScanBarcodeExtra extras, InterfaceC10274ZS ui, InterfaceC40099e13 navigator, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(birdPayManager, "birdPayManager");
        Intrinsics.checkNotNullParameter(jobProducer, "jobProducer");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(eventStream, "eventStream");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(bluetoothManagerRxBle, "bluetoothManagerRxBle");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f33687b = preference;
        this.f33688c = eventBus;
        this.f33689d = analyticsManager;
        this.f33690e = birdManager;
        this.f33691f = birdPayManager;
        this.f33692g = jobProducer;
        this.f33693h = rideManager;
        this.f33694i = rxBleClient;
        this.f33695j = reactiveConfig;
        this.f33696k = locationManager;
        this.f33697l = eventStream;
        this.f33698m = sensorManager;
        this.f33699n = handler;
        this.f33700o = bluetoothManagerRxBle;
        this.f33701p = bluetoothManager;
        this.f33702q = scopeProvider;
        this.f33703r = extras;
        this.f33704s = ui;
        this.f33705t = navigator;
        this.f33706u = z;
        this.f33707v = z2;
        this.f33709x = true;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f33710y = m31902e;
        this.f33711z = sensorManager.getDefaultSensor(5);
        C0058AG<Float> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Float>()");
        this.f33684A = m115951g;
        C0058AG<EnumC38136ak5> m115950h = C0058AG.m115950h(EnumC38136ak5.QR);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<ScanEntryMode>(ScanEntryMode.QR)");
        this.f33685B = m115950h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public static /* synthetic */ void m85464C(C7427SS c7427ss, WireBird wireBird, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = C7433e.f33715g;
        }
        c7427ss.m85465B(wireBird, function1);
    }

    /* renamed from: G */
    public static final void m85460G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23496h m85459H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m85458I(boolean z, C7427SS this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.f33704s.topToast(C45871nl4.sleep_bird_action_success_text, EnumC40735f56.SHORT);
        } else {
            this$0.f33704s.topToast(C45871nl4.wake_bird_action_success_text, EnumC40735f56.SHORT);
        }
    }

    /* renamed from: J */
    public static final void m85457J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m85451P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m85450Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m85449R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m85448S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m85447T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m85446U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m85445V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m85444W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23434B m85435d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m85433e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m85431f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m85429g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m85423j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m85421k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m85415n0(C7427SS c7427ss, AbstractC5751Ny abstractC5751Ny, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c7427ss.m85417m0(abstractC5751Ny, str);
    }

    /* renamed from: y */
    public static final void m85400y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m85399z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m85466A() {
        this.f33710y.onNext(Unit.INSTANCE);
    }

    /* renamed from: B */
    public final void m85465B(WireBird wireBird, Function1<? super Intent, Unit> function1) {
        InterfaceC40099e13 interfaceC40099e13 = this.f33705t;
        Intent intent = new Intent();
        intent.putExtra("bird", wireBird);
        function1.invoke(intent);
        Unit unit = Unit.INSTANCE;
        interfaceC40099e13.mo37190C1(-1, intent);
    }

    /* renamed from: D */
    public final boolean m85463D(MapMode mapMode, ScanStatus scanStatus, BirdAction birdAction) {
        return mapMode == MapMode.RIDER && scanStatus != ScanStatus.INVALID_CODE && birdAction == BirdAction.GET_CODE;
    }

    /* renamed from: E */
    public final boolean m85462E(MapMode mapMode, WireBird wireBird) {
        Set of;
        of = SetsKt__SetsJVMKt.setOf(MapMode.RIDER);
        if (of.contains(mapMode)) {
            return wireBird != null && C9779YS.m75015a(wireBird);
        }
        return false;
    }

    /* renamed from: F */
    public final void m85461F(String str, WireBird wireBird, MapMode mapMode, final boolean z) {
        AbstractC23442F<WireBird> mo71596M0;
        if (mapMode != MapMode.RIDER && str != null) {
            if (wireBird == null || (mo71596M0 = AbstractC23442F.m33158H(wireBird)) == null) {
                mo71596M0 = this.f33690e.mo71596M0(str);
            }
            final C7435g c7435g = new C7435g(z, this);
            AbstractC23461c m33070P = mo71596M0.m33164B(new InterfaceC23492o() { // from class: DS
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m85459H;
                    m85459H = C7427SS.m85459H(Function1.this, obj);
                    return m85459H;
                }
            }).m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "private fun enableDeepSl…r)\n      .subscribe()\n  }");
            AbstractC23461c m33029z = C28237sD.progress$default(m33070P, this.f33704s, 0, 2, (Object) null).m33029z(new InterfaceC23478a() { // from class: ES
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C7427SS.m85458I(z, this);
                }
            });
            final C7436h c7436h = new C7436h(z, this);
            AbstractC23461c m33063X = m33029z.m33084B(new InterfaceC23484g() { // from class: FS
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7427SS.m85457J(Function1.this, obj);
                }
            }).m33069Q().m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "private fun enableDeepSl…r)\n      .subscribe()\n  }");
            Object m33041n = m33063X.m33041n(AutoDispose.m45239a(this.f33702q));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
            return;
        }
        AbstractC23442F<DialogResponse> m33152N = m85413o0(z).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "showDeepSleepError(enabl…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7434f c7434f = new C7434f();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: CS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85460G(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public final void m85456K(boolean z) {
        C7427SS c7427ss;
        this.f33709x = z;
        if (z) {
            c7427ss = this;
        } else {
            c7427ss = null;
        }
        this.f33704s.mo7481l5(c7427ss);
        if (z) {
            this.f33704s.mo7479n1();
        }
    }

    /* renamed from: L */
    public final void m85455L(String str) {
        RideConfig rideConfig = this.f33695j.m82623f8().getValue().getRideConfig();
        if (!m85427h0(str, false, this.f33707v)) {
            H31.C3014a.showDialog$default(this.f33704s, new C43490jk5(rideConfig.getMinBirdCodeLength(), rideConfig.getMaxBirdCodeLength()), false, false, null, null, null, null, 126, null);
        }
    }

    /* renamed from: M */
    public final boolean m85454M(String str) {
        RideConfig rideConfig = this.f33695j.m82623f8().m73665a().getRideConfig();
        int minBirdCodeLength = rideConfig.getMinBirdCodeLength();
        int maxBirdCodeLength = rideConfig.getMaxBirdCodeLength();
        int length = str.length();
        if (minBirdCodeLength > length || length > maxBirdCodeLength) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public void m85453N(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f33686C = bird;
    }

    /* renamed from: O */
    public final void m85452O() {
        Object m33094as = this.f33710y.m33094as(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7437i c7437i = new C7437i();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: GS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85451P(Function1.this, obj);
            }
        });
    }

    /* renamed from: X */
    public final void m85443X(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f33704s.errorGeneric();
        m85439b0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m85442Y(HM4<BirdScan> scanResponse) {
        String m11932c;
        Unit unit;
        Object obj;
        int i;
        Unit unit2;
        Set of;
        boolean contains;
        boolean m75013c;
        String str;
        ScanStatus status;
        String str2;
        String str3;
        EnumC38136ak5 value;
        String str4;
        Intrinsics.checkNotNullParameter(scanResponse, "scanResponse");
        BirdScan m103944a = scanResponse.m103944a();
        if (m103944a != null) {
            WireBird bird = m103944a.getBird();
            if (this.f33703r.getMode() == MapMode.RIDER) {
                m85410q0(bird);
                RideConfig rideConfig = this.f33695j.m82623f8().m73665a().getRideConfig();
                InterfaceC1880Ea interfaceC1880Ea = this.f33689d;
                String birdCode = m103944a.getBirdCode();
                if (birdCode == null) {
                    if (bird != null) {
                        birdCode = bird.getCode();
                    } else {
                        str = null;
                        status = m103944a.getStatus();
                        if (status == null) {
                            str2 = status.name();
                        } else {
                            str2 = null;
                        }
                        String currency = this.f33695j.m82623f8().m73665a().getRideConfig().getCurrency();
                        long minimumRidePrice = rideConfig.getMinimumRidePrice();
                        long minutePrice = rideConfig.getMinutePrice();
                        String str5 = str;
                        long includedMinutes = rideConfig.getIncludedMinutes();
                        if (bird == null) {
                            str3 = bird.getPartnerId();
                        } else {
                            str3 = null;
                        }
                        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
                        long basePrice = rideConfig.getBasePrice();
                        Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(this.f33687b.m37750B0()));
                        value = this.f33685B.getValue();
                        if (value == null) {
                            str4 = value.name();
                        } else {
                            str4 = null;
                        }
                        interfaceC1880Ea.mo55905y(new C32086Ca5(null, null, null, str5, str2, currency, minimumRidePrice, minutePrice, includedMinutes, str3, applyTax, basePrice, valueOf, str4, null, 16391, null));
                    }
                }
                str = birdCode;
                status = m103944a.getStatus();
                if (status == null) {
                }
                String currency2 = this.f33695j.m82623f8().m73665a().getRideConfig().getCurrency();
                long minimumRidePrice2 = rideConfig.getMinimumRidePrice();
                long minutePrice2 = rideConfig.getMinutePrice();
                String str52 = str;
                long includedMinutes2 = rideConfig.getIncludedMinutes();
                if (bird == null) {
                }
                boolean applyTax2 = rideConfig.getAdditionalFees().getApplyTax();
                long basePrice2 = rideConfig.getBasePrice();
                Boolean valueOf2 = Boolean.valueOf(UserKt.isInRegistration(this.f33687b.m37750B0()));
                value = this.f33685B.getValue();
                if (value == null) {
                }
                interfaceC1880Ea.mo55905y(new C32086Ca5(null, null, null, str52, str2, currency2, minimumRidePrice2, minutePrice2, includedMinutes2, str3, applyTax2, basePrice2, valueOf2, str4, null, 16391, null));
            }
            WireBird wireBird = this.f33686C;
            boolean z = false;
            if (wireBird != null) {
                if (bird == null) {
                    m85439b0();
                    AbstractC23442F m33152N = H31.C3014a.dialog$default(this.f33704s, C49202tN5.f110378d, false, false, 6, null).m33152N(C23454a.m33087a());
                    Intrinsics.checkNotNullExpressionValue(m33152N, "ui.dialog(SomethingWentW…dSchedulers.mainThread())");
                    Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f33702q));
                    Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                    obj = ((SingleSubscribeProxy) m33135e).subscribe();
                } else {
                    if (wireBird != null) {
                        m75013c = C9779YS.m75013c(wireBird, bird);
                        if (m75013c) {
                            z = true;
                        }
                    }
                    if (!z) {
                        m85439b0();
                        AbstractC23442F m33152N2 = H31.C3014a.dialog$default(this.f33704s, C46185oH6.f101732d, false, false, 6, null).m33152N(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(m33152N2, "ui.dialog(WrongBirdScann…dSchedulers.mainThread())");
                        Object m33135e2 = m33152N2.m33135e(AutoDispose.m45239a(this.f33702q));
                        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
                        obj = ((SingleSubscribeProxy) m33135e2).subscribe();
                    } else {
                        m85464C(this, bird, null, 2, null);
                        obj = Unit.INSTANCE;
                    }
                }
            } else {
                if (this.f33706u && bird != null) {
                    of = SetsKt__SetsKt.setOf((Object[]) new ScanStatus[]{ScanStatus.QR_DETACHED, ScanStatus.INVALID_CODE});
                    contains = CollectionsKt___CollectionsKt.contains(of, m103944a.getStatus());
                    if (!contains) {
                        m85464C(this, bird, null, 2, null);
                        obj = Unit.INSTANCE;
                    }
                }
                if (m85441Z(this.f33703r.getMode(), m103944a.getStatus())) {
                    BirdAction action = this.f33703r.getAction();
                    if (action == null) {
                        i = -1;
                    } else {
                        i = C7430b.$EnumSwitchMapping$1[action.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (bird != null) {
                                        if (this.f33703r.getDamageStatusUpdate()) {
                                            this.f33697l.mo77816a(bird);
                                            this.f33705t.mo37030e3();
                                        } else {
                                            Contractor m37715K = this.f33687b.m37715K();
                                            if (m37715K != null) {
                                                z = m37715K.isHourly(this.f33695j.m82623f8().getValue());
                                            }
                                            this.f33704s.mo7488ec(bird, z);
                                        }
                                        unit2 = Unit.INSTANCE;
                                    } else {
                                        unit2 = null;
                                    }
                                    if (unit2 == null) {
                                        this.f33704s.mo7475u5();
                                    }
                                    m85456K(true);
                                    obj = Unit.INSTANCE;
                                } else {
                                    String birdId = m103944a.getBirdId();
                                    if (birdId != null) {
                                        this.f33705t.mo37112P1(birdId);
                                        obj = Unit.INSTANCE;
                                    }
                                    obj = null;
                                }
                            } else {
                                m85401x(m103944a.getBirdId(), bird);
                                obj = Unit.INSTANCE;
                            }
                        } else {
                            m85461F(m103944a.getBirdId(), bird, this.f33703r.getMode(), true);
                            m85456K(true);
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        m85461F(m103944a.getBirdId(), bird, this.f33703r.getMode(), false);
                        m85456K(true);
                        obj = Unit.INSTANCE;
                    }
                } else if (m85463D(this.f33703r.getMode(), m103944a.getStatus(), this.f33708w)) {
                    this.f33705t.mo37030e3();
                    obj = Unit.INSTANCE;
                } else if (m85462E(this.f33703r.getMode(), bird)) {
                    if (bird != null) {
                        if (WireBirdKt.isAsleep(bird)) {
                            this.f33705t.mo37030e3();
                            m85406s0(bird);
                        } else {
                            this.f33705t.mo37030e3();
                        }
                        obj = Unit.INSTANCE;
                    }
                    obj = null;
                } else {
                    AbstractC5751Ny m91146a = C6212Oy.m91146a(m103944a.getMode(), m103944a.getStatus(), this.f33695j);
                    if (m91146a != null) {
                        m85419l0(m91146a);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        m85464C(this, bird, null, 2, null);
                    }
                    obj = Unit.INSTANCE;
                }
            }
            if (obj != null) {
                return;
            }
        }
        C49375tg1 m94017d = NM4.m94017d(scanResponse);
        if (m94017d != null && (m11932c = m94017d.m11932c()) != null) {
            this.f33704s.error(m11932c);
            Unit unit3 = Unit.INSTANCE;
        }
    }

    /* renamed from: Z */
    public final boolean m85441Z(MapMode mapMode, ScanStatus scanStatus) {
        return (mapMode != MapMode.OPERATOR || scanStatus == ScanStatus.INVALID_CODE || scanStatus == ScanStatus.QR_DETACHED) ? false : true;
    }

    @Override // p000.InterfaceC30175xS
    /* renamed from: a */
    public void mo5252a() {
        this.f33708w = this.f33703r.getAction();
        Object m33094as = this.f33704s.mo7478sa().m33094as(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7438j c7438j = new C7438j();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85450Q(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f33704s.mo7472z1().m33094as(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7440k c7440k = new C7440k();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: JS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85449R(Function1.this, obj);
            }
        });
        Observable<C9400XK> mo7497W3 = this.f33704s.mo7497W3();
        final C7441l c7441l = new C7441l();
        Observable<C9400XK> doOnNext = mo7497W3.doOnNext(new InterfaceC23484g() { // from class: KS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85448S(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate() …ScanNewQrCode()\n    }\n  }");
        Object m33094as3 = doOnNext.m33094as(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7442m c7442m = new C7442m();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: LS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85447T(Function1.this, obj);
            }
        });
        Observable<Unit> take = this.f33704s.mo7499Vg().take(1L);
        Intrinsics.checkNotNullExpressionValue(take, "ui.globalLayoutChanges()\n      .take(1)");
        Object m33094as4 = take.m33094as(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7443n c7443n = new C7443n();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: MS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85446U(Function1.this, obj);
            }
        });
        if (this.f33707v) {
            this.f33704s.mo7492d2(this.f33695j.m82623f8().getValue().getRideConfig().getMaxBirdCodeLength());
            Object m33094as5 = this.f33704s.mo7471zc().m33094as(AutoDispose.m45239a(this.f33702q));
            Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C7444o c7444o = new C7444o();
            ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: NS
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7427SS.m85445V(Function1.this, obj);
                }
            });
        }
        m85452O();
        m85466A();
        int i = C7430b.$EnumSwitchMapping$0[this.f33703r.getScanType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f33704s.mo7486gk();
                    return;
                }
                return;
            }
            this.f33704s.mo7496Yi();
            return;
        }
        this.f33704s.mo7476tc(this.f33703r.getBirdCode());
    }

    /* renamed from: a0 */
    public final void m85440a0(BirdScan birdScan) {
        String birdId;
        String birdCode = birdScan.getBirdCode();
        if (birdCode != null && (birdId = birdScan.getBirdId()) != null) {
            this.f33688c.mo104915c(new C13581cT(birdCode, birdId));
        }
    }

    @Override // p000.InterfaceC41138fm5
    /* renamed from: b */
    public void mo40823b(C40545em5 rawResult) {
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        String m42565b = rawResult.m42565b();
        if (m42565b == null) {
            return;
        }
        m85427h0(m42565b, true, false);
    }

    /* renamed from: b0 */
    public final void m85439b0() {
        if (this.f33709x) {
            this.f33704s.mo7481l5(this);
        }
        this.f33704s.mo7479n1();
    }

    /* renamed from: c0 */
    public final void m85437c0(String str, BirdAction birdAction, boolean z, String str2) {
        Observable progress$default = C28237sD.progress$default(this.f33690e.mo71586W0(str, this.f33687b.m37571t0(), this.f33703r.getIntention(), z, str2), this.f33704s, 0, 2, (Object) null);
        final C7446q c7446q = new C7446q();
        Observable flatMap = progress$default.flatMap(new InterfaceC23492o() { // from class: QS
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m85435d0;
                m85435d0 = C7427SS.m85435d0(Function1.this, obj);
                return m85435d0;
            }
        });
        final C7449r c7449r = new C7449r(birdAction, this);
        Observable observeOn = flatMap.doAfterNext(new InterfaceC23484g() { // from class: RS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85433e0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun scan(code: S…ccess, ::onScanError)\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7450s c7450s = new C7450s(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: zS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85431f0(Function1.this, obj);
            }
        };
        final C7451t c7451t = new C7451t(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: AS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85429g0(Function1.this, obj);
            }
        });
    }

    /* renamed from: h0 */
    public final boolean m85427h0(String str, boolean z, boolean z2) {
        CharSequence trim;
        C33894Jt4 c33894Jt4 = C33894Jt4.f18402a;
        String m99597e = c33894Jt4.m99597e(str);
        boolean enableBirdPay = this.f33695j.m82623f8().m73665a().getBirdPayConfig().getEnableBirdPay();
        String m99598d = c33894Jt4.m99598d(str);
        trim = StringsKt__StringsKt.trim((CharSequence) C45097mS5.m25595k(str, "no.", true));
        String obj = trim.toString();
        if (m99597e != null) {
            if (this.f33703r.getScanType() != ScanType.EXISTING_QR_CODE) {
                this.f33688c.mo104915c(new C20042eT(ScanType.NEW_QR_CODE, m99597e));
                this.f33705t.mo37030e3();
                return true;
            }
            BirdAction birdAction = this.f33708w;
            if (!z) {
                str = null;
            }
            m85437c0(m99597e, birdAction, z, str);
            return true;
        } else if (m99598d != null && enableBirdPay) {
            m85425i0(m99598d, str);
            return true;
        } else if (this.f33703r.getScanType() != ScanType.EXISTING_QR_CODE) {
            this.f33688c.mo104915c(new C20042eT(ScanType.SERIAL_NUMBER, str));
            this.f33705t.mo37030e3();
            return true;
        } else if (z2 && !m85454M(obj)) {
            return false;
        } else {
            BirdAction birdAction2 = this.f33708w;
            if (!z) {
                str = null;
            }
            m85437c0(obj, birdAction2, z, str);
            return true;
        }
    }

    /* renamed from: i0 */
    public final void m85425i0(String str, String str2) {
        AbstractC23442F m33152N = C28237sD.progress$default(this.f33691f.mo27356k(str), this.f33704s, 0, 2, (Object) null).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "birdPayManager.scan(merc…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7452u c7452u = new C7452u(str2, str);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: OS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85423j0(Function1.this, obj);
            }
        };
        final C7453v c7453v = new C7453v();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: PS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85421k0(Function1.this, obj);
            }
        });
    }

    /* renamed from: l0 */
    public final void m85419l0(AbstractC5751Ny abstractC5751Ny) {
        if (abstractC5751Ny instanceof C52976zk5) {
            m85411p0();
        } else {
            m85415n0(this, abstractC5751Ny, null, 2, null);
        }
    }

    /* renamed from: m0 */
    public final void m85417m0(AbstractC5751Ny abstractC5751Ny, String str) {
        H31.C3014a.showDialog$default(this.f33704s, abstractC5751Ny, false, false, new C7454w(abstractC5751Ny, this), new C7455x(), null, str, 36, null);
    }

    /* renamed from: o0 */
    public final AbstractC23442F<DialogResponse> m85413o0(boolean z) {
        if (z) {
            return this.f33704s.dialog(ZD5.f47999d, false, true);
        }
        return this.f33704s.dialog(C50133uw6.f113224d, false, true);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // p000.InterfaceC30175xS
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10013 && i2 == -1) {
            this.f33705t.close();
        }
    }

    @Override // p000.InterfaceC30175xS
    public void onBackPressed() {
        this.f33705t.mo37030e3();
    }

    @Override // p000.InterfaceC30175xS
    public void onPause() {
        this.f33698m.unregisterListener(this);
        C41318g46.m40151m("camera: onPause", new Object[0]);
        this.f33704s.mo7495a1();
    }

    @Override // p000.InterfaceC30175xS
    public void onResume() {
        this.f33698m.registerListener(this, this.f33711z, 10000000);
        C41318g46.m40151m("camera: onResume", new Object[0]);
        this.f33704s.mo7491d6(0.2f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            this.f33684A.accept(Float.valueOf(sensorEvent.values[0]));
        }
    }

    /* renamed from: p0 */
    public final void m85411p0() {
        H31.C3014a.showCustomDialog$default((H31) this.f33704s, C39311cj4.dialog_private_bird_scanned_error, (Integer) null, (Integer) null, false, false, false, (Integer) null, (Integer) null, (CharSequence) null, (CharSequence) null, C36585Vg4.positiveButton, Integer.valueOf(C36585Vg4.negativeButton), (String) null, (String) null, (Function0) new C7456y(), (Function0) new C7457z(), (Function0) new C7428A(), (Function0) null, false, 406526, (Object) null);
    }

    @Override // p000.InterfaceC30175xS
    /* renamed from: q */
    public void mo5251q() {
        AbstractC23442F<H31.AbstractC3016b> m33152N = this.f33704s.mo71345M(C45871nl4.enter_code, C45871nl4.enter_vehicle_code_dialog_hint).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "ui.enterCodeDialogWithRe…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7445p c7445p = new C7445p();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: BS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85444W(Function1.this, obj);
            }
        });
    }

    /* renamed from: q0 */
    public final void m85410q0(WireBird wireBird) {
        WireLocation location;
        if (wireBird != null && (location = wireBird.getLocation()) != null) {
            this.f33696k.mo43630b(location.fromLocation());
        }
    }

    /* renamed from: r0 */
    public final void m85408r0(boolean z, String str, String str2, String str3, String str4) {
        this.f33689d.mo55905y(new C20834gN(null, null, null, z, str, str2, str3, str4, 7, null));
    }

    /* renamed from: s0 */
    public final void m85406s0(WireBird wireBird) {
        C9779YS.m75014b(this.f33692g, wireBird, false);
    }

    /* renamed from: x */
    public final void m85401x(String str, WireBird wireBird) {
        AbstractC23442F<WireBird> abstractC23442F;
        if (str == null) {
            AbstractC23442F<DialogResponse> m33152N = this.f33704s.dialog(C46989pe6.f103875d, false, false).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "ui.dialog(alert = Unlock…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f33702q));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C7431c c7431c = new C7431c();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: HS
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C7427SS.m85400y(Function1.this, obj);
                }
            });
            return;
        }
        if (wireBird != null) {
            abstractC23442F = AbstractC23442F.m33158H(wireBird);
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            abstractC23442F = this.f33690e.mo71596M0(str);
        }
        AbstractC23442F m33142Y = C28237sD.progress$default(abstractC23442F, this.f33704s, 0, 2, (Object) null).m33152N(C23454a.m33087a()).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "bird?.let {\n      Single…scribeOn(Schedulers.io())");
        Object m33135e2 = m33142Y.m33135e(AutoDispose.m45239a(this.f33702q));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7432d c7432d = new C7432d();
        ((SingleSubscribeProxy) m33135e2).subscribe(new InterfaceC23484g() { // from class: IS
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7427SS.m85399z(Function1.this, obj);
            }
        });
    }

    public /* synthetic */ C7427SS(C22454gl c22454gl, InterfaceC32604Eg1 interfaceC32604Eg1, InterfaceC1880Ea interfaceC1880Ea, InterfaceC10636aM interfaceC10636aM, InterfaceC23227iO interfaceC23227iO, InterfaceC35422Qh2 interfaceC35422Qh2, YR4 yr4, AbstractC39873de5 abstractC39873de5, C36207Tq4 c36207Tq4, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC36675Vq4 interfaceC36675Vq4, SensorManager sensorManager, Handler handler, InterfaceC48164rd5 interfaceC48164rd5, InterfaceC27246pJ interfaceC27246pJ, LifecycleScopeProvider lifecycleScopeProvider, ScanBarcodeExtra scanBarcodeExtra, InterfaceC10274ZS interfaceC10274ZS, InterfaceC40099e13 interfaceC40099e13, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22454gl, interfaceC32604Eg1, interfaceC1880Ea, interfaceC10636aM, interfaceC23227iO, interfaceC35422Qh2, yr4, abstractC39873de5, c36207Tq4, interfaceC40001dr4, interfaceC36675Vq4, sensorManager, handler, interfaceC48164rd5, interfaceC27246pJ, lifecycleScopeProvider, scanBarcodeExtra, interfaceC10274ZS, interfaceC40099e13, (i & 524288) != 0 ? false : z, z2);
    }
}
