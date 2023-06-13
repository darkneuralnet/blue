package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DynamicLinkConfiguration;
import co.bird.android.model.Link;
import co.bird.android.model.User;
import co.bird.android.model.constant.CouponOrigin;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireCouponDisplayView;
import co.bird.android.model.wire.WireCouponKt;
import co.bird.api.request.CreateCouponBody;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.PromotionsResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23446J;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.AD0;
import p000.C37791a94;
import p000.C49061t81;
import p000.C50246v81;
import p000.C50839w81;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BI\b\u0007\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\bW\u0010XJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0012\u0010\r\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J0\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u000f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\"\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u000f*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u0007H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0016\u0010\u001e\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R'\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\n078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b'\u0010:R!\u0010A\u001a\b\u0012\u0004\u0012\u00020>078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R'\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:R'\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\b4\u0010:R \u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\n0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020>0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010IR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010IR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010IR \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050R0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010I¨\u0006Y"}, m28432d2 = {"Ll84;", "LV74;", "Lbr4;", "", "s1", "Lco/bird/android/model/Link;", "link", "Lio/reactivex/F;", "", AbstractC26684u0.f100690q, "", "Lco/bird/android/model/wire/WireCoupon;", "v1", "k1", "coupons", "kotlin.jvm.PlatformType", "n0", "h0", "i", "x", "v", "linkCode", "g", "Lio/reactivex/c;", "f", "g0", "w", "z", "couponId", "c", "e", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/DynamicLinkConfiguration;", "Lco/bird/android/model/DynamicLinkConfiguration;", "dynamicLinkConfiguration", "LTg6;", DateTokenConverter.CONVERTER_KEY, "LTg6;", "userClient", "LAD0;", "LAD0;", "couponClient", "LBQ2;", "LBQ2;", "merchantClient", "LTq4;", "LTq4;", "reactiveConfig", "LKm1;", "h", "LKm1;", "dynamicLinks", "LZ84;", "Lkotlin/Lazy;", "y", "()LZ84;", "Lco/bird/android/model/wire/WireCouponDisplayView;", "j", "couponDisplayViews", "", "k", "r", "skipPreload", "l", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "promoOffers", "m", "noBatteryCoupons", "La94;", "n", "La94;", "mutableCoupons", "o", "mutableCouponDisplayViews", "p", "mutableSkipPreload", "q", "mutablePromoOffers", "mutableNoBatteryCoupons", "Lco/bird/android/buava/Optional;", "s", "freeRideLink", "LRh6;", "userStream", "<init>", "(LRh6;Landroid/content/Context;Lco/bird/android/model/DynamicLinkConfiguration;LTg6;LAD0;LBQ2;LTq4;LKm1;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n766#2:240\n857#2,2:241\n1747#2,3:243\n1045#2:246\n766#2:247\n857#2,2:248\n1549#2:250\n1620#2,3:251\n*S KotlinDebug\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl\n*L\n171#1:240\n171#1:241,2\n204#1:243,3\n208#1:246\n208#1:247\n208#1:248,2\n216#1:250\n216#1:251,3\n*E\n"})
/* renamed from: l84  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44321l84 implements V74, InterfaceC38798br4 {

    /* renamed from: b */
    public final Context f95591b;

    /* renamed from: c */
    public final DynamicLinkConfiguration f95592c;

    /* renamed from: d */
    public final InterfaceC36119Tg6 f95593d;

    /* renamed from: e */
    public final AD0 f95594e;

    /* renamed from: f */
    public final BQ2 f95595f;

    /* renamed from: g */
    public final C36207Tq4 f95596g;

    /* renamed from: h */
    public final AbstractC34062Km1 f95597h;

    /* renamed from: i */
    public final Lazy f95598i;

    /* renamed from: j */
    public final Lazy f95599j;

    /* renamed from: k */
    public final Lazy f95600k;

    /* renamed from: l */
    public final Lazy f95601l;

    /* renamed from: m */
    public final Lazy f95602m;

    /* renamed from: n */
    public final C37791a94<List<WireCoupon>> f95603n;

    /* renamed from: o */
    public final C37791a94<List<WireCouponDisplayView>> f95604o;

    /* renamed from: p */
    public final C37791a94<Boolean> f95605p;

    /* renamed from: q */
    public final C37791a94<List<WireCoupon>> f95606q;

    /* renamed from: r */
    public final C37791a94<List<WireCoupon>> f95607r;

    /* renamed from: s */
    public final C37791a94<Optional<Link>> f95608s;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$a */
    /* loaded from: classes4.dex */
    public static final class C25621a extends Lambda implements Function1<User, InterfaceC23496h> {
        public C25621a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44321l84.this.mo27795f().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$b */
    /* loaded from: classes4.dex */
    public static final class C25622b extends Lambda implements Function1<User, Unit> {
        public C25622b() {
            super(1);
        }

        /* renamed from: a */
        public final void m27761a(User user) {
            C44321l84.this.m27774s1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m27761a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l84$c */
    /* loaded from: classes4.dex */
    public static final class C25623c extends Lambda implements Function1<List<? extends WireCoupon>, Unit> {
        public C25623c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireCoupon> list) {
            invoke2((List<WireCoupon>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireCoupon> it) {
            C44321l84 c44321l84 = C44321l84.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c44321l84.m27767v1(it);
            C44321l84.this.m27783k1(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireCouponDisplayView;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$d */
    /* loaded from: classes4.dex */
    public static final class C25624d extends Lambda implements Function0<Z84<List<? extends WireCouponDisplayView>>> {
        public C25624d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireCouponDisplayView>> invoke2() {
            return Z84.f47888d.m73663b(C44321l84.this.f95604o);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$e */
    /* loaded from: classes4.dex */
    public static final class C25625e extends Lambda implements Function0<Z84<List<? extends WireCoupon>>> {
        public C25625e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireCoupon>> invoke2() {
            return Z84.f47888d.m73663b(C44321l84.this.f95603n);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireCoupon;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/CollectionResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$f */
    /* loaded from: classes4.dex */
    public static final class C25626f extends Lambda implements Function1<CollectionResponse<WireCoupon>, List<WireCoupon>> {

        /* renamed from: g */
        public static final C25626f f95614g = new C25626f();

        public C25626f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireCoupon> invoke(CollectionResponse<WireCoupon> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getItems();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l84$g */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C25627g extends FunctionReferenceImpl implements Function1<List<? extends WireCoupon>, AbstractC23442F<List<? extends WireCoupon>>> {
        public C25627g(Object obj) {
            super(1, obj, C44321l84.class, "fetchCouponExtensions", "fetchCouponExtensions(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<WireCoupon>> invoke(List<WireCoupon> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C44321l84) this.receiver).m27780n0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCoupon;", "coupons", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCoupon$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n766#2:240\n857#2,2:241\n*S KotlinDebug\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCoupon$3\n*L\n232#1:240\n232#1:241,2\n*E\n"})
    /* renamed from: l84$h */
    /* loaded from: classes4.dex */
    public static final class C25628h extends Lambda implements Function1<List<? extends WireCoupon>, List<? extends WireCoupon>> {
        public C25628h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireCoupon> invoke(List<WireCoupon> coupons) {
            boolean z;
            Intrinsics.checkNotNullParameter(coupons, "coupons");
            C44321l84 c44321l84 = C44321l84.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : coupons) {
                WireCoupon wireCoupon = (WireCoupon) obj;
                if (Intrinsics.areEqual(wireCoupon.getCurrency(), c44321l84.f95596g.m82623f8().getValue().getRideConfig().getCurrency()) && !WireCouponKt.expired(wireCoupon)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LMD0;", "response", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LMD0;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPromoManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCouponExtensions$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1549#2:240\n1620#2,3:241\n*S KotlinDebug\n*F\n+ 1 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl$fetchCouponExtensions$2\n*L\n219#1:240\n219#1:241,3\n*E\n"})
    /* renamed from: l84$i */
    /* loaded from: classes4.dex */
    public static final class C25629i extends Lambda implements Function1<MD0, List<? extends WireCoupon>> {

        /* renamed from: g */
        public final /* synthetic */ List<WireCoupon> f95616g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25629i(List<WireCoupon> list) {
            super(1);
            this.f95616g = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireCoupon> invoke(MD0 response) {
            int collectionSizeOrDefault;
            WireCoupon copy;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireCoupon> list = this.f95616g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireCoupon wireCoupon : list) {
                copy = wireCoupon.copy((r35 & 1) != 0 ? wireCoupon.f66723id : null, (r35 & 2) != 0 ? wireCoupon.userId : null, (r35 & 4) != 0 ? wireCoupon.rideId : null, (r35 & 8) != 0 ? wireCoupon.linkId : null, (r35 & 16) != 0 ? wireCoupon.inviteeId : null, (r35 & 32) != 0 ? wireCoupon.maxAmount : 0, (r35 & 64) != 0 ? wireCoupon.currency : null, (r35 & 128) != 0 ? wireCoupon.redeemedAmount : null, (r35 & 256) != 0 ? wireCoupon.kind : null, (r35 & 512) != 0 ? wireCoupon.createdAt : null, (r35 & 1024) != 0 ? wireCoupon.activatedAt : null, (r35 & 2048) != 0 ? wireCoupon.expiresAt : null, (r35 & 4096) != 0 ? wireCoupon.redeemedAt : null, (r35 & 8192) != 0 ? wireCoupon.canSkipPreload : false, (r35 & 16384) != 0 ? wireCoupon.origin : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireCoupon.storeIds : response.m95571c(wireCoupon.getId()), (r35 & 65536) != 0 ? wireCoupon.merchantIds : response.m95572b(wireCoupon.getId()));
                arrayList.add(copy);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Link;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Link;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$j */
    /* loaded from: classes4.dex */
    public static final class C25630j extends Lambda implements Function1<Link, Unit> {
        public C25630j() {
            super(1);
        }

        /* renamed from: a */
        public final void m27756a(Link it) {
            C37791a94 c37791a94 = C44321l84.this.f95608s;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37791a94.accept(c14443a.m59032c(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Link link) {
            m27756a(link);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l84$k */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C25631k extends FunctionReferenceImpl implements Function1<Link, AbstractC23442F<String>> {
        public C25631k(Object obj) {
            super(1, obj, C44321l84.class, "getShortDynamicLink", "getShortDynamicLink(Lco/bird/android/model/Link;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<String> invoke(Link p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C44321l84) this.receiver).m27771u0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LUz5;", "kotlin.jvm.PlatformType", "shortLink", "", C17296a.f69688o, "(LUz5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$l */
    /* loaded from: classes4.dex */
    public static final class C25632l extends Lambda implements Function1<InterfaceC36523Uz5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC23444H<String> f95618g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25632l(InterfaceC23444H<String> interfaceC23444H) {
            super(1);
            this.f95618g = interfaceC23444H;
        }

        /* renamed from: a */
        public final void m27754a(InterfaceC36523Uz5 interfaceC36523Uz5) {
            this.f95618g.onSuccess(String.valueOf(interfaceC36523Uz5.mo47298b()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36523Uz5 interfaceC36523Uz5) {
            m27754a(interfaceC36523Uz5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PromoManagerImpl.kt\nco/bird/android/manager/ride/PromoManagerImpl\n*L\n1#1,328:1\n208#2:329\n*E\n"})
    /* renamed from: l84$m */
    /* loaded from: classes4.dex */
    public static final class C25633m<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((WireCoupon) t).getActivatedAt(), ((WireCoupon) t2).getActivatedAt());
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$n */
    /* loaded from: classes4.dex */
    public static final class C25634n extends Lambda implements Function0<Z84<List<? extends WireCoupon>>> {
        public C25634n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireCoupon>> invoke2() {
            return Z84.f47888d.m73663b(C44321l84.this.f95607r);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$o */
    /* loaded from: classes4.dex */
    public static final class C25635o extends Lambda implements Function0<Z84<List<? extends WireCoupon>>> {
        public C25635o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireCoupon>> invoke2() {
            return Z84.f47888d.m73663b(C44321l84.this.f95606q);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "newCoupon", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireCoupon;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$p */
    /* loaded from: classes4.dex */
    public static final class C25636p extends Lambda implements Function1<WireCoupon, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCoupon;", "existingCoupons", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: l84$p$a */
        /* loaded from: classes4.dex */
        public static final class C25637a extends Lambda implements Function1<List<? extends WireCoupon>, List<? extends WireCoupon>> {

            /* renamed from: g */
            public final /* synthetic */ WireCoupon f95622g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25637a(WireCoupon wireCoupon) {
                super(1);
                this.f95622g = wireCoupon;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<WireCoupon> invoke(List<WireCoupon> existingCoupons) {
                List<WireCoupon> plus;
                Intrinsics.checkNotNullParameter(existingCoupons, "existingCoupons");
                WireCoupon newCoupon = this.f95622g;
                Intrinsics.checkNotNullExpressionValue(newCoupon, "newCoupon");
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireCoupon>) ((Collection<? extends Object>) existingCoupons), newCoupon);
                return plus;
            }
        }

        public C25636p() {
            super(1);
        }

        /* renamed from: a */
        public final void m27753a(WireCoupon wireCoupon) {
            C44321l84.this.f95603n.m71837i(new C25637a(wireCoupon));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireCoupon wireCoupon) {
            m27753a(wireCoupon);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/PromotionsResponse;", "it", "", "Lco/bird/android/model/wire/WireCouponDisplayView;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/PromotionsResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$q */
    /* loaded from: classes4.dex */
    public static final class C25638q extends Lambda implements Function1<PromotionsResponse, List<? extends WireCouponDisplayView>> {

        /* renamed from: g */
        public static final C25638q f95623g = new C25638q();

        public C25638q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireCouponDisplayView> invoke(PromotionsResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getIssued();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: l84$r */
    /* loaded from: classes4.dex */
    public static final class C25639r extends Lambda implements Function0<Z84<Boolean>> {
        public C25639r() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Boolean> invoke() {
            return Z84.f47888d.m73663b(C44321l84.this.f95605p);
        }
    }

    public C44321l84(InterfaceC35660Rh6 userStream, Context context, DynamicLinkConfiguration dynamicLinkConfiguration, InterfaceC36119Tg6 userClient, AD0 couponClient, BQ2 merchantClient, C36207Tq4 reactiveConfig, AbstractC34062Km1 dynamicLinks) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        List emptyList;
        List emptyList2;
        List emptyList3;
        List emptyList4;
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dynamicLinkConfiguration, "dynamicLinkConfiguration");
        Intrinsics.checkNotNullParameter(userClient, "userClient");
        Intrinsics.checkNotNullParameter(couponClient, "couponClient");
        Intrinsics.checkNotNullParameter(merchantClient, "merchantClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(dynamicLinks, "dynamicLinks");
        this.f95591b = context;
        this.f95592c = dynamicLinkConfiguration;
        this.f95593d = userClient;
        this.f95594e = couponClient;
        this.f95595f = merchantClient;
        this.f95596g = reactiveConfig;
        this.f95597h = dynamicLinks;
        lazy = LazyKt__LazyJVMKt.lazy(new C25625e());
        this.f95598i = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C25624d());
        this.f95599j = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C25639r());
        this.f95600k = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C25635o());
        this.f95601l = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C25634n());
        this.f95602m = lazy5;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C37791a94<List<WireCoupon>> create$default = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        this.f95603n = create$default;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        this.f95604o = C37791a94.C10586a.create$default(c10586a, emptyList2, null, 2, null);
        this.f95605p = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
        this.f95606q = C37791a94.C10586a.create$default(c10586a, emptyList3, null, 2, null);
        emptyList4 = CollectionsKt__CollectionsKt.emptyList();
        this.f95607r = C37791a94.C10586a.create$default(c10586a, emptyList4, null, 2, null);
        this.f95608s = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        Observable<User> mo76579f = userStream.mo76579f();
        final C25621a c25621a = new C25621a();
        mo76579f.flatMapCompletable(new InterfaceC23492o() { // from class: c84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m27799c0;
                m27799c0 = C44321l84.m27799c0(Function1.this, obj);
                return m27799c0;
            }
        }).subscribe();
        Observable<User> mo76576i = userStream.mo76576i();
        final C25622b c25622b = new C25622b();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: d84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44321l84.m27796e0(Function1.this, obj);
            }
        });
        final C25623c c25623c = new C25623c();
        create$default.subscribe(new InterfaceC23484g() { // from class: e84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44321l84.m27794f0(Function1.this, obj);
            }
        });
    }

    /* renamed from: c0 */
    public static final InterfaceC23496h m27799c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m27796e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m27794f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final void m27791g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final void m27788h1(InterfaceC23444H emitter, Exception it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it, "it");
        emitter.onError(it);
    }

    /* renamed from: i1 */
    public static final InterfaceC23496h m27786i1(C44321l84 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return C38096ag5.completeAfterRetry$default(this$0.mo27795f(), 0L, 1, null);
    }

    /* renamed from: j0 */
    public static final List m27785j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final InterfaceC23447K m27784k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final List m27781m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final List m27779o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m27778q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final List m27776r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m27775s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC23447K m27773t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m27768v0(C44321l84 this$0, Link link, final InterfaceC23444H emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(link, "$link");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        C49654u81 mo96370a = this$0.f95597h.mo96370a();
        String giftDomain = this$0.f95592c.getGiftDomain();
        mo96370a.m10817c(giftDomain + "/links");
        String giftDomain2 = this$0.f95592c.getGiftDomain();
        String code = link.getCode();
        mo96370a.m10815e(Uri.parse(giftDomain2 + "/share?code=" + code));
        C49061t81.C28534a c28534a = new C49061t81.C28534a();
        c28534a.m13014b(1430);
        mo96370a.m10818b(c28534a.m13015a());
        C50246v81.C29424a c29424a = new C50246v81.C29424a(this$0.f95592c.getBundleId());
        c29424a.m9143b(this$0.f95592c.getAppStoreId());
        mo96370a.m10816d(c29424a.m9144a());
        C50839w81.C29785a c29785a = new C50839w81.C29785a();
        c29785a.m7362d(this$0.f95591b.getString(C45871nl4.free_rides_share_title));
        c29785a.m7364b(this$0.f95591b.getString(C45871nl4.free_rides_share_content));
        c29785a.m7363c(Uri.parse(this$0.f95591b.getString(C48835sl4.share_free_rides_image_url)));
        mo96370a.m10814f(c29785a.m7365a());
        Task<InterfaceC36523Uz5> addOnFailureListener = mo96370a.m10819a(2).addOnFailureListener(new OnFailureListener() { // from class: Y74
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C44321l84.m27788h1(InterfaceC23444H.this, exc);
            }
        });
        final C25632l c25632l = new C25632l(emitter);
        addOnFailureListener.addOnSuccessListener(new OnSuccessListener() { // from class: Z74
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C44321l84.m27791g1(Function1.this, obj);
            }
        });
    }

    @Override // p000.V74
    /* renamed from: C */
    public Z84<List<WireCoupon>> mo27815C() {
        return (Z84) this.f95601l.getValue();
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.V74
    /* renamed from: d */
    public Z84<List<WireCouponDisplayView>> mo27798d() {
        return (Z84) this.f95599j.getValue();
    }

    @Override // p000.V74
    /* renamed from: e */
    public void mo27797e(List<WireCoupon> coupons) {
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        if (coupons.isEmpty()) {
            C38096ag5.completeAfterRetry$default(mo27763z(), 0L, 1, null).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: b84
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m27786i1;
                    m27786i1 = C44321l84.m27786i1(C44321l84.this);
                    return m27786i1;
                }
            })).subscribe();
        } else {
            m27792g0(coupons);
        }
    }

    @Override // p000.V74
    /* renamed from: f */
    public AbstractC23461c mo27795f() {
        AbstractC23461c m33159G = m27789h0().m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "fetchCoupon().ignoreElement()");
        AbstractC23461c m27772t1 = m27772t1(m33159G);
        Intrinsics.checkNotNullExpressionValue(m27772t1, "fetchCoupon().ignoreElement().schedulers()");
        return m27772t1;
    }

    @Override // p000.V74
    /* renamed from: g */
    public AbstractC23442F<WireCoupon> mo27793g(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        AbstractC23442F<WireCoupon> m115998f = this.f95594e.m115998f(new CreateCouponBody(linkCode));
        final C25636p c25636p = new C25636p();
        AbstractC23442F<WireCoupon> m33101w = m115998f.m33101w(new InterfaceC23484g() { // from class: a84
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44321l84.m27778q1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun redeemCoupo…}\n      .schedulers()\n  }");
        AbstractC23442F<WireCoupon> m27770u1 = m27770u1(m33101w);
        Intrinsics.checkNotNullExpressionValue(m27770u1, "override fun redeemCoupo…}\n      .schedulers()\n  }");
        return m27770u1;
    }

    /* renamed from: g0 */
    public void m27792g0(List<WireCoupon> coupons) {
        boolean z;
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        ArrayList arrayList = new ArrayList();
        for (Object obj : coupons) {
            if (((WireCoupon) obj).getOrigin() == CouponOrigin.LOW_BATTERY_RIDE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        this.f95607r.accept(arrayList);
    }

    @Override // p000.V74
    /* renamed from: h */
    public Z84<List<WireCoupon>> mo27790h() {
        return (Z84) this.f95602m.getValue();
    }

    /* renamed from: h0 */
    public final AbstractC23442F<List<WireCoupon>> m27789h0() {
        AbstractC23442F unRedeemedCoupon$default = AD0.C0054a.getUnRedeemedCoupon$default(this.f95594e, false, 1, null);
        final C25626f c25626f = C25626f.f95614g;
        AbstractC23442F m33157I = unRedeemedCoupon$default.m33157I(new InterfaceC23492o() { // from class: h84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m27785j0;
                m27785j0 = C44321l84.m27785j0(Function1.this, obj);
                return m27785j0;
            }
        });
        final C25627g c25627g = new C25627g(this);
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: i84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m27784k0;
                m27784k0 = C44321l84.m27784k0(Function1.this, obj);
                return m27784k0;
            }
        });
        final C25628h c25628h = new C25628h();
        AbstractC23442F<List<WireCoupon>> m33101w = m33165A.m33157I(new InterfaceC23492o() { // from class: j84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m27781m0;
                m27781m0 = C44321l84.m27781m0(Function1.this, obj);
                return m27781m0;
            }
        }).m33101w(this.f95603n);
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun fetchCoupon(…OnSuccess(mutableCoupons)");
        return m33101w;
    }

    @Override // p000.V74
    /* renamed from: i */
    public AbstractC23442F<List<WireCoupon>> mo27787i() {
        AbstractC23442F<List<WireCoupon>> m27770u1 = m27770u1(m27789h0());
        Intrinsics.checkNotNullExpressionValue(m27770u1, "fetchCoupon().schedulers()");
        return m27770u1;
    }

    /* renamed from: k1 */
    public final void m27783k1(List<WireCoupon> list) {
        List sortedWith;
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C25633m());
        ArrayList arrayList = new ArrayList();
        for (Object obj : sortedWith) {
            if (WireCouponKt.isPromotional((WireCoupon) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f95606q.accept(arrayList);
        }
    }

    /* renamed from: n0 */
    public final AbstractC23442F<List<WireCoupon>> m27780n0(List<WireCoupon> list) {
        int collectionSizeOrDefault;
        BQ2 bq2 = this.f95595f;
        List<WireCoupon> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireCoupon wireCoupon : list2) {
            arrayList.add(wireCoupon.getId());
        }
        AbstractC23442F<MD0> m114048c = bq2.m114048c(new LD0(arrayList));
        final C25629i c25629i = new C25629i(list);
        AbstractC23442F m33157I = m114048c.m33157I(new InterfaceC23492o() { // from class: W74
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m27779o0;
                m27779o0 = C44321l84.m27779o0(Function1.this, obj);
                return m27779o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "coupons: List<WireCoupon…(it.id)\n      )\n    }\n  }");
        return m33157I;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.V74
    /* renamed from: r */
    public Z84<Boolean> mo27777r() {
        return (Z84) this.f95600k.getValue();
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    /* renamed from: s1 */
    public final void m27774s1() {
        this.f95603n.m71836j();
        this.f95605p.m71836j();
        this.f95606q.m71836j();
        this.f95607r.m71836j();
        this.f95604o.m71836j();
        this.f95608s.m71836j();
    }

    /* renamed from: t1 */
    public AbstractC23461c m27772t1(AbstractC23461c abstractC23461c) {
        return InterfaceC38798br4.C13315a.m62282m(this, abstractC23461c);
    }

    /* renamed from: u0 */
    public final AbstractC23442F<String> m27771u0(final Link link) {
        AbstractC23442F<String> m33126j = AbstractC23442F.m33126j(new InterfaceC23446J() { // from class: f84
            @Override // io.reactivex.InterfaceC23446J
            public final void subscribe(InterfaceC23444H interfaceC23444H) {
                C44321l84.m27768v0(C44321l84.this, link, interfaceC23444H);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33126j, "create { emitter ->\n    …ink.toString())\n    }\n  }");
        return m33126j;
    }

    /* renamed from: u1 */
    public <T> AbstractC23442F<T> m27770u1(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.V74
    /* renamed from: v */
    public AbstractC23442F<String> mo27769v() {
        AbstractC23442F<Link> mo27765x = mo27765x();
        final C25631k c25631k = new C25631k(this);
        AbstractC23442F m33165A = mo27765x.m33165A(new InterfaceC23492o() { // from class: k84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m27773t0;
                m27773t0 = C44321l84.m27773t0(Function1.this, obj);
                return m27773t0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "getFreeRideLink().flatMap(::getShortDynamicLink)");
        return m33165A;
    }

    /* renamed from: v1 */
    public final void m27767v1(List<WireCoupon> list) {
        boolean z;
        C37791a94<Boolean> c37791a94 = this.f95605p;
        List<WireCoupon> list2 = list;
        boolean z2 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WireCoupon wireCoupon = (WireCoupon) it.next();
                if (wireCoupon.getCanSkipPreload() && wireCoupon.getRedeemedAt() == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        c37791a94.accept(Boolean.valueOf(z2));
    }

    @Override // p000.V74
    /* renamed from: w */
    public void mo27766w() {
        this.f95607r.m71836j();
    }

    @Override // p000.V74
    /* renamed from: x */
    public AbstractC23442F<Link> mo27765x() {
        AbstractC23442F<Optional<Link>> firstOrError = this.f95608s.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "freeRideLink.firstOrError()");
        AbstractC24507p m74577R = C37279Yf5.m74577R(firstOrError);
        AbstractC23442F<Link> m83171w = this.f95593d.m83171w();
        final C25630j c25630j = new C25630j();
        AbstractC23442F<Link> m32053W = m74577R.m32053W(m83171w.m33101w(new InterfaceC23484g() { // from class: X74
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44321l84.m27775s0(Function1.this, obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m32053W, "override fun getFreeRide…(Optional.of(it)) }\n    )");
        return m32053W;
    }

    @Override // p000.V74
    /* renamed from: y */
    public Z84<List<WireCoupon>> mo27764y() {
        return (Z84) this.f95598i.getValue();
    }

    @Override // p000.V74
    /* renamed from: z */
    public AbstractC23461c mo27763z() {
        AbstractC23442F<PromotionsResponse> m116000d = this.f95594e.m116000d();
        final C25638q c25638q = C25638q.f95623g;
        AbstractC23461c m33159G = m116000d.m33157I(new InterfaceC23492o() { // from class: g84
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m27776r1;
                m27776r1 = C44321l84.m27776r1(Function1.this, obj);
                return m27776r1;
            }
        }).m33101w(this.f95604o).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "couponClient.getCouponDi…s)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.V74
    /* renamed from: c */
    public AbstractC23461c mo27800c(String couponId) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        AbstractC23461c m33159G = this.f95594e.m116001c(couponId).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "couponClient.activateCou…d)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }
}
