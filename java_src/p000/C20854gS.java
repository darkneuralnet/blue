package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdScan;
import co.bird.android.model.ScanMessage;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.BulkScanPurposeBird;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.persistence.update.BirdMapMarkerUpdate;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireOperatorBirdMapMarker;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import co.bird.api.request.BirdIdBody;
import co.bird.api.request.LockBirdBody;
import co.bird.api.request.OperatorMapRequest;
import co.bird.api.request.ScanBody;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.OperatorMapResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import org.joda.time.DateTime;
import p000.C20854gS;
import p000.InterfaceC46663p54;
import p000.InterfaceC7168RR;
@Metadata(m28433d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\u0006\u0010Y\u001a\u00020W\u0012\u0006\u0010]\u001a\u00020Z¢\u0006\u0004\b^\u0010_J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0016J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J#\u0010%\u001a\u00020\u00052\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0$\"\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016JF\u00105\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\b2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0002H\u0016J\u001c\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00020\u000e2\u0006\u00101\u001a\u00020\bH\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003092\u0006\u0010\u000b\u001a\u000208H\u0016J\b\u0010;\u001a\u00020\u0005H\u0016R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, m28432d2 = {"LgS;", "LRR;", "", "Lco/bird/android/model/persistence/Bird;", "birds", "Lio/reactivex/c;", "k2", "m2", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "", "o2", "bird", "c1", "h", "Lio/reactivex/k;", "r0", "U0", "birdId", "x0", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "Lio/reactivex/p;", "c0", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "F0", "T0", "Lio/reactivex/Observable;", C17296a.f69688o, "birdIds", "v", "m1", "X0", "", "t", "([Ljava/lang/String;)Lio/reactivex/c;", "y1", "", "lock", "j", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/constant/OperatorMapKind;", "kind", "filters", "bypassFilterBirdIds", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "B1", "Lco/bird/android/model/persistence/BirdMapMarker;", "s", "Lco/bird/android/model/wire/WireBird;", "Lio/reactivex/F;", "w0", "clear", "LVK;", "LVK;", "birdClient", "LTk3;", "b", "LTk3;", "operatorClient", "Lp54;", "c", "Lp54;", "privateBirdsClient", "LbL;", DateTokenConverter.CONVERTER_KEY, "LbL;", "birdDao", "LJM;", "e", "LJM;", "birdMapMarkerDao", "Li40;", "f", "Li40;", "bulkScanPurposeBirdDao", "LTq4;", "g", "LTq4;", "reactiveConfig", "Lgl;", "Lgl;", "preference", "Lwi2;", "i", "Lwi2;", "deserializer", "<init>", "(LVK;LTk3;Lp54;LbL;LJM;Li40;LTq4;Lgl;Lwi2;)V", "bird_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1549#2:297\n1620#2,3:298\n1603#2,9:301\n1855#2:310\n1856#2:312\n1612#2:313\n1#3:311\n*S KotlinDebug\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl\n*L\n218#1:297\n218#1:298,3\n286#1:301,9\n286#1:310\n286#1:312\n286#1:313\n286#1:311\n*E\n"})
/* renamed from: gS */
/* loaded from: classes4.dex */
public final class C20854gS implements InterfaceC7168RR {

    /* renamed from: a */
    public final InterfaceC8601VK f82211a;

    /* renamed from: b */
    public final InterfaceC36152Tk3 f82212b;

    /* renamed from: c */
    public final InterfaceC46663p54 f82213c;

    /* renamed from: d */
    public final AbstractC12358bL f82214d;

    /* renamed from: e */
    public final AbstractC4030JM f82215e;

    /* renamed from: f */
    public final AbstractC42498i40 f82216f;

    /* renamed from: g */
    public final C36207Tq4 f82217g;

    /* renamed from: h */
    public final C22454gl f82218h;

    /* renamed from: i */
    public final C51174wi2 f82219i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003 \u0004*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdScan;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/BirdScan;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$bulkScanOperatorBird$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"})
    /* renamed from: gS$a */
    /* loaded from: classes4.dex */
    public static final class C20855a extends Lambda implements Function1<BirdScan, InterfaceC24574u<? extends Bird>> {

