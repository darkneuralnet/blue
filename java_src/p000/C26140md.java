package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC44199kw1;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"", Entry.TYPE_TEXT, "LG26;", "style", "", "LDf$b;", "LGN5;", "spanStyles", "LTU3;", "placeholders", "", "maxLines", "", "ellipsis", "Lkz0;", "constraints", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "LxE3;", "b", "(Ljava/lang/String;LG26;Ljava/util/List;Ljava/util/List;IZJLg01;Lkw1$b;)LxE3;", "LAE3;", "paragraphIntrinsics", C17296a.f69688o, "(LAE3;IZJ)LxE3;", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "AndroidParagraph_androidKt")
/* renamed from: md */
/* loaded from: classes.dex */
public final class C26140md {
    /* renamed from: a */
    public static final InterfaceC51490xE3 m25310a(AE3 paragraphIntrinsics, int i, boolean z, long j) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return new C23291id((C25194kd) paragraphIntrinsics, i, z, j, null);
    }

    /* renamed from: b */
    public static final InterfaceC51490xE3 m25309b(String text, G26 style, List<C1577Df.C1580b<GN5>> spanStyles, List<C1577Df.C1580b<TU3>> placeholders, int i, boolean z, long j, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new C23291id(new C25194kd(text, style, spanStyles, placeholders, fontFamilyResolver, density), i, z, j, null);
    }
}
