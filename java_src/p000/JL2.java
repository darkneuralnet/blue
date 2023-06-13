package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.MapStyleOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LJL2;", "LIL2;", "LcD1;", "map", "", "", "includePointsOfInterest", "", C17296a.f69688o, "style", "", DateTokenConverter.CONVERTER_KEY, "enabledPointsOfInterest", "b", "Lg46$b;", "c", "()Lg46$b;", "logger", "<init>", "()V", "co.bird.android.lib.map.style"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapStylerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapStylerImpl.kt\nco/bird/android/lib/map/style/MapStylerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1855#2,2:179\n766#2:181\n857#2,2:182\n1#3:184\n*S KotlinDebug\n*F\n+ 1 MapStylerImpl.kt\nco/bird/android/lib/map/style/MapStylerImpl\n*L\n147#1:179,2\n168#1:181\n168#1:182,2\n*E\n"})
/* renamed from: JL2 */
/* loaded from: classes3.dex */
public final class JL2 implements IL2 {

    /* renamed from: a */
    public static final C4029a f17387a = new C4029a(null);

    /* renamed from: b */
    public static final List<String> f17388b;

    /* renamed from: c */
    public static final String f17389c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u0006¨\u0006\f"}, m28432d2 = {"LJL2$a;", "", "", "MUTED_BASE_STYLE", "Ljava/lang/String;", "getMUTED_BASE_STYLE$annotations", "()V", "", "pointsOfInterest", "Ljava/util/List;", "getPointsOfInterest$annotations", "<init>", "co.bird.android.lib.map.style"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: JL2$a */
    /* loaded from: classes3.dex */
    public static final class C4029a {
        public /* synthetic */ C4029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4029a() {
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"attraction", "business", "government", "medical", "park", "place_of_worship", "school", "sports_complex"});
        f17388b = listOf;
        f17389c = "        [\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#f2f1f0\"\n      },\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f2f1f0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#f2f1f0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"color\": \"#d0d0d0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#c0c0c0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#d0d0d0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"saturation\": -35\n      },\n      {\n        \"lightness\": 30\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#747d8b\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#c1e1f0\"\n      }\n    ]\n  }\n]";
    }

    @Override // p000.IL2
    /* renamed from: a */
    public void mo100666a(C39011cD1 map, List<String> list) {
        Intrinsics.checkNotNullParameter(map, "map");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (m100663d((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        m100664c().mo7221o("Updating the map style options.", new Object[0]);
        map.m61671q(new MapStyleOptions(m100665b(arrayList)));
    }

    /* renamed from: b */
    public final String m100665b(List<String> list) {
        C41095fi2 c41095fi2;
        List minus;
        try {
            c41095fi2 = new C36835Wi2().m77960a(f17389c).m2886c();
        } catch (Exception e) {
            C41318g46.m40158f(e, "Failed to parse muted base map style as json array, ingoring style", new Object[0]);
            c41095fi2 = new C41095fi2();
        }
        if (list != null) {
            minus = CollectionsKt___CollectionsKt.minus((Iterable) f17388b, (Iterable) list);
            Iterator it = minus.iterator();
            while (it.hasNext()) {
                C36133Ti2 c36133Ti2 = new C36133Ti2();
                c36133Ti2.m83136x("featureType", "poi." + ((String) it.next()));
                C41095fi2 c41095fi22 = new C41095fi2();
                C36133Ti2 c36133Ti22 = new C36133Ti2();
                c36133Ti22.m83136x("visibility", "off");
                c41095fi22.m41013w(c36133Ti22);
                c36133Ti2.m83137w("stylers", c41095fi22);
                c41095fi2.m41013w(c36133Ti2);
            }
        }
        String abstractC52360yi2 = c41095fi2.toString();
        Intrinsics.checkNotNullExpressionValue(abstractC52360yi2, "jsonArray.toString()");
        return abstractC52360yi2;
    }

    /* renamed from: c */
    public final C41318g46.AbstractC20723b m100664c() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("map-styler");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"map-styler\")");
        return m40153k;
    }

    /* renamed from: d */
    public final boolean m100663d(String str) {
        return f17388b.contains(str);
    }
}
