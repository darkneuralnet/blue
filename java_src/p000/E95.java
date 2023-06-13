package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.PartnerUser;
import co.bird.android.model.constant.AssetUsage;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.wire.WireAssetMedia;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLegacyAsset;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B9\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0014R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006'²\u0006\u000e\u0010&\u001a\u0004\u0018\u00010%8\nX\u008a\u0084\u0002"}, m28432d2 = {"LE95;", "LBB;", "Lco/bird/android/model/wire/WireBird;", "bird", "LmM2;", "r", "Lio/reactivex/F;", "LAA3;", "t", "Lco/bird/android/model/persistence/BirdMapMarker;", "birdMarker", "q", "s", "Landroid/content/Context;", "j", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LGI3;", "k", "LGI3;", "partnerManager", "LTq4;", "l", "LTq4;", "reactiveConfig", "LEa;", "m", "LEa;", "analyticsManager", "LsP2;", "mediaManager", "LB95;", "bitmapCache", "<init>", "(LsP2;LB95;Landroid/content/Context;LGI3;LTq4;LEa;)V", "n", C17296a.f69688o, "Lco/bird/android/model/wire/WireAssetMedia;", "fallbackPartnerAssetMedia", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E95 */
/* loaded from: classes4.dex */
public final class E95 extends AbstractC0544BB {

    /* renamed from: n */
    public static final C1745a f7030n = new C1745a(null);

    /* renamed from: o */
    public static final C45040mM2 f7031o = new C45040mM2("", false);

    /* renamed from: j */
    public final Context f7032j;

    /* renamed from: k */
    public final GI3 f7033k;

    /* renamed from: l */
    public final C36207Tq4 f7034l;

