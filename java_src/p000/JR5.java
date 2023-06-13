package p000;

import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0004\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\t¨\u0006\f"}, m28432d2 = {"", "LMs5;", C17296a.f69688o, "Ljava/util/Set;", "getUnsignedNumberDescriptors$annotations", "()V", "unsignedNumberDescriptors", "", "b", "(LMs5;)Z", "isUnsignedNumber", "isUnquotedLiteral", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: JR5 */
/* loaded from: classes8.dex */
public final class JR5 {

    /* renamed from: a */
    public static final Set<InterfaceC34588Ms5> f17547a;

    static {
        Set<InterfaceC34588Ms5> of;
        of = SetsKt__SetsKt.setOf((Object[]) new InterfaceC34588Ms5[]{C38330b40.m65019r(UInt.Companion).getDescriptor(), C38330b40.m65018s(ULong.Companion).getDescriptor(), C38330b40.m65020q(UByte.Companion).getDescriptor(), C38330b40.m65017t(UShort.Companion).getDescriptor()});
        f17547a = of;
    }

    /* renamed from: a */
    public static final boolean m100462a(InterfaceC34588Ms5 interfaceC34588Ms5) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        if (interfaceC34588Ms5.isInline() && Intrinsics.areEqual(interfaceC34588Ms5, C52953zi2.m520m())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m100461b(InterfaceC34588Ms5 interfaceC34588Ms5) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        if (interfaceC34588Ms5.isInline() && f17547a.contains(interfaceC34588Ms5)) {
            return true;
        }
        return false;
    }
}
