package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.AbstractC44199kw1;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a>\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LG26;", "style", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "", Entry.TYPE_TEXT, "", "maxLines", "LG52;", C17296a.f69688o, "(LG26;Lg01;Lkw1$b;Ljava/lang/String;I)J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: j16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43067j16 {

    /* renamed from: a */
    public static final String f92023a;

    static {
        String repeat;
        repeat = StringsKt__StringsJVMKt.repeat("H", 10);
        f92023a = repeat;
    }

    /* renamed from: a */
    public static final long m31240a(G26 style, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver, String text, int i) {
        List emptyList;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(text, "text");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        InterfaceC51490xE3 m112594b = CE3.m112594b(text, style, C46007nz0.m22042b(0, 0, 0, 0, 15, null), density, fontFamilyResolver, emptyList, null, i, false, 64, null);
        return H52.m104430a(V06.m80500a(m112594b.mo5643a()), V06.m80500a(m112594b.getHeight()));
    }

    /* renamed from: b */
    public static /* synthetic */ long m31239b(G26 g26, InterfaceC41273g01 interfaceC41273g01, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = f92023a;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return m31240a(g26, interfaceC41273g01, interfaceC25559b, str, i);
    }

    /* renamed from: c */
    public static final String m31238c() {
        return f92023a;
    }
}
