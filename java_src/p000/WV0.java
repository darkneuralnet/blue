package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import dagger.Lazy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.NV0;
import p000.WV0;
@Metadata(m28433d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002\b\u0010BÝ\u0002\b\u0007\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000,\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020,\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040,\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002060,\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u0002080,\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020;0,\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020>0,\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020A0,\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020D0,\u0012\f\u0010I\u001a\b\u0012\u0004\u0012\u00020G0,\u0012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020J0,\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020M0,\u0012\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0,\u0012\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0,\u0012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0,\u0012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0,\u0012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0,\u0012\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0,\u0012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0,\u0012\u0006\u0010`\u001a\u00020^\u0012\u0006\u0010c\u001a\u00020a\u0012\u0006\u0010f\u001a\u00020d\u0012\u0006\u0010i\u001a\u00020g\u0012\u0006\u0010l\u001a\u00020j\u0012\b\b\u0001\u0010n\u001a\u00020\t\u0012\b\b\u0001\u0010o\u001a\u00020\t¢\u0006\u0004\bq\u0010rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J*\u0010\u0014\u001a\u00020\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00110\u00062\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u000bJ\n\u0010\u0017\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u0019\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u001a\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u001b\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u001c\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u001d\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u001e\u001a\u00020\u000b*\u00020\u0002J\n\u0010\u001f\u001a\u00020\u000b*\u00020\u0002J\n\u0010 \u001a\u00020\u000b*\u00020\u0002J\n\u0010!\u001a\u00020\u000b*\u00020\u0002J\n\u0010\"\u001a\u00020\u000b*\u00020\u0002J\n\u0010#\u001a\u00020\u000b*\u00020\u0002J\n\u0010$\u001a\u00020\u000b*\u00020\u0002J\n\u0010%\u001a\u00020\u000b*\u00020\u0002J\n\u0010&\u001a\u00020\u000b*\u00020\u0002J\n\u0010'\u001a\u00020\u000b*\u00020\u0002J\u0018\u0010)\u001a\u0004\u0018\u00010(*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0002J\f\u0010*\u001a\u00020(*\u00020\u0015H\u0002J\b\u0010+\u001a\u00020(H\u0002R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002080,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010.R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020;0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020D0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010.R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020G0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010.R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010.R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010.R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0014\u0010`\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010_R\u0014\u0010c\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010hR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010kR\u0014\u0010n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010mR\u0014\u0010o\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010mR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010p¨\u0006s"}, m28432d2 = {"LWV0;", "LNV0;", "Landroid/content/Intent;", "intent", "", "e", "Lio/reactivex/p;", "LcW0;", C17296a.f69688o, "", "uri", "", "navigateToUrlOnFailure", "restartActivity", "Lio/reactivex/c;", "c", "b", "Lkotlin/Pair;", "deepLinkMaybe", "allowExternal", DateTokenConverter.CONVERTER_KEY, "LoW0;", "n", "y", "q", "o", "B", "x", "z", "t", "w", "p", "s", "E", "r", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "u", "D", "A", "v", "LMV0;", "P", "O", "F", "Ldagger/Lazy;", "Lmm3;", "Ldagger/Lazy;", "operatorMainNavigator", "LjG2;", "mainNavigator", "LQT0;", "dealNavigator", "LvP;", "birdPlusNavigator", "LRU4;", "ridePassNavigator", "LnK2;", "f", "mapNavigator", "LNh3;", "g", "openNavigator", "Lf11;", "h", "destinationNavigator", "LIC1;", "i", "giftNavigator", "LcA1;", "j", "frequentFlyerNavigator", "LDm3;", "k", "operatorMapNavigator", "LOf6;", "l", "urlOverrideDeepLinkNavigator", "LeW2;", "m", "motmotDeepLinkNavigator", "LLp1;", "fleetReportDeepLinkNavigator", "Lki5;", "saveMoneyDeepLinkNavigator", "LDS1;", "idToolsDeepLinkNavigator", "LOi1;", "externalDeepLinkNavigator", "Ly66;", "transactionDeepLinkNavigator", "LYZ3;", "preloadDeepLinkNavigator", "LjT1;", "identificationDeepLinkNavigator", "LEa;", "LEa;", "analyticsManager", "LhW0;", "LhW0;", "deepLinkManager", "LOh;", "LOh;", "buildConfig", "Le13;", "Le13;", "navigator", "LTq4;", "LTq4;", "reactiveConfig", "Ljava/lang/String;", "deepLinkHostGo", "deepLinkHostGift", "Landroid/content/Intent;", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;LEa;LhW0;LOh;Le13;LTq4;Ljava/lang/String;Ljava/lang/String;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeepLinkNavigatorResolverImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkNavigatorResolverImpl.kt\nco/bird/android/lib/deeplink/DeepLinkNavigatorResolverImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n1#2:538\n*E\n"})
/* renamed from: WV0 */
/* loaded from: classes3.dex */
public final class WV0 implements NV0 {

