package p000;

import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"LMs5;", "", "typeParams", "", C17296a.f69688o, "(LMs5;[LMs5;)I", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n154#2:135\n154#2:139\n1789#3,3:136\n1789#3,3:140\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n128#1:135\n129#1:139\n128#1:136,3\n129#1:140,3\n*E\n"})
/* renamed from: BW3 */
/* loaded from: classes8.dex */
public final class BW3 {
    /* renamed from: a */
    public static final int m113909a(InterfaceC34588Ms5 interfaceC34588Ms5, InterfaceC34588Ms5[] typeParams) {
        int i;
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (interfaceC34588Ms5.mo10456h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<InterfaceC34588Ms5> m89666a = C35290Ps5.m89666a(interfaceC34588Ms5);
        Iterator<InterfaceC34588Ms5> it = m89666a.iterator();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String mo10456h = it.next().mo10456h();
            if (mo10456h != null) {
                i4 = mo10456h.hashCode();
            }
            i3 = i5 + i4;
        }
        for (InterfaceC34588Ms5 interfaceC34588Ms52 : m89666a) {
            int i6 = i2 * 31;
            AbstractC36226Ts5 kind = interfaceC34588Ms52.getKind();
            if (kind != null) {
                i = kind.hashCode();
            } else {
                i = 0;
            }
            i2 = i6 + i;
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }
}
