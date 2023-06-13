package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.VertexBuffer;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001a\u0010\b\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a*\u0010\u000b\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\u0001¨\u0006\r"}, m28432d2 = {"Lcom/google/android/filament/VertexBuffer$Builder;", "Lcom/google/android/filament/VertexBuffer;", C17296a.f69688o, "", "bufferIndex", "Ljava/nio/Buffer;", "buffer", "", "c", "destOffsetInBytes", "count", DateTokenConverter.CONVERTER_KEY, "b", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Ho6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33383Ho6 {
    /* renamed from: a */
    public static final VertexBuffer m103422a(VertexBuffer.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        VertexBuffer build = builder.build(C39939dl1.m43784c());
        Intrinsics.checkNotNullExpressionValue(build, "build(Filament.engine)");
        return build;
    }

    /* renamed from: b */
    public static final void m103421b(VertexBuffer vertexBuffer) {
        Intrinsics.checkNotNullParameter(vertexBuffer, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            C39939dl1.m43784c().destroyVertexBuffer(vertexBuffer);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: c */
    public static final void m103420c(VertexBuffer vertexBuffer, int i, Buffer buffer) {
        Intrinsics.checkNotNullParameter(vertexBuffer, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        vertexBuffer.setBufferAt(C39939dl1.m43784c(), i, buffer);
    }

    /* renamed from: d */
    public static final void m103419d(VertexBuffer vertexBuffer, int i, Buffer buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(vertexBuffer, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        vertexBuffer.setBufferAt(C39939dl1.m43784c(), i, buffer, i2, i3);
    }
}
