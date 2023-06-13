package co.bird.api.json;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ZigZagVehicle;
import co.bird.android.model.ZigZagVehiclesResponse;
import com.facebook.share.internal.C17296a;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0010H\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/json/ZigZagTypeAdapter;", "Lvi2;", "Lco/bird/android/model/ZigZagVehiclesResponse;", "Llj2;", "Lyi2;", "json", "Ljava/lang/reflect/Type;", "type", "Lui2;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "src", "Lkj2;", DateTokenConverter.CONVERTER_KEY, "Lfi2;", "b", "LTi2;", "c", "LoE1;", "LoE1;", "gson", "<init>", "()V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZigZagTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZigZagTypeAdapter.kt\nco/bird/api/json/ZigZagTypeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1603#2,9:90\n1855#2:99\n1856#2:101\n1612#2:102\n1603#2,9:103\n1855#2:112\n1603#2,9:113\n1855#2:122\n1856#2:124\n1612#2:125\n1856#2:127\n1612#2:128\n1#3:100\n1#3:123\n1#3:126\n1#3:129\n*S KotlinDebug\n*F\n+ 1 ZigZagTypeAdapter.kt\nco/bird/api/json/ZigZagTypeAdapter\n*L\n51#1:90,9\n51#1:99\n51#1:101\n51#1:102\n70#1:103,9\n70#1:112\n72#1:113,9\n72#1:122\n72#1:124\n72#1:125\n70#1:127\n70#1:128\n51#1:100\n72#1:123\n70#1:126\n*E\n"})
/* loaded from: classes4.dex */
public final class ZigZagTypeAdapter implements InterfaceC50581vi2<ZigZagVehiclesResponse>, InterfaceC44663lj2<ZigZagVehiclesResponse> {

    /* renamed from: a */
    public final C46153oE1 f68197a;

    public ZigZagTypeAdapter() {
        C46153oE1 m19808b = new C46746pE1().m19806d().m19802h().m19801i(EnumC36618Vk1.f39679f).m19798l().m19808b();
        Intrinsics.checkNotNullExpressionValue(m19808b, "GsonBuilder()\n    .enabl…yPrinting()\n    .create()");
        this.f68197a = m19808b;
    }

    @Override // p000.InterfaceC50581vi2
    /* renamed from: a */
    public ZigZagVehiclesResponse deserialize(AbstractC52360yi2 json, Type type, InterfaceC49989ui2 context) throws JsonParseException {
        List emptyList;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        if (json.m2881o()) {
            C41095fi2 m2886c = json.m2886c();
            Intrinsics.checkNotNullExpressionValue(m2886c, "json.asJsonArray");
            return m53914b(m2886c);
        } else if (json.m2879u()) {
            C36133Ti2 m2885e = json.m2885e();
            Intrinsics.checkNotNullExpressionValue(m2885e, "json.asJsonObject");
            return m53913c(m2885e);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new ZigZagVehiclesResponse(emptyList);
        }
    }

    /* renamed from: b */
    public final ZigZagVehiclesResponse m53914b(C41095fi2 c41095fi2) {
        ZigZagVehicle zigZagVehicle;
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC52360yi2> it = c41095fi2.m2886c().iterator();
        while (it.hasNext()) {
            AbstractC52360yi2 next = it.next();
            if (next.m2879u()) {
                Set<Map.Entry<String, AbstractC52360yi2>> entrySet = next.m2885e().entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "plateObject.entrySet()");
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = entrySet.iterator();
                while (it2.hasNext()) {
                    AbstractC52360yi2 abstractC52360yi2 = (AbstractC52360yi2) ((Map.Entry) it2.next()).getValue();
                    if (abstractC52360yi2.m2879u()) {
                        zigZagVehicle = (ZigZagVehicle) this.f68197a.m21561h(abstractC52360yi2, ZigZagVehicle.class);
                    } else {
                        zigZagVehicle = null;
                    }
                    if (zigZagVehicle != null) {
                        arrayList2.add(zigZagVehicle);
                    }
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
            }
        }
        return new ZigZagVehiclesResponse(arrayList);
    }

    /* renamed from: c */
    public final ZigZagVehiclesResponse m53913c(C36133Ti2 c36133Ti2) {
        List flatten;
        ZigZagVehicle zigZagVehicle;
        Set<Map.Entry<String, AbstractC52360yi2>> entrySet = c36133Ti2.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "json.entrySet()");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ArrayList arrayList2 = null;
            if (((AbstractC52360yi2) entry.getValue()).m2879u()) {
                Set<Map.Entry<String, AbstractC52360yi2>> entrySet2 = ((AbstractC52360yi2) entry.getValue()).m2885e().entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet2, "plateDictionary.value.asJsonObject.entrySet()");
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = entrySet2.iterator();
                while (it2.hasNext()) {
                    AbstractC52360yi2 abstractC52360yi2 = (AbstractC52360yi2) ((Map.Entry) it2.next()).getValue();
                    if (abstractC52360yi2.m2879u()) {
                        zigZagVehicle = (ZigZagVehicle) this.f68197a.m21561h(abstractC52360yi2, ZigZagVehicle.class);
                    } else {
                        zigZagVehicle = null;
                    }
                    if (zigZagVehicle != null) {
                        arrayList3.add(zigZagVehicle);
                    }
                }
                arrayList2 = arrayList3;
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        flatten = CollectionsKt__IterablesKt.flatten(arrayList);
        return new ZigZagVehiclesResponse(flatten);
    }

    @Override // p000.InterfaceC44663lj2
    /* renamed from: d */
    public AbstractC52360yi2 serialize(ZigZagVehiclesResponse zigZagVehiclesResponse, Type type, InterfaceC44070kj2 context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        if (zigZagVehiclesResponse != null) {
            AbstractC52360yi2 m21569E = this.f68197a.m21569E(zigZagVehiclesResponse, ZigZagVehiclesResponse.class);
            Intrinsics.checkNotNullExpressionValue(m21569E, "{\n      gson.toJsonTree(…sponse::class.java)\n    }");
            return m21569E;
        }
        C35431Qi2 c35431Qi2 = C35431Qi2.f30779b;
        Intrinsics.checkNotNullExpressionValue(c35431Qi2, "{\n      JsonNull.INSTANCE\n    }");
        return c35431Qi2;
    }
}
