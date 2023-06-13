package p000;

import co.bird.android.model.LinearRing;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, m28432d2 = {"LGX3;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lco/bird/android/model/Polygon;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPolygonMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolygonMapper.kt\nco/bird/android/lib/jackson/PolygonDeserializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,65:1\n37#2,2:66\n*S KotlinDebug\n*F\n+ 1 PolygonMapper.kt\nco/bird/android/lib/jackson/PolygonDeserializer\n*L\n62#1:66,2\n*E\n"})
/* renamed from: GX3 */
/* loaded from: classes3.dex */
public final class GX3 extends StdDeserializer<Polygon> {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "kotlin.jvm.PlatformType", "ringNode", "Lco/bird/android/model/LinearRing;", C17296a.f69688o, "(Lcom/fasterxml/jackson/databind/JsonNode;)Lco/bird/android/model/LinearRing;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GX3$a */
    /* loaded from: classes3.dex */
    public static final class C2882a extends Lambda implements Function1<JsonNode, LinearRing> {

        /* renamed from: g */
        public final /* synthetic */ JsonParser f12035g;

        /* renamed from: h */
        public final /* synthetic */ DeserializationContext f12036h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2882a(JsonParser jsonParser, DeserializationContext deserializationContext) {
            super(1);
            this.f12035g = jsonParser;
            this.f12036h = deserializationContext;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LinearRing invoke(JsonNode jsonNode) {
            JsonParser traverse = jsonNode.traverse(this.f12035g.getCodec());
            traverse.nextToken();
            return new LinearRing((Point[]) this.f12036h.readValue(traverse, Point[].class));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "kotlin.jvm.PlatformType", "ringNode", "Lco/bird/android/model/LinearRing;", C17296a.f69688o, "(Lcom/fasterxml/jackson/databind/JsonNode;)Lco/bird/android/model/LinearRing;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GX3$b */
    /* loaded from: classes3.dex */
    public static final class C2883b extends Lambda implements Function1<JsonNode, LinearRing> {

        /* renamed from: g */
        public final /* synthetic */ JsonParser f12037g;

        /* renamed from: h */
        public final /* synthetic */ DeserializationContext f12038h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2883b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            super(1);
            this.f12037g = jsonParser;
            this.f12038h = deserializationContext;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LinearRing invoke(JsonNode jsonNode) {
            JsonParser traverse = jsonNode.get("points").traverse(this.f12037g.getCodec());
            traverse.nextToken();
            return new LinearRing((Point[]) this.f12038h.readValue(traverse, Point[].class));
        }
    }

    public GX3() {
        super(Polygon.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public Polygon deserialize(JsonParser p, DeserializationContext ctxt) {
        Sequence asSequence;
        Sequence map;
        List list;
        Sequence asSequence2;
        Sequence map2;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode jsonNode = (JsonNode) p.getCodec().readTree(p);
        if (jsonNode.isArray()) {
            Iterator<JsonNode> elements = jsonNode.elements();
            Intrinsics.checkNotNullExpressionValue(elements, "node.elements()");
            asSequence2 = SequencesKt__SequencesKt.asSequence(elements);
            map2 = SequencesKt___SequencesKt.map(asSequence2, new C2882a(p, ctxt));
            list = SequencesKt___SequencesKt.toList(map2);
        } else {
            Iterator<JsonNode> elements2 = jsonNode.get("rings").elements();
            Intrinsics.checkNotNullExpressionValue(elements2, "node.get(RINGS).elements()");
            asSequence = SequencesKt__SequencesKt.asSequence(elements2);
            map = SequencesKt___SequencesKt.map(asSequence, new C2883b(p, ctxt));
            list = SequencesKt___SequencesKt.toList(map);
        }
        return new Polygon((LinearRing[]) list.toArray(new LinearRing[0]));
    }
}
