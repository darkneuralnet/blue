package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC36226Ts5;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\b"}, m28432d2 = {"Lbi2;", "LMs5;", "desc", "LjH6;", "b", "Lkt5;", "module", C17296a.f69688o, "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"})
/* renamed from: kH6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43813kH6 {
    /* renamed from: a */
    public static final InterfaceC34588Ms5 m29104a(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC44173kt5 module) {
        InterfaceC34588Ms5 m29104a;
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (Intrinsics.areEqual(interfaceC34588Ms5.getKind(), AbstractC36226Ts5.C8135a.f36381a)) {
            InterfaceC34588Ms5 m95646b = MA0.m95646b(module, interfaceC34588Ms5);
            if (m95646b != null && (m29104a = m29104a(m95646b, module)) != null) {
                return m29104a;
            }
            return interfaceC34588Ms5;
        } else if (interfaceC34588Ms5.isInline()) {
            return m29104a(interfaceC34588Ms5.mo10460d(0), module);
        } else {
            return interfaceC34588Ms5;
        }
    }

    /* renamed from: b */
    public static final EnumC43220jH6 m29103b(AbstractC38706bi2 abstractC38706bi2, InterfaceC34588Ms5 desc) {
        Intrinsics.checkNotNullParameter(abstractC38706bi2, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        AbstractC36226Ts5 kind = desc.getKind();
        if (kind instanceof OX3) {
            return EnumC43220jH6.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, RS5.C7172b.f32057a)) {
            return EnumC43220jH6.LIST;
        }
        if (Intrinsics.areEqual(kind, RS5.C7173c.f32058a)) {
            InterfaceC34588Ms5 m29104a = m29104a(desc.mo10460d(0), abstractC38706bi2.m64101f());
            AbstractC36226Ts5 kind2 = m29104a.getKind();
            if (!(kind2 instanceof E24) && !Intrinsics.areEqual(kind2, AbstractC36226Ts5.C8136b.f36382a)) {
                if (abstractC38706bi2.m64102e().m30072b()) {
                    return EnumC43220jH6.LIST;
                }
                throw C32857Fi2.m106732d(m29104a);
            }
            return EnumC43220jH6.MAP;
        }
        return EnumC43220jH6.OBJ;
    }
}
