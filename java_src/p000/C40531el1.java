package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.TransformManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a \u0010\r\u001a\u00020\u0006*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00042\n\u0010\f\u001a\u00060\nj\u0002`\u000b¨\u0006\u000e"}, m28432d2 = {"Lcom/google/android/filament/Engine;", "Lcom/google/android/filament/Camera;", "b", "Lcom/google/android/filament/RenderableManager$Builder;", "", "entity", "", C17296a.f69688o, "Lcom/google/android/filament/TransformManager;", "i", "LyM2;", "Lio/github/sceneview/math/Transform;", "worldTransform", "c", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: el1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40531el1 {
    /* renamed from: a */
    public static final void m42579a(RenderableManager.Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.build(C39939dl1.m43784c(), i);
    }

    /* renamed from: b */
    public static final Camera m42578b(Engine engine) {
        Intrinsics.checkNotNullParameter(engine, "<this>");
        Camera createCamera = engine.createCamera(engine.getEntityManager().create());
        Intrinsics.checkNotNullExpressionValue(createCamera, "createCamera(entityManager.create())");
        return createCamera;
    }

    /* renamed from: c */
    public static final void m42577c(TransformManager transformManager, @EntityInstance int i, C52154yM2 worldTransform) {
        Intrinsics.checkNotNullParameter(transformManager, "<this>");
        Intrinsics.checkNotNullParameter(worldTransform, "worldTransform");
        transformManager.setTransform(i, C41491gN2.m39554k(worldTransform));
    }
}
