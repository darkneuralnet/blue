package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.AccountHolder;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountHolder$Type$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<InterfaceC34036Kj2<Object>> {
    public static final AccountHolder$Type$Companion$$cachedSerializer$delegate$1 INSTANCE = new AccountHolder$Type$Companion$$cachedSerializer$delegate$1();

    public AccountHolder$Type$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC34036Kj2<Object> invoke() {
        return C48180rf1.m15590a("com.stripe.android.financialconnections.model.AccountHolder.Type", AccountHolder.Type.values(), new String[]{"account", PaymentSheetEvent.FIELD_CUSTOMER, null}, new Annotation[][]{null, null, null});
    }
}
