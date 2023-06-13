package io.github.sceneview.p052ar.arcore;

import android.media.Image;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Camera;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Texture;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Frame;
import com.google.p034ar.core.LightEstimate;
import com.stripe.android.networking.FraudDetectionData;
import io.github.sceneview.p052ar.ArSceneLifecycle;
import io.github.sceneview.p052ar.ArSceneView;
import io.github.sceneview.p052ar.arcore.LightEstimator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p000.InterfaceC30295xm;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001qB#\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040T¢\u0006\u0004\bo\u0010pJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\"\u0010.\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\"\u00102\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\"\u00106\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R$\u0010=\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010D\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR.\u0010K\u001a\u0004\u0018\u00010E2\b\u0010\u000f\u001a\u0004\u0018\u00010E8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b\u0018\u0010H\"\u0004\bI\u0010JR:\u0010R\u001a\n\u0018\u00010Lj\u0004\u0018\u0001`M2\u000e\u0010\u000f\u001a\n\u0018\u00010Lj\u0004\u0018\u0001`M8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010N\u001a\u0004\b\u001c\u0010O\"\u0004\bP\u0010QR)\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040T0S8\u0006¢\u0006\f\n\u0004\bP\u0010U\u001a\u0004\bV\u0010WR$\u0010_\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010j\u001a\u00020h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010iR$\u0010m\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010k\"\u0004\ba\u0010lR\u0011\u0010n\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u000b\u0010k¨\u0006r"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/LightEstimator;", "Lxm;", "Lrm;", "arFrame", "", "r", "l", "LLifecycleOwner;", "owner", "onDestroy", "Lio/github/sceneview/ar/ArSceneLifecycle;", "b", "Lio/github/sceneview/ar/ArSceneLifecycle;", "lifecycle", "LLq2;", "value", "c", "LLq2;", "getMode", "()LLq2;", "p", "(LLq2;)V", "mode", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Float;", "_precision", "", "e", "Z", "getEnvironmentalHdrReflections", "()Z", "setEnvironmentalHdrReflections", "(Z)V", "environmentalHdrReflections", "f", "getDefaultEnvironmentReflections", "setDefaultEnvironmentReflections", "defaultEnvironmentReflections", "g", "getEnvironmentalHdrSphericalHarmonics", "setEnvironmentalHdrSphericalHarmonics", "environmentalHdrSphericalHarmonics", "h", "getEnvironmentalHdrSpecularFilter", "setEnvironmentalHdrSpecularFilter", "environmentalHdrSpecularFilter", "i", "getEnvironmentalHdrMainLightDirection", "setEnvironmentalHdrMainLightDirection", "environmentalHdrMainLightDirection", "j", "getEnvironmentalHdrMainLightIntensity", "setEnvironmentalHdrMainLightIntensity", "environmentalHdrMainLightIntensity", "k", "Lrm;", "getLastArFrame", "()Lrm;", "setLastArFrame", "(Lrm;)V", "lastArFrame", "", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", FraudDetectionData.KEY_TIMESTAMP, "Lwf1;", "m", "Lwf1;", "()Lwf1;", "n", "(Lwf1;)V", "environment", "", "Lio/github/sceneview/light/Light;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "o", "(Ljava/lang/Integer;)V", "mainLight", "", "Lkotlin/Function1;", "Ljava/util/List;", "getOnUpdated", "()Ljava/util/List;", "onUpdated", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "getCubeMapBuffer", "()Ljava/nio/ByteBuffer;", "setCubeMapBuffer", "(Ljava/nio/ByteBuffer;)V", "cubeMapBuffer", "Lcom/google/android/filament/Texture;", "q", "Lcom/google/android/filament/Texture;", "getCubeMapTexture", "()Lcom/google/android/filament/Texture;", "setCubeMapTexture", "(Lcom/google/android/filament/Texture;)V", "cubeMapTexture", "Lio/github/sceneview/ar/ArSceneView;", "()Lio/github/sceneview/ar/ArSceneView;", "sceneView", "()F", "(F)V", "precision", "cameraExposureFactor", "<init>", "(Lio/github/sceneview/ar/ArSceneLifecycle;Lkotlin/jvm/functions/Function1;)V", C17296a.f69688o, "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.arcore.LightEstimator */
/* loaded from: classes6.dex */
public final class LightEstimator implements InterfaceC30295xm {

