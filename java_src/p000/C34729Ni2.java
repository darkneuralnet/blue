package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import p000.C51945y01;
import p000.RS5;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0000\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0000\"2\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\",\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LMs5;", "Lbi2;", "json", "", "", "", "b", "descriptor", DateTokenConverter.CONVERTER_KEY, "index", "f", "LOi2;", "k", "name", "g", "suffix", "i", "Ly01$a;", C17296a.f69688o, "Ly01$a;", "e", "()Ly01$a;", "getJsonDeserializationNamesKey$annotations", "()V", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "getJsonSerializationNamesKey$annotations", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n800#2,11:122\n13579#3,2:133\n1#4:135\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:122,11\n35#1:133,2\n*E\n"})
/* renamed from: Ni2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34729Ni2 {

    /* renamed from: a */
    public static final C51945y01.C30404a<Map<String, Integer>> f25013a = new C51945y01.C30404a<>();

    /* renamed from: b */
    public static final C51945y01.C30404a<String[]> f25014b = new C51945y01.C30404a<>();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ni2$a */
    /* loaded from: classes8.dex */
    public static final class C5658a extends Lambda implements Function0<Map<String, ? extends Integer>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC34588Ms5 f25015g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC38706bi2 f25016h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5658a(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 abstractC38706bi2) {
            super(0);
            this.f25015g = interfaceC34588Ms5;
            this.f25016h = abstractC38706bi2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends Integer> invoke() {
            return C34729Ni2.m93561b(this.f25015g, this.f25016h);
        }
    }

    /* renamed from: b */
    public static final Map<String, Integer> m93561b(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 abstractC38706bi2) {
        Map<String, Integer> emptyMap;
        Object singleOrNull;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m93552k(interfaceC34588Ms5, abstractC38706bi2);
        int mo10459e = interfaceC34588Ms5.mo10459e();
        for (int i = 0; i < mo10459e; i++) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : interfaceC34588Ms5.mo10457g(i)) {
                if (obj instanceof InterfaceC34495Mi2) {
                    arrayList.add(obj);
                }
            }
            singleOrNull = CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) arrayList);
            InterfaceC34495Mi2 interfaceC34495Mi2 = (InterfaceC34495Mi2) singleOrNull;
            if (interfaceC34495Mi2 != null && (names = interfaceC34495Mi2.names()) != null) {
                for (String str : names) {
                    m93560c(linkedHashMap, interfaceC34588Ms5, str, i);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final void m93560c(Map<String, Integer> map, InterfaceC34588Ms5 interfaceC34588Ms5, String str, int i) {
        Object value;
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The suggested name '");
        sb.append(str);
        sb.append("' for property ");
        sb.append(interfaceC34588Ms5.mo10458f(i));
        sb.append(" is already one of the names for property ");
        value = MapsKt__MapsKt.getValue(map, str);
        sb.append(interfaceC34588Ms5.mo10458f(((Number) value).intValue()));
        sb.append(" in ");
        sb.append(interfaceC34588Ms5);
        throw new JsonException(sb.toString());
    }

    /* renamed from: d */
    public static final Map<String, Integer> m93559d(AbstractC38706bi2 abstractC38706bi2, InterfaceC34588Ms5 descriptor) {
        Intrinsics.checkNotNullParameter(abstractC38706bi2, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) C42884ij2.m33531a(abstractC38706bi2).m4248b(descriptor, f25013a, new C5658a(descriptor, abstractC38706bi2));
    }

    /* renamed from: e */
    public static final C51945y01.C30404a<Map<String, Integer>> m93558e() {
        return f25013a;
    }

    /* renamed from: f */
    public static final String m93557f(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 json, int i) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        m93552k(interfaceC34588Ms5, json);
        return interfaceC34588Ms5.mo10458f(i);
    }

    /* renamed from: g */
    public static final int m93556g(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 json, String name) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        m93552k(interfaceC34588Ms5, json);
        int mo10461c = interfaceC34588Ms5.mo10461c(name);
        if (mo10461c != -3) {
            return mo10461c;
        }
        if (!json.m64102e().m30063k()) {
            return mo10461c;
        }
        return m93555h(json, interfaceC34588Ms5, name);
    }

    /* renamed from: h */
    public static final int m93555h(AbstractC38706bi2 abstractC38706bi2, InterfaceC34588Ms5 interfaceC34588Ms5, String str) {
        Integer num = m93559d(abstractC38706bi2, interfaceC34588Ms5).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* renamed from: i */
    public static final int m93554i(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int m93556g = m93556g(interfaceC34588Ms5, json, name);
        if (m93556g != -3) {
            return m93556g;
        }
        throw new SerializationException(interfaceC34588Ms5.mo10456h() + " does not contain element with name '" + name + CoreConstants.SINGLE_QUOTE_CHAR + suffix);
    }

    /* renamed from: j */
    public static /* synthetic */ int m93553j(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 abstractC38706bi2, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return m93554i(interfaceC34588Ms5, abstractC38706bi2, str, str2);
    }

    /* renamed from: k */
    public static final InterfaceC34963Oi2 m93552k(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 json) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(interfaceC34588Ms5.getKind(), RS5.C7171a.f32056a)) {
            json.m64102e().m30066h();
            return null;
        }
        return null;
    }
}