    /* renamed from: C */
    public static final C9062a f41165C = new C9062a(null);

    /* renamed from: A */
    public final String f41166A;

    /* renamed from: B */
    public Intent f41167B;

    /* renamed from: a */
    public final Lazy<C45287mm3> f41168a;

    /* renamed from: b */
    public final Lazy<C43207jG2> f41169b;

    /* renamed from: c */
    public final Lazy<QT0> f41170c;

    /* renamed from: d */
    public final Lazy<C29526vP> f41171d;

    /* renamed from: e */
    public final Lazy<RU4> f41172e;

    /* renamed from: f */
    public final Lazy<C45615nK2> f41173f;

    /* renamed from: g */
    public final Lazy<C34721Nh3> f41174g;

    /* renamed from: h */
    public final Lazy<C40690f11> f41175h;

    /* renamed from: i */
    public final Lazy<IC1> f41176i;

    /* renamed from: j */
    public final Lazy<C38984cA1> f41177j;

    /* renamed from: k */
    public final Lazy<C32426Dm3> f41178k;

    /* renamed from: l */
    public final Lazy<C34940Of6> f41179l;

    /* renamed from: m */
    public final Lazy<C40386eW2> f41180m;

    /* renamed from: n */
    public final Lazy<C34323Lp1> f41181n;

    /* renamed from: o */
    public final Lazy<C44063ki5> f41182o;

    /* renamed from: p */
    public final Lazy<DS1> f41183p;

    /* renamed from: q */
    public final Lazy<C34962Oi1> f41184q;

    /* renamed from: r */
    public final Lazy<C52010y66> f41185r;

    /* renamed from: s */
    public final Lazy<YZ3> f41186s;

    /* renamed from: t */
    public final Lazy<C43323jT1> f41187t;

    /* renamed from: u */
    public final InterfaceC1880Ea f41188u;

    /* renamed from: v */
    public final InterfaceC42163hW0 f41189v;

    /* renamed from: w */
    public final InterfaceC6097Oh f41190w;

    /* renamed from: x */
    public final InterfaceC40099e13 f41191x;

    /* renamed from: y */
    public final C36207Tq4 f41192y;

