package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/SequenceDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lkotlin/sequences/Sequence;", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class SequenceDeserializer extends StdDeserializer<Sequence<?>> {
    public static final SequenceDeserializer INSTANCE = new SequenceDeserializer();

    private SequenceDeserializer() {
        super(Sequence.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Sequence<?> deserialize(JsonParser p, DeserializationContext ctxt) {
        Sequence<?> asSequence;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        Object readValue = ctxt.readValue(p, List.class);
        Intrinsics.checkNotNullExpressionValue(readValue, "ctxt.readValue(p, List::class.java)");
        asSequence = CollectionsKt___CollectionsKt.asSequence((Iterable) readValue);
        return asSequence;
    }
}
