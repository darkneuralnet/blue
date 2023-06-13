package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\b\u001a\u001a\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\n\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u001a\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f\u001a\u0016\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\n\u0010\u0006\u001a\u00060\bj\u0002`\u0012¨\u0006\u0014"}, m28432d2 = {"Lcom/google/android/filament/MaterialInstance;", "", C17296a.f69688o, "", "name", "Lgu1;", "value", DateTokenConverter.CONVERTER_KEY, "Liu1;", "e", "LyM2;", "f", "Lcom/google/android/filament/Texture;", "texture", "Lcom/google/android/filament/TextureSampler;", "textureSampler", "g", "c", "Lio/github/sceneview/utils/Color;", "b", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: JM2 */
/* loaded from: classes6.dex */
public final class JM2 {
    /* renamed from: a */
    public static final void m100657a(MaterialInstance materialInstance) {
        Intrinsics.checkNotNullParameter(materialInstance, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            C39939dl1.m43784c().destroyMaterialInstance(materialInstance);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: b */
    public static final void m100656b(MaterialInstance materialInstance, C42993iu1 value) {
        Intrinsics.checkNotNullParameter(materialInstance, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        m100653e(materialInstance, "emissiveFactor", value);
    }

    /* renamed from: c */
    public static final void m100655c(MaterialInstance materialInstance, String name, Texture texture) {
        Intrinsics.checkNotNullParameter(materialInstance, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(texture, "texture");
        m100651g(materialInstance, name, texture, new C41901h36());
    }

    /* renamed from: d */
    public static final void m100654d(MaterialInstance materialInstance, String name, C41807gu1 value) {
        Intrinsics.checkNotNullParameter(materialInstance, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        materialInstance.setParameter(name, value.m37349a(), value.m37348b());
    }

    /* renamed from: e */
    public static final void m100653e(MaterialInstance materialInstance, String name, C42993iu1 value) {
        Intrinsics.checkNotNullParameter(materialInstance, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        materialInstance.setParameter(name, value.m31660e(), value.m31659f(), value.m31658g(), value.m31661d());
    }

    /* renamed from: f */
    public static final void m100652f(MaterialInstance materialInstance, String name, C52154yM2 value) {
        Intrinsics.checkNotNullParameter(materialInstance, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        materialInstance.setParameter(name, MaterialInstance.FloatElement.FLOAT4, value.m3574f(), 0, 4);
    }

    /* renamed from: g */
    public static final void m100651g(MaterialInstance materialInstance, String name, Texture texture, TextureSampler textureSampler) {
        Intrinsics.checkNotNullParameter(materialInstance, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(textureSampler, "textureSampler");
        materialInstance.setParameter(name, texture, textureSampler);
    }

    /* renamed from: h */
    public static /* synthetic */ void m100650h(MaterialInstance materialInstance, String str, Texture texture, TextureSampler textureSampler, int i, Object obj) {
        if ((i & 4) != 0) {
            textureSampler = new C41308g36();
        }
        m100651g(materialInstance, str, texture, textureSampler);
    }
}