    /* renamed from: z */
    public final String f41193z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LWV0$a;", "", "", "DEEP_LINK_RESOLUTION_TIMEOUT_SECONDS", "J", "<init>", "()V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WV0$a */
    /* loaded from: classes3.dex */
    public static final class C9062a {
        public /* synthetic */ C9062a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9062a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LWV0$b;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Landroid/content/Intent;", "upgradeAppIntent", "<init>", "(LWV0;Landroid/content/Intent;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WV0$b */
    /* loaded from: classes3.dex */
    public final class C9063b implements MV0 {

        /* renamed from: a */
        public final Intent f41194a;

        /* renamed from: b */
        public final /* synthetic */ WV0 f41195b;

        public C9063b(WV0 wv0, Intent upgradeAppIntent) {
            Intrinsics.checkNotNullParameter(upgradeAppIntent, "upgradeAppIntent");
            this.f41195b = wv0;
            this.f41194a = upgradeAppIntent;
        }

        /* renamed from: c */
        public static final Unit m78274c(WV0 this$0, C9063b this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.f41191x.mo37019g2(this$1.f41194a);
            return Unit.INSTANCE;
        }

        @Override // p000.MV0
        /* renamed from: a */
        public AbstractC23461c mo4134a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            final WV0 wv0 = this.f41195b;
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: XV0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m78274c;
                    m78274c = WV0.C9063b.m78274c(WV0.this, this);
                    return m78274c;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n      nav…t(upgradeAppIntent)\n    }");
            return m33078H;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WV0$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9064c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC46314oW0.values().length];
            try {
                iArr[EnumC46314oW0.MOTMOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC46314oW0.BIRD_PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC46314oW0.RIDE_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC46314oW0.MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC46314oW0.OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC46314oW0.DESTINATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC46314oW0.GIFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC46314oW0.DEAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC46314oW0.FREQUENT_FLYER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC46314oW0.OPERATOR_MAP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC46314oW0.URL_OVERRIDE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC46314oW0.FLEET_REPORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC46314oW0.SAVE_MONEY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC46314oW0.ID_TOOLS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC46314oW0.EXTERNAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC46314oW0.TRANSACTION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC46314oW0.PRELOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC46314oW0.IDENTIFICATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LcW0;", "Landroid/content/Intent;", "<name for destructuring parameter 0>", "LPL4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)LPL4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WV0$d */
    /* loaded from: classes3.dex */
    public static final class C9065d extends Lambda implements Function1<Pair<? extends AbstractC39181cW0, ? extends Intent>, PL4> {

        /* renamed from: h */
        public final /* synthetic */ boolean f41197h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9065d(boolean z) {
            super(1);
            this.f41197h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PL4 invoke(Pair<? extends AbstractC39181cW0, ? extends Intent> pair) {
            Intent m71272a;
            MV0 m78302P;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AbstractC39181cW0 component1 = pair.component1();
            Intent component2 = pair.component2();
            String uri = component2.toUri(0);
            C41318g46.m40163a("parsed intent: " + uri, new Object[0]);
            m71272a = C37995aW0.m71272a(component2, component1);
            String uri2 = m71272a.toUri(0);
            C41318g46.m40163a("resolved intent: " + uri2, new Object[0]);
            if (component1 instanceof C39273cf6) {
                m78302P = new C9063b(WV0.this, ((C39273cf6) component1).m61079b());
            } else if (component1 instanceof KV0) {
                EnumC46314oW0 m78288n = WV0.this.m78288n(m71272a, this.f41197h);
                if (m78288n != null) {
                    WV0.this.f41189v.mo30415d(m78288n);
                }
                m78302P = WV0.this.m78302P(m71272a, this.f41197h);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return new PL4(component1, m78302P, m71272a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LPL4;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LPL4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WV0$e */
    /* loaded from: classes3.dex */
    public static final class C9066e extends Lambda implements Function1<PL4, Unit> {
        public C9066e() {
            super(1);
        }

        /* renamed from: a */
        public final void m78272a(PL4 pl4) {
            C9066e c9066e;
            KV0 kv0;
            boolean z;
            String str;
            String str2;
            Uri m98831b;
            String uri;
            Uri m98830c;
            String uri2;
            AbstractC39181cW0 m90449a = pl4.m90449a();
            if (pl4.m90448b() != null) {
                Uri uri3 = null;
                if (m90449a instanceof KV0) {
                    kv0 = (KV0) m90449a;
                    c9066e = this;
                } else {
                    c9066e = this;
                    kv0 = null;
                }
                InterfaceC1880Ea interfaceC1880Ea = WV0.this.f41188u;
                if (kv0 != null) {
                    uri3 = kv0.m98831b();
                }
                if (uri3 == null && !(m90449a instanceof C39273cf6)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z2 = z;
                if (kv0 == null || (m98830c = kv0.m98830c()) == null || (uri2 = m98830c.toString()) == null) {
                    str = "";
                } else {
                    str = uri2;
                }
                if (kv0 == null || (m98831b = kv0.m98831b()) == null || (uri = m98831b.toString()) == null) {
                    str2 = "";
                } else {
                    str2 = uri;
                }
                interfaceC1880Ea.mo55905y(new C45721nW0(null, null, null, z2, false, false, str, str2, 7, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PL4 pl4) {
            m78272a(pl4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LPL4;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LPL4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WV0$f */
    /* loaded from: classes3.dex */
    public static final class C9067f extends Lambda implements Function1<PL4, InterfaceC23496h> {
        public C9067f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(PL4 pl4) {
            Intrinsics.checkNotNullParameter(pl4, "<name for destructuring parameter 0>");
            MV0 m90448b = pl4.m90448b();
            Intent m90447c = pl4.m90447c();
            if (m90448b == null) {
                m90448b = WV0.this.m78312F();
            }
            return m90448b.mo4134a(m90447c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/content/Intent;", "intent", "Lio/reactivex/u;", "Lkotlin/Pair;", "LcW0;", "kotlin.jvm.PlatformType", "c", "(Landroid/content/Intent;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WV0$g */
    /* loaded from: classes3.dex */
    public static final class C9068g extends Lambda implements Function1<Intent, InterfaceC24574u<? extends Pair<? extends AbstractC39181cW0, ? extends Intent>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LcW0;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: WV0$g$a */
        /* loaded from: classes3.dex */
        public static final class C9069a extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends AbstractC39181cW0>> {

            /* renamed from: g */
            public final /* synthetic */ WV0 f41201g;

            /* renamed from: h */
            public final /* synthetic */ Intent f41202h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9069a(WV0 wv0, Intent intent) {
                super(1);
                this.f41201g = wv0;
                this.f41202h = intent;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends AbstractC39181cW0> invoke(Throwable it) {
                KV0 m71271b;
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC42163hW0 interfaceC42163hW0 = this.f41201g.f41189v;
                Intent intent = this.f41202h;
                Intrinsics.checkNotNullExpressionValue(intent, "intent");
                AbstractC23442F<AbstractC39181cW0> m33140a0 = interfaceC42163hW0.mo30414e(intent).m33140a0(10L, TimeUnit.SECONDS);
                m71271b = C37995aW0.m71271b(this.f41202h);
                return m33140a0.m33148R(m71271b);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LcW0;", "it", "Lkotlin/Pair;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LcW0;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: WV0$g$b */
        /* loaded from: classes3.dex */
        public static final class C9070b extends Lambda implements Function1<AbstractC39181cW0, Pair<? extends AbstractC39181cW0, ? extends Intent>> {

            /* renamed from: g */
            public final /* synthetic */ Intent f41203g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9070b(Intent intent) {
                super(1);
                this.f41203g = intent;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<AbstractC39181cW0, Intent> invoke(AbstractC39181cW0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f41203g);
            }
        }

        public C9068g() {
            super(1);
        }

        /* renamed from: d */
        public static final Pair m78267d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Pair<AbstractC39181cW0, Intent>> invoke(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            AbstractC23442F<AbstractC39181cW0> mo30417b = WV0.this.f41189v.mo30417b(intent);
            final C9069a c9069a = new C9069a(WV0.this, intent);
            AbstractC23442F<AbstractC39181cW0> m33150P = mo30417b.m33150P(new InterfaceC23492o() { // from class: YV0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = WV0.C9068g.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C9070b c9070b = new C9070b(intent);
            return m33150P.m33157I(new InterfaceC23492o() { // from class: ZV0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m78267d;
                    m78267d = WV0.C9068g.m78267d(Function1.this, obj);
                    return m78267d;
                }
            }).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LcW0;", "deeplinkResult", "Lkotlin/Pair;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LcW0;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WV0$h */
    /* loaded from: classes3.dex */
    public static final class C9071h extends Lambda implements Function1<AbstractC39181cW0, Pair<? extends AbstractC39181cW0, ? extends Intent>> {

        /* renamed from: g */
        public final /* synthetic */ Intent f41204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9071h(Intent intent) {
            super(1);
            this.f41204g = intent;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<AbstractC39181cW0, Intent> invoke(AbstractC39181cW0 deeplinkResult) {
            Intrinsics.checkNotNullParameter(deeplinkResult, "deeplinkResult");
            return TuplesKt.m28425to(deeplinkResult, this.f41204g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LcW0;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: WV0$i */
    /* loaded from: classes3.dex */
    public static final class C9072i extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends AbstractC39181cW0>> {

        /* renamed from: h */
        public final /* synthetic */ Intent f41206h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9072i(Intent intent) {
            super(1);
            this.f41206h = intent;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends AbstractC39181cW0> invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return WV0.this.f41189v.mo30414e(this.f41206h).m33140a0(10L, TimeUnit.SECONDS);
        }
    }

    public WV0(Lazy<C45287mm3> operatorMainNavigator, Lazy<C43207jG2> mainNavigator, Lazy<QT0> dealNavigator, Lazy<C29526vP> birdPlusNavigator, Lazy<RU4> ridePassNavigator, Lazy<C45615nK2> mapNavigator, Lazy<C34721Nh3> openNavigator, Lazy<C40690f11> destinationNavigator, Lazy<IC1> giftNavigator, Lazy<C38984cA1> frequentFlyerNavigator, Lazy<C32426Dm3> operatorMapNavigator, Lazy<C34940Of6> urlOverrideDeepLinkNavigator, Lazy<C40386eW2> motmotDeepLinkNavigator, Lazy<C34323Lp1> fleetReportDeepLinkNavigator, Lazy<C44063ki5> saveMoneyDeepLinkNavigator, Lazy<DS1> idToolsDeepLinkNavigator, Lazy<C34962Oi1> externalDeepLinkNavigator, Lazy<C52010y66> transactionDeepLinkNavigator, Lazy<YZ3> preloadDeepLinkNavigator, Lazy<C43323jT1> identificationDeepLinkNavigator, InterfaceC1880Ea analyticsManager, InterfaceC42163hW0 deepLinkManager, InterfaceC6097Oh buildConfig, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, String deepLinkHostGo, String deepLinkHostGift) {
        Intrinsics.checkNotNullParameter(operatorMainNavigator, "operatorMainNavigator");
        Intrinsics.checkNotNullParameter(mainNavigator, "mainNavigator");
        Intrinsics.checkNotNullParameter(dealNavigator, "dealNavigator");
        Intrinsics.checkNotNullParameter(birdPlusNavigator, "birdPlusNavigator");
        Intrinsics.checkNotNullParameter(ridePassNavigator, "ridePassNavigator");
        Intrinsics.checkNotNullParameter(mapNavigator, "mapNavigator");
        Intrinsics.checkNotNullParameter(openNavigator, "openNavigator");
        Intrinsics.checkNotNullParameter(destinationNavigator, "destinationNavigator");
        Intrinsics.checkNotNullParameter(giftNavigator, "giftNavigator");
        Intrinsics.checkNotNullParameter(frequentFlyerNavigator, "frequentFlyerNavigator");
        Intrinsics.checkNotNullParameter(operatorMapNavigator, "operatorMapNavigator");
        Intrinsics.checkNotNullParameter(urlOverrideDeepLinkNavigator, "urlOverrideDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(motmotDeepLinkNavigator, "motmotDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(fleetReportDeepLinkNavigator, "fleetReportDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(saveMoneyDeepLinkNavigator, "saveMoneyDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(idToolsDeepLinkNavigator, "idToolsDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(externalDeepLinkNavigator, "externalDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(transactionDeepLinkNavigator, "transactionDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(preloadDeepLinkNavigator, "preloadDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(identificationDeepLinkNavigator, "identificationDeepLinkNavigator");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(deepLinkManager, "deepLinkManager");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(deepLinkHostGo, "deepLinkHostGo");
        Intrinsics.checkNotNullParameter(deepLinkHostGift, "deepLinkHostGift");
        this.f41168a = operatorMainNavigator;
        this.f41169b = mainNavigator;
        this.f41170c = dealNavigator;
        this.f41171d = birdPlusNavigator;
        this.f41172e = ridePassNavigator;
        this.f41173f = mapNavigator;
        this.f41174g = openNavigator;
        this.f41175h = destinationNavigator;
        this.f41176i = giftNavigator;
        this.f41177j = frequentFlyerNavigator;
        this.f41178k = operatorMapNavigator;
        this.f41179l = urlOverrideDeepLinkNavigator;
        this.f41180m = motmotDeepLinkNavigator;
        this.f41181n = fleetReportDeepLinkNavigator;
        this.f41182o = saveMoneyDeepLinkNavigator;
        this.f41183p = idToolsDeepLinkNavigator;
        this.f41184q = externalDeepLinkNavigator;
        this.f41185r = transactionDeepLinkNavigator;
        this.f41186s = preloadDeepLinkNavigator;
        this.f41187t = identificationDeepLinkNavigator;
        this.f41188u = analyticsManager;
        this.f41189v = deepLinkManager;
        this.f41190w = buildConfig;
        this.f41191x = navigator;
        this.f41192y = reactiveConfig;
        this.f41193z = deepLinkHostGo;
        this.f41166A = deepLinkHostGift;
    }

    /* renamed from: G */
    public static final void m78311G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23496h m78310H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final Intent m78309I(WV0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = this$0.f41167B;
        this$0.f41167B = null;
        return intent;
    }

    /* renamed from: J */
    public static final InterfaceC24574u m78308J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final PL4 m78307K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PL4) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final Pair m78306L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m78305M(boolean z, WV0 this$0, Intent intent) {
        Activity mo36934u3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z && (mo36934u3 = this$0.f41191x.mo36934u3()) != null) {
            mo36934u3.startActivity(intent);
        }
    }

    /* renamed from: N */
    public static final InterfaceC23447K m78304N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    public static /* synthetic */ EnumC46314oW0 getDeeplinkType$default(WV0 wv0, Intent intent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return wv0.m78288n(intent, z);
    }

    /* renamed from: A */
    public final boolean m78317A(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "preload_add_money")) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m78316B(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        if ((!Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "ride-pass")) && (!Intrinsics.areEqual(C33536If6.m101826b(data), "navigate") || !Intrinsics.areEqual(C33536If6.m101825c(data), "ride-pass"))) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m78315C(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "save-money")) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m78314D(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "transaction")) {
            return false;
        }
        if (data.getQueryParameter("ride_id") == null && data.getQueryParameter("receipt_id") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m78313E(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String uri = data.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "link.toString()");
        if (this.f41192y.m82623f8().m73665a().getScannerUrlRedirect(uri) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final MV0 m78312F() {
        if (this.f41190w.mo89930b()) {
            C45287mm3 c45287mm3 = this.f41168a.get();
            Intrinsics.checkNotNullExpressionValue(c45287mm3, "operatorMainNavigator.get()");
            return c45287mm3;
        }
        C43207jG2 c43207jG2 = this.f41169b.get();
        Intrinsics.checkNotNullExpressionValue(c43207jG2, "mainNavigator.get()");
        return c43207jG2;
    }

    /* renamed from: O */
    public final MV0 m78303O(EnumC46314oW0 enumC46314oW0) {
        switch (C9064c.$EnumSwitchMapping$0[enumC46314oW0.ordinal()]) {
            case 1:
                C40386eW2 c40386eW2 = this.f41180m.get();
                C41318g46.m40163a("detected motmot deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c40386eW2, "motmotDeepLinkNavigator.…cted motmot deep link\") }");
                return c40386eW2;
            case 2:
                C29526vP c29526vP = this.f41171d.get();
                C41318g46.m40163a("detected birdplus deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c29526vP, "birdPlusNavigator.get().…ted birdplus deep link\")}");
                return c29526vP;
            case 3:
                RU4 ru4 = this.f41172e.get();
                C41318g46.m40163a("detected ridepass deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(ru4, "ridePassNavigator.get().…ed ridepass deep link\") }");
                return ru4;
            case 4:
                C45615nK2 c45615nK2 = this.f41173f.get();
                C41318g46.m40163a("detected map deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c45615nK2, "mapNavigator.get().also …etected map deep link\") }");
                return c45615nK2;
            case 5:
                C34721Nh3 c34721Nh3 = this.f41174g.get();
                C41318g46.m40163a("detected open deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c34721Nh3, "openNavigator.get().also…tected open deep link\") }");
                return c34721Nh3;
            case 6:
                C40690f11 c40690f11 = this.f41175h.get();
                C41318g46.m40163a("detected destination deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c40690f11, "destinationNavigator.get…destination deep link\") }");
                return c40690f11;
            case 7:
                IC1 ic1 = this.f41176i.get();
                C41318g46.m40163a("detected gift deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(ic1, "giftNavigator.get().also…tected gift deep link\") }");
                return ic1;
            case 8:
                QT0 qt0 = this.f41170c.get();
                C41318g46.m40163a("detected deal deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(qt0, "dealNavigator.get().also…tected deal deep link\") }");
                return qt0;
            case 9:
                C38984cA1 c38984cA1 = this.f41177j.get();
                C41318g46.m40163a("detected frequent flyer deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c38984cA1, "frequentFlyerNavigator.g…quent flyer deep link\") }");
                return c38984cA1;
            case 10:
                C32426Dm3 c32426Dm3 = this.f41178k.get();
                C41318g46.m40163a("detected operator map deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c32426Dm3, "operatorMapNavigator.get…perator map deep link\") }");
                return c32426Dm3;
            case 11:
                C34940Of6 c34940Of6 = this.f41179l.get();
                C41318g46.m40163a("detected url override deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c34940Of6, "urlOverrideDeepLinkNavig…rl override deep link\") }");
                return c34940Of6;
            case 12:
                C34323Lp1 c34323Lp1 = this.f41181n.get();
                C41318g46.m40163a("detected fleet report deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c34323Lp1, "fleetReportDeepLinkNavig…leet report deep link\") }");
                return c34323Lp1;
            case 13:
                C44063ki5 c44063ki5 = this.f41182o.get();
                C41318g46.m40163a("detected save money deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c44063ki5, "saveMoneyDeepLinkNavigat… save money deep link\") }");
                return c44063ki5;
            case 14:
                DS1 ds1 = this.f41183p.get();
                C41318g46.m40163a("detected id tools deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(ds1, "idToolsDeepLinkNavigator…ed id tools deep link\") }");
                return ds1;
            case 15:
                C34962Oi1 c34962Oi1 = this.f41184q.get();
                C41318g46.m40163a("detected external deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c34962Oi1, "externalDeepLinkNavigato…ed external deep link\") }");
                return c34962Oi1;
            case 16:
                C52010y66 c52010y66 = this.f41185r.get();
                C41318g46.m40163a("detected transaction deep link", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c52010y66, "transactionDeepLinkNavig…transaction deep link\") }");
                return c52010y66;
            case 17:
                YZ3 yz3 = this.f41186s.get();
                C41318g46.m40163a("detected preload deep link ", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(yz3, "preloadDeepLinkNavigator…ed preload deep link \") }");
                return yz3;
            case 18:
                C43323jT1 c43323jT1 = this.f41187t.get();
                C41318g46.m40163a("detected identification deep link ", new Object[0]);
                Intrinsics.checkNotNullExpressionValue(c43323jT1, "identificationDeepLinkNa…tification deep link \") }");
                return c43323jT1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: P */
    public final MV0 m78302P(Intent intent, boolean z) {
        EnumC46314oW0 m78288n = m78288n(intent, z);
        if (m78288n != null) {
            return m78303O(m78288n);
        }
        return null;
    }

    @Override // p000.NV0
    /* renamed from: a */
    public AbstractC24507p<AbstractC39181cW0> mo78301a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23442F<AbstractC39181cW0> mo30417b = this.f41189v.mo30417b(intent);
        final C9072i c9072i = new C9072i(intent);
        AbstractC24507p<AbstractC39181cW0> m32065J = mo30417b.m33150P(new InterfaceC23492o() { // from class: VV0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m78304N;
                m78304N = WV0.m78304N(Function1.this, obj);
                return m78304N;
            }
        }).m33125j0().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "override fun parseDeepli…   .onErrorComplete()\n  }");
        return m32065J;
    }

    @Override // p000.NV0
    /* renamed from: b */
    public AbstractC23461c mo78300b() {
        AbstractC24507p m32071D = AbstractC24507p.m32071D(new Callable() { // from class: OV0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Intent m78309I;
                m78309I = WV0.m78309I(WV0.this);
                return m78309I;
            }
        });
        final C9068g c9068g = new C9068g();
        AbstractC24507p m32021x = m32071D.m32021x(new InterfaceC23492o() { // from class: PV0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m78308J;
                m78308J = WV0.m78308J(Function1.this, obj);
                return m78308J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32021x, "override fun navigate():…eturn navigate(maybe)\n  }");
        return NV0.C5589a.navigate$default(this, m32021x, false, 2, null);
    }

    @Override // p000.NV0
    /* renamed from: c */
    public AbstractC23461c mo78299c(String uri, final boolean z, boolean z2) {
        AbstractC24507p<AbstractC39181cW0> mo78301a;
        AbstractC24507p m32065J;
        AbstractC24507p<Pair<AbstractC39181cW0, Intent>> m32031n;
        AbstractC23461c mo78298d;
        PackageManager packageManager;
        boolean z3;
        Intrinsics.checkNotNullParameter(uri, "uri");
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
        intent.putExtra("restart", z2);
        Activity mo36934u3 = this.f41191x.mo36934u3();
        boolean z4 = false;
        if (mo36934u3 != null && (packageManager = mo36934u3.getPackageManager()) != null) {
            if (intent.resolveActivity(packageManager) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z4 = true;
            }
        }
        if (!z4) {
            intent = null;
        }
        if (intent != null && (mo78301a = mo78301a(intent)) != null) {
            final C9071h c9071h = new C9071h(intent);
            AbstractC24507p<R> m32067H = mo78301a.m32067H(new InterfaceC23492o() { // from class: TV0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m78306L;
                    m78306L = WV0.m78306L(Function1.this, obj);
                    return m78306L;
                }
            });
            if (m32067H != 0 && (m32065J = m32067H.m32065J()) != null && (m32031n = m32065J.m32031n(new InterfaceC23478a() { // from class: UV0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    WV0.m78305M(z, this, intent);
                }
            })) != null && (mo78298d = mo78298d(m32031n, z)) != null) {
                return mo78298d;
            }
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    @Override // p000.NV0
    /* renamed from: d */
    public AbstractC23461c mo78298d(AbstractC24507p<Pair<AbstractC39181cW0, Intent>> deepLinkMaybe, boolean z) {
        Intrinsics.checkNotNullParameter(deepLinkMaybe, "deepLinkMaybe");
        AbstractC23442F m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(C37995aW0.m71270c(null, 1, null), new Intent()));
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          // Otherwise…() to Intent())\n        }");
        AbstractC23442F<Pair<AbstractC39181cW0, Intent>> m32053W = deepLinkMaybe.m32053W(m33158H);
        final C9065d c9065d = new C9065d(z);
        AbstractC23442F<R> m33157I = m32053W.m33157I(new InterfaceC23492o() { // from class: QV0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                PL4 m78307K;
                m78307K = WV0.m78307K(Function1.this, obj);
                return m78307K;
            }
        });
        final C9066e c9066e = new C9066e();
        AbstractC23442F m33152N = m33157I.m33101w(new InterfaceC23484g() { // from class: RV0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                WV0.m78311G(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C9067f c9067f = new C9067f();
        AbstractC23461c m33164B = m33152N.m33164B(new InterfaceC23492o() { // from class: SV0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m78310H;
                m78310H = WV0.m78310H(Function1.this, obj);
                return m78310H;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun navigate(de…solvedIntent)\n      }\n  }");
        return m33164B;
    }

    @Override // p000.NV0
    /* renamed from: e */
    public void mo78297e(Intent intent) {
        boolean m71269d;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (this.f41167B != null) {
            m71269d = C37995aW0.m71269d(intent);
            if (!m71269d) {
                return;
            }
        }
        this.f41167B = new Intent(intent);
    }

    /* renamed from: n */
    public final EnumC46314oW0 m78288n(Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (m78278x(intent)) {
            return EnumC46314oW0.MOTMOT;
        }
        if (m78287o(intent)) {
            return EnumC46314oW0.BIRD_PLUS;
        }
        if (m78316B(intent)) {
            return EnumC46314oW0.RIDE_PASS;
        }
        if (m78279w(intent)) {
            return EnumC46314oW0.MAP;
        }
        if (m78277y(intent)) {
            return EnumC46314oW0.OPEN;
        }
        if (m78285q(intent)) {
            return EnumC46314oW0.DESTINATION;
        }
        if (m78282t(intent)) {
            return EnumC46314oW0.GIFT;
        }
        if (m78286p(intent)) {
            return EnumC46314oW0.DEAL;
        }
        if (m78283s(intent)) {
            return EnumC46314oW0.FREQUENT_FLYER;
        }
        if (m78276z(intent)) {
            return EnumC46314oW0.OPERATOR_MAP;
        }
        if (m78313E(intent)) {
            return EnumC46314oW0.URL_OVERRIDE;
        }
        if (m78284r(intent)) {
            return EnumC46314oW0.FLEET_REPORT;
        }
        if (m78315C(intent)) {
            return EnumC46314oW0.SAVE_MONEY;
        }
        if (m78281u(intent)) {
            return EnumC46314oW0.ID_TOOLS;
        }
        if (m78314D(intent)) {
            return EnumC46314oW0.TRANSACTION;
        }
        if (m78317A(intent)) {
            return EnumC46314oW0.PRELOAD;
        }
        if (m78280v(intent)) {
            return EnumC46314oW0.IDENTIFICATION;
        }
        if (z) {
            return EnumC46314oW0.EXTERNAL;
        }
        return null;
    }

    /* renamed from: o */
    public final boolean m78287o(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        if ((!Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "bird-plus")) && (!Intrinsics.areEqual(C33536If6.m101826b(data), "navigate") || !Intrinsics.areEqual(C33536If6.m101825c(data), "bird-plus"))) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m78286p(Intent intent) {
        Object obj;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            obj = extras.get("deal");
        } else {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m78285q(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "destination") || data.getQueryParameter("lat") == null) {
            return false;
        }
        if (data.getQueryParameter("lng") == null && data.getQueryParameter("lon") == null && data.getQueryParameter("long") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m78284r(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "operator") || !Intrinsics.areEqual(C33536If6.m101825c(data), "fleet-report")) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m78283s(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "open") || !Intrinsics.areEqual(data.getQueryParameter("destination"), "frequent_flyer")) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean m78282t(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41166A) || !Intrinsics.areEqual(data.getLastPathSegment(), "share") || data.getQueryParameter(PaymentMethodOptionsParams.Blik.PARAM_CODE) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean m78281u(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "operator") || !Intrinsics.areEqual(C33536If6.m101825c(data), "id-tools")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m78280v(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "id_verification")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m78279w(Intent intent) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String m101826b = C33536If6.m101826b(data);
        if (!Intrinsics.areEqual(data.getAuthority(), this.f41193z)) {
            return false;
        }
        if (!Intrinsics.areEqual(m101826b, "map") && !Intrinsics.areEqual(m101826b, "navigate")) {
            if (m101826b != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(m101826b);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        return false;
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }
        if (data.getQueryParameter("lat") == null) {
            return false;
        }
        if (data.getQueryParameter("lng") == null && data.getQueryParameter("lon") == null && data.getQueryParameter("long") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m78278x(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "motmot") || data.getQueryParameter("page") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m78277y(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "open") || Intrinsics.areEqual(data.getQueryParameter("destination"), "charger_onboarding") || Intrinsics.areEqual(data.getQueryParameter("destination"), "frequent_flyer")) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m78276z(Intent intent) {
        Object orNull;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getAuthority(), this.f41193z) || !Intrinsics.areEqual(C33536If6.m101826b(data), "operator")) {
            return false;
        }
        List<String> pathSegments = data.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "link.pathSegments");
        orNull = CollectionsKt___CollectionsKt.getOrNull(pathSegments, 1);
        if (!Intrinsics.areEqual(orNull, "map")) {
            return false;
        }
        return true;
    }
}
