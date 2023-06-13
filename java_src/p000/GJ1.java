package p000;

import android.graphics.Rect;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.User;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.LeaseReturnResponse;
import co.bird.android.model.itemlease.LeaseSubmitAssetResponse;
import co.bird.android.model.itemlease.p022enum.ItemLeaseAssetPurpose;
import co.bird.android.model.wire.configs.LeaseTypeConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.C39065cJ1;
import p000.GJ1;
import p000.InterfaceC40476ef6;
import p000.InterfaceC41921h56;
import p000.S74;
@Metadata(m28433d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 c2\u00020\u0001:\u0002\u001a\u001eBi\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002J\u001e\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\u00110M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010KR\u0014\u0010^\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]¨\u0006d"}, m28432d2 = {"LGJ1;", "", "Lco/bird/android/model/itemlease/ItemLease;", "itemLease", "", "y", "", "x", "", "throwable", "a0", "resolution", "", "autoScanned", "", "autoScannedCodes", "b0", "Lco/bird/android/buava/Optional;", "LcJ1$b;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "w", "scanContext", "P", "R", "Q", "LMc2;", C17296a.f69688o, "LMc2;", "itemLeaseManager", "LSJ1;", "b", "LSJ1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lgl;", "e", "Lgl;", "appPreference", "LRh6;", "f", "LRh6;", "userStream", "LOh;", "g", "LOh;", "appBuildConfig", "LTq4;", "h", "LTq4;", "reactiveConfig", "LEa;", "i", "LEa;", "analyticsManager", "Lef6;", "j", "Lef6;", "uploadManager", "LDQ3;", "k", "LDQ3;", "permissionManager", "LXc1;", "l", "LXc1;", "endRideManager", "Ljava/util/concurrent/atomic/AtomicBoolean;", "m", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAutoDetecting", "La94;", "LGJ1$a;", "n", "La94;", "capturedFileRelay", "o", "Lco/bird/android/model/itemlease/ItemLease;", "p", "Ljava/lang/String;", "Lorg/joda/time/DateTime;", "q", "Lorg/joda/time/DateTime;", "initialTime", "r", "hasSubmitted", "N", "()Z", "isDebug", "O", "isMandatory", "<init>", "(LMc2;LSJ1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LRh6;LOh;LTq4;LEa;Lef6;LDQ3;LXc1;)V", "s", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetLeaseReturnScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,445:1\n237#2:446\n161#2:447\n180#2:448\n180#2:449\n180#2:450\n180#2:451\n180#2:452\n1#3:453\n1549#4:454\n1620#4,3:455\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter\n*L\n131#1:446\n194#1:447\n211#1:448\n249#1:449\n285#1:450\n301#1:451\n369#1:452\n433#1:454\n433#1:455,3\n*E\n"})
/* renamed from: GJ1 */
/* loaded from: classes3.dex */
public final class GJ1 {

    /* renamed from: s */
    public static final C2721b f11557s = new C2721b(null);

    /* renamed from: a */
    public final InterfaceC34441Mc2 f11558a;

    /* renamed from: b */
    public final SJ1 f11559b;

    /* renamed from: c */
    public final ScopeProvider f11560c;

    /* renamed from: d */
    public final InterfaceC40099e13 f11561d;

    /* renamed from: e */
    public final C22454gl f11562e;

    /* renamed from: f */
    public final InterfaceC35660Rh6 f11563f;

    /* renamed from: g */
    public final InterfaceC6097Oh f11564g;

    /* renamed from: h */
    public final C36207Tq4 f11565h;

    /* renamed from: i */
    public final InterfaceC1880Ea f11566i;

    /* renamed from: j */
    public final InterfaceC40476ef6 f11567j;

    /* renamed from: k */
    public final DQ3 f11568k;

    /* renamed from: l */
    public final InterfaceC37014Xc1 f11569l;

    /* renamed from: m */
    public final AtomicBoolean f11570m;

    /* renamed from: n */
    public final C37791a94<Optional<C2720a>> f11571n;

    /* renamed from: o */
    public ItemLease f11572o;

    /* renamed from: p */
    public String f11573p;

    /* renamed from: q */
    public DateTime f11574q;

