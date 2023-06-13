package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Link;
import co.bird.android.model.RideRequirement;
import co.bird.android.model.TaxInformationSource;
import co.bird.android.model.User;
import co.bird.android.model.UserDeletionStatus;
import co.bird.android.model.UserKt;
import co.bird.android.model.Warehouse;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23488k;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24567g;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C36730Vw5;
import p000.H31;
import p000.InterfaceC39904dh6;
import p000.InterfaceC40655ex5;
@Metadata(m28433d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00106\u001a\u000204\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010^\u001a\u00020[\u0012\u0006\u0010b\u001a\u00020_¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016JK\u0010\u001c\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010\u001f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020%H\u0007R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR\u0014\u0010l\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010fR\u0014\u0010p\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010fR.\u0010v\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f s*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010r0r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010y\u001a\u0010\u0012\f\u0012\n s*\u0004\u0018\u00010w0w0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010uR\"\u0010}\u001a\u0010\u0012\f\u0012\n s*\u0004\u0018\u00010\u00160\u00160z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0082\u0001\u001a\u00020\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0085\u0001"}, m28432d2 = {"LVw5;", "Lhw5;", "", "T", "", "I0", "Landroid/content/Intent;", "intent", "LsJ4;", "requirementPresenter", "c", "onResume", C17296a.f69688o, "a0", "(Landroid/content/Intent;)V", "Landroid/net/Uri;", "uri", "b", "Lco/bird/android/model/Warehouse;", "warehouse", "e", DateTokenConverter.CONVERTER_KEY, "", "name", PaymentMethod.BillingDetails.PARAM_PHONE, "email", "locale", "warehouseId", "S", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "serviceCenter", "K0", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Warehouse;)V", "H0", "()V", "N0", "(Ljava/lang/String;)V", "", "Ltg1;", "J0", "LGt5;", "LGt5;", "serviceCenterManager", "LEp0;", "LEp0;", "communicationOptInManager", "LTq4;", "LTq4;", "reactiveConfig", "Lgl;", "Lgl;", "preference", "Llh6;", "Llh6;", "userManager", "Ldh6;", "f", "Ldh6;", "userLogoutManager", "LBc;", "g", "LBc;", "deviceManager", "LV74;", "h", "LV74;", "promoManager", "Landroid/content/Context;", "i", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LEa;", "j", "LEa;", "analyticsManager", "Lfa5;", "k", "Lfa5;", "riderProfileManager", "LRh6;", "l", "LRh6;", "userStream", "LYR4;", "m", "LYR4;", "rideManager", "Lcom/uber/autodispose/ScopeProvider;", "n", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lex5;", "o", "Lex5;", "ui", "Le13;", "p", "Le13;", "navigator", "q", "Lco/bird/android/model/Warehouse;", "r", "Z", "optInChecked", "s", "optInEnabled", "t", "Ljava/lang/String;", "optInString", "u", "taxInformationEnabled", "v", "complaintReceiptsEnabled", "LAG;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "w", "LAG;", "savedPhotoUri", "Lco/bird/android/model/User;", "x", "user", "Lio/reactivex/subjects/g;", "y", "Lio/reactivex/subjects/g;", "referralCode", "z", "LsJ4;", "d0", "()Z", "isUserDeleteAllowed", "<init>", "(LGt5;LEp0;LTq4;Lgl;Llh6;Ldh6;LBc;LV74;Landroid/content/Context;LEa;Lfa5;LRh6;LYR4;Lcom/uber/autodispose/ScopeProvider;Lex5;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettingsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPresenter.kt\nco/bird/android/app/feature/settings/settings/SettingsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,598:1\n199#2:599\n180#2:600\n180#2:601\n180#2:604\n180#2:607\n180#2:610\n199#2:611\n180#2:612\n237#2:613\n180#2:614\n180#2:617\n180#2:618\n180#2:619\n180#2:620\n199#2:621\n237#2:622\n180#2:623\n180#2:624\n237#2:625\n237#2:626\n180#2:628\n237#2:629\n180#2:630\n218#2:631\n180#2:632\n52#3,2:602\n52#3,2:605\n94#3,2:608\n61#3,2:615\n1#4:627\n*S KotlinDebug\n*F\n+ 1 SettingsPresenter.kt\nco/bird/android/app/feature/settings/settings/SettingsPresenterImpl\n*L\n113#1:599\n117#1:600\n124#1:601\n153#1:604\n170#1:607\n191#1:610\n208#1:611\n214#1:612\n231#1:613\n238#1:614\n247#1:617\n263#1:618\n277#1:619\n286#1:620\n296#1:621\n315#1:622\n321#1:623\n333#1:624\n350#1:625\n425#1:626\n443#1:628\n504#1:629\n521#1:630\n538#1:631\n556#1:632\n128#1:602,2\n167#1:605,2\n182#1:608,2\n241#1:615,2\n*E\n"})
/* renamed from: Vw5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36730Vw5 implements InterfaceC42424hw5 {

    /* renamed from: a */
    public final InterfaceC33193Gt5 f40007a;

    /* renamed from: b */
    public final InterfaceC32684Ep0 f40008b;

    /* renamed from: c */
    public final C36207Tq4 f40009c;

    /* renamed from: d */
    public final C22454gl f40010d;

    /* renamed from: e */
    public final InterfaceC44647lh6 f40011e;

    /* renamed from: f */
    public final InterfaceC39904dh6 f40012f;

    /* renamed from: g */
    public final InterfaceC0650Bc f40013g;

    /* renamed from: h */
    public final V74 f40014h;

    /* renamed from: i */
    public final Context f40015i;

    /* renamed from: j */
    public final InterfaceC1880Ea f40016j;

    /* renamed from: k */
    public final InterfaceC41018fa5 f40017k;

    /* renamed from: l */
    public final InterfaceC35660Rh6 f40018l;

    /* renamed from: m */
    public final YR4 f40019m;

    /* renamed from: n */
    public final ScopeProvider f40020n;

    /* renamed from: o */
    public final InterfaceC40655ex5 f40021o;

    /* renamed from: p */
    public final InterfaceC40099e13 f40022p;

    /* renamed from: q */
    public Warehouse f40023q;

    /* renamed from: r */
    public boolean f40024r;

    /* renamed from: s */
    public final boolean f40025s;

    /* renamed from: t */
    public final String f40026t;

    /* renamed from: u */
    public final boolean f40027u;

    /* renamed from: v */
    public final boolean f40028v;

    /* renamed from: w */
    public final C0058AG<Optional<Uri>> f40029w;

    /* renamed from: x */
    public final C0058AG<User> f40030x;

    /* renamed from: y */
    public final C24567g<String> f40031y;

    /* renamed from: z */
    public InterfaceC48572sJ4 f40032z;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$A */
    /* loaded from: classes2.dex */
    public static final class C8826A extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C8826A f40033g = new C8826A();

        public C8826A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(DialogResponse it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$B */
    /* loaded from: classes2.dex */
    public static final class C8827B extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {
        public C8827B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC39904dh6.C19843a.logout$default(C36730Vw5.this.f40012f, false, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$C */
    /* loaded from: classes2.dex */
    public static final class C8828C extends Lambda implements Function1<Unit, Unit> {
        public C8828C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            TaxInformationSource taxInformationSource;
            if (C36730Vw5.this.f40028v && C36730Vw5.this.f40027u) {
                taxInformationSource = TaxInformationSource.COMPLAINT_RECEIPTS_AND_TAX_ENABLED_MARKET;
            } else {
                taxInformationSource = C36730Vw5.this.f40028v ? TaxInformationSource.COMPLAINT_RECEIPTS_ONLY : TaxInformationSource.SETTINGS;
            }
            C36730Vw5.this.f40022p.mo37066Y1(taxInformationSource);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$D */
    /* loaded from: classes2.dex */
    public static final class C8829D extends Lambda implements Function1<Unit, Unit> {
        public C8829D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C36730Vw5.this.f40022p.mo37129M2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "email", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$E */
    /* loaded from: classes2.dex */
    public static final class C8830E extends Lambda implements Function1<String, InterfaceC23496h> {
        public C8830E() {
            super(1);
        }

        /* renamed from: c */
        public static final void m79127c(C36730Vw5 this$0, String email) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(email, "$email");
            this$0.m79191N0(email);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            AbstractC23461c m33070P = C28237sD.progress$default(C36730Vw5.this.f40011e.mo26960q(), C36730Vw5.this.f40021o, 0, 2, (Object) null).m33070P(C23454a.m33087a());
            final C36730Vw5 c36730Vw5 = C36730Vw5.this;
            return m33070P.m33029z(new InterfaceC23478a() { // from class: Xw5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C36730Vw5.C8830E.m79127c(C36730Vw5.this, email);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$F */
    /* loaded from: classes2.dex */
    public static final class C8831F extends Lambda implements Function1<Throwable, Unit> {
        public C8831F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C36730Vw5.this.f40021o.error(C36730Vw5.this.m79199J0(e).m11932c());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$G */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8832G extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C8832G(Object obj) {
            super(1, obj, InterfaceC40655ex5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40655ex5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSettingsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPresenter.kt\nco/bird/android/app/feature/settings/settings/SettingsPresenterImpl$onCreate$30\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,598:1\n288#2,2:599\n*S KotlinDebug\n*F\n+ 1 SettingsPresenter.kt\nco/bird/android/app/feature/settings/settings/SettingsPresenterImpl$onCreate$30\n*L\n366#1:599,2\n*E\n"})
    /* renamed from: Vw5$H */
    /* loaded from: classes2.dex */
    public static final class C8833H extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Vw5$H$a */
        /* loaded from: classes2.dex */
        public static final class C8834a extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C36730Vw5 f40040g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/UserDeletionStatus;", "completionStatus", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/UserDeletionStatus;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Vw5$H$a$a */
            /* loaded from: classes2.dex */
            public static final class C8835a extends Lambda implements Function1<UserDeletionStatus, InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ C36730Vw5 f40041g;

                @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: Vw5$H$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C8836a extends Lambda implements Function1<DialogResponse, Unit> {

                    /* renamed from: g */
                    public final /* synthetic */ C36730Vw5 f40042g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8836a(C36730Vw5 c36730Vw5) {
                        super(1);
                        this.f40042g = c36730Vw5;
                    }

                    /* renamed from: a */
                    public final void m79116a(DialogResponse dialogResponse) {
                        C41318g46.m40163a("user delete operation success, showing toast confirmation", new Object[0]);
                        this.f40042g.f40021o.snackToast(C45871nl4.delete_account_success);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                        m79116a(dialogResponse);
                        return Unit.INSTANCE;
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: Vw5$H$a$a$b */
                /* loaded from: classes2.dex */
                public static final class C8837b extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

                    /* renamed from: g */
                    public final /* synthetic */ C36730Vw5 f40043g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8837b(C36730Vw5 c36730Vw5) {
                        super(1);
                        this.f40043g = c36730Vw5;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final InterfaceC23496h invoke(DialogResponse it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return InterfaceC39904dh6.C19843a.logout$default(this.f40043g.f40012f, false, 1, null);
                    }
                }

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: Vw5$H$a$a$c */
                /* loaded from: classes2.dex */
                public /* synthetic */ class C8838c {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[UserDeletionStatus.values().length];
                        try {
                            iArr[UserDeletionStatus.DELETED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8835a(C36730Vw5 c36730Vw5) {
                    super(1);
                    this.f40041g = c36730Vw5;
                }

                public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (InterfaceC23496h) tmp0.invoke(obj);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: c */
                public final InterfaceC23496h invoke(UserDeletionStatus completionStatus) {
                    Intrinsics.checkNotNullParameter(completionStatus, "completionStatus");
                    if (C8838c.$EnumSwitchMapping$0[completionStatus.ordinal()] == 1) {
                        C41318g46.m40163a("user deleted successfully, calling logout now to reset state.", new Object[0]);
                        AbstractC23442F<DialogResponse> birdDialog = this.f40041g.f40021o.birdDialog(C38690bg6.f57864d, true, true);
                        final C8836a c8836a = new C8836a(this.f40041g);
                        AbstractC23442F<DialogResponse> m33152N = birdDialog.m33101w(new InterfaceC23484g() { // from class: bx5
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                C36730Vw5.C8833H.C8834a.C8835a.invoke$lambda$0(Function1.this, obj);
                            }
                        }).m33152N(C24542a.m31932c());
                        final C8837b c8837b = new C8837b(this.f40041g);
                        return m33152N.m33164B(new InterfaceC23492o() { // from class: cx5
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                InterfaceC23496h invoke$lambda$1;
                                invoke$lambda$1 = C36730Vw5.C8833H.C8834a.C8835a.invoke$lambda$1(Function1.this, obj);
                                return invoke$lambda$1;
                            }
                        });
                    }
                    return AbstractC23461c.m33080F(new TimeoutException("Error while performing user delete, received response: " + completionStatus + " but expected DELETED"));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8834a(C36730Vw5 c36730Vw5) {
                super(1);
                this.f40040g = c36730Vw5;
            }

            /* renamed from: c */
            public static final InterfaceC23496h m79120c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23496h invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it != DialogResponse.OK) {
                    return AbstractC23461c.m33039p();
                }
                C41318g46.m40163a("user confirmed delete request, calling API now and waiting for success", new Object[0]);
                AbstractC23442F<UserDeletionStatus> m33152N = this.f40040g.f40011e.mo26962p().m33140a0(60L, TimeUnit.SECONDS).m33152N(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m33152N, "userManager.deleteUser()…dSchedulers.mainThread())");
                AbstractC23442F progress$default = C28237sD.progress$default(m33152N, this.f40040g.f40021o, 0, 2, (Object) null);
                final C8835a c8835a = new C8835a(this.f40040g);
                return progress$default.m33164B(new InterfaceC23492o() { // from class: ax5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m79120c;
                        m79120c = C36730Vw5.C8833H.C8834a.m79120c(Function1.this, obj);
                        return m79120c;
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Vw5$H$b */
        /* loaded from: classes2.dex */
        public static final class C8839b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C36730Vw5 f40044g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8839b(C36730Vw5 c36730Vw5) {
                super(1);
                this.f40044g = c36730Vw5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40158f(th, "Error while performing user delete operation", new Object[0]);
                this.f40044g.f40021o.error(C45871nl4.delete_account_error);
            }
        }

        public C8833H() {
            super(1);
        }

        /* renamed from: d */
        public static final void m79123d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(Unit it) {
            Object obj;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C36730Vw5.this.f40019m.mo75061N()) {
                return H31.C3014a.birdDialog$default(C36730Vw5.this.f40021o, TZ0.f35681d, true, false, 4, null).m33159G();
            }
            Iterator<T> it2 = C36730Vw5.this.f40011e.mo26973U().m73665a().values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((Balance) obj).getBalance() < 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Balance balance = (Balance) obj;
            if (balance != null) {
                return H31.C3014a.birdDialog$default(C36730Vw5.this.f40021o, new SZ0(C51916xx1.f118396a.m4408d(balance.getBalance(), C45097mS5.m25591o(balance.getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO)), true, false, 4, null).m33159G();
            }
            AbstractC23442F<DialogResponse> m33152N = C36730Vw5.this.f40021o.birdDialog(C36968Wx0.f42393d, true, true).m33152N(C24542a.m31932c());
            final C8834a c8834a = new C8834a(C36730Vw5.this);
            AbstractC23461c m33070P = m33152N.m33164B(new InterfaceC23492o() { // from class: Yw5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = C36730Vw5.C8833H.invoke$lambda$1(Function1.this, obj2);
                    return invoke$lambda$1;
                }
            }).m33070P(C23454a.m33087a());
            final C8839b c8839b = new C8839b(C36730Vw5.this);
            return m33070P.m33084B(new InterfaceC23484g() { // from class: Zw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    C36730Vw5.C8833H.m79123d(Function1.this, obj2);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$I */
    /* loaded from: classes2.dex */
    public static final class C8840I extends Lambda implements Function1<Pair<? extends User, ? extends String>, Unit> {
        public C8840I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends User, ? extends String> pair) {
            invoke2((Pair<User, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<User, String> pair) {
            boolean z;
            User user = pair.component1();
            EnumC49958uf1 m37699O = C36730Vw5.this.f40010d.m37699O();
            boolean z2 = true;
            if (user.getAdmin()) {
                Intrinsics.checkNotNullExpressionValue(user, "user");
                if (UserKt.isAdminDomain(user)) {
                    z = true;
                    if (!z || user.getTester() || m37699O != EnumC49958uf1.f112718k) {
                        C36730Vw5.this.f40021o.mo29659Ab(m37699O);
                    }
                    InterfaceC40655ex5 interfaceC40655ex5 = C36730Vw5.this.f40021o;
                    Intrinsics.checkNotNullExpressionValue(user, "user");
                    if (UserKt.isOperator(user) || C36730Vw5.this.f40010d.m37571t0() != MapMode.OPERATOR || !C36730Vw5.this.f40009c.m82623f8().m73665a().getOperatorConfig().getFeatures().getSettings().getEnabled()) {
                        z2 = false;
                    }
                    interfaceC40655ex5.mo29611s8(z2);
                }
            }
            z = false;
            if (!z) {
            }
            C36730Vw5.this.f40021o.mo29659Ab(m37699O);
            InterfaceC40655ex5 interfaceC40655ex52 = C36730Vw5.this.f40021o;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            if (UserKt.isOperator(user)) {
            }
            z2 = false;
            interfaceC40655ex52.mo29611s8(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0018\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00002\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u00060\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "LHM4;", "Lco/bird/android/model/Warehouse;", "warehouse", C17296a.f69688o, "(Lkotlin/Pair;LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$K */
    /* loaded from: classes2.dex */
    public static final class C8842K extends Lambda implements Function2<Pair<? extends User, ? extends String>, HM4<? extends Warehouse>, Pair<? extends User, ? extends Warehouse>> {

        /* renamed from: g */
        public static final C8842K f40047g = new C8842K();

        public C8842K() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<User, Warehouse> invoke(Pair<User, String> pair, HM4<? extends Warehouse> warehouse) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(warehouse, "warehouse");
            return TuplesKt.m28425to(pair.component1(), warehouse.m103944a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0005*\u001a\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Warehouse;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$L */
    /* loaded from: classes2.dex */
    public static final class C8843L extends Lambda implements Function1<Pair<? extends User, ? extends Warehouse>, Unit> {
        public C8843L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends User, ? extends Warehouse> pair) {
            invoke2((Pair<User, Warehouse>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<User, Warehouse> pair) {
            User user = pair.component1();
            Warehouse component2 = pair.component2();
            InterfaceC40655ex5 interfaceC40655ex5 = C36730Vw5.this.f40021o;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            interfaceC40655ex5.mo29647Ic(user);
            boolean enableServiceCenterPicker = C36730Vw5.this.f40009c.m82623f8().m73665a().getServiceCenterConfig().getEnableServiceCenterPicker();
            C36730Vw5.this.f40021o.mo29626bk(enableServiceCenterPicker);
            if (UserKt.isOperator(user) && (enableServiceCenterPicker || component2 != null)) {
                C36730Vw5.this.f40021o.mo29612qk();
                C36730Vw5.this.f40021o.mo29646Ld(component2);
            }
            C36730Vw5.this.f40021o.mo29606xc();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Landroid/net/Uri;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$M */
    /* loaded from: classes2.dex */
    public static final class C8844M extends Lambda implements Function1<Pair<? extends User, ? extends Optional<Uri>>, Unit> {
        public C8844M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends User, ? extends Optional<Uri>> pair) {
            invoke2((Pair<User, Optional<Uri>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<User, Optional<Uri>> pair) {
            String imageUrl = pair.component1().getImageUrl();
            Uri m59035e = pair.component2().m59035e();
            if (m59035e != null) {
                C36730Vw5.this.f40021o.mo29645Nk(m59035e);
            } else if (imageUrl != null) {
                C36730Vw5.this.f40021o.mo29618jk(imageUrl);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062f\u0010\u0005\u001ab\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0002*0\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LJx5;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LJx5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$N */
    /* loaded from: classes2.dex */
    public static final class C8845N extends Lambda implements Function1<C33931Jx5<? extends User, ? extends String, ? extends String, ? extends String, ? extends Boolean, ? extends Boolean>, Unit> {
        public C8845N() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
            if (r9 != false) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m79113a(C33931Jx5<User, String, String, String, Boolean, Boolean> c33931Jx5) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            User m99520a = c33931Jx5.m99520a();
            String m99518c = c33931Jx5.m99518c();
            String m99517d = c33931Jx5.m99517d();
            boolean booleanValue = c33931Jx5.m99516e().booleanValue();
            boolean booleanValue2 = c33931Jx5.m99515f().booleanValue();
            boolean areEqual = Intrinsics.areEqual(c33931Jx5.m99519b(), m99520a.getEmail());
            boolean z5 = true;
            if (areEqual && m99520a.getEmailVerifiedAt() != null) {
                z = true;
            } else {
                z = false;
            }
            if (areEqual) {
                m99520a.getEmailVerifiedAt();
            }
            C36730Vw5.this.f40021o.mo29648Hl(z);
            C36730Vw5.this.f40021o.mo29625c6(false);
            C36730Vw5.this.f40021o.mo29638Tk(null);
            InterfaceC40655ex5 interfaceC40655ex5 = C36730Vw5.this.f40021o;
            if (booleanValue) {
                if (m99518c.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    z2 = true;
                    interfaceC40655ex5.mo29657D3(z2);
                    InterfaceC40655ex5 interfaceC40655ex52 = C36730Vw5.this.f40021o;
                    if (booleanValue2) {
                        if (m99517d.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    z5 = false;
                    interfaceC40655ex52.mo29617k3(z5);
                }
            }
            z2 = false;
            interfaceC40655ex5.mo29657D3(z2);
            InterfaceC40655ex5 interfaceC40655ex522 = C36730Vw5.this.f40021o;
            if (booleanValue2) {
            }
            z5 = false;
            interfaceC40655ex522.mo29617k3(z5);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33931Jx5<? extends User, ? extends String, ? extends String, ? extends String, ? extends Boolean, ? extends Boolean> c33931Jx5) {
            m79113a(c33931Jx5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$O */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8846O extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C8846O(Object obj) {
            super(1, obj, InterfaceC40655ex5.class, "setReferralCode", "setReferralCode(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40655ex5) this.receiver).mo29654F6(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$P */
    /* loaded from: classes2.dex */
    public static final class C8847P extends Lambda implements Function1<User, Unit> {
        public C8847P() {
            super(1);
        }

        /* renamed from: a */
        public final void m79112a(User user) {
            C36730Vw5.this.m79203H0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m79112a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$Q */
    /* loaded from: classes2.dex */
    public static final class C8848Q extends Lambda implements Function1<Throwable, Unit> {
        public C8848Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C36730Vw5.this.f40021o.warn(C36730Vw5.this.m79199J0(e).m11932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$a */
    /* loaded from: classes2.dex */
    public static final class C8849a extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C8849a() {
            super(1);
        }

        /* renamed from: a */
        public final void m79111a(InterfaceC23465c interfaceC23465c) {
            C36730Vw5.this.f40021o.mo29605z9();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m79111a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$b */
    /* loaded from: classes2.dex */
    public static final class C8850b extends Lambda implements Function1<RideRequirement, Unit> {
        public C8850b() {
            super(1);
        }

        /* renamed from: a */
        public final void m79110a(RideRequirement rideRequirement) {
            C41318g46.m40163a("setting IDV button as required", new Object[0]);
            C36730Vw5.this.f40021o.mo29639T5();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m79110a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$c */
    /* loaded from: classes2.dex */
    public static final class C8851c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C8851c f40055g = new C8851c();

        public C8851c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while checking for ride requirement missing check", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$d */
    /* loaded from: classes2.dex */
    public static final class C8852d extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Boolean>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48572sJ4 f40056g;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Vw5$d$a */
        /* loaded from: classes2.dex */
        public static final class C8853a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C8853a f40057g = new C8853a();

            public C8853a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while attempting to check for IDV requirement, ignoring", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8852d(InterfaceC48572sJ4 interfaceC48572sJ4) {
            super(1);
            this.f40056g = interfaceC48572sJ4;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Boolean> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<Boolean> mo14398g = this.f40056g.mo14398g(RideRequirement.SelectIdentificationMethod.INSTANCE);
            final C8853a c8853a = C8853a.f40057g;
            return mo14398g.m33106t(new InterfaceC23484g() { // from class: Ww5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.C8852d.invoke$lambda$0(Function1.this, obj);
                }
            }).m33148R(Boolean.FALSE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "navigated", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$e */
    /* loaded from: classes2.dex */
    public static final class C8854e extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C8854e f40058g = new C8854e();

        public C8854e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C41318g46.m40163a("Attempted to navigate to IDV flow from settings: " + bool + " ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$f */
    /* loaded from: classes2.dex */
    public static final class C8855f extends Lambda implements Function1<User, Unit> {
        public C8855f() {
            super(1);
        }

        /* renamed from: a */
        public final void m79108a(User user) {
            InterfaceC40655ex5 interfaceC40655ex5 = C36730Vw5.this.f40021o;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            interfaceC40655ex5.mo29647Ic(user);
            C36730Vw5.this.f40021o.mo29606xc();
            C36730Vw5.this.f40021o.success(C45871nl4.settings_verify_email_success);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m79108a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$g */
    /* loaded from: classes2.dex */
    public static final class C8856g extends Lambda implements Function1<Throwable, Unit> {
        public C8856g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C36730Vw5.this.f40021o.error(C36730Vw5.this.m79199J0(e).m11932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Vw5$h */
    /* loaded from: classes2.dex */
    public static final class C8857h<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C8857h<T1, T2, R> f40061a = new C8857h<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Vw5$i */
    /* loaded from: classes2.dex */
    public static final class C8858i<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C8858i<T1, T2, R> f40062a = new C8858i<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u00032\u0006\u0010\n\u001a\u00028\u00042\u0006\u0010\u000b\u001a\u00028\u0005H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "T6", "t1", "t2", "t3", "t4", "t5", "t6", "LJx5;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LJx5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$5\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Vw5$j */
    /* loaded from: classes2.dex */
    public static final class C8859j<T1, T2, T3, T4, T5, T6, R> implements InterfaceC23488k {

        /* renamed from: a */
        public static final C8859j<T1, T2, T3, T4, T5, T6, R> f40063a = new C8859j<>();

        @Override // io.reactivex.functions.InterfaceC23488k
        /* renamed from: a */
        public final C33931Jx5<T1, T2, T3, T4, T5, T6> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return new C33931Jx5<>(t1, t2, t3, t4, t5, t6);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Vw5$k */
    /* loaded from: classes2.dex */
    public static final class C8860k<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C8860k<T1, T2, T3, R> f40064a = new C8860k<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$l */
    /* loaded from: classes2.dex */
    public static final class C8861l extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C8861l f40065g = new C8861l();

        public C8861l() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$m */
    /* loaded from: classes2.dex */
    public static final class C8862m extends Lambda implements Function1<Unit, String> {
        public C8862m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (String) C36730Vw5.this.f40031y.m31881x0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$n */
    /* loaded from: classes2.dex */
    public static final class C8863n extends Lambda implements Function1<String, Unit> {
        public C8863n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C36730Vw5.this.f40016j.mo55905y(new C35578Qy5(null, null, null, "settings_screen", 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$o */
    /* loaded from: classes2.dex */
    public static final class C8864o extends Lambda implements Function1<String, Unit> {
        public C8864o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            InterfaceC40099e13 interfaceC40099e13 = C36730Vw5.this.f40022p;
            String string = C36730Vw5.this.f40015i.getString(C45871nl4.free_rides_share_content_with_code, str);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_content_with_code, code)");
            String string2 = C36730Vw5.this.f40015i.getString(C45871nl4.free_rides_share_title);
            String string3 = C36730Vw5.this.f40015i.getString(C45871nl4.settings_share_prompt);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.string.settings_share_prompt)");
            interfaceC40099e13.mo36996k1(string, string2, string3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$p */
    /* loaded from: classes2.dex */
    public static final class C8865p extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C8865p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.booleanValue()) {
                return C36730Vw5.this.f40017k.mo30289b();
            }
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$q */
    /* loaded from: classes2.dex */
    public static final class C8866q extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C8866q f40070g = new C8866q();

        public C8866q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getEnableGiveFreeRides());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$r */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8867r extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C8867r(Object obj) {
            super(1, obj, InterfaceC40655ex5.class, "showShareCode", "showShareCode(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC40655ex5) this.receiver).mo29624db(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Ll56;", "LMZ;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$s */
    /* loaded from: classes2.dex */
    public static final class C8868s extends Lambda implements Function1<Triple<? extends C44293l56, ? extends C5312MZ, ? extends Boolean>, Unit> {
        public C8868s() {
            super(1);
        }

        /* renamed from: a */
        public final void m79102a(Triple<C44293l56, C5312MZ, Boolean> triple) {
            String capitalize;
            String capitalize2;
            C44293l56 component1 = triple.component1();
            C5312MZ component2 = triple.component2();
            if (triple.component3().booleanValue()) {
                InterfaceC40655ex5 interfaceC40655ex5 = C36730Vw5.this.f40021o;
                String lowerCase = component1.m27874d().toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                capitalize = StringsKt__StringsJVMKt.capitalize(lowerCase);
                interfaceC40655ex5.mo29630X9(capitalize);
                InterfaceC40655ex5 interfaceC40655ex52 = C36730Vw5.this.f40021o;
                String lowerCase2 = component2.m95166c().toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
                capitalize2 = StringsKt__StringsJVMKt.capitalize(lowerCase2);
                interfaceC40655ex52.mo29627bh(capitalize2);
                C36730Vw5.this.f40021o.mo29610uk(true);
                return;
            }
            C36730Vw5.this.f40021o.mo29610uk(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends C44293l56, ? extends C5312MZ, ? extends Boolean> triple) {
            m79102a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012R\u0010\u0005\u001aN\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Ll56;", "kotlin.jvm.PlatformType", "LMZ;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$t */
    /* loaded from: classes2.dex */
    public static final class C8869t extends Lambda implements Function1<Triple<? extends Unit, ? extends C44293l56, ? extends C5312MZ>, Unit> {
        public C8869t() {
            super(1);
        }

        /* renamed from: a */
        public final void m79101a(Triple<Unit, C44293l56, C5312MZ> triple) {
            C5312MZ component3 = triple.component3();
            C36730Vw5.this.f40022p.mo37142K1(component3.m95167b(), triple.component2().m27876b(), component3.m95166c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends C44293l56, ? extends C5312MZ> triple) {
            m79101a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$u */
    /* loaded from: classes2.dex */
    public static final class C8870u extends Lambda implements Function1<Pair<? extends Unit, ? extends Boolean>, Unit> {
        public C8870u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Boolean> pair) {
            invoke2((Pair<Unit, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Boolean> pair) {
            Boolean enableServiceCenterPicker = pair.component2();
            Intrinsics.checkNotNullExpressionValue(enableServiceCenterPicker, "enableServiceCenterPicker");
            if (enableServiceCenterPicker.booleanValue()) {
                C36730Vw5.this.f40022p.mo37012h3();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Link;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Link;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$v */
    /* loaded from: classes2.dex */
    public static final class C8871v extends Lambda implements Function1<Link, String> {

        /* renamed from: g */
        public static final C8871v f40074g = new C8871v();

        public C8871v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Link it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCode();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$w */
    /* loaded from: classes2.dex */
    public static final class C8872w extends Lambda implements Function1<Unit, Unit> {
        public C8872w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C36730Vw5.this.f40022p.mo36918x1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "optInStatus", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$x */
    /* loaded from: classes2.dex */
    public static final class C8873x extends Lambda implements Function1<Boolean, Unit> {
        public C8873x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean optInStatus) {
            InterfaceC40655ex5 interfaceC40655ex5 = C36730Vw5.this.f40021o;
            Intrinsics.checkNotNullExpressionValue(optInStatus, "optInStatus");
            interfaceC40655ex5.mo29629Xb(optInStatus.booleanValue());
            C36730Vw5.this.f40024r = optInStatus.booleanValue();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vw5$y */
    /* loaded from: classes2.dex */
    public static final class C8874y extends Lambda implements Function1<Throwable, Unit> {
        public C8874y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC40655ex5.C20152a.showOptInCheckBox$default(C36730Vw5.this.f40021o, false, null, 2, null);
            C41318g46.m40158f(th, "SettingsPresenter: Unknown communication-opt-in status", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vw5$z */
    /* loaded from: classes2.dex */
    public static final class C8875z extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {
        public C8875z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return H31.C3014a.dialog$default(C36730Vw5.this.f40021o, HA5.f13056d, false, false, 4, null);
        }
    }

    public C36730Vw5(InterfaceC33193Gt5 serviceCenterManager, InterfaceC32684Ep0 communicationOptInManager, C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC44647lh6 userManager, InterfaceC39904dh6 userLogoutManager, InterfaceC0650Bc deviceManager, V74 promoManager, Context context, InterfaceC1880Ea analyticsManager, InterfaceC41018fa5 riderProfileManager, InterfaceC35660Rh6 userStream, YR4 rideManager, ScopeProvider scopeProvider, InterfaceC40655ex5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(communicationOptInManager, "communicationOptInManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userLogoutManager, "userLogoutManager");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(riderProfileManager, "riderProfileManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f40007a = serviceCenterManager;
        this.f40008b = communicationOptInManager;
        this.f40009c = reactiveConfig;
        this.f40010d = preference;
        this.f40011e = userManager;
        this.f40012f = userLogoutManager;
        this.f40013g = deviceManager;
        this.f40014h = promoManager;
        this.f40015i = context;
        this.f40016j = analyticsManager;
        this.f40017k = riderProfileManager;
        this.f40018l = userStream;
        this.f40019m = rideManager;
        this.f40020n = scopeProvider;
        this.f40021o = ui;
        this.f40022p = navigator;
        this.f40025s = reactiveConfig.m82623f8().getValue().getCommunicationOptIn().getCommunicationOptIn();
        this.f40026t = reactiveConfig.m82623f8().getValue().getCommunicationOptIn().getLocalizedCommunicationOptInString();
        this.f40027u = reactiveConfig.m82623f8().getValue().getTaxInformationConfig().getEnableSettingsButton();
        this.f40028v = Intrinsics.areEqual(reactiveConfig.m82623f8().getValue().getTaxInformationConfig().getEnableCompliantReceipts(), Boolean.TRUE);
        C0058AG<Optional<Uri>> m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.absent<Uri>())");
        this.f40029w = m115950h;
        C0058AG<User> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<User>()");
        this.f40030x = m115951g;
        C24567g<String> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<String>()");
        this.f40031y = m31882w0;
    }

    /* renamed from: A0 */
    public static final InterfaceC23434B m79217A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final Pair m79215B0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: C0 */
    public static final void m79213C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m79211D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m79209E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m79207F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final void m79205G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m79195L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m79193M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m79184U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m79183V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m79182W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m79181X(C36730Vw5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("setting IDV button as completed", new Object[0]);
        this$0.f40021o.mo29609v2();
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m79180Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m79179Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m79177b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m79176c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final String m79174e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m79172f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m79170g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m79168h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC23496h m79166i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final Boolean m79164j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m79162k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m79160l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m79158m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m79156n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m79154o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m79152p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m79150q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m79148r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final InterfaceC23447K m79146s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final boolean m79144t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u0 */
    public static final InterfaceC23496h m79142u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m79140v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m79138w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final InterfaceC23496h m79136x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m79134y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final InterfaceC23496h m79132z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public final void m79203H0() {
        this.f40021o.success(C45871nl4.settings_profile_saved);
    }

    /* renamed from: I0 */
    public final boolean m79201I0() {
        return this.f40024r != this.f40021o.mo29631X0();
    }

    @Deprecated(message = "Please use standard retrofit response types to avoid exception parsing")
    /* renamed from: J0 */
    public final C49375tg1 m79199J0(Throwable e) {
        String str;
        String str2;
        C49375tg1 c49375tg1;
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof RetrofitException) {
            if (((RetrofitException) e).m53928b() == RetrofitException.EnumC16708a.NETWORK) {
                String string = H22.f12748a.mo27552R1().getResources().getString(C45871nl4.error_network);
                Intrinsics.checkNotNullExpressionValue(string, "Injector.applicationCont…g(L.string.error_network)");
                c49375tg1 = new C49375tg1(-1, string, null, null, 12, null);
            } else {
                try {
                    c49375tg1 = (C49375tg1) ((RetrofitException) e).m53929a(C49375tg1.class);
                } catch (Throwable th) {
                    String message = th.getMessage();
                    if (message == null) {
                        str2 = "";
                    } else {
                        str2 = message;
                    }
                    c49375tg1 = new C49375tg1(500, str2, null, null, 12, null);
                }
            }
            Intrinsics.checkNotNullExpressionValue(c49375tg1, "{\n      if (e.kind == Re…)\n        }\n      }\n    }");
            return c49375tg1;
        }
        String message2 = e.getMessage();
        if (message2 == null) {
            str = "";
        } else {
            str = message2;
        }
        return new C49375tg1(500, str, null, null, 12, null);
    }

    /* renamed from: K0 */
    public final void m79197K0(Uri uri, String str, String str2, String str3, Warehouse warehouse) {
        String str4;
        String str5;
        String str6;
        String str7;
        Uri uri2;
        String str8;
        if (this.f40025s && m79201I0()) {
            this.f40008b.mo101672a(this.f40021o.mo29631X0(), this.f40021o.mo29655E0());
            Object m33041n = this.f40008b.mo101670c(false).m33041n(AutoDispose.m45239a(this.f40020n));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
        User value = this.f40030x.getValue();
        if (value == null) {
            return;
        }
        String m106250a = C32974Fv2.m106250a();
        if (warehouse != null) {
            str4 = warehouse.getId();
        } else {
            str4 = null;
        }
        if (m79186S(uri, str, str2, str3, m106250a, str4)) {
            this.f40021o.mo29615n0();
            InterfaceC44647lh6 interfaceC44647lh6 = this.f40011e;
            if (!Intrinsics.areEqual(str, value.getName())) {
                str5 = str;
            } else {
                str5 = null;
            }
            if (!Intrinsics.areEqual(str3, value.getEmail())) {
                str6 = str3;
            } else {
                str6 = null;
            }
            if (!Intrinsics.areEqual(str2, value.getPhone())) {
                str7 = str2;
            } else {
                str7 = null;
            }
            Optional<Uri> value2 = this.f40029w.getValue();
            if (value2 != null) {
                uri2 = value2.m59035e();
            } else {
                uri2 = null;
            }
            if (warehouse != null) {
                str8 = warehouse.getId();
            } else {
                str8 = null;
            }
            Object m33094as = C28237sD.progress$default(interfaceC44647lh6.mo26972W(str5, str6, str7, uri2, m106250a, str8), this.f40021o, 0, 2, (Object) null).m33094as(AutoDispose.m45239a(this.f40020n));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8847P c8847p = new C8847P();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Rw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79195L0(Function1.this, obj);
                }
            };
            final C8848Q c8848q = new C8848Q();
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Sw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79193M0(Function1.this, obj);
                }
            });
            return;
        }
        m79203H0();
    }

    /* renamed from: N0 */
    public final void m79191N0(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        H31.C3014a.showDialog$default(this.f40021o, new C50500va1(email), false, false, null, null, null, null, 126, null);
    }

    /* renamed from: S */
    public final boolean m79186S(Uri uri, String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        String str8;
        String str9;
        User value = this.f40030x.getValue();
        String str10 = null;
        if (value != null) {
            str6 = value.getName();
        } else {
            str6 = null;
        }
        if (Intrinsics.areEqual(str6, str)) {
            if (value != null) {
                str7 = value.getPhone();
            } else {
                str7 = null;
            }
            if (Intrinsics.areEqual(str7, str2) && uri == null) {
                if (value != null) {
                    str8 = value.getEmail();
                } else {
                    str8 = null;
                }
                if (Intrinsics.areEqual(str3, str8)) {
                    if (value != null) {
                        str9 = value.getLocale();
                    } else {
                        str9 = null;
                    }
                    if (Intrinsics.areEqual(str4, str9)) {
                        if (value != null) {
                            str10 = value.getWarehouseId();
                        }
                        if (Intrinsics.areEqual(str5, str10)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: T */
    public final void m79185T() {
        InterfaceC48572sJ4 interfaceC48572sJ4 = this.f40032z;
        if (interfaceC48572sJ4 == null) {
            this.f40021o.mo29605z9();
        } else if (this.f40009c.m82623f8().m73665a().getIdentificationConfig().getEnableIdentificationService()) {
            AbstractC24507p<RideRequirement> m32066I = interfaceC48572sJ4.mo14401d(RideRequirement.SelectIdentificationMethod.INSTANCE).m32066I(C23454a.m33087a());
            final C8849a c8849a = new C8849a();
            AbstractC24507p<RideRequirement> m32027r = m32066I.m32027r(new InterfaceC23484g() { // from class: iw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79184U(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32027r, "private fun initializeID…ificationLink()\n    }\n  }");
            Object m32048b = m32027r.m32048b(AutoDispose.m45239a(this.f40020n));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8850b c8850b = new C8850b();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: tw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79183V(Function1.this, obj);
                }
            };
            final C8851c c8851c = C8851c.f40055g;
            ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ew5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79182W(Function1.this, obj);
                }
            }, new InterfaceC23478a() { // from class: Ow5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C36730Vw5.m79181X(C36730Vw5.this);
                }
            });
            Observable<Unit> mo29656Dj = this.f40021o.mo29656Dj();
            final C8852d c8852d = new C8852d(interfaceC48572sJ4);
            Observable<R> flatMapSingle = mo29656Dj.flatMapSingle(new InterfaceC23492o() { // from class: Pw5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m79180Y;
                    m79180Y = C36730Vw5.m79180Y(Function1.this, obj);
                    return m79180Y;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapSingle, "reqPresenter = requireme…turnItem(false)\n        }");
            Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f40020n));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8854e c8854e = C8854e.f40058g;
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Qw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79179Z(Function1.this, obj);
                }
            });
        } else {
            this.f40021o.mo29605z9();
        }
    }

    @Override // p000.InterfaceC42424hw5
    /* renamed from: a */
    public void mo35456a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        m79178a0(intent);
    }

    /* renamed from: a0 */
    public final void m79178a0(Intent intent) {
        int lastIndexOf$default;
        boolean z;
        Intrinsics.checkNotNullParameter(intent, "intent");
        String dataString = intent.getDataString();
        if (dataString == null) {
            return;
        }
        boolean z2 = false;
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) dataString, "/", 0, false, 6, (Object) null);
        Integer valueOf = Integer.valueOf(lastIndexOf$default);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            String substring = dataString.substring(valueOf.intValue() + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() > 0) {
                z2 = true;
            }
            if (z2) {
                str = substring;
            }
            if (str == null) {
                return;
            }
            Object m33094as = this.f40011e.mo26959r0(str).m33094as(AutoDispose.m45239a(this.f40020n));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8855f c8855f = new C8855f();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Mw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79177b0(Function1.this, obj);
                }
            };
            final C8856g c8856g = new C8856g();
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Nw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79176c0(Function1.this, obj);
                }
            });
        }
    }

    @Override // p000.InterfaceC42424hw5
    /* renamed from: b */
    public void mo35455b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f40029w.accept(Optional.f63040c.m59032c(uri));
    }

    @Override // p000.InterfaceC42424hw5
    /* renamed from: c */
    public void mo35454c(Intent intent, InterfaceC48572sJ4 requirementPresenter) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        this.f40032z = requirementPresenter;
        AbstractC23442F<Link> mo27765x = this.f40014h.mo27765x();
        final C8871v c8871v = C8871v.f40074g;
        AbstractC23442F<R> m33157I = mo27765x.m33157I(new InterfaceC23492o() { // from class: Tw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m79174e0;
                m79174e0 = C36730Vw5.m79174e0(Function1.this, obj);
                return m79174e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "promoManager.getFreeRide…()\n      .map { it.code }");
        Object m33135e = m33157I.m33135e(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).mo45205a(this.f40031y);
        Object m33094as = this.f40018l.mo76579f().m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f40030x);
        boolean z = false;
        Observable progress$default = C28237sD.progress$default(this.f40011e.mo26963n1(), this.f40021o, 0, 2, (Object) null);
        final C8832G c8832g = new C8832G(this.f40021o);
        Observable doOnError = progress$default.doOnError(new InterfaceC23484g() { // from class: sw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79172f0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "userManager.fetchUser()\n…    .doOnError(ui::error)");
        Object m33094as2 = doOnError.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f40030x, this.f40010d.m37746C0(), C8857h.f40061a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        final C8840I c8840i = new C8840I();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: Dw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79150q0(Function1.this, obj);
            }
        });
        final C8841J c8841j = new C8841J();
        InterfaceC23492o interfaceC23492o = new InterfaceC23492o() { // from class: Fw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m79217A0;
                m79217A0 = C36730Vw5.m79217A0(Function1.this, obj);
                return m79217A0;
            }
        };
        final C8842K c8842k = C8842K.f40047g;
        Observable observeOn2 = doOnNext.flatMap(interfaceC23492o, new InterfaceC23480c() { // from class: Gw5
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m79215B0;
                m79215B0 = C36730Vw5.m79215B0(Function2.this, obj, obj2);
                return m79215B0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate(in…r)\n      .subscribe()\n  }");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8843L c8843l = new C8843L();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Hw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79213C0(Function1.this, obj);
            }
        });
        Observable combineLatest2 = Observable.combineLatest(this.f40030x, this.f40029w, C8858i.f40062a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn3 = combineLatest2.distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8844M c8844m = new C8844M();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Iw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79211D0(Function1.this, obj);
            }
        });
        Observable combineLatest3 = Observable.combineLatest(this.f40030x, this.f40021o.mo29651H3(), this.f40021o.mo29634W0(), this.f40021o.mo29653Fg(), this.f40021o.mo29614pj(), this.f40021o.mo29619i3(), C8859j.f40063a);
        Intrinsics.checkNotNullExpressionValue(combineLatest3, "combineLatest(source1, s…1, t2, t3, t4, t5, t6) })");
        Observable observeOn4 = combineLatest3.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as5 = observeOn4.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8845N c8845n = new C8845N();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Jw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79209E0(Function1.this, obj);
            }
        });
        AbstractC23442F<String> m33152N = this.f40031y.m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "referralCode\n      .obse…dSchedulers.mainThread())");
        Object m33135e2 = m33152N.m33135e(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8846O c8846o = new C8846O(this.f40021o);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Kw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79207F0(Function1.this, obj);
            }
        };
        final C8861l c8861l = C8861l.f40065g;
        ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Lw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79205G0(Function1.this, obj);
            }
        });
        Observable m74575T = C37279Yf5.m74575T(this.f40021o.mo29628ab(), new C8862m());
        final C8863n c8863n = new C8863n();
        Observable doOnNext2 = m74575T.doOnNext(new InterfaceC23484g() { // from class: Uw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79170g0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun onCreate(in…r)\n      .subscribe()\n  }");
        Object m33094as6 = doOnNext2.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8864o c8864o = new C8864o();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: jw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79168h0(Function1.this, obj);
            }
        });
        Observable<Boolean> m82474t3 = this.f40009c.m82474t3();
        final C8865p c8865p = new C8865p();
        AbstractC23461c switchMapCompletable = m82474t3.switchMapCompletable(new InterfaceC23492o() { // from class: kw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m79166i0;
                m79166i0 = C36730Vw5.m79166i0(Function1.this, obj);
                return m79166i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate(in…r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Z84<Config> m82623f8 = this.f40009c.m82623f8();
        final C8866q c8866q = C8866q.f40070g;
        Observable observeOn5 = m82623f8.map(new InterfaceC23492o() { // from class: lw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m79164j0;
                m79164j0 = C36730Vw5.m79164j0(Function1.this, obj);
                return m79164j0;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as7 = observeOn5.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8867r c8867r = new C8867r(this.f40021o);
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: mw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79162k0(Function1.this, obj);
            }
        });
        Observable combineLatest4 = Observable.combineLatest(C37279Yf5.m74576S(this.f40017k.mo30287d()), C37279Yf5.m74576S(this.f40017k.mo30288c()), this.f40009c.m82474t3(), C8860k.f40064a);
        Intrinsics.checkNotNullExpressionValue(combineLatest4, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Observable observeOn6 = combineLatest4.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as8 = observeOn6.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8868s c8868s = new C8868s();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: nw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79160l0(Function1.this, obj);
            }
        });
        Object m33094as9 = C24527f.m31949b(this.f40021o.mo29652Gb(), C37279Yf5.m74576S(this.f40017k.mo30287d()), C37279Yf5.m74576S(this.f40017k.mo30288c())).m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8869t c8869t = new C8869t();
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: ow5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79158m0(Function1.this, obj);
            }
        });
        InterfaceC40655ex5 interfaceC40655ex5 = this.f40021o;
        String mo112053f = this.f40013g.mo112053f();
        String mo112056c = this.f40013g.mo112056c();
        interfaceC40655ex5.mo29621f3("v" + mo112053f + " - " + mo112056c);
        Observable observeOn7 = C24527f.m31950a(this.f40021o.mo29623dd(), this.f40009c.m82492r7()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "ui.serviceCenterEditClic…dSchedulers.mainThread())");
        Object m33094as10 = observeOn7.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8870u c8870u = new C8870u();
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: pw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79156n0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn8 = this.f40021o.mo29650H7().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "ui.operatorSettingsClick…dSchedulers.mainThread())");
        Object m33094as11 = observeOn8.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8872w c8872w = new C8872w();
        ((ObservableSubscribeProxy) m33094as11).subscribe(new InterfaceC23484g() { // from class: qw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79154o0(Function1.this, obj);
            }
        });
        this.f40021o.mo29620h1(this.f40025s, this.f40026t);
        if (this.f40025s) {
            AbstractC23442F<Boolean> m33152N2 = this.f40008b.mo101671b().m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N2, "communicationOptInManage…dSchedulers.mainThread())");
            Object m33135e3 = m33152N2.m33135e(AutoDispose.m45239a(this.f40020n));
            Intrinsics.checkExpressionValueIsNotNull(m33135e3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C8873x c8873x = new C8873x();
            InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: rw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79152p0(Function1.this, obj);
                }
            };
            final C8874y c8874y = new C8874y();
            ((SingleSubscribeProxy) m33135e3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: uw5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36730Vw5.m79148r0(Function1.this, obj);
                }
            });
        }
        Observable<Unit> mo29613qc = this.f40021o.mo29613qc();
        final C8875z c8875z = new C8875z();
        Observable<R> flatMapSingle = mo29613qc.flatMapSingle(new InterfaceC23492o() { // from class: vw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m79146s0;
                m79146s0 = C36730Vw5.m79146s0(Function1.this, obj);
                return m79146s0;
            }
        });
        final C8826A c8826a = C8826A.f40033g;
        Observable filter = flatMapSingle.filter(new InterfaceC23494q() { // from class: ww5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m79144t0;
                m79144t0 = C36730Vw5.m79144t0(Function1.this, obj);
                return m79144t0;
            }
        });
        final C8827B c8827b = new C8827B();
        AbstractC23461c m33066T = filter.flatMapCompletable(new InterfaceC23492o() { // from class: xw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m79142u0;
                m79142u0 = C36730Vw5.m79142u0(Function1.this, obj);
                return m79142u0;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onCreate(in…r)\n      .subscribe()\n  }");
        Object m33041n2 = m33066T.m33041n(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        this.f40021o.mo29658C3((this.f40027u || this.f40028v) ? true : true);
        Object m33094as12 = this.f40021o.mo29608w4().m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as12, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8828C c8828c = new C8828C();
        ((ObservableSubscribeProxy) m33094as12).subscribe(new InterfaceC23484g() { // from class: yw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79140v0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn9 = this.f40021o.mo29616m4().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "ui.userPhotoClicks()\n   …dSchedulers.mainThread())");
        Object m33094as13 = observeOn9.m33094as(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33094as13, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8829D c8829d = new C8829D();
        ((ObservableSubscribeProxy) m33094as13).subscribe(new InterfaceC23484g() { // from class: zw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79138w0(Function1.this, obj);
            }
        });
        Observable<String> mo29633Wf = this.f40021o.mo29633Wf();
        final C8830E c8830e = new C8830E();
        AbstractC23461c m33070P = mo29633Wf.flatMapCompletable(new InterfaceC23492o() { // from class: Aw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m79136x0;
                m79136x0 = C36730Vw5.m79136x0(Function1.this, obj);
                return m79136x0;
            }
        }).m33070P(C23454a.m33087a());
        final C8831F c8831f = new C8831F();
        AbstractC23461c m33066T2 = m33070P.m33084B(new InterfaceC23484g() { // from class: Bw5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36730Vw5.m79134y0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "override fun onCreate(in…r)\n      .subscribe()\n  }");
        Object m33041n3 = m33066T2.m33041n(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
        this.f40021o.mo29649Hf(m79175d0());
        Observable<Unit> observeOn10 = this.f40021o.mo29642R9().observeOn(C23454a.m33087a());
        final C8833H c8833h = new C8833H();
        AbstractC23461c flatMapCompletable = observeOn10.flatMapCompletable(new InterfaceC23492o() { // from class: Cw5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m79132z0;
                m79132z0 = C36730Vw5.m79132z0(Function1.this, obj);
                return m79132z0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onCreate(in…r)\n      .subscribe()\n  }");
        Object m33041n4 = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f40020n));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n4).subscribe();
    }

    @Override // p000.InterfaceC42424hw5
    /* renamed from: d */
    public void mo35453d() {
        Uri uri;
        Optional<Uri> value = this.f40029w.getValue();
        if (value != null) {
            uri = value.m59035e();
        } else {
            uri = null;
        }
        m79197K0(uri, this.f40021o.getName(), this.f40021o.mo29607x0(), this.f40021o.mo29622eb(), this.f40023q);
    }

    /* renamed from: d0 */
    public final boolean m79175d0() {
        return Intrinsics.areEqual(this.f40009c.m82623f8().m73665a().getComplianceConfig().getUserCanDeleteAccount(), Boolean.TRUE);
    }

    @Override // p000.InterfaceC42424hw5
    /* renamed from: e */
    public void mo35452e(Warehouse warehouse) {
        this.f40023q = warehouse;
        this.f40021o.mo29646Ld(warehouse);
    }

    @Override // p000.InterfaceC42424hw5
    public void onResume() {
        m79185T();
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001aj\u0012.\b\u0001\u0012*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006 \u0002*4\u0012.\b\u0001\u0012*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "LHM4;", "Lco/bird/android/model/Warehouse;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSettingsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPresenter.kt\nco/bird/android/app/feature/settings/settings/SettingsPresenterImpl$onCreate$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,598:1\n1#2:599\n*E\n"})
    /* renamed from: Vw5$J */
    /* loaded from: classes2.dex */
    public static final class C8841J extends Lambda implements Function1<Pair<? extends User, ? extends String>, InterfaceC23434B<? extends HM4<? extends Warehouse>>> {
        public C8841J() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends HM4<? extends Warehouse>> invoke2(Pair<User, String> pair) {
            Observable<HM4<Warehouse>> m33123k0;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String warehouseId = pair.component1().getWarehouseId();
            return (warehouseId == null || (m33123k0 = C36730Vw5.this.f40007a.mo94633a(warehouseId).m33123k0()) == null) ? Observable.just(HM4.m103935j(null)) : m33123k0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends HM4<? extends Warehouse>> invoke(Pair<? extends User, ? extends String> pair) {
            return invoke2((Pair<User, String>) pair);
        }
    }
}
