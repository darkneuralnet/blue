package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, m28432d2 = {"LHG;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Ljava/math/BigDecimal;", "value", "Lcom/fasterxml/jackson/core/JsonGenerator;", "gen", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "provider", "", C17296a.f69688o, "<init>", "()V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HG */
/* loaded from: classes3.dex */
public final class C3113HG extends StdSerializer<BigDecimal> {
    public C3113HG() {
        super(BigDecimal.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* renamed from: a */
    public void serialize(BigDecimal bigDecimal, JsonGenerator jsonGenerator, SerializerProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (bigDecimal != null && jsonGenerator != null) {
            jsonGenerator.writeString(bigDecimal.stripTrailingZeros().toPlainString());
        }
    }
}
