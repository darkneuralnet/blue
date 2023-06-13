package p000;

import android.text.style.TtsSpan;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, m28432d2 = {"LAa6;", "Landroid/text/style/TtsSpan;", C17296a.f69688o, "LAo6;", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ba6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31853Ba6 {
    /* renamed from: a */
    public static final TtsSpan m113841a(AbstractC31619Aa6 abstractC31619Aa6) {
        Intrinsics.checkNotNullParameter(abstractC31619Aa6, "<this>");
        if (abstractC31619Aa6 instanceof C31745Ao6) {
            return m113840b((C31745Ao6) abstractC31619Aa6);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final TtsSpan m113840b(C31745Ao6 c31745Ao6) {
        Intrinsics.checkNotNullParameter(c31745Ao6, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(c31745Ao6.m115146a()).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }
}
