package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\b\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/UByteKeyDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializer;", "()V", "deserializeKey", "Lkotlin/UByte;", "key", "", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "deserializeKey-lj4SQcc", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class UByteKeyDeserializer extends StdKeyDeserializer {
    public static final UByteKeyDeserializer INSTANCE = new UByteKeyDeserializer();

    private UByteKeyDeserializer() {
        super(3, UByte.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
    /* renamed from: deserializeKey-lj4SQcc  reason: not valid java name */
    public UByte deserializeKey(String str, DeserializationContext ctxt) {
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        Object deserializeKey = super.deserializeKey(str, ctxt);
        if (deserializeKey == null) {
            return null;
        }
        UByte asUByte = UnsignedNumbersKt.asUByte(((Short) deserializeKey).shortValue());
        if (asUByte != null) {
            return UByte.m116795boximpl(asUByte.m116851unboximpl());
        }
        throw new InputCoercionException(null, "Numeric value (" + ((Object) str) + ") out of range of UByte (0 - 255).", JsonToken.VALUE_NUMBER_INT, UByte.class);
    }
}
