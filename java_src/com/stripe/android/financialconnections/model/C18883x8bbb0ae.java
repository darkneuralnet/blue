package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSession$Status$Companion$$cachedSerializer$delegate$1 */
/* loaded from: classes7.dex */
public final class C18883x8bbb0ae extends Lambda implements Function0<InterfaceC34036Kj2<Object>> {
    public static final C18883x8bbb0ae INSTANCE = new C18883x8bbb0ae();

    public C18883x8bbb0ae() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC34036Kj2<Object> invoke() {
        return FinancialConnectionsSession.Status.Serializer.INSTANCE;
    }
}
