package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"LbS5;", "LIX2;", C17296a.f69688o, "restring_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: cS5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39150cS5 {
    /* renamed from: a */
    public static final IX2 m61300a(InterfaceC38557bS5 interfaceC38557bS5) {
        IX2 ix2;
        Intrinsics.checkNotNullParameter(interfaceC38557bS5, "<this>");
        if (interfaceC38557bS5 instanceof IX2) {
            ix2 = (IX2) interfaceC38557bS5;
        } else {
            ix2 = null;
        }
        if (ix2 != null) {
            return ix2;
        }
        throw new IllegalStateException("Your custom repository needs to implement MutableStringsRepository!".toString());
    }
}
