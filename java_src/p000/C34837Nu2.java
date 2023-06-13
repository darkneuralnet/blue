package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.LocalDate;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, m28432d2 = {"LNu2;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lorg/joda/time/LocalDate;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalDateMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateMapper.kt\nco/bird/android/lib/jackson/LocalDateDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* renamed from: Nu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34837Nu2 extends StdDeserializer<LocalDate> {
    public C34837Nu2() {
        super(LocalDate.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) {
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        String valueAsString = p.getValueAsString();
        if (valueAsString != null) {
            return LocalDate.parse(valueAsString);
        }
        return null;
    }
}
