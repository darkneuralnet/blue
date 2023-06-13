package co.bird.android.lib.webview.bridge;

import co.bird.android.lib.webview.bridge.AbstractC16030b;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/c;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lco/bird/android/lib/webview/bridge/b;", "", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "Lcom/fasterxml/jackson/databind/JsonNode;", "fieldName", "b", "<init>", "()V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.lib.webview.bridge.c */
/* loaded from: classes3.dex */
public final class C16034c extends StdDeserializer<AbstractC16030b<String>> {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0018\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "key", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.lib.webview.bridge.c$a */
    /* loaded from: classes3.dex */
    public static final class C16035a extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {

        /* renamed from: g */
        public final /* synthetic */ JsonNode f66095g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16035a(JsonNode jsonNode) {
            super(1);
            this.f66095g = jsonNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<String, String> invoke(String str) {
            return TuplesKt.m28425to(str, this.f66095g.get(str).isNull() ? null : this.f66095g.get(str).asText());
        }
    }

    public C16034c() {
        super(AbstractC16030b.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        r2 = kotlin.sequences.SequencesKt__SequencesKt.asSequence(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        r1 = kotlin.sequences.SequencesKt___SequencesKt.map(r2, new co.bird.android.lib.webview.bridge.C16034c.C16035a(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        r1 = kotlin.collections.MapsKt__MapsKt.toMap(r1);
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC16030b<String> deserialize(JsonParser p, DeserializationContext ctxt) {
        String str;
        JsonNode jsonNode;
        Map emptyMap;
        String str2;
        Sequence asSequence;
        Sequence map;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode node = (JsonNode) p.getCodec().readTree(p);
        Intrinsics.checkNotNullExpressionValue(node, "node");
        JsonNode m56051b = m56051b(node, "command_name");
        String str3 = null;
        if (m56051b != null) {
            str = m56051b.asText();
        } else {
            str = null;
        }
        if (node.has("params")) {
            jsonNode = node.get("params");
        } else {
            jsonNode = null;
        }
        if (jsonNode == null || (r2 = jsonNode.fieldNames()) == null || asSequence == null || map == null || emptyMap == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        JsonNode m56051b2 = m56051b(node, "callback_id");
        if (m56051b2 != null) {
            str2 = m56051b2.asText();
        } else {
            str2 = null;
        }
        JsonNode m56051b3 = m56051b(node, "error");
        if (m56051b3 != null) {
            str3 = m56051b3.asText();
        }
        if (str != null && str2 != null) {
            return new AbstractC16030b.C16032b(str, emptyMap, str2);
        }
        if (str3 != null) {
            return new AbstractC16030b.C16031a(str2, str3);
        }
        return new AbstractC16030b.C16033c(str2, emptyMap);
    }

    /* renamed from: b */
    public final JsonNode m56051b(JsonNode jsonNode, String str) {
        if (!jsonNode.has(str) || jsonNode.get(str).isNull()) {
            return null;
        }
        return jsonNode.get(str);
    }
}
