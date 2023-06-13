package p000;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.coreinterface.manager.PairException;
import co.bird.android.model.BirdScan;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Reservation;
import co.bird.android.model.RideStates;
import co.bird.android.model.ScanlessRideItem;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.VehiclePricingDetails;
import co.bird.android.model.analytics.PriceChangeDetected;
import co.bird.android.model.analytics.PriceIncreaseModalShown;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.PriceOnScannerKind;
import co.bird.android.model.constant.ScanStatus;
import co.bird.android.model.extra.RiderBirdScanExtra;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireError;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.AbstractC26684u0;
import okhttp3.internal.http2.Http2Connection;
import p000.H31;
import p000.InterfaceC42324hm5;
import p000.InterfaceC5225MD;
import p000.O85;
@Metadata(m28433d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Ê\u00012\u00020\u00012\u00020\u0002:\u0001LBê\u0001\b\u0007\u0012\u0006\u0010[\u001a\u00020+\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p\u0012\u0006\u0010w\u001a\u00020t\u0012\u0006\u0010{\u001a\u00020x\u0012\u0006\u0010\u007f\u001a\u00020|\u0012\b\u0010\u0083\u0001\u001a\u00030\u0080\u0001\u0012\b\u0010\u0087\u0001\u001a\u00030\u0084\u0001\u0012\b\u0010\u008b\u0001\u001a\u00030\u0088\u0001\u0012\b\u0010\u008f\u0001\u001a\u00030\u008c\u0001\u0012\b\u0010\u0093\u0001\u001a\u00030\u0090\u0001\u0012\b\u0010\u0097\u0001\u001a\u00030\u0094\u0001\u0012\b\u0010\u009b\u0001\u001a\u00030\u0098\u0001\u0012\b\u0010\u009f\u0001\u001a\u00030\u009c\u0001\u0012\b\u0010£\u0001\u001a\u00030 \u0001\u0012\b\u0010§\u0001\u001a\u00030¤\u0001\u0012\u0011\b\u0001\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u0001\u0012\n\b\u0001\u0010°\u0001\u001a\u00030\u00ad\u0001\u0012\n\b\u0001\u0010´\u0001\u001a\u00030±\u0001¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\f\u0010\u0012\u001a\u00020\u0005*\u00020\u0003H\u0002J$\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0016\u0010\u001c\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J@\u0010&\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r0\"¢\u0006\u0002\b$H\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002J\u0014\u0010-\u001a\u00020\u0003*\u00020+2\u0006\u0010,\u001a\u00020\u0003H\u0002J\u001a\u0010/\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u00102\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000100H\u0002J\u0018\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0005H\u0002J\b\u00107\u001a\u00020\rH\u0002J\u0010\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0005H\u0002J\u0012\u0010<\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0018H\u0002J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0018H\u0002J\u0012\u0010@\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010A\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010B\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010:H\u0002J\b\u0010C\u001a\u00020\rH\u0002J\f\u0010D\u001a\u00020\r*\u000200H\u0002J\b\u0010E\u001a\u00020\rH\u0002J6\u0010K\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010J\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010L\u001a\u00020\rH\u0016J\b\u0010M\u001a\u00020\rH\u0016J\b\u0010N\u001a\u00020\rH\u0016J\u0010\u0010Q\u001a\u00020\r2\u0006\u0010P\u001a\u00020OH\u0016J\u0012\u0010T\u001a\u00020\r2\b\u0010S\u001a\u0004\u0018\u00010RH\u0016J\u001a\u0010Y\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010X\u001a\u00020WH\u0016R\u0014\u0010[\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0019\u0010·\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R \u0010»\u0001\u001a\u000b ¸\u0001*\u0004\u0018\u00010U0U8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R)\u0010À\u0001\u001a\u0014\u0012\u000f\u0012\r ¸\u0001*\u0005\u0018\u00010½\u00010½\u00010¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R)\u0010Ã\u0001\u001a\u0014\u0012\u000f\u0012\r ¸\u0001*\u0005\u0018\u00010Á\u00010Á\u00010¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010¿\u0001R\u001a\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ë\u0001"}, m28432d2 = {"LO85;", "Lh85;", "Landroid/hardware/SensorEventListener;", "", "raw", "", "isCameraScan", "E0", "url", "Q", "I0", "Lx24;", "pricingText", "", "R0", Entry.TYPE_TEXT, "O", "N0", "U", PaymentMethodOptionsParams.Blik.PARAM_CODE, "A0", "merchantQRCode", "F0", "LHM4;", "Lco/bird/android/model/BirdScan;", "scanResponse", "Lio/reactivex/Observable;", AbstractC26684u0.f100690q, "t0", "", "throwable", "s0", "birdScan", "paired", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "supplementIntent", "L", "(Lco/bird/android/model/BirdScan;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "LNy;", "alert", "J0", "Landroid/content/Context;", "birdCode", "K", "secondaryMessage", "K0", "Lco/bird/android/model/wire/WireBird;", "bird", "P0", "Lco/bird/android/model/wire/configs/RideConfig;", "config", "showPriceChangeNotificationModal", "M0", "z0", "enabled", "N", "Lco/bird/android/model/constant/ScanStatus;", "scanStatus", "J", "scan", "P", "w0", "R", "T", "S", "L0", "T0", "O0", "success", "rawData", "merchantId", "siteId", "placardId", "Q0", C17296a.f69688o, "onResume", "onPause", "Lem5;", "rawResult", "b", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgl;", "c", "Lgl;", "preference", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LaM;", "e", "LaM;", "birdManager", "LiO;", "f", "LiO;", "birdPayManager", "LQh2;", "g", "LQh2;", "jobProducer", "Lqi1;", "h", "Lqi1;", "experimentManager", "LTq4;", "i", "LTq4;", "reactiveConfig", "Ldr4;", "j", "Ldr4;", "locationManager", "LMK4;", "k", "LMK4;", "reservationManager", "Lq54;", "l", "Lq54;", "privateBirdManager", "Landroid/hardware/SensorManager;", "m", "Landroid/hardware/SensorManager;", "sensorManager", "Lu24;", "n", "Lu24;", "pricingManager", "LRh6;", "o", "LRh6;", "userStream", "Landroid/os/Handler;", "p", "Landroid/os/Handler;", "handler", "Le13;", "q", "Le13;", "navigator", "LQz1;", "r", "LQz1;", "frequentFlyerManager", "LBl5;", "s", "LBl5;", "scanlessRideManager", "LYR4;", "t", "LYR4;", "rideManager", "LMD;", "u", "LMD;", "rxBleManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "v", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lco/bird/android/model/extra/RiderBirdScanExtra;", "w", "Lco/bird/android/model/extra/RiderBirdScanExtra;", "extras", "LZS;", "x", "LZS;", "ui", "y", "Z", "shouldEnableScanner", "kotlin.jvm.PlatformType", "z", "Landroid/hardware/Sensor;", "lightSensor", "LAG;", "", "A", "LAG;", "lightSensorReading", "Lak5;", "B", "scanEntryMode", "Lio/reactivex/disposables/b;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lio/reactivex/disposables/b;", "onResumeDisposable", "<init>", "(Landroid/content/Context;Lgl;LEa;LaM;LiO;LQh2;Lqi1;LTq4;Ldr4;LMK4;Lq54;Landroid/hardware/SensorManager;Lu24;LRh6;Landroid/os/Handler;Le13;LQz1;LBl5;LYR4;LMD;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/RiderBirdScanExtra;LZS;)V", "D", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,945:1\n218#2:946\n180#2:947\n180#2:948\n180#2:949\n180#2:950\n180#2:951\n180#2:952\n180#2:953\n180#2:956\n180#2:957\n180#2:959\n199#2:960\n180#2:961\n199#2:962\n237#2:963\n199#2:964\n52#3,2:954\n1#4:958\n*S KotlinDebug\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl\n*L\n183#1:946\n194#1:947\n202#1:948\n211#1:949\n228#1:950\n245#1:951\n262#1:952\n270#1:953\n317#1:956\n352#1:957\n427#1:959\n439#1:960\n524#1:961\n532#1:962\n750#1:963\n851#1:964\n281#1:954,2\n*E\n"})
/* renamed from: O85 */
/* loaded from: classes2.dex */
public final class O85 implements InterfaceC41950h85, SensorEventListener {

    /* renamed from: D */
    public static final C5871a f25956D = new C5871a(null);

    /* renamed from: E */
    public static final int f25957E = 8;

    /* renamed from: A */
    public final C0058AG<Float> f25958A;

    /* renamed from: B */
    public final C0058AG<EnumC38136ak5> f25959B;

    /* renamed from: C */
    public C23464b f25960C;

    /* renamed from: b */
    public final Context f25961b;

    /* renamed from: c */
    public final C22454gl f25962c;

    /* renamed from: d */
    public final InterfaceC1880Ea f25963d;

    /* renamed from: e */
    public final InterfaceC10636aM f25964e;

    /* renamed from: f */
    public final InterfaceC23227iO f25965f;

    /* renamed from: g */
    public final InterfaceC35422Qh2 f25966g;

    /* renamed from: h */
    public final InterfaceC47617qi1 f25967h;

    /* renamed from: i */
    public final C36207Tq4 f25968i;

    /* renamed from: j */
    public final InterfaceC40001dr4 f25969j;

    /* renamed from: k */
    public final MK4 f25970k;

    /* renamed from: l */
    public final InterfaceC47256q54 f25971l;

    /* renamed from: m */
    public final SensorManager f25972m;

    /* renamed from: n */
    public final InterfaceC49597u24 f25973n;

    /* renamed from: o */
    public final InterfaceC35660Rh6 f25974o;

    /* renamed from: p */
    public final Handler f25975p;

    /* renamed from: q */
    public final InterfaceC40099e13 f25976q;

    /* renamed from: r */
    public final InterfaceC35583Qz1 f25977r;

    /* renamed from: s */
    public final InterfaceC31951Bl5 f25978s;

    /* renamed from: t */
    public final YR4 f25979t;

    /* renamed from: u */
    public final InterfaceC5225MD f25980u;

    /* renamed from: v */
    public final LifecycleScopeProvider<EnumC7097RE> f25981v;

    /* renamed from: w */
    public final RiderBirdScanExtra f25982w;

    /* renamed from: x */
    public final InterfaceC10274ZS f25983x;

    /* renamed from: y */
    public boolean f25984y;

    /* renamed from: z */
    public final Sensor f25985z;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$A */
    /* loaded from: classes2.dex */
    public static final class C5841A extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: O85$A$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C5842a {
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

        public C5841A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            O85.this.f25962c.m37682S0();
            boolean isInRegistration = UserKt.isInRegistration(O85.this.f25962c.m37750B0());
            Float f = (Float) O85.this.f25958A.getValue();
            Double valueOf = f != null ? Double.valueOf(f.floatValue()) : null;
            int i = C5842a.$EnumSwitchMapping$0[O85.this.f25983x.mo7477sk().ordinal()];
            if (i == 1) {
                O85.this.f25959B.accept(EnumC38136ak5.CODE);
                O85.this.f25963d.mo55905y(new C39342cm5(null, null, null, Boolean.valueOf(isInRegistration), valueOf, 7, null));
            } else if (i != 2) {
            } else {
                O85.this.m92817N0();
                O85.this.f25959B.accept(EnumC38136ak5.QR);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$B */
    /* loaded from: classes2.dex */
    public static final class C5843B extends Lambda implements Function1<Unit, Unit> {
        public C5843B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            boolean mo7485i = O85.this.f25983x.mo7485i();
            InterfaceC1880Ea interfaceC1880Ea = O85.this.f25963d;
            String str = mo7485i ? "on" : "off";
            Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(O85.this.f25962c.m37750B0()));
            Float f = (Float) O85.this.f25958A.getValue();
            Double valueOf2 = f != null ? Double.valueOf(f.floatValue()) : null;
            EnumC38136ak5 enumC38136ak5 = (EnumC38136ak5) O85.this.f25959B.getValue();
            interfaceC1880Ea.mo55905y(new C38749bm5(null, null, null, str, valueOf, valueOf2, enumC38136ak5 != null ? enumC38136ak5.name() : null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXK;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXK;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$C */
    /* loaded from: classes2.dex */
    public static final class C5844C extends Lambda implements Function1<C9400XK, Unit> {
        public C5844C() {
            super(1);
        }

        /* renamed from: a */
        public final void m92748a(C9400XK c9400xk) {
            O85.this.f25983x.mo7482jl();
            O85.this.f25962c.m37686R0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C9400XK c9400xk) {
            m92748a(c9400xk);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LXK;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LXK;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$D */
    /* loaded from: classes2.dex */
    public static final class C5845D extends Lambda implements Function1<C9400XK, Unit> {
        public C5845D() {
            super(1);
        }

        /* renamed from: a */
        public final void m92747a(C9400XK c9400xk) {
            O85.this.m92816O(c9400xk.m77124b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C9400XK c9400xk) {
            m92747a(c9400xk);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "showPriceChangeNotificationModal", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$E */
    /* loaded from: classes2.dex */
    public static final class C5846E extends Lambda implements Function1<Boolean, Unit> {
        public C5846E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean showPriceChangeNotificationModal) {
            O85 o85 = O85.this;
            RideConfig rideConfig = o85.f25968i.m82623f8().getValue().getRideConfig();
            Intrinsics.checkNotNullExpressionValue(showPriceChangeNotificationModal, "showPriceChangeNotificationModal");
            if (o85.m92819M0(rideConfig, showPriceChangeNotificationModal.booleanValue())) {
                return;
            }
            O85.this.m92749z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$F */
    /* loaded from: classes2.dex */
    public static final class C5847F extends Lambda implements Function1<Throwable, Unit> {
        public C5847F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            O85.this.m92749z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$G */
    /* loaded from: classes2.dex */
    public static final class C5848G extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ BirdScan f25993h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5848G(BirdScan birdScan) {
            super(0);
            this.f25993h = birdScan;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.m92820M(O85.this, this.f25993h, Boolean.TRUE, null, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$H */
    /* loaded from: classes2.dex */
    public static final class C5849H extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ BirdScan f25995h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5849H(BirdScan birdScan) {
            super(0);
            this.f25995h = birdScan;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.m92820M(O85.this, this.f25995h, Boolean.TRUE, null, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$I */
    /* loaded from: classes2.dex */
    public static final class C5850I extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ BirdScan f25997h;

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: O85$I$a */
        /* loaded from: classes2.dex */
        public static final class C5851a extends Lambda implements Function1<Intent, Unit> {

            /* renamed from: g */
            public static final C5851a f25998g = new C5851a();

            public C5851a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
                invoke2(intent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent closeDownWithBirdScan) {
                Intrinsics.checkNotNullParameter(closeDownWithBirdScan, "$this$closeDownWithBirdScan");
                closeDownWithBirdScan.putExtra("start_ride_immediately", true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5850I(BirdScan birdScan) {
            super(0);
            this.f25997h = birdScan;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.m92820M(O85.this, this.f25997h, null, C5851a.f25998g, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$J */
    /* loaded from: classes2.dex */
    public static final class C5852J extends Lambda implements Function0<Unit> {
        public C5852J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92749z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$K */
    /* loaded from: classes2.dex */
    public static final class C5853K extends Lambda implements Function0<Unit> {
        public C5853K() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92749z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$L */
    /* loaded from: classes2.dex */
    public static final class C5854L extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ BirdScan f26002h;

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: O85$L$a */
        /* loaded from: classes2.dex */
        public static final class C5855a extends Lambda implements Function1<Intent, Unit> {

            /* renamed from: g */
            public static final C5855a f26003g = new C5855a();

            public C5855a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
                invoke2(intent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent closeDownWithBirdScan) {
                Intrinsics.checkNotNullParameter(closeDownWithBirdScan, "$this$closeDownWithBirdScan");
                closeDownWithBirdScan.putExtra("start_ride_immediately", true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5854L(BirdScan birdScan) {
            super(0);
            this.f26002h = birdScan;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.m92820M(O85.this, this.f26002h, null, C5855a.f26003g, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$M */
    /* loaded from: classes2.dex */
    public static final class C5856M extends Lambda implements Function0<Unit> {
        public C5856M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92749z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$N */
    /* loaded from: classes2.dex */
    public static final class C5857N extends Lambda implements Function0<Unit> {
        public C5857N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92749z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "pairedBird", "Lio/reactivex/B;", "LHM4;", "Lco/bird/android/model/BirdScan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$O */
    /* loaded from: classes2.dex */
    public static final class C5858O extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends HM4<BirdScan>>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f26006g;

        /* renamed from: h */
        public final /* synthetic */ BirdScan f26007h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5858O(WireBird wireBird, BirdScan birdScan) {
            super(1);
            this.f26006g = wireBird;
            this.f26007h = birdScan;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends HM4<BirdScan>> invoke(WireBird pairedBird) {
            WireBird copy;
            BirdScan copy2;
            Intrinsics.checkNotNullParameter(pairedBird, "pairedBird");
            copy = r3.copy((r91 & 1) != 0 ? r3.f66717id : null, (r91 & 2) != 0 ? r3.model : null, (r91 & 4) != 0 ? r3.taskId : null, (r91 & 8) != 0 ? r3.batteryLevel : 0, (r91 & 16) != 0 ? r3.estimatedRange : null, (r91 & 32) != 0 ? r3.distance : 0, (r91 & 64) != 0 ? r3.location : null, (r91 & 128) != 0 ? r3.code : null, (r91 & 256) != 0 ? r3.stickerId : null, (r91 & 512) != 0 ? r3.serialNumber : null, (r91 & 1024) != 0 ? r3.disconnected : false, (r91 & 2048) != 0 ? r3.collect : false, (r91 & 4096) != 0 ? r3.submerged : false, (r91 & 8192) != 0 ? r3.lost : false, (r91 & 16384) != 0 ? r3.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.ackLocked : false, (r91 & 65536) != 0 ? r3.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.broken : false, (r91 & 524288) != 0 ? r3.label : null, (r91 & 1048576) != 0 ? r3.actions : null, (r91 & 2097152) != 0 ? r3.bountyId : null, (r91 & 4194304) != 0 ? r3.bountyPrice : null, (r91 & 8388608) != 0 ? r3.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.bountyLost : false, (r91 & 33554432) != 0 ? r3.bountyOverdue : false, (r91 & 67108864) != 0 ? r3.bountyKind : null, (r91 & 134217728) != 0 ? r3.brandName : null, (r91 & 268435456) != 0 ? r3.taskKind : null, (r91 & 536870912) != 0 ? r3.gpsAt : null, (r91 & 1073741824) != 0 ? r3.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r3.token : null, (r92 & 1) != 0 ? r3.bluetooth : false, (r92 & 2) != 0 ? r3.cellular : false, (r92 & 4) != 0 ? r3.startedAt : null, (r92 & 8) != 0 ? r3.dueAt : null, (r92 & 16) != 0 ? r3.asleep : false, (r92 & 32) != 0 ? r3.imei : null, (r92 & 64) != 0 ? r3.boardProtocol : null, (r92 & 128) != 0 ? r3.physicalLock : null, (r92 & 256) != 0 ? r3.priorityCollect : false, (r92 & 512) != 0 ? r3.down : false, (r92 & 1024) != 0 ? r3.needsInspection : false, (r92 & 2048) != 0 ? r3.partnerId : null, (r92 & 4096) != 0 ? r3.nestId : null, (r92 & 8192) != 0 ? r3.lastRideEndedAt : null, (r92 & 16384) != 0 ? r3.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.peril : false, (r92 & 65536) != 0 ? r3.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.offline : false, (r92 & 524288) != 0 ? r3.license : null, (r92 & 1048576) != 0 ? r3.areaKey : null, (r92 & 2097152) != 0 ? r3.fleetId : null, (r92 & 4194304) != 0 ? r3.nestPurpose : null, (r92 & 8388608) != 0 ? r3.privateBird : pairedBird.getPrivateBird(), (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.scannedAt : null, (r92 & 33554432) != 0 ? r3.badgeType : null, (r92 & 67108864) != 0 ? r3.bountyReasons : null, (r92 & 134217728) != 0 ? r3.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r3.ephemeralId : null, (r92 & 536870912) != 0 ? r3.hasHelmet : false, (r92 & 1073741824) != 0 ? r3.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r3.bleMacAddress : null, (r93 & 1) != 0 ? r3.cellId : null, (r93 & 2) != 0 ? this.f26006g.externalFeedType : null);
            copy2 = r1.copy((r26 & 1) != 0 ? r1.f66577id : null, (r26 & 2) != 0 ? r1.userId : null, (r26 & 4) != 0 ? r1.barcode : null, (r26 & 8) != 0 ? r1.error : null, (r26 & 16) != 0 ? r1.mode : null, (r26 & 32) != 0 ? r1.status : null, (r26 & 64) != 0 ? r1.birdCode : null, (r26 & 128) != 0 ? r1.birdId : null, (r26 & 256) != 0 ? r1.bird : copy, (r26 & 512) != 0 ? r1.coupons : null, (r26 & 1024) != 0 ? r1.message : null, (r26 & 2048) != 0 ? this.f26007h.ephemeralId : null);
            return Observable.just(HM4.m103935j(copy2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$P */
    /* loaded from: classes2.dex */
    public static final class C5859P extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C9799YX f26008g;

        /* renamed from: h */
        public final /* synthetic */ O85 f26009h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: O85$P$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C5860a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5859P(C9799YX c9799yx, O85 o85) {
            super(1);
            this.f26008g = c9799yx;
            this.f26009h = o85;
        }

        /* renamed from: a */
        public final void m92745a(DialogResponse dialogResponse) {
            int i;
            if (dialogResponse == null) {
                i = -1;
            } else {
                i = C5860a.$EnumSwitchMapping$0[dialogResponse.ordinal()];
            }
            if (i != 1) {
                if (i == 2) {
                    this.f26009h.m92749z0();
                }
            } else if (this.f26008g.m74935c()) {
                this.f26009h.f25976q.mo36949s0();
            } else {
                this.f26009h.m92749z0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m92745a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$Q */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5861Q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C5861Q f26010b = new C5861Q();

        public C5861Q() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$R */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5862R extends FunctionReferenceImpl implements Function1<HM4<BirdScan>, Observable<HM4<BirdScan>>> {
        public C5862R(Object obj) {
            super(1, obj, O85.class, "pairBirdOnOwnableScan", "pairBirdOnOwnableScan(Lretrofit2/Response;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<HM4<BirdScan>> invoke(HM4<BirdScan> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((O85) this.receiver).m92759u0(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$S */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5863S extends FunctionReferenceImpl implements Function1<HM4<BirdScan>, Unit> {
        public C5863S(Object obj) {
            super(1, obj, O85.class, "onScanSuccess", "onScanSuccess(Lretrofit2/Response;)V", 0);
        }

        /* renamed from: a */
        public final void m92743a(HM4<BirdScan> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((O85) this.receiver).m92761t0(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BirdScan> hm4) {
            m92743a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$T */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5864T extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5864T(Object obj) {
            super(1, obj, O85.class, "onScanError", "onScanError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((O85) this.receiver).m92763s0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "LbT2;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$U */
    /* loaded from: classes2.dex */
    public static final class C5865U extends Lambda implements Function1<HM4<C38563bT2>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f26012h;

        /* renamed from: i */
        public final /* synthetic */ String f26013i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5865U(String str, String str2) {
            super(1);
            this.f26012h = str;
            this.f26013i = str2;
        }

        /* renamed from: a */
        public final void m92742a(HM4<C38563bT2> response) {
            String str;
            String str2;
            WireMerchantSite m64517b;
            WireMerchantSite m64517b2;
            WireMerchantDescription merchant;
            C38563bT2 m103944a = response.m103944a();
            if (response.m103939f() && m103944a != null) {
                String id = m103944a.m64517b().getId();
                O85.this.m92811Q0(true, this.f26012h, m103944a.m64517b().getMerchant().getId(), id, this.f26013i);
                O85.this.f25976q.mo37116O3(id, this.f26013i, true);
                O85.this.f25976q.close();
                return;
            }
            O85 o85 = O85.this;
            String str3 = this.f26012h;
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
            o85.m92811Q0(true, str3, str, str2, this.f26013i);
            InterfaceC10274ZS interfaceC10274ZS = O85.this.f25983x;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str4 = m94017d.m11932c();
            }
            interfaceC10274ZS.error(str4);
            O85.this.m92749z0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<C38563bT2> hm4) {
            m92742a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$V */
    /* loaded from: classes2.dex */
    public static final class C5866V extends Lambda implements Function1<Throwable, Unit> {
        public C5866V() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            InterfaceC10274ZS interfaceC10274ZS = O85.this.f25983x;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            interfaceC10274ZS.error(error);
            O85.this.m92749z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$W */
    /* loaded from: classes2.dex */
    public static final class C5867W extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC5751Ny f26015g;

        /* renamed from: h */
        public final /* synthetic */ O85 f26016h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5867W(AbstractC5751Ny abstractC5751Ny, O85 o85) {
            super(0);
            this.f26015g = abstractC5751Ny;
            this.f26016h = o85;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f26015g instanceof C34621Mw2) {
                this.f26016h.f25976q.mo37192C();
            } else {
                this.f26016h.m92818N(true);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$X */
    /* loaded from: classes2.dex */
    public static final class C5868X extends Lambda implements Function0<Unit> {
        public C5868X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92818N(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$Y */
    /* loaded from: classes2.dex */
    public static final class C5869Y extends Lambda implements Function0<Unit> {
        public C5869Y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92818N(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$Z */
    /* loaded from: classes2.dex */
    public static final class C5870Z extends Lambda implements Function0<Unit> {
        public C5870Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92818N(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LO85$a;", "", "", "ACCEPTABLE_CODE_PREFIX", "Ljava/lang/String;", "BIRD_BIKE_QUICK_START_GUIDE_QR_CODE", "", "LIGHT_SENSOR_SAMPLE_RATE_US", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: O85$a */
    /* loaded from: classes2.dex */
    public static final class C5871a {
        public /* synthetic */ C5871a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5871a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$a0 */
    /* loaded from: classes2.dex */
    public static final class C5872a0 extends Lambda implements Function0<Unit> {
        public C5872a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC40099e13 interfaceC40099e13 = O85.this.f25976q;
            Intent putExtra = new Intent().putExtra("navigate_to_long_term_rental", true);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras…O_LONG_TERM_RENTAL, true)");
            interfaceC40099e13.mo37029e4(-1, putExtra);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5873b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceOnScannerKind.values().length];
            try {
                iArr[PriceOnScannerKind.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceOnScannerKind.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceOnScannerKind.ON_PRICE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$b0 */
    /* loaded from: classes2.dex */
    public static final class C5874b0 extends Lambda implements Function0<Unit> {
        public C5874b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92818N(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$c */
    /* loaded from: classes2.dex */
    public static final class C5875c extends Lambda implements Function1<Intent, Unit> {

        /* renamed from: g */
        public static final C5875c f26022g = new C5875c();

        public C5875c() {
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

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$c0 */
    /* loaded from: classes2.dex */
    public static final class C5876c0 extends Lambda implements Function0<Unit> {
        public C5876c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            O85.this.m92818N(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRiderBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl$handleExplicitError$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,945:1\n1#2:946\n*E\n"})
    /* renamed from: O85$d */
    /* loaded from: classes2.dex */
    public static final class C5877d extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ BirdScan f26024g;

        /* renamed from: h */
        public final /* synthetic */ O85 f26025h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5877d(BirdScan birdScan, O85 o85) {
            super(0);
            this.f26024g = birdScan;
            this.f26025h = o85;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String buttonLink;
            WireError error = this.f26024g.getError();
            if (error == null || (buttonLink = error.getButtonLink()) == null) {
                return;
            }
            this.f26025h.f25976q.mo36983m2(buttonLink);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Float;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$d0 */
    /* loaded from: classes2.dex */
    public static final class C5878d0 extends Lambda implements Function1<Float, Unit> {

        /* renamed from: h */
        public final /* synthetic */ EnumC51375x24 f26027h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5878d0(EnumC51375x24 enumC51375x24) {
            super(1);
            this.f26027h = enumC51375x24;
        }

        /* renamed from: a */
        public final void m92741a(Float f) {
            O85.this.f25963d.mo55905y(new C41731gm5(null, null, null, Boolean.valueOf(UserKt.isInRegistration(O85.this.f25962c.m37750B0())), Double.valueOf(f.floatValue()), this.f26027h.toString(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            m92741a(f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$e */
    /* loaded from: classes2.dex */
    public static final class C5879e extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C5879e f26028g = new C5879e();

        public C5879e() {
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

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$f */
    /* loaded from: classes2.dex */
    public static final class C5880f extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C5880f f26029g = new C5880f();

        public C5880f() {
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

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$g */
    /* loaded from: classes2.dex */
    public static final class C5881g extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C5881g f26030g = new C5881g();

        public C5881g() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: O85$h */
    /* loaded from: classes2.dex */
    public static final class C5882h<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C5882h<T1, T2, R> f26031a = new C5882h<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$i */
    /* loaded from: classes2.dex */
    public static final class C5883i extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ RideConfig f26032g;

        /* renamed from: h */
        public final /* synthetic */ O85 f26033h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5883i(RideConfig rideConfig, O85 o85) {
            super(1);
            this.f26032g = rideConfig;
            this.f26033h = o85;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f26032g.getEnableScannerCodeEntryTooltip() && this.f26033h.f25962c.m37568u() < this.f26032g.getScannerCodeEntryTooltipMaxEntries() && this.f26033h.f25962c.m37564v() < this.f26032g.getScannerCodeEntryTooltipMaxViews() && this.f26033h.f25959B.getValue() == EnumC38136ak5.QR) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$j */
    /* loaded from: classes2.dex */
    public static final class C5884j extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ RideConfig f26035h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5884j(RideConfig rideConfig) {
            super(1);
            this.f26035h = rideConfig;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            O85.this.f25983x.mo7502Qa(this.f26035h.getScannerCodeEntryTooltipLocalizedCopy(), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "enteredText", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$k */
    /* loaded from: classes2.dex */
    public static final class C5885k extends Lambda implements Function1<String, Unit> {
        public C5885k() {
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
            int maxBirdCodeLength = O85.this.f25968i.m82623f8().getValue().getRideConfig().getMaxBirdCodeLength();
            Intrinsics.checkNotNullExpressionValue(enteredText, "enteredText");
            startsWith = StringsKt__StringsJVMKt.startsWith(enteredText, "no.", true);
            if (startsWith) {
                O85.this.f25983x.mo7492d2(maxBirdCodeLength + 3);
            } else {
                O85.this.f25983x.mo7492d2(maxBirdCodeLength);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$l */
    /* loaded from: classes2.dex */
    public static final class C5886l extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C5886l f26037g = new C5886l();

        public C5886l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getRideConfig().getEnableScanlessRideStartScanner());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$m */
    /* loaded from: classes2.dex */
    public static final class C5887m extends Lambda implements Function1<RideStates, Boolean> {

        /* renamed from: g */
        public static final C5887m f26038g = new C5887m();

        public C5887m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideStates it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getActiveRideCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$n */
    /* loaded from: classes2.dex */
    public static final class C5888n extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C5888n f26039g = new C5888n();

        public C5888n() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Boolean> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean featureFlagEnabled = pair.component1();
            Boolean notInRide = pair.component2();
            Intrinsics.checkNotNullExpressionValue(featureFlagEnabled, "featureFlagEnabled");
            if (featureFlagEnabled.booleanValue()) {
                Intrinsics.checkNotNullExpressionValue(notInRide, "notInRide");
                if (notInRide.booleanValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            return invoke2((Pair<Boolean, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "scanlessBannerEnabled", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$o */
    /* loaded from: classes2.dex */
    public static final class C5889o extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Optional<ScanlessRideItem>>> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<Long> f26040g;

        /* renamed from: h */
        public final /* synthetic */ O85 f26041h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/ScanlessRideItem;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: O85$o$a */
        /* loaded from: classes2.dex */
        public static final class C5890a extends Lambda implements Function1<List<? extends ScanlessRideItem>, Optional<ScanlessRideItem>> {

            /* renamed from: g */
            public static final C5890a f26042g = new C5890a();

            public C5890a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<ScanlessRideItem> invoke(List<ScanlessRideItem> it) {
                Object firstOrNull;
                Intrinsics.checkNotNullParameter(it, "it");
                Optional.C14443a c14443a = Optional.f63040c;
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) it);
                return c14443a.m59033b(firstOrNull);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: O85$o$b */
        /* loaded from: classes2.dex */
        public static final class C5891b extends Lambda implements Function2<Optional<ScanlessRideItem>, Optional<ScanlessRideItem>, Boolean> {

            /* renamed from: g */
            public static final C5891b f26043g = new C5891b();

            public C5891b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Boolean invoke(Optional<ScanlessRideItem> t1, Optional<ScanlessRideItem> t2) {
                String str;
                WireBird bird;
                WireBird bird2;
                Intrinsics.checkNotNullParameter(t1, "t1");
                Intrinsics.checkNotNullParameter(t2, "t2");
                ScanlessRideItem m59035e = t1.m59035e();
                String str2 = null;
                if (m59035e != null && (bird2 = m59035e.getBird()) != null) {
                    str = bird2.getCode();
                } else {
                    str = null;
                }
                ScanlessRideItem m59035e2 = t2.m59035e();
                if (m59035e2 != null && (bird = m59035e2.getBird()) != null) {
                    str2 = bird.getCode();
                }
                return Boolean.valueOf(Intrinsics.areEqual(str, str2));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: O85$o$c */
        /* loaded from: classes2.dex */
        public static final class C5892c extends Lambda implements Function1<Optional<ScanlessRideItem>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ O85 f26044g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5892c(O85 o85) {
                super(1);
                this.f26044g = o85;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(Optional<ScanlessRideItem> optional) {
                return Boolean.valueOf(this.f26044g.f25968i.m82623f8().m73665a().getRideConfig().getEnableScanlessRideBannerChirp());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00000\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "item", "Lio/reactivex/B;", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: O85$o$d */
        /* loaded from: classes2.dex */
        public static final class C5893d extends Lambda implements Function1<Optional<ScanlessRideItem>, InterfaceC23434B<Optional<ScanlessRideItem>>> {

            /* renamed from: g */
            public final /* synthetic */ O85 f26045g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: O85$o$d$a */
            /* loaded from: classes2.dex */
            public static final class C5894a extends Lambda implements Function1<WireBird, Unit> {

                /* renamed from: g */
                public static final C5894a f26046g = new C5894a();

                public C5894a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m92724a(WireBird wireBird) {
                    C41318g46.m40151m("Chirp bird on scanless ride banner shown.", new Object[0]);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
                    m92724a(wireBird);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: O85$o$d$b */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C5895b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

                /* renamed from: b */
                public static final C5895b f26047b = new C5895b();

                public C5895b() {
                    super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    C41318g46.m40159e(th);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: O85$o$d$c */
            /* loaded from: classes2.dex */
            public static final class C5896c extends Lambda implements Function1<WireBird, Optional<ScanlessRideItem>> {

                /* renamed from: g */
                public final /* synthetic */ Optional<ScanlessRideItem> f26048g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5896c(Optional<ScanlessRideItem> optional) {
                    super(1);
                    this.f26048g = optional;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Optional<ScanlessRideItem> invoke(WireBird it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f26048g;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5893d(O85 o85) {
                super(1);
                this.f26045g = o85;
            }

            /* renamed from: e */
            public static final void m92726e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: f */
            public static final Optional m92725f(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Optional) tmp0.invoke(obj);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d */
            public final InterfaceC23434B<Optional<ScanlessRideItem>> invoke(Optional<ScanlessRideItem> optional) {
                WireBird bird;
                ScanlessRideItem m59035e = optional.m59035e();
                if (m59035e != null && (bird = m59035e.getBird()) != null) {
                    Observable<WireBird> mo71605D0 = this.f26045g.f25964e.mo71605D0(bird, false);
                    final C5894a c5894a = C5894a.f26046g;
                    Observable<WireBird> doOnNext = mo71605D0.doOnNext(new InterfaceC23484g() { // from class: R85
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            O85.C5889o.C5893d.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                    final C5895b c5895b = C5895b.f26047b;
                    Observable<WireBird> doOnError = doOnNext.doOnError(new InterfaceC23484g() { // from class: S85
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            O85.C5889o.C5893d.m92726e(Function1.this, obj);
                        }
                    });
                    final C5896c c5896c = new C5896c(optional);
                    Observable onErrorReturnItem = doOnError.map(new InterfaceC23492o() { // from class: T85
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Optional m92725f;
                            m92725f = O85.C5889o.C5893d.m92725f(Function1.this, obj);
                            return m92725f;
                        }
                    }).onErrorReturnItem(optional);
                    Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "item ->\n              //… .onErrorReturnItem(item)");
                    return onErrorReturnItem;
                }
                Observable just = Observable.just(optional);
                Intrinsics.checkNotNullExpressionValue(just, "just(item)");
                return just;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5889o(Ref.ObjectRef<Long> objectRef, O85 o85) {
            super(1);
            this.f26040g = objectRef;
            this.f26041h = o85;
        }

        /* renamed from: c */
        public static final Optional m92735c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final boolean m92734d(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Long] */
        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Optional<ScanlessRideItem>> invoke(Boolean scanlessBannerEnabled) {
            Intrinsics.checkNotNullParameter(scanlessBannerEnabled, "scanlessBannerEnabled");
            if (scanlessBannerEnabled.booleanValue()) {
                this.f26040g.element = Long.valueOf(System.currentTimeMillis());
                Z84<List<ScanlessRideItem>> mo89852e = this.f26041h.f25978s.mo89852e();
                final C5890a c5890a = C5890a.f26042g;
                Observable<R> map = mo89852e.map(new InterfaceC23492o() { // from class: P85
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m92735c;
                        m92735c = O85.C5889o.m92735c(Function1.this, obj);
                        return m92735c;
                    }
                });
                final C5891b c5891b = C5891b.f26043g;
                Observable distinctUntilChanged = map.distinctUntilChanged(new InterfaceC23481d() { // from class: Q85
                    @Override // io.reactivex.functions.InterfaceC23481d
                    public final boolean test(Object obj, Object obj2) {
                        boolean m92734d;
                        m92734d = O85.C5889o.m92734d(Function2.this, obj, obj2);
                        return m92734d;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "scanlessRideManager.avai….bird?.code\n            }");
                return C37279Yf5.m74589F(distinctUntilChanged, new C5892c(this.f26041h), new C5893d(this.f26041h));
            }
            Observable just = Observable.just(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(just, "{\n          Observable.j…ional.absent())\n        }");
            return just;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$p */
    /* loaded from: classes2.dex */
    public static final class C5897p extends Lambda implements Function1<Pair<? extends Optional<ScanlessRideItem>, ? extends Location>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<Long> f26050h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5897p(Ref.ObjectRef<Long> objectRef) {
            super(1);
            this.f26050h = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<ScanlessRideItem>, ? extends Location> pair) {
            invoke2((Pair<Optional<ScanlessRideItem>, ? extends Location>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<ScanlessRideItem>, ? extends Location> pair) {
            Location location = pair.component2();
            ScanlessRideItem m59035e = pair.component1().m59035e();
            WireBird bird = m59035e != null ? m59035e.getBird() : null;
            InterfaceC10274ZS interfaceC10274ZS = O85.this.f25983x;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            interfaceC10274ZS.mo71344O9(bird, location);
            if (bird == null) {
                return;
            }
            Long l = this.f26050h.element;
            double currentTimeMillis = l != null ? (System.currentTimeMillis() - l.longValue()) / 1000.0d : 0.0d;
            InterfaceC1880Ea interfaceC1880Ea = O85.this.f25963d;
            int batteryLevel = bird.getBatteryLevel();
            String model = bird.getModel();
            if (model == null) {
                model = "unknown";
            }
            interfaceC1880Ea.mo55905y(new C34929Oe4(null, null, null, "scanner", currentTimeMillis, batteryLevel, model, 7, null));
            this.f26050h.element = null;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$q */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5898q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C5898q f26051b = new C5898q();

        public C5898q() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00032&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/ScanlessRideItem;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$r */
    /* loaded from: classes2.dex */
    public static final class C5899r extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends ScanlessRideItem>>, ScanlessRideItem> {

        /* renamed from: g */
        public static final C5899r f26052g = new C5899r();

        public C5899r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ScanlessRideItem invoke(Pair<Unit, ? extends List<ScanlessRideItem>> pair) {
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<ScanlessRideItem> availableBirds = pair.component2();
            Intrinsics.checkNotNullExpressionValue(availableBirds, "availableBirds");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) availableBirds);
            return (ScanlessRideItem) firstOrNull;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "scanlessRideItem", "", C17296a.f69688o, "(Lco/bird/android/model/ScanlessRideItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$s */
    /* loaded from: classes2.dex */
    public static final class C5900s extends Lambda implements Function1<ScanlessRideItem, Unit> {
        public C5900s() {
            super(1);
        }

        /* renamed from: a */
        public final void m92721a(ScanlessRideItem scanlessRideItem) {
            InterfaceC1880Ea interfaceC1880Ea = O85.this.f25963d;
            int batteryLevel = scanlessRideItem.getBird().getBatteryLevel();
            String model = scanlessRideItem.getBird().getModel();
            if (model == null) {
                model = "unknown";
            }
            interfaceC1880Ea.mo55905y(new C35163Pe4(null, null, null, "scanner", batteryLevel, model, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScanlessRideItem scanlessRideItem) {
            m92721a(scanlessRideItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/VehiclePricingDetails;", "vehiclePricingDetails", "", C17296a.f69688o, "(Lco/bird/android/model/VehiclePricingDetails;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$t */
    /* loaded from: classes2.dex */
    public static final class C5901t extends Lambda implements Function1<VehiclePricingDetails, Boolean> {
        public C5901t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(VehiclePricingDetails vehiclePricingDetails) {
            Intrinsics.checkNotNullParameter(vehiclePricingDetails, "vehiclePricingDetails");
            boolean pricingChanged$default = VehiclePricingDetails.pricingChanged$default(vehiclePricingDetails, O85.this.f25962c.m37645b0(), false, 2, null);
            if (!pricingChanged$default) {
                O85.this.m92809R0(EnumC51375x24.NONE);
            }
            return Boolean.valueOf(pricingChanged$default);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "scanlessRideItem", "", C17296a.f69688o, "(Lco/bird/android/model/ScanlessRideItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$u */
    /* loaded from: classes2.dex */
    public static final class C5902u extends Lambda implements Function1<ScanlessRideItem, Unit> {
        public C5902u() {
            super(1);
        }

        /* renamed from: a */
        public final void m92719a(ScanlessRideItem scanlessRideItem) {
            O85.this.f25983x.mo7480n0();
            O85.this.f25976q.mo37030e3();
            InterfaceC31951Bl5 interfaceC31951Bl5 = O85.this.f25978s;
            Intrinsics.checkNotNullExpressionValue(scanlessRideItem, "scanlessRideItem");
            interfaceC31951Bl5.mo89856a(scanlessRideItem);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScanlessRideItem scanlessRideItem) {
            m92719a(scanlessRideItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$v */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5903v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C5903v f26056b = new C5903v();

        public C5903v() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/VehiclePricingDetails;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/VehiclePricingDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,945:1\n1#2:946\n*E\n"})
    /* renamed from: O85$w */
    /* loaded from: classes2.dex */
    public static final class C5904w extends Lambda implements Function1<VehiclePricingDetails, Unit> {
        public C5904w() {
            super(1);
        }

        /* renamed from: a */
        public final void m92718a(VehiclePricingDetails it) {
            O85.this.f25983x.mo71339gl();
            Unit unit = Unit.INSTANCE;
            O85.this.m92809R0(EnumC51375x24.SEE_UPDATED_PRICING);
            C22454gl c22454gl = O85.this.f25962c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c22454gl.m37696O2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VehiclePricingDetails vehiclePricingDetails) {
            m92718a(vehiclePricingDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$x */
    /* loaded from: classes2.dex */
    public static final class C5905x extends Lambda implements Function1<Throwable, Unit> {
        public C5905x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            O85.this.f25983x.error(C45871nl4.vehicle_pricing_general_error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O85$y */
    /* loaded from: classes2.dex */
    public static final class C5906y extends Lambda implements Function1<Unit, Unit> {
        public C5906y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            O85.this.f25976q.mo37119O0(O85.this.f25962c.m37645b0(), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: O85$z */
    /* loaded from: classes2.dex */
    public static final class C5907z extends Lambda implements Function1<Optional<WireFrequentFlyerView>, Unit> {
        public C5907z() {
            super(1);
        }

        /* renamed from: a */
        public final void m92717a(Optional<WireFrequentFlyerView> optional) {
            Unit unit;
            WireFrequentFlyerView m59035e = optional.m59035e();
            if (m59035e != null) {
                O85 o85 = O85.this;
                o85.f25983x.mo71341Rk(m59035e);
                o85.f25963d.mo55905y(new C46747pE2(null, null, null, m59035e.getHeadline(), 7, null));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                O85.this.f25983x.mo71342Rf();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireFrequentFlyerView> optional) {
            m92717a(optional);
            return Unit.INSTANCE;
        }
    }

    public O85(Context context, C22454gl preference, InterfaceC1880Ea analyticsManager, InterfaceC10636aM birdManager, InterfaceC23227iO birdPayManager, InterfaceC35422Qh2 jobProducer, InterfaceC47617qi1 experimentManager, C36207Tq4 reactiveConfig, InterfaceC40001dr4 locationManager, MK4 reservationManager, InterfaceC47256q54 privateBirdManager, SensorManager sensorManager, InterfaceC49597u24 pricingManager, InterfaceC35660Rh6 userStream, Handler handler, InterfaceC40099e13 navigator, InterfaceC35583Qz1 frequentFlyerManager, InterfaceC31951Bl5 scanlessRideManager, YR4 rideManager, InterfaceC5225MD rxBleManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, RiderBirdScanExtra extras, InterfaceC10274ZS ui) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(birdPayManager, "birdPayManager");
        Intrinsics.checkNotNullParameter(jobProducer, "jobProducer");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reservationManager, "reservationManager");
        Intrinsics.checkNotNullParameter(privateBirdManager, "privateBirdManager");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(pricingManager, "pricingManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(frequentFlyerManager, "frequentFlyerManager");
        Intrinsics.checkNotNullParameter(scanlessRideManager, "scanlessRideManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(rxBleManager, "rxBleManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f25961b = context;
        this.f25962c = preference;
        this.f25963d = analyticsManager;
        this.f25964e = birdManager;
        this.f25965f = birdPayManager;
        this.f25966g = jobProducer;
        this.f25967h = experimentManager;
        this.f25968i = reactiveConfig;
        this.f25969j = locationManager;
        this.f25970k = reservationManager;
        this.f25971l = privateBirdManager;
        this.f25972m = sensorManager;
        this.f25973n = pricingManager;
        this.f25974o = userStream;
        this.f25975p = handler;
        this.f25976q = navigator;
        this.f25977r = frequentFlyerManager;
        this.f25978s = scanlessRideManager;
        this.f25979t = rideManager;
        this.f25980u = rxBleManager;
        this.f25981v = scopeProvider;
        this.f25982w = extras;
        this.f25983x = ui;
        this.f25984y = true;
        this.f25985z = sensorManager.getDefaultSensor(5);
        C0058AG<Float> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Float>()");
        this.f25958A = m115951g;
        C0058AG<EnumC38136ak5> m115950h = C0058AG.m115950h(EnumC38136ak5.QR);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<ScanEntryMode>(ScanEntryMode.QR)");
        this.f25959B = m115950h;
        this.f25960C = new C23464b();
    }

    /* renamed from: B0 */
    public static final InterfaceC23434B m92841B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m92839C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m92837D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final void m92831G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m92829H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public static /* synthetic */ void m92820M(O85 o85, BirdScan birdScan, Boolean bool, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            function1 = C5875c.f26022g;
        }
        o85.m92822L(birdScan, bool, function1);
    }

    /* renamed from: S0 */
    public static final void m92807S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final boolean m92803V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: W */
    public static final void m92802W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m92801X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final boolean m92800Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Z */
    public static final void m92799Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final Boolean m92797a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final Boolean m92796b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final Boolean m92794c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23434B m92792d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m92790e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m92788f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m92786g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m92784h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m92782i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m92780j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m92778k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m92776l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m92774m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m92772n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m92770o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m92768p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m92767q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m92765r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final InterfaceC23434B m92757v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m92753x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m92751y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A0 */
    public final void m92843A0(String str, boolean z, String str2) {
        Observable progress$default = C28237sD.progress$default(this.f25964e.mo71586W0(str, MapMode.RIDER, this.f25982w.getScanIntention(), z, str2), this.f25983x, 0, 2, (Object) null);
        final C5862R c5862r = new C5862R(this);
        Observable observeOn = progress$default.flatMap(new InterfaceC23492o() { // from class: D85
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m92841B0;
                m92841B0 = O85.m92841B0(Function1.this, obj);
                return m92841B0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "birdManager\n      .scanB…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5863S c5863s = new C5863S(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: F85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92839C0(Function1.this, obj);
            }
        };
        final C5864T c5864t = new C5864T(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: G85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92837D0(Function1.this, obj);
            }
        });
    }

    /* renamed from: E0 */
    public final boolean m92835E0(String str, boolean z) {
        CharSequence trim;
        C33894Jt4 c33894Jt4 = C33894Jt4.f18402a;
        String m99597e = c33894Jt4.m99597e(str);
        boolean enableBirdPay = this.f25968i.m82623f8().m73665a().getBirdPayConfig().getEnableBirdPay();
        String m99598d = c33894Jt4.m99598d(str);
        trim = StringsKt__StringsKt.trim((CharSequence) C45097mS5.m25595k(str, "no.", true));
        String obj = trim.toString();
        if (m92812Q(str)) {
            return true;
        }
        if (m92827I0(str)) {
            this.f25976q.mo37094S3();
            return true;
        } else if (m99597e != null) {
            if (!z) {
                str = null;
            }
            m92843A0(m99597e, z, str);
            return true;
        } else if (m99598d != null && enableBirdPay) {
            m92833F0(m99598d, str);
            return true;
        } else if (m92804U(obj)) {
            if (!z) {
                str = null;
            }
            m92843A0(obj, z, str);
            return true;
        } else {
            m92749z0();
            return false;
        }
    }

    /* renamed from: F0 */
    public final void m92833F0(String str, String str2) {
        AbstractC23442F m33152N = C28237sD.progress$default(this.f25965f.mo27356k(str), this.f25983x, 0, 2, (Object) null).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "birdPayManager.scan(merc…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5865U c5865u = new C5865U(str2, str);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: I85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92831G0(Function1.this, obj);
            }
        };
        final C5866V c5866v = new C5866V();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: J85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92829H0(Function1.this, obj);
            }
        });
    }

    /* renamed from: I0 */
    public final boolean m92827I0(String str) {
        boolean startsWith;
        startsWith = StringsKt__StringsJVMKt.startsWith(str, "https://qrco.de/birdbike", true);
        return startsWith;
    }

    /* renamed from: J */
    public final boolean m92826J(ScanStatus scanStatus) {
        return scanStatus == ScanStatus.ALREADY_HAS_RESERVATION;
    }

    /* renamed from: J0 */
    public final void m92825J0(AbstractC5751Ny abstractC5751Ny) {
        String str;
        if (abstractC5751Ny instanceof C52976zk5) {
            m92815O0();
            return;
        }
        Optional<Reservation> value = this.f25970k.mo83798e().getValue();
        if (value.m59037c()) {
            str = m92824K(this.f25961b, value.m59038b().getBird().getCode());
        } else {
            str = null;
        }
        m92823K0(abstractC5751Ny, str);
    }

    /* renamed from: K */
    public final String m92824K(Context context, String str) {
        String str2 = context.getString(C45871nl4.scan_bird_already_has_reservation_title) + " " + context.getString(C45871nl4.scan_bird_already_has_reservation_content, str);
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n      .a…dCode))\n      .toString()");
        return str2;
    }

    /* renamed from: K0 */
    public final void m92823K0(AbstractC5751Ny abstractC5751Ny, String str) {
        H31.C3014a.showDialog$default(this.f25983x, abstractC5751Ny, false, false, new C5867W(abstractC5751Ny, this), new C5868X(), null, str, 36, null);
    }

    /* renamed from: L */
    public final void m92822L(BirdScan birdScan, Boolean bool, Function1<? super Intent, Unit> function1) {
        RiderBirdScanExtra riderBirdScanExtra = this.f25982w;
        C41318g46.m40163a("closing down and sending extras as " + riderBirdScanExtra, new Object[0]);
        RiderBirdScanExtra riderBirdScanExtra2 = this.f25982w;
        InterfaceC40099e13 interfaceC40099e13 = this.f25976q;
        Intent intent = new Intent();
        intent.putExtra("rider_bird_scan", riderBirdScanExtra2);
        intent.putExtra("bird", birdScan);
        if (bool != null) {
            intent.putExtra("paired", bool.booleanValue());
        }
        function1.invoke(intent);
        Unit unit = Unit.INSTANCE;
        interfaceC40099e13.mo37190C1(-1, intent);
    }

    /* renamed from: L0 */
    public final void m92821L0() {
        String str;
        String string;
        WireBird bird;
        Reservation m59035e = this.f25970k.mo83798e().getValue().m59035e();
        if (m59035e != null && (bird = m59035e.getBird()) != null) {
            str = bird.getCode();
        } else {
            str = null;
        }
        if (str == null || (string = this.f25961b.getString(C45871nl4.scan_bird_already_has_reservation_content, str)) == null) {
            string = this.f25961b.getString(C45871nl4.scan_bird_already_has_reservation_content_no_code);
        }
        String str2 = string;
        Intrinsics.checkNotNullExpressionValue(str2, "reservedBirdCode?.let { …ervation_content_no_code)");
        H31.C3014a.showDialog$default(this.f25983x, this.f25961b.getString(C45871nl4.scan_bird_already_has_reservation_title), str2, null, null, false, false, new C5869Y(), null, null, 428, null);
    }

    /* renamed from: M0 */
    public final boolean m92819M0(RideConfig rideConfig, boolean z) {
        String priceChangeExpName = rideConfig.getPriceChangeExpName();
        if (priceChangeExpName != null) {
            AbstractC23461c m33069Q = this.f25967h.mo15556a(priceChangeExpName).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "experimentManager.markSt…       .onErrorComplete()");
            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f25981v));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
        WireRidePrice m37618h1 = this.f25962c.m37618h1();
        WireRidePrice m106251a = C32972Fv0.m106251a(this.f25968i.m82623f8().getValue());
        this.f25962c.m37605k2(m106251a);
        if (!X85.m77292a(this.f25968i, m37618h1)) {
            return false;
        }
        this.f25963d.mo55956N(new PriceChangeDetected(m106251a));
        if (!z) {
            return false;
        }
        m92818N(false);
        H31.C3014a.showDialog$default(this.f25983x, new C48411s24(m106251a), false, false, new C5870Z(), null, null, null, 116, null);
        this.f25963d.mo55956N(new PriceIncreaseModalShown(m106251a));
        return true;
    }

    /* renamed from: N */
    public final void m92818N(boolean z) {
        O85 o85;
        this.f25984y = z;
        if (z) {
            o85 = this;
        } else {
            o85 = null;
        }
        this.f25983x.mo7481l5(o85);
        if (z) {
            this.f25983x.mo7479n1();
        }
    }

    /* renamed from: N0 */
    public final void m92817N0() {
        String m16578b = C47819r24.f106320a.m16578b(this.f25961b, this.f25968i.m82623f8().getValue().getRideConfig());
        int i = C5873b.$EnumSwitchMapping$0[this.f25968i.m82623f8().getValue().getShowPriceOnScanner().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m92809R0(EnumC51375x24.LEGACY);
                    if (X85.m77291b(this.f25968i, this.f25962c)) {
                        this.f25983x.mo71338nl(m16578b);
                        this.f25983x.mo7474w9(false);
                        return;
                    }
                    this.f25983x.mo71337ol();
                    if (this.f25968i.m82623f8().getValue().getRideConfig().getEnableScannerCodeEntryV2()) {
                        this.f25983x.mo7474w9(this.f25968i.m82623f8().getValue().getRideConfig().getEnableScannerCodeEntryV2());
                        return;
                    }
                    return;
                }
                return;
            }
            m92809R0(EnumC51375x24.LEGACY);
            this.f25983x.mo71338nl(m16578b);
            this.f25983x.mo7474w9(false);
            return;
        }
        this.f25983x.mo71337ol();
        if (this.f25968i.m82623f8().getValue().getRideConfig().getEnableScannerCodeEntryV2()) {
            InterfaceC42324hm5.C22721a.showInfoText$default(this.f25983x, false, 1, null);
        }
    }

    /* renamed from: O */
    public final void m92816O(String str) {
        RideConfig rideConfig = this.f25968i.m82623f8().getValue().getRideConfig();
        if (!m92835E0(str, false)) {
            H31.C3014a.showDialog$default(this.f25983x, new C43490jk5(rideConfig.getMinBirdCodeLength(), rideConfig.getMaxBirdCodeLength()), false, false, null, null, null, null, 126, null);
        }
    }

    /* renamed from: O0 */
    public final void m92815O0() {
        H31.C3014a.showCustomDialog$default((H31) this.f25983x, C39311cj4.dialog_private_bird_scanned_error, (Integer) null, (Integer) null, false, false, false, (Integer) null, (Integer) null, (CharSequence) null, (CharSequence) null, C36585Vg4.positiveButton, Integer.valueOf(C36585Vg4.negativeButton), (String) null, (String) null, (Function0) new C5872a0(), (Function0) new C5874b0(), (Function0) new C5876c0(), (Function0) null, false, 406526, (Object) null);
    }

    /* renamed from: P */
    public final boolean m92814P(BirdScan birdScan) {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        WireError error = birdScan.getError();
        if (error != null) {
            str = error.getTitle();
        } else {
            str = null;
        }
        if (str != null) {
            WireError error2 = birdScan.getError();
            if (error2 != null) {
                str2 = error2.getMessage();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                InterfaceC10274ZS interfaceC10274ZS = this.f25983x;
                int i = C33804Jj4.dialog_general;
                Integer valueOf = Integer.valueOf(C37287Yg4.title);
                Integer valueOf2 = Integer.valueOf(C37287Yg4.message);
                WireError error3 = birdScan.getError();
                if (error3 != null) {
                    str3 = error3.getTitle();
                } else {
                    str3 = null;
                }
                WireError error4 = birdScan.getError();
                if (error4 != null) {
                    str4 = error4.getMessage();
                } else {
                    str4 = null;
                }
                int i2 = C37287Yg4.confirmButton;
                Integer valueOf3 = Integer.valueOf(C37287Yg4.secondaryButton);
                WireError error5 = birdScan.getError();
                if (error5 == null || (string = error5.getButtonText()) == null) {
                    string = this.f25983x.getString(C45871nl4.ok_uppercased, new Object[0]);
                }
                WireError error6 = birdScan.getError();
                if (error6 != null && error6.getButtonText() != null) {
                    str5 = this.f25983x.getString(C45871nl4.general_not_now, new Object[0]);
                } else {
                    str5 = null;
                }
                interfaceC10274ZS.showCustomDialog(i, (Integer) null, (Integer) null, false, true, true, valueOf, valueOf2, (CharSequence) str3, (CharSequence) str4, i2, valueOf3, string, str5, (Function0<Unit>) new C5877d(birdScan, this), (Function0<Unit>) C5879e.f26028g, (Function0<Unit>) C5880f.f26029g, (Function0<Unit>) C5881g.f26030g, true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: P0 */
    public final void m92813P0(WireBird wireBird) {
        WireLocation location;
        if (wireBird != null && (location = wireBird.getLocation()) != null) {
            this.f25969j.mo43630b(location.fromLocation());
        }
    }

    /* renamed from: Q */
    public final boolean m92812Q(String str) {
        String scannerUrlRedirect = this.f25968i.m82623f8().m73665a().getScannerUrlRedirect(str);
        if (scannerUrlRedirect != null) {
            this.f25976q.mo36983m2(scannerUrlRedirect);
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    public final void m92811Q0(boolean z, String str, String str2, String str3, String str4) {
        this.f25963d.mo55905y(new C20834gN(null, null, null, z, str, str2, str3, str4, 7, null));
    }

    /* renamed from: R */
    public final boolean m92810R(ScanStatus scanStatus) {
        return scanStatus == ScanStatus.OWNABLE;
    }

    /* renamed from: R0 */
    public final void m92809R0(EnumC51375x24 enumC51375x24) {
        Observable<Float> take = this.f25958A.take(1L);
        final C5878d0 c5878d0 = new C5878d0(enumC51375x24);
        Observable<Float> doAfterNext = take.doAfterNext(new InterfaceC23484g() { // from class: E85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92807S0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "private fun trackScanner…r)\n      .subscribe()\n  }");
        Object m33094as = doAfterNext.m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: S */
    public final boolean m92808S(ScanStatus scanStatus) {
        return scanStatus == ScanStatus.AVAILABLE_INSIDE_NO_RIDE_ZONE;
    }

    /* renamed from: T */
    public final boolean m92806T(ScanStatus scanStatus) {
        return scanStatus == ScanStatus.AVAILABLE_OUTSIDE_SERVICE_AREA;
    }

    /* renamed from: T0 */
    public final void m92805T0(WireBird wireBird) {
        WireBird copy;
        InterfaceC35422Qh2 interfaceC35422Qh2 = this.f25966g;
        copy = wireBird.copy((r91 & 1) != 0 ? wireBird.f66717id : null, (r91 & 2) != 0 ? wireBird.model : null, (r91 & 4) != 0 ? wireBird.taskId : null, (r91 & 8) != 0 ? wireBird.batteryLevel : 0, (r91 & 16) != 0 ? wireBird.estimatedRange : null, (r91 & 32) != 0 ? wireBird.distance : 0, (r91 & 64) != 0 ? wireBird.location : null, (r91 & 128) != 0 ? wireBird.code : null, (r91 & 256) != 0 ? wireBird.stickerId : null, (r91 & 512) != 0 ? wireBird.serialNumber : null, (r91 & 1024) != 0 ? wireBird.disconnected : false, (r91 & 2048) != 0 ? wireBird.collect : false, (r91 & 4096) != 0 ? wireBird.submerged : false, (r91 & 8192) != 0 ? wireBird.lost : false, (r91 & 16384) != 0 ? wireBird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.ackLocked : false, (r91 & 65536) != 0 ? wireBird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.broken : false, (r91 & 524288) != 0 ? wireBird.label : null, (r91 & 1048576) != 0 ? wireBird.actions : null, (r91 & 2097152) != 0 ? wireBird.bountyId : null, (r91 & 4194304) != 0 ? wireBird.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.bountyLost : false, (r91 & 33554432) != 0 ? wireBird.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird.bountyKind : null, (r91 & 134217728) != 0 ? wireBird.brandName : null, (r91 & 268435456) != 0 ? wireBird.taskKind : null, (r91 & 536870912) != 0 ? wireBird.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird.token : null, (r92 & 1) != 0 ? wireBird.bluetooth : true, (r92 & 2) != 0 ? wireBird.cellular : false, (r92 & 4) != 0 ? wireBird.startedAt : null, (r92 & 8) != 0 ? wireBird.dueAt : null, (r92 & 16) != 0 ? wireBird.asleep : false, (r92 & 32) != 0 ? wireBird.imei : null, (r92 & 64) != 0 ? wireBird.boardProtocol : null, (r92 & 128) != 0 ? wireBird.physicalLock : null, (r92 & 256) != 0 ? wireBird.priorityCollect : false, (r92 & 512) != 0 ? wireBird.down : false, (r92 & 1024) != 0 ? wireBird.needsInspection : false, (r92 & 2048) != 0 ? wireBird.partnerId : null, (r92 & 4096) != 0 ? wireBird.nestId : null, (r92 & 8192) != 0 ? wireBird.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.peril : false, (r92 & 65536) != 0 ? wireBird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.offline : false, (r92 & 524288) != 0 ? wireBird.license : null, (r92 & 1048576) != 0 ? wireBird.areaKey : null, (r92 & 2097152) != 0 ? wireBird.fleetId : null, (r92 & 4194304) != 0 ? wireBird.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.scannedAt : null, (r92 & 33554432) != 0 ? wireBird.badgeType : null, (r92 & 67108864) != 0 ? wireBird.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? wireBird.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird.bleMacAddress : null, (r93 & 1) != 0 ? wireBird.cellId : null, (r93 & 2) != 0 ? wireBird.externalFeedType : null);
        C9779YS.m75014b(interfaceC35422Qh2, copy, false);
    }

    /* renamed from: U */
    public final boolean m92804U(String str) {
        RideConfig rideConfig = this.f25968i.m82623f8().m73665a().getRideConfig();
        int minBirdCodeLength = rideConfig.getMinBirdCodeLength();
        int maxBirdCodeLength = rideConfig.getMaxBirdCodeLength();
        int length = str.length();
        if (minBirdCodeLength > length || length > maxBirdCodeLength) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m92798a() {
        if (this.f25968i.m82623f8().getValue().getPricingUiConfig().getEnabled()) {
            User mo76584a = this.f25974o.mo76584a();
            Intrinsics.checkNotNull(mo76584a);
            if (mo76584a.getRideCount() == 0) {
                this.f25983x.mo71340c5();
                m92809R0(EnumC51375x24.SEE_PRICING);
            } else if (this.f25962c.m37645b0() == null) {
                this.f25983x.mo71340c5();
                m92809R0(EnumC51375x24.SEE_PRICING);
            } else {
                AbstractC23442F<VehiclePricingDetails> mo9281a = this.f25973n.mo9281a(this.f25969j.mo43616p().getValue(), Double.valueOf(10.0d));
                final C5901t c5901t = new C5901t();
                AbstractC24507p<VehiclePricingDetails> m32066I = mo9281a.m33098z(new InterfaceC23494q() { // from class: M85
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean m92803V;
                        m92803V = O85.m92803V(Function1.this, obj);
                        return m92803V;
                    }
                }).m32059P(1L).m32066I(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m32066I, "override fun onCreate() …itor(extras.birdCode)\n  }");
                Object m32048b = m32066I.m32048b(AutoDispose.m45239a(this.f25981v));
                Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C5904w c5904w = new C5904w();
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: s85
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        O85.m92802W(Function1.this, obj);
                    }
                };
                final C5905x c5905x = new C5905x();
                ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: v85
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        O85.m92784h0(Function1.this, obj);
                    }
                });
            }
            Object m33094as = this.f25983x.mo71347F2().m33094as(AutoDispose.m45239a(this.f25981v));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C5906y c5906y = new C5906y();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: w85
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    O85.m92778k0(Function1.this, obj);
                }
            });
        }
        Observable<Optional<WireFrequentFlyerView>> observeOn = this.f25977r.getData().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "frequentFlyerManager.dat…dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5907z c5907z = new C5907z();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: x85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92776l0(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f25983x.mo7478sa().m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5841A c5841a = new C5841A();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: y85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92774m0(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f25983x.mo7472z1().m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5843B c5843b = new C5843B();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: z85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92772n0(Function1.this, obj);
            }
        });
        Observable<C9400XK> mo7497W3 = this.f25983x.mo7497W3();
        final C5844C c5844c = new C5844C();
        Observable<C9400XK> doOnNext = mo7497W3.doOnNext(new InterfaceC23484g() { // from class: A85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92770o0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate() …itor(extras.birdCode)\n  }");
        Object m33094as5 = doOnNext.m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5845D c5845d = new C5845D();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: B85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92768p0(Function1.this, obj);
            }
        });
        RideConfig rideConfig = this.f25968i.m82623f8().m73665a().getRideConfig();
        Observable<Unit> take = this.f25983x.mo7499Vg().take(1L);
        final C5883i c5883i = new C5883i(rideConfig, this);
        Observable<Unit> observeOn2 = take.filter(new InterfaceC23494q() { // from class: C85
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m92800Y;
                m92800Y = O85.m92800Y(Function1.this, obj);
                return m92800Y;
            }
        }).delay(rideConfig.getScannerCodeEntryTooltipMaxDuration(), TimeUnit.SECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate() …itor(extras.birdCode)\n  }");
        Object m33094as6 = observeOn2.m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5884j c5884j = new C5884j(rideConfig);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: N85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92801X(Function1.this, obj);
            }
        });
        this.f25983x.mo7492d2(this.f25968i.m82623f8().getValue().getRideConfig().getMaxBirdCodeLength());
        Object m33094as7 = this.f25983x.mo7471zc().m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5885k c5885k = new C5885k();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: j85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92799Z(Function1.this, obj);
            }
        });
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Z84<Config> m82623f8 = this.f25968i.m82623f8();
        final C5886l c5886l = C5886l.f26037g;
        InterfaceC23434B map = m82623f8.map(new InterfaceC23492o() { // from class: k85
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m92797a0;
                m92797a0 = O85.m92797a0(Function1.this, obj);
                return m92797a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "reactiveConfig.config\n  …canlessRideStartScanner }");
        Z84<RideStates> mo75032o0 = this.f25979t.mo75032o0();
        final C5887m c5887m = C5887m.f26038g;
        InterfaceC23434B map2 = mo75032o0.map(new InterfaceC23492o() { // from class: l85
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m92796b0;
                m92796b0 = O85.m92796b0(Function1.this, obj);
                return m92796b0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "rideManager.rideStates\n …it.activeRideCount == 0 }");
        Observable combineLatest = Observable.combineLatest(map, map2, C5882h.f26031a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C5888n c5888n = C5888n.f26039g;
        Observable distinctUntilChanged = combineLatest.map(new InterfaceC23492o() { // from class: m85
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m92794c0;
                m92794c0 = O85.m92794c0(Function1.this, obj);
                return m92794c0;
            }
        }).distinctUntilChanged();
        final C5889o c5889o = new C5889o(objectRef, this);
        Observable observeOn3 = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: n85
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m92792d0;
                m92792d0 = O85.m92792d0(Function1.this, obj);
                return m92792d0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onCreate() …itor(extras.birdCode)\n  }");
        Object m33094as8 = C24527f.m31950a(observeOn3, this.f25969j.mo43616p()).m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5897p c5897p = new C5897p(objectRef);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: o85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92790e0(Function1.this, obj);
            }
        };
        final C5898q c5898q = C5898q.f26051b;
        ((ObservableSubscribeProxy) m33094as8).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: p85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92788f0(Function1.this, obj);
            }
        });
        Observable m74575T = C37279Yf5.m74575T(C24527f.m31950a(this.f25983x.mo71346Hh(), this.f25978s.mo89852e()), C5899r.f26052g);
        final C5900s c5900s = new C5900s();
        Observable observeOn4 = m74575T.doOnNext(new InterfaceC23484g() { // from class: q85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92786g0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "override fun onCreate() …itor(extras.birdCode)\n  }");
        Object m33094as9 = observeOn4.m33094as(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5902u c5902u = new C5902u();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: r85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92782i0(Function1.this, obj);
            }
        };
        final C5903v c5903v = C5903v.f26056b;
        ((ObservableSubscribeProxy) m33094as9).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: u85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92780j0(Function1.this, obj);
            }
        });
        m92817N0();
        this.f25983x.mo7476tc(this.f25982w.getBirdCode());
    }

    @Override // p000.InterfaceC41138fm5
    /* renamed from: b */
    public void mo40823b(C40545em5 rawResult) {
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        String m42565b = rawResult.m42565b();
        if (m42565b == null) {
            return;
        }
        m92835E0(m42565b, true);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // p000.InterfaceC41950h85
    public void onPause() {
        this.f25972m.unregisterListener(this);
        C41318g46.m40151m("camera: onPause", new Object[0]);
        this.f25960C.dispose();
        this.f25983x.mo7495a1();
    }

    @Override // p000.InterfaceC41950h85
    public void onResume() {
        this.f25972m.registerListener(this, this.f25985z, 10000000);
        C41318g46.m40151m("camera: onResume", new Object[0]);
        this.f25983x.mo7491d6(0.2f);
        C23464b c23464b = this.f25960C;
        AbstractC23442F<Boolean> firstOrError = this.f25968i.m82567k9().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "reactiveConfig\n      .sh…l()\n      .firstOrError()");
        Object m33135e = firstOrError.m33135e(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5846E c5846e = new C5846E();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: i85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92767q0(Function1.this, obj);
            }
        };
        final C5847F c5847f = new C5847F();
        c23464b.mo32983c(((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: t85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92765r0(Function1.this, obj);
            }
        }));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            this.f25958A.accept(Float.valueOf(sensorEvent.values[0]));
        }
    }

    /* renamed from: s0 */
    public final void m92763s0(Throwable th) {
        if (th instanceof PairException) {
            H31.C3014a.showDialog$default(this.f25983x, C49119tE3.f110202d, true, false, null, null, null, null, 124, null);
        } else {
            this.f25983x.errorGeneric();
        }
        this.f25963d.mo55905y(new U55(null, null, null, Q36.m88990a(th), Q36.m88989b(th), Boolean.valueOf(this.f25968i.m82623f8().m73665a().getRideConfig().getEnableAndroidScanToRide()), Long.valueOf(this.f25979t.mo75032o0().m73665a().getActiveRideCount()), 7, null));
        m92749z0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m92761t0(HM4<BirdScan> hm4) {
        String m11932c;
        String str;
        ScanStatus status;
        String str2;
        String str3;
        EnumC38136ak5 value;
        String str4;
        BirdScan m103944a = hm4.m103944a();
        if (m103944a != null) {
            WireBird bird = m103944a.getBird();
            m92813P0(bird);
            RideConfig rideConfig = this.f25968i.m82623f8().m73665a().getRideConfig();
            InterfaceC1880Ea interfaceC1880Ea = this.f25963d;
            String birdCode = m103944a.getBirdCode();
            Unit unit = null;
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
                    String currency = this.f25968i.m82623f8().m73665a().getRideConfig().getCurrency();
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
                    Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(this.f25962c.m37750B0()));
                    value = this.f25959B.getValue();
                    if (value == null) {
                        str4 = value.name();
                    } else {
                        str4 = null;
                    }
                    interfaceC1880Ea.mo55905y(new C32086Ca5(null, null, null, str5, str2, currency, minimumRidePrice, minutePrice, includedMinutes, str3, applyTax, basePrice, valueOf, str4, null, 16391, null));
                    if (!m92814P(m103944a) || m92755w0(m103944a)) {
                        return;
                    }
                    if (!m92810R(m103944a.getStatus()) && bird != null) {
                        m92805T0(bird);
                        H31.C3014a.showDialog$default(this.f25983x, C49712uE3.f112000d, false, false, new C5848G(m103944a), null, new C5849H(m103944a), null, 84, null);
                        return;
                    } else if (!m92806T(m103944a.getStatus())) {
                        this.f25983x.mo71343Q3(C51916xx1.f118396a.m4401k(this.f25961b, (int) TimeUnit.MINUTES.convert(this.f25968i.m82623f8().m73665a().getRideConfig().getMaxRideDurationSecondsOutsideOperatingArea(), TimeUnit.SECONDS), false), new C5850I(m103944a), new C5852J(), new C5853K());
                        return;
                    } else if (m92808S(m103944a.getStatus())) {
                        this.f25983x.mo71336we(C51916xx1.f118396a.m4401k(this.f25961b, (int) TimeUnit.MINUTES.convert(this.f25968i.m82623f8().m73665a().getRideConfig().getMaxRideDurationSecondsNoRideZone(), TimeUnit.SECONDS), false), new C5854L(m103944a), new C5856M(), new C5857N());
                        return;
                    } else if (m92826J(m103944a.getStatus())) {
                        m92821L0();
                        return;
                    } else {
                        AbstractC5751Ny m91146a = C6212Oy.m91146a(m103944a.getMode(), m103944a.getStatus(), this.f25968i);
                        if (m91146a != null) {
                            m92825J0(m91146a);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            m92820M(this, m103944a, null, null, 6, null);
                            return;
                        }
                        return;
                    }
                }
            }
            str = birdCode;
            status = m103944a.getStatus();
            if (status == null) {
            }
            String currency2 = this.f25968i.m82623f8().m73665a().getRideConfig().getCurrency();
            long minimumRidePrice2 = rideConfig.getMinimumRidePrice();
            long minutePrice2 = rideConfig.getMinutePrice();
            String str52 = str;
            long includedMinutes2 = rideConfig.getIncludedMinutes();
            if (bird == null) {
            }
            boolean applyTax2 = rideConfig.getAdditionalFees().getApplyTax();
            long basePrice2 = rideConfig.getBasePrice();
            Boolean valueOf2 = Boolean.valueOf(UserKt.isInRegistration(this.f25962c.m37750B0()));
            value = this.f25959B.getValue();
            if (value == null) {
            }
            interfaceC1880Ea.mo55905y(new C32086Ca5(null, null, null, str52, str2, currency2, minimumRidePrice2, minutePrice2, includedMinutes2, str3, applyTax2, basePrice2, valueOf2, str4, null, 16391, null));
            if (!m92814P(m103944a)) {
                return;
            }
            if (!m92810R(m103944a.getStatus())) {
            }
            if (!m92806T(m103944a.getStatus())) {
            }
        } else {
            C49375tg1 m94017d = NM4.m94017d(hm4);
            if (m94017d != null && (m11932c = m94017d.m11932c()) != null) {
                this.f25983x.error(m11932c);
            }
        }
    }

    /* renamed from: u0 */
    public final Observable<HM4<BirdScan>> m92759u0(HM4<BirdScan> hm4) {
        BirdScan m103944a = hm4.m103944a();
        if (m103944a == null) {
            Observable<HM4<BirdScan>> just = Observable.just(hm4);
            Intrinsics.checkNotNullExpressionValue(just, "just(scanResponse)");
            return just;
        }
        WireBird bird = m103944a.getBird();
        if (bird == null) {
            Observable<HM4<BirdScan>> just2 = Observable.just(hm4);
            Intrinsics.checkNotNullExpressionValue(just2, "just(scanResponse)");
            return just2;
        } else if (m92810R(m103944a.getStatus())) {
            AbstractC23442F<WireBird> mo18196r = this.f25971l.mo18196r(bird.getId());
            final C5858O c5858o = new C5858O(bird, m103944a);
            Observable m33162D = mo18196r.m33162D(new InterfaceC23492o() { // from class: H85
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m92757v0;
                    m92757v0 = O85.m92757v0(Function1.this, obj);
                    return m92757v0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33162D, "responseBody = scanRespo…dScanResponse))\n        }");
            return m33162D;
        } else {
            Observable<HM4<BirdScan>> just3 = Observable.just(hm4);
            Intrinsics.checkNotNullExpressionValue(just3, "just(scanResponse)");
            return just3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[ADDED_TO_REGION] */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m92755w0(BirdScan birdScan) {
        WireSmartlock wireSmartlock;
        boolean z;
        List<String> forceBtPermissionByModel;
        boolean z2;
        boolean z3;
        String model;
        WirePhysicalLock physicalLock;
        WirePhysicalLock physicalLock2;
        InterfaceC5225MD.EnumC5227b mo73605b = this.f25980u.mo73605b();
        WireBird bird = birdScan.getBird();
        PhysicalLockPurpose physicalLockPurpose = null;
        if (bird != null && (physicalLock2 = bird.getPhysicalLock()) != null) {
            wireSmartlock = physicalLock2.getSmartlock();
        } else {
            wireSmartlock = null;
        }
        if (wireSmartlock != null) {
            WireBird bird2 = birdScan.getBird();
            if (bird2 != null && (physicalLock = bird2.getPhysicalLock()) != null) {
                physicalLockPurpose = physicalLock.getPurpose();
            }
            if (physicalLockPurpose != PhysicalLockPurpose.HELMET && mo73605b != InterfaceC5225MD.EnumC5227b.READY) {
                z = false;
                forceBtPermissionByModel = this.f25968i.m82623f8().m73665a().getForceBtPermissionByModel();
                if (!forceBtPermissionByModel.isEmpty()) {
                    WireBird bird3 = birdScan.getBird();
                    if (bird3 != null && (model = bird3.getModel()) != null && !forceBtPermissionByModel.contains(model)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 || mo73605b != InterfaceC5225MD.EnumC5227b.READY) {
                        z2 = false;
                        if (!z && z2) {
                            return false;
                        }
                        C9799YX c9799yx = new C9799YX(mo73605b);
                        Object m33135e = H31.C3014a.birdDialog$default(this.f25983x, c9799yx, false, false, 6, null).m33135e(AutoDispose.m45239a(this.f25981v));
                        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C5859P c5859p = new C5859P(c9799yx, this);
                        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: K85
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                O85.m92753x0(Function1.this, obj);
                            }
                        };
                        final C5861Q c5861q = C5861Q.f26010b;
                        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: L85
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                O85.m92751y0(Function1.this, obj);
                            }
                        });
                        return true;
                    }
                }
                z2 = true;
                if (!z) {
                }
                C9799YX c9799yx2 = new C9799YX(mo73605b);
                Object m33135e2 = H31.C3014a.birdDialog$default(this.f25983x, c9799yx2, false, false, 6, null).m33135e(AutoDispose.m45239a(this.f25981v));
                Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
                final Function1 c5859p2 = new C5859P(c9799yx2, this);
                InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: K85
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        O85.m92753x0(Function1.this, obj);
                    }
                };
                final Function1 c5861q2 = C5861Q.f26010b;
                ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: L85
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        O85.m92751y0(Function1.this, obj);
                    }
                });
                return true;
            }
        }
        z = true;
        forceBtPermissionByModel = this.f25968i.m82623f8().m73665a().getForceBtPermissionByModel();
        if (!forceBtPermissionByModel.isEmpty()) {
        }
        z2 = true;
        if (!z) {
        }
        C9799YX c9799yx22 = new C9799YX(mo73605b);
        Object m33135e22 = H31.C3014a.birdDialog$default(this.f25983x, c9799yx22, false, false, 6, null).m33135e(AutoDispose.m45239a(this.f25981v));
        Intrinsics.checkExpressionValueIsNotNull(m33135e22, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c5859p22 = new C5859P(c9799yx22, this);
        InterfaceC23484g interfaceC23484g22 = new InterfaceC23484g() { // from class: K85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92753x0(Function1.this, obj);
            }
        };
        final Function1 c5861q22 = C5861Q.f26010b;
        ((SingleSubscribeProxy) m33135e22).subscribe(interfaceC23484g22, new InterfaceC23484g() { // from class: L85
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                O85.m92751y0(Function1.this, obj);
            }
        });
        return true;
    }

    /* renamed from: z0 */
    public final void m92749z0() {
        if (this.f25984y) {
            this.f25983x.mo7481l5(this);
        }
        this.f25983x.mo7479n1();
    }
}
