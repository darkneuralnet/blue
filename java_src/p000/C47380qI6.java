package p000;

import co.bird.android.model.ZigZagVehicle;
import co.bird.android.model.ZigZagVehiclesResponse;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, m28432d2 = {"LqI6;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lco/bird/android/model/ZigZagVehiclesResponse;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZigZagVehiclesResponseMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZigZagVehiclesResponseMapper.kt\nco/bird/android/lib/jackson/ZigZagVehiclesDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1360#2:55\n1446#2,5:56\n*S KotlinDebug\n*F\n+ 1 ZigZagVehiclesResponseMapper.kt\nco/bird/android/lib/jackson/ZigZagVehiclesDeserializer\n*L\n42#1:55\n42#1:56,5\n*E\n"})
/* renamed from: qI6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47380qI6 extends StdDeserializer<ZigZagVehiclesResponse> {

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u00070\u00062F\u0010\u0005\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "Lcom/fasterxml/jackson/databind/JsonNode;", "", "<name for destructuring parameter 0>", "", "Lco/bird/android/model/ZigZagVehicle;", C17296a.f69688o, "(Ljava/util/Map$Entry;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qI6$a */
    /* loaded from: classes3.dex */
    public static final class C27575a extends Lambda implements Function1<Map.Entry<String, JsonNode>, List<? extends ZigZagVehicle>> {

        /* renamed from: g */
        public final /* synthetic */ JsonParser f105094g;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062F\u0010\u0005\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "Lcom/fasterxml/jackson/databind/JsonNode;", "", "<name for destructuring parameter 0>", "Lco/bird/android/model/ZigZagVehicle;", C17296a.f69688o, "(Ljava/util/Map$Entry;)Lco/bird/android/model/ZigZagVehicle;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: qI6$a$a */
        /* loaded from: classes3.dex */
        public static final class C27576a extends Lambda implements Function1<Map.Entry<String, JsonNode>, ZigZagVehicle> {

            /* renamed from: g */
            public final /* synthetic */ JsonParser f105095g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27576a(JsonParser jsonParser) {
                super(1);
                this.f105095g = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final ZigZagVehicle invoke(Map.Entry<String, JsonNode> entry) {
                Intrinsics.checkNotNullExpressionValue(entry, "(_, vehicleNode)");
                return (ZigZagVehicle) entry.getValue().traverse(this.f105095g.getCodec()).readValueAs(ZigZagVehicle.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27575a(JsonParser jsonParser) {
            super(1);
            this.f105094g = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<ZigZagVehicle> invoke(Map.Entry<String, JsonNode> entry) {
            Sequence asSequence;
            Sequence map;
            List<ZigZagVehicle> list;
            Intrinsics.checkNotNullExpressionValue(entry, "(_, plateDictionary)");
            Iterator<Map.Entry<String, JsonNode>> fields = entry.getValue().fields();
            Intrinsics.checkNotNullExpressionValue(fields, "plateDictionary.fields()");
            asSequence = SequencesKt__SequencesKt.asSequence(fields);
            map = SequencesKt___SequencesKt.map(asSequence, new C27576a(this.f105094g));
            list = SequencesKt___SequencesKt.toList(map);
            return list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062F\u0010\u0005\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "Lcom/fasterxml/jackson/databind/JsonNode;", "", "<name for destructuring parameter 0>", "Lco/bird/android/model/ZigZagVehicle;", C17296a.f69688o, "(Ljava/util/Map$Entry;)Lco/bird/android/model/ZigZagVehicle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qI6$b */
    /* loaded from: classes3.dex */
    public static final class C27577b extends Lambda implements Function1<Map.Entry<String, JsonNode>, ZigZagVehicle> {

        /* renamed from: g */
        public final /* synthetic */ JsonParser f105096g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27577b(JsonParser jsonParser) {
            super(1);
            this.f105096g = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ZigZagVehicle invoke(Map.Entry<String, JsonNode> entry) {
            Intrinsics.checkNotNullExpressionValue(entry, "(_, vehicleNode)");
            return (ZigZagVehicle) entry.getValue().traverse(this.f105096g.getCodec()).readValueAs(ZigZagVehicle.class);
        }
    }

    public C47380qI6() {
        super(ZigZagVehiclesResponse.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public ZigZagVehiclesResponse deserialize(JsonParser p, DeserializationContext ctxt) {
        List emptyList;
        Sequence asSequence;
        Sequence map;
        List list;
        Sequence asSequence2;
        Sequence flatMapIterable;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode<JsonNode> node = (JsonNode) p.getCodec().readTree(p);
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            Intrinsics.checkNotNullExpressionValue(fields, "node.fields()");
            asSequence2 = SequencesKt__SequencesKt.asSequence(fields);
            flatMapIterable = SequencesKt___SequencesKt.flatMapIterable(asSequence2, new C27575a(p));
            emptyList = SequencesKt___SequencesKt.toList(flatMapIterable);
        } else if (node.isArray()) {
            Intrinsics.checkNotNullExpressionValue(node, "node");
            ArrayList arrayList = new ArrayList();
            for (JsonNode jsonNode : node) {
                Iterator<Map.Entry<String, JsonNode>> fields2 = jsonNode.fields();
                Intrinsics.checkNotNullExpressionValue(fields2, "plateDictionary.fields()");
                asSequence = SequencesKt__SequencesKt.asSequence(fields2);
                map = SequencesKt___SequencesKt.map(asSequence, new C27577b(p));
                list = SequencesKt___SequencesKt.toList(map);
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, list);
            }
            emptyList = arrayList;
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new ZigZagVehiclesResponse(emptyList);
    }
}
