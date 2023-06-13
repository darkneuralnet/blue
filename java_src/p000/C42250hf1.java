package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\b\u0016\u0012\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lhf1;", "", "E", "Lcom/fasterxml/jackson/databind/deser/std/StdScalarDeserializer;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Enum;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "clazz", "Lef1;", "c", "Lef1;", "cache", "<init>", "(Ljava/lang/Class;Lef1;)V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnumMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumMapper.kt\nco/bird/android/lib/jackson/EnumDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
/* renamed from: hf1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42250hf1<E extends Enum<E>> extends StdScalarDeserializer<E> {

    /* renamed from: b */
    public final Class<E> f85635b;

    /* renamed from: c */
    public final C40471ef1 f85636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C42250hf1(Class<Enum<?>> clazz, C40471ef1 cache) {
        super(clazz);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f85635b = clazz;
        this.f85636c = cache;
        cache.m42655a(clazz);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public E deserialize(JsonParser p, DeserializationContext ctxt) {
        E e;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode jsonNode = (JsonNode) p.getCodec().readTree(p);
        if (jsonNode.isNull()) {
            return null;
        }
        String asText = jsonNode.asText();
        if (asText == null || (e = (E) this.f85636c.m42653c(this.f85635b, asText)) == null) {
            return (E) this.f85636c.m42654b(this.f85635b);
        }
        return e;
    }
}
