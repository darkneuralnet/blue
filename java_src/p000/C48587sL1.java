package p000;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Folder;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.UploadKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.HelmetSelfieConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Currency;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.C48587sL1;
import p000.H31;
import p000.InterfaceC40476ef6;
import p000.InterfaceC41921h56;
import p000.S74;
@Metadata(m28433d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 `2\u00020\u0001:\u0002\u001c Bi\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G¢\u0006\u0004\bc\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002JG\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0002J.\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010TR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006e"}, m28432d2 = {"LsL1;", "", "", "z", "", "u", "", "throwable", "S", "resolution", "LEL1;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "skippedSelfie", "blockedRide", "imageUrl", "T", "(Ljava/lang/String;LEL1;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "v", "Lco/bird/android/model/wire/WireBird;", "bird", "sessionId", "rideId", "isPostRide", "M", "O", "N", "LBL1;", C17296a.f69688o, "LBL1;", "helmetSelfieManager", "LAL1;", "b", "LAL1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lgl;", "e", "Lgl;", "appPreference", "LRh6;", "f", "LRh6;", "userStream", "LOh;", "g", "LOh;", "appBuildConfig", "LTq4;", "h", "LTq4;", "reactiveConfig", "LEa;", "i", "LEa;", "analyticsManager", "Lef6;", "j", "Lef6;", "uploadManager", "LDQ3;", "k", "LDQ3;", "permissionManager", "LV74;", "l", "LV74;", "promoManager", "La94;", "Lco/bird/android/buava/Optional;", "LsL1$a;", "m", "La94;", "capturedFileRelay", "n", "Lco/bird/android/model/wire/WireBird;", "o", "Ljava/lang/String;", "p", "Z", "q", "Ljava/util/concurrent/atomic/AtomicBoolean;", "r", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasSubmittedOrSkipped", "Lco/bird/android/model/wire/configs/Config;", "t", "()Lco/bird/android/model/wire/configs/Config;", "config", "s", "()Z", "canSkip", "<init>", "(LBL1;LAL1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LRh6;LOh;LTq4;LEa;Lef6;LDQ3;LV74;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetSelfieConfirmationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetSelfieConfirmationPresenter.kt\nco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n237#2:410\n180#2:411\n180#2:412\n180#2:413\n180#2:414\n180#2:415\n237#2:417\n1#3:416\n*S KotlinDebug\n*F\n+ 1 HelmetSelfieConfirmationPresenter.kt\nco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationPresenter\n*L\n126#1:410\n133#1:411\n186#1:412\n199#1:413\n210#1:414\n311#1:415\n400#1:417\n*E\n"})
/* renamed from: sL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48587sL1 {

    /* renamed from: s */
    public static final C28265b f108610s = new C28265b(null);

    /* renamed from: a */
    public final BL1 f108611a;

    /* renamed from: b */
    public final AL1 f108612b;

    /* renamed from: c */
    public final ScopeProvider f108613c;

    /* renamed from: d */
    public final InterfaceC40099e13 f108614d;

    /* renamed from: e */
    public final C22454gl f108615e;

    /* renamed from: f */
    public final InterfaceC35660Rh6 f108616f;

    /* renamed from: g */
    public final InterfaceC6097Oh f108617g;

    /* renamed from: h */
    public final C36207Tq4 f108618h;

    /* renamed from: i */
    public final InterfaceC1880Ea f108619i;

    /* renamed from: j */
    public final InterfaceC40476ef6 f108620j;

    /* renamed from: k */
    public final DQ3 f108621k;

    /* renamed from: l */
    public final V74 f108622l;

    /* renamed from: m */
    public final C37791a94<Optional<C28264a>> f108623m;

    /* renamed from: n */
    public WireBird f108624n;

    /* renamed from: o */
    public String f108625o;

    /* renamed from: p */
    public boolean f108626p;

    /* renamed from: q */
    public String f108627q;

    /* renamed from: r */
    public AtomicBoolean f108628r;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LsL1$a;", "", "Landroid/net/Uri;", "uri", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sL1$a */
    /* loaded from: classes3.dex */
    public static final class C28264a {

        /* renamed from: a */
        public final Uri f108629a;

        public C28264a(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f108629a = uri;
        }

        public static /* synthetic */ C28264a copy$default(C28264a c28264a, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = c28264a.f108629a;
            }
            return c28264a.m14334a(uri);
        }

        /* renamed from: a */
        public final C28264a m14334a(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new C28264a(uri);
        }

        /* renamed from: b */
        public final Uri m14333b() {
            return this.f108629a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28264a) && Intrinsics.areEqual(this.f108629a, ((C28264a) obj).f108629a);
        }

        public int hashCode() {
            return this.f108629a.hashCode();
        }

        public String toString() {
            Uri uri = this.f108629a;
            return "CapturedImage(uri=" + uri + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m28432d2 = {"LsL1$b;", "", "", "CAPTURED_IMAGE_EXTENSION", "Ljava/lang/String;", "CAPTURED_IMAGE_PREFIX", "RESOLUTION_DISMISSED", "RESOLUTION_SELFIE_FAILED", "RESOLUTION_SELFIE_SUCCESS", "RESOLUTION_SKIPPED", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sL1$b */
    /* loaded from: classes3.dex */
    public static final class C28265b {
        public /* synthetic */ C28265b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28265b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$c */
    /* loaded from: classes3.dex */
    public static final class C28266c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28266c f108630g = new C28266c();

        public C28266c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "error while handling coupon earned", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$d */
    /* loaded from: classes3.dex */
    public static final class C28267d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28267d f108631g = new C28267d();

        public C28267d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while handling coupon earned in helmet selfie flow", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sL1$e */
    /* loaded from: classes3.dex */
    public static final class C28268e extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Uri>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: sL1$e$a */
        /* loaded from: classes3.dex */
        public static final class C28269a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48587sL1 f108633g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28269a(C48587sL1 c48587sL1) {
                super(1);
                this.f108633g = c48587sL1;
            }

            /* renamed from: a */
            public final void m14329a(InterfaceC23465c interfaceC23465c) {
                S74.C7343a.showProgress$default(this.f108633g.f108612b, true, 0, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m14329a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Landroid/net/Uri;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: sL1$e$b */
        /* loaded from: classes3.dex */
        public static final class C28270b extends Lambda implements Function2<Uri, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48587sL1 f108634g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28270b(C48587sL1 c48587sL1) {
                super(2);
                this.f108634g = c48587sL1;
            }

            /* renamed from: a */
            public final void m14328a(Uri uri, Throwable th) {
                S74.C7343a.showProgress$default(this.f108634g.f108612b, false, 0, 2, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri, Throwable th) {
                m14328a(uri, th);
                return Unit.INSTANCE;
            }
        }

        public C28268e() {
            super(1);
        }

        /* renamed from: c */
        public static final void m14330c(Function2 tmp0, Object obj, Object obj2) {
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
            AbstractC23442F<Uri> m33152N = C48587sL1.this.f108612b.m115904Vl(C48587sL1.this.f108611a.mo55716a(), "cap", ".jpg").m33152N(C23454a.m33087a());
            final C28269a c28269a = new C28269a(C48587sL1.this);
            AbstractC23442F<Uri> m33102v = m33152N.m33102v(new InterfaceC23484g() { // from class: tL1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48587sL1.C28268e.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C28270b c28270b = new C28270b(C48587sL1.this);
            return m33102v.m33104u(new InterfaceC23479b() { // from class: uL1
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    C48587sL1.C28268e.m14330c(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sL1$f */
    /* loaded from: classes3.dex */
    public static final class C28271f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "url", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: sL1$f$a */
        /* loaded from: classes3.dex */
        public static final class C28272a extends Lambda implements Function1<String, InterfaceC23447K<? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ C48587sL1 f108636g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LEL1;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LEL1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: sL1$f$a$a */
            /* loaded from: classes3.dex */
            public static final class C28273a extends Lambda implements Function1<EL1, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C48587sL1 f108637g;

                /* renamed from: h */
                public final /* synthetic */ String f108638h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28273a(C48587sL1 c48587sL1, String str) {
                    super(1);
                    this.f108637g = c48587sL1;
                    this.f108638h = str;
                }

                /* renamed from: a */
                public final void m14321a(EL1 el1) {
                    if (this.f108637g.f108626p) {
                        BL1 bl1 = this.f108637g.f108611a;
                        WireBird wireBird = this.f108637g.f108624n;
                        if (wireBird == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("bird");
                            wireBird = null;
                        }
                        bl1.mo55713e(wireBird.getId());
                    }
                    int i = 0;
                    C41318g46.m40163a("received result for helmet selfie: " + el1, new Object[0]);
                    if (el1.m109165g()) {
                        this.f108637g.m14362T("selfie_success", el1, Boolean.FALSE, Boolean.valueOf(!el1.m109165g()), this.f108638h);
                        this.f108637g.f108628r.set(true);
                        Integer m109170b = el1.m109170b();
                        if (m109170b != null) {
                            i = m109170b.intValue();
                        }
                        if (i > 0) {
                            this.f108637g.m14339v();
                            return;
                        } else {
                            this.f108637g.f108614d.mo37050b1(-1);
                            return;
                        }
                    }
                    this.f108637g.f108612b.m115908Rl(null, this.f108637g.m14342s());
                    this.f108637g.m14363S(new Throwable("Helmet selfie was not detected on head in call to API: (" + el1 + ")"));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EL1 el1) {
                    m14321a(el1);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: sL1$f$a$b */
            /* loaded from: classes3.dex */
            public static final class C28274b extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C48587sL1 f108639g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28274b(C48587sL1 c48587sL1) {
                    super(1);
                    this.f108639g = c48587sL1;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable it) {
                    C41318g46.m40158f(it, "Error while uploading helmet selfie asset", new Object[0]);
                    this.f108639g.f108612b.errorGeneric();
                    this.f108639g.f108612b.m115908Rl(null, this.f108639g.m14342s());
                    C48587sL1 c48587sL1 = this.f108639g;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    c48587sL1.m14363S(it);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LEL1;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LEL1;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: sL1$f$a$c */
            /* loaded from: classes3.dex */
            public static final class C28275c extends Lambda implements Function1<EL1, InterfaceC23447K<? extends DialogResponse>> {

                /* renamed from: g */
                public final /* synthetic */ C48587sL1 f108640g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28275c(C48587sL1 c48587sL1) {
                    super(1);
                    this.f108640g = c48587sL1;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23447K<? extends DialogResponse> invoke(EL1 result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (!result.m109165g()) {
                        return H31.C3014a.birdDialog$default(this.f108640g.f108612b, C47582qe6.f105568d, false, false, 6, null);
                    }
                    AbstractC23442F m33158H = AbstractC23442F.m33158H(DialogResponse.OK);
                    Intrinsics.checkNotNullExpressionValue(m33158H, "{\n                  Sing…nse.OK)\n                }");
                    return m33158H;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28272a(C48587sL1 c48587sL1) {
                super(1);
                this.f108636g = c48587sL1;
            }

            /* renamed from: d */
            public static final void m14323d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: e */
            public static final InterfaceC23447K m14322e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23447K) tmp0.invoke(obj);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends DialogResponse> invoke(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                C41318g46.m40163a("uploaded helmet selfie to " + url, new Object[0]);
                HelmetSelfieConfig helmetSelfie = this.f108636g.m14341t().getRideConfig().getHelmetSelfie();
                WireBird wireBird = null;
                if ((helmetSelfie != null ? helmetSelfie.getRequiredPreRideDetectionConfidence() : null) == null && !this.f108636g.f108626p) {
                    C41318g46.m40163a("no need to detect helmet confidence, just continuing with ride start", new Object[0]);
                    if (!this.f108636g.f108626p) {
                        BL1 bl1 = this.f108636g.f108611a;
                        WireBird wireBird2 = this.f108636g.f108624n;
                        if (wireBird2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("bird");
                        } else {
                            wireBird = wireBird2;
                        }
                        bl1.mo55712f(wireBird.getId());
                    }
                    C48587sL1 c48587sL1 = this.f108636g;
                    Boolean bool = Boolean.FALSE;
                    C48587sL1.m14361U(c48587sL1, "selfie_success", null, bool, bool, null, 16, null);
                    this.f108636g.f108628r.set(true);
                    this.f108636g.f108614d.mo37050b1(-1);
                    return AbstractC23442F.m33158H(DialogResponse.OK);
                }
                BL1 bl12 = this.f108636g.f108611a;
                WireBird wireBird3 = this.f108636g.f108624n;
                if (wireBird3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                } else {
                    wireBird = wireBird3;
                }
                AbstractC23442F<EL1> m33152N = bl12.mo55714d(wireBird, url, this.f108636g.f108627q).m33152N(C23454a.m33087a());
                final C28273a c28273a = new C28273a(this.f108636g, url);
                AbstractC23442F<EL1> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: wL1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C48587sL1.C28271f.C28272a.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C28274b c28274b = new C28274b(this.f108636g);
                AbstractC23442F<EL1> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: xL1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C48587sL1.C28271f.C28272a.m14323d(Function1.this, obj);
                    }
                });
                final C28275c c28275c = new C28275c(this.f108636g);
                return m33106t.m33165A(new InterfaceC23492o() { // from class: yL1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m14322e;
                        m14322e = C48587sL1.C28271f.C28272a.m14322e(Function1.this, obj);
                        return m14322e;
                    }
                });
            }
        }

        public C28271f() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Uri m14333b;
            Intrinsics.checkNotNullParameter(it, "it");
            C28264a c28264a = (C28264a) ((Optional) C48587sL1.this.f108623m.getValue()).m59035e();
            if (c28264a != null && (m14333b = c28264a.m14333b()) != null) {
                InterfaceC40476ef6 interfaceC40476ef6 = C48587sL1.this.f108620j;
                String path = m14333b.getPath();
                Intrinsics.checkNotNull(path);
                AbstractC23442F uploadContent$default = InterfaceC40476ef6.C20086a.uploadContent$default(interfaceC40476ef6, new File(path), ContentKind.JPG, UploadKind.HELMET_SELFIES, Folder.HELMET_SELFIES, (String) null, true, false, 80, (Object) null);
                final C28272a c28272a = new C28272a(C48587sL1.this);
                return uploadContent$default.m33165A(new InterfaceC23492o() { // from class: vL1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K invoke$lambda$0;
                        invoke$lambda$0 = C48587sL1.C28271f.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return AbstractC23442F.m33100x(new FileNotFoundException("captured file uri was not found while attempting to capture image"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sL1$g */
    /* loaded from: classes3.dex */
    public static final class C28276g extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C28276g f108641g = new C28276g();

        public C28276g() {
            super(1);
        }

        /* renamed from: a */
        public final void m14319a(DialogResponse dialogResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m14319a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$h */
    /* loaded from: classes3.dex */
    public static final class C28277h extends Lambda implements Function1<Throwable, Unit> {
        public C28277h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C41318g46.m40158f(it, "Error while uploading helmet selfie asset", new Object[0]);
            C48587sL1.this.f108612b.errorGeneric();
            C48587sL1.this.f108612b.m115908Rl(null, C48587sL1.this.m14342s());
            C48587sL1 c48587sL1 = C48587sL1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48587sL1.m14363S(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$i */
    /* loaded from: classes3.dex */
    public static final class C28278i extends Lambda implements Function1<Throwable, Unit> {
        public C28278i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C48587sL1 c48587sL1 = C48587sL1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48587sL1.m14363S(it);
            C48587sL1.this.f108612b.errorGeneric();
            InterfaceC1880Ea interfaceC1880Ea = C48587sL1.this.f108619i;
            String localizedMessage = it.getLocalizedMessage();
            interfaceC1880Ea.mo55905y(new C44502lS3(null, null, null, "helmet_selfie_take_photo", localizedMessage == null ? it.toString() : localizedMessage, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "fileUri", "", C17296a.f69688o, "(Landroid/net/Uri;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sL1$j */
    /* loaded from: classes3.dex */
    public static final class C28279j extends Lambda implements Function1<Uri, Unit> {
        public C28279j() {
            super(1);
        }

        /* renamed from: a */
        public final void m14318a(Uri fileUri) {
            C37791a94 c37791a94 = C48587sL1.this.f108623m;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(fileUri, "fileUri");
            c37791a94.accept(c14443a.m59032c(new C28264a(fileUri)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            m14318a(uri);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$k */
    /* loaded from: classes3.dex */
    public static final class C28280k extends Lambda implements Function1<Throwable, Unit> {
        public C28280k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C48587sL1 c48587sL1 = C48587sL1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48587sL1.m14363S(it);
            C41318g46.m40158f(it, "Error handling capture image click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$l */
    /* loaded from: classes3.dex */
    public static final class C28281l extends Lambda implements Function1<Unit, Unit> {
        public C28281l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C48587sL1.this.f108623m.accept(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$m */
    /* loaded from: classes3.dex */
    public static final class C28282m extends Lambda implements Function1<Throwable, Unit> {
        public C28282m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C48587sL1 c48587sL1 = C48587sL1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48587sL1.m14363S(it);
            C41318g46.m40158f(it, "Error handling retake photo click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$n */
    /* loaded from: classes3.dex */
    public static final class C28283n extends Lambda implements Function1<Unit, Unit> {
        public C28283n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WireBird wireBird = C48587sL1.this.f108624n;
            WireBird wireBird2 = null;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            C41318g46.m40163a("skipping helmet selfie photo check for bird " + wireBird.getId(), new Object[0]);
            if (!C48587sL1.this.f108626p) {
                BL1 bl1 = C48587sL1.this.f108611a;
                WireBird wireBird3 = C48587sL1.this.f108624n;
                if (wireBird3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                } else {
                    wireBird2 = wireBird3;
                }
                bl1.mo55712f(wireBird2.getId());
            }
            C48587sL1.m14361U(C48587sL1.this, "skipped", null, Boolean.TRUE, Boolean.FALSE, null, 16, null);
            C48587sL1.this.f108628r.set(true);
            C48587sL1.this.f108614d.mo37050b1(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$o */
    /* loaded from: classes3.dex */
    public static final class C28284o extends Lambda implements Function1<Throwable, Unit> {
        public C28284o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C48587sL1 c48587sL1 = C48587sL1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48587sL1.m14363S(it);
            C41318g46.m40158f(it, "Error handling skip photo click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$p */
    /* loaded from: classes3.dex */
    public static final class C28285p extends Lambda implements Function1<Unit, Unit> {
        public C28285p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC41921h56.C22549a.topToast$default(C48587sL1.this.f108612b, C45871nl4.uploading_photo, (EnumC40735f56) null, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$q */
    /* loaded from: classes3.dex */
    public static final class C28286q extends Lambda implements Function1<Throwable, Unit> {
        public C28286q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C48587sL1 c48587sL1 = C48587sL1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48587sL1.m14363S(it);
            C41318g46.m40158f(it, "Error while prompting for camera permission in helmet selfie confirmation flow", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LsL1$a;", "kotlin.jvm.PlatformType", "capturedImage", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sL1$r */
    /* loaded from: classes3.dex */
    public static final class C28287r extends Lambda implements Function1<Optional<C28264a>, Unit> {
        public C28287r() {
            super(1);
        }

        /* renamed from: a */
        public final void m14317a(Optional<C28264a> optional) {
            Uri uri;
            C28264a m59035e = optional.m59035e();
            if (m59035e != null) {
                uri = m59035e.m14333b();
            } else {
                uri = null;
            }
            C48587sL1.this.f108612b.m115908Rl(uri, C48587sL1.this.m14342s());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C28264a> optional) {
            m14317a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sL1$s */
    /* loaded from: classes3.dex */
    public static final class C28288s extends Lambda implements Function1<Throwable, Unit> {
        public C28288s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C48587sL1 c48587sL1 = C48587sL1.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c48587sL1.m14363S(it);
            C41318g46.m40158f(it, "Error processing captured image", new Object[0]);
        }
    }

    public C48587sL1(BL1 helmetSelfieManager, AL1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, InterfaceC35660Rh6 userStream, InterfaceC6097Oh appBuildConfig, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC40476ef6 uploadManager, DQ3 permissionManager, V74 promoManager) {
        Intrinsics.checkNotNullParameter(helmetSelfieManager, "helmetSelfieManager");
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
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        this.f108611a = helmetSelfieManager;
        this.f108612b = ui;
        this.f108613c = scopeProvider;
        this.f108614d = navigator;
        this.f108615e = appPreference;
        this.f108616f = userStream;
        this.f108617g = appBuildConfig;
        this.f108618h = reactiveConfig;
        this.f108619i = analyticsManager;
        this.f108620j = uploadManager;
        this.f108621k = permissionManager;
        this.f108622l = promoManager;
        this.f108623m = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        this.f108628r = new AtomicBoolean(false);
    }

    /* renamed from: A */
    public static final void m14381A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m14380B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m14379C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m14378D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC23447K m14377E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m14376F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m14375G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23447K m14374H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m14373I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m14372J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m14371K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m14370L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m14366P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m14365Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m14364R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static /* synthetic */ void m14361U(C48587sL1 c48587sL1, String str, EL1 el1, Boolean bool, Boolean bool2, String str2, int i, Object obj) {
        c48587sL1.m14362T(str, (i & 2) != 0 ? null : el1, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str2);
    }

    public static /* synthetic */ void onCreate$default(C48587sL1 c48587sL1, WireBird wireBird, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c48587sL1.m14369M(wireBird, str, str2, z);
    }

    /* renamed from: w */
    public static final void m14338w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m14337x(C48587sL1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f108614d.mo37050b1(-1);
    }

    /* renamed from: y */
    public static final void m14336y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public final void m14369M(WireBird bird, String sessionId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f108624n = bird;
        this.f108625o = sessionId;
        this.f108627q = str;
        this.f108626p = z;
        m14335z();
    }

    /* renamed from: N */
    public final void m14368N() {
        if (!this.f108628r.get()) {
            m14361U(this, "dismissed", null, Boolean.FALSE, Boolean.TRUE, null, 16, null);
        }
    }

    /* renamed from: O */
    public final void m14367O() {
        Integer num;
        Integer num2;
        Double d;
        String str;
        Float requiredPreRideDetectionConfidence;
        this.f108628r.set(false);
        Config m14341t = m14341t();
        InterfaceC1880Ea interfaceC1880Ea = this.f108619i;
        WireBird wireBird = this.f108624n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        String id = wireBird.getId();
        String currency = m14341t.getRideConfig().getCurrency();
        HelmetSelfieConfig helmetSelfie = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie != null) {
            num = helmetSelfie.getIncentiveAmount();
        } else {
            num = null;
        }
        HelmetSelfieConfig helmetSelfie2 = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie2 != null) {
            num2 = helmetSelfie2.getFineAmount();
        } else {
            num2 = null;
        }
        HelmetSelfieConfig helmetSelfie3 = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie3 != null && (requiredPreRideDetectionConfidence = helmetSelfie3.getRequiredPreRideDetectionConfidence()) != null) {
            d = Double.valueOf(requiredPreRideDetectionConfidence.floatValue());
        } else {
            d = null;
        }
        String str2 = this.f108625o;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionId");
            str = null;
        } else {
            str = str2;
        }
        interfaceC1880Ea.mo55905y(new FL1(null, null, null, id, currency, num, num2, d, str, this.f108627q, 7, null));
        DQ3 dq3 = this.f108621k;
        Permission permission = Permission.CAMERA;
        if (dq3.m110496a(permission) != PermissionStatus.GRANTED) {
            AbstractC23442F<FQ3> m110485l = this.f108621k.m110485l(permission);
            final C28286q c28286q = new C28286q();
            AbstractC23461c m33069Q = m110485l.m33106t(new InterfaceC23484g() { // from class: gL1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48587sL1.m14366P(Function1.this, obj);
                }
            }).m33159G().m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "fun onResume() {\n    has…ured image\")\n      })\n  }");
            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f108613c));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
        Observable<Optional<C28264a>> observeOn = this.f108623m.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "capturedFileRelay\n      …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f108613c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28287r c28287r = new C28287r();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: hL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14365Q(Function1.this, obj);
            }
        };
        final C28288s c28288s = new C28288s();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: iL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14364R(Function1.this, obj);
            }
        });
    }

    /* renamed from: S */
    public final void m14363S(Throwable th) {
        String str;
        Integer num;
        Integer num2;
        Float requiredPreRideDetectionConfidence;
        Config m14341t = m14341t();
        InterfaceC1880Ea interfaceC1880Ea = this.f108619i;
        String str2 = this.f108625o;
        Double d = null;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionId");
            str = null;
        } else {
            str = str2;
        }
        WireBird wireBird = this.f108624n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        String id = wireBird.getId();
        String currency = m14341t.getRideConfig().getCurrency();
        HelmetSelfieConfig helmetSelfie = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie != null) {
            num = helmetSelfie.getIncentiveAmount();
        } else {
            num = null;
        }
        HelmetSelfieConfig helmetSelfie2 = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie2 != null) {
            num2 = helmetSelfie2.getFineAmount();
        } else {
            num2 = null;
        }
        HelmetSelfieConfig helmetSelfie3 = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie3 != null && (requiredPreRideDetectionConfidence = helmetSelfie3.getRequiredPreRideDetectionConfidence()) != null) {
            d = Double.valueOf(requiredPreRideDetectionConfidence.floatValue());
        }
        interfaceC1880Ea.mo55905y(new YK1(null, null, null, id, false, false, currency, num, num2, d, null, null, null, null, str, "selfie_failed", this.f108627q, null, 146439, null));
    }

    /* renamed from: T */
    public final void m14362T(String str, EL1 el1, Boolean bool, Boolean bool2, String str2) {
        String str3;
        Integer num;
        Integer num2;
        Double d;
        boolean z;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Float requiredPreRideDetectionConfidence;
        Config m14341t = m14341t();
        InterfaceC1880Ea interfaceC1880Ea = this.f108619i;
        String str4 = this.f108625o;
        String str5 = null;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionId");
            str3 = null;
        } else {
            str3 = str4;
        }
        WireBird wireBird = this.f108624n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        String id = wireBird.getId();
        String currency = m14341t.getRideConfig().getCurrency();
        HelmetSelfieConfig helmetSelfie = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie != null) {
            num = helmetSelfie.getIncentiveAmount();
        } else {
            num = null;
        }
        HelmetSelfieConfig helmetSelfie2 = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie2 != null) {
            num2 = helmetSelfie2.getFineAmount();
        } else {
            num2 = null;
        }
        HelmetSelfieConfig helmetSelfie3 = m14341t.getRideConfig().getHelmetSelfie();
        if (helmetSelfie3 != null && (requiredPreRideDetectionConfidence = helmetSelfie3.getRequiredPreRideDetectionConfidence()) != null) {
            d = Double.valueOf(requiredPreRideDetectionConfidence.floatValue());
        } else {
            d = null;
        }
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        }
        boolean z3 = z2;
        if (el1 != null) {
            d2 = el1.m109169c();
        } else {
            d2 = null;
        }
        if (el1 != null) {
            d3 = el1.m109168d();
        } else {
            d3 = null;
        }
        if (el1 != null) {
            d4 = el1.m109167e();
        } else {
            d4 = null;
        }
        if (el1 != null) {
            d5 = el1.m109166f();
        } else {
            d5 = null;
        }
        String str6 = this.f108627q;
        if (str2 != null) {
            try {
                Uri parse = Uri.parse(str2);
                if (parse != null) {
                    str5 = parse.getLastPathSegment();
                }
            } catch (Throwable unused) {
            }
        }
        interfaceC1880Ea.mo55905y(new YK1(null, null, null, id, z, z3, currency, num, num2, d, d2, d3, d4, d5, str3, str, str6, str5, 7, null));
    }

    /* renamed from: s */
    public final boolean m14342s() {
        int i;
        float f;
        HelmetSelfieConfig helmetSelfie = m14341t().getRideConfig().getHelmetSelfie();
        if (helmetSelfie == null) {
            helmetSelfie = new HelmetSelfieConfig(false, false, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }
        Integer fineAmount = helmetSelfie.getFineAmount();
        if (fineAmount != null) {
            i = fineAmount.intValue();
        } else {
            i = 0;
        }
        if (i > 0) {
            return false;
        }
        Float requiredPreRideDetectionConfidence = helmetSelfie.getRequiredPreRideDetectionConfidence();
        if (requiredPreRideDetectionConfidence != null) {
            f = requiredPreRideDetectionConfidence.floatValue();
        } else {
            f = 0.0f;
        }
        if (f > 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final Config m14341t() {
        C36207Tq4 c36207Tq4 = this.f108618h;
        WireBird wireBird = this.f108624n;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        return C36441Uq4.m80769c(c36207Tq4, wireBird);
    }

    /* renamed from: u */
    public final String m14340u() {
        int i;
        float f;
        int i2;
        Integer incentiveAmount;
        Integer fineAmount;
        Currency m25591o = C45097mS5.m25591o(m14341t().getRideConfig().getCurrency());
        HelmetSelfieConfig helmetSelfie = m14341t().getRideConfig().getHelmetSelfie();
        if (helmetSelfie == null) {
            helmetSelfie = new HelmetSelfieConfig(false, false, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }
        Integer fineAmount2 = helmetSelfie.getFineAmount();
        if (fineAmount2 != null) {
            i = fineAmount2.intValue();
        } else {
            i = 0;
        }
        Long l = null;
        if (i > 0) {
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            if (helmetSelfie.getFineAmount() != null) {
                l = Long.valueOf(fineAmount.intValue());
            }
            Intrinsics.checkNotNull(l);
            String m4408d = c51916xx1.m4408d(l.longValue(), m25591o, EnumC36501Ux1.SHOW_IF_NON_ZERO);
            return this.f108612b.getString(C45871nl4.helmet_selfie_requirement_warning, new Object[0]) + "\n\n" + this.f108612b.getString(C45871nl4.helmet_selfie_requirement_fine, m4408d);
        }
        Float requiredPreRideDetectionConfidence = helmetSelfie.getRequiredPreRideDetectionConfidence();
        if (requiredPreRideDetectionConfidence != null) {
            f = requiredPreRideDetectionConfidence.floatValue();
        } else {
            f = 0.0f;
        }
        if (f > 0.0f && !this.f108626p) {
            return this.f108612b.getString(C45871nl4.helmet_selfie_requirement_warning, new Object[0]);
        }
        Integer incentiveAmount2 = helmetSelfie.getIncentiveAmount();
        if (incentiveAmount2 != null) {
            i2 = incentiveAmount2.intValue();
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            C51916xx1 c51916xx12 = C51916xx1.f118396a;
            if (helmetSelfie.getIncentiveAmount() != null) {
                l = Long.valueOf(incentiveAmount.intValue());
            }
            Intrinsics.checkNotNull(l);
            return this.f108612b.getString(C45871nl4.helmet_selfie_incentive_description, c51916xx12.m4408d(l.longValue(), m25591o, EnumC36501Ux1.SHOW_IF_NON_ZERO));
        }
        return this.f108612b.getString(C45871nl4.helmet_selfie_requirement_warning, new Object[0]);
    }

    /* renamed from: v */
    public final void m14339v() {
        AbstractC23461c m33159G = this.f108622l.mo27795f().m33069Q().m33042m(this.f108612b.birdDialog(KD0.f19289d, true, false)).m33159G();
        final C28266c c28266c = C28266c.f108630g;
        AbstractC23461c m33069Q = m33159G.m33084B(new InterfaceC23484g() { // from class: aL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14338w(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "promoManager.refreshCoup…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f108613c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: jL1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C48587sL1.m14337x(C48587sL1.this);
            }
        };
        final C28267d c28267d = C28267d.f108631g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: kL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14336y(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public final void m14335z() {
        this.f108612b.m115906Tl(m14340u());
        this.f108612b.m115902Xl(true);
        this.f108612b.m115908Rl(null, m14342s());
        Observable<Unit> m115911G2 = this.f108612b.m115911G2();
        final C28268e c28268e = new C28268e();
        Observable observeOn = m115911G2.flatMapSingle(new InterfaceC23492o() { // from class: lL1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m14374H;
                m14374H = C48587sL1.m14374H(Function1.this, obj);
                return m14374H;
            }
        }).observeOn(C23454a.m33087a());
        final C28278i c28278i = new C28278i();
        Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: oL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14373I(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun initializeUI…ackError(it)\n      })\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f108613c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28279j c28279j = new C28279j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: pL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14372J(Function1.this, obj);
            }
        };
        final C28280k c28280k = new C28280k();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14371K(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f108612b.m115907Sl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.retakePhotoClicks()\n …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f108613c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28281l c28281l = new C28281l();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: rL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14370L(Function1.this, obj);
            }
        };
        final C28282m c28282m = new C28282m();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: bL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14381A(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f108612b.m115905Ul().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.skipPhotoClicks()\n   …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f108613c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28283n c28283n = new C28283n();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: cL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14380B(Function1.this, obj);
            }
        };
        final C28284o c28284o = new C28284o();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: dL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14379C(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f108612b.m115909Ql().observeOn(C23454a.m33087a());
        final C28285p c28285p = new C28285p();
        Observable<Unit> observeOn5 = observeOn4.doOnNext(new InterfaceC23484g() { // from class: eL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14378D(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C28271f c28271f = new C28271f();
        Observable retry2 = observeOn5.flatMapSingle(new InterfaceC23492o() { // from class: fL1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m14377E;
                m14377E = C48587sL1.m14377E(Function1.this, obj);
                return m14377E;
            }
        }).observeOn(C23454a.m33087a()).retry(2L);
        Intrinsics.checkNotNullExpressionValue(retry2, "private fun initializeUI…ackError(it)\n      })\n  }");
        Object m33094as4 = retry2.m33094as(AutoDispose.m45239a(this.f108613c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28276g c28276g = C28276g.f108641g;
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: mL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14376F(Function1.this, obj);
            }
        };
        final C28277h c28277h = new C28277h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: nL1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48587sL1.m14375G(Function1.this, obj);
            }
        });
    }
}
