package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, m28432d2 = {"Lob6;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "value", "Lcom/fasterxml/jackson/core/JsonGenerator;", "gen", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "provider", "", C17296a.f69688o, "<init>", "()V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaksMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksMapper.kt\nco/bird/android/config/tweaks/TweaksSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n766#2:96\n857#2,2:97\n1855#2,2:99\n*S KotlinDebug\n*F\n+ 1 TweaksMapper.kt\nco/bird/android/config/tweaks/TweaksSerializer\n*L\n22#1:96\n22#1:97,2\n23#1:99,2\n*E\n"})
/* renamed from: ob6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46366ob6 extends StdSerializer<Tweaks> {
    public C46366ob6() {
        super(Tweaks.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* renamed from: a */
    public void serialize(Tweaks value, JsonGenerator gen, SerializerProvider provider) {
        boolean z;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(gen, "gen");
        Intrinsics.checkNotNullParameter(provider, "provider");
        gen.writeStartArray();
        ArrayList<C35597Ra6> arrayList = new ArrayList();
        for (Object obj : value.tweaks()) {
            if (((C35597Ra6) obj).m86599e() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        for (C35597Ra6 c35597Ra6 : arrayList) {
            gen.writeStartObject();
            gen.writeStringField("key", c35597Ra6.m86601c());
            gen.writeStringField("type", c35597Ra6.m86600d().toString());
            gen.writeFieldName("value");
            KType m86600d = c35597Ra6.m86600d();
            if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Integer.TYPE), null, false, null, 7, null))) {
                Object m86599e = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e, "null cannot be cast to non-null type kotlin.Int");
                gen.writeNumber(((Integer) m86599e).intValue());
            } else if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(String.class), null, false, null, 7, null))) {
                Object m86599e2 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e2, "null cannot be cast to non-null type kotlin.String");
                gen.writeString((String) m86599e2);
            } else if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Boolean.TYPE), null, false, null, 7, null))) {
                Object m86599e3 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e3, "null cannot be cast to non-null type kotlin.Boolean");
                gen.writeBoolean(((Boolean) m86599e3).booleanValue());
            } else if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Float.TYPE), null, false, null, 7, null))) {
                Object m86599e4 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e4, "null cannot be cast to non-null type kotlin.Float");
                gen.writeNumber(((Float) m86599e4).floatValue());
            } else if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Long.TYPE), null, false, null, 7, null))) {
                Object m86599e5 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e5, "null cannot be cast to non-null type kotlin.Long");
                gen.writeNumber(((Long) m86599e5).longValue());
            } else if (Intrinsics.areEqual(m86600d, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Double.TYPE), null, false, null, 7, null))) {
                Object m86599e6 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e6, "null cannot be cast to non-null type kotlin.Double");
                gen.writeNumber(((Double) m86599e6).doubleValue());
            } else if (Class.forName(c35597Ra6.m86600d().toString()).isEnum()) {
                Object m86599e7 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e7, "null cannot be cast to non-null type kotlin.Enum<*>");
                gen.writeString(((Enum) m86599e7).name());
            } else {
                gen.writeNull();
            }
            gen.writeEndObject();
        }
        gen.writeEndArray();
    }
}