    /* renamed from: r */
    public static final C23403a f88014r = new C23403a(null);

    /* renamed from: s */
    public static final int f88015s = 8;

    /* renamed from: t */
    public static final List<Float> f88016t;

    /* renamed from: b */
    public final ArSceneLifecycle f88017b;

    /* renamed from: c */
    public EnumC34333Lq2 f88018c;

    /* renamed from: d */
    public Float f88019d;

    /* renamed from: e */
    public boolean f88020e;

    /* renamed from: f */
    public boolean f88021f;

    /* renamed from: g */
    public boolean f88022g;

    /* renamed from: h */
    public boolean f88023h;

    /* renamed from: i */
    public boolean f88024i;

    /* renamed from: j */
    public boolean f88025j;

    /* renamed from: k */
    public C27991rm f88026k;

    /* renamed from: l */
    public Long f88027l;

    /* renamed from: m */
    public C51143wf1 f88028m;

    /* renamed from: n */
    public Integer f88029n;

    /* renamed from: o */
    public final List<Function1<LightEstimator, Unit>> f88030o;

    /* renamed from: p */
    public ByteBuffer f88031p;

    /* renamed from: q */
    public Texture f88032q;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/LightEstimator$a;", "", "<init>", "()V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.LightEstimator$a */
    /* loaded from: classes6.dex */
    public static final class C23403a {
        public /* synthetic */ C23403a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C23403a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.ar.arcore.LightEstimator$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C23404b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC34333Lq2.values().length];
            try {
                iArr[EnumC34333Lq2.ENVIRONMENTAL_HDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC34333Lq2.ENVIRONMENTAL_HDR_FAKE_REFLECTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC34333Lq2.ENVIRONMENTAL_HDR_NO_REFLECTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC34333Lq2.AMBIENT_INTENSITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC34333Lq2.DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Config.LightEstimationMode.values().length];
            try {
                iArr2[Config.LightEstimationMode.AMBIENT_INTENSITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Config.LightEstimationMode.ENVIRONMENTAL_HDR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        float[] fArr = {0.282095f, -0.325735f, 0.325735f, -0.325735f, 0.273137f, -0.273137f, 0.078848f, -0.273137f, 0.136569f};
        ArrayList arrayList = new ArrayList(9);
        int i = 0;
        int i2 = 0;
        while (i < 9) {
            float f = fArr[i];
            int i3 = i2 + 1;
            if (i2 != 6) {
                if (i2 == 7) {
                    f = fArr[6];
                }
            } else {
                f = fArr[7];
            }
            arrayList.add(Float.valueOf(f));
            i++;
            i2 = i3;
        }
        f88016t = arrayList;
    }

    public LightEstimator(ArSceneLifecycle lifecycle, Function1<? super LightEstimator, Unit> onUpdated) {
        List<Function1<LightEstimator, Unit>> mutableListOf;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onUpdated, "onUpdated");
        this.f88017b = lifecycle;
        this.f88018c = EnumC34333Lq2.ENVIRONMENTAL_HDR;
        this.f88020e = true;
        this.f88021f = true;
        this.f88022g = true;
        this.f88024i = true;
        this.f88025j = true;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(onUpdated);
        this.f88030o = mutableListOf;
        lifecycle.mo67008a(this);
    }

    /* renamed from: k */
    public static final void m33341k(Image[] arImages, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(arImages, "$arImages");
        for (Image image : arImages) {
            image.close();
        }
        byteBuffer.clear();
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: F */
    public void mo4733F(Exception exc) {
        InterfaceC30295xm.C30296a.m4725d(this, exc);
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: I */
    public void mo15405I(int i, int i2) {
        InterfaceC30295xm.C30296a.m4722g(this, i, i2);
    }

    /* renamed from: b */
    public final float m33346b() {
        Camera camera = m33342j().getCameraNode().f73857Q;
        Intrinsics.checkNotNullExpressionValue(camera, "sceneView.cameraNode.camera");
        return C34664Nb0.m93729b(camera);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: c */
    public void mo4732c(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4724e(this, arSession);
    }

    /* renamed from: d */
    public final C51143wf1 m33345d() {
        return this.f88028m;
    }

    /* renamed from: e */
    public final Integer m33344e() {
        return this.f88029n;
    }

    /* renamed from: f */
    public final float m33343f() {
        Float f = this.f88019d;
        return f != null ? f.floatValue() : this.f88018c.m96303b();
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 c35340Py1) {
        InterfaceC30295xm.C30296a.m4723f(this, c35340Py1);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: i */
    public void mo4731i(ArSession arSession, Config config) {
        InterfaceC30295xm.C30296a.m4727b(this, arSession, config);
    }

    /* renamed from: j */
    public final ArSceneView m33342j() {
        return this.f88017b.mo17097r();
    }

    /* renamed from: l */
    public void m33340l() {
        Iterator<T> it = this.f88030o.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: m */
    public void mo4730m(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4726c(this, arSession);
    }

    /* renamed from: n */
    public final void m33339n(C51143wf1 c51143wf1) {
        if (!Intrinsics.areEqual(this.f88028m, c51143wf1)) {
            C51143wf1 c51143wf12 = this.f88028m;
            if (c51143wf12 != null) {
                c51143wf12.mo1619a();
            }
            this.f88028m = c51143wf1;
        }
    }

    /* renamed from: o */
    public final void m33338o(Integer num) {
        if (!Intrinsics.areEqual(this.f88029n, num)) {
            Integer num2 = this.f88029n;
            if (num2 != null) {
                C34801Nq2.m93305c(num2.intValue());
            }
            this.f88029n = num;
        }
    }

    @Override // p000.VX0
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C51143wf1 c51143wf1 = this.f88028m;
        if (c51143wf1 != null) {
            c51143wf1.mo1619a();
        }
        Integer num = this.f88029n;
        if (num != null) {
            C34801Nq2.m93305c(num.intValue());
        }
        super.onDestroy(owner);
    }

    /* renamed from: p */
    public final void m33337p(EnumC34333Lq2 value) {
        Config.LightEstimationMode lightEstimationMode;
        boolean z;
        float f;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88018c = value;
        ArSceneView m33342j = m33342j();
        int[] iArr = C23404b.$EnumSwitchMapping$0;
        int i = iArr[value.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                if (i == 5) {
                    lightEstimationMode = Config.LightEstimationMode.DISABLED;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                lightEstimationMode = Config.LightEstimationMode.AMBIENT_INTENSITY;
            }
        } else {
            lightEstimationMode = Config.LightEstimationMode.ENVIRONMENTAL_HDR;
        }
        m33342j.setSessionLightEstimationMode(lightEstimationMode);
        boolean z2 = false;
        if (iArr[value.ordinal()] == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f88020e = z;
        if (iArr[value.ordinal()] != 3) {
            z2 = true;
        }
        this.f88021f = z2;
        if (iArr[value.ordinal()] == 1) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        m33336q(f);
        m33339n(null);
        m33338o(null);
        m33340l();
    }

    /* renamed from: q */
    public final void m33336q(float f) {
        this.f88019d = Float.valueOf(f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:45|(4:47|(1:49)(1:124)|(1:51)|(14:53|54|(4:56|(2:59|57)|60|61)|62|63|(3:65|(1:112)(1:69)|(1:71))|113|114|115|(1:117)(1:121)|118|119|73|74))|125|54|(0)|62|63|(0)|113|114|115|(0)(0)|118|119|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
        if (r3 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ec, code lost:
        r5 = kotlin.Result.Companion;
        kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0 A[Catch: all -> 0x01eb, TryCatch #0 {all -> 0x01eb, blocks: (B:85:0x01da, B:87:0x01e0, B:89:0x01e7), top: B:191:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e6  */
    @Override // p000.InterfaceC30295xm
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4729r(C27991rm arFrame) {
        boolean z;
        C27991rm c27991rm;
        Frame m15447c;
        LightEstimate lightEstimate;
        boolean z2;
        List slice;
        Float m117222maxOrNull;
        boolean z3;
        C42993iu1 c42993iu1;
        IndirectLight.Builder builder;
        IndirectLight m33466U;
        C51143wf1 m33468R;
        IndirectLight m33466U2;
        C51143wf1 m33468R2;
        float[] fArr;
        Integer m33465V;
        Integer num;
        Float f;
        float[] m6538d;
        int length;
        int i;
        boolean z4;
        float f2;
        Texture reflectionsTexture;
        boolean z5;
        C42993iu1 m9790d;
        double average;
        IndirectLight m33466U3;
        Texture reflectionsTexture2;
        Texture texture;
        float[] m6538d2;
        float[] fArr2;
        boolean z6;
        Float f3;
        Integer num2;
        IndirectLight m6540b;
        int length2;
        int i2;
        Texture texture2;
        Unit unit;
        boolean z7;
        boolean z8;
        Float maxOrNull;
        boolean z9;
        Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        InterfaceC30295xm.C30296a.m4728a(this, arFrame);
        boolean z10 = false;
        if (arFrame.m15434p(this.f88026k) <= m33343f()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c27991rm = arFrame;
        } else {
            c27991rm = null;
        }
        if (c27991rm != null && (m15447c = c27991rm.m15447c()) != null && (lightEstimate = m15447c.getLightEstimate()) != null) {
            if (lightEstimate.getState() == LightEstimate.State.VALID) {
                long timestamp = lightEstimate.getTimestamp();
                Long l = this.f88027l;
                if (l == null || timestamp != l.longValue()) {
                    z2 = true;
                    if (!z2) {
                        lightEstimate = null;
                    }
                    if (lightEstimate == null) {
                        this.f88026k = arFrame;
                        this.f88027l = Long.valueOf(lightEstimate.getTimestamp());
                        int i3 = C23404b.$EnumSwitchMapping$1[arFrame.m15446d().m33362t().ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                m33339n(null);
                                m33338o(null);
                                Unit unit2 = Unit.INSTANCE;
                                return;
                            }
                            if (this.f88025j) {
                                float[] environmentalHdrMainLightIntensity = lightEstimate.getEnvironmentalHdrMainLightIntensity();
                                Intrinsics.checkNotNullExpressionValue(environmentalHdrMainLightIntensity, "lightEstimate.environmentalHdrMainLightIntensity");
                                float[] m39551n = C41491gN2.m39551n(environmentalHdrMainLightIntensity);
                                maxOrNull = ArraysKt___ArraysKt.maxOrNull(m39551n);
                                if (maxOrNull != null) {
                                    if (maxOrNull.floatValue() > 0.0f) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (!z9) {
                                        maxOrNull = null;
                                    }
                                    if (maxOrNull != null) {
                                        float floatValue = maxOrNull.floatValue();
                                        m9790d = C50027um0.m9790d(m39551n[0] / floatValue, m39551n[1] / floatValue, m39551n[2] / floatValue, 0.0f, 8, null);
                                        if (m9790d == null) {
                                            m9790d = C50027um0.m9790d(1.0E-4f, 1.0E-4f, 1.0E-4f, 0.0f, 8, null);
                                        }
                                    }
                                }
                                m9790d = null;
                                if (m9790d == null) {
                                }
                            } else {
                                m9790d = C50027um0.m9790d(1.0f, 1.0f, 1.0f, 0.0f, 8, null);
                            }
                            C42993iu1 c42993iu12 = m9790d;
                            average = ArraysKt___ArraysKt.average(c42993iu12.m31657h());
                            float f4 = (float) average;
                            if (this.f88020e) {
                                final Image[] acquireEnvironmentalHdrCubeMap = lightEstimate.acquireEnvironmentalHdrCubeMap();
                                if (acquireEnvironmentalHdrCubeMap != null) {
                                    Intrinsics.checkNotNullExpressionValue(acquireEnvironmentalHdrCubeMap, "acquireEnvironmentalHdrCubeMap()");
                                    Pair m28425to = TuplesKt.m28425to(Integer.valueOf(acquireEnvironmentalHdrCubeMap[0].getWidth()), Integer.valueOf(acquireEnvironmentalHdrCubeMap[0].getHeight()));
                                    int intValue = ((Number) m28425to.component1()).intValue();
                                    int intValue2 = ((Number) m28425to.component2()).intValue();
                                    int[] iArr = new int[acquireEnvironmentalHdrCubeMap.length];
                                    int length3 = intValue * intValue2 * acquireEnvironmentalHdrCubeMap.length * 6 * 2;
                                    final ByteBuffer byteBuffer = this.f88031p;
                                    if (byteBuffer != null) {
                                        if (byteBuffer.capacity() == length3) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (!z8) {
                                            byteBuffer = null;
                                        }
                                        if (byteBuffer != null) {
                                            byteBuffer.clear();
                                            byte[] bArr = new byte[6];
                                            length2 = acquireEnvironmentalHdrCubeMap.length;
                                            i2 = 0;
                                            int i4 = 0;
                                            while (i2 < length2) {
                                                Image image = acquireEnvironmentalHdrCubeMap[i2];
                                                int i5 = i4 + 1;
                                                iArr[i4] = byteBuffer.position();
                                                ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                                                while (buffer.hasRemaining()) {
                                                    buffer.get(bArr);
                                                    byteBuffer.put(bArr);
                                                    buffer.position(buffer.position() + 2);
                                                }
                                                buffer.clear();
                                                Unit unit3 = Unit.INSTANCE;
                                                i2++;
                                                i4 = i5;
                                            }
                                            byteBuffer.flip();
                                            reflectionsTexture2 = this.f88032q;
                                            if (reflectionsTexture2 != null) {
                                                if (reflectionsTexture2.getWidth(0) == intValue && reflectionsTexture2.getHeight(0) == intValue2) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (!z7) {
                                                    reflectionsTexture2 = null;
                                                }
                                            }
                                            Texture.Builder format = new Texture.Builder().width(intValue).height(intValue2).levels(KotlinVersion.MAX_COMPONENT_VALUE).sampler(Texture.Sampler.SAMPLER_CUBEMAP).format(Texture.InternalFormat.R11F_G11F_B10F);
                                            Intrinsics.checkNotNullExpressionValue(format, "Builder()\n              …nalFormat.R11F_G11F_B10F)");
                                            reflectionsTexture2 = C40122e36.m43308a(format);
                                            Result.Companion companion = Result.Companion;
                                            texture2 = this.f88032q;
                                            if (texture2 == null) {
                                                C40122e36.m43307b(texture2);
                                                unit = Unit.INSTANCE;
                                            } else {
                                                unit = null;
                                            }
                                            Result.m116783constructorimpl(unit);
                                            this.f88032q = reflectionsTexture2;
                                            C40122e36.m43304e(reflectionsTexture2, 0, new Texture.PixelBufferDescriptor(byteBuffer, Texture.Format.RGB, Texture.Type.HALF, 1, 0, 0, 0, null, new Runnable() { // from class: Mq2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    LightEstimator.m33341k(acquireEnvironmentalHdrCubeMap, byteBuffer);
                                                }
                                            }), iArr);
                                            texture = reflectionsTexture2;
                                        }
                                    }
                                    byteBuffer = ByteBuffer.allocateDirect(length3);
                                    byteBuffer.order(ByteOrder.nativeOrder());
                                    this.f88031p = byteBuffer;
                                    byte[] bArr2 = new byte[6];
                                    length2 = acquireEnvironmentalHdrCubeMap.length;
                                    i2 = 0;
                                    int i42 = 0;
                                    while (i2 < length2) {
                                    }
                                    byteBuffer.flip();
                                    reflectionsTexture2 = this.f88032q;
                                    if (reflectionsTexture2 != null) {
                                    }
                                    Texture.Builder format2 = new Texture.Builder().width(intValue).height(intValue2).levels(KotlinVersion.MAX_COMPONENT_VALUE).sampler(Texture.Sampler.SAMPLER_CUBEMAP).format(Texture.InternalFormat.R11F_G11F_B10F);
                                    Intrinsics.checkNotNullExpressionValue(format2, "Builder()\n              …nalFormat.R11F_G11F_B10F)");
                                    reflectionsTexture2 = C40122e36.m43308a(format2);
                                    Result.Companion companion2 = Result.Companion;
                                    texture2 = this.f88032q;
                                    if (texture2 == null) {
                                    }
                                    Result.m116783constructorimpl(unit);
                                    this.f88032q = reflectionsTexture2;
                                    C40122e36.m43304e(reflectionsTexture2, 0, new Texture.PixelBufferDescriptor(byteBuffer, Texture.Format.RGB, Texture.Type.HALF, 1, 0, 0, 0, null, new Runnable() { // from class: Mq2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            LightEstimator.m33341k(acquireEnvironmentalHdrCubeMap, byteBuffer);
                                        }
                                    }), iArr);
                                    texture = reflectionsTexture2;
                                }
                                texture = null;
                            } else {
                                if (this.f88021f && (m33466U3 = m33342j().m33466U()) != null) {
                                    reflectionsTexture2 = m33466U3.getReflectionsTexture();
                                    texture = reflectionsTexture2;
                                }
                                texture = null;
                            }
                            if (this.f88022g) {
                                float[] environmentalHdrAmbientSphericalHarmonics = lightEstimate.getEnvironmentalHdrAmbientSphericalHarmonics();
                                if (environmentalHdrAmbientSphericalHarmonics != null) {
                                    ArrayList arrayList = new ArrayList(environmentalHdrAmbientSphericalHarmonics.length);
                                    int length4 = environmentalHdrAmbientSphericalHarmonics.length;
                                    int i6 = 0;
                                    int i7 = 0;
                                    while (i6 < length4) {
                                        arrayList.add(Float.valueOf(environmentalHdrAmbientSphericalHarmonics[i6] * f88016t.get(i7 / 3).floatValue()));
                                        i6++;
                                        i7++;
                                    }
                                    m6538d2 = CollectionsKt___CollectionsKt.toFloatArray(arrayList);
                                    fArr2 = m6538d2;
                                }
                                fArr2 = null;
                            } else {
                                C51143wf1 m33468R3 = m33342j().m33468R();
                                if (m33468R3 != null) {
                                    m6538d2 = m33468R3.m6538d();
                                    fArr2 = m6538d2;
                                }
                                fArr2 = null;
                            }
                            if (this.f88020e && this.f88023h) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            C51143wf1 m33468R4 = m33342j().m33468R();
                            if (m33468R4 != null && (m6540b = m33468R4.m6540b()) != null) {
                                f3 = Float.valueOf(m6540b.getIntensity() * f4);
                            } else {
                                f3 = null;
                            }
                            m33339n(new C52674zE1(texture, fArr2, f3, z6, false, true));
                            Integer m33465V2 = m33342j().m33465V();
                            if (m33465V2 != null) {
                                num2 = Integer.valueOf(C34801Nq2.m93306b(m33465V2.intValue()));
                                int intValue3 = num2.intValue();
                                if (this.f88024i) {
                                    float[] environmentalHdrMainLightDirection = lightEstimate.getEnvironmentalHdrMainLightDirection();
                                    Intrinsics.checkNotNullExpressionValue(environmentalHdrMainLightDirection, "(x, y, z)");
                                    C34801Nq2.m93290r(intValue3, new C42400hu1(-environmentalHdrMainLightDirection[0], -environmentalHdrMainLightDirection[1], -environmentalHdrMainLightDirection[2]));
                                    Unit unit4 = Unit.INSTANCE;
                                }
                                if (this.f88025j) {
                                    C42993iu1 m93304d = C34801Nq2.m93304d(intValue3);
                                    float m33346b = m33346b();
                                    C42993iu1 c42993iu13 = new C42993iu1(c42993iu12.m31660e() * m33346b, c42993iu12.m31659f() * m33346b, c42993iu12.m31658g() * m33346b, c42993iu12.m31661d() * m33346b);
                                    C34801Nq2.m93291q(intValue3, new C42993iu1(m93304d.m31660e() * c42993iu13.m31660e(), m93304d.m31659f() * c42993iu13.m31659f(), m93304d.m31658g() * c42993iu13.m31658g(), m93304d.m31661d() * c42993iu13.m31661d()));
                                    C34801Nq2.m93289s(intValue3, C34801Nq2.m93299i(intValue3) * f4 * m33346b());
                                }
                            } else {
                                num2 = null;
                            }
                            m33338o(num2);
                            m33340l();
                            Unit unit5 = Unit.INSTANCE;
                            return;
                        }
                        float[] fArr3 = new float[4];
                        lightEstimate.getColorCorrection(fArr3, 0);
                        float[] m39551n2 = C41491gN2.m39551n(fArr3);
                        slice = ArraysKt___ArraysKt.slice(m39551n2, new IntRange(0, 2));
                        m117222maxOrNull = CollectionsKt___CollectionsKt.m117222maxOrNull((Iterable<Float>) slice);
                        if (m117222maxOrNull != null) {
                            if (m117222maxOrNull.floatValue() > 0.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                m117222maxOrNull = null;
                            }
                            if (m117222maxOrNull != null) {
                                float floatValue2 = m117222maxOrNull.floatValue();
                                z3 = true;
                                c42993iu1 = new C42993iu1(m39551n2[0] / floatValue2, m39551n2[1] / floatValue2, m39551n2[2] / floatValue2, 0.0f, 8, null);
                                Pair m28425to2 = TuplesKt.m28425to(c42993iu1, Float.valueOf(m39551n2[3] * 1.8f));
                                C42993iu1 c42993iu14 = (C42993iu1) m28425to2.component1();
                                float floatValue3 = ((Number) m28425to2.component2()).floatValue();
                                builder = new IndirectLight.Builder();
                                m33466U = m33342j().m33466U();
                                if (m33466U != null && (reflectionsTexture = m33466U.getReflectionsTexture()) != null) {
                                    builder.reflections(reflectionsTexture);
                                }
                                m33468R = m33342j().m33468R();
                                if (m33468R != null && (m6538d = m33468R.m6538d()) != null) {
                                    length = m6538d.length;
                                    float[] fArr4 = new float[length];
                                    for (i = 0; i < length; i++) {
                                        if (i >= 0 && i < 3) {
                                            z4 = z3;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            f2 = m6538d[i] * c42993iu14.m31662c(i);
                                        } else {
                                            f2 = m6538d[i];
                                        }
                                        fArr4[i] = f2;
                                    }
                                    builder.irradiance(3, fArr4);
                                }
                                m33466U2 = m33342j().m33466U();
                                if (m33466U2 != null) {
                                    builder.intensity(m33466U2.getIntensity() * floatValue3);
                                    Unit unit6 = Unit.INSTANCE;
                                }
                                IndirectLight m111040a = D12.m111040a(builder);
                                m33468R2 = m33342j().m33468R();
                                if (m33468R2 == null) {
                                    fArr = m33468R2.m6538d();
                                } else {
                                    fArr = null;
                                }
                                m33339n(new C51143wf1(m111040a, null, fArr, 2, null));
                                m33465V = m33342j().m33465V();
                                if (m33465V == null) {
                                    Integer valueOf = Integer.valueOf(C34801Nq2.m93306b(m33465V.intValue()));
                                    int intValue4 = valueOf.intValue();
                                    Float valueOf2 = Float.valueOf(Math.max(c42993iu14.m31660e(), Math.max(c42993iu14.m31659f(), Math.max(c42993iu14.m31658g(), c42993iu14.m31661d()))));
                                    if (valueOf2.floatValue() > 0.0f) {
                                        z10 = z3;
                                    }
                                    if (z10) {
                                        f = valueOf2;
                                    } else {
                                        f = null;
                                    }
                                    if (f != null) {
                                        float floatValue4 = f.floatValue();
                                        C42993iu1 c42993iu15 = new C42993iu1(c42993iu14.m31660e() / floatValue4, c42993iu14.m31659f() / floatValue4, c42993iu14.m31658g() / floatValue4, c42993iu14.m31661d() / floatValue4);
                                        C42993iu1 m93304d2 = C34801Nq2.m93304d(intValue4);
                                        C34801Nq2.m93291q(intValue4, new C42993iu1(m93304d2.m31660e() * c42993iu15.m31660e(), m93304d2.m31659f() * c42993iu15.m31659f(), m93304d2.m31658g() * c42993iu15.m31658g(), m93304d2.m31661d() * c42993iu15.m31661d()));
                                        Unit unit7 = Unit.INSTANCE;
                                    }
                                    C34801Nq2.m93289s(intValue4, C34801Nq2.m93299i(intValue4) * floatValue3);
                                    num = valueOf;
                                } else {
                                    num = null;
                                }
                                m33338o(num);
                                m33340l();
                                Unit unit8 = Unit.INSTANCE;
                                return;
                            }
                        }
                        z3 = true;
                        c42993iu1 = new C42993iu1(1.0E-4f, 1.0E-4f, 1.0E-4f, 0.0f, 8, null);
                        Pair m28425to22 = TuplesKt.m28425to(c42993iu1, Float.valueOf(m39551n2[3] * 1.8f));
                        C42993iu1 c42993iu142 = (C42993iu1) m28425to22.component1();
                        float floatValue32 = ((Number) m28425to22.component2()).floatValue();
                        builder = new IndirectLight.Builder();
                        m33466U = m33342j().m33466U();
                        if (m33466U != null) {
                            builder.reflections(reflectionsTexture);
                        }
                        m33468R = m33342j().m33468R();
                        if (m33468R != null) {
                            length = m6538d.length;
                            float[] fArr42 = new float[length];
                            while (i < length) {
                            }
                            builder.irradiance(3, fArr42);
                        }
                        m33466U2 = m33342j().m33466U();
                        if (m33466U2 != null) {
                        }
                        IndirectLight m111040a2 = D12.m111040a(builder);
                        m33468R2 = m33342j().m33468R();
                        if (m33468R2 == null) {
                        }
                        m33339n(new C51143wf1(m111040a2, null, fArr, 2, null));
                        m33465V = m33342j().m33465V();
                        if (m33465V == null) {
                        }
                        m33338o(num);
                        m33340l();
                        Unit unit82 = Unit.INSTANCE;
                        return;
                    }
                    return;
                }
            }
            z2 = false;
            if (!z2) {
            }
            if (lightEstimate == null) {
            }
        }
    }
}
