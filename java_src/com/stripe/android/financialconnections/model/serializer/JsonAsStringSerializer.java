package com.stripe.android.financialconnections.model.serializer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;", "Loj2;", "", "Lxi2;", "element", "transformDeserialize", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class JsonAsStringSerializer extends AbstractC46442oj2<String> {
    public static final JsonAsStringSerializer INSTANCE = new JsonAsStringSerializer();

    private JsonAsStringSerializer() {
        super(C38330b40.m65038D(StringCompanionObject.INSTANCE));
    }

    @Override // p000.AbstractC46442oj2
    public AbstractC51767xi2 transformDeserialize(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return C52953zi2.m530c(element.toString());
    }
}
