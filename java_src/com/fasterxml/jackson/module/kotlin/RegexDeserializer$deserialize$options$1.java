package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.RegexOption;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, m28432d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "kotlin.jvm.PlatformType", "it", "Lkotlin/text/RegexOption;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class RegexDeserializer$deserialize$options$1 extends Lambda implements Function1<JsonNode, RegexOption> {
    public static final RegexDeserializer$deserialize$options$1 INSTANCE = new RegexDeserializer$deserialize$options$1();

    public RegexDeserializer$deserialize$options$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RegexOption invoke(JsonNode jsonNode) {
        String asText = jsonNode.asText();
        Intrinsics.checkNotNullExpressionValue(asText, "it.asText()");
        return RegexOption.valueOf(asText);
    }
}
