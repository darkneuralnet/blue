package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Material;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\r"}, m28432d2 = {"LLM2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "filamatFileLocation", "Lcom/google/android/filament/Material;", C17296a.f69688o, "Ljava/nio/Buffer;", "filamatBuffer", "b", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: LM2 */
/* loaded from: classes6.dex */
public final class LM2 {

    /* renamed from: a */
    public static final LM2 f21310a = new LM2();

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Lcom/google/android/filament/Material;", C17296a.f69688o, "(Ljava/nio/ByteBuffer;)Lcom/google/android/filament/Material;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: LM2$a */
    /* loaded from: classes6.dex */
    public static final class C4891a extends Lambda implements Function1<ByteBuffer, Material> {

        /* renamed from: g */
        public static final C4891a f21311g = new C4891a();

        public C4891a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Material invoke(ByteBuffer byteBuffer) {
            if (byteBuffer != null) {
                return LM2.f21310a.m97031b(byteBuffer);
            }
            throw new IOException("Unable to load the material. Check whether the material exists");
        }
    }

    private LM2() {
    }

    /* renamed from: a */
    public final Material m97032a(Context context, String filamatFileLocation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filamatFileLocation, "filamatFileLocation");
        return (Material) C45042mM4.m25807e(context, filamatFileLocation, C4891a.f21311g);
    }

    /* renamed from: b */
    public final Material m97031b(Buffer filamatBuffer) {
        Intrinsics.checkNotNullParameter(filamatBuffer, "filamatBuffer");
        Material.Builder payload = new Material.Builder().payload(filamatBuffer, filamatBuffer.remaining());
        Intrinsics.checkNotNullExpressionValue(payload, "Builder()\n        .paylo…ilamatBuffer.remaining())");
        return KM2.m98976a(payload);
    }
}
