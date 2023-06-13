package p000;

import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.android.model.exception.MissingKeyException;
import co.bird.api.request.BraintreeTokenResponse;
import co.bird.api.response.AutoReloadFromPreloadConfig;
import co.bird.api.response.PreloadAndMaybeConfigureAutoReloadResponse;
import co.bird.api.response.PreloadConfig;
import co.bird.api.response.ReloadConfigResponse;
import co.bird.api.response.ReloadOption;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.InterfaceC42586iD1;
@Metadata(m28433d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 h2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002\u0016 Ba\b\u0007\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L¢\u0006\u0004\bf\u0010gJ\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0006\u0010\u0015\u001a\u00020\bJ\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010\\\u001a\u0010\u0012\f\u0012\n Y*\u0004\u0018\u00010\b0\b0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010QR\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006k²\u0006\f\u0010j\u001a\u00020i8\nX\u008a\u0084\u0002"}, m28432d2 = {"LJ14;", "Lf1;", "LK14;", "LL14;", "LZg3;", "LTx0;", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", "", "b0", "P", "U", "Q", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "O", "", CoreConstants.CONTEXT_SCOPE_VALUE, "f0", "renderer", "F", "X", C17296a.f69688o, "", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "R", "", "", "metadata", "Lio/reactivex/p;", "b", "", "success", "c", "LEa;", "e", "LEa;", "analyticsManager", "Lw10;", "f", "Lw10;", "brainTreeManager", "Le13;", "g", "Le13;", "navigator", "LiD1;", "h", "LiD1;", "googlePayManager", "LAM3;", "i", "LAM3;", "paymentManagerV2", "LVM3;", "j", "LVM3;", "paymentManagerV3", "LzN3;", "k", "LzN3;", "paymentMethodManager", "Lgl;", "l", "Lgl;", "preference", "LTq4;", "m", "LTq4;", "reactiveConfig", "Llh6;", "n", "Llh6;", "userManager", "La14;", "o", "La14;", "delegate", "p", "Ljava/lang/String;", "optionIdSelected", "Lco/bird/android/buava/Optional;", "LS04;", "q", "Lco/bird/android/buava/Optional;", "currentOptionModelSelected", "Lma4;", "kotlin.jvm.PlatformType", "r", "Lma4;", "continueSubject", "s", "Z", "hasCalledShownEvent", "t", "contextForAnalytics", "Li04;", "u", "Li04;", "latestPreloadOptionsAvailable", "<init>", "(LEa;Lw10;Le13;LiD1;LAM3;LVM3;LzN3;Lgl;LTq4;Llh6;La14;)V", "v", "Lco/bird/api/response/ReloadOption;", "option", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,489:1\n61#2,2:490\n180#3:492\n180#3:493\n180#3:494\n180#3:495\n180#3:496\n180#3:497\n237#3:498\n237#3:499\n199#3:500\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter\n*L\n104#1:490,2\n126#1:492\n194#1:493\n245#1:494\n262#1:495\n270#1:496\n276#1:497\n328#1:498\n364#1:499\n403#1:500\n*E\n"})
/* renamed from: J14 */
/* loaded from: classes3.dex */
public final class J14 extends AbstractC20169f1<K14, L14> implements InterfaceC37520Zg3, InterfaceC36266Tx0 {

    /* renamed from: v */
    public static final C3840a f16620v = new C3840a(null);

    /* renamed from: e */
    public final InterfaceC1880Ea f16621e;

    /* renamed from: f */
    public final InterfaceC50768w10 f16622f;

    /* renamed from: g */
    public final InterfaceC40099e13 f16623g;

    /* renamed from: h */
    public final InterfaceC42586iD1 f16624h;

    /* renamed from: i */
    public final AM3 f16625i;

    /* renamed from: j */
    public final VM3 f16626j;

    /* renamed from: k */
    public final InterfaceC52757zN3 f16627k;

    /* renamed from: l */
    public final C22454gl f16628l;

    /* renamed from: m */
    public final C36207Tq4 f16629m;

    /* renamed from: n */
    public final InterfaceC44647lh6 f16630n;

    /* renamed from: o */
    public final InterfaceC37711a14 f16631o;

    /* renamed from: p */
    public String f16632p;

    /* renamed from: q */
    public Optional<S04> f16633q;

    /* renamed from: r */
    public final C45168ma4<Unit> f16634r;

    /* renamed from: s */
    public boolean f16635s;

    /* renamed from: t */
    public String f16636t;

    /* renamed from: u */
    public C42462i04 f16637u;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"LJ14$a;", "", "", "KEY_AUTO_RELOAD_TOGGLED", "Ljava/lang/String;", "KEY_OPTION_ID_SELECTED", "PAYMENT_TERMS_URL_FALLBACK", "PREFIX_PRELOAD_OPTION", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: J14$a */
    /* loaded from: classes3.dex */
    public static final class C3840a {
        public /* synthetic */ C3840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3840a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0082\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0004B3\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"LJ14$b;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", C17296a.f69688o, "", "b", "LS04;", "c", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/buava/Optional;", "f", "()Lco/bird/android/buava/Optional;", "reloadOptional", "Z", "getIncludePayPerRide", "()Z", "includePayPerRide", "e", "optionModelSelectedOptional", "getIncludeAutoReloadSection", "includeAutoReloadSection", "<init>", "(Lco/bird/android/buava/Optional;ZLco/bird/android/buava/Optional;Z)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: J14$b */
    /* loaded from: classes3.dex */
    public static final class C3841b {

        /* renamed from: e */
        public static final C3842a f16638e = new C3842a(null);

        /* renamed from: a */
        public final Optional<ReloadConfigResponse> f16639a;

        /* renamed from: b */
        public final boolean f16640b;

        /* renamed from: c */
        public final Optional<S04> f16641c;

        /* renamed from: d */
        public final boolean f16642d;

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\t\u001a\u00020\u0005¨\u0006\u000e"}, m28432d2 = {"LJ14$b$a;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "reloadOptional", "", "includePayPerRide", "LS04;", "optionModelSelectedOptional", "includeAutoReloadSection", "LJ14$b;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: J14$b$a */
        /* loaded from: classes3.dex */
        public static final class C3842a {
            public /* synthetic */ C3842a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C3841b m101310a(Optional<ReloadConfigResponse> reloadOptional, boolean z, Optional<S04> optionModelSelectedOptional, boolean z2) {
                Intrinsics.checkNotNullParameter(reloadOptional, "reloadOptional");
                Intrinsics.checkNotNullParameter(optionModelSelectedOptional, "optionModelSelectedOptional");
                return new C3841b(reloadOptional, z, optionModelSelectedOptional, z2);
            }

            private C3842a() {
            }
        }

        public C3841b(Optional<ReloadConfigResponse> reloadOptional, boolean z, Optional<S04> optionModelSelectedOptional, boolean z2) {
            Intrinsics.checkNotNullParameter(reloadOptional, "reloadOptional");
            Intrinsics.checkNotNullParameter(optionModelSelectedOptional, "optionModelSelectedOptional");
            this.f16639a = reloadOptional;
            this.f16640b = z;
            this.f16641c = optionModelSelectedOptional;
            this.f16642d = z2;
        }

        /* renamed from: a */
        public final Optional<ReloadConfigResponse> m101316a() {
            return this.f16639a;
        }

        /* renamed from: b */
        public final boolean m101315b() {
            return this.f16640b;
        }

        /* renamed from: c */
        public final Optional<S04> m101314c() {
            return this.f16641c;
        }

        /* renamed from: d */
        public final boolean m101313d() {
            return this.f16642d;
        }

        /* renamed from: e */
        public final Optional<S04> m101312e() {
            return this.f16641c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3841b) {
                C3841b c3841b = (C3841b) obj;
                return Intrinsics.areEqual(this.f16639a, c3841b.f16639a) && this.f16640b == c3841b.f16640b && Intrinsics.areEqual(this.f16641c, c3841b.f16641c) && this.f16642d == c3841b.f16642d;
            }
            return false;
        }

        /* renamed from: f */
        public final Optional<ReloadConfigResponse> m101311f() {
            return this.f16639a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f16639a.hashCode() * 31;
            boolean z = this.f16640b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode2 = (((hashCode + i) * 31) + this.f16641c.hashCode()) * 31;
            boolean z2 = this.f16642d;
            return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            Optional<ReloadConfigResponse> optional = this.f16639a;
            boolean z = this.f16640b;
            Optional<S04> optional2 = this.f16641c;
            boolean z2 = this.f16642d;
            return "PreloadOptions(reloadOptional=" + optional + ", includePayPerRide=" + z + ", optionModelSelectedOptional=" + optional2 + ", includeAutoReloadSection=" + z2 + ")";
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J14$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3843c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.values().length];
            try {
                iArr[PaymentMethod.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.PAYPAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.GOOGLE_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.BANCONTACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.GIROPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.IDEAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.SOFORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter\n*L\n1#1,304:1\n109#2:305\n*E\n"})
    /* renamed from: J14$d */
    /* loaded from: classes3.dex */
    public static final class C3844d<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {

        /* renamed from: a */
        public final /* synthetic */ C3841b.C3842a f16643a;

        public C3844d(C3841b.C3842a c3842a) {
            this.f16643a = c3842a;
        }

        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            boolean booleanValue = ((Boolean) t4).booleanValue();
            boolean booleanValue2 = ((Boolean) t2).booleanValue();
            Optional<ReloadConfigResponse> optional = (Optional) t1;
            return (R) this.f16643a.m101310a(optional, booleanValue2, (Optional) t3, booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J14$e */
    /* loaded from: classes3.dex */
    public static final class C3845e extends Lambda implements Function1<Unit, Unit> {
        public C3845e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            J14.this.m42280h(V41.f38563a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ14$b;", "reloadOption", "", C17296a.f69688o, "(LJ14$b;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$f */
    /* loaded from: classes3.dex */
    public static final class C3846f extends Lambda implements Function1<C3841b, Boolean> {
        public C3846f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C3841b reloadOption) {
            boolean z;
            String str;
            PreloadConfig preload;
            List<ReloadOption> options;
            Intrinsics.checkNotNullParameter(reloadOption, "reloadOption");
            ReloadConfigResponse m59035e = reloadOption.m101311f().m59035e();
            boolean z2 = false;
            if (m59035e != null && (preload = m59035e.getPreload()) != null && (options = preload.getOptions()) != null && (!options.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String str2 = J14.this.f16632p;
                S04 m59035e2 = reloadOption.m101312e().m59035e();
                if (m59035e2 != null) {
                    str = m59035e2.m86128f();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(str2, str)) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LJ14$b;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LJ14$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$g */
    /* loaded from: classes3.dex */
    public static final class C3847g extends Lambda implements Function1<C3841b, Unit> {
        public C3847g() {
            super(1);
        }

        /* renamed from: a */
        public final void m101308a(C3841b c3841b) {
            c3841b.m101316a();
            boolean m101315b = c3841b.m101315b();
            c3841b.m101314c();
            boolean m101313d = c3841b.m101313d();
            if (!J14.this.f16635s) {
                J14.this.f16635s = true;
                J14.this.f16621e.mo55905y(new C49577u04(null, null, null, J14.this.f16636t, J14.this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency(), m101315b, m101313d, 7, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C3841b c3841b) {
            m101308a(c3841b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LJ14$b;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LJ14$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPreloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n1559#2:490\n1590#2,4:491\n1#3:495\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4\n*L\n129#1:490\n129#1:491,4\n*E\n"})
    /* renamed from: J14$h */
    /* loaded from: classes3.dex */
    public static final class C3848h extends Lambda implements Function1<C3841b, Unit> {

        /* renamed from: h */
        public final /* synthetic */ K14 f16648h;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/api/response/ReloadOption;", "b", "()Lco/bird/api/response/ReloadOption;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nPreloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4$option$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,489:1\n288#2,2:490\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4$option$2\n*L\n144#1:490,2\n*E\n"})
        /* renamed from: J14$h$a */
        /* loaded from: classes3.dex */
        public static final class C3849a extends Lambda implements Function0<ReloadOption> {

            /* renamed from: g */
            public final /* synthetic */ J14 f16649g;

            /* renamed from: h */
            public final /* synthetic */ List<ReloadOption> f16650h;

            /* renamed from: i */
            public final /* synthetic */ int f16651i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3849a(J14 j14, List<ReloadOption> list, int i) {
                super(0);
                this.f16649g = j14;
                this.f16650h = list;
                this.f16651i = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final ReloadOption invoke() {
                Object obj;
                String m37595n0 = this.f16649g.f16628l.m37595n0();
                if (m37595n0 != null) {
                    Iterator<T> it = this.f16650h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.areEqual(((ReloadOption) obj).getId(), m37595n0)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    ReloadOption reloadOption = (ReloadOption) obj;
                    if (reloadOption != null) {
                        return reloadOption;
                    }
                }
                return this.f16650h.get(this.f16651i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3848h(K14 k14) {
            super(1);
            this.f16648h = k14;
        }

        /* renamed from: b */
        public static final ReloadOption m101306b(Lazy<ReloadOption> lazy) {
            return lazy.getValue();
        }

        /* renamed from: a */
        public final void m101307a(C3841b c3841b) {
            String currency;
            PreloadConfig preload;
            List<ReloadOption> options;
            int collectionSizeOrDefault;
            Lazy lazy;
            Optional<S04> optional;
            String m86128f;
            String str;
            Boolean bool;
            ReloadConfigResponse m59035e;
            Boolean bool2;
            AutoReloadFromPreloadConfig autoReloadFromPreload;
            AutoReloadFromPreloadConfig autoReloadFromPreload2;
            String m86128f2;
            Optional<ReloadConfigResponse> m101316a = c3841b.m101316a();
            boolean m101315b = c3841b.m101315b();
            Optional<S04> m101314c = c3841b.m101314c();
            boolean m101313d = c3841b.m101313d();
            ReloadConfigResponse m59035e2 = m101316a.m59035e();
            if (m59035e2 == null || (currency = m59035e2.getCurrency()) == null) {
                currency = J14.this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
            }
            ReloadConfigResponse m59035e3 = m101316a.m59035e();
            if (m59035e3 != null && (preload = m59035e3.getPreload()) != null && (options = preload.getOptions()) != null) {
                List<ReloadOption> list = options;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ReloadOption reloadOption = (ReloadOption) obj;
                    if (reloadOption.getId() == null) {
                        reloadOption = ReloadOption.copy$default(reloadOption, "_preload_option_id_client_provided_" + i, 0L, null, null, null, null, 62, null);
                    }
                    arrayList.add(reloadOption);
                    i = i2;
                }
                Boolean mo57733U7 = this.f16648h.mo57733U7();
                if (mo57733U7 != null) {
                    J14.this.f16628l.m37553x2(mo57733U7.booleanValue());
                }
                S04 m59035e4 = m101314c.m59035e();
                if (m59035e4 != null && (m86128f2 = m59035e4.m86128f()) != null) {
                    J14.this.f16628l.m37752A2(m86128f2);
                }
                int size = arrayList.size() / 2;
                lazy = LazyKt__LazyJVMKt.lazy(new C3849a(J14.this, arrayList, size));
                J14 j14 = J14.this;
                if (m101314c.m59037c()) {
                    optional = m101314c;
                } else {
                    optional = null;
                }
                if (optional == null) {
                    Optional.C14443a c14443a = Optional.f63040c;
                    String id = m101306b(lazy).getId();
                    if (id == null) {
                        id = "";
                    }
                    optional = c14443a.m59033b(new S04(id, Long.valueOf(m101306b(lazy).getAmount()), C51916xx1.currency$default(C51916xx1.f118396a, m101306b(lazy).getAmount(), C45097mS5.m25591o(currency), null, 4, null), null, true, null, null, 104, null));
                }
                j14.f16633q = optional;
                J14 j142 = J14.this;
                if (m101314c.m59035e() == null) {
                    m86128f = J14.this.f16628l.m37595n0();
                    if (m86128f == null) {
                        m86128f = ((ReloadOption) arrayList.get(size)).getId();
                        Intrinsics.checkNotNull(m86128f);
                    }
                } else {
                    m86128f = m101314c.m59038b().m86128f();
                }
                j142.f16632p = m86128f;
                C41318g46.m40163a("preload optionIdSelected: " + J14.this.f16632p, new Object[0]);
                C41318g46.m40163a("preload optionModelSelectedOptional: " + m101314c, new Object[0]);
                ReloadOption reloadOption2 = (ReloadOption) arrayList.get(size);
                if (reloadOption2 != null) {
                    str = reloadOption2.getId();
                } else {
                    str = null;
                }
                C41318g46.m40163a("preload reloadOptions[midIndex]?.id: " + str, new Object[0]);
                Boolean m37599m0 = J14.this.f16628l.m37599m0();
                if (m37599m0 == null) {
                    ReloadConfigResponse m59035e5 = m101316a.m59035e();
                    if (m59035e5 != null && (autoReloadFromPreload2 = m59035e5.getAutoReloadFromPreload()) != null) {
                        m37599m0 = Boolean.valueOf(autoReloadFromPreload2.getDefault());
                    } else {
                        bool = null;
                        C41318g46.m40163a("preload preference auto reload mandatory: " + J14.this.f16628l.m37599m0(), new Object[0]);
                        m59035e = m101316a.m59035e();
                        if (m59035e == null && (autoReloadFromPreload = m59035e.getAutoReloadFromPreload()) != null) {
                            bool2 = Boolean.valueOf(autoReloadFromPreload.getDefault());
                        } else {
                            bool2 = null;
                        }
                        C41318g46.m40163a("preload autoReloadFromPreload?.default: " + bool2, new Object[0]);
                        C41318g46.m40163a("preload resolved autoReloadMandatory: " + bool, new Object[0]);
                        C42462i04 c42462i04 = new C42462i04(currency, arrayList, m101315b, m101313d, bool, J14.this.f16632p);
                        J14.this.f16637u = c42462i04;
                        this.f16648h.render(c42462i04);
                    }
                }
                bool = m37599m0;
                C41318g46.m40163a("preload preference auto reload mandatory: " + J14.this.f16628l.m37599m0(), new Object[0]);
                m59035e = m101316a.m59035e();
                if (m59035e == null) {
                }
                bool2 = null;
                C41318g46.m40163a("preload autoReloadFromPreload?.default: " + bool2, new Object[0]);
                C41318g46.m40163a("preload resolved autoReloadMandatory: " + bool, new Object[0]);
                C42462i04 c42462i042 = new C42462i04(currency, arrayList, m101315b, m101313d, bool, J14.this.f16632p);
                J14.this.f16637u = c42462i042;
                this.f16648h.render(c42462i042);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C3841b c3841b) {
            m101307a(c3841b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPreloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n1#2:490\n*E\n"})
    /* renamed from: J14$i */
    /* loaded from: classes3.dex */
    public static final class C3850i extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ K14 f16652g;

        /* renamed from: h */
        public final /* synthetic */ J14 f16653h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3850i(K14 k14, J14 j14) {
            super(1);
            this.f16652g = k14;
            this.f16653h = j14;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            Boolean mo57733U7 = this.f16652g.mo57733U7();
            if (mo57733U7 != null) {
                this.f16653h.f16628l.m37553x2(mo57733U7.booleanValue());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u00012\u0087\u0001\u0010\u0006\u001a\u0082\u0001\u0012,\u0012*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*@\u0012,\u0012*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "LS04;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$j */
    /* loaded from: classes3.dex */
    public static final class C3851j extends Lambda implements Function1<Pair<? extends Pair<? extends Unit, ? extends Optional<BirdPayment>>, ? extends S04>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ K14 f16655h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3851j(K14 k14) {
            super(1);
            this.f16655h = k14;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends Unit, ? extends Optional<BirdPayment>>, ? extends S04> pair) {
            invoke2((Pair<Pair<Unit, Optional<BirdPayment>>, S04>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Pair<Unit, Optional<BirdPayment>>, S04> pair) {
            Set<PaymentMethod> emptySet;
            List listOf;
            Map mapOf;
            S04 component2 = pair.component2();
            J14.this.m42280h(new C33658It2(false));
            Long m86132b = component2.m86132b();
            Optional<BirdPayment> component22 = pair.component1().component2();
            InterfaceC1880Ea interfaceC1880Ea = J14.this.f16621e;
            String str = J14.this.f16636t;
            String currency = J14.this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
            C42462i04 c42462i04 = J14.this.f16637u;
            boolean z = c42462i04 != null && c42462i04.m35399e();
            C42462i04 c42462i042 = J14.this.f16637u;
            boolean z2 = c42462i042 != null && c42462i042.m35400d();
            boolean z3 = m86132b == null;
            C42462i04 c42462i043 = J14.this.f16637u;
            interfaceC1880Ea.mo55905y(new C47799r04(null, null, null, str, currency, z, z2, z3, c42462i043 != null ? c42462i043.m35398f() : null, m86132b, null, J14.this.f16628l.m37599m0(), 1031, null));
            if (m86132b == null) {
                J14.this.f16628l.m37545z2();
                J14.this.f16628l.m37596n();
                J14.this.f16628l.m37600m();
                J14.this.f16623g.mo37050b1(-1);
            } else if (component22.m59035e() != null) {
                String mo57717u5 = this.f16655h.mo57717u5(C45871nl4.preload_amount_titlecased);
                K14 k14 = this.f16655h;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m28425to(mo57717u5, m86132b));
                Pair[] pairArr = new Pair[2];
                pairArr[0] = TuplesKt.m28425to("key_option_id_selected", component2.m86128f());
                Boolean mo57733U7 = this.f16655h.mo57733U7();
                pairArr[1] = TuplesKt.m28425to("key_auto_reload_toggled", Boolean.valueOf(mo57733U7 != null ? mo57733U7.booleanValue() : false));
                mapOf = MapsKt__MapsKt.mapOf(pairArr);
                k14.render(new U84(listOf, mapOf));
            } else {
                if (Intrinsics.areEqual(this.f16655h.mo57733U7(), Boolean.TRUE)) {
                    emptySet = J14.this.f16627k.mo1482c();
                } else {
                    emptySet = SetsKt__SetsKt.emptySet();
                }
                K14 k142 = this.f16655h;
                J14 j14 = J14.this;
                Boolean mo57733U72 = k142.mo57733U7();
                k142.render(new S84(j14, emptySet, mo57733U72 != null ? mo57733U72.booleanValue() : false));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J14$k */
    /* loaded from: classes3.dex */
    public static final class C3852k extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ReloadConfigResponse>>, Unit> {
        public C3852k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<ReloadConfigResponse>> pair) {
            invoke2((Pair<Unit, Optional<ReloadConfigResponse>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<ReloadConfigResponse>> pair) {
            ReloadConfigResponse m59035e = pair.component2().m59035e();
            String str = (m59035e == null || (r8 = m59035e.getReloadTermsArticle()) == null) ? "https://www.bird.co/terms/" : "https://www.bird.co/terms/";
            try {
                J14.this.f16623g.mo36922w3(Long.parseLong(str));
            } catch (NumberFormatException e) {
                C41318g46.m40159e(e);
                InterfaceC40099e13.C19924a.goToWebView$default(J14.this.f16623g, str, null, null, false, 14, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LG10;", "kotlin.jvm.PlatformType", "braintreeFragment", "", C17296a.f69688o, "(LG10;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$l */
    /* loaded from: classes3.dex */
    public static final class C3853l extends Lambda implements Function1<G10, Unit> {
        public C3853l() {
            super(1);
        }

        /* renamed from: a */
        public final void m101304a(G10 g10) {
            PayPalRequest payPalRequest = new PayPalRequest();
            J14.this.f16621e.mo55905y(new WP3(null, null, null, 7, null));
            C40881fL3.m41541t(g10, payPalRequest);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(G10 g10) {
            m101304a(g10);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$m */
    /* loaded from: classes3.dex */
    public static final class C3854m extends Lambda implements Function1<Optional<PaymentMethodNonce>, Unit> {
        public C3854m() {
            super(1);
        }

        /* renamed from: a */
        public final void m101303a(Optional<PaymentMethodNonce> optional) {
            J14.this.m101336b0(optional.m59035e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<PaymentMethodNonce> optional) {
            m101303a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J14$n */
    /* loaded from: classes3.dex */
    public static final class C3855n extends Lambda implements Function1<Throwable, Unit> {
        public C3855n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            InterfaceC1880Ea interfaceC1880Ea = J14.this.f16621e;
            String str = J14.this.f16636t;
            String currency = J14.this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
            C42462i04 c42462i04 = J14.this.f16637u;
            boolean z = c42462i04 != null && c42462i04.m35399e();
            C42462i04 c42462i042 = J14.this.f16637u;
            boolean z2 = c42462i042 != null && c42462i042.m35400d();
            C42462i04 c42462i043 = J14.this.f16637u;
            boolean areEqual = Intrinsics.areEqual(c42462i043 != null ? c42462i043.m35398f() : null, "_included_pay_per_ride");
            String str2 = "Google Pay Error: " + th.getMessage();
            C42462i04 c42462i044 = J14.this.f16637u;
            String m35398f = c42462i044 != null ? c42462i044.m35398f() : null;
            S04 s04 = (S04) J14.this.f16633q.m59035e();
            interfaceC1880Ea.mo55905y(new C48391s04(null, null, null, str, currency, z, z2, areEqual, str2, null, m35398f, s04 != null ? s04.m86132b() : null, null, J14.this.f16628l.m37599m0(), 4103, null));
            J14.this.m42280h(new C33658It2(false));
            J14 j14 = J14.this;
            String localizedMessage = th.getLocalizedMessage();
            Intrinsics.checkNotNullExpressionValue(localizedMessage, "e.localizedMessage");
            j14.m42280h(new C42853ig1(localizedMessage));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$o */
    /* loaded from: classes3.dex */
    public static final class C3856o extends Lambda implements Function1<User, InterfaceC23447K<? extends HM4<BraintreeTokenResponse>>> {
        public C3856o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<BraintreeTokenResponse>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            return J14.this.f16622f.mo2106d(user.getId(), PaymentProvider.BRAINTREE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$p */
    /* loaded from: classes3.dex */
    public static final class C3857p extends Lambda implements Function1<HM4<BraintreeTokenResponse>, Unit> {
        public C3857p() {
            super(1);
        }

        /* renamed from: a */
        public final void m101301a(HM4<BraintreeTokenResponse> hm4) {
            boolean z;
            boolean z2;
            String str;
            String str2;
            Long l;
            if (hm4.m103939f()) {
                BraintreeTokenResponse m103944a = hm4.m103944a();
                if (m103944a != null) {
                    J14.this.m42280h(new C52080yE0(m103944a.getToken()));
                    return;
                }
                return;
            }
            InterfaceC1880Ea interfaceC1880Ea = J14.this.f16621e;
            String str3 = J14.this.f16636t;
            String currency = J14.this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
            C42462i04 c42462i04 = J14.this.f16637u;
            if (c42462i04 != null && c42462i04.m35399e()) {
                z = true;
            } else {
                z = false;
            }
            C42462i04 c42462i042 = J14.this.f16637u;
            if (c42462i042 != null && c42462i042.m35400d()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C42462i04 c42462i043 = J14.this.f16637u;
            if (c42462i043 != null) {
                str = c42462i043.m35398f();
            } else {
                str = null;
            }
            boolean areEqual = Intrinsics.areEqual(str, "_included_pay_per_ride");
            String str4 = "Braintree / Paypal token error: " + hm4.m103940e();
            boolean z3 = z;
            Long valueOf = Long.valueOf(hm4.m103943b());
            C42462i04 c42462i044 = J14.this.f16637u;
            if (c42462i044 != null) {
                str2 = c42462i044.m35398f();
            } else {
                str2 = null;
            }
            S04 s04 = (S04) J14.this.f16633q.m59035e();
            if (s04 != null) {
                l = s04.m86132b();
            } else {
                l = null;
            }
            interfaceC1880Ea.mo55905y(new C48391s04(null, null, null, str3, currency, z3, z2, areEqual, str4, valueOf, str2, l, null, J14.this.f16628l.m37599m0(), 4103, null));
            J14.this.m42280h(new C33658It2(false));
            J14.this.m42280h(new C47597qg1(C45871nl4.error_generic_body));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BraintreeTokenResponse> hm4) {
            m101301a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "it", "", C17296a.f69688o, "(Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$q */
    /* loaded from: classes3.dex */
    public static final class C3858q extends Lambda implements Function1<PreloadAndMaybeConfigureAutoReloadResponse, Unit> {

        /* renamed from: g */
        public static final C3858q f16662g = new C3858q();

        public C3858q() {
            super(1);
        }

        /* renamed from: a */
        public final void m101300a(PreloadAndMaybeConfigureAutoReloadResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PreloadAndMaybeConfigureAutoReloadResponse preloadAndMaybeConfigureAutoReloadResponse) {
            m101300a(preloadAndMaybeConfigureAutoReloadResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$r */
    /* loaded from: classes3.dex */
    public static final class C3859r extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object f16663g;

        /* renamed from: h */
        public final /* synthetic */ Object f16664h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3859r(Object obj, Object obj2) {
            super(1);
            this.f16663g = obj;
            this.f16664h = obj2;
        }

        /* renamed from: a */
        public final void m101299a(InterfaceC23465c interfaceC23465c) {
            Object obj = this.f16663g;
            Object obj2 = this.f16664h;
            C41318g46.m40163a("calling preload and maybe auto reload with optionId=" + obj + ", autoReloadToggled=" + obj2, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m101299a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J14$s */
    /* loaded from: classes3.dex */
    public static final class C3860s extends Lambda implements Function1<Throwable, Unit> {
        public C3860s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC1880Ea interfaceC1880Ea = J14.this.f16621e;
            String str = J14.this.f16636t;
            String currency = J14.this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
            C42462i04 c42462i04 = J14.this.f16637u;
            boolean z = c42462i04 != null && c42462i04.m35399e();
            C42462i04 c42462i042 = J14.this.f16637u;
            boolean z2 = c42462i042 != null && c42462i042.m35400d();
            C42462i04 c42462i043 = J14.this.f16637u;
            boolean areEqual = Intrinsics.areEqual(c42462i043 != null ? c42462i043.m35398f() : null, "_included_pay_per_ride");
            String str2 = "PreloadAndMaybeAutoReloadFlow Error: " + th.getMessage();
            C42462i04 c42462i044 = J14.this.f16637u;
            String m35398f = c42462i044 != null ? c42462i044.m35398f() : null;
            S04 s04 = (S04) J14.this.f16633q.m59035e();
            interfaceC1880Ea.mo55905y(new C48391s04(null, null, null, str, currency, z, z2, areEqual, str2, null, m35398f, s04 != null ? s04.m86132b() : null, null, J14.this.f16628l.m37599m0(), 4103, null));
            C41318g46.m40161c(th, "error while handling preload and maybe auto reload: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J14$t */
    /* loaded from: classes3.dex */
    public static final class C3861t extends Lambda implements Function1<User, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ PaymentMethodNonce f16667h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3861t(PaymentMethodNonce paymentMethodNonce) {
            super(1);
            this.f16667h = paymentMethodNonce;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            AM3 am3 = J14.this.f16625i;
            String id = user.getId();
            String m53365i = ((PayPalAccountNonce) this.f16667h).m53365i();
            Intrinsics.checkNotNullExpressionValue(m53365i, "paymentMethodNonce.email");
            String m53327c = ((PayPalAccountNonce) this.f16667h).m53327c();
            Intrinsics.checkNotNullExpressionValue(m53327c, "paymentMethodNonce.nonce");
            return am3.mo85680c(id, m53365i, m53327c, PaymentProvider.BRAINTREE, PaymentAddSource.QUICK_PAYMENT_SCREEN);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J14$u */
    /* loaded from: classes3.dex */
    public static final class C3862u extends Lambda implements Function1<Throwable, Unit> {
        public C3862u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC1880Ea interfaceC1880Ea = J14.this.f16621e;
            String str = J14.this.f16636t;
            String currency = J14.this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
            C42462i04 c42462i04 = J14.this.f16637u;
            boolean z = false;
            boolean z2 = c42462i04 != null && c42462i04.m35399e();
            C42462i04 c42462i042 = J14.this.f16637u;
            if (c42462i042 != null && c42462i042.m35400d()) {
                z = true;
            }
            C42462i04 c42462i043 = J14.this.f16637u;
            boolean areEqual = Intrinsics.areEqual(c42462i043 != null ? c42462i043.m35398f() : null, "_included_pay_per_ride");
            String str2 = "Braintree/Paypal Error: " + th.getMessage();
            C42462i04 c42462i044 = J14.this.f16637u;
            String m35398f = c42462i044 != null ? c42462i044.m35398f() : null;
            S04 s04 = (S04) J14.this.f16633q.m59035e();
            interfaceC1880Ea.mo55905y(new C48391s04(null, null, null, str, currency, z2, z, areEqual, str2, null, m35398f, s04 != null ? s04.m86132b() : null, null, J14.this.f16628l.m37599m0(), 4103, null));
            J14.this.m42280h(new C47597qg1(C45871nl4.error_generic_body));
            C41318g46.m40159e(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J14(InterfaceC1880Ea analyticsManager, InterfaceC50768w10 brainTreeManager, InterfaceC40099e13 navigator, InterfaceC42586iD1 googlePayManager, AM3 paymentManagerV2, VM3 paymentManagerV3, InterfaceC52757zN3 paymentMethodManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager, InterfaceC37711a14 delegate) {
        super(C44259l22.f95376a);
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(brainTreeManager, "brainTreeManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f16621e = analyticsManager;
        this.f16622f = brainTreeManager;
        this.f16623g = navigator;
        this.f16624h = googlePayManager;
        this.f16625i = paymentManagerV2;
        this.f16626j = paymentManagerV3;
        this.f16627k = paymentMethodManager;
        this.f16628l = preference;
        this.f16629m = reactiveConfig;
        this.f16630n = userManager;
        this.f16631o = delegate;
        String m37595n0 = preference.m37595n0();
        this.f16632p = m37595n0 == null ? "[none]" : m37595n0;
        this.f16633q = Optional.f63040c.m59034a();
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f16634r = m25409g;
        this.f16636t = "unknown";
    }

    /* renamed from: G */
    public static final boolean m101357G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H */
    public static final void m101356H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m101355I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m101354J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m101353K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m101352L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m101351M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m101350N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m101345S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m101344T(J14 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16634r.accept(Unit.INSTANCE);
        this$0.m42280h(new C33658It2(false));
    }

    /* renamed from: V */
    public static final InterfaceC23447K m101342V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m101341W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final Unit m101339Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m101338Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m101337a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23496h m101335c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m101334d0(J14 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f16634r.accept(Unit.INSTANCE);
        this$0.m42280h(new C33658It2(false));
    }

    /* renamed from: e0 */
    public static final void m101333e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m101331g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: F */
    public void consume(K14 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(this.f16626j.mo25737i(), renderer.mo57719m6(), renderer.mo57742E1(), renderer.mo57716x8(), new C3844d(C3841b.f16638e));
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        final C3846f c3846f = new C3846f();
        Observable filter = combineLatest.filter(new InterfaceC23494q() { // from class: C14
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m101357G;
                m101357G = J14.m101357G(Function1.this, obj);
                return m101357G;
            }
        });
        final C3847g c3847g = new C3847g();
        Observable doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: D14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101331g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…2Information)\n      }\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3848h c3848h = new C3848h(renderer);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: E14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101356H(Function1.this, obj);
            }
        });
        C45168ma4<Unit> c45168ma4 = this.f16634r;
        Observable<Unit> mo57718u0 = renderer.mo57718u0();
        final C3850i c3850i = new C3850i(renderer, this);
        Observable merge = Observable.merge(c45168ma4, mo57718u0.doOnNext(new InterfaceC23484g() { // from class: F14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101355I(Function1.this, obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "override fun consume(ren…2Information)\n      }\n  }");
        Object m33094as2 = C24527f.m31950a(C24527f.m31950a(merge, this.f16627k.mo1484a()), C37279Yf5.m74576S(renderer.mo57742E1())).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3851j c3851j = new C3851j(renderer);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: G14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101354J(Function1.this, obj);
            }
        });
        Object m33094as3 = C24527f.m31950a(renderer.mo57739O0(), this.f16626j.mo25737i()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3852k c3852k = new C3852k();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: H14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101353K(Function1.this, obj);
            }
        });
        Observable<G10> observeOn = renderer.mo57720m1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "renderer.braintreeFragme…dSchedulers.mainThread())");
        Object m33094as4 = observeOn.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3853l c3853l = new C3853l();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: I14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101352L(Function1.this, obj);
            }
        });
        Object m33094as5 = renderer.mo57741G1().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3854m c3854m = new C3854m();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: r14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101351M(Function1.this, obj);
            }
        });
        Object m33094as6 = renderer.mo57740J0().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3845e c3845e = new C3845e();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: s14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101350N(Function1.this, obj);
            }
        });
    }

    /* renamed from: O */
    public final void m101349O(PaymentMethod paymentMethod) {
        Long l;
        InterfaceC40099e13 interfaceC40099e13 = this.f16623g;
        S04 m59035e = this.f16633q.m59035e();
        if (m59035e != null) {
            l = m59035e.m86132b();
        } else {
            l = null;
        }
        interfaceC40099e13.mo36961q0(paymentMethod, 10063, l, this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency());
    }

    /* renamed from: P */
    public final void m101348P() {
        this.f16623g.mo37166G1(10069, true, PaymentAddSource.PRELOAD_V2_OPTIONS_SCREEN);
    }

    /* renamed from: Q */
    public final void m101347Q() {
        InterfaceC42586iD1.C23161a.performGooglePaymentRequest$default(this.f16624h, C45097mS5.m25591o(this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency()), 0L, null, false, 12, null);
    }

    /* renamed from: R */
    public final void m101346R(int i, Intent intent) {
        Object m33041n = this.f16624h.mo16240d(i, intent, true, PaymentAddSource.PRELOAD_V2_OPTIONS_SCREEN).m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: v14
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                J14.m101344T(J14.this);
            }
        };
        final C3855n c3855n = new C3855n();
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: w14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101345S(Function1.this, obj);
            }
        });
    }

    /* renamed from: U */
    public final void m101343U() {
        AbstractC23442F<User> user = this.f16630n.getUser();
        final C3856o c3856o = new C3856o();
        AbstractC23442F<R> m33165A = user.m33165A(new InterfaceC23492o() { // from class: t14
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m101342V;
                m101342V = J14.m101342V(Function1.this, obj);
                return m101342V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun handlePaypal…y))\n        }\n      }\n  }");
        Object m33135e = m33165A.m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3857p c3857p = new C3857p();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: u14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J14.m101341W(Function1.this, obj);
            }
        });
    }

    /* renamed from: X */
    public final void m101340X() {
        boolean z;
        String str;
        String str2;
        Long l;
        InterfaceC1880Ea interfaceC1880Ea = this.f16621e;
        String str3 = this.f16636t;
        String currency = this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
        C42462i04 c42462i04 = this.f16637u;
        boolean z2 = false;
        if (c42462i04 != null && c42462i04.m35399e()) {
            z = true;
        } else {
            z = false;
        }
        C42462i04 c42462i042 = this.f16637u;
        if (c42462i042 != null && c42462i042.m35400d()) {
            z2 = true;
        }
        C42462i04 c42462i043 = this.f16637u;
        if (c42462i043 != null) {
            str = c42462i043.m35398f();
        } else {
            str = null;
        }
        boolean areEqual = Intrinsics.areEqual(str, "_included_pay_per_ride");
        C42462i04 c42462i044 = this.f16637u;
        if (c42462i044 != null) {
            str2 = c42462i044.m35398f();
        } else {
            str2 = null;
        }
        S04 m59035e = this.f16633q.m59035e();
        if (m59035e != null) {
            l = m59035e.m86132b();
        } else {
            l = null;
        }
        interfaceC1880Ea.mo55905y(new C48984t04(null, null, null, str3, currency, z, z2, areEqual, "dismissed", str2, l, null, this.f16628l.m37599m0(), 2055, null));
        this.f16628l.m37596n();
        this.f16628l.m37596n();
    }

    @Override // p000.InterfaceC37520Zg3
    /* renamed from: a */
    public void mo15688a(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        m42280h(new C33658It2(false, 1, null));
        switch (C3843c.$EnumSwitchMapping$0[paymentMethod.ordinal()]) {
            case 1:
                m101348P();
                return;
            case 2:
                m101343U();
                return;
            case 3:
                m101347Q();
                return;
            case 4:
            case 5:
            case 6:
            case 7:
                m101349O(paymentMethod);
                return;
            default:
                m42280h(new C33658It2(false));
                return;
        }
    }

    @Override // p000.InterfaceC36266Tx0
    /* renamed from: b */
    public AbstractC24507p<Unit> mo57714b(Map<String, ? extends Object> metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Object obj = metadata.get("key_auto_reload_toggled");
        if (obj != null) {
            Object obj2 = metadata.get("key_option_id_selected");
            if (obj2 != null) {
                AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> mo26518a = this.f16631o.mo26518a((String) obj2, ((Boolean) obj).booleanValue());
                final C3858q c3858q = C3858q.f16662g;
                AbstractC24507p<R> m32067H = mo26518a.m32067H(new InterfaceC23492o() { // from class: x14
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj3) {
                        Unit m101339Y;
                        m101339Y = J14.m101339Y(Function1.this, obj3);
                        return m101339Y;
                    }
                });
                final C3859r c3859r = new C3859r(obj2, obj);
                AbstractC24507p m32027r = m32067H.m32027r(new InterfaceC23484g() { // from class: y14
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj3) {
                        J14.m101338Z(Function1.this, obj3);
                    }
                });
                final C3860s c3860s = new C3860s();
                AbstractC24507p<Unit> m32029p = m32027r.m32029p(new InterfaceC23484g() { // from class: z14
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj3) {
                        J14.m101337a0(Function1.this, obj3);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m32029p, "override fun onConfirmCl…to reload: \")\n      }\n  }");
                return m32029p;
            }
            throw new MissingKeyException("Missing KEY_OPTION_ID_SELECTED in metadata");
        }
        throw new MissingKeyException("Missing KEY_AUTO_RELOAD_TOGGLED in metadata");
    }

    /* renamed from: b0 */
    public final void m101336b0(PaymentMethodNonce paymentMethodNonce) {
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            AbstractC23442F<User> user = this.f16630n.getUser();
            final C3861t c3861t = new C3861t(paymentMethodNonce);
            AbstractC23461c m33070P = user.m33164B(new InterfaceC23492o() { // from class: q14
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m101335c0;
                    m101335c0 = J14.m101335c0(Function1.this, obj);
                    return m101335c0;
                }
            }).m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "private fun onPaymentMet…AccountNonce.\")\n    }\n  }");
            Object m33041n = m33070P.m33041n(AutoDispose.m45239a(m42278j()));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: A14
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    J14.m101334d0(J14.this);
                }
            };
            final C3862u c3862u = new C3862u();
            ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: B14
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    J14.m101333e0(Function1.this, obj);
                }
            });
            return;
        }
        m42280h(new C33658It2(false));
        C41318g46.m40160d("The paymentMethodNonce returned is not a PayPalAccountNonce.", new Object[0]);
    }

    @Override // p000.InterfaceC36266Tx0
    /* renamed from: c */
    public void mo57713c(boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        Long l;
        InterfaceC1880Ea interfaceC1880Ea = this.f16621e;
        String str3 = this.f16636t;
        String currency = this.f16629m.m82623f8().m73665a().getRideConfig().getCurrency();
        C42462i04 c42462i04 = this.f16637u;
        int i = 0;
        if (c42462i04 != null && c42462i04.m35399e()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C42462i04 c42462i042 = this.f16637u;
        if (c42462i042 != null && c42462i042.m35400d()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C42462i04 c42462i043 = this.f16637u;
        if (c42462i043 != null) {
            str = c42462i043.m35398f();
        } else {
            str = null;
        }
        boolean areEqual = Intrinsics.areEqual(str, "_included_pay_per_ride");
        C42462i04 c42462i044 = this.f16637u;
        if (c42462i044 != null) {
            str2 = c42462i044.m35398f();
        } else {
            str2 = null;
        }
        S04 m59035e = this.f16633q.m59035e();
        if (m59035e != null) {
            l = m59035e.m86132b();
        } else {
            l = null;
        }
        interfaceC1880Ea.mo55905y(new C48984t04(null, null, null, str3, currency, z2, z3, areEqual, "completed", str2, l, null, this.f16628l.m37599m0(), 2055, null));
        this.f16628l.m37596n();
        this.f16628l.m37596n();
        InterfaceC40099e13 interfaceC40099e13 = this.f16623g;
        if (z) {
            i = -1;
        }
        interfaceC40099e13.mo37050b1(i);
    }

    /* renamed from: f0 */
    public final void m101332f0(String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16636t = context;
    }
}
