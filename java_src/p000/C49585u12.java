package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.IndexBuffer;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\"\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0001¨\u0006\f"}, m28432d2 = {"Lcom/google/android/filament/IndexBuffer$Builder;", "Lcom/google/android/filament/IndexBuffer;", C17296a.f69688o, "Ljava/nio/Buffer;", "buffer", "", "c", "", "destOffsetInBytes", "count", DateTokenConverter.CONVERTER_KEY, "b", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: u12  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49585u12 {
    /* renamed from: a */
    public static final IndexBuffer m11061a(IndexBuffer.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        IndexBuffer build = builder.build(C39939dl1.m43784c());
        Intrinsics.checkNotNullExpressionValue(build, "build(Filament.engine)");
        return build;
    }

    /* renamed from: b */
    public static final void m11060b(IndexBuffer indexBuffer) {
        Intrinsics.checkNotNullParameter(indexBuffer, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            C39939dl1.m43784c().destroyIndexBuffer(indexBuffer);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: c */
    public static final void m11059c(IndexBuffer indexBuffer, Buffer buffer) {
        Intrinsics.checkNotNullParameter(indexBuffer, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        indexBuffer.setBuffer(C39939dl1.m43784c(), buffer);
    }

    /* renamed from: d */
    public static final void m11058d(IndexBuffer indexBuffer, Buffer buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(indexBuffer, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        indexBuffer.setBuffer(C39939dl1.m43784c(), buffer, i, i2);
    }
}
