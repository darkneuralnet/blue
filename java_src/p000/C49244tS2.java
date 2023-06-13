package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Listing;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantTransaction;
import co.bird.api.response.MerchantSiteResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
import p000.ZD3;
import retrofit2.HttpException;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\bL\u0010MJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J,\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\nH\u0016R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R.\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 )*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R&\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u00100R8\u00102\u001a&\u0012\f\u0012\n )*\u0004\u0018\u00010\u00130\u0013 )*\u0012\u0012\f\u0012\n )*\u0004\u0018\u00010\u00130\u0013\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R:\u00104\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r )*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u00050\u00050(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+R\"\u00107\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00100\u0010058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R&\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b*\u00100R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b9\u00100R,\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00050-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b\"\u00100R&\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b;\u00100R\u0014\u0010D\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010F¨\u0006N"}, m28432d2 = {"LtS2;", "LaS2;", "", "userId", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "P", "merchantId", "", "Lco/bird/android/model/wire/WireMerchantSite;", "T", "storeId", "Lco/bird/android/model/Listing;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "i", "", "b", "merchantSiteId", "", "open", "LHM4;", "", "e", "siteId", "enabled", "Lio/reactivex/c;", "g", "Lco/bird/android/model/wire/WireLocation;", "location", DateTokenConverter.CONVERTER_KEY, "store", "f", "LBQ2;", C17296a.f69688o, "LBQ2;", "merchantApi", "LeT2;", "LeT2;", "merchantSiteApi", "LAG;", "kotlin.jvm.PlatformType", "c", "LAG;", "_merchant", "Lio/reactivex/Observable;", "Lio/reactivex/Observable;", "h", "()Lio/reactivex/Observable;", "merchant", "hasMerchant", "merchantEnabled", "_merchantTransactionListing", "Lio/reactivex/subjects/a;", "Lio/reactivex/subjects/a;", "_newTransactionAvailable", "_currentStore", "j", "currentStore", "k", "isMerchant", "l", "merchantTransactionListing", "m", "sites", "Lg46$b;", "N", "()Lg46$b;", "logger", "", "()I", "storeCount", "LRh6;", "userStream", "LTq4;", "reactiveConfig", "<init>", "(LRh6;LTq4;LBQ2;LeT2;)V", "merchant_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantManagerImpl.kt\nco/bird/android/manager/merchant/MerchantManagerImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,250:1\n22#2,2:251\n180#3:253\n180#3:254\n180#3:255\n180#3:256\n*S KotlinDebug\n*F\n+ 1 MerchantManagerImpl.kt\nco/bird/android/manager/merchant/MerchantManagerImpl\n*L\n64#1:251,2\n92#1:253\n99#1:254\n110#1:255\n127#1:256\n*E\n"})
/* renamed from: tS2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49244tS2 implements InterfaceC37961aS2 {

    /* renamed from: a */
    public final BQ2 f110486a;

    /* renamed from: b */
    public final InterfaceC40359eT2 f110487b;

    /* renamed from: c */
    public final C0058AG<Optional<WireMerchantDescription>> f110488c;

    /* renamed from: d */
    public final Observable<Optional<WireMerchantDescription>> f110489d;

    /* renamed from: e */
    public final Observable<Boolean> f110490e;

    /* renamed from: f */
    public final Observable<Boolean> f110491f;

    /* renamed from: g */
    public final C0058AG<Optional<Listing<WireMerchantTransaction>>> f110492g;

    /* renamed from: h */
    public final C24552a<Unit> f110493h;

    /* renamed from: i */
    public final C0058AG<Optional<WireMerchantSite>> f110494i;

    /* renamed from: j */
    public final Observable<Optional<WireMerchantSite>> f110495j;

    /* renamed from: k */
    public final Observable<Boolean> f110496k;

    /* renamed from: l */
    public final Observable<Optional<Listing<WireMerchantTransaction>>> f110497l;

    /* renamed from: m */
    public final Observable<List<WireMerchantSite>> f110498m;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$a */
    /* loaded from: classes4.dex */
    public static final class C28701a extends Lambda implements Function1<User, InterfaceC23447K<? extends Optional<WireMerchantDescription>>> {
        public C28701a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Optional<WireMerchantDescription>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            return C49244tS2.this.m12356P(user.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "kotlin.jvm.PlatformType", "merchant", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$b */
    /* loaded from: classes4.dex */
    public static final class C28702b extends Lambda implements Function1<Optional<WireMerchantDescription>, Unit> {
        public C28702b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12319a(Optional<WireMerchantDescription> optional) {
            C49244tS2.this.f110488c.accept(optional);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantDescription> optional) {
            m12319a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tS2$c */
    /* loaded from: classes4.dex */
    public static final class C28703c extends Lambda implements Function1<Throwable, Unit> {
        public C28703c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49244tS2.this.m12358N().mo7223j(th, "Unknown error occurred when loading merchant state.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$d */
    /* loaded from: classes4.dex */
    public static final class C28704d extends Lambda implements Function1<User, Unit> {
        public C28704d() {
            super(1);
        }

        /* renamed from: a */
        public final void m12318a(User user) {
            C49244tS2.this.m12358N().mo7221o("Clearing merchant state on logout.", new Object[0]);
            C0058AG c0058ag = C49244tS2.this.f110488c;
            Optional.C14443a c14443a = Optional.f63040c;
            c0058ag.accept(c14443a.m59034a());
            C49244tS2.this.f110494i.accept(c14443a.m59034a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m12318a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tS2$e */
    /* loaded from: classes4.dex */
    public static final class C28705e extends Lambda implements Function1<Throwable, Unit> {
        public C28705e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49244tS2.this.m12358N().mo7223j(th, "Unknown error occurred when clearing merchant sites.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "storeOption", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$f */
    /* loaded from: classes4.dex */
    public static final class C28706f extends Lambda implements Function1<Optional<WireMerchantSite>, Unit> {
        public C28706f() {
            super(1);
        }

        /* renamed from: a */
        public final void m12317a(Optional<WireMerchantSite> optional) {
            Optional m59034a;
            C0058AG c0058ag = C49244tS2.this.f110492g;
            if (optional.m59037c()) {
                m59034a = Optional.f63040c.m59032c(C49244tS2.this.mo12338i(optional.m59038b().getMerchant().getId(), optional.m59038b().getId()));
            } else {
                m59034a = Optional.f63040c.m59034a();
            }
            c0058ag.accept(m59034a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireMerchantSite> optional) {
            m12317a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tS2$g */
    /* loaded from: classes4.dex */
    public static final class C28707g extends Lambda implements Function1<Throwable, Unit> {
        public C28707g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49244tS2.this.m12358N().mo7223j(th, "Error occurred when loading merchant transactions.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0004*,\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tS2$h */
    /* loaded from: classes4.dex */
    public static final class C28708h extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<WireMerchantSite>>, Unit> {
        public C28708h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<WireMerchantSite>> pair) {
            invoke2((Pair<Unit, Optional<WireMerchantSite>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<WireMerchantSite>> pair) {
            Optional<WireMerchantSite> component2 = pair.component2();
            if (component2.m59037c()) {
                C49244tS2.this.f110492g.accept(Optional.f63040c.m59032c(C49244tS2.this.mo12338i(component2.m59038b().getMerchant().getId(), component2.m59038b().getId())));
            } else {
                C49244tS2.this.f110492g.accept(Optional.f63040c.m59034a());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tS2$i */
    /* loaded from: classes4.dex */
    public static final class C28709i extends Lambda implements Function1<Throwable, Unit> {
        public C28709i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49244tS2.this.m12358N().mo7223j(th, "Error occurred when loading merchant transactions.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$j */
    /* loaded from: classes4.dex */
    public static final class C28710j extends Lambda implements Function1<Optional<WireMerchantDescription>, Boolean> {

        /* renamed from: g */
        public static final C28710j f110508g = new C28710j();

        public C28710j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<WireMerchantDescription> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "throwable", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$k */
    /* loaded from: classes4.dex */
    public static final class C28711k extends Lambda implements Function1<Throwable, Boolean> {
        public C28711k() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if (r4 != false) goto L16;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Throwable throwable) {
            boolean z;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            boolean z2 = true;
            if (!(throwable instanceof SocketTimeoutException)) {
                if (throwable instanceof HttpException) {
                    int m15616a = ((HttpException) throwable).m15616a();
                    if (m15616a == 404) {
                        C49244tS2.this.m12358N().mo7221o("No merchant associated with the user.", new Object[0]);
                    } else if (500 <= m15616a && m15616a < 600) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantDescription;", "merchant", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantDescription;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$l */
    /* loaded from: classes4.dex */
    public static final class C28712l extends Lambda implements Function1<WireMerchantDescription, Optional<WireMerchantDescription>> {

        /* renamed from: g */
        public static final C28712l f110510g = new C28712l();

        public C28712l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireMerchantDescription> invoke(WireMerchantDescription merchant) {
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            return Optional.f63040c.m59032c(merchant);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "count", "", "throwable", "", C17296a.f69688o, "(Ljava/lang/Integer;Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$m */
    /* loaded from: classes4.dex */
    public static final class C28713m extends Lambda implements Function2<Integer, Throwable, Boolean> {

        /* renamed from: g */
        public static final C28713m f110511g = new C28713m();

        public C28713m() {
            super(2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
            if (r4 != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
            if (r4.intValue() < 3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
            r1 = false;
         */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Integer count, Throwable throwable) {
            boolean z;
            Intrinsics.checkNotNullParameter(count, "count");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            boolean z2 = true;
            if (!(throwable instanceof SocketTimeoutException)) {
                if (throwable instanceof HttpException) {
                    int m15616a = ((HttpException) throwable).m15616a();
                    if (500 <= m15616a && m15616a < 600) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/MerchantSiteResponse;", "response", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/MerchantSiteResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$n */
    /* loaded from: classes4.dex */
    public static final class C28714n extends Lambda implements Function1<MerchantSiteResponse, List<? extends WireMerchantSite>> {

        /* renamed from: g */
        public static final C28714n f110512g = new C28714n();

        public C28714n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireMerchantSite> invoke(MerchantSiteResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.getMerchantSites();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "merchant", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$o */
    /* loaded from: classes4.dex */
    public static final class C28715o extends Lambda implements Function1<Optional<WireMerchantDescription>, InterfaceC23447K<? extends List<? extends WireMerchantSite>>> {
        public C28715o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireMerchantSite>> invoke(Optional<WireMerchantDescription> merchant) {
            List emptyList;
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            WireMerchantDescription m59035e = merchant.m59035e();
            if (m59035e == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                AbstractC23442F m33158H = AbstractC23442F.m33158H(emptyList);
                Intrinsics.checkNotNullExpressionValue(m33158H, "just(emptyList())");
                return m33158H;
            }
            C49244tS2 c49244tS2 = C49244tS2.this;
            String id = m59035e.getId();
            Intrinsics.checkNotNull(id);
            return c49244tS2.m12352T(id);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "sites", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tS2$p */
    /* loaded from: classes4.dex */
    public static final class C28716p extends Lambda implements Function1<List<? extends WireMerchantSite>, Unit> {
        public C28716p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireMerchantSite> list) {
            invoke2((List<WireMerchantSite>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireMerchantSite> sites) {
            Object firstOrNull;
            Optional optional = (Optional) C49244tS2.this.f110494i.getValue();
            boolean z = false;
            if (optional != null && optional.m59037c()) {
                z = true;
            }
            if (z) {
                return;
            }
            C0058AG c0058ag = C49244tS2.this.f110494i;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(sites, "sites");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) sites);
            c0058ag.accept(c14443a.m59033b(firstOrNull));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tS2$q */
    /* loaded from: classes4.dex */
    public static final class C28717q extends Lambda implements Function1<Throwable, List<? extends WireMerchantSite>> {
        public C28717q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireMerchantSite> invoke(Throwable throwable) {
            List<WireMerchantSite> emptyList;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            C49244tS2.this.m12358N().mo7220p(throwable, "Unable to load merchant sites.", new Object[0]);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 MerchantManagerImpl.kt\nco/bird/android/manager/merchant/MerchantManagerImpl\n*L\n1#1,304:1\n65#2:305\n*E\n"})
    /* renamed from: tS2$r */
    /* loaded from: classes4.dex */
    public static final class C28718r<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            boolean booleanValue = ((Boolean) t2).booleanValue();
            if (((Boolean) t1).booleanValue() && booleanValue) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    public C49244tS2(InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig, BQ2 merchantApi, InterfaceC40359eT2 merchantSiteApi) {
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(merchantApi, "merchantApi");
        Intrinsics.checkNotNullParameter(merchantSiteApi, "merchantSiteApi");
        this.f110486a = merchantApi;
        this.f110487b = merchantSiteApi;
        Optional.C14443a c14443a = Optional.f63040c;
        C0058AG<Optional<WireMerchantDescription>> m115950h = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<Optional<W…tion>>(Optional.absent())");
        this.f110488c = m115950h;
        Observable<Optional<WireMerchantDescription>> hide = m115950h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "_merchant.hide()");
        this.f110489d = hide;
        Observable<Optional<WireMerchantDescription>> mo12339h = mo12339h();
        final C28710j c28710j = C28710j.f110508g;
        Observable hasMerchant = mo12339h.map(new InterfaceC23492o() { // from class: bS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m12357O;
                m12357O = C49244tS2.m12357O(Function1.this, obj);
                return m12357O;
            }
        });
        this.f110490e = hasMerchant;
        Observable<Boolean> m82938A8 = reactiveConfig.m82938A8();
        this.f110491f = m82938A8;
        C0058AG<Optional<Listing<WireMerchantTransaction>>> m115950h2 = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault<Optional<L…ion>>>(Optional.absent())");
        this.f110492g = m115950h2;
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f110493h = m31922e;
        C0058AG<Optional<WireMerchantSite>> m115950h3 = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h3, "createDefault(Optional.absent())");
        this.f110494i = m115950h3;
        this.f110495j = m115950h3;
        C24523e c24523e = C24523e.f91168a;
        Intrinsics.checkNotNullExpressionValue(hasMerchant, "hasMerchant");
        Observable combineLatest = Observable.combineLatest(hasMerchant, m82938A8, new C28718r());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<Boolean> distinctUntilChanged = combineLatest.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "Observables.combineLates… }.distinctUntilChanged()");
        this.f110496k = distinctUntilChanged;
        Observable<Optional<Listing<WireMerchantTransaction>>> hide2 = m115950h2.hide();
        Intrinsics.checkNotNullExpressionValue(hide2, "_merchantTransactionListing.hide()");
        this.f110497l = hide2;
        Observable<Optional<WireMerchantDescription>> mo12339h2 = mo12339h();
        final C28715o c28715o = new C28715o();
        Observable<R> switchMapSingle = mo12339h2.switchMapSingle(new InterfaceC23492o() { // from class: nS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12349W;
                m12349W = C49244tS2.m12349W(Function1.this, obj);
                return m12349W;
            }
        });
        final C28716p c28716p = new C28716p();
        Observable doOnNext = switchMapSingle.doOnNext(new InterfaceC23484g() { // from class: oS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12348X(Function1.this, obj);
            }
        });
        final C28717q c28717q = new C28717q();
        Observable<List<WireMerchantSite>> onErrorReturn = doOnNext.onErrorReturn(new InterfaceC23492o() { // from class: pS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m12347Y;
                m12347Y = C49244tS2.m12347Y(Function1.this, obj);
                return m12347Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "merchant.switchMapSingle…es.\")\n    emptyList()\n  }");
        this.f110498m = onErrorReturn;
        Observable<User> mo76582c = userStream.mo76582c();
        final C28701a c28701a = new C28701a();
        Observable<R> switchMapSingle2 = mo76582c.switchMapSingle(new InterfaceC23492o() { // from class: qS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12363I;
                m12363I = C49244tS2.m12363I(Function1.this, obj);
                return m12363I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle2, "userStream.loginEvents()…oadMerchantFor(user.id) }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = switchMapSingle2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28702b c28702b = new C28702b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: rS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12362J(Function1.this, obj);
            }
        };
        final C28703c c28703c = new C28703c();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: sS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12361K(Function1.this, obj);
            }
        });
        Observable<User> mo76576i = userStream.mo76576i();
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28704d c28704d = new C28704d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: cS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12360L(Function1.this, obj);
            }
        };
        final C28705e c28705e = new C28705e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: dS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12359M(Function1.this, obj);
            }
        });
        Observable<Optional<WireMerchantSite>> mo12344c = mo12344c();
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as3 = mo12344c.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28706f c28706f = new C28706f();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: eS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12367E(Function1.this, obj);
            }
        };
        final C28707g c28707g = new C28707g();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: kS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12366F(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(m31922e, mo12344c());
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as4 = m31950a.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28708h c28708h = new C28708h();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: lS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12365G(Function1.this, obj);
            }
        };
        final C28709i c28709i = new C28709i();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: mS2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49244tS2.m12364H(Function1.this, obj);
            }
        });
    }

    /* renamed from: E */
    public static final void m12367E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m12366F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m12365G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m12364H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23447K m12363I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m12362J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m12361K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m12360L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m12359M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final Boolean m12357O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final boolean m12355Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: R */
    public static final Optional m12354R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final Optional m12353S(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Optional.f63040c.m59034a();
    }

    /* renamed from: U */
    public static final boolean m12351U(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: V */
    public static final List m12350V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23447K m12349W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m12348X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final List m12347Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public final C41318g46.AbstractC20723b m12358N() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("merchant-manager");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"merchant-manager\")");
        return m40153k;
    }

    /* renamed from: P */
    public final AbstractC23442F<Optional<WireMerchantDescription>> m12356P(String str) {
        AbstractC23442F<WireMerchantDescription> m114049b = this.f110486a.m114049b(str);
        final C28711k c28711k = new C28711k();
        AbstractC23442F<WireMerchantDescription> m33144V = m114049b.m33144V(new InterfaceC23494q() { // from class: fS2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m12355Q;
                m12355Q = C49244tS2.m12355Q(Function1.this, obj);
                return m12355Q;
            }
        });
        final C28712l c28712l = C28712l.f110510g;
        AbstractC23442F<Optional<WireMerchantDescription>> m33149Q = m33144V.m33157I(new InterfaceC23492o() { // from class: gS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m12354R;
                m12354R = C49244tS2.m12354R(Function1.this, obj);
                return m12354R;
            }
        }).m33149Q(new InterfaceC23492o() { // from class: hS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m12353S;
                m12353S = C49244tS2.m12353S((Throwable) obj);
                return m12353S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33149Q, "private fun loadMerchant…  Optional.absent()\n    }");
        return m33149Q;
    }

    /* renamed from: T */
    public final AbstractC23442F<List<WireMerchantSite>> m12352T(String str) {
        AbstractC23442F<MerchantSiteResponse> m42863e = this.f110487b.m42863e(str);
        final C28713m c28713m = C28713m.f110511g;
        AbstractC23442F<MerchantSiteResponse> m33145U = m42863e.m33145U(new InterfaceC23481d() { // from class: iS2
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m12351U;
                m12351U = C49244tS2.m12351U(Function2.this, obj, obj2);
                return m12351U;
            }
        });
        final C28714n c28714n = C28714n.f110512g;
        AbstractC23442F m33157I = m33145U.m33157I(new InterfaceC23492o() { // from class: jS2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m12350V;
                m12350V = C49244tS2.m12350V(Function1.this, obj);
                return m12350V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "merchantSiteApi.getMerch… response.merchantSites }");
        return m33157I;
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: a */
    public Observable<Optional<Listing<WireMerchantTransaction>>> mo12346a() {
        return this.f110497l;
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: b */
    public void mo12345b() {
        this.f110493h.onNext(Unit.INSTANCE);
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: c */
    public Observable<Optional<WireMerchantSite>> mo12344c() {
        return this.f110495j;
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: d */
    public AbstractC23442F<HM4<Object>> mo12343d(String merchantSiteId, String merchantId, WireLocation location) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f110487b.m42862f(new C33527Ie6(merchantSiteId, merchantId, new RQ2(location.getLatitude(), location.getLongitude())));
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: e */
    public AbstractC23442F<HM4<Object>> mo12342e(String merchantSiteId, String merchantId, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        return this.f110487b.m42865c(new C33761Je6(merchantSiteId, merchantId, z));
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: f */
    public void mo12341f(WireMerchantSite store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f110494i.accept(Optional.f63040c.m59032c(store));
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: g */
    public AbstractC23461c mo12340g(String siteId, String merchantId, boolean z) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        return this.f110487b.m42867a(new C33293He6(siteId, merchantId, z));
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: h */
    public Observable<Optional<WireMerchantDescription>> mo12339h() {
        return this.f110489d;
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: i */
    public Listing<WireMerchantTransaction> mo12338i(String merchantId, String storeId) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        C42731iT2 c42731iT2 = new C42731iT2(merchantId, storeId, this.f110486a);
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        C49210tO4 c49210tO4 = new C49210tO4(c42731iT2, UNBOUND);
        return new Listing<>(new C36568Ve5(c49210tO4, new ZD3.C10145d.C10146a().m73539c(50).m73540b(50).m73541a()).m79617a(), c49210tO4.m12436h());
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: j */
    public Observable<Boolean> mo12337j() {
        return this.f110496k;
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: k */
    public Observable<List<WireMerchantSite>> mo12336k() {
        return this.f110498m;
    }

    @Override // p000.InterfaceC37961aS2
    /* renamed from: l */
    public int mo12335l() {
        return mo12336k().blockingFirst().size();
    }
}
