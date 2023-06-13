package p000;

import android.content.Context;
import android.media.Image;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Coordinates2d;
import com.google.p034ar.core.Frame;
import io.github.sceneview.p052ar.ArSceneView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001\bB#\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010O\u001a\u00020N\u0012\b\b\u0002\u0010P\u001a\u00020N¢\u0006\u0004\bQ\u0010RJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010&\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b!\u0010%R\u0017\u0010)\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00103\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b0\u0010.\"\u0004\b1\u00102R*\u0010:\u001a\u0002042\u0006\u0010\f\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b+\u00109R*\u0010>\u001a\u00020;2\u0006\u0010\f\u001a\u00020;8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b'\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001b\u0010G\u001a\u00060\u000bj\u0002`E8\u0006¢\u0006\f\n\u0004\bF\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010J¨\u0006T"}, m28432d2 = {"Lqm;", "", "Lrm;", "arFrame", "", "h", "b", "Lio/github/sceneview/ar/ArSceneView;", C17296a.f69688o, "Lio/github/sceneview/ar/ArSceneView;", "sceneView", "", "value", "I", "getPriority", "()I", "setPriority", "(I)V", "priority", "", "c", "[I", "()[I", "cameraTextureIds", "", "Lcom/google/android/filament/Texture;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "getCameraTextures", "()Ljava/util/Map;", "setCameraTextures", "(Ljava/util/Map;)V", "cameraTextures", "e", "Lcom/google/android/filament/Texture;", "getCameraTexture", "()Lcom/google/android/filament/Texture;", "(Lcom/google/android/filament/Texture;)V", "cameraTexture", "f", "getDepthTexture", "depthTexture", "Lcom/google/android/filament/Material;", "g", "Lcom/google/android/filament/Material;", "getStandardMaterial", "()Lcom/google/android/filament/Material;", "standardMaterial", "getDepthOcclusionMaterial", "setDepthOcclusionMaterial", "(Lcom/google/android/filament/Material;)V", "depthOcclusionMaterial", "Lcom/google/android/filament/MaterialInstance;", "i", "Lcom/google/android/filament/MaterialInstance;", "getMaterialInstance", "()Lcom/google/android/filament/MaterialInstance;", "(Lcom/google/android/filament/MaterialInstance;)V", "materialInstance", "", "j", "Z", "isDepthOcclusionEnabled", "()Z", "(Z)V", "Lcom/google/android/filament/VertexBuffer;", "k", "Lcom/google/android/filament/VertexBuffer;", "vertexBuffer", "Lio/github/sceneview/renderable/Renderable;", "l", "renderable", "Ljava/nio/FloatBuffer;", "m", "Ljava/nio/FloatBuffer;", "uvCoordinates", "n", "transformedUvCoordinates", "", "standardMaterialLocation", "depthOcclusionMaterialLocation", "<init>", "(Lio/github/sceneview/ar/ArSceneView;Ljava/lang/String;Ljava/lang/String;)V", "o", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: qm */
/* loaded from: classes6.dex */
public final class C27679qm {

    /* renamed from: o */
    public static final C27680a f105746o = new C27680a(null);

    /* renamed from: p */
    public static final int f105747p = 8;

    /* renamed from: q */
    public static final float[] f105748q = {-1.0f, 1.0f, 1.0f, -1.0f, -3.0f, 1.0f, 3.0f, 1.0f, 1.0f};

    /* renamed from: r */
    public static final float[] f105749r = {0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f};

    /* renamed from: s */
    public static final short[] f105750s = {0, 1, 2};

    /* renamed from: a */
    public final ArSceneView f105751a;

    /* renamed from: b */
    public int f105752b;

    /* renamed from: c */
    public final int[] f105753c;

    /* renamed from: d */
    public Map<Integer, ? extends Texture> f105754d;

    /* renamed from: e */
    public Texture f105755e;

    /* renamed from: f */
    public final Texture f105756f;

    /* renamed from: g */
    public final Material f105757g;

    /* renamed from: h */
    public Material f105758h;

    /* renamed from: i */
    public MaterialInstance f105759i;

