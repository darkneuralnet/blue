package com.stripe.android.p049ui.core.elements;

import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.PaymentMethod;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.KeyboardType$Companion$$cachedSerializer$delegate$1 */
/* loaded from: classes7.dex */
public final class KeyboardType$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<InterfaceC34036Kj2<Object>> {
    public static final KeyboardType$Companion$$cachedSerializer$delegate$1 INSTANCE = new KeyboardType$Companion$$cachedSerializer$delegate$1();

    public KeyboardType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC34036Kj2<Object> invoke() {
        return C48180rf1.m15590a("com.stripe.android.ui.core.elements.KeyboardType", KeyboardType.values(), new String[]{Entry.TYPE_TEXT, "ascii", "number", PaymentMethod.BillingDetails.PARAM_PHONE, "uri", "email", "password", "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }
}
