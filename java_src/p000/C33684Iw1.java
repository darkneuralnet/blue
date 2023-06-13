package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0012\"\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"LIw1;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "LHw1;", C17296a.f69688o, "Ljava/util/List;", "()Ljava/util/List;", "settings", "b", "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "", "<init>", "([LHw1;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n10783#2:373\n11008#2,3:374\n11011#2,3:384\n361#3,7:377\n76#4:387\n96#4,5:388\n101#5,2:393\n33#5,6:395\n103#5:401\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:373\n52#1:374,3\n52#1:384,3\n52#1:377,7\n53#1:387\n53#1:388,5\n60#1:393,2\n60#1:395,6\n60#1:401\n*E\n"})
/* renamed from: Iw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33684Iw1 {

    /* renamed from: a */
    public final List<InterfaceC33450Hw1> f16477a;

    /* renamed from: b */
    public final boolean f16478b;

    public C33684Iw1(InterfaceC33450Hw1... settings) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(settings, "settings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (InterfaceC33450Hw1 interfaceC33450Hw1 : settings) {
            String m103218a = interfaceC33450Hw1.m103218a();
            Object obj = linkedHashMap.get(m103218a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(m103218a, obj);
            }
            ((List) obj).add(interfaceC33450Hw1);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, list);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
                    sb.append(str);
                    sb.append("' must be unique. Actual [ [");
                    joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null);
                    sb.append(joinToString$default);
                    sb.append(']');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                this.f16477a = arrayList2;
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((InterfaceC33450Hw1) arrayList2.get(i)).m103217b()) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                this.f16478b = z;
                return;
            }
        }
    }

    /* renamed from: a */
    public final List<InterfaceC33450Hw1> m101463a() {
        return this.f16477a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C33684Iw1) && Intrinsics.areEqual(this.f16477a, ((C33684Iw1) obj).f16477a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f16477a.hashCode();
    }
}
