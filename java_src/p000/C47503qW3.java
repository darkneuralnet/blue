package p000;

import com.facebook.share.internal.C17296a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u0012\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"LMs5;", "", "", C17296a.f69688o, "", "", "b", "(Ljava/util/List;)[LMs5;", "[LMs5;", "getEMPTY_DESCRIPTOR_ARRAY$annotations", "()V", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1#2:178\n37#3,2:179\n1789#4,3:181\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n76#1:179,2\n154#1:181,3\n*E\n"})
/* renamed from: qW3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47503qW3 {

    /* renamed from: a */
    public static final InterfaceC34588Ms5[] f105368a = new InterfaceC34588Ms5[0];

    /* renamed from: a */
    public static final Set<String> m17475a(InterfaceC34588Ms5 interfaceC34588Ms5) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        if (interfaceC34588Ms5 instanceof InterfaceC43131j80) {
            return ((InterfaceC43131j80) interfaceC34588Ms5).mo31065a();
        }
        HashSet hashSet = new HashSet(interfaceC34588Ms5.mo10459e());
        int mo10459e = interfaceC34588Ms5.mo10459e();
        for (int i = 0; i < mo10459e; i++) {
            hashSet.add(interfaceC34588Ms5.mo10458f(i));
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final InterfaceC34588Ms5[] m17474b(List<? extends InterfaceC34588Ms5> list) {
        boolean z;
        InterfaceC34588Ms5[] interfaceC34588Ms5Arr;
        List<? extends InterfaceC34588Ms5> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            list = null;
        }
        if (list == null || (interfaceC34588Ms5Arr = (InterfaceC34588Ms5[]) list.toArray(new InterfaceC34588Ms5[0])) == null) {
            return f105368a;
        }
        return interfaceC34588Ms5Arr;
    }
}
