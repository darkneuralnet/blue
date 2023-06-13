package co.bird.android.manager.helmet;

import android.content.Context;
import android.util.LruCache;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.helmet.HelmetSelfieManagerImpl;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.HelmetSelfieConfig;
import co.bird.api.response.DetectHelmetSelfieResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001%B1\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, m28432d2 = {"Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;", "LBL1;", "LFq2;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "b", "", "birdId", "", "e", "f", "imageUrl", "rideId", "Lio/reactivex/F;", "LEL1;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LYR4;", "c", "LYR4;", "rideManager", "LOh;", "LOh;", "buildConfig", "LEa;", "LEa;", "analyticsManager", "LTq4;", "LTq4;", "reactiveConfig", "Landroid/util/LruCache;", "g", "Landroid/util/LruCache;", "currentBirdToImageCache", C17296a.f69688o, "()Ljava/lang/String;", "imageCacheDirectoryPath", "<init>", "(Landroid/content/Context;LYR4;LOh;LEa;LTq4;)V", "h", "co.bird.android.manager.helmet"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class HelmetSelfieManagerImpl implements BL1, InterfaceC32929Fq2 {

    /* renamed from: h */
    public static final C16144a f66367h = new C16144a(null);

    /* renamed from: b */
    public final Context f66368b;

    /* renamed from: c */
    public final YR4 f66369c;

    /* renamed from: d */
    public final InterfaceC6097Oh f66370d;

    /* renamed from: e */
    public final InterfaceC1880Ea f66371e;

    /* renamed from: f */
    public final C36207Tq4 f66372f;

    /* renamed from: g */
    public final LruCache<String, String> f66373g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$a;", "", "", "DETECTED", "Ljava/lang/String;", "SKIPPED", "<init>", "()V", "co.bird.android.manager.helmet"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.helmet.HelmetSelfieManagerImpl$a */
    /* loaded from: classes4.dex */
    public static final class C16144a {
        public /* synthetic */ C16144a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16144a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DetectHelmetSelfieResponse;", "response", "LEL1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/DetectHelmetSelfieResponse;)LEL1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.helmet.HelmetSelfieManagerImpl$b */
    /* loaded from: classes4.dex */
    public static final class C16145b extends Lambda implements Function1<DetectHelmetSelfieResponse, EL1> {

        /* renamed from: g */
        public final /* synthetic */ float f66374g;

        /* renamed from: h */
        public final /* synthetic */ WireBird f66375h;

        /* renamed from: i */
        public final /* synthetic */ HelmetSelfieManagerImpl f66376i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16145b(float f, WireBird wireBird, HelmetSelfieManagerImpl helmetSelfieManagerImpl) {
            super(1);
            this.f66374g = f;
            this.f66375h = wireBird;
            this.f66376i = helmetSelfieManagerImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EL1 invoke(DetectHelmetSelfieResponse response) {
            double d;
            double min;
            boolean z;
            Intrinsics.checkNotNullParameter(response, "response");
            Double finalConfidence = response.getFinalConfidence();
            if (finalConfidence != null) {
                min = finalConfidence.doubleValue();
            } else {
                Double headCoverOnHeadConfidence = response.getHeadCoverOnHeadConfidence();
                double d2 = -1.0d;
                if (headCoverOnHeadConfidence != null) {
                    d = headCoverOnHeadConfidence.doubleValue();
                } else {
                    d = -1.0d;
                }
                Double headCoverConfidence = response.getHeadCoverConfidence();
                if (headCoverConfidence != null) {
                    d2 = headCoverConfidence.doubleValue();
                }
                min = Math.min(d, d2);
            }
            C41318g46.m40163a("received helmet selfie detection response " + response + " with minConfidence set to " + this.f66374g, new Object[0]);
            Double headCoverOnHeadConfidence2 = response.getHeadCoverOnHeadConfidence();
            Double headConfidence = response.getHeadConfidence();
            Double headCoverConfidence2 = response.getHeadCoverConfidence();
            Double faceConfidence = response.getFaceConfidence();
            if (min >= this.f66374g) {
                z = true;
            } else {
                z = false;
            }
            EL1 el1 = new EL1(headCoverOnHeadConfidence2, headConfidence, headCoverConfidence2, faceConfidence, z, response.getCouponAmount());
            WireBird wireBird = this.f66375h;
            HelmetSelfieManagerImpl helmetSelfieManagerImpl = this.f66376i;
            if (el1.m109165g()) {
                C41318g46.m40163a("setting helmet selfie detected for birdId: " + wireBird.getId(), new Object[0]);
                helmetSelfieManagerImpl.f66373g.put(wireBird.getId(), "detected");
            }
            return el1;
        }
    }

    public HelmetSelfieManagerImpl(Context context, YR4 rideManager, InterfaceC6097Oh buildConfig, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f66368b = context;
        this.f66369c = rideManager;
        this.f66370d = buildConfig;
        this.f66371e = analyticsManager;
        this.f66372f = reactiveConfig;
        this.f66373g = new LruCache<>(30);
    }

    /* renamed from: k */
    public static final EL1 m55710k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EL1) tmp0.invoke(obj);
    }

    @Override // p000.BL1
    /* renamed from: a */
    public String mo55716a() {
        String absolutePath = this.f66368b.getCacheDir().getAbsolutePath();
        return absolutePath + "/helmetselfie";
    }

    @Override // p000.BL1
    /* renamed from: b */
    public boolean mo55715b(WireBird bird) {
        boolean z;
        Intrinsics.checkNotNullParameter(bird, "bird");
        HelmetSelfieConfig helmetSelfie = C36441Uq4.m80769c(this.f66372f, bird).getRideConfig().getHelmetSelfie();
        if (helmetSelfie != null && helmetSelfie.getEnablePreRide()) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f66373g.get(bird.getId()) == null) {
            return true;
        }
        return false;
    }

    @Override // p000.BL1
    /* renamed from: d */
    public AbstractC23442F<EL1> mo55714d(WireBird bird, String str, String str2) {
        float f;
        Float requiredPreRideDetectionConfidence;
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (str == null) {
            str = this.f66373g.get(bird.getId());
        }
        if (str == null) {
            String id = bird.getId();
            AbstractC23442F<EL1> m33100x = AbstractC23442F.m33100x(new IllegalArgumentException("A non-null imageUrl was not passed in and none found in cache corresponding to bird " + id));
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(IllegalArgumentExc…ing to bird ${bird.id}\"))");
            return m33100x;
        }
        HelmetSelfieConfig helmetSelfie = C36441Uq4.m80769c(this.f66372f, bird).getRideConfig().getHelmetSelfie();
        if (helmetSelfie != null && (requiredPreRideDetectionConfidence = helmetSelfie.getRequiredPreRideDetectionConfidence()) != null) {
            f = requiredPreRideDetectionConfidence.floatValue();
        } else {
            f = 0.0f;
        }
        AbstractC23442F<DetectHelmetSelfieResponse> mo75067C = this.f66369c.mo75067C(str, f, str2);
        final C16145b c16145b = new C16145b(f, bird, this);
        AbstractC23442F<EL1> m33146T = mo75067C.m33157I(new InterfaceC23492o() { // from class: CL1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EL1 m55710k;
                m55710k = HelmetSelfieManagerImpl.m55710k(Function1.this, obj);
                return m55710k;
            }
        }).m33146T(2L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "override fun hasHelmetIn…    }\n      .retry(2)\n  }");
        return m33146T;
    }

    @Override // p000.BL1
    /* renamed from: e */
    public void mo55713e(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C41318g46.m40163a("clearing out saved helmet selfie for " + birdId + " if present", new Object[0]);
        this.f66373g.remove(birdId);
    }

    @Override // p000.BL1
    /* renamed from: f */
    public void mo55712f(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C41318g46.m40163a("setting helmet selfie skipped for birdId: " + birdId, new Object[0]);
        this.f66373g.put(birdId, "skipped");
    }
}
