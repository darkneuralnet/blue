package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¨\u0006\u000f"}, m28432d2 = {"LWu2;", "", "", "localAddress", "", "LfN1;", "", "hostsEnabled", "", "hostPorts", "", "LH6;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalHostConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostConverter.kt\nco/bird/android/feature/localhost/adapters/LocalHostConverter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n11335#2:38\n11670#2,3:39\n*S KotlinDebug\n*F\n+ 1 LocalHostConverter.kt\nco/bird/android/feature/localhost/adapters/LocalHostConverter\n*L\n16#1:38\n16#1:39,3\n*E\n"})
/* renamed from: Wu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36943Wu2 {
    /* renamed from: a */
    public final List<C3023H6> m77719a(String str, Map<EnumC40897fN1, Boolean> hostsEnabled, Map<EnumC40897fN1, Integer> hostPorts) {
        List mutableList;
        List<C3023H6> listOf;
        boolean z;
        Intrinsics.checkNotNullParameter(hostsEnabled, "hostsEnabled");
        Intrinsics.checkNotNullParameter(hostPorts, "hostPorts");
        EnumC40897fN1[] values = EnumC40897fN1.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC40897fN1 enumC40897fN1 : values) {
            Integer num = hostPorts.get(enumC40897fN1);
            Boolean bool = hostsEnabled.get(enumC40897fN1);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            arrayList.add(new C2637G6(new C41490gN1(enumC40897fN1, num, z), C43479jj4.item_host, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(str, C43479jj4.item_local_address, false, 4, null), null, 4, null));
        return listOf;
    }
}
