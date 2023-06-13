package p000;

import android.opengl.EGLContext;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.Filament;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.TransformManager;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.Gltfio;
import com.google.android.filament.gltfio.ResourceLoader;
import com.google.android.filament.gltfio.UbershaderProvider;
import com.google.android.filament.utils.Utils;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b\f\u0010&R\u001a\u0010-\u001a\u00020*8FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010(\u001a\u0004\b\u000f\u0010+R\u001a\u00102\u001a\u00020.8FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010(\u001a\u0004\b/\u00100R\u001a\u00106\u001a\u0002038FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010(\u001a\u0004\b\u001f\u00104R\u001a\u0010:\u001a\u0002078FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010(\u001a\u0004\b\u0017\u00108R\u001a\u0010>\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010(\u001a\u0004\b;\u0010<R\u001a\u0010A\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010(\u001a\u0004\b\u001b\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010(\u001a\u0004\b\b\u0010BR\u001a\u0010G\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010(\u001a\u0004\b\u0013\u0010E¨\u0006I"}, m28432d2 = {"Ldl1;", "", "", "l", "k", C17296a.f69688o, "Ljava/lang/ref/WeakReference;", "Landroid/opengl/EGLContext;", "b", "Ljava/lang/ref/WeakReference;", "eglContext", "Lcom/google/android/filament/Engine;", "c", "_engine", "Lcom/google/android/filament/gltfio/ResourceLoader;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/filament/gltfio/ResourceLoader;", "_resourceLoader", "Lcom/google/android/filament/gltfio/UbershaderProvider;", "e", "Lcom/google/android/filament/gltfio/UbershaderProvider;", "_materialProvider", "Lcom/google/android/filament/gltfio/AssetLoader;", "f", "Lcom/google/android/filament/gltfio/AssetLoader;", "_assetLoader", "LWN1;", "g", "LWN1;", "_iblPrefilter", "", "h", "I", "getRetainers", "()I", "setRetainers", "(I)V", "retainers", "()Lcom/google/android/filament/Engine;", "getEngine$annotations", "()V", "engine", "Lcom/google/android/filament/EntityManager;", "()Lcom/google/android/filament/EntityManager;", "getEntityManager$annotations", "entityManager", "Lcom/google/android/filament/TransformManager;", "j", "()Lcom/google/android/filament/TransformManager;", "getTransformManager$annotations", "transformManager", "Lcom/google/android/filament/RenderableManager;", "()Lcom/google/android/filament/RenderableManager;", "getRenderableManager$annotations", "renderableManager", "Lcom/google/android/filament/LightManager;", "()Lcom/google/android/filament/LightManager;", "getLightManager$annotations", "lightManager", "i", "()Lcom/google/android/filament/gltfio/ResourceLoader;", "getResourceLoader$annotations", "resourceLoader", "()Lcom/google/android/filament/gltfio/UbershaderProvider;", "getMaterialProvider$annotations", "materialProvider", "()Lcom/google/android/filament/gltfio/AssetLoader;", "getAssetLoader$annotations", "assetLoader", "()LWN1;", "getIblPrefilter$annotations", "iblPrefilter", "<init>", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: dl1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39939dl1 {

    /* renamed from: a */
    public static final C39939dl1 f77162a = new C39939dl1();

    /* renamed from: b */
    public static WeakReference<EGLContext> f77163b;

    /* renamed from: c */
    public static WeakReference<Engine> f77164c;

    /* renamed from: d */
    public static ResourceLoader f77165d;

    /* renamed from: e */
    public static UbershaderProvider f77166e;

    /* renamed from: f */
    public static AssetLoader f77167f;

    /* renamed from: g */
    public static WN1 f77168g;

    /* renamed from: h */
    public static int f77169h;

    /* renamed from: i */
    public static final int f77170i;

    static {
        Gltfio.init();
        Filament.init();
        Utils.INSTANCE.init();
        f77170i = 8;
    }

    private C39939dl1() {
    }

    /* renamed from: b */
    public static final AssetLoader m43785b() {
        Engine engine;
        AssetLoader assetLoader = f77167f;
        if (assetLoader == null) {
            WeakReference<Engine> weakReference = f77164c;
            if (weakReference != null && (engine = weakReference.get()) != null) {
                AssetLoader assetLoader2 = new AssetLoader(engine, m43780g(), m43783d());
                f77167f = assetLoader2;
                return assetLoader2;
            }
            return null;
        }
        return assetLoader;
    }

    /* renamed from: c */
    public static final Engine m43784c() {
        Engine engine;
        EGLContext m86441a;
        WeakReference<Engine> weakReference = f77164c;
        if (weakReference != null) {
            engine = weakReference.get();
        } else {
            engine = null;
        }
        if (engine == null) {
            WeakReference<EGLContext> weakReference2 = f77163b;
            if (weakReference2 == null || (m86441a = weakReference2.get()) == null) {
                m86441a = C35657Rh3.f32445a.m86441a();
            }
            f77163b = new WeakReference<>(m86441a);
            Engine create = Engine.create(m86441a);
            f77164c = new WeakReference<>(create);
            Intrinsics.checkNotNullExpressionValue(create, "create(eglContext).also …engine)\n                }");
            return create;
        }
        return engine;
    }

    /* renamed from: d */
    public static final EntityManager m43783d() {
        EntityManager entityManager = EntityManager.get();
        Intrinsics.checkNotNullExpressionValue(entityManager, "get()");
        return entityManager;
    }

    /* renamed from: e */
    public static final WN1 m43782e() {
        WN1 wn1 = f77168g;
        if (wn1 == null) {
            WN1 wn12 = new WN1(m43784c());
            f77168g = wn12;
            return wn12;
        }
        return wn1;
    }

    /* renamed from: f */
    public static final LightManager m43781f() {
        LightManager lightManager = m43784c().getLightManager();
        Intrinsics.checkNotNullExpressionValue(lightManager, "engine.lightManager");
        return lightManager;
    }

    /* renamed from: g */
    public static final UbershaderProvider m43780g() {
        UbershaderProvider ubershaderProvider = f77166e;
        if (ubershaderProvider == null) {
            UbershaderProvider ubershaderProvider2 = new UbershaderProvider(m43784c());
            f77166e = ubershaderProvider2;
            return ubershaderProvider2;
        }
        return ubershaderProvider;
    }

    /* renamed from: h */
    public static final RenderableManager m43779h() {
        RenderableManager renderableManager = m43784c().getRenderableManager();
        Intrinsics.checkNotNullExpressionValue(renderableManager, "engine.renderableManager");
        return renderableManager;
    }

    /* renamed from: i */
    public static final ResourceLoader m43778i() {
        ResourceLoader resourceLoader = f77165d;
        if (resourceLoader == null) {
            ResourceLoader resourceLoader2 = new ResourceLoader(m43784c());
            f77165d = resourceLoader2;
            return resourceLoader2;
        }
        return resourceLoader;
    }

    /* renamed from: j */
    public static final TransformManager m43777j() {
        TransformManager transformManager = m43784c().getTransformManager();
        Intrinsics.checkNotNullExpressionValue(transformManager, "engine.transformManager");
        return transformManager;
    }

    /* renamed from: a */
    public final void m43786a() {
        EGLContext eGLContext;
        Object m116783constructorimpl;
        Unit unit;
        Engine engine;
        Unit unit2;
        f77167f = null;
        ResourceLoader resourceLoader = f77165d;
        if (resourceLoader != null) {
            try {
                Result.Companion companion = Result.Companion;
                resourceLoader.asyncCancelLoad();
                Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            try {
                resourceLoader.evictResourceData();
                Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                Result.m116783constructorimpl(ResultKt.createFailure(th2));
            }
            try {
                resourceLoader.destroy();
                Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.Companion;
                Result.m116783constructorimpl(ResultKt.createFailure(th3));
            }
        }
        f77165d = null;
        f77166e = null;
        try {
            Result.Companion companion5 = Result.Companion;
            WN1 wn1 = f77168g;
            if (wn1 != null) {
                wn1.m78524a();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            Result.m116783constructorimpl(unit2);
        } catch (Throwable th4) {
            Result.Companion companion6 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th4));
        }
        f77168g = null;
        try {
            WeakReference<Engine> weakReference = f77164c;
            if (weakReference != null && (engine = weakReference.get()) != null) {
                engine.destroy();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m116783constructorimpl(unit);
        } catch (Throwable th5) {
            Result.Companion companion7 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th5));
        }
        WeakReference<Engine> weakReference2 = f77164c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        f77164c = null;
        WeakReference<EGLContext> weakReference3 = f77163b;
        if (weakReference3 != null && (eGLContext = weakReference3.get()) != null) {
            try {
                C35657Rh3.f32445a.m86438d(eGLContext);
                m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th6) {
                Result.Companion companion8 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th6));
            }
            Result.m116782boximpl(m116783constructorimpl);
        }
        WeakReference<EGLContext> weakReference4 = f77163b;
        if (weakReference4 != null) {
            weakReference4.clear();
        }
        f77163b = null;
    }

    /* renamed from: k */
    public final void m43776k() {
        int i = f77169h - 1;
        f77169h = i;
        if (i == 0) {
            m43786a();
        }
    }

    /* renamed from: l */
    public final void m43775l() {
        f77169h++;
    }
}
