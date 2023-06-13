package p000;

import co.bird.android.lib.webview.bridge.AbstractC16030b;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, m28432d2 = {"LZz6;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Lco/bird/android/lib/webview/bridge/b;", "value", "Lcom/fasterxml/jackson/core/JsonGenerator;", "gen", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "provider", "", C17296a.f69688o, "<init>", "()V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebPayloadMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebPayloadMapper.kt\nco/bird/android/lib/webview/bridge/WebPayloadSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1855#2,2:82\n*S KotlinDebug\n*F\n+ 1 WebPayloadMapper.kt\nco/bird/android/lib/webview/bridge/WebPayloadSerializer\n*L\n27#1:82,2\n*E\n"})
/* renamed from: Zz6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37694Zz6 extends StdSerializer<AbstractC16030b<?>> {
    public C37694Zz6() {
        super(AbstractC16030b.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* renamed from: a */
    public void serialize(AbstractC16030b<?> value, JsonGenerator gen, SerializerProvider provider) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(gen, "gen");
        Intrinsics.checkNotNullParameter(provider, "provider");
        gen.writeStartObject();
        gen.writeStringField("command_name", value.mo56056b());
        Map<String, ?> mo56054d = value.mo56054d();
        boolean z = false;
        if (mo56054d != null && (!mo56054d.isEmpty())) {
            z = true;
        }
        if (z) {
            gen.writeFieldName("params");
            gen.writeStartObject();
            Iterator<T> it = mo56054d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                gen.writeStringField((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
            gen.writeEndObject();
        }
        gen.writeStringField("callback_id", value.mo56057a());
        gen.writeStringField("error", value.mo56055c());
    }
}
