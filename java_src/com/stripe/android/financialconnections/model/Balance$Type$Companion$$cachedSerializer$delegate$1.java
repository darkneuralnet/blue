package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.Balance;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Balance$Type$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<InterfaceC34036Kj2<Object>> {
    public static final Balance$Type$Companion$$cachedSerializer$delegate$1 INSTANCE = new Balance$Type$Companion$$cachedSerializer$delegate$1();

    public Balance$Type$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC34036Kj2<Object> invoke() {
        return C48180rf1.m15590a("com.stripe.android.financialconnections.model.Balance.Type", Balance.Type.values(), new String[]{"cash", "credit", null}, new Annotation[][]{null, null, null});
    }
}
