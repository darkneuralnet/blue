package p000;

import com.facebook.share.internal.C17296a;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0002¨\u0006\u0005"}, m28432d2 = {"LXi6;", "", "b", "", C17296a.f69688o, "vtbeacon_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Yi6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37307Yi6 {
    /* renamed from: a */
    public static final byte m74361a(byte[] bArr) {
        int sum;
        sum = ArraysKt___ArraysKt.sum(bArr);
        return (byte) (sum & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: b */
    public static final byte[] m74360b(InterfaceC37073Xi6 interfaceC37073Xi6) {
        byte[] plus;
        byte[] plus2;
        Intrinsics.checkNotNullParameter(interfaceC37073Xi6, "<this>");
        plus = ArraysKt___ArraysJvmKt.plus(new byte[]{interfaceC37073Xi6.mo15543E(), interfaceC37073Xi6.mo15542a()}, interfaceC37073Xi6.getData());
        plus2 = ArraysKt___ArraysJvmKt.plus(plus, m74361a(plus));
        return plus2;
    }
}
