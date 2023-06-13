package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Stream;
import com.google.android.filament.Texture;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u001a&\u0010\u000e\u001a\u00020\u0005*\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\f\u001a\n\u0010\u000f\u001a\u00020\u0005*\u00020\u0001¨\u0006\u0010"}, m28432d2 = {"Lcom/google/android/filament/Texture$Builder;", "Lcom/google/android/filament/Texture;", C17296a.f69688o, "Lcom/google/android/filament/Stream;", "stream", "", "c", "", "level", "Lcom/google/android/filament/Texture$PixelBufferDescriptor;", "buffer", DateTokenConverter.CONVERTER_KEY, "", "faceOffsetsInBytes", "e", "b", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: e36  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40122e36 {
    /* renamed from: a */
    public static final Texture m43308a(Texture.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Texture build = builder.build(C39939dl1.m43784c());
        Intrinsics.checkNotNullExpressionValue(build, "build(Filament.engine)");
        return build;
    }

    /* renamed from: b */
    public static final void m43307b(Texture texture) {
        Intrinsics.checkNotNullParameter(texture, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            C39939dl1.m43784c().destroyTexture(texture);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: c */
    public static final void m43306c(Texture texture, Stream stream) {
        Intrinsics.checkNotNullParameter(texture, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        texture.setExternalStream(C39939dl1.m43784c(), stream);
    }

    /* renamed from: d */
    public static final void m43305d(Texture texture, int i, Texture.PixelBufferDescriptor buffer) {
        Intrinsics.checkNotNullParameter(texture, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        texture.setImage(C39939dl1.m43784c(), i, buffer);
    }

    /* renamed from: e */
    public static final void m43304e(Texture texture, int i, Texture.PixelBufferDescriptor buffer, int[] faceOffsetsInBytes) {
        Intrinsics.checkNotNullParameter(texture, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(faceOffsetsInBytes, "faceOffsetsInBytes");
        texture.setImage(C39939dl1.m43784c(), i, buffer, faceOffsetsInBytes);
    }
}
