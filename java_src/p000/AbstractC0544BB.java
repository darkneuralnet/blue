package p000;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.wire.WireBird;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0010\u0010&\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`#0\"\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H$J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H$J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH$J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH$J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001c\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0016\u001a\u00060\u0015j\u0002`\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\"\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0016\u001a\u00060\u0015j\u0002`\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u001e\u0010&\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R%\u0010-\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00180*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b$\u0010,R\u001e\u00100\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00180*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R(\u00104\u001a\u0016\u0012\b\u0012\u00060\u0015j\u0002`#\u0012\b\u0012\u00060\u0015j\u0002`\u0018018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R(\u00106\u001a\u0016\u0012\b\u0012\u00060\u0015j\u0002`\u0018\u0012\b\u0012\u00060\u0015j\u0002`#018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R,\u0010;\u001a\u001a\u0012\b\u0012\u00060\u0015j\u0002`\u001807j\f\u0012\b\u0012\u00060\u0015j\u0002`\u0018`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010=\u001a\u0012\u0012\b\u0012\u00060\u0015j\u0002`\u0018\u0012\u0004\u0012\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00103¨\u0006@"}, m28432d2 = {"LBB;", "LBK2;", "Lco/bird/android/model/wire/WireBird;", "bird", "LmM2;", "r", "Lio/reactivex/F;", "LAA3;", "t", "Lco/bird/android/model/persistence/BirdMapMarker;", "birdMarker", "q", "s", "LLt2;", "c", DateTokenConverter.CONVERTER_KEY, "Lrt2;", C17296a.f69688o, "override", "overrideMedia", "l", "", "overrideId", "j", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "media", "", "k", "loadMedia", "m", "LsP2;", "LsP2;", "mediaManager", "Lwn4;", "Lco/bird/android/coreinterface/manager/MediaId;", "b", "Lwn4;", "bitmapCache", "LEa;", "LEa;", "analyticsManager", "Lio/reactivex/Observable;", "Lkotlin/Lazy;", "()Lio/reactivex/Observable;", "newlyAvailableOverrides", "e", "Lio/reactivex/Observable;", "internalNewlyAvailableOverrides", "Ljava/util/concurrent/ConcurrentHashMap;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "mediaIdToOverrideId", "g", "currentMediaIdForOverrideId", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "h", "Ljava/util/HashSet;", "loadingMedia", "i", "cachedOverrideMedia", "<init>", "(LsP2;Lwn4;LEa;)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseMapMarkerRemoteOverridesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/BaseMapMarkerRemoteOverridesManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n180#2:203\n237#2:205\n1#3:204\n*S KotlinDebug\n*F\n+ 1 BaseMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/BaseMapMarkerRemoteOverridesManager\n*L\n70#1:203\n198#1:205\n*E\n"})
/* renamed from: BB */
/* loaded from: classes4.dex */
public abstract class AbstractC0544BB implements BK2 {

    /* renamed from: a */
    public final InterfaceC48624sP2 f1956a;

    /* renamed from: b */
    public final InterfaceC51226wn4<String> f1957b;

    /* renamed from: c */
    public final InterfaceC1880Ea f1958c;

    /* renamed from: d */
    public final Lazy f1959d;

    /* renamed from: e */
    public final Observable<String> f1960e;

    /* renamed from: f */
    public final ConcurrentHashMap<String, String> f1961f;

    /* renamed from: g */
    public final ConcurrentHashMap<String, String> f1962g;

    /* renamed from: h */
    public final HashSet<String> f1963h;

    /* renamed from: i */
    public final ConcurrentHashMap<String, AA3> f1964i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BB$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0545a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0545a f1965b = new C0545a();

        public C0545a() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "mediaId", "Lco/bird/android/coreinterface/manager/MediaId;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BB$b */
    /* loaded from: classes4.dex */
    public static final class C0546b extends Lambda implements Function1<String, String> {
        public C0546b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String mediaId) {
            Intrinsics.checkNotNullParameter(mediaId, "mediaId");
            String str = (String) AbstractC0544BB.this.f1961f.get(mediaId);
            if (str != null) {
                AbstractC0544BB.this.f1962g.put(str, mediaId);
                return str;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, m28432d2 = {"BB$c", "LTI4;", "Landroid/graphics/Bitmap;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", RequestHeadersFactory.MODEL, "LLY5;", "target", "", "isFirstResource", C17296a.f69688o, "resource", "LZS0;", "dataSource", "b", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: BB$c */
    /* loaded from: classes4.dex */
    public static final class C0547c implements TI4<Bitmap> {

        /* renamed from: c */
        public final /* synthetic */ AssetMedia f1968c;

        /* renamed from: d */
        public final /* synthetic */ long f1969d;

        /* renamed from: e */
        public final /* synthetic */ String f1970e;

        public C0547c(AssetMedia assetMedia, long j, String str) {
            this.f1968c = assetMedia;
            this.f1969d = j;
            this.f1970e = str;
        }

        @Override // p000.TI4
        /* renamed from: a */
        public boolean mo6879a(GlideException glideException, Object obj, LY5<Bitmap> ly5, boolean z) {
            String str;
            InterfaceC1880Ea interfaceC1880Ea = AbstractC0544BB.this.f1958c;
            String mediaId = this.f1968c.getMediaId();
            String name = this.f1968c.getName();
            String mediaUrl = this.f1968c.getMediaUrl();
            double currentTimeMillis = System.currentTimeMillis() - this.f1969d;
            if (glideException == null || (str = glideException.getMessage()) == null) {
                str = "Failed to load Media: " + this.f1968c.getMediaUrl();
            }
            interfaceC1880Ea.mo55905y(new AK2(null, null, null, mediaId, name, mediaUrl, this.f1970e, str, currentTimeMillis, 7, null));
            return false;
        }

        @Override // p000.TI4
        /* renamed from: b */
        public boolean onResourceReady(Bitmap bitmap, Object obj, LY5<Bitmap> ly5, ZS0 zs0, boolean z) {
            AbstractC0544BB.this.f1958c.mo55905y(new C52729zK2(null, null, null, this.f1968c.getMediaId(), this.f1968c.getName(), this.f1968c.getMediaUrl(), this.f1970e, (zs0 == null || (r2 = zs0.name()) == null) ? "unknown" : "unknown", System.currentTimeMillis() - this.f1969d, 7, null));
            return false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LAA3;", "kotlin.jvm.PlatformType", "overrideMedia", "", C17296a.f69688o, "(LAA3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB$d */
    /* loaded from: classes4.dex */
    public static final class C0548d extends Lambda implements Function1<AA3, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f1972h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0548d(String str) {
            super(1);
            this.f1972h = str;
        }

        /* renamed from: a */
        public final void m114287a(AA3 overrideMedia) {
            ConcurrentHashMap concurrentHashMap = AbstractC0544BB.this.f1964i;
            String str = this.f1972h;
            Intrinsics.checkNotNullExpressionValue(overrideMedia, "overrideMedia");
            concurrentHashMap.put(str, overrideMedia);
            AbstractC0544BB.this.m114294k(this.f1972h, overrideMedia.m116040c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AA3 aa3) {
            m114287a(aa3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BB$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0549e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0549e f1973b = new C0549e();

        public C0549e() {
            super(1, C41318g46.class, DateTokenConverter.CONVERTER_KEY, "d(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40162b(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB$f */
    /* loaded from: classes4.dex */
    public static final class C0550f extends Lambda implements Function0<Observable<String>> {
        public C0550f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return AbstractC0544BB.this.f1960e;
        }
    }

    public AbstractC0544BB(InterfaceC48624sP2 mediaManager, InterfaceC51226wn4<String> bitmapCache, InterfaceC1880Ea analyticsManager) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(mediaManager, "mediaManager");
        Intrinsics.checkNotNullParameter(bitmapCache, "bitmapCache");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f1956a = mediaManager;
        this.f1957b = bitmapCache;
        this.f1958c = analyticsManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C0550f());
        this.f1959d = lazy;
        Observable<String> share = C37279Yf5.m74575T(bitmapCache.mo4701a(), new C0546b()).share();
        Intrinsics.checkNotNullExpressionValue(share, "bitmapCache.newlyLoadedI…     }\n    }\n    .share()");
        this.f1960e = share;
        this.f1961f = new ConcurrentHashMap<>();
        this.f1962g = new ConcurrentHashMap<>();
        this.f1963h = new HashSet<>();
        this.f1964i = new ConcurrentHashMap<>();
        final C0545a c0545a = C0545a.f1965b;
        Observable<String> retry = share.doOnError(new InterfaceC23484g() { // from class: AB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC0544BB.m114296i(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "internalNewlyAvailableOv…Timber::e)\n      .retry()");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: i */
    public static final void m114296i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m114291n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m114290o(AbstractC0544BB this$0, String overrideId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(overrideId, "$overrideId");
        this$0.f1963h.remove(overrideId);
    }

    /* renamed from: p */
    public static final void m114289p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.BK2
    /* renamed from: a */
    public C48321rt2 mo114100a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return m114295j(mo10811r(bird).m25813b());
    }

    @Override // p000.BK2
    /* renamed from: b */
    public Observable<String> mo114099b() {
        return (Observable) this.f1959d.getValue();
    }

    @Override // p000.BK2
    /* renamed from: c */
    public C34360Lt2 mo114098c(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return m114293l(mo10811r(bird), mo10809t(bird));
    }

    @Override // p000.BK2
    /* renamed from: d */
    public C34360Lt2 mo114097d(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        return m114293l(mo10812q(birdMarker), mo10810s(birdMarker));
    }

    /* renamed from: j */
    public final C48321rt2 m114295j(String str) {
        Bitmap bitmap;
        String str2 = this.f1962g.get(str);
        String str3 = null;
        if (str2 != null) {
            bitmap = this.f1957b.get(str2);
        } else {
            bitmap = null;
        }
        AA3 aa3 = this.f1964i.get(str);
        if (aa3 != null) {
            str3 = aa3.m116041b();
        }
        return new C48321rt2(bitmap, str, str3);
    }

    /* renamed from: k */
    public final void m114294k(String str, AssetMedia assetMedia) {
        this.f1961f.put(assetMedia.getMediaId(), str);
        if (this.f1957b.contains(assetMedia.getMediaId())) {
            this.f1962g.put(str, assetMedia.getMediaId());
            return;
        }
        this.f1956a.mo6892b(assetMedia, this.f1957b, assetMedia.getMediaId(), new C0547c(assetMedia, System.currentTimeMillis(), str));
    }

    /* renamed from: l */
    public final C34360Lt2 m114293l(C45040mM2 c45040mM2, AbstractC23442F<AA3> abstractC23442F) {
        boolean z;
        Unit unit;
        String str = this.f1962g.get(c45040mM2.m25813b());
        if (str != null) {
            z = this.f1957b.contains(str);
        } else {
            z = false;
        }
        if (!z) {
            if (!this.f1963h.contains(c45040mM2.m25813b())) {
                AA3 aa3 = this.f1964i.get(c45040mM2.m25813b());
                if (aa3 != null) {
                    m114294k(c45040mM2.m25813b(), aa3.m116040c());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    if (abstractC23442F == null) {
                        return new C34360Lt2(c45040mM2.m25813b(), true);
                    }
                    m114292m(c45040mM2.m25813b(), abstractC23442F);
                }
            }
            return new C34360Lt2(c45040mM2.m25813b(), !c45040mM2.m25812c());
        }
        return new C34360Lt2(c45040mM2.m25813b(), true);
    }

    /* renamed from: m */
    public final void m114292m(final String str, AbstractC23442F<AA3> abstractC23442F) {
        this.f1963h.add(str);
        final C0548d c0548d = new C0548d(str);
        AbstractC23442F<AA3> m33110r = abstractC23442F.m33101w(new InterfaceC23484g() { // from class: xB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC0544BB.m114291n(Function1.this, obj);
            }
        }).m33110r(new InterfaceC23478a() { // from class: yB
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                AbstractC0544BB.m114290o(AbstractC0544BB.this, str);
            }
        });
        final C0549e c0549e = C0549e.f1973b;
        AbstractC23461c m33069Q = m33110r.m33106t(new InterfaceC23484g() { // from class: zB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC0544BB.m114289p(Function1.this, obj);
            }
        }).m33159G().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun loadMediaAnd…D)\n      .subscribe()\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: q */
    public abstract C45040mM2 mo10812q(BirdMapMarker birdMapMarker);

    /* renamed from: r */
    public abstract C45040mM2 mo10811r(WireBird wireBird);

    /* renamed from: s */
    public abstract AbstractC23442F<AA3> mo10810s(BirdMapMarker birdMapMarker);

    /* renamed from: t */
    public abstract AbstractC23442F<AA3> mo10809t(WireBird wireBird);
}
