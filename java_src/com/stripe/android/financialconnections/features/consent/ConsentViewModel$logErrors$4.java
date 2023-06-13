package com.stripe.android.financialconnections.features.consent;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ConsentViewModel$logErrors$4 extends PropertyReference1Impl {
    public static final ConsentViewModel$logErrors$4 INSTANCE = new ConsentViewModel$logErrors$4();

    public ConsentViewModel$logErrors$4() {
        super(ConsentState.class, "acceptConsent", "getAcceptConsent()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ConsentState) obj).getAcceptConsent();
    }
}
