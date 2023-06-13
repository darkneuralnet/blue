package com.stripe.android.financialconnections.features.attachpayment;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class AttachPaymentViewModel$logErrors$1 extends PropertyReference1Impl {
    public static final AttachPaymentViewModel$logErrors$1 INSTANCE = new AttachPaymentViewModel$logErrors$1();

    public AttachPaymentViewModel$logErrors$1() {
        super(AttachPaymentState.class, "payload", "getPayload()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((AttachPaymentState) obj).getPayload();
    }
}
