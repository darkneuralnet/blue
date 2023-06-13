package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC44199kw1;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a{\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\f\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"", Entry.TYPE_TEXT, "LG26;", "style", "Lkz0;", "constraints", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "", "LDf$b;", "LGN5;", "spanStyles", "LTU3;", "placeholders", "", "maxLines", "", "ellipsis", "LxE3;", C17296a.f69688o, "(Ljava/lang/String;LG26;JLg01;Lkw1$b;Ljava/util/List;Ljava/util/List;IZ)LxE3;", "LAE3;", "paragraphIntrinsics", "c", "(LAE3;JIZ)LxE3;", "", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: CE3 */
/* loaded from: classes.dex */
public final class CE3 {
    /* renamed from: a */
    public static final InterfaceC51490xE3 m112595a(String text, G26 style, long j, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver, List<C1577Df.C1580b<GN5>> spanStyles, List<C1577Df.C1580b<TU3>> placeholders, int i, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        return C26140md.m25309b(text, style, spanStyles, placeholders, i, z, j, density, fontFamilyResolver);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC51490xE3 m112594b(String str, G26 g26, long j, InterfaceC41273g01 interfaceC41273g01, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, List list, List list2, int i, boolean z, int i2, Object obj) {
        List list3;
        List list4;
        int i3;
        boolean z2;
        List emptyList;
        List emptyList2;
        if ((i2 & 32) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList2;
        } else {
            list3 = list;
        }
        if ((i2 & 64) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list2;
        }
        if ((i2 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m112595a(str, g26, j, interfaceC41273g01, interfaceC25559b, list3, list4, i3, z2);
    }

    /* renamed from: c */
    public static final InterfaceC51490xE3 m112593c(AE3 paragraphIntrinsics, long j, int i, boolean z) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        return C26140md.m25310a(paragraphIntrinsics, i, z, j);
    }

    /* renamed from: d */
    public static final int m112592d(float f) {
        return (int) Math.ceil(f);
    }
}
