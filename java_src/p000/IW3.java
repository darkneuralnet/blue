package p000;

import co.bird.android.model.Point;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, m28432d2 = {"LIW3;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lco/bird/android/model/Point;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IW3 */
/* loaded from: classes3.dex */
public final class IW3 extends StdDeserializer<Point> {
    public IW3() {
        super(Point.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public Point deserialize(JsonParser p, DeserializationContext ctxt) {
        double d;
        double d2;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode jsonNode = (JsonNode) p.getCodec().readTree(p);
        if (jsonNode.isObject()) {
            d2 = jsonNode.get("latitude").asDouble();
            d = jsonNode.get("longitude").asDouble();
        } else {
            double asDouble = jsonNode.get(0).asDouble();
            double asDouble2 = jsonNode.get(1).asDouble();
            d = asDouble;
            d2 = asDouble2;
        }
        return new Point(d, d2);
    }
}
