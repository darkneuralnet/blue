package com.stripe.android.financialconnections.features.attachpayment;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class AttachPaymentViewModel$logErrors$4 extends PropertyReference1Impl {
    public static final AttachPaymentViewModel$logErrors$4 INSTANCE = new AttachPaymentViewModel$logErrors$4();

    public AttachPaymentViewModel$logErrors$4() {
        super(AttachPaymentState.class, "linkPaymentAccount", "getLinkPaymentAccount()Lcom/airbnb/mvrx/Async;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((AttachPaymentState) obj).getLinkPaymentAccount();
    }
}
