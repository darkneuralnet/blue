package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.EntityInstance;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0001\u001a \u0010\t\u001a\u00020\b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\b*\u00060\u0001j\u0002`\u0002\"\u001d\u0010\u000e\u001a\u00060\u0001j\u0002`\u000b*\u00060\u0001j\u0002`\u00028G¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u00012\u00020\u0001*\n\u0010\u0010\"\u00020\u00012\u00020\u0001¨\u0006\u0011"}, m28432d2 = {"Lcom/google/android/filament/RenderableManager$Builder;", "", "Lio/github/sceneview/renderable/Renderable;", C17296a.f69688o, "primitiveIndex", "Lcom/google/android/filament/MaterialInstance;", "c", "material", "", "f", "b", "Lio/github/sceneview/renderable/RenderableInstance;", "e", "(I)I", "renderableInstance", "Renderable", "RenderableInstance", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: px4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47177px4 {
    /* renamed from: a */
    public static final int m18395a(RenderableManager.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        int create = C39939dl1.m43783d().create();
        builder.build(C39939dl1.m43784c(), create);
        return create;
    }

    /* renamed from: b */
    public static final void m18394b(int i) {
        try {
            Result.Companion companion = Result.Companion;
            C39939dl1.m43784c().destroyEntity(i);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        try {
            C39939dl1.m43784c().getEntityManager().destroy(i);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            C39939dl1.m43779h().destroy(i);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th3));
        }
    }

    /* renamed from: c */
    public static final MaterialInstance m18393c(int i, int i2) {
        MaterialInstance materialInstanceAt = C39939dl1.m43779h().getMaterialInstanceAt(m18391e(i), i2);
        Intrinsics.checkNotNullExpressionValue(materialInstanceAt, "renderableManager.getMat…Instance, primitiveIndex)");
        return materialInstanceAt;
    }

    /* renamed from: d */
    public static /* synthetic */ MaterialInstance m18392d(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return m18393c(i, i2);
    }

    @EntityInstance
    /* renamed from: e */
    public static final int m18391e(int i) {
        return C39939dl1.m43779h().getInstance(i);
    }

    /* renamed from: f */
    public static final void m18390f(int i, MaterialInstance material, int i2) {
        Intrinsics.checkNotNullParameter(material, "material");
        C39939dl1.m43779h().setMaterialInstanceAt(m18391e(i), i2, material);
    }

    /* renamed from: g */
    public static /* synthetic */ void m18389g(int i, MaterialInstance materialInstance, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        m18390f(i, materialInstance, i2);
    }
}
