package p000;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Texture;
import com.google.p034ar.core.HitResult;
import com.google.p034ar.core.Plane;
import com.google.p034ar.core.Trackable;
import com.google.p034ar.core.TrackingState;
import com.google.p034ar.core.exceptions.DeadlineExceededException;
import com.google.p034ar.sceneform.rendering.C18038c;
import io.github.sceneview.p052ar.ArSceneView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C40715f36;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u0000 L2\u00020\u0001:\u0002\f\u0006B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\bJ\u0010KJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010,R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010?\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\b$\u0010AR*\u0010C\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010>\u001a\u0004\bC\u0010@\"\u0004\bD\u0010AR*\u0010F\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@\"\u0004\bG\u0010AR$\u0010I\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bH\u0010>\"\u0004\b!\u0010A¨\u0006M"}, m28432d2 = {"LnV3;", "", "Lrm;", "arFrame", "", "g", "b", "Lcom/google/ar/core/Plane;", "plane", "", "visible", "c", C17296a.f69688o, "Lio/github/sceneview/ar/ArSceneView;", "Lio/github/sceneview/ar/ArSceneView;", "getSceneView", "()Lio/github/sceneview/ar/ArSceneView;", "sceneView", "", "Lcom/google/ar/sceneform/rendering/c;", "Ljava/util/Map;", "visualizers", "Lcom/google/android/filament/Texture;", "Lcom/google/android/filament/Texture;", "getPlaneTexture", "()Lcom/google/android/filament/Texture;", "planeTexture", "Lcom/google/android/filament/Material;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/filament/Material;", "getPlaneMaterial", "()Lcom/google/android/filament/Material;", "planeMaterial", "e", "shadowMaterial", "LnV3$b;", "f", "LnV3$b;", "getPlaneRendererMode", "()LnV3$b;", "setPlaneRendererMode", "(LnV3$b;)V", "planeRendererMode", "", "F", "planeHitDistance", "h", "Lrm;", "getArFrame", "()Lrm;", "setArFrame", "(Lrm;)V", "", "i", "I", "getMaxHitTestPerSecond", "()I", "setMaxHitTestPerSecond", "(I)V", "maxHitTestPerSecond", "value", "j", "Z", "isEnabled", "()Z", "(Z)V", "k", "isVisible", "setVisible", "l", "isShadowReceiver", "setShadowReceiver", "m", "isCameraTracking", "<init>", "(Lio/github/sceneview/ar/ArSceneView;)V", "n", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: nV3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45715nV3 {

    /* renamed from: n */
    public static final C26528a f100044n = new C26528a(null);

    /* renamed from: o */
    public static final int f100045o = 8;

    /* renamed from: a */
    public final ArSceneView f100046a;

    /* renamed from: b */
    public final Map<Plane, C18038c> f100047b;

    /* renamed from: c */
    public final Texture f100048c;

    /* renamed from: d */
    public final Material f100049d;

    /* renamed from: e */
    public Material f100050e;

    /* renamed from: f */
    public EnumC26529b f100051f;

    /* renamed from: g */
    public float f100052g;

    /* renamed from: h */
    public C27991rm f100053h;

    /* renamed from: i */
    public int f100054i;

    /* renamed from: j */
    public boolean f100055j;

    /* renamed from: k */
    public boolean f100056k;

    /* renamed from: l */
    public boolean f100057l;

    /* renamed from: m */
    public boolean f100058m;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, m28432d2 = {"LnV3$a;", "", "", "BASE_UV_SCALE", "F", "", "MATERIAL_COLOR", "Ljava/lang/String;", "MATERIAL_SPOTLIGHT_FOCUS_POINT", "MATERIAL_SPOTLIGHT_RADIUS", "MATERIAL_TEXTURE", "MATERIAL_UV_SCALE", "SPOTLIGHT_RADIUS", "<init>", "()V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: nV3$a */
    /* loaded from: classes6.dex */
    public static final class C26528a {
        public /* synthetic */ C26528a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26528a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LnV3$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: nV3$b */
    /* loaded from: classes6.dex */
    public enum EnumC26529b {
        RENDER_ALL,
        RENDER_CENTER
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lcom/google/ar/core/Plane;", "Lcom/google/ar/sceneform/rendering/c;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: nV3$c */
    /* loaded from: classes6.dex */
    public static final class C26530c extends Lambda implements Function1<Map.Entry<Plane, C18038c>, Boolean> {

        /* renamed from: g */
        public static final C26530c f100062g = new C26530c();

        public C26530c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Map.Entry<Plane, C18038c> entry) {
            boolean z;
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            Plane key = entry.getKey();
            C18038c value = entry.getValue();
            if (key.getSubsumedBy() == null && key.getTrackingState() != TrackingState.STOPPED) {
                z = false;
            } else {
                value.m48358b();
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C45715nV3(ArSceneView sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        this.f100046a = sceneView;
        this.f100047b = new LinkedHashMap();
        C40715f36 c40715f36 = C40715f36.f79352a;
        Context context = sceneView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "sceneView.context");
        Texture m42218a = c40715f36.m42218a(context, "sceneview/textures/plane_renderer.png", C40715f36.EnumC20180a.COLOR);
        this.f100048c = m42218a;
        LM2 lm2 = LM2.f21310a;
        Context context2 = sceneView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "sceneView.context");
        Material m97032a = lm2.m97032a(context2, "sceneview/materials/plane_renderer.filamat");
        MaterialInstance planeMaterial$lambda$1$lambda$0 = m97032a.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(planeMaterial$lambda$1$lambda$0, "planeMaterial$lambda$1$lambda$0");
        JM2.m100650h(planeMaterial$lambda$1$lambda$0, "texture", m42218a, null, 4, null);
        planeMaterial$lambda$1$lambda$0.setParameter("uvScale", 8.0f, (m42218a.getWidth(0) / m42218a.getHeight(0)) * 8.0f);
        JM2.m100653e(planeMaterial$lambda$1$lambda$0, "color", new C42993iu1(1.0f, 1.0f, 1.0f, 0.0f, 8, null));
        planeMaterial$lambda$1$lambda$0.setParameter("radius", 0.5f);
        this.f100049d = m97032a;
        Context context3 = sceneView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "sceneView.context");
        this.f100050e = lm2.m97032a(context3, "sceneview/materials/plane_renderer_shadow.filamat");
        this.f100051f = EnumC26529b.RENDER_CENTER;
        this.f100052g = 4.0f;
        this.f100054i = 10;
        this.f100055j = true;
        this.f100056k = true;
        this.f100057l = true;
    }

    /* renamed from: d */
    public static /* synthetic */ void m23601d(C45715nV3 c45715nV3, Plane plane, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c45715nV3.m23602c(plane, z);
    }

    /* renamed from: a */
    public final void m23604a() {
        CollectionsKt__MutableCollectionsKt.removeAll(this.f100047b.entrySet(), C26530c.f100062g);
    }

    /* renamed from: b */
    public final void m23603b() {
        for (Map.Entry<Plane, C18038c> entry : this.f100047b.entrySet()) {
            entry.getValue().m48358b();
        }
        C40122e36.m43307b(this.f100048c);
        KM2.m98975b(this.f100049d);
        KM2.m98975b(this.f100050e);
    }

    /* renamed from: c */
    public final void m23602c(Plane plane, boolean z) {
        boolean z2;
        if (plane.getTrackingState() == TrackingState.TRACKING || plane.getSubsumedBy() == null) {
            C18038c c18038c = this.f100047b.get(plane);
            if (c18038c == null) {
                c18038c = new C18038c(this.f100046a, plane);
                c18038c.m48355e(this.f100049d.getDefaultInstance());
                c18038c.m48354f(this.f100050e.getDefaultInstance());
                c18038c.m48353g(this.f100057l);
                boolean z3 = true;
                if (this.f100056k && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c18038c.m48352h(z2);
                if (!this.f100055j || !this.f100058m) {
                    z3 = false;
                }
                c18038c.m48356d(z3);
                this.f100047b.put(plane, c18038c);
            }
            c18038c.m48351i();
        }
    }

    /* renamed from: e */
    public final void m23600e(boolean z) {
        boolean z2;
        if (this.f100058m != z) {
            this.f100058m = z;
            for (C18038c c18038c : this.f100047b.values()) {
                if (this.f100055j && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c18038c.m48356d(z2);
            }
        }
    }

    /* renamed from: f */
    public final void m23599f(boolean z) {
        if (this.f100055j != z) {
            this.f100055j = z;
            for (C18038c c18038c : this.f100047b.values()) {
                c18038c.m48356d(z);
            }
        }
    }

    /* renamed from: g */
    public final void m23598g(C27991rm arFrame) {
        boolean z;
        Trackable trackable;
        Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        if (this.f100055j && arFrame.m15449a(this.f100053h) < this.f100054i) {
            this.f100053h = arFrame;
            m23600e(C34430Mb0.m95150a(arFrame.m15448b()));
            try {
                List<Plane> m15442h = arFrame.m15442h();
                EnumC26529b enumC26529b = this.f100051f;
                Plane plane = null;
                if (enumC26529b == EnumC26529b.RENDER_ALL) {
                    for (Plane plane2 : m15442h) {
                        m23601d(this, plane2, false, 2, null);
                    }
                } else if (enumC26529b == EnumC26529b.RENDER_CENTER) {
                    if (this.f100056k) {
                        HitResult m15439k = arFrame.m15439k(new C42400hu1(0.0f, 0.0f, 0.0f, 4, null), true, false, false);
                        if (m15439k != null) {
                            trackable = m15439k.getTrackable();
                        } else {
                            trackable = null;
                        }
                        if (trackable instanceof Plane) {
                            plane = (Plane) trackable;
                        }
                    }
                    for (Plane plane3 : m15442h) {
                        m23602c(plane3, Intrinsics.areEqual(plane3, plane));
                    }
                    for (Map.Entry<Plane, C18038c> entry : this.f100047b.entrySet()) {
                        Plane key = entry.getKey();
                        C18038c value = entry.getValue();
                        if (!m15442h.contains(key)) {
                            if (this.f100056k && Intrinsics.areEqual(key, plane)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            value.m48352h(z);
                        }
                    }
                }
                m23604a();
            } catch (DeadlineExceededException unused) {
            }
        }
    }
}
