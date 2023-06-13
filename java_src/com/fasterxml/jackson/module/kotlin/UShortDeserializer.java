package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/UShortDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lkotlin/UShort;", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "deserialize-ErzVvmY", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)S", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class UShortDeserializer extends StdDeserializer<UShort> {
    public static final UShortDeserializer INSTANCE = new UShortDeserializer();

    private UShortDeserializer() {
        super(UShort.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return UShort.m117058boximpl(m116314deserializeErzVvmY(jsonParser, deserializationContext));
    }

    /* renamed from: deserialize-ErzVvmY  reason: not valid java name */
    public short m116314deserializeErzVvmY(JsonParser p, DeserializationContext ctxt) {
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        UShort asUShort = UnsignedNumbersKt.asUShort(p.getIntValue());
        if (asUShort != null) {
            return asUShort.m117114unboximpl();
        }
        throw new InputCoercionException(p, "Numeric value (" + ((Object) p.getText()) + ") out of range of UShort (0 - 65535).", JsonToken.VALUE_NUMBER_INT, UShort.class);
    }
}