    /* renamed from: r */
    public AtomicBoolean f11575r;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, m28432d2 = {"LGJ1$b;", "", "", "ASSET_UPLOAD_TIMEOUT_SECONDS", "J", "", "CAPTURED_IMAGE_EXTENSION", "Ljava/lang/String;", "CAPTURED_IMAGE_PREFIX", "RESOLUTION_ABORTED", "RESOLUTION_RETURNED", "UNKNOWN_SCAN_CONTEXT", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$b */
    /* loaded from: classes3.dex */
    public static final class C2721b {
        public /* synthetic */ C2721b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2721b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LBx;", "it", "", C17296a.f69688o, "(LBx;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$c */
    /* loaded from: classes3.dex */
    public static final class C2722c extends Lambda implements Function1<C0774Bx, CharSequence> {

        /* renamed from: g */
        public static final C2722c f11579g = new C2722c();

        public C2722c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
            r2 = kotlin.text.StringsKt___StringsKt.take(r2, 20);
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CharSequence invoke(C0774Bx it) {
            String take;
            Intrinsics.checkNotNullParameter(it, "it");
            String m113299b = it.m113299b();
            if (m113299b == null || take == null) {
                return "???";
            }
            return take;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$d */
    /* loaded from: classes3.dex */
    public static final class C2723d extends Lambda implements Function1<Unit, Unit> {
        public C2723d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC41921h56.C22549a.topToast$default(GJ1.this.f11559b, C45871nl4.uploading_photo, (EnumC40735f56) null, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$e */
    /* loaded from: classes3.dex */
    public static final class C2724e extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Pair<? extends LeaseSubmitAssetResponse, ? extends Uri>>> {

        /* renamed from: h */
        public final /* synthetic */ ItemLease f11582h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "it", "Lkotlin/Pair;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GJ1$e$a */
        /* loaded from: classes3.dex */
        public static final class C2725a extends Lambda implements Function1<LeaseSubmitAssetResponse, Pair<? extends LeaseSubmitAssetResponse, ? extends Uri>> {

            /* renamed from: g */
            public final /* synthetic */ Uri f11583g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2725a(Uri uri) {
                super(1);
                this.f11583g = uri;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<LeaseSubmitAssetResponse, Uri> invoke(LeaseSubmitAssetResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f11583g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2724e(ItemLease itemLease) {
            super(1);
            this.f11582h = itemLease;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<LeaseSubmitAssetResponse, Uri>> invoke(Unit it) {
            Uri m105445d;
            long j;
            List<String> emptyList;
            Intrinsics.checkNotNullParameter(it, "it");
            C2720a c2720a = (C2720a) ((Optional) GJ1.this.f11571n.getValue()).m59035e();
            if (c2720a != null && (m105445d = c2720a.m105445d()) != null) {
                try {
                    String path = m105445d.getPath();
                    Intrinsics.checkNotNull(path);
                    j = new File(path).length();
                } catch (Exception e) {
                    String path2 = m105445d.getPath();
                    C41318g46.m40158f(e, "Couldn't determine file size for path " + path2, new Object[0]);
                    j = 0;
                }
                long j2 = j;
                C2720a c2720a2 = (C2720a) ((Optional) GJ1.this.f11571n.getValue()).m59035e();
                boolean z = c2720a2 != null && c2720a2.m105447b();
                C2720a c2720a3 = (C2720a) ((Optional) GJ1.this.f11571n.getValue()).m59035e();
                if (c2720a3 == null || (emptyList = c2720a3.m105446c()) == null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                AbstractC23442F<LeaseSubmitAssetResponse> mo55707B = GJ1.this.f11558a.mo55707B(this.f11582h.getId(), ItemLeaseAssetPurpose.RETURN_VERIFICATION, j2, "image/jpeg", z, emptyList);
                final C2725a c2725a = new C2725a(m105445d);
                return mo55707B.m33157I(new InterfaceC23492o() { // from class: HJ1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = GJ1.C2724e.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return AbstractC23442F.m33100x(new FileNotFoundException("captured file uri was not found while attempting to capture image"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "Landroid/net/Uri;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/itemlease/LeaseReturnResponse;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$f */
    /* loaded from: classes3.dex */
    public static final class C2726f extends Lambda implements Function1<Pair<? extends LeaseSubmitAssetResponse, ? extends Uri>, InterfaceC23447K<? extends LeaseReturnResponse>> {

        /* renamed from: h */
        public final /* synthetic */ ItemLease f11585h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseReturnResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseReturnResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GJ1$f$a */
        /* loaded from: classes3.dex */
        public static final class C2727a extends Lambda implements Function1<LeaseReturnResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GJ1 f11586g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2727a(GJ1 gj1) {
                super(1);
                this.f11586g = gj1;
            }

            /* renamed from: a */
            public final void m105436a(LeaseReturnResponse leaseReturnResponse) {
                List<String> emptyList;
                boolean z = false;
                C41318g46.m40163a("setting as hasSubmitted", new Object[0]);
                this.f11586g.f11575r.set(true);
                C41318g46.m40163a("closing screen down", new Object[0]);
                C2720a c2720a = (C2720a) ((Optional) this.f11586g.f11571n.getValue()).m59035e();
                GJ1 gj1 = this.f11586g;
                if (c2720a != null && c2720a.m105447b()) {
                    z = true;
                }
                if (c2720a == null || (emptyList = c2720a.m105446c()) == null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                gj1.m105474b0("returned", z, emptyList);
                this.f11586g.f11561d.mo37050b1(-1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LeaseReturnResponse leaseReturnResponse) {
                m105436a(leaseReturnResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2726f(ItemLease itemLease) {
            super(1);
            this.f11585h = itemLease;
        }

        /* renamed from: d */
        public static final InterfaceC23447K m105438d(GJ1 this$0, ItemLease itemLease) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(itemLease, "$itemLease");
            C41318g46.m40163a("setting lease as returned", new Object[0]);
            return this$0.f11558a.mo55654u(itemLease.getId());
        }

        /* renamed from: e */
        public static final void m105437e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends LeaseReturnResponse> invoke(Pair<LeaseSubmitAssetResponse, ? extends Uri> pair) {
            String take;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            LeaseSubmitAssetResponse component1 = pair.component1();
            Uri component2 = pair.component2();
            take = StringsKt___StringsKt.take(component1.getSignedUrl(), 30);
            C41318g46.m40163a("uploading asset via put to " + take, new Object[0]);
            AbstractC23461c m33061Z = InterfaceC40476ef6.C20086a.putAssetUpload$default(GJ1.this.f11567j, null, component1.getSignedUrl(), component2, 1, null).m33061Z(20L, TimeUnit.SECONDS);
            final GJ1 gj1 = GJ1.this;
            final ItemLease itemLease = this.f11585h;
            AbstractC23442F m33042m = m33061Z.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: IJ1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m105438d;
                    m105438d = GJ1.C2726f.m105438d(GJ1.this, itemLease);
                    return m105438d;
                }
            }));
            final C2727a c2727a = new C2727a(GJ1.this);
            return m33042m.m33101w(new InterfaceC23484g() { // from class: JJ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GJ1.C2726f.m105437e(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$g */
    /* loaded from: classes3.dex */
    public static final class C2728g extends Lambda implements Function1<Throwable, Unit> {
        public C2728g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C41318g46.m40158f(it, "Error while uploading lease asset", new Object[0]);
            GJ1.this.f11559b.errorGeneric();
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/itemlease/LeaseReturnResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/itemlease/LeaseReturnResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$h */
    /* loaded from: classes3.dex */
    public static final class C2729h extends Lambda implements Function1<LeaseReturnResponse, Unit> {

        /* renamed from: g */
        public static final C2729h f11588g = new C2729h();

        public C2729h() {
            super(1);
        }

        /* renamed from: a */
        public final void m105435a(LeaseReturnResponse leaseReturnResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LeaseReturnResponse leaseReturnResponse) {
            m105435a(leaseReturnResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$i */
    /* loaded from: classes3.dex */
    public static final class C2730i extends Lambda implements Function1<Throwable, Unit> {
        public C2730i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while uploading lease asset", new Object[0]);
            GJ1.m105472c0(GJ1.this, "aborted", false, null, 6, null);
            GJ1.this.f11561d.mo37050b1(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$j */
    /* loaded from: classes3.dex */
    public static final class C2731j extends Lambda implements Function1<Long, Unit> {
        public C2731j() {
            super(1);
        }

        /* renamed from: a */
        public final void m105434a(Long l) {
            GJ1.this.f11559b.m85752Xl(Integer.valueOf(C45871nl4.identification_scanning_having_trouble), new Object[0]);
            GJ1.this.f11559b.m85750Zl(true);
            GJ1.this.f11559b.m85748bm(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m105434a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$k */
    /* loaded from: classes3.dex */
    public static final class C2732k extends Lambda implements Function1<Throwable, Unit> {
        public C2732k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
            C41318g46.m40158f(it, "Error handling timer", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$l */
    /* loaded from: classes3.dex */
    public static final class C2733l extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Uri>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GJ1$l$a */
        /* loaded from: classes3.dex */
        public static final class C2734a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GJ1 f11593g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2734a(GJ1 gj1) {
                super(1);
                this.f11593g = gj1;
            }

            /* renamed from: a */
            public final void m105430a(InterfaceC23465c interfaceC23465c) {
                S74.C7343a.showProgress$default(this.f11593g.f11559b, true, 0, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m105430a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Landroid/net/Uri;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GJ1$l$b */
        /* loaded from: classes3.dex */
        public static final class C2735b extends Lambda implements Function2<Uri, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GJ1 f11594g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2735b(GJ1 gj1) {
                super(2);
                this.f11594g = gj1;
            }

            /* renamed from: a */
            public final void m105429a(Uri uri, Throwable th) {
                S74.C7343a.showProgress$default(this.f11594g.f11559b, false, 0, 2, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri, Throwable th) {
                m105429a(uri, th);
                return Unit.INSTANCE;
            }
        }

        public C2733l() {
            super(1);
        }

        /* renamed from: c */
        public static final void m105431c(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Uri> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<Uri> m33152N = GJ1.this.f11559b.m85747cm(GJ1.this.f11558a.mo55684a(), "cap", ".jpg").m33152N(C23454a.m33087a());
            final C2734a c2734a = new C2734a(GJ1.this);
            AbstractC23442F<Uri> m33102v = m33152N.m33102v(new InterfaceC23484g() { // from class: KJ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GJ1.C2733l.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C2735b c2735b = new C2735b(GJ1.this);
            return m33102v.m33104u(new InterfaceC23479b() { // from class: LJ1
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    GJ1.C2733l.m105431c(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$m */
    /* loaded from: classes3.dex */
    public static final class C2736m extends Lambda implements Function1<Throwable, Unit> {
        public C2736m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
            GJ1.this.f11559b.errorGeneric();
            InterfaceC1880Ea interfaceC1880Ea = GJ1.this.f11566i;
            String localizedMessage = it.getLocalizedMessage();
            interfaceC1880Ea.mo55905y(new C44502lS3(null, null, null, "helmet_lease_manual_capture_take_photo", localizedMessage == null ? it.toString() : localizedMessage, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "fileUri", "", C17296a.f69688o, "(Landroid/net/Uri;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHelmetLeaseReturnScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter$initializeUI$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,445:1\n1603#2,9:446\n1855#2:455\n1856#2:457\n1612#2:458\n1#3:456\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter$initializeUI$6\n*L\n291#1:446,9\n291#1:455\n291#1:457\n291#1:458\n291#1:456\n*E\n"})
    /* renamed from: GJ1$n */
    /* loaded from: classes3.dex */
    public static final class C2737n extends Lambda implements Function1<Uri, Unit> {
        public C2737n() {
            super(1);
        }

        /* renamed from: a */
        public final void m105428a(Uri fileUri) {
            List emptyList;
            List<C0774Bx> m61594b;
            C37791a94 c37791a94 = GJ1.this.f11571n;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(fileUri, "fileUri");
            C39065cJ1.C13488b m59035e = GJ1.this.f11559b.m85757Sl().m73665a().m59035e();
            if (m59035e != null && (m61594b = m59035e.m61594b()) != null) {
                emptyList = new ArrayList();
                for (C0774Bx c0774Bx : m61594b) {
                    String m113296e = c0774Bx.m113296e();
                    if (m113296e != null) {
                        emptyList.add(m113296e);
                    }
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            c37791a94.accept(c14443a.m59032c(new C2720a(fileUri, false, emptyList)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            m105428a(uri);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$o */
    /* loaded from: classes3.dex */
    public static final class C2738o extends Lambda implements Function1<Throwable, Unit> {
        public C2738o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
            C41318g46.m40158f(it, "Error handling capture image click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$p */
    /* loaded from: classes3.dex */
    public static final class C2739p extends Lambda implements Function1<Unit, Unit> {
        public C2739p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            GJ1.this.f11571n.accept(Optional.f63040c.m59034a());
            GJ1.this.f11570m.set(true);
            GJ1.this.f11559b.m85753Wl(GJ1.this.m105451x());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$q */
    /* loaded from: classes3.dex */
    public static final class C2740q extends Lambda implements Function1<Throwable, Unit> {
        public C2740q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
            C41318g46.m40158f(it, "Error handling retake photo click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$r */
    /* loaded from: classes3.dex */
    public static final class C2741r extends Lambda implements Function1<Throwable, Unit> {
        public C2741r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
            C41318g46.m40158f(it, "Error processing captured image", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$s */
    /* loaded from: classes3.dex */
    public static final class C2742s extends Lambda implements Function1<Throwable, Unit> {
        public C2742s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
            C41318g46.m40158f(it, "Error while prompting for camera permission in helmet lease return scanner flow", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LcJ1$b;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$t */
    /* loaded from: classes3.dex */
    public static final class C2743t extends Lambda implements Function1<Optional<C39065cJ1.C13488b>, Boolean> {
        public C2743t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<C39065cJ1.C13488b> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(GJ1.this.f11570m.get());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LcJ1$b;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$u */
    /* loaded from: classes3.dex */
    public static final class C2744u extends Lambda implements Function1<Optional<C39065cJ1.C13488b>, Unit> {
        public C2744u() {
            super(1);
        }

        /* renamed from: a */
        public final void m105426a(Optional<C39065cJ1.C13488b> result) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(result, "result");
            ItemLease itemLease = GJ1.this.f11572o;
            if (itemLease == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemLease");
                itemLease = null;
            }
            gj1.m105452w(result, itemLease);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C39065cJ1.C13488b> optional) {
            m105426a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LcJ1$b;", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)LcJ1$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHelmetLeaseReturnScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter$onResume$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,445:1\n1#2:446\n*E\n"})
    /* renamed from: GJ1$v */
    /* loaded from: classes3.dex */
    public static final class C2745v extends Lambda implements Function1<Optional<C39065cJ1.C13488b>, C39065cJ1.C13488b> {
        public C2745v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C39065cJ1.C13488b invoke(Optional<C39065cJ1.C13488b> optional) {
            C39065cJ1.C13488b m59035e = optional.m59035e();
            if (m59035e != null) {
                ItemLease itemLease = GJ1.this.f11572o;
                if (itemLease == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("itemLease");
                    itemLease = null;
                }
                if (C34026Ki1.m98486g(m59035e, itemLease) || C34026Ki1.m98491b(m59035e)) {
                    return m59035e;
                }
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LcJ1$b;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/u;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "f", "(LcJ1$b;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$w */
    /* loaded from: classes3.dex */
    public static final class C2746w extends Lambda implements Function1<C39065cJ1.C13488b, InterfaceC24574u<? extends Uri>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GJ1$w$a */
        /* loaded from: classes3.dex */
        public static final class C2747a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GJ1 f11606g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2747a(GJ1 gj1) {
                super(1);
                this.f11606g = gj1;
            }

            /* renamed from: a */
            public final void m105414a(InterfaceC23465c interfaceC23465c) {
                this.f11606g.f11570m.set(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m105414a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GJ1$w$b */
        /* loaded from: classes3.dex */
        public static final class C2748b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GJ1 f11607g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2748b(GJ1 gj1) {
                super(1);
                this.f11607g = gj1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f11607g.f11570m.set(true);
                InterfaceC1880Ea interfaceC1880Ea = this.f11607g.f11566i;
                String localizedMessage = th.getLocalizedMessage();
                interfaceC1880Ea.mo55905y(new C44502lS3(null, null, null, "helmet_lease_auto_detected_take_photo", localizedMessage == null ? th.toString() : localizedMessage, 7, null));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GJ1$w$c */
        /* loaded from: classes3.dex */
        public static final class C2749c extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GJ1 f11608g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2749c(GJ1 gj1) {
                super(1);
                this.f11608g = gj1;
            }

            /* renamed from: a */
            public final void m105413a(InterfaceC23465c interfaceC23465c) {
                this.f11608g.f11570m.set(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m105413a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GJ1$w$d */
        /* loaded from: classes3.dex */
        public static final class C2750d extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Uri>> {

            /* renamed from: g */
            public static final C2750d f11609g = new C2750d();

            public C2750d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Uri> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        public C2746w() {
            super(1);
        }

        /* renamed from: g */
        public static final void m105418g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final void m105417h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final void m105416i(GJ1 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f11570m.set(true);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final InterfaceC24574u m105415j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: f */
        public final InterfaceC24574u<? extends Uri> invoke(C39065cJ1.C13488b result) {
            Intrinsics.checkNotNullParameter(result, "result");
            C41318g46.m40163a("handling result " + result, new Object[0]);
            ItemLease itemLease = GJ1.this.f11572o;
            if (itemLease == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemLease");
                itemLease = null;
            }
            if (C34026Ki1.m98486g(result, itemLease)) {
                AbstractC23442F<Uri> m33142Y = GJ1.this.f11559b.m85747cm(GJ1.this.f11558a.mo55684a(), "cap", ".jpg").m33142Y(C24542a.m31932c());
                final C2747a c2747a = new C2747a(GJ1.this);
                AbstractC23442F<Uri> m33102v = m33142Y.m33102v(new InterfaceC23484g() { // from class: MJ1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        GJ1.C2746w.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C2748b c2748b = new C2748b(GJ1.this);
                return m33102v.m33106t(new InterfaceC23484g() { // from class: NJ1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        GJ1.C2746w.m105418g(Function1.this, obj);
                    }
                }).m33125j0();
            } else if (C34026Ki1.m98490c(result)) {
                return AbstractC24507p.m32024u();
            } else {
                if (C34026Ki1.m98491b(result)) {
                    AbstractC23442F<DialogResponse> birdDialog = GJ1.this.f11559b.birdDialog(C40861fJ1.f79832d, true, false);
                    final C2749c c2749c = new C2749c(GJ1.this);
                    AbstractC23442F<DialogResponse> m33102v2 = birdDialog.m33102v(new InterfaceC23484g() { // from class: OJ1
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            GJ1.C2746w.m105417h(Function1.this, obj);
                        }
                    });
                    final GJ1 gj1 = GJ1.this;
                    AbstractC23442F<DialogResponse> m33110r = m33102v2.m33110r(new InterfaceC23478a() { // from class: PJ1
                        @Override // io.reactivex.functions.InterfaceC23478a
                        public final void run() {
                            GJ1.C2746w.m105416i(GJ1.this);
                        }
                    });
                    final C2750d c2750d = C2750d.f11609g;
                    return m33110r.m33163C(new InterfaceC23492o() { // from class: QJ1
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m105415j;
                            m105415j = GJ1.C2746w.m105415j(Function1.this, obj);
                            return m105415j;
                        }
                    }).m32065J();
                }
                return AbstractC24507p.m32024u();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "fileUri", "", C17296a.f69688o, "(Landroid/net/Uri;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHelmetLeaseReturnScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter$onResume$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,445:1\n1603#2,9:446\n1855#2:455\n1856#2:457\n1612#2:458\n1#3:456\n*S KotlinDebug\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter$onResume$7\n*L\n200#1:446,9\n200#1:455\n200#1:457\n200#1:458\n200#1:456\n*E\n"})
    /* renamed from: GJ1$x */
    /* loaded from: classes3.dex */
    public static final class C2751x extends Lambda implements Function1<Uri, Unit> {
        public C2751x() {
            super(1);
        }

        /* renamed from: a */
        public final void m105411a(Uri fileUri) {
            List emptyList;
            List<C0774Bx> m61594b;
            C37791a94 c37791a94 = GJ1.this.f11571n;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(fileUri, "fileUri");
            C39065cJ1.C13488b m59035e = GJ1.this.f11559b.m85757Sl().m73665a().m59035e();
            if (m59035e != null && (m61594b = m59035e.m61594b()) != null) {
                emptyList = new ArrayList();
                for (C0774Bx c0774Bx : m61594b) {
                    String m113296e = c0774Bx.m113296e();
                    if (m113296e != null) {
                        emptyList.add(m113296e);
                    }
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            c37791a94.accept(c14443a.m59032c(new C2720a(fileUri, true, emptyList)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            m105411a(uri);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GJ1$y */
    /* loaded from: classes3.dex */
    public static final class C2752y extends Lambda implements Function1<Throwable, Unit> {
        public C2752y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            GJ1 gj1 = GJ1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            gj1.m105476a0(it);
            C41318g46.m40158f(it, "Error during auto capturing of image", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LGJ1$a;", "kotlin.jvm.PlatformType", "capturedImage", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$z */
    /* loaded from: classes3.dex */
    public static final class C2753z extends Lambda implements Function1<Optional<C2720a>, Unit> {
        public C2753z() {
            super(1);
        }

        /* renamed from: a */
        public final void m105410a(Optional<C2720a> optional) {
            Uri uri;
            String m105451x;
            C2720a m59035e = optional.m59035e();
            if (m59035e != null) {
                uri = m59035e.m105445d();
            } else {
                uri = null;
            }
            GJ1.this.f11559b.m85756Tl(uri);
            SJ1 sj1 = GJ1.this.f11559b;
            if (uri != null) {
                m105451x = GJ1.this.f11559b.getString(C45871nl4.helmet_scan_confirm_instructions, new Object[0]);
            } else {
                m105451x = GJ1.this.m105451x();
            }
            sj1.m85753Wl(m105451x);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C2720a> optional) {
            m105410a(optional);
            return Unit.INSTANCE;
        }
    }

    public GJ1(InterfaceC34441Mc2 itemLeaseManager, SJ1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, InterfaceC35660Rh6 userStream, InterfaceC6097Oh appBuildConfig, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC40476ef6 uploadManager, DQ3 permissionManager, InterfaceC37014Xc1 endRideManager) {
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        this.f11558a = itemLeaseManager;
        this.f11559b = ui;
        this.f11560c = scopeProvider;
        this.f11561d = navigator;
        this.f11562e = appPreference;
        this.f11563f = userStream;
        this.f11564g = appBuildConfig;
        this.f11565h = reactiveConfig;
        this.f11566i = analyticsManager;
        this.f11567j = uploadManager;
        this.f11568k = permissionManager;
        this.f11569l = endRideManager;
        this.f11570m = new AtomicBoolean(false);
        this.f11571n = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f11574q = now;
        this.f11575r = new AtomicBoolean(false);
    }

    /* renamed from: A */
    public static final void m105503A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23447K m105502B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m105501C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m105500D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m105499E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m105498F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m105497G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m105496H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23447K m105495I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m105494J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m105493K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m105492L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m105491M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m105485S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final boolean m105484T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: U */
    public static final void m105483U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC24574u m105482V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m105481W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m105480X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m105479Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m105478Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c0 */
    public static /* synthetic */ void m105472c0(GJ1 gj1, String str, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        gj1.m105474b0(str, z, list);
    }

    public static /* synthetic */ void onCreate$default(GJ1 gj1, ItemLease itemLease, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        gj1.m105488P(itemLease, str);
    }

    /* renamed from: z */
    public static final void m105449z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public final boolean m105490N() {
        User mo76584a = this.f11563f.mo76584a();
        return mo76584a != null && C34026Ki1.m98492a(mo76584a, this.f11562e, this.f11564g);
    }

    /* renamed from: O */
    public final boolean m105489O() {
        return this.f11565h.m82623f8().m73665a().getComplianceConfig().getHelmetRequiredForRide();
    }

    /* renamed from: P */
    public final void m105488P(ItemLease itemLease, String str) {
        Intrinsics.checkNotNullParameter(itemLease, "itemLease");
        this.f11572o = itemLease;
        this.f11573p = str;
        m105450y(itemLease);
    }

    /* renamed from: Q */
    public final void m105487Q() {
        if (!this.f11575r.get()) {
            m105472c0(this, "aborted", false, null, 6, null);
        }
    }

    /* renamed from: R */
    public final void m105486R() {
        LeaseTypeConfig helmet = this.f11565h.m82623f8().m73665a().getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f11566i;
        ItemLease itemLease = this.f11572o;
        if (itemLease == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemLease");
            itemLease = null;
        }
        String id = itemLease.getId();
        String str = this.f11573p;
        if (str == null) {
            str = "unknown";
        }
        interfaceC1880Ea.mo55905y(new C42640iJ1(null, null, null, id, str, m105489O(), this.f11565h.m82623f8().m73665a().getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), this.f11569l.mo55540n(), 7, null));
        DQ3 dq3 = this.f11568k;
        Permission permission = Permission.CAMERA;
        if (dq3.m110496a(permission) != PermissionStatus.GRANTED) {
            AbstractC23442F<FQ3> m110485l = this.f11568k.m110485l(permission);
            final C2742s c2742s = new C2742s();
            AbstractC23461c m33069Q = m110485l.m33106t(new InterfaceC23484g() { // from class: pJ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GJ1.m105485S(Function1.this, obj);
                }
            }).m33159G().m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "fun onResume() {\n    wit…ured image\")\n      })\n  }");
            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f11560c));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f11574q = now;
        this.f11575r.set(false);
        this.f11570m.set(true);
        AbstractC24490k<Optional<C39065cJ1.C13488b>> flowable = this.f11559b.m85757Sl().toFlowable(EnumC23460b.LATEST);
        final C2743t c2743t = new C2743t();
        AbstractC24490k<Optional<C39065cJ1.C13488b>> m32111s0 = flowable.m32175S(new InterfaceC23494q() { // from class: qJ1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m105484T;
                m105484T = GJ1.m105484T(Function1.this, obj);
                return m105484T;
            }
        }).m32111s0(C23454a.m33087a());
        final C2744u c2744u = new C2744u();
        AbstractC24490k<Optional<C39065cJ1.C13488b>> m32111s02 = m32111s0.m32191K(new InterfaceC23484g() { // from class: rJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105483U(Function1.this, obj);
            }
        }).m32111s0(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m32111s02, "fun onResume() {\n    wit…ured image\")\n      })\n  }");
        AbstractC24490k m32111s03 = C37279Yf5.m74578Q(m32111s02, new C2745v()).m32111s0(C23454a.m33087a());
        final C2746w c2746w = new C2746w();
        AbstractC24490k m32192J0 = m32111s03.m32152e0(new InterfaceC23492o() { // from class: sJ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m105482V;
                m105482V = GJ1.m105482V(Function1.this, obj);
                return m105482V;
            }
        }, false, 1).m32192J0();
        Intrinsics.checkNotNullExpressionValue(m32192J0, "fun onResume() {\n    wit…ured image\")\n      })\n  }");
        Object m32150f = m32192J0.m32150f(AutoDispose.m45239a(this.f11560c));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2751x c2751x = new C2751x();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: tJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105481W(Function1.this, obj);
            }
        };
        final C2752y c2752y = new C2752y();
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: uJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105480X(Function1.this, obj);
            }
        });
        Observable<Optional<C2720a>> observeOn = this.f11571n.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "capturedFileRelay\n      …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f11560c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2753z c2753z = new C2753z();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: wJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105479Y(Function1.this, obj);
            }
        };
        final C2741r c2741r = new C2741r();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: xJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105478Z(Function1.this, obj);
            }
        });
    }

    /* renamed from: a0 */
    public final void m105476a0(Throwable th) {
        LeaseTypeConfig helmet = this.f11565h.m82623f8().m73665a().getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f11566i;
        ItemLease itemLease = this.f11572o;
        if (itemLease == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemLease");
            itemLease = null;
        }
        String id = itemLease.getId();
        String str = this.f11573p;
        if (str == null) {
            str = "unknown";
        }
        String str2 = str;
        boolean m105489O = m105489O();
        String currency = this.f11565h.m82623f8().m73665a().getRideConfig().getCurrency();
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        int initialChargeAmount = (int) helmet.getInitialChargeAmount();
        int returnRefundAmount = (int) helmet.getReturnRefundAmount();
        int delinquentFeeAmount = (int) helmet.getDelinquentFeeAmount();
        String mo55540n = this.f11569l.mo55540n();
        Intrinsics.checkNotNullExpressionValue(simpleName, "simpleName");
        interfaceC1880Ea.mo55905y(new C41454gJ1(null, null, null, simpleName, message, id, str2, m105489O, currency, initialChargeAmount, returnRefundAmount, delinquentFeeAmount, mo55540n, 7, null));
    }

    /* renamed from: b0 */
    public final void m105474b0(String str, boolean z, List<String> list) {
        LeaseTypeConfig helmet = this.f11565h.m82623f8().m73665a().getLeaseConfig().getLeaseTypes().getHelmet();
        InterfaceC1880Ea interfaceC1880Ea = this.f11566i;
        ItemLease itemLease = this.f11572o;
        if (itemLease == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemLease");
            itemLease = null;
        }
        String id = itemLease.getId();
        String str2 = this.f11573p;
        if (str2 == null) {
            str2 = "unknown";
        }
        String mo55540n = this.f11569l.mo55540n();
        interfaceC1880Ea.mo55905y(new C42047hJ1(null, null, null, str, id, Boolean.valueOf(z), list, str2, m105489O(), this.f11565h.m82623f8().m73665a().getRideConfig().getCurrency(), (int) helmet.getInitialChargeAmount(), (int) helmet.getReturnRefundAmount(), (int) helmet.getDelinquentFeeAmount(), mo55540n, 7, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m105452w(Optional<C39065cJ1.C13488b> optional, ItemLease itemLease) {
        String str;
        C39065cJ1.C13488b m59035e;
        List<Pair<Rect, Integer>> emptyList;
        C39065cJ1.C13488b m59035e2;
        List<C0774Bx> m61594b;
        int collectionSizeOrDefault;
        int i;
        List<C0774Bx> m61594b2;
        C39065cJ1.C13488b m59035e3 = optional.m59035e();
        Rect rect = null;
        if (m59035e3 != null && (m61594b2 = m59035e3.m61594b()) != null) {
            if (!m105490N()) {
                m61594b2 = null;
            }
            if (m61594b2 != null) {
                str = CollectionsKt___CollectionsKt.joinToString$default(m61594b2, null, "list of barcodes: ", null, 0, null, C2722c.f11579g, 29, null);
                SJ1 sj1 = this.f11559b;
                m59035e = optional.m59035e();
                if (m59035e == null && (m61594b = m59035e.m61594b()) != null) {
                    List<C0774Bx> list = m61594b;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    emptyList = new ArrayList<>(collectionSizeOrDefault);
                    for (C0774Bx c0774Bx : list) {
                        Rect m113300a = c0774Bx.m113300a();
                        if (C34026Ki1.m98488e(c0774Bx, itemLease)) {
                            i = C32364Df4.birdGreen;
                        } else {
                            i = C32364Df4.birdRed;
                        }
                        emptyList.add(TuplesKt.m28425to(m113300a, Integer.valueOf(i)));
                    }
                } else {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                m59035e2 = optional.m59035e();
                if (m59035e2 != null) {
                    rect = m59035e2.m61593c();
                }
                sj1.m85754Vl(emptyList, rect);
                this.f11559b.m85749am(str);
            }
        }
        str = null;
        SJ1 sj12 = this.f11559b;
        m59035e = optional.m59035e();
        if (m59035e == null) {
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        m59035e2 = optional.m59035e();
        if (m59035e2 != null) {
        }
        sj12.m85754Vl(emptyList, rect);
        this.f11559b.m85749am(str);
    }

    /* renamed from: x */
    public final String m105451x() {
        return this.f11559b.getString(C45871nl4.helmet_scan_autoscan_instructions, new Object[0]);
    }

    /* renamed from: y */
    public final void m105450y(ItemLease itemLease) {
        this.f11559b.m85753Wl(m105451x());
        String rentalFineFeeString$default = C34026Ki1.rentalFineFeeString$default(this.f11565h, null, 1, null);
        if (rentalFineFeeString$default != null) {
            this.f11559b.m85751Yl(Integer.valueOf(C45871nl4.rent_a_helmet_fine_description), rentalFineFeeString$default);
        }
        this.f11559b.m85750Zl(false);
        this.f11559b.m85748bm(true);
        long autoscanTimeoutSeconds = this.f11565h.m82623f8().m73665a().getLeaseConfig().getLeaseTypes().getHelmet().getAutoscanTimeoutSeconds();
        if (!this.f11565h.m82623f8().m73665a().getLeaseConfig().getLeaseTypes().getHelmet().getAutoscanRequiredToEnd() && autoscanTimeoutSeconds >= 0) {
            Observable<Long> observeOn = Observable.timer(autoscanTimeoutSeconds, TimeUnit.SECONDS).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "timer(timeout, TimeUnit.…dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f11560c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C2731j c2731j = new C2731j();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: kJ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GJ1.m105449z(Function1.this, obj);
                }
            };
            final C2732k c2732k = new C2732k();
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: BJ1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GJ1.m105503A(Function1.this, obj);
                }
            });
        } else if (autoscanTimeoutSeconds == -1) {
            this.f11559b.m85752Xl(Integer.valueOf(C45871nl4.helmet_lease_manual_capture_instructions), new Object[0]);
            this.f11559b.m85750Zl(true);
            this.f11559b.m85748bm(false);
        }
        Observable<Unit> m85761G2 = this.f11559b.m85761G2();
        final C2733l c2733l = new C2733l();
        Observable observeOn2 = m85761G2.flatMapSingle(new InterfaceC23492o() { // from class: CJ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105502B;
                m105502B = GJ1.m105502B(Function1.this, obj);
                return m105502B;
            }
        }).observeOn(C23454a.m33087a());
        final C2736m c2736m = new C2736m();
        Observable retry = observeOn2.doOnError(new InterfaceC23484g() { // from class: DJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105501C(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun initializeUI…y.RESULT_OK)\n      })\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f11560c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2737n c2737n = new C2737n();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: EJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105500D(Function1.this, obj);
            }
        };
        final C2738o c2738o = new C2738o();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: FJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105499E(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f11559b.m85755Ul().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.retakePhotoClicks()\n …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f11560c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2739p c2739p = new C2739p();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: lJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105498F(Function1.this, obj);
            }
        };
        final C2740q c2740q = new C2740q();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: mJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105497G(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f11559b.m85758Rl().observeOn(C23454a.m33087a());
        final C2723d c2723d = new C2723d();
        Observable<Unit> observeOn5 = observeOn4.doOnNext(new InterfaceC23484g() { // from class: nJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105496H(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C2724e c2724e = new C2724e(itemLease);
        Observable<R> switchMapSingle = observeOn5.switchMapSingle(new InterfaceC23492o() { // from class: oJ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105495I;
                m105495I = GJ1.m105495I(Function1.this, obj);
                return m105495I;
            }
        });
        final C2726f c2726f = new C2726f(itemLease);
        Observable observeOn6 = switchMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: vJ1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105494J;
                m105494J = GJ1.m105494J(Function1.this, obj);
                return m105494J;
            }
        }).observeOn(C23454a.m33087a());
        final C2728g c2728g = new C2728g();
        Observable retry2 = observeOn6.doOnError(new InterfaceC23484g() { // from class: yJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105493K(Function1.this, obj);
            }
        }).retry(this.f11565h.m82623f8().m73665a().getLeaseConfig().getLeaseTypes().getHelmet().getReturnLeaseAssetMaxUploadAttempts());
        Intrinsics.checkNotNullExpressionValue(retry2, "private fun initializeUI…y.RESULT_OK)\n      })\n  }");
        Object m33094as4 = retry2.m33094as(AutoDispose.m45239a(this.f11560c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2729h c2729h = C2729h.f11588g;
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: zJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105492L(Function1.this, obj);
            }
        };
        final C2730i c2730i = new C2730i();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: AJ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GJ1.m105491M(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LGJ1$a;", "", "Landroid/net/Uri;", "uri", "", "autoCaptured", "", "", "autoScannedCodes", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "()Landroid/net/Uri;", "b", "Z", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Landroid/net/Uri;ZLjava/util/List;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: GJ1$a */
    /* loaded from: classes3.dex */
    public static final class C2720a {

        /* renamed from: a */
        public final Uri f11576a;

        /* renamed from: b */
        public final boolean f11577b;

        /* renamed from: c */
        public final List<String> f11578c;

        public C2720a(Uri uri, boolean z, List<String> autoScannedCodes) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(autoScannedCodes, "autoScannedCodes");
            this.f11576a = uri;
            this.f11577b = z;
            this.f11578c = autoScannedCodes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C2720a copy$default(C2720a c2720a, Uri uri, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = c2720a.f11576a;
            }
            if ((i & 2) != 0) {
                z = c2720a.f11577b;
            }
            if ((i & 4) != 0) {
                list = c2720a.f11578c;
            }
            return c2720a.m105448a(uri, z, list);
        }

        /* renamed from: a */
        public final C2720a m105448a(Uri uri, boolean z, List<String> autoScannedCodes) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(autoScannedCodes, "autoScannedCodes");
            return new C2720a(uri, z, autoScannedCodes);
        }

        /* renamed from: b */
        public final boolean m105447b() {
            return this.f11577b;
        }

        /* renamed from: c */
        public final List<String> m105446c() {
            return this.f11578c;
        }

        /* renamed from: d */
        public final Uri m105445d() {
            return this.f11576a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2720a) {
                C2720a c2720a = (C2720a) obj;
                return Intrinsics.areEqual(this.f11576a, c2720a.f11576a) && this.f11577b == c2720a.f11577b && Intrinsics.areEqual(this.f11578c, c2720a.f11578c);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f11576a.hashCode() * 31;
            boolean z = this.f11577b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode + i) * 31) + this.f11578c.hashCode();
        }

        public String toString() {
            Uri uri = this.f11576a;
            boolean z = this.f11577b;
            List<String> list = this.f11578c;
            return "CapturedImage(uri=" + uri + ", autoCaptured=" + z + ", autoScannedCodes=" + list + ")";
        }

        public /* synthetic */ C2720a(Uri uri, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, z, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
        }
    }
}
