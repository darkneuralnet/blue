package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.IndirectLight;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lcom/google/android/filament/IndirectLight$Builder;", "Lcom/google/android/filament/IndirectLight;", C17296a.f69688o, "", "b", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: D12 */
/* loaded from: classes6.dex */
public final class D12 {
    /* renamed from: a */
    public static final IndirectLight m111040a(IndirectLight.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        IndirectLight build = builder.build(C39939dl1.m43784c());
        Intrinsics.checkNotNullExpressionValue(build, "build(Filament.engine)");
        return build;
    }

    /* renamed from: b */
    public static final void m111039b(IndirectLight indirectLight) {
        Intrinsics.checkNotNullParameter(indirectLight, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            C39939dl1.m43784c().destroyIndirectLight(indirectLight);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }
}