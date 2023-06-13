package com.fasterxml.jackson.module.kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.KCallables;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, m28432d2 = {"T", "", "Lkotlin/reflect/KParameter;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ValueCreator$valueParameters$2 extends Lambda implements Function0<List<? extends KParameter>> {
    final /* synthetic */ ValueCreator<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueCreator$valueParameters$2(ValueCreator<T> valueCreator) {
        super(0);
        this.this$0 = valueCreator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends KParameter> invoke() {
        return KCallables.getValueParameters(this.this$0.getCallable());
    }
}
