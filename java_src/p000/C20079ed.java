package p000;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aa\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LRW2;", "Lme0;", "canvas", "La30;", "brush", "", "alpha", "LPx5;", "shadow", "LR06;", "decoration", "LJ61;", "drawStyle", "LLW;", "blendMode", "", C17296a.f69688o, "(LRW2;Lme0;La30;FLPx5;LR06;LJ61;I)V", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidMultiParagraphDraw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n33#2,6:98\n33#2,6:104\n33#2,6:110\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n*L\n55#1:98,6\n62#1:104,6\n93#1:110,6\n*E\n"})
/* renamed from: ed */
/* loaded from: classes.dex */
public final class C20079ed {
    /* renamed from: a */
    public static final void m42703a(RW2 drawMultiParagraph, InterfaceC45204me0 canvas, AbstractC37727a30 brush, float f, C35335Px5 c35335Px5, R06 r06, J61 j61, int i) {
        Intrinsics.checkNotNullParameter(drawMultiParagraph, "$this$drawMultiParagraph");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        canvas.mo25245v();
        if (drawMultiParagraph.m86649v().size() <= 1) {
            m42702b(drawMultiParagraph, canvas, brush, f, c35335Px5, r06, j61, i);
        } else if (brush instanceof C46831pN5) {
            m42702b(drawMultiParagraph, canvas, brush, f, c35335Px5, r06, j61, i);
        } else if (brush instanceof AbstractC34399Lx5) {
            List<C52083yE3> m86649v = drawMultiParagraph.m86649v();
            int size = m86649v.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                C52083yE3 c52083yE3 = m86649v.get(i2);
                f3 += c52083yE3.m3784e().getHeight();
                f2 = Math.max(f2, c52083yE3.m3784e().getWidth());
            }
            Shader mo65060b = ((AbstractC34399Lx5) brush).mo65060b(CB5.m112663a(f2, f3));
            Matrix matrix = new Matrix();
            mo65060b.getLocalMatrix(matrix);
            List<C52083yE3> m86649v2 = drawMultiParagraph.m86649v();
            int size2 = m86649v2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C52083yE3 c52083yE32 = m86649v2.get(i3);
                c52083yE32.m3784e().mo5626r(canvas, C38320b30.m65061a(mo65060b), f, c35335Px5, r06, j61, i);
                canvas.mo25265b(0.0f, c52083yE32.m3784e().getHeight());
                matrix.setTranslate(0.0f, -c52083yE32.m3784e().getHeight());
                mo65060b.setLocalMatrix(matrix);
            }
        }
        canvas.mo25251p();
    }

    /* renamed from: b */
    public static final void m42702b(RW2 rw2, InterfaceC45204me0 interfaceC45204me0, AbstractC37727a30 abstractC37727a30, float f, C35335Px5 c35335Px5, R06 r06, J61 j61, int i) {
        List<C52083yE3> m86649v = rw2.m86649v();
        int size = m86649v.size();
        for (int i2 = 0; i2 < size; i2++) {
            C52083yE3 c52083yE3 = m86649v.get(i2);
            c52083yE3.m3784e().mo5626r(interfaceC45204me0, abstractC37727a30, f, c35335Px5, r06, j61, i);
            interfaceC45204me0.mo25265b(0.0f, c52083yE3.m3784e().getHeight());
        }
    }
}