    /* renamed from: m */
    public final InterfaceC1880Ea f7035m;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m28432d2 = {"LE95$a;", "", "", "BIRD_ICON_OVERRIDE_CONTENT_DESCRIPTION", "Ljava/lang/String;", "LmM2;", "BIRD_MARKER_OVERRIDE", "LmM2;", "BIRD_OVERRIDE_ID", "PRIVATE_OVERRIDE_ID", "<init>", "()V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: E95$a */
    /* loaded from: classes4.dex */
    public static final class C1745a {
        public /* synthetic */ C1745a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1745a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "it", "LAA3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)LAA3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderMapMarkerRemoteOverridesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/RiderMapMarkerRemoteOverridesManager$overrideMedia$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
    /* renamed from: E95$b */
    /* loaded from: classes4.dex */
    public static final class C1746b extends Lambda implements Function1<MobilePartner, AA3> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f7037h;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/WireAssetMedia;", "b", "()Lco/bird/android/model/wire/WireAssetMedia;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRiderMapMarkerRemoteOverridesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/RiderMapMarkerRemoteOverridesManager$overrideMedia$1$fallbackPartnerAssetMedia$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n288#2,2:105\n*S KotlinDebug\n*F\n+ 1 RiderMapMarkerRemoteOverridesManager.kt\nco/bird/android/manager/media/RiderMapMarkerRemoteOverridesManager$overrideMedia$1$fallbackPartnerAssetMedia$2\n*L\n62#1:105,2\n*E\n"})
        /* renamed from: E95$b$a */
        /* loaded from: classes4.dex */
        public static final class C1747a extends Lambda implements Function0<WireAssetMedia> {

            /* renamed from: g */
            public final /* synthetic */ E95 f7038g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1747a(E95 e95) {
                super(0);
                this.f7038g = e95;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final WireAssetMedia invoke() {
                Map<AssetUsage, WireLegacyAsset> assets;
                WireLegacyAsset wireLegacyAsset;
                Object obj;
                WireLegacyAsset wireLegacyAsset2;
                boolean z;
                PartnerUser m59035e = this.f7038g.f7033k.mo97364o1().m73665a().m59035e();
                MobilePartner mobilePartner = this.f7038g.f7033k.mo97372A().m73665a().get((m59035e == null || (r0 = m59035e.getPartnerId()) == null) ? "11111111-1111-1111-1111-111111111111" : "11111111-1111-1111-1111-111111111111");
                if (mobilePartner == null) {
                    Iterator<T> it = this.f7038g.f7033k.mo97372A().m73665a().entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Map<AssetUsage, WireLegacyAsset> assets2 = ((MobilePartner) ((Map.Entry) obj).getValue()).getAssets();
                            if (assets2 != null) {
                                wireLegacyAsset2 = assets2.get(AssetUsage.RIDER_MAP_ANNOTATION_LOGO_OVERRIDE);
                            } else {
                                wireLegacyAsset2 = null;
                            }
                            if (wireLegacyAsset2 != null) {
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
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        mobilePartner = (MobilePartner) entry.getValue();
                    } else {
                        mobilePartner = null;
                    }
                }
                if (mobilePartner == null || (assets = mobilePartner.getAssets()) == null || (wireLegacyAsset = assets.get(AssetUsage.RIDER_MAP_ANNOTATION_LOGO_OVERRIDE)) == null) {
                    return null;
                }
                return wireLegacyAsset.getMedia();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1746b(WireBird wireBird) {
            super(1);
            this.f7037h = wireBird;
        }

        /* renamed from: b */
        public static final WireAssetMedia m109335b(Lazy<WireAssetMedia> lazy) {
            return lazy.getValue();
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
            if (r2 == null) goto L16;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AA3 invoke(MobilePartner it) {
            Lazy lazy;
            WireAssetMedia m109335b;
            boolean isBlank;
            WireLegacyAsset wireLegacyAsset;
            Intrinsics.checkNotNullParameter(it, "it");
            lazy = LazyKt__LazyJVMKt.lazy(new C1747a(E95.this));
            Map<AssetUsage, WireLegacyAsset> assets = it.getAssets();
            if (assets == null || (wireLegacyAsset = assets.get(AssetUsage.RIDER_MAP_ANNOTATION_LOGO_OVERRIDE)) == null || (m109335b = wireLegacyAsset.getMedia()) == null) {
                m109335b = m109335b(lazy);
                if (m109335b != null) {
                    C41318g46.m40163a("RIDER_MAP_ANNOTATION_LOGO_OVERRIDE was missing so defaulted to fallback partner media", new Object[0]);
                } else {
                    E95 e95 = E95.this;
                    WireBird wireBird = this.f7037h;
                    String partnerId = it.getPartnerId();
                    String code = wireBird.getCode();
                    String id = wireBird.getId();
                    NullPointerException nullPointerException = new NullPointerException("RIDER_MAP_ANNOTATION_LOGO_OVERRIDE media not found for partner id " + partnerId + " required by bird " + code + " (id=" + id + ") when making call to /partner/by-id endpoint");
                    e95.f7035m.mo55905y(new AK2(null, null, null, "unknown", "rider_map_annotation_logo_override", "not found", "unknown", nullPointerException.getMessage(), 0.0d, 7, null));
                    throw nullPointerException;
                }
            }
            AssetMedia assetMedia = new AssetMedia(m109335b.getMediaId(), m109335b.getName(), m109335b.getMediaUrl(), m109335b.getMediaType());
            String displayName = it.getDisplayName();
            if (displayName != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(displayName);
                if (!(!isBlank)) {
                    displayName = null;
                }
            }
            displayName = E95.this.f7032j.getString(C45871nl4.bird);
            Intrinsics.checkNotNullExpressionValue(displayName, "context.getString(L.string.bird)");
            return new AA3(assetMedia, displayName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E95(InterfaceC48624sP2 mediaManager, B95 bitmapCache, Context context, GI3 partnerManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager) {
        super(mediaManager, bitmapCache, analyticsManager);
        Intrinsics.checkNotNullParameter(mediaManager, "mediaManager");
        Intrinsics.checkNotNullParameter(bitmapCache, "bitmapCache");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f7032j = context;
        this.f7033k = partnerManager;
        this.f7034l = reactiveConfig;
        this.f7035m = analyticsManager;
    }

    /* renamed from: v */
    public static final AA3 m109337v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AA3) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: q */
    public C45040mM2 mo10812q(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        return f7031o;
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: r */
    public C45040mM2 mo10811r(WireBird bird) {
        Pair m28425to;
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (bird.getPrivateBird() != null) {
            m28425to = TuplesKt.m28425to("privateOverrideId", Boolean.FALSE);
        } else if (bird.getPartnerId() != null) {
            String partnerId = bird.getPartnerId();
            Intrinsics.checkNotNull(partnerId);
            m28425to = TuplesKt.m28425to(partnerId, Boolean.TRUE);
        } else {
            m28425to = TuplesKt.m28425to("birdOverrideId", Boolean.FALSE);
        }
        return new C45040mM2((String) m28425to.component1(), ((Boolean) m28425to.component2()).booleanValue());
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: s */
    public AbstractC23442F<AA3> mo10810s(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        return null;
    }

    @Override // p000.AbstractC0544BB
    /* renamed from: t */
    public AbstractC23442F<AA3> mo10809t(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (bird.getPrivateBird() != null) {
            return null;
        }
        if (bird.getPartnerId() != null) {
            GI3 gi3 = this.f7033k;
            String partnerId = bird.getPartnerId();
            Intrinsics.checkNotNull(partnerId);
            AbstractC23442F<MobilePartner> mo97362u = gi3.mo97362u(partnerId);
            final C1746b c1746b = new C1746b(bird);
            return mo97362u.m33157I(new InterfaceC23492o() { // from class: D95
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    AA3 m109337v;
                    m109337v = E95.m109337v(Function1.this, obj);
                    return m109337v;
                }
            });
        }
        String birdIconOverride = this.f7034l.m82623f8().getValue().getBirdIconOverride();
        if (birdIconOverride == null) {
            return null;
        }
        WireAssetMedia wireAssetMedia = new WireAssetMedia(birdIconOverride);
        return AbstractC23442F.m33158H(new AA3(new AssetMedia(wireAssetMedia.getMediaId(), wireAssetMedia.getName(), wireAssetMedia.getMediaUrl(), wireAssetMedia.getMediaType()), "Bird"));
    }
}
