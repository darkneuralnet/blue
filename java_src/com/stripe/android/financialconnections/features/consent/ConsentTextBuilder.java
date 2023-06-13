package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentTextBuilder;", "", "()V", "getBusinessName", "", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsentTextBuilder {
    public static final ConsentTextBuilder INSTANCE = new ConsentTextBuilder();

    private ConsentTextBuilder() {
    }

    public final String getBusinessName(FinancialConnectionsSessionManifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        String businessName = manifest.getBusinessName();
        if (businessName == null) {
            return manifest.getConnectPlatformName();
        }
        return businessName;
    }
}
