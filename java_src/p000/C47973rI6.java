package p000;

import co.bird.android.model.ZigZagVehiclesResponse;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, m28432d2 = {"LrI6;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Lco/bird/android/model/ZigZagVehiclesResponse;", "value", "Lcom/fasterxml/jackson/core/JsonGenerator;", "gen", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "provider", "", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZigZagVehiclesResponseMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZigZagVehiclesResponseMapper.kt\nco/bird/android/lib/jackson/ZigZagVehiclesSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1855#2,2:55\n*S KotlinDebug\n*F\n+ 1 ZigZagVehiclesResponseMapper.kt\nco/bird/android/lib/jackson/ZigZagVehiclesSerializer\n*L\n21#1:55,2\n*E\n"})
/* renamed from: rI6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47973rI6 extends StdSerializer<ZigZagVehiclesResponse> {
    public C47973rI6() {
        super(ZigZagVehiclesResponse.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* renamed from: a */
    public void serialize(ZigZagVehiclesResponse value, JsonGenerator gen, SerializerProvider provider) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(gen, "gen");
        Intrinsics.checkNotNullParameter(provider, "provider");
        gen.writeStartObject();
        gen.writeFieldName("vehicles");
        gen.writeStartArray();
        for (Object obj : value.getVehicles()) {
            gen.writeObject(obj);
        }
        gen.writeEndArray();
        gen.writeEndObject();
    }
}
