package p000;

import com.facebook.share.internal.C17296a;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010$\n\u0002\b\u0002\u001a\u001a\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000¨\u0006\u0002"}, m28432d2 = {"", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: WL2 */
/* loaded from: classes2.dex */
public final class WL2 {

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: WL2$a */
    /* loaded from: classes2.dex */
    public static final class C8989a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C8989a f40782g = new C8989a();

        public C8989a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Removing non-string keys from map";
        }
    }

    /* renamed from: a */
    public static final Map<?, ?> m78569a(Map<?, ?> map) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C43664k20.m29442e(C43664k20.f93782a, map, C43664k20.EnumC25082a.W, null, false, C8989a.f40782g, 6, null);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<?, ?> entry2 : map.entrySet()) {
            if (entry2.getKey() instanceof String) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(linkedHashMap2.size());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            Object value = entry3.getValue();
            if (value instanceof Date) {
                value = C46287oT0.m21031e((Date) value, EnumC37717a20.LONG, null, 2, null);
            } else if (value instanceof Map) {
                value = m78569a((Map) value);
            }
            linkedHashMap3.put(key, value);
        }
        return linkedHashMap3;
    }
}
