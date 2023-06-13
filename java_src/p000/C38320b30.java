package p000;

import android.graphics.Shader;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¨\u0006\u0005"}, m28432d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shader", "LLx5;", C17296a.f69688o, "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: b30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38320b30 {

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"b30$a", "LLx5;", "LxB5;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: b30$a */
    /* loaded from: classes.dex */
    public static final class C12280a extends AbstractC34399Lx5 {

        /* renamed from: e */
        public final /* synthetic */ Shader f56826e;

        public C12280a(Shader shader) {
            this.f56826e = shader;
        }

        @Override // p000.AbstractC34399Lx5
        /* renamed from: b */
        public Shader mo65060b(long j) {
            return this.f56826e;
        }
    }

    /* renamed from: a */
    public static final AbstractC34399Lx5 m65061a(Shader shader) {
        Intrinsics.checkNotNullParameter(shader, "shader");
        return new C12280a(shader);
    }
}
