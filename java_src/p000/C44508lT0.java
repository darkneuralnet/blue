package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, m28432d2 = {"LlT0;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateTimeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeMapper.kt\nco/bird/android/lib/jackson/DateTimeDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* renamed from: lT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44508lT0 extends StdDeserializer<DateTime> {
    public C44508lT0() {
        super(DateTime.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public DateTime deserialize(JsonParser p, DeserializationContext ctxt) {
        DateTime parse;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        String valueAsString = p.getValueAsString();
        if (valueAsString != null && (parse = DateTime.parse(valueAsString, C50649vp0.m7974b())) != null) {
            return parse.withZone(DateTimeZone.getDefault());
        }
        return null;
    }
}
