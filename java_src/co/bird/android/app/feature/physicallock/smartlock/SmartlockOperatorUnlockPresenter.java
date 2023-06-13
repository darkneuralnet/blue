package co.bird.android.app.feature.physicallock.smartlock;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter;
import co.bird.android.app.manager.SmartlockManagerImpl;
import co.bird.android.buava.Optional;
import co.bird.api.response.SmartlockKey;
import co.bird.api.response.SmartlockResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import p000.InterfaceC42042hI5;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0004*.Z2B)\b\u0007\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205¢\u0006\u0004\bX\u0010YJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\f\u0010\u0013\u001a\u00020\r*\u00020\tH\u0002J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\rH\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\f\u0010\u001e\u001a\u00020\u001d*\u00020\rH\u0002J\u000e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\rH\u0002J\f\u0010!\u001a\u00020\u001d*\u00020\rH\u0002J\f\u0010\"\u001a\u00020\u001d*\u00020\rH\u0002J\f\u0010#\u001a\u00020\u001d*\u00020\rH\u0002J\f\u0010$\u001a\u00020\u001d*\u00020\rH\u0002J\f\u0010%\u001a\u00020\u001d*\u00020\rH\u0002J\f\u0010&\u001a\u00020\u001d*\u00020\rH\u0002J\f\u0010'\u001a\u00020\r*\u00020\rH\u0002J\u0006\u0010(\u001a\u00020\u0002R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\t098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR.\u0010N\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 L*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010K0K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010MR:\u0010S\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Q L*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Q\u0018\u00010P0P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010RR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010V¨\u0006["}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;", "", "", "M", "v", "LTk5;", "scanResult", "LnI5;", TransferTable.COLUMN_STATE, "", "metadata", "P", "y", "", "payload", "aesKey", "Lio/reactivex/F;", "I", "K", "n", "Lco/bird/api/response/SmartlockResponse;", "Lco/bird/api/response/SmartlockKey;", "G", "k", "j", "l", "key", "o", "m", "", "t", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;", "O", "u", "q", "p", "r", "s", "N", "L", "H", "LMD;", C17296a.f69688o, "LMD;", "baseBluetoothManager", "LhI5;", "b", "LhI5;", "smartlockClient", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LrK5;", DateTokenConverter.CONVERTER_KEY, "LrK5;", "ui", "", "e", "Ljava/util/List;", "seenLockMacAddresses", "Lke5;", "f", "Lke5;", "smartlockConnection", "g", "[B", "sessionToken", "h", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;", "sessionTokenResponse", "i", "Lco/bird/api/response/SmartlockResponse;", "smartlockResponse", "LCG4;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "LCG4;", "bluetoothScanResults", "Lma4;", "Lkotlin/Pair;", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$a;", "Lma4;", "bluetoothRequestRelay", "", "LlI5;", "Ljava/util/Map;", "smartlockItems", "<init>", "(LMD;LhI5;Lcom/uber/autodispose/ScopeProvider;LrK5;)V", "NotConnected", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockOperatorUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockOperatorUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n180#2:411\n180#2:412\n237#2:413\n288#3,2:414\n*S KotlinDebug\n*F\n+ 1 SmartlockOperatorUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter\n*L\n91#1:411\n120#1:412\n286#1:413\n320#1:414,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SmartlockOperatorUnlockPresenter {

    /* renamed from: m */
    public static final C14135b f62176m = new C14135b(null);

    /* renamed from: n */
    public static final int f62177n = 8;

    /* renamed from: o */
    public static final byte[] f62178o = {6, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: p */
    public static final long f62179p = 750;

    /* renamed from: a */
    public final InterfaceC5225MD f62180a;

    /* renamed from: b */
    public final InterfaceC42042hI5 f62181b;

    /* renamed from: c */
    public final ScopeProvider f62182c;

    /* renamed from: d */
    public final C47990rK5 f62183d;

    /* renamed from: e */
    public final List<String> f62184e;

    /* renamed from: f */
    public InterfaceC44023ke5 f62185f;

    /* renamed from: g */
    public byte[] f62186g;

    /* renamed from: h */
    public C14136c f62187h;

    /* renamed from: i */
    public SmartlockResponse f62188i;

    /* renamed from: j */
    public final CG4<Optional<C36154Tk5>> f62189j;

    /* renamed from: k */
    public final C45168ma4<Pair<C36154Tk5, EnumC14134a>> f62190k;

    /* renamed from: l */
    public final Map<String, C44414lI5> f62191l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$NotConnected;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class NotConnected extends Exception {

        /* renamed from: b */
        public static final NotConnected f62192b = new NotConnected();

        private NotConnected() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$a */
    /* loaded from: classes2.dex */
    public enum EnumC14134a {
        TOKEN,
        UNLOCK,
        CONNECT
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$b;", "", "", "BLE_DISCONNECT_DELAY", "J", "BLUETOOTH_REQUEST_TIMEOUT_SECONDS", "", "TOKEN_REQUEST", "[B", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$b */
    /* loaded from: classes2.dex */
    public static final class C14135b {
        public /* synthetic */ C14135b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14135b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b¨\u0006$"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$c;", "", "", "toString", "", C17296a.f69688o, "[B", "getRaw", "()[B", "raw", "", "b", "B", "getLength", "()B", "length", "c", "getSessionToken", "sessionToken", DateTokenConverter.CONVERTER_KEY, "getChipType", "chipType", "e", "getVersion", "version", "f", "getProductNumber", "productNumber", "g", "getLockState", "lockState", "h", "getTotalLockCount", "totalLockCount", "<init>", "([B)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$c */
    /* loaded from: classes2.dex */
    public static final class C14136c {

        /* renamed from: a */
        public final byte[] f62197a;

        /* renamed from: b */
        public final byte f62198b;

        /* renamed from: c */
        public final byte[] f62199c;

        /* renamed from: d */
        public final byte f62200d;

        /* renamed from: e */
        public final byte[] f62201e;

        /* renamed from: f */
        public final byte[] f62202f;

        /* renamed from: g */
        public final byte f62203g;

        /* renamed from: h */
        public final byte[] f62204h;

        public C14136c(byte[] raw) {
            byte[] sliceArray;
            byte[] sliceArray2;
            byte[] sliceArray3;
            byte[] sliceArray4;
            Intrinsics.checkNotNullParameter(raw, "raw");
            this.f62197a = raw;
            this.f62198b = raw[2];
            sliceArray = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(3, 6));
            this.f62199c = sliceArray;
            this.f62200d = raw[7];
            sliceArray2 = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(8, 9));
            this.f62201e = sliceArray2;
            sliceArray3 = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(10, 11));
            this.f62202f = sliceArray3;
            this.f62203g = raw[12];
            sliceArray4 = ArraysKt___ArraysKt.sliceArray(raw, new IntRange(13, 14));
            this.f62204h = sliceArray4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String arrays = Arrays.toString(this.f62197a);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            sb.append("raw response: " + arrays);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            byte b = this.f62198b;
            sb.append("length: " + ((int) b));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays2 = Arrays.toString(this.f62199c);
            Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
            sb.append("session token: " + arrays2);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            byte b2 = this.f62200d;
            sb.append("chip type: " + ((int) b2));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays3 = Arrays.toString(this.f62201e);
            Intrinsics.checkNotNullExpressionValue(arrays3, "toString(this)");
            sb.append("version: " + arrays3);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays4 = Arrays.toString(this.f62202f);
            Intrinsics.checkNotNullExpressionValue(arrays4, "toString(this)");
            sb.append("product number: " + arrays4);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            byte b3 = this.f62203g;
            sb.append("lock state: " + ((int) b3));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            String arrays5 = Arrays.toString(this.f62204h);
            Intrinsics.checkNotNullExpressionValue(arrays5, "toString(this)");
            sb.append("total unlocks: " + arrays5);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
            return sb2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$a;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$d */
    /* loaded from: classes2.dex */
    public static final class C14137d extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends EnumC14134a>, InterfaceC24574u<? extends Long>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$d$a */
        /* loaded from: classes2.dex */
        public static final class C14138a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EnumC14134a f62206g;

            /* renamed from: h */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62207h;

            /* renamed from: i */
            public final /* synthetic */ C36154Tk5 f62208i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14138a(EnumC14134a enumC14134a, SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter, C36154Tk5 c36154Tk5) {
                super(1);
                this.f62206g = enumC14134a;
                this.f62207h = smartlockOperatorUnlockPresenter;
                this.f62208i = c36154Tk5;
            }

            /* renamed from: a */
            public final void m59767a(Long l) {
                EnumC45600nI5 enumC45600nI5;
                if (this.f62206g == EnumC14134a.CONNECT && this.f62207h.f62185f == null) {
                    C41318g46.m40163a("connect request timer expired, and no connect has been detected, showing connection error.", new Object[0]);
                    SmartlockOperatorUnlockPresenter.m59797Q(this.f62207h, this.f62208i, EnumC45600nI5.BLUETOOTH_COMMUNICATION_ERROR, null, 4, null);
                } else if (this.f62206g == EnumC14134a.TOKEN && this.f62207h.f62187h == null) {
                    C41318g46.m40163a("token request timer expired, and no token has been parsed, showing connection error.", new Object[0]);
                    SmartlockOperatorUnlockPresenter.m59797Q(this.f62207h, this.f62208i, EnumC45600nI5.BLUETOOTH_COMMUNICATION_ERROR, null, 4, null);
                } else {
                    if (this.f62206g == EnumC14134a.UNLOCK) {
                        C44414lI5 c44414lI5 = (C44414lI5) this.f62207h.f62191l.get(C36388Uk5.m80910o(this.f62208i));
                        if (c44414lI5 != null) {
                            enumC45600nI5 = c44414lI5.m27435d();
                        } else {
                            enumC45600nI5 = null;
                        }
                        if (enumC45600nI5 != EnumC45600nI5.BLUETOOTH_SUCCESS) {
                            C41318g46.m40163a("unlock request timer expired, and no success has been parsed, showing connection error.", new Object[0]);
                            SmartlockOperatorUnlockPresenter.m59797Q(this.f62207h, this.f62208i, EnumC45600nI5.BLUETOOTH_COMMUNICATION_ERROR, null, 4, null);
                            return;
                        }
                    }
                    C41318g46.m40163a("bluetooth request timer expired, a valid response was found, not erroring out now.", new Object[0]);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m59767a(l);
                return Unit.INSTANCE;
            }
        }

        public C14137d() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Long> invoke(Pair<? extends C36154Tk5, ? extends EnumC14134a> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            EnumC14134a component2 = pair.component2();
            C41318g46.m40163a("Starting timer to check back for bluetooth request status...", new Object[0]);
            AbstractC24507p<Long> m32066I = AbstractC24507p.m32049a0(8L, TimeUnit.SECONDS).m32066I(C23454a.m33087a());
            final C14138a c14138a = new C14138a(component2, SmartlockOperatorUnlockPresenter.this, pair.component1());
            return m32066I.m32026s(new InterfaceC23484g() { // from class: UJ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockOperatorUnlockPresenter.C14137d.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$e */
    /* loaded from: classes2.dex */
    public static final class C14139e extends Lambda implements Function1<Long, Unit> {

        /* renamed from: g */
        public static final C14139e f62209g = new C14139e();

        public C14139e() {
            super(1);
        }

        /* renamed from: a */
        public final void m59766a(Long l) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m59766a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LTk5;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$f */
    /* loaded from: classes2.dex */
    public static final class C14140f extends Lambda implements Function2<Optional<C36154Tk5>, Optional<C36154Tk5>, Boolean> {

        /* renamed from: g */
        public static final C14140f f62210g = new C14140f();

        public C14140f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<C36154Tk5> t1, Optional<C36154Tk5> t2) {
            String str;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            C36154Tk5 m59035e = t1.m59035e();
            String str2 = null;
            if (m59035e != null) {
                str = C36388Uk5.m80910o(m59035e);
            } else {
                str = null;
            }
            C36154Tk5 m59035e2 = t2.m59035e();
            if (m59035e2 != null) {
                str2 = C36388Uk5.m80910o(m59035e2);
            }
            return Boolean.valueOf(Intrinsics.areEqual(str, str2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LTk5;", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)LTk5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockOperatorUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockOperatorUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$listenForSmartlocksViaBluetooth$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1#2:411\n*E\n"})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$g */
    /* loaded from: classes2.dex */
    public static final class C14141g extends Lambda implements Function1<Optional<C36154Tk5>, C36154Tk5> {
        public C14141g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C36154Tk5 invoke(Optional<C36154Tk5> optional) {
            C36154Tk5 m59035e = optional.m59035e();
            if (m59035e == null || !(!SmartlockOperatorUnlockPresenter.this.f62184e.contains(m59035e.m83016a().mo17280e()))) {
                return null;
            }
            return m59035e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "scanResult", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$h */
    /* loaded from: classes2.dex */
    public static final class C14142h extends Lambda implements Function1<C36154Tk5, Unit> {
        public C14142h() {
            super(1);
        }

        /* renamed from: a */
        public final void m59763a(C36154Tk5 scanResult) {
            SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter = SmartlockOperatorUnlockPresenter.this;
            Intrinsics.checkNotNullExpressionValue(scanResult, "scanResult");
            smartlockOperatorUnlockPresenter.m59798P(scanResult, EnumC45600nI5.UNLOCKING, null);
            SmartlockOperatorUnlockPresenter.this.f62185f = null;
            SmartlockOperatorUnlockPresenter.this.f62188i = null;
            SmartlockOperatorUnlockPresenter.this.f62186g = new byte[0];
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m59763a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$i */
    /* loaded from: classes2.dex */
    public static final class C14143i extends Lambda implements Function1<C36154Tk5, Unit> {
        public C14143i() {
            super(1);
        }

        /* renamed from: a */
        public final void m59762a(C36154Tk5 c36154Tk5) {
            List list = SmartlockOperatorUnlockPresenter.this.f62184e;
            String mo17280e = c36154Tk5.m83016a().mo17280e();
            Intrinsics.checkNotNullExpressionValue(mo17280e, "it.bleDevice.macAddress");
            list.add(mo17280e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m59762a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "e", "(LTk5;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$j */
    /* loaded from: classes2.dex */
    public static final class C14144j extends Lambda implements Function1<C36154Tk5, InterfaceC24574u<? extends C36154Tk5>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$j$a */
        /* loaded from: classes2.dex */
        public static final class C14145a extends Lambda implements Function1<SmartlockResponse, InterfaceC23447K<? extends SmartlockResponse>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62215g;

            /* renamed from: h */
            public final /* synthetic */ C36154Tk5 f62216h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14145a(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter, C36154Tk5 c36154Tk5) {
                super(1);
                this.f62215g = smartlockOperatorUnlockPresenter;
                this.f62216h = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends SmartlockResponse> invoke(SmartlockResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                C41318g46.m40163a("handling response " + response, new Object[0]);
                if (this.f62215g.m59807G(response) == null) {
                    SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter = this.f62215g;
                    C36154Tk5 scanResult = this.f62216h;
                    Intrinsics.checkNotNullExpressionValue(scanResult, "scanResult");
                    SmartlockOperatorUnlockPresenter.m59797Q(smartlockOperatorUnlockPresenter, scanResult, EnumC45600nI5.SMARTLOCK_NOT_FOUND, null, 4, null);
                    C41318g46.m40160d("Missing non provisional key from call to smartlock/by-identifier, no way to proceed. (" + response + ")", new Object[0]);
                    this.f62215g.f62183d.error(C45871nl4.smartlock_response_missing_expected_key_error);
                    return AbstractC23442F.m33100x(new Exception("Response did not have a non-provisional key supplied as expected (" + response + ")"));
                } else if (response.getNeedsRekey()) {
                    SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter2 = this.f62215g;
                    C36154Tk5 scanResult2 = this.f62216h;
                    Intrinsics.checkNotNullExpressionValue(scanResult2, "scanResult");
                    SmartlockOperatorUnlockPresenter.m59797Q(smartlockOperatorUnlockPresenter2, scanResult2, EnumC45600nI5.REKEY_NEEDED, null, 4, null);
                    C41318g46.m40160d("Can't unlock, rekey needed", new Object[0]);
                    this.f62215g.f62183d.error(C45871nl4.smartlock_response_missing_expected_keys_error);
                    return AbstractC23442F.m33100x(new Exception("Response indicated that we needed to rekey"));
                } else {
                    return AbstractC23442F.m33158H(response);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$j$b */
        /* loaded from: classes2.dex */
        public static final class C14146b extends Lambda implements Function1<SmartlockResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62217g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14146b(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                super(1);
                this.f62217g = smartlockOperatorUnlockPresenter;
            }

            /* renamed from: a */
            public final void m59752a(SmartlockResponse smartlockResponse) {
                this.f62217g.f62188i = smartlockResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SmartlockResponse smartlockResponse) {
                m59752a(smartlockResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$j$c */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C14147c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C14147c f62218b = new C14147c();

            public C14147c() {
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

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "it", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/SmartlockResponse;)LTk5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$j$d */
        /* loaded from: classes2.dex */
        public static final class C14148d extends Lambda implements Function1<SmartlockResponse, C36154Tk5> {

            /* renamed from: g */
            public final /* synthetic */ C36154Tk5 f62219g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14148d(C36154Tk5 c36154Tk5) {
                super(1);
                this.f62219g = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36154Tk5 invoke(SmartlockResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f62219g;
            }
        }

        public C14144j() {
            super(1);
        }

        /* renamed from: f */
        public static final void m59756f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m59755g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final C36154Tk5 m59754h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C36154Tk5) tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC24574u<? extends C36154Tk5> invoke(C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            String mo17280e = scanResult.m83016a().mo17280e();
            C41318g46.m40163a("calling smartlock/by-identifier on mac address " + mo17280e, new Object[0]);
            InterfaceC42042hI5 interfaceC42042hI5 = SmartlockOperatorUnlockPresenter.this.f62181b;
            String mo17280e2 = scanResult.m83016a().mo17280e();
            Intrinsics.checkNotNullExpressionValue(mo17280e2, "scanResult.bleDevice.macAddress");
            AbstractC23442F m33152N = InterfaceC42042hI5.C22610a.getLockByIdentifier$default(interfaceC42042hI5, mo17280e2, null, null, 6, null).m33152N(C23454a.m33087a());
            final C14145a c14145a = new C14145a(SmartlockOperatorUnlockPresenter.this, scanResult);
            AbstractC23442F m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: VJ5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = SmartlockOperatorUnlockPresenter.C14144j.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C14146b c14146b = new C14146b(SmartlockOperatorUnlockPresenter.this);
            AbstractC24507p m33125j0 = m33165A.m33101w(new InterfaceC23484g() { // from class: WJ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockOperatorUnlockPresenter.C14144j.m59756f(Function1.this, obj);
                }
            }).m33125j0();
            final C14147c c14147c = C14147c.f62218b;
            AbstractC24507p m32065J = m33125j0.m32029p(new InterfaceC23484g() { // from class: XJ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockOperatorUnlockPresenter.C14144j.m59755g(Function1.this, obj);
                }
            }).m32065J();
            final C14148d c14148d = new C14148d(scanResult);
            return m32065J.m32067H(new InterfaceC23492o() { // from class: YJ5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C36154Tk5 m59754h;
                    m59754h = SmartlockOperatorUnlockPresenter.C14144j.m59754h(Function1.this, obj);
                    return m59754h;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$l */
    /* loaded from: classes2.dex */
    public static final class C14167l extends Lambda implements Function1<Throwable, Unit> {
        public C14167l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C41318g46.m40158f(it, "error in lock connection", new Object[0]);
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (S36.m86051a(it)) {
                return;
            }
            C47990rK5 c47990rK5 = SmartlockOperatorUnlockPresenter.this.f62183d;
            String message = it.getMessage();
            c47990rK5.error("Something went wrong: " + message);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "(LTk5;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$m */
    /* loaded from: classes2.dex */
    public static final class C14168m extends Lambda implements Function1<C36154Tk5, Optional<C36154Tk5>> {

        /* renamed from: g */
        public static final C14168m f62242g = new C14168m();

        public C14168m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<C36154Tk5> invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C12325bE.m64814b(it)) {
                return Optional.f63040c.m59032c(it);
            }
            return null;
        }
    }

    public SmartlockOperatorUnlockPresenter(InterfaceC5225MD baseBluetoothManager, InterfaceC42042hI5 smartlockClient, ScopeProvider scopeProvider, C47990rK5 ui) {
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(smartlockClient, "smartlockClient");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f62180a = baseBluetoothManager;
        this.f62181b = smartlockClient;
        this.f62182c = scopeProvider;
        this.f62183d = ui;
        this.f62184e = new ArrayList();
        CG4<Optional<C36154Tk5>> m112490g = CG4.m112490g();
        Intrinsics.checkNotNullExpressionValue(m112490g, "create<Optional<ScanResult>>()");
        this.f62189j = m112490g;
        C45168ma4<Pair<C36154Tk5, EnumC14134a>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Pair<ScanResult, BluetoothRequestType>>()");
        this.f62190k = m25409g;
        this.f62191l = new LinkedHashMap();
    }

    /* renamed from: A */
    public static final void m59813A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m59812B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC24574u m59811C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23496h m59810D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m59809E() {
        C41318g46.m40163a("unlocked smartlock!", new Object[0]);
    }

    /* renamed from: F */
    public static final void m59808F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static /* synthetic */ AbstractC23442F m59804J(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr2 = smartlockOperatorUnlockPresenter.m59787j();
        }
        return smartlockOperatorUnlockPresenter.m59805I(bArr, bArr2);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m59797Q(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter, C36154Tk5 c36154Tk5, EnumC45600nI5 enumC45600nI5, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        smartlockOperatorUnlockPresenter.m59798P(c36154Tk5, enumC45600nI5, str);
    }

    /* renamed from: w */
    public static final InterfaceC24574u m59774w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m59773x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final boolean m59771z(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: G */
    public final SmartlockKey m59807G(SmartlockResponse smartlockResponse) {
        Object obj;
        Iterator<T> it = smartlockResponse.getKeysList().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((SmartlockKey) obj).getProvisional()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (SmartlockKey) obj;
    }

    /* renamed from: H */
    public final void m59806H() {
        List<C44414lI5> emptyList;
        C47990rK5 c47990rK5 = this.f62183d;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        c47990rK5.m16050Pl(emptyList);
        m59801M();
        m59772y();
        m59775v();
    }

    /* renamed from: I */
    public final AbstractC23442F<byte[]> m59805I(byte[] bArr, byte[] bArr2) {
        AbstractC23442F<byte[]> abstractC23442F;
        String arrays = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        C41318g46.m40163a("sending payload to lock " + arrays, new Object[0]);
        byte[] m59782o = m59782o(bArr, bArr2);
        InterfaceC44023ke5 interfaceC44023ke5 = this.f62185f;
        if (interfaceC44023ke5 != null) {
            abstractC23442F = interfaceC44023ke5.mo27056c(SmartlockManagerImpl.EnumC14385i.f62936c.m59190b(), m59782o);
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F<byte[]> m33100x = AbstractC23442F.m33100x(NotConnected.f62192b);
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotConnected)");
            return m33100x;
        }
        return abstractC23442F;
    }

    /* renamed from: K */
    public final AbstractC23442F<byte[]> m59803K() {
        byte[] bArr = new byte[3];
        new Random().nextBytes(bArr);
        ByteBuffer put = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN).put(new byte[]{5, 1, 6}).put(m59785l());
        byte[] bArr2 = this.f62186g;
        if (bArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionToken");
            bArr2 = null;
        }
        byte[] payload = put.put(bArr2).put(bArr).array();
        Intrinsics.checkNotNullExpressionValue(payload, "payload");
        return m59804J(this, payload, null, 2, null);
    }

    /* renamed from: L */
    public final byte[] m59802L(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(3, 6));
        return sliceArray;
    }

    /* renamed from: M */
    public final void m59801M() {
        Object m33094as = C37279Yf5.m74575T(InterfaceC5225MD.C5226a.scanBleDevices$default(this.f62180a, 2, false, null, 4, null), C14168m.f62242g).m33094as(AutoDispose.m45239a(this.f62182c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f62189j);
    }

    /* renamed from: N */
    public final boolean m59800N(byte[] bArr) {
        return Intrinsics.compare((int) bArr[3], 0) == 0;
    }

    /* renamed from: O */
    public final C14136c m59799O(byte[] bArr) {
        if (m59777t(bArr)) {
            return new C14136c(bArr);
        }
        return null;
    }

    /* renamed from: P */
    public final void m59798P(C36154Tk5 c36154Tk5, EnumC45600nI5 enumC45600nI5, String str) {
        List<C44414lI5> list;
        String m27437b;
        Map<String, C44414lI5> map = this.f62191l;
        String m80910o = C36388Uk5.m80910o(c36154Tk5);
        C44414lI5 c44414lI5 = this.f62191l.get(C36388Uk5.m80910o(c36154Tk5));
        if (c44414lI5 != null && (m27437b = c44414lI5.m27437b()) != null) {
            str = m27437b;
        }
        map.put(m80910o, new C44414lI5(c36154Tk5, enumC45600nI5, str));
        C47990rK5 c47990rK5 = this.f62183d;
        list = CollectionsKt___CollectionsKt.toList(this.f62191l.values());
        c47990rK5.m16050Pl(list);
    }

    /* renamed from: j */
    public final byte[] m59787j() {
        String key;
        byte[] m59783n;
        SmartlockKey m59786k = m59786k();
        return (m59786k == null || (key = m59786k.getKey()) == null || (m59783n = m59783n(key)) == null) ? new byte[0] : m59783n;
    }

    /* renamed from: k */
    public final SmartlockKey m59786k() {
        SmartlockResponse smartlockResponse = this.f62188i;
        if (smartlockResponse != null) {
            return m59807G(smartlockResponse);
        }
        return null;
    }

    /* renamed from: l */
    public final byte[] m59785l() {
        String password;
        SmartlockKey m59786k = m59786k();
        if (m59786k != null && (password = m59786k.getPassword()) != null) {
            byte[] bytes = password.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes != null) {
                return bytes;
            }
        }
        return new byte[0];
    }

    /* renamed from: m */
    public final byte[] m59784m(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(2, secretKeySpec);
        byte[] doFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(payload)");
        return doFinal;
    }

    /* renamed from: n */
    public final byte[] m59783n(String str) {
        byte[] m108180a = C2029Ey.m108182a().m108180a(str);
        Intrinsics.checkNotNullExpressionValue(m108180a, "getDecoder().decode(this)");
        return m108180a;
    }

    /* renamed from: o */
    public final byte[] m59782o(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] doFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(payload)");
        return doFinal;
    }

    /* renamed from: p */
    public final boolean m59781p(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 8, 1});
    }

    /* renamed from: q */
    public final boolean m59780q(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 13, 1});
    }

    /* renamed from: r */
    public final boolean m59779r(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 15, 1});
    }

    /* renamed from: s */
    public final boolean m59778s(byte[] bArr) {
        return Intrinsics.compare((int) bArr[3], 1) == 0;
    }

    /* renamed from: t */
    public final boolean m59777t(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 1));
        return Arrays.equals(sliceArray, new byte[]{6, 2});
    }

    /* renamed from: u */
    public final boolean m59776u(byte[] bArr) {
        byte[] sliceArray;
        sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 2));
        return Arrays.equals(sliceArray, new byte[]{5, 2, 1});
    }

    /* renamed from: v */
    public final void m59775v() {
        C45168ma4<Pair<C36154Tk5, EnumC14134a>> c45168ma4 = this.f62190k;
        final C14137d c14137d = new C14137d();
        Observable<R> switchMapMaybe = c45168ma4.switchMapMaybe(new InterfaceC23492o() { // from class: LJ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m59774w;
                m59774w = SmartlockOperatorUnlockPresenter.m59774w(Function1.this, obj);
                return m59774w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapMaybe, "private fun listenForBlu…)\n      .subscribe {}\n  }");
        Object m33094as = switchMapMaybe.m33094as(AutoDispose.m45239a(this.f62182c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14139e c14139e = C14139e.f62209g;
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: MJ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockOperatorUnlockPresenter.m59773x(Function1.this, obj);
            }
        });
    }

    /* renamed from: y */
    public final void m59772y() {
        CG4<Optional<C36154Tk5>> cg4 = this.f62189j;
        final C14140f c14140f = C14140f.f62210g;
        Observable<Optional<C36154Tk5>> distinctUntilChanged = cg4.distinctUntilChanged(new InterfaceC23481d() { // from class: NJ5
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m59771z;
                m59771z = SmartlockOperatorUnlockPresenter.m59771z(Function2.this, obj, obj2);
                return m59771z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "bluetoothScanResults\n   …Null()?.getMacAddress() }");
        AbstractC24490k m32108t0 = C37279Yf5.m74575T(distinctUntilChanged, new C14141g()).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        final C14142h c14142h = new C14142h();
        AbstractC24490k m32108t02 = m32108t0.m32191K(new InterfaceC23484g() { // from class: OJ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockOperatorUnlockPresenter.m59813A(Function1.this, obj);
            }
        }).m32108t0(C24542a.m31932c(), false, 1);
        final C14143i c14143i = new C14143i();
        AbstractC24490k m32191K = m32108t02.m32191K(new InterfaceC23484g() { // from class: PJ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockOperatorUnlockPresenter.m59812B(Function1.this, obj);
            }
        });
        final C14144j c14144j = new C14144j();
        AbstractC24490k m32108t03 = m32191K.m32154d0(new InterfaceC23492o() { // from class: QJ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m59811C;
                m59811C = SmartlockOperatorUnlockPresenter.m59811C(Function1.this, obj);
                return m59811C;
            }
        }).m32108t0(C24542a.m31932c(), false, 1);
        final C14149k c14149k = new C14149k();
        AbstractC23461c m33070P = m32108t03.m32160a0(new InterfaceC23492o() { // from class: RJ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m59810D;
                m59810D = SmartlockOperatorUnlockPresenter.m59810D(Function1.this, obj);
                return m59810D;
            }
        }, false, 1).m33063X(C24542a.m31932c()).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "private fun listenForSma…\")\n        }\n      })\n  }");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f62182c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: SJ5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                SmartlockOperatorUnlockPresenter.m59809E();
            }
        };
        final C14167l c14167l = new C14167l();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: TJ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockOperatorUnlockPresenter.m59808F(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "j", "(LTk5;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k */
    /* loaded from: classes2.dex */
    public static final class C14149k extends Lambda implements Function1<C36154Tk5, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$a */
        /* loaded from: classes2.dex */
        public static final class C14150a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62221g;

            /* renamed from: h */
            public final /* synthetic */ C36154Tk5 f62222h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14150a(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter, C36154Tk5 c36154Tk5) {
                super(1);
                this.f62221g = smartlockOperatorUnlockPresenter;
                this.f62222h = c36154Tk5;
            }

            /* renamed from: a */
            public final void m59733a(InterfaceC23465c interfaceC23465c) {
                this.f62221g.f62190k.accept(TuplesKt.m28425to(this.f62222h, EnumC14134a.CONNECT));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m59733a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "kotlin.jvm.PlatformType", "connection", "", "invoke", "(Lke5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$b */
        /* loaded from: classes2.dex */
        public static final class C14151b extends Lambda implements Function1<InterfaceC44023ke5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62223g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14151b(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                super(1);
                this.f62223g = smartlockOperatorUnlockPresenter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC44023ke5 interfaceC44023ke5) {
                invoke2(interfaceC44023ke5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC44023ke5 interfaceC44023ke5) {
                this.f62223g.f62185f = interfaceC44023ke5;
                C41318g46.m40163a("lock connected", new Object[0]);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lke5;", "it", "Lkotlin/Pair;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$c */
        /* loaded from: classes2.dex */
        public static final class C14152c extends Lambda implements Function1<InterfaceC44023ke5, Pair<? extends C36154Tk5, ? extends InterfaceC44023ke5>> {

            /* renamed from: g */
            public final /* synthetic */ C36154Tk5 f62224g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14152c(C36154Tk5 c36154Tk5) {
                super(1);
                this.f62224g = c36154Tk5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<C36154Tk5, InterfaceC44023ke5> invoke(InterfaceC44023ke5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f62224g, it);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "Lke5;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d */
        /* loaded from: classes2.dex */
        public static final class C14153d extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends InterfaceC44023ke5>, InterfaceC23434B<? extends Pair<? extends C36154Tk5, ? extends byte[]>>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62225g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lue5;", "it", "Lke5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lue5;)Lke5;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$a */
            /* loaded from: classes2.dex */
            public static final class C14154a extends Lambda implements Function1<C49952ue5, InterfaceC44023ke5> {

                /* renamed from: g */
                public final /* synthetic */ InterfaceC44023ke5 f62226g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14154a(InterfaceC44023ke5 interfaceC44023ke5) {
                    super(1);
                    this.f62226g = interfaceC44023ke5;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC44023ke5 invoke(C49952ue5 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f62226g;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lke5;", "it", "Lkotlin/Pair;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$b */
            /* loaded from: classes2.dex */
            public static final class C14155b extends Lambda implements Function1<InterfaceC44023ke5, Pair<? extends C36154Tk5, ? extends InterfaceC44023ke5>> {

                /* renamed from: g */
                public final /* synthetic */ C36154Tk5 f62227g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14155b(C36154Tk5 c36154Tk5) {
                    super(1);
                    this.f62227g = c36154Tk5;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<C36154Tk5, InterfaceC44023ke5> invoke(InterfaceC44023ke5 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return TuplesKt.m28425to(this.f62227g, it);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "Lke5;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$c */
            /* loaded from: classes2.dex */
            public static final class C14156c extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends InterfaceC44023ke5>, InterfaceC23434B<? extends Pair<? extends C36154Tk5, ? extends byte[]>>> {

                /* renamed from: g */
                public final /* synthetic */ SmartlockOperatorUnlockPresenter f62228g;

                @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000 \u0002*\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "LTk5;", C17296a.f69688o, "(Lio/reactivex/Observable;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$c$a */
                /* loaded from: classes2.dex */
                public static final class C14157a extends Lambda implements Function1<Observable<byte[]>, Pair<? extends C36154Tk5, ? extends Observable<byte[]>>> {

                    /* renamed from: g */
                    public final /* synthetic */ C36154Tk5 f62229g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C14157a(C36154Tk5 c36154Tk5) {
                        super(1);
                        this.f62229g = c36154Tk5;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final Pair<C36154Tk5, Observable<byte[]>> invoke(Observable<byte[]> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return TuplesKt.m28425to(this.f62229g, it);
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000 \u0004*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$c$b */
                /* loaded from: classes2.dex */
                public static final class C14158b extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends Observable<byte[]>>, InterfaceC23434B<? extends Pair<? extends C36154Tk5, ? extends byte[]>>> {

                    /* renamed from: g */
                    public final /* synthetic */ SmartlockOperatorUnlockPresenter f62230g;

                    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$c$b$a */
                    /* loaded from: classes2.dex */
                    public static final class C14159a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                        /* renamed from: g */
                        public final /* synthetic */ SmartlockOperatorUnlockPresenter f62231g;

                        /* renamed from: h */
                        public final /* synthetic */ C36154Tk5 f62232h;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C14159a(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter, C36154Tk5 c36154Tk5) {
                            super(1);
                            this.f62231g = smartlockOperatorUnlockPresenter;
                            this.f62232h = c36154Tk5;
                        }

                        /* renamed from: a */
                        public final void m59715a(InterfaceC23465c interfaceC23465c) {
                            this.f62231g.f62190k.accept(TuplesKt.m28425to(this.f62232h, EnumC14134a.TOKEN));
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                            m59715a(interfaceC23465c);
                            return Unit.INSTANCE;
                        }
                    }

                    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000 \u0002*,\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000\u0018\u00010\u00000\u00002\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "it", "LTk5;", "invoke", "(Lkotlin/Pair;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$c$b$b */
                    /* loaded from: classes2.dex */
                    public static final class C14160b extends Lambda implements Function1<Pair<? extends byte[], ? extends byte[]>, Pair<? extends C36154Tk5, ? extends Pair<? extends byte[], ? extends byte[]>>> {

                        /* renamed from: g */
                        public final /* synthetic */ C36154Tk5 f62233g;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C14160b(C36154Tk5 c36154Tk5) {
                            super(1);
                            this.f62233g = c36154Tk5;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Pair<? extends C36154Tk5, ? extends Pair<? extends byte[], ? extends byte[]>> invoke(Pair<? extends byte[], ? extends byte[]> pair) {
                            return invoke2((Pair<byte[], byte[]>) pair);
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final Pair<C36154Tk5, Pair<byte[], byte[]>> invoke2(Pair<byte[], byte[]> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return TuplesKt.m28425to(this.f62233g, it);
                        }
                    }

                    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002.\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0001\u0012 \u0012\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$d$c$b$c */
                    /* loaded from: classes2.dex */
                    public static final class C14161c extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends Pair<? extends byte[], ? extends byte[]>>, Pair<? extends C36154Tk5, ? extends byte[]>> {

                        /* renamed from: g */
                        public final /* synthetic */ SmartlockOperatorUnlockPresenter f62234g;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C14161c(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                            super(1);
                            this.f62234g = smartlockOperatorUnlockPresenter;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Pair<? extends C36154Tk5, ? extends byte[]> invoke(Pair<? extends C36154Tk5, ? extends Pair<? extends byte[], ? extends byte[]>> pair) {
                            return invoke2((Pair<? extends C36154Tk5, Pair<byte[], byte[]>>) pair);
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final Pair<C36154Tk5, byte[]> invoke2(Pair<? extends C36154Tk5, Pair<byte[], byte[]>> pair) {
                            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                            byte[] it = pair.component2().getSecond();
                            SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter = this.f62234g;
                            Intrinsics.checkNotNullExpressionValue(it, "it");
                            byte[] m59784m = smartlockOperatorUnlockPresenter.m59784m(it, this.f62234g.m59787j());
                            String arrays = Arrays.toString(m59784m);
                            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
                            C41318g46.m40163a("response decrypt using non-provisional aes key: " + arrays, new Object[0]);
                            return TuplesKt.m28425to(pair.component1(), m59784m);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C14158b(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                        super(1);
                        this.f62230g = smartlockOperatorUnlockPresenter;
                    }

                    /* renamed from: d */
                    public static final Pair m59716d(Function1 tmp0, Object obj) {
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        return (Pair) tmp0.invoke(obj);
                    }

                    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        tmp0.invoke(obj);
                    }

                    public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        return (Pair) tmp0.invoke(obj);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final InterfaceC23434B<? extends Pair<C36154Tk5, byte[]>> invoke(Pair<? extends C36154Tk5, ? extends Observable<byte[]>> pair) {
                        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                        C36154Tk5 component1 = pair.component1();
                        Observable<byte[]> notificationObservable = pair.component2();
                        C41318g46.m40163a("notifications set up", new Object[0]);
                        C24523e c24523e = C24523e.f91168a;
                        Observable m33123k0 = SmartlockOperatorUnlockPresenter.m59804J(this.f62230g, SmartlockOperatorUnlockPresenter.f62178o, null, 2, null).m33123k0();
                        final C14159a c14159a = new C14159a(this.f62230g, component1);
                        Observable doOnSubscribe = m33123k0.doOnSubscribe(new InterfaceC23484g() { // from class: nK5
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                SmartlockOperatorUnlockPresenter.C14149k.C14153d.C14156c.C14158b.invoke$lambda$0(Function1.this, obj);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun listenForSma…\")\n        }\n      })\n  }");
                        Intrinsics.checkNotNullExpressionValue(notificationObservable, "notificationObservable");
                        Observable m31956a = c24523e.m31956a(doOnSubscribe, notificationObservable);
                        final C14160b c14160b = new C14160b(component1);
                        Observable map = m31956a.map(new InterfaceC23492o() { // from class: oK5
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                Pair m59716d;
                                m59716d = SmartlockOperatorUnlockPresenter.C14149k.C14153d.C14156c.C14158b.m59716d(Function1.this, obj);
                                return m59716d;
                            }
                        });
                        final C14161c c14161c = new C14161c(this.f62230g);
                        return map.map(new InterfaceC23492o() { // from class: pK5
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                Pair invoke$lambda$2;
                                invoke$lambda$2 = SmartlockOperatorUnlockPresenter.C14149k.C14153d.C14156c.C14158b.invoke$lambda$2(Function1.this, obj);
                                return invoke$lambda$2;
                            }
                        });
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14156c(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                    super(1);
                    this.f62228g = smartlockOperatorUnlockPresenter;
                }

                /* renamed from: c */
                public static final InterfaceC23434B m59721c(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (InterfaceC23434B) tmp0.invoke(obj);
                }

                public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (Pair) tmp0.invoke(obj);
                }

                @Override // kotlin.jvm.functions.Function1
                public final InterfaceC23434B<? extends Pair<C36154Tk5, byte[]>> invoke(Pair<? extends C36154Tk5, ? extends InterfaceC44023ke5> pair) {
                    Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                    C41318g46.m40163a("setting up notification...", new Object[0]);
                    Observable<Observable<byte[]>> delaySubscription = pair.component2().mo27057b(SmartlockManagerImpl.EnumC14385i.f62937d.m59190b(), EnumC41046fd3.DEFAULT).delaySubscription(500L, TimeUnit.MILLISECONDS);
                    final C14157a c14157a = new C14157a(pair.component1());
                    Observable<R> map = delaySubscription.map(new InterfaceC23492o() { // from class: lK5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair invoke$lambda$0;
                            invoke$lambda$0 = SmartlockOperatorUnlockPresenter.C14149k.C14153d.C14156c.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    });
                    final C14158b c14158b = new C14158b(this.f62228g);
                    return map.flatMap(new InterfaceC23492o() { // from class: mK5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23434B m59721c;
                            m59721c = SmartlockOperatorUnlockPresenter.C14149k.C14153d.C14156c.m59721c(Function1.this, obj);
                            return m59721c;
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14153d(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                super(1);
                this.f62225g = smartlockOperatorUnlockPresenter;
            }

            /* renamed from: d */
            public static final InterfaceC44023ke5 m59728d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC44023ke5) tmp0.invoke(obj);
            }

            /* renamed from: e */
            public static final Pair m59727e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            /* renamed from: f */
            public static final InterfaceC23434B m59726f(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23434B) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23434B<? extends Pair<C36154Tk5, byte[]>> invoke(Pair<? extends C36154Tk5, ? extends InterfaceC44023ke5> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                InterfaceC44023ke5 component2 = pair.component2();
                C41318g46.m40163a("discovering services...", new Object[0]);
                AbstractC23442F<C49952ue5> mo27058a = component2.mo27058a();
                final C14154a c14154a = new C14154a(component2);
                Observable m33123k0 = mo27058a.m33157I(new InterfaceC23492o() { // from class: iK5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC44023ke5 m59728d;
                        m59728d = SmartlockOperatorUnlockPresenter.C14149k.C14153d.m59728d(Function1.this, obj);
                        return m59728d;
                    }
                }).m33123k0();
                final C14155b c14155b = new C14155b(pair.component1());
                Observable map = m33123k0.map(new InterfaceC23492o() { // from class: jK5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m59727e;
                        m59727e = SmartlockOperatorUnlockPresenter.C14149k.C14153d.m59727e(Function1.this, obj);
                        return m59727e;
                    }
                });
                final C14156c c14156c = new C14156c(this.f62225g);
                return map.flatMap(new InterfaceC23492o() { // from class: kK5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m59726f;
                        m59726f = SmartlockOperatorUnlockPresenter.C14149k.C14153d.m59726f(Function1.this, obj);
                        return m59726f;
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$e */
        /* loaded from: classes2.dex */
        public static final class C14162e extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends byte[]>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62235g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14162e(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                super(1);
                this.f62235g = smartlockOperatorUnlockPresenter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C36154Tk5, ? extends byte[]> pair) {
                invoke2((Pair<? extends C36154Tk5, byte[]>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<? extends C36154Tk5, byte[]> pair) {
                C36154Tk5 scanResult = pair.component1();
                byte[] component2 = pair.component2();
                if (this.f62235g.m59777t(component2)) {
                    SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter = this.f62235g;
                    smartlockOperatorUnlockPresenter.f62187h = smartlockOperatorUnlockPresenter.m59799O(component2);
                    SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter2 = this.f62235g;
                    smartlockOperatorUnlockPresenter2.f62186g = smartlockOperatorUnlockPresenter2.m59802L(component2);
                } else if (this.f62235g.m59776u(component2) && this.f62235g.m59800N(component2)) {
                    C41318g46.m40163a("got successful unlock response, updating UI for scan result...", new Object[0]);
                    SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter3 = this.f62235g;
                    Intrinsics.checkNotNullExpressionValue(scanResult, "scanResult");
                    EnumC45600nI5 enumC45600nI5 = EnumC45600nI5.BLUETOOTH_SUCCESS;
                    C14136c c14136c = this.f62235g.f62187h;
                    smartlockOperatorUnlockPresenter3.m59798P(scanResult, enumC45600nI5, c14136c != null ? c14136c.toString() : null);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$g */
        /* loaded from: classes2.dex */
        public static final class C14164g extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends byte[]>, InterfaceC24574u<? extends byte[]>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62237g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$g$a */
            /* loaded from: classes2.dex */
            public static final class C14165a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ SmartlockOperatorUnlockPresenter f62238g;

                /* renamed from: h */
                public final /* synthetic */ C36154Tk5 f62239h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14165a(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter, C36154Tk5 c36154Tk5) {
                    super(1);
                    this.f62238g = smartlockOperatorUnlockPresenter;
                    this.f62239h = c36154Tk5;
                }

                /* renamed from: a */
                public final void m59712a(InterfaceC23465c interfaceC23465c) {
                    this.f62238g.f62190k.accept(TuplesKt.m28425to(this.f62239h, EnumC14134a.UNLOCK));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m59712a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14164g(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                super(1);
                this.f62237g = smartlockOperatorUnlockPresenter;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends byte[]> invoke(Pair<? extends C36154Tk5, byte[]> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                C36154Tk5 component1 = pair.component1();
                byte[] component2 = pair.component2();
                String arrays = Arrays.toString(component2);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
                C41318g46.m40163a("got a response " + arrays, new Object[0]);
                if (this.f62237g.m59777t(component2)) {
                    C41318g46.m40163a("got a session token", new Object[0]);
                    AbstractC24507p m33125j0 = this.f62237g.m59803K().m33125j0();
                    final C14165a c14165a = new C14165a(this.f62237g, component1);
                    return m33125j0.m32027r(new InterfaceC23484g() { // from class: qK5
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            SmartlockOperatorUnlockPresenter.C14149k.C14164g.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                } else if (this.f62237g.m59776u(component2)) {
                    boolean m59800N = this.f62237g.m59800N(component2);
                    C41318g46.m40163a("got an unlock response - successful: " + m59800N, new Object[0]);
                    return AbstractC24507p.m32024u();
                } else if (this.f62237g.m59780q(component2)) {
                    boolean m59800N2 = this.f62237g.m59800N(component2);
                    C41318g46.m40163a("got an lock response - successful: " + m59800N2, new Object[0]);
                    return AbstractC24507p.m32024u();
                } else if (this.f62237g.m59781p(component2)) {
                    boolean m59800N3 = this.f62237g.m59800N(component2);
                    C41318g46.m40163a("got a cable inserted response - successful: " + m59800N3, new Object[0]);
                    return AbstractC24507p.m32024u();
                } else if (this.f62237g.m59779r(component2) && !this.f62237g.m59778s(component2)) {
                    C41318g46.m40163a("got a lock state response but not locked", new Object[0]);
                    return AbstractC24507p.m32024u();
                } else if (this.f62237g.m59779r(component2) && this.f62237g.m59778s(component2)) {
                    C41318g46.m40163a("got a lock state response and is locked", new Object[0]);
                    return AbstractC24507p.m32024u();
                } else {
                    C41318g46.m40163a("received some other kind of response", new Object[0]);
                    return AbstractC24507p.m32024u();
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$h */
        /* loaded from: classes2.dex */
        public static final class C14166h extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62240g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14166h(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                super(1);
                this.f62240g = smartlockOperatorUnlockPresenter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                C41318g46.m40158f(it, "error in lock connection", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (S36.m86051a(it)) {
                    return;
                }
                C47990rK5 c47990rK5 = this.f62240g.f62183d;
                String message = it.getMessage();
                c47990rK5.error("Something went wrong: " + message);
            }
        }

        public C14149k() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final void m59740k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final InterfaceC23434B m59739l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: m */
        public static final void m59738m(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: n */
        public static final boolean m59737n(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: o */
        public static final InterfaceC24574u m59736o(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        /* renamed from: p */
        public static final void m59735p(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: q */
        public static final void m59734q() {
            C41318g46.m40163a("Completed ble operation, disposing current stream now", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: j */
        public final InterfaceC23496h invoke(C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            C41318g46.m40163a("attempting to connect to lock", new Object[0]);
            Observable<InterfaceC44023ke5> delaySubscription = scanResult.m83016a().mo17284a(false).delaySubscription(500L, TimeUnit.MILLISECONDS);
            final C14150a c14150a = new C14150a(SmartlockOperatorUnlockPresenter.this, scanResult);
            Observable<InterfaceC44023ke5> doOnSubscribe = delaySubscription.doOnSubscribe(new InterfaceC23484g() { // from class: ZJ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockOperatorUnlockPresenter.C14149k.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C14151b c14151b = new C14151b(SmartlockOperatorUnlockPresenter.this);
            Observable<InterfaceC44023ke5> doOnNext = doOnSubscribe.doOnNext(new InterfaceC23484g() { // from class: aK5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockOperatorUnlockPresenter.C14149k.m59740k(Function1.this, obj);
                }
            });
            final C14152c c14152c = new C14152c(scanResult);
            Observable<R> map = doOnNext.map(new InterfaceC23492o() { // from class: bK5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$2;
                    invoke$lambda$2 = SmartlockOperatorUnlockPresenter.C14149k.invoke$lambda$2(Function1.this, obj);
                    return invoke$lambda$2;
                }
            });
            final C14153d c14153d = new C14153d(SmartlockOperatorUnlockPresenter.this);
            Observable observeOn = map.flatMap(new InterfaceC23492o() { // from class: cK5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m59739l;
                    m59739l = SmartlockOperatorUnlockPresenter.C14149k.m59739l(Function1.this, obj);
                    return m59739l;
                }
            }).retry(1L).observeOn(C23454a.m33087a(), false, 1);
            final C14162e c14162e = new C14162e(SmartlockOperatorUnlockPresenter.this);
            Observable doOnNext2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: dK5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockOperatorUnlockPresenter.C14149k.m59738m(Function1.this, obj);
                }
            });
            final C14163f c14163f = new C14163f(SmartlockOperatorUnlockPresenter.this);
            Observable observeOn2 = doOnNext2.takeUntil(new InterfaceC23494q() { // from class: eK5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m59737n;
                    m59737n = SmartlockOperatorUnlockPresenter.C14149k.m59737n(Function1.this, obj);
                    return m59737n;
                }
            }).observeOn(C24542a.m31932c(), false, 1);
            final C14164g c14164g = new C14164g(SmartlockOperatorUnlockPresenter.this);
            AbstractC23461c m33070P = observeOn2.flatMapMaybe(new InterfaceC23492o() { // from class: fK5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m59736o;
                    m59736o = SmartlockOperatorUnlockPresenter.C14149k.m59736o(Function1.this, obj);
                    return m59736o;
                }
            }).ignoreElements().m33070P(C23454a.m33087a());
            final C14166h c14166h = new C14166h(SmartlockOperatorUnlockPresenter.this);
            return m33070P.m33084B(new InterfaceC23484g() { // from class: gK5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockOperatorUnlockPresenter.C14149k.m59735p(Function1.this, obj);
                }
            }).m33069Q().m33029z(new InterfaceC23478a() { // from class: hK5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    SmartlockOperatorUnlockPresenter.C14149k.m59734q();
                }
            });
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "LTk5;", "", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockPresenter$k$f */
        /* loaded from: classes2.dex */
        public static final class C14163f extends Lambda implements Function1<Pair<? extends C36154Tk5, ? extends byte[]>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockOperatorUnlockPresenter f62236g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14163f(SmartlockOperatorUnlockPresenter smartlockOperatorUnlockPresenter) {
                super(1);
                this.f62236g = smartlockOperatorUnlockPresenter;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Pair<? extends C36154Tk5, byte[]> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                byte[] component2 = pair.component2();
                return Boolean.valueOf(this.f62236g.m59776u(component2) || this.f62236g.m59780q(component2) || this.f62236g.m59779r(component2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends C36154Tk5, ? extends byte[]> pair) {
                return invoke2((Pair<? extends C36154Tk5, byte[]>) pair);
            }
        }
    }
}
