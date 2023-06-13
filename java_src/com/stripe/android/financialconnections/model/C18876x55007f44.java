package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.BalanceRefresh;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.model.BalanceRefresh$BalanceRefreshStatus$Companion$$cachedSerializer$delegate$1 */
/* loaded from: classes7.dex */
public final class C18876x55007f44 extends Lambda implements Function0<InterfaceC34036Kj2<Object>> {
    public static final C18876x55007f44 INSTANCE = new C18876x55007f44();

    public C18876x55007f44() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC34036Kj2<Object> invoke() {
        return C48180rf1.m15590a("com.stripe.android.financialconnections.model.BalanceRefresh.BalanceRefreshStatus", BalanceRefresh.BalanceRefreshStatus.values(), new String[]{"failed", "pending", "succeeded", null}, new Annotation[][]{null, null, null, null});
    }
}