        /* renamed from: h */
        public final /* synthetic */ ScanMode f82221h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20855a(ScanMode scanMode) {
            super(1);
            this.f82221h = scanMode;
        }

        /* renamed from: c */
        public static final Bird m39402c(BirdScan result, C20854gS this$0, ScanMode mode) {
            Bird m73313a;
            Intrinsics.checkNotNullParameter(result, "$result");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(mode, "$mode");
            WireBird bird = result.getBird();
            if (bird != null && (m73313a = C10235ZK.m73313a(bird)) != null) {
                this$0.f82214d.mo61568l(m73313a);
                return m73313a;
            }
            ScanMessage message = result.getMessage();
            if (message == null) {
                return null;
            }
            throw new C39933dk5(message.getTitle(), message.getBody(), result.getStatus(), mode);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Bird> invoke(final BirdScan result) {
            Intrinsics.checkNotNullParameter(result, "result");
            final C20854gS c20854gS = C20854gS.this;
            final ScanMode scanMode = this.f82221h;
            AbstractC24507p m32056T = AbstractC24507p.m32071D(new Callable() { // from class: fS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bird m39402c;
                    m39402c = C20854gS.C20855a.m39402c(BirdScan.this, c20854gS, scanMode);
                    return m39402c;
                }
            }).m32056T(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m32056T, "fromCallable {\n         …scribeOn(Schedulers.io())");
            return c20854gS.m39433a2(m32056T);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gS$b */
    /* loaded from: classes4.dex */
    public static final class C20856b extends Lambda implements Function1<Bird, InterfaceC24574u<? extends Bird>> {

        /* renamed from: h */
        public final /* synthetic */ BulkScanPurpose f82223h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20856b(BulkScanPurpose bulkScanPurpose) {
            super(1);
            this.f82223h = bulkScanPurpose;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Bird> invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            C20854gS c20854gS = C20854gS.this;
            AbstractC24507p m33045k = c20854gS.f82216f.mo31197c(new BulkScanPurposeBird(bird.getId(), this.f82223h)).m33045k(AbstractC24507p.m32068G(bird));
            Intrinsics.checkNotNullExpressionValue(m33045k, "bulkScanPurposeBirdDao.i…andThen(Maybe.just(bird))");
            return c20854gS.m39433a2(m33045k);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gS$c */
    /* loaded from: classes4.dex */
    public static final class C20857c extends Lambda implements Function1<WireBird, InterfaceC23496h> {
        public C20857c() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m39398c(C20854gS this$0, WireBird wireBird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(wireBird, "$wireBird");
            this$0.f82214d.mo61568l(C10235ZK.m73313a(wireBird));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final WireBird wireBird) {
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            final C20854gS c20854gS = C20854gS.this;
            return AbstractC23461c.m33078H(new Callable() { // from class: hS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39398c;
                    m39398c = C20854gS.C20857c.m39398c(C20854gS.this, wireBird);
                    return m39398c;
                }
            }).m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gS$d */
    /* loaded from: classes4.dex */
    public static final class C20858d extends Lambda implements Function1<WireBird, InterfaceC23496h> {
        public C20858d() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m39395c(C20854gS this$0, WireBird bird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bird, "$bird");
            this$0.f82214d.mo61568l(C10235ZK.m73313a(bird));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            final C20854gS c20854gS = C20854gS.this;
            return AbstractC23461c.m33078H(new Callable() { // from class: iS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39395c;
                    m39395c = C20854gS.C20858d.m39395c(C20854gS.this, bird);
                    return m39395c;
                }
            }).m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorMapResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$fetchOperatorMapNearby$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,296:1\n1549#2:297\n1620#2,3:298\n1549#2:301\n1620#2,3:302\n1549#2:305\n1620#2,3:306\n37#3,2:309\n37#3,2:311\n*S KotlinDebug\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$fetchOperatorMapNearby$2\n*L\n222#1:297\n222#1:298,3\n224#1:301\n224#1:302,3\n229#1:305\n229#1:306,3\n238#1:309,2\n226#1:311,2\n*E\n"})
    /* renamed from: gS$e */
    /* loaded from: classes4.dex */
    public static final class C20859e extends Lambda implements Function1<OperatorMapResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ OperatorMapFilterBundle f82227h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20859e(OperatorMapFilterBundle operatorMapFilterBundle) {
            super(1);
            this.f82227h = operatorMapFilterBundle;
        }

        /* renamed from: d */
        public static final Unit m39391d(C20854gS this$0, List markers) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(markers, "$markers");
            AbstractC4030JM abstractC4030JM = this$0.f82215e;
            BirdMapMarker[] birdMapMarkerArr = (BirdMapMarker[]) markers.toArray(new BirdMapMarker[0]);
            abstractC4030JM.mo98990l((BirdMapMarker[]) Arrays.copyOf(birdMapMarkerArr, birdMapMarkerArr.length));
            return Unit.INSTANCE;
        }

        /* renamed from: e */
        public static final Unit m39390e(C20854gS this$0, List retainedIds) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(retainedIds, "$retainedIds");
            this$0.f82215e.mo98992j(retainedIds);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(OperatorMapResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            DateTime limitDate = DateTime.now().minus(C20854gS.this.f82217g.m82623f8().m73665a().getOperatorConfig().getFeatures().getMap().getMapPinsStaleThreshold());
            List<WireOperatorBirdMapMarker> birds = response.getBirds();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(birds, 10);
            final ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireOperatorBirdMapMarker wireOperatorBirdMapMarker : birds) {
                arrayList.add(wireOperatorBirdMapMarker.getId());
            }
            List<WireOperatorBirdMapMarker> birds2 = response.getBirds();
            C20854gS c20854gS = C20854gS.this;
            OperatorMapFilterBundle operatorMapFilterBundle = this.f82227h;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(birds2, 10);
            final ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireOperatorBirdMapMarker wireOperatorBirdMapMarker2 : birds2) {
                arrayList2.add(C3514IM.m102461a(wireOperatorBirdMapMarker2, c20854gS.m39414o2(operatorMapFilterBundle)));
            }
            final C20854gS c20854gS2 = C20854gS.this;
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: jS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39391d;
                    m39391d = C20854gS.C20859e.m39391d(C20854gS.this, arrayList2);
                    return m39391d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n         …toTypedArray())\n        }");
            List<WireOperatorBirdMapMarker> birds3 = response.getBirds();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(birds3, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
            for (WireOperatorBirdMapMarker wireOperatorBirdMapMarker3 : birds3) {
                arrayList3.add(C3514IM.m102460b(wireOperatorBirdMapMarker3));
            }
            C20854gS c20854gS3 = C20854gS.this;
            AbstractC4030JM abstractC4030JM = c20854gS3.f82215e;
            Intrinsics.checkNotNullExpressionValue(limitDate, "limitDate");
            final C20854gS c20854gS4 = C20854gS.this;
            AbstractC23461c m33078H2 = AbstractC23461c.m33078H(new Callable() { // from class: kS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39390e;
                    m39390e = C20854gS.C20859e.m39390e(C20854gS.this, arrayList);
                    return m39390e;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33078H2, "fromCallable { birdMapMa…MapMarkers(retainedIds) }");
            AbstractC12358bL abstractC12358bL = C20854gS.this.f82214d;
            BirdMapMarkerUpdate[] birdMapMarkerUpdateArr = (BirdMapMarkerUpdate[]) arrayList3.toArray(new BirdMapMarkerUpdate[0]);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{abstractC4030JM.mo98993i(limitDate), m33078H2, m33078H, abstractC12358bL.mo61569k((BirdMapMarkerUpdate[]) Arrays.copyOf(birdMapMarkerUpdateArr, birdMapMarkerUpdateArr.length))});
            AbstractC23461c m33063X = AbstractC23461c.m33037r(listOf).m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "concat(listOf(\n         …scribeOn(Schedulers.io())");
            return c20854gS3.m39436Y1(m33063X);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireBird;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/CollectionResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gS$f */
    /* loaded from: classes4.dex */
    public static final class C20860f extends Lambda implements Function1<CollectionResponse<WireBird>, List<WireBird>> {

