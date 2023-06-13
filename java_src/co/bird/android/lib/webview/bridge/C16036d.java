package co.bird.android.lib.webview.bridge;

import co.bird.android.lib.webview.bridge.AbstractC16030b;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/lib/webview/bridge/d;", "LBb6;", "Lco/bird/android/lib/webview/bridge/b;", "", "Lcom/google/gson/stream/JsonReader;", "reader", "e", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "", "f", "<init>", "()V", "bridge_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebPayloadTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebPayloadTypeAdapter.kt\nco/bird/android/lib/webview/bridge/WebPayloadTypeAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
/* renamed from: co.bird.android.lib.webview.bridge.d */
/* loaded from: classes3.dex */
public final class C16036d extends AbstractC31862Bb6<AbstractC16030b<String>> {
    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    public AbstractC16030b<String> read(JsonReader reader) {
        Map map;
        Map map2;
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        reader.beginObject();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName != null) {
                switch (nextName.hashCode()) {
                    case -995427962:
                        if (!nextName.equals("params")) {
                            continue;
                        } else if (reader.peek() != JsonToken.BEGIN_OBJECT) {
                            break;
                        } else {
                            reader.beginObject();
                            while (reader.hasNext()) {
                                String nextName2 = reader.nextName();
                                Intrinsics.checkNotNullExpressionValue(nextName2, "reader.nextName()");
                                if (reader.peek() == JsonToken.STRING) {
                                    str = reader.nextString();
                                } else {
                                    reader.nextNull();
                                    Unit unit = Unit.INSTANCE;
                                    str = null;
                                }
                                linkedHashMap.put(nextName2, str);
                            }
                            reader.endObject();
                            break;
                        }
                    case 96784904:
                        if (!nextName.equals("error")) {
                            continue;
                        } else if (reader.peek() == JsonToken.STRING) {
                            str4 = reader.nextString();
                            break;
                        } else {
                            reader.nextNull();
                            Unit unit2 = Unit.INSTANCE;
                            str4 = null;
                            break;
                        }
                    case 1869655893:
                        if (!nextName.equals("callback_id")) {
                            continue;
                        } else if (reader.peek() == JsonToken.STRING) {
                            str3 = reader.nextString();
                            break;
                        } else {
                            reader.nextNull();
                            Unit unit3 = Unit.INSTANCE;
                            str3 = null;
                            break;
                        }
                    case 1956063999:
                        if (!nextName.equals("command_name")) {
                            continue;
                        } else if (reader.peek() == JsonToken.STRING) {
                            str2 = reader.nextString();
                            break;
                        } else {
                            reader.nextNull();
                            Unit unit4 = Unit.INSTANCE;
                            str2 = null;
                            break;
                        }
                }
            }
        }
        reader.endObject();
        if (str2 != null && str3 != null) {
            map2 = MapsKt__MapsKt.toMap(linkedHashMap);
            return new AbstractC16030b.C16032b(str2, map2, str3);
        } else if (str4 == null) {
            map = MapsKt__MapsKt.toMap(linkedHashMap);
            return new AbstractC16030b.C16033c(str3, map);
        } else {
            return new AbstractC16030b.C16031a(str3, str4);
        }
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public void write(JsonWriter out, AbstractC16030b<String> abstractC16030b) {
        String str;
        Map<String, String> map;
        String str2;
        Intrinsics.checkNotNullParameter(out, "out");
        out.beginObject();
        JsonWriter name = out.name("command_name");
        String str3 = null;
        if (abstractC16030b != null) {
            str = abstractC16030b.mo56056b();
        } else {
            str = null;
        }
        name.value(str);
        if (abstractC16030b != null) {
            map = abstractC16030b.mo56054d();
        } else {
            map = null;
        }
        boolean z = false;
        if (map != null && (!map.isEmpty())) {
            z = true;
        }
        if (z) {
            out.name("params").beginObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.name(entry.getKey()).value(String.valueOf(entry.getValue()));
            }
            out.endObject();
        }
        JsonWriter name2 = out.name("callback_id");
        if (abstractC16030b != null) {
            str2 = abstractC16030b.mo56057a();
        } else {
            str2 = null;
        }
        name2.value(str2);
        JsonWriter name3 = out.name("error");
        if (abstractC16030b != null) {
            str3 = abstractC16030b.mo56055c();
        }
        name3.value(str3);
        out.endObject();
    }
}
