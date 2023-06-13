package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0006\n\u0002\bb\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\u0002\u0012\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0002\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0004\u0012\u000b\b\u0002\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004\u0012\u000b\b\u0002\u0010\u008b\u0001\u001a\u0004\u0018\u00010)\u0012\f\b\u0002\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008c\u0001\u0012\u000b\b\u0002\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0007\u0012\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\fR\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u00101\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0019\u00104\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u00107\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010:\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-R\u0019\u0010=\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-R\u0019\u0010B\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u0019\u0010H\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010\n\u001a\u0004\bG\u0010\fR\u0019\u0010K\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u0019\u0010N\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\n\u001a\u0004\bM\u0010\fR\u0019\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u0019\u0010T\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u0010\n\u001a\u0004\bS\u0010\fR\u0019\u0010W\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\fR\u0019\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u0010\n\u001a\u0004\bY\u0010\fR\u0019\u0010]\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u0010\n\u001a\u0004\b\\\u0010\fR\u0019\u0010`\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u0010\n\u001a\u0004\b_\u0010\fR\u0019\u0010c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010\n\u001a\u0004\bb\u0010\fR\u0019\u0010f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bd\u0010\n\u001a\u0004\be\u0010\fR\u0019\u0010i\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bh\u0010\fR\u0019\u0010l\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010\n\u001a\u0004\bk\u0010\fR\u0019\u0010o\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u0019\u0010r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010\n\u001a\u0004\bq\u0010\fR\u0019\u0010u\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR\u0019\u0010x\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010\n\u001a\u0004\bw\u0010\fR\u0019\u0010{\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\by\u0010?\u001a\u0004\bz\u0010AR\u0019\u0010~\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b|\u0010\n\u001a\u0004\b}\u0010\fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u007f\u0010?\u001a\u0005\b\u0080\u0001\u0010AR\u001e\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0082\u0001\u001a\u0006\b\u0087\u0001\u0010\u0084\u0001R\u001c\u0010\u008b\u0001\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010+\u001a\u0005\b\u008a\u0001\u0010-R\u001f\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010?\u001a\u0005\b\u0093\u0001\u0010AR\u001c\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\n\u001a\u0005\b\u0096\u0001\u0010\fR\"\u0010\u009a\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0098\u00018F¢\u0006\u0007\u001a\u0005\b\t\u0010\u0099\u0001¨\u0006\u009d\u0001"}, m28432d2 = {"Lwp0;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getAppVersion", "()Ljava/lang/String;", "appVersion", "b", "getOsVersion", "osVersion", "c", "getConnectionType", "connectionType", DateTokenConverter.CONVERTER_KEY, "getMobileNetworkGeneration", "mobileNetworkGeneration", "e", "getDeviceModel", "deviceModel", "f", "getDeviceId", "deviceId", "g", "getDeviceIdStr", "deviceIdStr", "h", "getBatteryLevel", "batteryLevel", "i", "getPlatform", "platform", "j", "getCarrierName", "carrierName", "", "k", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "latitude", "l", "getLongitude", "longitude", "m", "getHeading", "heading", "n", "getSpeed", TransferTable.COLUMN_SPEED, "o", "getAltitude", "altitude", "p", "getAccuracy", "accuracy", "q", "Ljava/lang/Boolean;", "getLocationMocked", "()Ljava/lang/Boolean;", "locationMocked", "r", "getUserId", "userId", "s", "getWarehouseId", "warehouseId", "t", "getZoneName", "zoneName", "u", "getPermissionBluetooth", "permissionBluetooth", "v", "getPermissionLocation", "permissionLocation", "w", "getPermissionNotification", "permissionNotification", "x", "getPermissionCamera", "permissionCamera", "y", "getPermissionBackgroundRefresh", "permissionBackgroundRefresh", "z", "getRole", "role", "A", "getDeviceTimezone", "deviceTimezone", "B", "getDeviceLanguage", "deviceLanguage", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "getAppLanguage", "appLanguage", "D", "getAppName", NamedConstantsKt.APP_NAME, "E", "getDeviceRegion", "deviceRegion", "F", "getAppBuild", "appBuild", "G", "getParentHabitatId", "parentHabitatId", "H", "getPrimaryPartnerId", "primaryPartnerId", "I", "getPermissionDataSaver", "permissionDataSaver", "J", "getDigitalWalletEnabled", "digitalWalletEnabled", "K", "getUserInterfaceStyle", "userInterfaceStyle", "L", "isManagedDevice", "M", "Ljava/lang/Integer;", "getWifiSignalLevel", "()Ljava/lang/Integer;", "wifiSignalLevel", "N", "getCellularSignalLevel", "cellularSignalLevel", "O", "getMemoryUsage", "memoryUsage", "", "P", "Ljava/lang/Long;", "getMaxMemoryAvailable", "()Ljava/lang/Long;", "maxMemoryAvailable", "Q", "getMlKitScannerEnabled", "mlKitScannerEnabled", "R", "getAppType", "appType", "", "()Ljava/util/Map;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wp0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C51242wp0 {

    /* renamed from: A */
    public final String f116559A;

    /* renamed from: B */
    public final String f116560B;

    /* renamed from: C */
    public final String f116561C;

    /* renamed from: D */
    public final String f116562D;

    /* renamed from: E */
    public final String f116563E;

    /* renamed from: F */
    public final String f116564F;

    /* renamed from: G */
    public final String f116565G;

    /* renamed from: H */
    public final String f116566H;

    /* renamed from: I */
    public final String f116567I;

    /* renamed from: J */
    public final Boolean f116568J;

    /* renamed from: K */
    public final String f116569K;

    /* renamed from: L */
    public final Boolean f116570L;

    /* renamed from: M */
    public final Integer f116571M;

    /* renamed from: N */
    public final Integer f116572N;

    /* renamed from: O */
    public final Double f116573O;

    /* renamed from: P */
    public final Long f116574P;

    /* renamed from: Q */
    public final Boolean f116575Q;

    /* renamed from: R */
    public final String f116576R;

    /* renamed from: a */
    public final String f116577a;

    /* renamed from: b */
    public final String f116578b;

    /* renamed from: c */
    public final String f116579c;

    /* renamed from: d */
    public final String f116580d;

    /* renamed from: e */
    public final String f116581e;

    /* renamed from: f */
    public final String f116582f;

    /* renamed from: g */
    public final String f116583g;

    /* renamed from: h */
    public final String f116584h;

    /* renamed from: i */
    public final String f116585i;

    /* renamed from: j */
    public final String f116586j;

    /* renamed from: k */
    public final Double f116587k;

    /* renamed from: l */
    public final Double f116588l;

    /* renamed from: m */
    public final Double f116589m;

    /* renamed from: n */
    public final Double f116590n;

    /* renamed from: o */
    public final Double f116591o;

    /* renamed from: p */
    public final Double f116592p;

    /* renamed from: q */
    public final Boolean f116593q;

    /* renamed from: r */
    public final String f116594r;

    /* renamed from: s */
    public final String f116595s;

    /* renamed from: t */
    public final String f116596t;

    /* renamed from: u */
    public final String f116597u;

    /* renamed from: v */
    public final String f116598v;

    /* renamed from: w */
    public final String f116599w;

    /* renamed from: x */
    public final String f116600x;

    /* renamed from: y */
    public final String f116601y;

    /* renamed from: z */
    public final String f116602z;

    public C51242wp0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4095, null);
    }

    /* renamed from: a */
    public final Map<String, Object> m6301a() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsFields.APP_VERSION, this.f116577a), TuplesKt.m28425to(AnalyticsFields.OS_VERSION, this.f116578b), TuplesKt.m28425to("connection_type", this.f116579c), TuplesKt.m28425to("mobile_network_generation", this.f116580d), TuplesKt.m28425to("device_model", this.f116581e), TuplesKt.m28425to("device_id", this.f116582f), TuplesKt.m28425to("device_id_str", this.f116583g), TuplesKt.m28425to("battery_level", this.f116584h), TuplesKt.m28425to("platform", this.f116585i), TuplesKt.m28425to("carrier_name", this.f116586j), TuplesKt.m28425to("latitude", this.f116587k), TuplesKt.m28425to("longitude", this.f116588l), TuplesKt.m28425to("heading", this.f116589m), TuplesKt.m28425to(TransferTable.COLUMN_SPEED, this.f116590n), TuplesKt.m28425to("altitude", this.f116591o), TuplesKt.m28425to("accuracy", this.f116592p), TuplesKt.m28425to("location_mocked", this.f116593q), TuplesKt.m28425to("user_id", this.f116594r), TuplesKt.m28425to("warehouse_id", this.f116595s), TuplesKt.m28425to("zone_name", this.f116596t), TuplesKt.m28425to("permission_bluetooth", this.f116597u), TuplesKt.m28425to("permission_location", this.f116598v), TuplesKt.m28425to("permission_notification", this.f116599w), TuplesKt.m28425to("permission_camera", this.f116600x), TuplesKt.m28425to("permission_background_refresh", this.f116601y), TuplesKt.m28425to("role", this.f116602z), TuplesKt.m28425to("device_timezone", this.f116559A), TuplesKt.m28425to("device_language", this.f116560B), TuplesKt.m28425to("app_language", this.f116561C), TuplesKt.m28425to(AnalyticsFields.APP_NAME, this.f116562D), TuplesKt.m28425to("device_region", this.f116563E), TuplesKt.m28425to("app_build", this.f116564F), TuplesKt.m28425to("parent_habitat_id", this.f116565G), TuplesKt.m28425to("primary_partner_id", this.f116566H), TuplesKt.m28425to("permission_data_saver", this.f116567I), TuplesKt.m28425to("digital_wallet_enabled", this.f116568J), TuplesKt.m28425to("user_interface_style", this.f116569K), TuplesKt.m28425to("is_managed_device", this.f116570L), TuplesKt.m28425to("wifi_signal_level", this.f116571M), TuplesKt.m28425to("cellular_signal_level", this.f116572N), TuplesKt.m28425to("memory_usage", this.f116573O), TuplesKt.m28425to("max_memory_available", this.f116574P), TuplesKt.m28425to("ml_kit_scanner_enabled", this.f116575Q), TuplesKt.m28425to("app_type", this.f116576R));
        return mapOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51242wp0) {
            C51242wp0 c51242wp0 = (C51242wp0) obj;
            return Intrinsics.areEqual(this.f116577a, c51242wp0.f116577a) && Intrinsics.areEqual(this.f116578b, c51242wp0.f116578b) && Intrinsics.areEqual(this.f116579c, c51242wp0.f116579c) && Intrinsics.areEqual(this.f116580d, c51242wp0.f116580d) && Intrinsics.areEqual(this.f116581e, c51242wp0.f116581e) && Intrinsics.areEqual(this.f116582f, c51242wp0.f116582f) && Intrinsics.areEqual(this.f116583g, c51242wp0.f116583g) && Intrinsics.areEqual(this.f116584h, c51242wp0.f116584h) && Intrinsics.areEqual(this.f116585i, c51242wp0.f116585i) && Intrinsics.areEqual(this.f116586j, c51242wp0.f116586j) && Intrinsics.areEqual((Object) this.f116587k, (Object) c51242wp0.f116587k) && Intrinsics.areEqual((Object) this.f116588l, (Object) c51242wp0.f116588l) && Intrinsics.areEqual((Object) this.f116589m, (Object) c51242wp0.f116589m) && Intrinsics.areEqual((Object) this.f116590n, (Object) c51242wp0.f116590n) && Intrinsics.areEqual((Object) this.f116591o, (Object) c51242wp0.f116591o) && Intrinsics.areEqual((Object) this.f116592p, (Object) c51242wp0.f116592p) && Intrinsics.areEqual(this.f116593q, c51242wp0.f116593q) && Intrinsics.areEqual(this.f116594r, c51242wp0.f116594r) && Intrinsics.areEqual(this.f116595s, c51242wp0.f116595s) && Intrinsics.areEqual(this.f116596t, c51242wp0.f116596t) && Intrinsics.areEqual(this.f116597u, c51242wp0.f116597u) && Intrinsics.areEqual(this.f116598v, c51242wp0.f116598v) && Intrinsics.areEqual(this.f116599w, c51242wp0.f116599w) && Intrinsics.areEqual(this.f116600x, c51242wp0.f116600x) && Intrinsics.areEqual(this.f116601y, c51242wp0.f116601y) && Intrinsics.areEqual(this.f116602z, c51242wp0.f116602z) && Intrinsics.areEqual(this.f116559A, c51242wp0.f116559A) && Intrinsics.areEqual(this.f116560B, c51242wp0.f116560B) && Intrinsics.areEqual(this.f116561C, c51242wp0.f116561C) && Intrinsics.areEqual(this.f116562D, c51242wp0.f116562D) && Intrinsics.areEqual(this.f116563E, c51242wp0.f116563E) && Intrinsics.areEqual(this.f116564F, c51242wp0.f116564F) && Intrinsics.areEqual(this.f116565G, c51242wp0.f116565G) && Intrinsics.areEqual(this.f116566H, c51242wp0.f116566H) && Intrinsics.areEqual(this.f116567I, c51242wp0.f116567I) && Intrinsics.areEqual(this.f116568J, c51242wp0.f116568J) && Intrinsics.areEqual(this.f116569K, c51242wp0.f116569K) && Intrinsics.areEqual(this.f116570L, c51242wp0.f116570L) && Intrinsics.areEqual(this.f116571M, c51242wp0.f116571M) && Intrinsics.areEqual(this.f116572N, c51242wp0.f116572N) && Intrinsics.areEqual((Object) this.f116573O, (Object) c51242wp0.f116573O) && Intrinsics.areEqual(this.f116574P, c51242wp0.f116574P) && Intrinsics.areEqual(this.f116575Q, c51242wp0.f116575Q) && Intrinsics.areEqual(this.f116576R, c51242wp0.f116576R);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f116577a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f116578b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f116579c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f116580d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f116581e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f116582f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f116583g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f116584h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f116585i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f116586j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Double d = this.f116587k;
        int hashCode11 = (hashCode10 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f116588l;
        int hashCode12 = (hashCode11 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f116589m;
        int hashCode13 = (hashCode12 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f116590n;
        int hashCode14 = (hashCode13 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f116591o;
        int hashCode15 = (hashCode14 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f116592p;
        int hashCode16 = (hashCode15 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Boolean bool = this.f116593q;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.f116594r;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f116595s;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f116596t;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f116597u;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f116598v;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f116599w;
        int hashCode23 = (hashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f116600x;
        int hashCode24 = (hashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f116601y;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f116602z;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f116559A;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f116560B;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f116561C;
        int hashCode29 = (hashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f116562D;
        int hashCode30 = (hashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f116563E;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f116564F;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f116565G;
        int hashCode33 = (hashCode32 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.f116566H;
        int hashCode34 = (hashCode33 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.f116567I;
        int hashCode35 = (hashCode34 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Boolean bool2 = this.f116568J;
        int hashCode36 = (hashCode35 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str29 = this.f116569K;
        int hashCode37 = (hashCode36 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Boolean bool3 = this.f116570L;
        int hashCode38 = (hashCode37 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.f116571M;
        int hashCode39 = (hashCode38 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f116572N;
        int hashCode40 = (hashCode39 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d7 = this.f116573O;
        int hashCode41 = (hashCode40 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Long l = this.f116574P;
        int hashCode42 = (hashCode41 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool4 = this.f116575Q;
        int hashCode43 = (hashCode42 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str30 = this.f116576R;
        return hashCode43 + (str30 != null ? str30.hashCode() : 0);
    }

    public String toString() {
        String str = this.f116577a;
        String str2 = this.f116578b;
        String str3 = this.f116579c;
        String str4 = this.f116580d;
        String str5 = this.f116581e;
        String str6 = this.f116582f;
        String str7 = this.f116583g;
        String str8 = this.f116584h;
        String str9 = this.f116585i;
        String str10 = this.f116586j;
        Double d = this.f116587k;
        Double d2 = this.f116588l;
        Double d3 = this.f116589m;
        Double d4 = this.f116590n;
        Double d5 = this.f116591o;
        Double d6 = this.f116592p;
        Boolean bool = this.f116593q;
        String str11 = this.f116594r;
        String str12 = this.f116595s;
        String str13 = this.f116596t;
        String str14 = this.f116597u;
        String str15 = this.f116598v;
        String str16 = this.f116599w;
        String str17 = this.f116600x;
        String str18 = this.f116601y;
        String str19 = this.f116602z;
        String str20 = this.f116559A;
        String str21 = this.f116560B;
        String str22 = this.f116561C;
        String str23 = this.f116562D;
        String str24 = this.f116563E;
        String str25 = this.f116564F;
        String str26 = this.f116565G;
        String str27 = this.f116566H;
        String str28 = this.f116567I;
        Boolean bool2 = this.f116568J;
        String str29 = this.f116569K;
        Boolean bool3 = this.f116570L;
        Integer num = this.f116571M;
        Integer num2 = this.f116572N;
        Double d7 = this.f116573O;
        Long l = this.f116574P;
        Boolean bool4 = this.f116575Q;
        String str30 = this.f116576R;
        return "CommonMetadata(appVersion=" + str + ", osVersion=" + str2 + ", connectionType=" + str3 + ", mobileNetworkGeneration=" + str4 + ", deviceModel=" + str5 + ", deviceId=" + str6 + ", deviceIdStr=" + str7 + ", batteryLevel=" + str8 + ", platform=" + str9 + ", carrierName=" + str10 + ", latitude=" + d + ", longitude=" + d2 + ", heading=" + d3 + ", speed=" + d4 + ", altitude=" + d5 + ", accuracy=" + d6 + ", locationMocked=" + bool + ", userId=" + str11 + ", warehouseId=" + str12 + ", zoneName=" + str13 + ", permissionBluetooth=" + str14 + ", permissionLocation=" + str15 + ", permissionNotification=" + str16 + ", permissionCamera=" + str17 + ", permissionBackgroundRefresh=" + str18 + ", role=" + str19 + ", deviceTimezone=" + str20 + ", deviceLanguage=" + str21 + ", appLanguage=" + str22 + ", appName=" + str23 + ", deviceRegion=" + str24 + ", appBuild=" + str25 + ", parentHabitatId=" + str26 + ", primaryPartnerId=" + str27 + ", permissionDataSaver=" + str28 + ", digitalWalletEnabled=" + bool2 + ", userInterfaceStyle=" + str29 + ", isManagedDevice=" + bool3 + ", wifiSignalLevel=" + num + ", cellularSignalLevel=" + num2 + ", memoryUsage=" + d7 + ", maxMemoryAvailable=" + l + ", mlKitScannerEnabled=" + bool4 + ", appType=" + str30 + ")";
    }

    public C51242wp0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Boolean bool, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool2, String str29, Boolean bool3, Integer num, Integer num2, Double d7, Long l, Boolean bool4, String str30) {
        this.f116577a = str;
        this.f116578b = str2;
        this.f116579c = str3;
        this.f116580d = str4;
        this.f116581e = str5;
        this.f116582f = str6;
        this.f116583g = str7;
        this.f116584h = str8;
        this.f116585i = str9;
        this.f116586j = str10;
        this.f116587k = d;
        this.f116588l = d2;
        this.f116589m = d3;
        this.f116590n = d4;
        this.f116591o = d5;
        this.f116592p = d6;
        this.f116593q = bool;
        this.f116594r = str11;
        this.f116595s = str12;
        this.f116596t = str13;
        this.f116597u = str14;
        this.f116598v = str15;
        this.f116599w = str16;
        this.f116600x = str17;
        this.f116601y = str18;
        this.f116602z = str19;
        this.f116559A = str20;
        this.f116560B = str21;
        this.f116561C = str22;
        this.f116562D = str23;
        this.f116563E = str24;
        this.f116564F = str25;
        this.f116565G = str26;
        this.f116566H = str27;
        this.f116567I = str28;
        this.f116568J = bool2;
        this.f116569K = str29;
        this.f116570L = bool3;
        this.f116571M = num;
        this.f116572N = num2;
        this.f116573O = d7;
        this.f116574P = l;
        this.f116575Q = bool4;
        this.f116576R = str30;
    }

    public /* synthetic */ C51242wp0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Boolean bool, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool2, String str29, Boolean bool3, Integer num, Integer num2, Double d7, Long l, Boolean bool4, String str30, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : d, (i & 2048) != 0 ? null : d2, (i & 4096) != 0 ? null : d3, (i & 8192) != 0 ? null : d4, (i & 16384) != 0 ? null : d5, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : d6, (i & 65536) != 0 ? null : bool, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str11, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str12, (i & 524288) != 0 ? null : str13, (i & 1048576) != 0 ? null : str14, (i & 2097152) != 0 ? null : str15, (i & 4194304) != 0 ? null : str16, (i & 8388608) != 0 ? null : str17, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str18, (i & 33554432) != 0 ? null : str19, (i & 67108864) != 0 ? null : str20, (i & 134217728) != 0 ? null : str21, (i & 268435456) != 0 ? null : str22, (i & 536870912) != 0 ? null : str23, (i & 1073741824) != 0 ? null : str24, (i & Integer.MIN_VALUE) != 0 ? null : str25, (i2 & 1) != 0 ? null : str26, (i2 & 2) != 0 ? null : str27, (i2 & 4) != 0 ? null : str28, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : str29, (i2 & 32) != 0 ? null : bool3, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : d7, (i2 & 512) != 0 ? null : l, (i2 & 1024) != 0 ? null : bool4, (i2 & 2048) != 0 ? null : str30);
    }
}