        /* renamed from: g */
        public static final C20860f f82228g = new C20860f();

        public C20860f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(CollectionResponse<WireBird> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getItems();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "wireBirds", "Lio/reactivex/K;", "", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$fetchPrivateBirds$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,296:1\n1549#2:297\n1620#2,3:298\n*S KotlinDebug\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$fetchPrivateBirds$2\n*L\n67#1:297\n67#1:298,3\n*E\n"})
    /* renamed from: gS$g */
    /* loaded from: classes4.dex */
    public static final class C20861g extends Lambda implements Function1<List<WireBird>, InterfaceC23447K<? extends List<? extends Bird>>> {
        public C20861g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<Bird>> invoke(List<WireBird> wireBirds) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(wireBirds, "wireBirds");
            List<WireBird> list = wireBirds;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireBird wireBird : list) {
                arrayList.add(C10235ZK.m73313a(wireBird));
            }
            return C20854gS.this.m39419k2(arrayList).m33042m(AbstractC23442F.m33158H(arrayList));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "privateBirds", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gS$h */
    /* loaded from: classes4.dex */
    public static final class C20862h extends Lambda implements Function1<List<? extends Bird>, InterfaceC23496h> {
        public C20862h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<Bird> privateBirds) {
            Intrinsics.checkNotNullParameter(privateBirds, "privateBirds");
            return C20854gS.this.m39416m2(privateBirds);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gS$i */
    /* loaded from: classes4.dex */
    public static final class C20863i extends Lambda implements Function1<WireBird, InterfaceC23496h> {
        public C20863i() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m39384c(C20854gS this$0, WireBird wireBird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(wireBird, "$wireBird");
            this$0.f82214d.mo61568l(C10235ZK.m73313a(wireBird));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final WireBird wireBird) {
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            final C20854gS c20854gS = C20854gS.this;
            return AbstractC23461c.m33078H(new Callable() { // from class: lS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39384c;
                    m39384c = C20854gS.C20863i.m39384c(C20854gS.this, wireBird);
                    return m39384c;
                }
            }).m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003 \u0004*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdScan;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/BirdScan;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$scanOperatorBird$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"})
    /* renamed from: gS$j */
    /* loaded from: classes4.dex */
    public static final class C20864j extends Lambda implements Function1<BirdScan, InterfaceC24574u<? extends Bird>> {

        /* renamed from: h */
        public final /* synthetic */ ScanMode f82233h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20864j(ScanMode scanMode) {
            super(1);
            this.f82233h = scanMode;
        }

        /* renamed from: c */
        public static final Bird m39381c(BirdScan result, C20854gS this$0, ScanMode mode) {
            Bird m73313a;
            Intrinsics.checkNotNullParameter(result, "$result");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(mode, "$mode");
            WireBird bird = result.getBird();
            if (bird != null && (m73313a = C10235ZK.m73313a(bird)) != null) {
                this$0.f82214d.mo61568l(m73313a);
                return m73313a;
            }
            ScanMessage message = result.getMessage();
            if (message == null) {
                return null;
            }
            throw new C39933dk5(message.getTitle(), message.getBody(), result.getStatus(), mode);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Bird> invoke(final BirdScan result) {
            Intrinsics.checkNotNullParameter(result, "result");
            final C20854gS c20854gS = C20854gS.this;
            final ScanMode scanMode = this.f82233h;
            return AbstractC24507p.m32071D(new Callable() { // from class: mS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bird m39381c;
                    m39381c = C20854gS.C20864j.m39381c(BirdScan.this, c20854gS, scanMode);
                    return m39381c;
                }
            }).m32056T(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "byte", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gS$k */
    /* loaded from: classes4.dex */
    public static final class C20865k extends Lambda implements Function1<Byte, CharSequence> {

        /* renamed from: g */
        public static final C20865k f82234g = new C20865k();

        public C20865k() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "wireBird", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gS$l */
    /* loaded from: classes4.dex */
    public static final class C20866l extends Lambda implements Function1<WireBird, InterfaceC23496h> {
        public C20866l() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m39378c(C20854gS this$0, WireBird wireBird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(wireBird, "$wireBird");
            this$0.f82214d.mo61568l(C10235ZK.m73313a(wireBird));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final WireBird wireBird) {
            Intrinsics.checkNotNullParameter(wireBird, "wireBird");
            final C20854gS c20854gS = C20854gS.this;
            return AbstractC23461c.m33078H(new Callable() { // from class: nS
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m39378c;
                    m39378c = C20854gS.C20866l.m39378c(C20854gS.this, wireBird);
                    return m39378c;
                }
            }).m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "count", "Lna4;", "", "Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Integer;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$streamOperatorMapNearby$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,296:1\n1549#2:297\n1620#2,3:298\n37#3,2:301\n*S KotlinDebug\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$streamOperatorMapNearby$1\n*L\n252#1:297\n252#1:298,3\n254#1:301,2\n*E\n"})
    /* renamed from: gS$m */
    /* loaded from: classes4.dex */
    public static final class C20867m extends Lambda implements Function1<Integer, InterfaceC45761na4<? extends List<? extends BirdMapMarker>>> {

        /* renamed from: h */
        public final /* synthetic */ OperatorMapFilterBundle f82237h;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "birdMapMarkerArray", "", "Lco/bird/android/model/persistence/BirdMapMarker;", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$streamOperatorMapNearby$1$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,296:1\n10242#2:297\n10664#2,5:298\n*S KotlinDebug\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$streamOperatorMapNearby$1$2\n*L\n256#1:297\n256#1:298,5\n*E\n"})
        /* renamed from: gS$m$a */
        /* loaded from: classes4.dex */
        public static final class C20868a extends Lambda implements Function1<Object[], List<? extends BirdMapMarker>> {

            /* renamed from: g */
            public static final C20868a f82238g = new C20868a();

            public C20868a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<BirdMapMarker> invoke(Object[] birdMapMarkerArray) {
                Intrinsics.checkNotNullParameter(birdMapMarkerArray, "birdMapMarkerArray");
                ArrayList arrayList = new ArrayList();
                for (Object obj : birdMapMarkerArray) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<co.bird.android.model.persistence.BirdMapMarker>");
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, (List) obj);
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20867m(OperatorMapFilterBundle operatorMapFilterBundle) {
            super(1);
            this.f82237h = operatorMapFilterBundle;
        }

        /* renamed from: c */
        public static final List m39375c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<? extends List<BirdMapMarker>> invoke(Integer count) {
            IntRange until;
            int collectionSizeOrDefault;
            List emptyList;
            Intrinsics.checkNotNullParameter(count, "count");
            int ceil = (int) Math.ceil(count.intValue() / 100.0d);
            if (count.intValue() == 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return AbstractC24490k.m32123o0(emptyList);
            }
            until = RangesKt___RangesKt.until(0, ceil);
            C20854gS c20854gS = C20854gS.this;
            OperatorMapFilterBundle operatorMapFilterBundle = this.f82237h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                arrayList.add(c20854gS.f82215e.mo99001a(c20854gS.m39414o2(operatorMapFilterBundle), ((IntIterator) it).nextInt() * 100));
            }
            final C20868a c20868a = C20868a.f82238g;
            return AbstractC24490k.m32130m((InterfaceC45761na4[]) arrayList.toArray(new AbstractC24490k[0]), new InterfaceC23492o() { // from class: oS
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m39375c;
                    m39375c = C20854gS.C20867m.m39375c(Function1.this, obj);
                    return m39375c;
                }
            });
        }
    }

    public C20854gS(InterfaceC8601VK birdClient, InterfaceC36152Tk3 operatorClient, InterfaceC46663p54 privateBirdsClient, AbstractC12358bL birdDao, AbstractC4030JM birdMapMarkerDao, AbstractC42498i40 bulkScanPurposeBirdDao, C36207Tq4 reactiveConfig, C22454gl preference, C51174wi2 deserializer) {
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(privateBirdsClient, "privateBirdsClient");
        Intrinsics.checkNotNullParameter(birdDao, "birdDao");
        Intrinsics.checkNotNullParameter(birdMapMarkerDao, "birdMapMarkerDao");
        Intrinsics.checkNotNullParameter(bulkScanPurposeBirdDao, "bulkScanPurposeBirdDao");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f82211a = birdClient;
        this.f82212b = operatorClient;
        this.f82213c = privateBirdsClient;
        this.f82214d = birdDao;
        this.f82215e = birdMapMarkerDao;
        this.f82216f = bulkScanPurposeBirdDao;
        this.f82217g = reactiveConfig;
        this.f82218h = preference;
        this.f82219i = deserializer;
    }

    /* renamed from: W1 */
    public static final InterfaceC24574u m39439W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: X1 */
    public static final InterfaceC24574u m39437X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: d2 */
    public static final InterfaceC23496h m39428d2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: e2 */
    public static final InterfaceC23496h m39427e2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f2 */
    public static final InterfaceC23496h m39426f2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g2 */
    public static final List m39425g2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: h2 */
    public static final InterfaceC23447K m39423h2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i2 */
    public static final InterfaceC23496h m39422i2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j2 */
    public static final Unit m39420j2(C20854gS this$0, Bird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        this$0.f82214d.mo61568l(bird);
        return Unit.INSTANCE;
    }

    /* renamed from: l2 */
    public static final InterfaceC23496h m39418l2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: n2 */
    public static final InterfaceC24574u m39415n2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: p2 */
    public static final InterfaceC23496h m39413p2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: q2 */
    public static final InterfaceC45761na4 m39412q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: B1 */
    public AbstractC23461c mo39456B1(Location location, double d, OperatorMapKind kind, OperatorMapFilterBundle filters, List<String> list, List<Geolocation> viewport) {
        List<String> list2;
        int collectionSizeOrDefault;
        List<String> emptyList;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        InterfaceC36152Tk3 interfaceC36152Tk3 = this.f82212b;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        WireOperatorMapFilterBundle m17958i = C47311qB0.m17958i(filters);
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        } else {
            list2 = list;
        }
        List<Geolocation> list3 = viewport;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Geolocation geolocation : list3) {
            arrayList.add(C47311qB0.m17960g(geolocation));
        }
        AbstractC23442F<OperatorMapResponse> m83017z = interfaceC36152Tk3.m83017z(new OperatorMapRequest(latitude, longitude, d, kind, m17958i, list2, null, arrayList, 64, null));
        final C20859e c20859e = new C20859e(filters);
        AbstractC23461c m33164B = m83017z.m33164B(new InterfaceC23492o() { // from class: eS
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39426f2;
                m39426f2 = C20854gS.m39426f2(Function1.this, obj);
                return m39426f2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchOperat…learOnError()\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: F0 */
    public AbstractC24507p<Bird> mo39455F0(String code, ScanMode mode, ScanIntention scanIntention, BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f82212b.m83026q(new ScanBody(code, mode, scanIntention, null, null, 24, null)));
        final C20855a c20855a = new C20855a(mode);
        AbstractC24507p m33163C = m70883l.m33163C(new InterfaceC23492o() { // from class: aS
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m39439W1;
                m39439W1 = C20854gS.m39439W1(Function1.this, obj);
                return m39439W1;
            }
        });
        final C20856b c20856b = new C20856b(purpose);
        AbstractC24507p<Bird> m32021x = m33163C.m32021x(new InterfaceC23492o() { // from class: bS
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m39437X1;
                m39437X1 = C20854gS.m39437X1(Function1.this, obj);
                return m39437X1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32021x, "override fun bulkScanOpe…learOnError()\n      }\n  }");
        return m32021x;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: T0 */
    public AbstractC23461c mo39444T0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f82212b.m83041b(birdId));
        final C20858d c20858d = new C20858d();
        AbstractC23461c m33164B = m70883l.m33164B(new InterfaceC23492o() { // from class: cS
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39427e2;
                m39427e2 = C20854gS.m39427e2(Function1.this, obj);
                return m39427e2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchOperat…edulers.io())\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: U0 */
    public AbstractC23461c mo39442U0(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return this.f82214d.mo61574f(bird);
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: X0 */
    public AbstractC23461c mo39438X0(BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return this.f82216f.mo31199a();
    }

    /* renamed from: Y1 */
    public AbstractC23461c m39436Y1(AbstractC23461c abstractC23461c) {
        return InterfaceC7168RR.C7169a.m86757a(this, abstractC23461c);
    }

    /* renamed from: Z1 */
    public <T> AbstractC24490k<T> m39435Z1(AbstractC24490k<T> abstractC24490k) {
        return InterfaceC7168RR.C7169a.m86756b(this, abstractC24490k);
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: a */
    public Observable<Bird> mo39434a(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return m39432b2(this.f82214d.mo61579a(birdId));
    }

    /* renamed from: a2 */
    public <T> AbstractC24507p<T> m39433a2(AbstractC24507p<T> abstractC24507p) {
        return InterfaceC7168RR.C7169a.m86755c(this, abstractC24507p);
    }

    /* renamed from: b2 */
    public <T> Observable<T> m39432b2(Observable<T> observable) {
        return InterfaceC7168RR.C7169a.m86754d(this, observable);
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: c0 */
    public AbstractC24507p<Bird> mo39431c0(String code, ScanMode mode, ScanIntention scanIntention) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mode, "mode");
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f82212b.m83026q(new ScanBody(code, mode, scanIntention, null, null, 24, null)));
        final C20864j c20864j = new C20864j(mode);
        AbstractC24507p m33163C = m70883l.m33163C(new InterfaceC23492o() { // from class: dS
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m39415n2;
                m39415n2 = C20854gS.m39415n2(Function1.this, obj);
                return m39415n2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "@Suppress(\"UNCHECKED_CAS…rror() as Maybe<Bird>\n  }");
        AbstractC24507p<Bird> m39433a2 = m39433a2(m33163C);
        Intrinsics.checkNotNull(m39433a2, "null cannot be cast to non-null type io.reactivex.Maybe<co.bird.android.model.persistence.Bird>");
        return m39433a2;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: c1 */
    public AbstractC23461c mo39430c1(final Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23461c m33063X = AbstractC23461c.m33078H(new Callable() { // from class: SR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m39420j2;
                m39420j2 = C20854gS.m39420j2(C20854gS.this, bird);
                return m39420j2;
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "fromCallable { birdDao.u…scribeOn(Schedulers.io())");
        return m33063X;
    }

    /* renamed from: c2 */
    public <T> AbstractC23442F<T> m39429c2(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC7168RR.C7169a.m86753e(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f82214d.mo61577c(), this.f82215e.mo99000b(), this.f82216f.mo31199a()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(\n      listOf(\n  …ao.clear(),\n      )\n    )");
        return m33037r;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: h */
    public AbstractC23461c mo39424h() {
        AbstractC23442F privateBirds$default = InterfaceC46663p54.C27139a.getPrivateBirds$default(this.f82213c, 0, 100, null, 4, null);
        final C20860f c20860f = C20860f.f82228g;
        AbstractC23442F m33157I = privateBirds$default.m33157I(new InterfaceC23492o() { // from class: WR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m39425g2;
                m39425g2 = C20854gS.m39425g2(Function1.this, obj);
                return m39425g2;
            }
        });
        final C20861g c20861g = new C20861g();
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: XR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m39423h2;
                m39423h2 = C20854gS.m39423h2(Function1.this, obj);
                return m39423h2;
            }
        });
        final C20862h c20862h = new C20862h();
        AbstractC23461c m33164B = m33165A.m33164B(new InterfaceC23492o() { // from class: YR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39422i2;
                m39422i2 = C20854gS.m39422i2(Function1.this, obj);
                return m39422i2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchPrivat…Birds(privateBirds) }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: j */
    public AbstractC23461c mo39421j(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<WireBird> m79974K = this.f82211a.m79974K(new LockBirdBody(birdId, z));
        final C20863i c20863i = new C20863i();
        AbstractC23461c m33164B = m79974K.m33164B(new InterfaceC23492o() { // from class: ZR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39418l2;
                m39418l2 = C20854gS.m39418l2(Function1.this, obj);
                return m39418l2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun lockBird(bi…edulers.io())\n      }\n  }");
        return m33164B;
    }

    /* renamed from: k2 */
    public final AbstractC23461c m39419k2(List<Bird> list) {
        return this.f82214d.mo61573g(list);
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: m1 */
    public Observable<List<Bird>> mo39417m1(BulkScanPurpose purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return m39432b2(this.f82216f.mo31196d(purpose));
    }

    /* renamed from: m2 */
    public final AbstractC23461c m39416m2(List<Bird> list) {
        AbstractC12358bL abstractC12358bL = this.f82214d;
        ArrayList arrayList = new ArrayList();
        for (Bird bird : list) {
            String id = bird.getId();
            if (id != null) {
                arrayList.add(id);
            }
        }
        return abstractC12358bL.mo61571i(arrayList);
    }

    /* renamed from: o2 */
    public final String m39414o2(OperatorMapFilterBundle operatorMapFilterBundle) {
        String joinToString$default;
        String m6453i = this.f82219i.m6453i(operatorMapFilterBundle);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = m6453i.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(\"SHA-1\")\n   …filterJson.toByteArray())");
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C20865k.f82234g, 30, (Object) null);
        return joinToString$default;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: r0 */
    public AbstractC24490k<List<Bird>> mo39411r0() {
        AbstractC24490k<List<Bird>> flowable = m39432b2(this.f82214d.mo61572h()).toFlowable(EnumC23460b.LATEST);
        Intrinsics.checkNotNullExpressionValue(flowable, "birdDao.privateBirds()\n …kpressureStrategy.LATEST)");
        return flowable;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: s */
    public AbstractC24490k<List<BirdMapMarker>> mo39410s(OperatorMapFilterBundle filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        AbstractC24490k<Integer> mo98999c = this.f82215e.mo98999c(m39414o2(filters));
        final C20867m c20867m = new C20867m(filters);
        InterfaceC45761na4 m32157b1 = mo98999c.m32157b1(new InterfaceC23492o() { // from class: TR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m39412q2;
                m39412q2 = C20854gS.m39412q2(Function1.this, obj);
                return m39412q2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32157b1, "override fun streamOpera…      .clearOnError()\n  }");
        return m39435Z1(m32157b1);
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: t */
    public AbstractC23461c mo39409t(String... birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return this.f82216f.mo31198b((String[]) Arrays.copyOf(birdIds, birdIds.length));
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: v */
    public AbstractC24490k<List<Bird>> mo39408v(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return m39435Z1(this.f82214d.mo61578b(birdIds));
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: w0 */
    public AbstractC23442F<Bird> mo39407w0(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Bird m73313a = C10235ZK.m73313a(bird);
        AbstractC23442F m33042m = this.f82214d.mo61574f(m73313a).m33042m(AbstractC23442F.m33158H(m73313a));
        Intrinsics.checkNotNullExpressionValue(m33042m, "birdDao.insertBird(persi…Single.just(persistence))");
        return m39429c2(m33042m);
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: x0 */
    public AbstractC23461c mo39406x0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<WireBird> m79969b = this.f82211a.m79969b(birdId);
        final C20857c c20857c = new C20857c();
        AbstractC23461c m33164B = m79969b.m33164B(new InterfaceC23492o() { // from class: UR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39428d2;
                m39428d2 = C20854gS.m39428d2(Function1.this, obj);
                return m39428d2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchBirdBy…edulers.io())\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC7168RR
    /* renamed from: y1 */
    public AbstractC23461c mo39405y1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<WireBird> m79983B = this.f82211a.m79983B(new BirdIdBody(birdId));
        final C20866l c20866l = new C20866l();
        AbstractC23461c flatMapCompletable = m79983B.flatMapCompletable(new InterfaceC23492o() { // from class: VR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m39413p2;
                m39413p2 = C20854gS.m39413p2(Function1.this, obj);
                return m39413p2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun sleepBird(b…edulers.io())\n      }\n  }");
        return flatMapCompletable;
    }
}