    /* renamed from: j */
    public boolean f105760j;

    /* renamed from: k */
    public final VertexBuffer f105761k;

    /* renamed from: l */
    public final int f105762l;

    /* renamed from: m */
    public final FloatBuffer f105763m;

    /* renamed from: n */
    public FloatBuffer f105764n;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0011"}, m28432d2 = {"Lqm$a;", "", "", "CAMERA_UVS", "[F", "CAMERA_VERTICES", "", "FLOAT_SIZE_IN_BYTES", "I", "", "INDICES", "[S", "POSITION_BUFFER_INDEX", "UV_BUFFER_INDEX", "VERTEX_COUNT", "<init>", "()V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: qm$a */
    /* loaded from: classes6.dex */
    public static final class C27680a {
        public /* synthetic */ C27680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27680a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: qm$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C27681b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Config.DepthMode.values().length];
            try {
                iArr[Config.DepthMode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config.DepthMode.RAW_DEPTH_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C27679qm(ArSceneView sceneView, String standardMaterialLocation, String depthOcclusionMaterialLocation) {
        int mapCapacity;
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        Intrinsics.checkNotNullParameter(standardMaterialLocation, "standardMaterialLocation");
        Intrinsics.checkNotNullParameter(depthOcclusionMaterialLocation, "depthOcclusionMaterialLocation");
        this.f105751a = sceneView;
        this.f105752b = 7;
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = C35657Rh3.f32445a.m86439c();
        }
        this.f105753c = iArr;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(iArr.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i2 : iArr) {
            Integer valueOf = Integer.valueOf(i2);
            Texture.Builder importTexture = new Texture.Builder().sampler(Texture.Sampler.SAMPLER_EXTERNAL).format(Texture.InternalFormat.RGB8).importTexture(i2);
            Intrinsics.checkNotNullExpressionValue(importTexture, "Builder()\n            .s…cameraTextureId.toLong())");
            linkedHashMap.put(valueOf, C40122e36.m43308a(importTexture));
        }
        this.f105754d = linkedHashMap;
        Object obj = linkedHashMap.get(Integer.valueOf(this.f105753c[0]));
        Intrinsics.checkNotNull(obj);
        this.f105755e = (Texture) obj;
        Texture.Builder levels = new Texture.Builder().sampler(Texture.Sampler.SAMPLER_2D).format(Texture.InternalFormat.RG8).levels(1);
        Intrinsics.checkNotNullExpressionValue(levels, "Builder()\n        .sampl…t.RG8)\n        .levels(1)");
        Texture m43308a = C40122e36.m43308a(levels);
        this.f105756f = m43308a;
        LM2 lm2 = LM2.f21310a;
        Context context = this.f105751a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "sceneView.context");
        Material m97032a = lm2.m97032a(context, standardMaterialLocation);
        MaterialInstance standardMaterial$lambda$2$lambda$1 = m97032a.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(standardMaterial$lambda$2$lambda$1, "standardMaterial$lambda$2$lambda$1");
        JM2.m100652f(standardMaterial$lambda$2$lambda$1, "uvTransform", new C52154yM2((C42993iu1) null, (C42993iu1) null, (C42993iu1) null, (C42993iu1) null, 15, (DefaultConstructorMarker) null));
        JM2.m100655c(standardMaterial$lambda$2$lambda$1, "cameraTexture", this.f105755e);
        this.f105757g = m97032a;
        Context context2 = this.f105751a.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "sceneView.context");
        Material m97032a2 = lm2.m97032a(context2, depthOcclusionMaterialLocation);
        MaterialInstance depthOcclusionMaterial$lambda$4$lambda$3 = m97032a2.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(depthOcclusionMaterial$lambda$4$lambda$3, "depthOcclusionMaterial$lambda$4$lambda$3");
        JM2.m100652f(depthOcclusionMaterial$lambda$4$lambda$3, "uvTransform", new C52154yM2((C42993iu1) null, (C42993iu1) null, (C42993iu1) null, (C42993iu1) null, 15, (DefaultConstructorMarker) null));
        JM2.m100655c(depthOcclusionMaterial$lambda$4$lambda$3, "cameraTexture", this.f105755e);
        JM2.m100650h(depthOcclusionMaterial$lambda$4$lambda$3, "depthTexture", m43308a, null, 4, null);
        this.f105758h = m97032a2;
        MaterialInstance defaultInstance = m97032a.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "standardMaterial.defaultInstance");
        this.f105759i = defaultInstance;
        VertexBuffer.Builder bufferCount = new VertexBuffer.Builder().vertexCount(3).bufferCount(2);
        VertexBuffer.VertexAttribute vertexAttribute = VertexBuffer.VertexAttribute.POSITION;
        VertexBuffer.AttributeType attributeType = VertexBuffer.AttributeType.FLOAT3;
        float[] fArr = f105748q;
        VertexBuffer.Builder attribute = bufferCount.attribute(vertexAttribute, 0, attributeType, 0, (fArr.length / 3) * 4);
        VertexBuffer.VertexAttribute vertexAttribute2 = VertexBuffer.VertexAttribute.UV0;
        VertexBuffer.AttributeType attributeType2 = VertexBuffer.AttributeType.FLOAT2;
        float[] fArr2 = f105749r;
        VertexBuffer.Builder attribute2 = attribute.attribute(vertexAttribute2, 1, attributeType2, 0, (fArr2.length / 3) * 4);
        Intrinsics.checkNotNullExpressionValue(attribute2, "Builder()\n        .verte…T_SIZE_IN_BYTES\n        )");
        VertexBuffer m103422a = C33383Ho6.m103422a(attribute2);
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(CAMERA_VERTICES)");
        C33383Ho6.m103420c(m103422a, 0, wrap);
        this.f105761k = m103422a;
        RenderableManager.Builder priority = new RenderableManager.Builder(4).castShadows(false).receiveShadows(false).channel(3).culling(false).priority(this.f105752b);
        RenderableManager.PrimitiveType primitiveType = RenderableManager.PrimitiveType.TRIANGLES;
        IndexBuffer.Builder builder = new IndexBuffer.Builder();
        short[] sArr = f105750s;
        IndexBuffer.Builder bufferType = builder.indexCount(sArr.length).bufferType(IndexBuffer.Builder.IndexType.USHORT);
        Intrinsics.checkNotNullExpressionValue(bufferType, "Builder()\n              …ferType(IndexType.USHORT)");
        IndexBuffer m11061a = C49585u12.m11061a(bufferType);
        ShortBuffer wrap2 = ShortBuffer.wrap(sArr);
        Intrinsics.checkNotNullExpressionValue(wrap2, "wrap(INDICES)");
        C49585u12.m11059c(m11061a, wrap2);
        Unit unit = Unit.INSTANCE;
        RenderableManager.Builder material = priority.geometry(0, primitiveType, m103422a, m11061a).material(0, this.f105759i);
        Intrinsics.checkNotNullExpressionValue(material, "Builder(4)\n        .cast…rial(0, materialInstance)");
        this.f105762l = C47177px4.m18395a(material);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr2);
        asFloatBuffer.rewind();
        Intrinsics.checkNotNullExpressionValue(asFloatBuffer, "allocateDirect(CAMERA_UV…   rewind()\n            }");
        this.f105763m = asFloatBuffer;
    }

    /* renamed from: i */
    public static final void m17112i(Image depthImage, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(depthImage, "$depthImage");
        depthImage.close();
        byteBuffer.clear();
    }

    /* renamed from: b */
    public final void m17119b() {
        KM2.m98975b(this.f105757g);
        KM2.m98975b(this.f105758h);
        C33383Ho6.m103421b(this.f105761k);
        C47177px4.m18394b(this.f105762l);
        for (Texture texture : this.f105754d.values()) {
            C40122e36.m43307b(texture);
        }
        C40122e36.m43307b(this.f105756f);
        this.f105763m.clear();
        FloatBuffer floatBuffer = this.f105764n;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
    }

    /* renamed from: c */
    public final int[] m17118c() {
        return this.f105753c;
    }

    /* renamed from: d */
    public final int m17117d() {
        return this.f105762l;
    }

    /* renamed from: e */
    public final void m17116e(Texture value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f105755e = value;
        JM2.m100655c(this.f105759i, "cameraTexture", value);
    }

    /* renamed from: f */
    public final void m17115f(boolean z) {
        MaterialInstance defaultInstance;
        if (this.f105760j != z) {
            this.f105760j = z;
            if (z) {
                defaultInstance = this.f105758h.getDefaultInstance();
                Intrinsics.checkNotNullExpressionValue(defaultInstance, "{\n                    de…nstance\n                }");
            } else {
                defaultInstance = this.f105757g.getDefaultInstance();
                Intrinsics.checkNotNullExpressionValue(defaultInstance, "{\n                    st…nstance\n                }");
            }
            m17114g(defaultInstance);
        }
    }

    /* renamed from: g */
    public final void m17114g(MaterialInstance value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f105759i = value;
        JM2.m100655c(value, "cameraTexture", this.f105755e);
        C47177px4.m18389g(this.f105762l, value, 0, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m17113h(C27991rm arFrame) {
        IntRange until;
        IntProgression step;
        Image image;
        Image image2;
        Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        Frame m15447c = arFrame.m15447c();
        if (this.f105764n == null || m15447c.hasDisplayGeometryChanged()) {
            FloatBuffer transformedUvCoordinates = this.f105764n;
            if (transformedUvCoordinates == null) {
                transformedUvCoordinates = C45042mM4.m25811a(this.f105763m);
                this.f105764n = transformedUvCoordinates;
            }
            m15447c.transformCoordinates2d(Coordinates2d.VIEW_NORMALIZED, this.f105763m, Coordinates2d.TEXTURE_NORMALIZED, transformedUvCoordinates);
            until = RangesKt___RangesKt.until(1, 6);
            step = RangesKt___RangesKt.step(until, 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                while (true) {
                    transformedUvCoordinates.put(first, 1.0f - transformedUvCoordinates.get(first));
                    if (first == last) {
                        break;
                    }
                    first += step2;
                }
            }
            VertexBuffer vertexBuffer = this.f105761k;
            Intrinsics.checkNotNullExpressionValue(transformedUvCoordinates, "transformedUvCoordinates");
            C33383Ho6.m103420c(vertexBuffer, 1, transformedUvCoordinates);
        }
        Texture texture = this.f105754d.get(Integer.valueOf(m15447c.getCameraTextureName()));
        if (texture != null) {
            m17116e(texture);
        }
        if (this.f105760j) {
            int i = C27681b.$EnumSwitchMapping$0[this.f105751a.m33390w0().ordinal()];
            final Image image3 = null;
            if (i != 1) {
                if (i == 2) {
                    try {
                        Result.Companion companion = Result.Companion;
                        image2 = Result.m116783constructorimpl(m15447c.acquireRawDepthImage16Bits());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        image2 = Result.m116783constructorimpl(ResultKt.createFailure(th));
                    }
                    if (!Result.m116789isFailureimpl(image2)) {
                        image3 = image2;
                    }
                    image3 = image3;
                }
            } else {
                try {
                    Result.Companion companion3 = Result.Companion;
                    image = Result.m116783constructorimpl(m15447c.acquireDepthImage16Bits());
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    image = Result.m116783constructorimpl(ResultKt.createFailure(th2));
                }
                if (!Result.m116789isFailureimpl(image)) {
                    image3 = image;
                }
                image3 = image3;
            }
            if (image3 != null) {
                final ByteBuffer buffer = image3.getPlanes()[0].getBuffer();
                C40122e36.m43305d(this.f105756f, 0, new Texture.PixelBufferDescriptor(buffer, Texture.Format.RG, Texture.Type.UBYTE, 1, 0, 0, 0, null, new Runnable() { // from class: pm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C27679qm.m17112i(image3, buffer);
                    }
                }));
            }
        }
    }

    public /* synthetic */ C27679qm(ArSceneView arSceneView, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arSceneView, (i & 2) != 0 ? "sceneview/materials/camera_stream_flat.filamat" : str, (i & 4) != 0 ? "sceneview/materials/camera_stream_depth.filamat" : str2);
    }
}
