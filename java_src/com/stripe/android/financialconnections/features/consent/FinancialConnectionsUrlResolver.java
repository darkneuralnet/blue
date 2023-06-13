package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsUrls;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/FinancialConnectionsUrlResolver;", "", "()V", "supportUrl", "", "getDataPolicyUrl", "manifest", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "getDisconnectUrl", "getFAQUrl", "getPartnerNotice", "isStripeDirect", "", "getPrivacyCenterUrl", "getStripeTOSUrl", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FinancialConnectionsUrlResolver {
    public static final FinancialConnectionsUrlResolver INSTANCE = new FinancialConnectionsUrlResolver();
    public static final String supportUrl = "https://support.stripe.com/contact";

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.AccountDisconnectionMethod.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.AccountDisconnectionMethod.SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.AccountDisconnectionMethod.DASHBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.AccountDisconnectionMethod.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.AccountDisconnectionMethod.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.AccountDisconnectionMethod.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FinancialConnectionsUrlResolver() {
    }

    public final String getDataPolicyUrl(FinancialConnectionsSessionManifest manifest) {
        boolean z;
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Boolean isStripeDirect = manifest.isStripeDirect();
        if (isStripeDirect != null) {
            z = isStripeDirect.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            return "https://stripe.com/docs/linked-accounts/faqs";
        }
        if (!z) {
            return FinancialConnectionsUrls.DataPolicy.merchant;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getDisconnectUrl(FinancialConnectionsSessionManifest manifest) {
        boolean z;
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        FinancialConnectionsSessionManifest.AccountDisconnectionMethod accountDisconnectionMethod = manifest.getAccountDisconnectionMethod();
        if (accountDisconnectionMethod == null) {
            accountDisconnectionMethod = FinancialConnectionsSessionManifest.AccountDisconnectionMethod.UNKNOWN;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[accountDisconnectionMethod.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return FinancialConnectionsUrls.Disconnect.email;
                }
                return FinancialConnectionsUrls.Disconnect.link;
            }
            return FinancialConnectionsUrls.Disconnect.dashboard;
        }
        Boolean isEndUserFacing = manifest.isEndUserFacing();
        if (isEndUserFacing != null) {
            z = isEndUserFacing.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            return FinancialConnectionsUrls.Disconnect.supportEndUser;
        }
        if (!z) {
            return FinancialConnectionsUrls.Disconnect.supportMerchantUser;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getFAQUrl(FinancialConnectionsSessionManifest manifest) {
        boolean z;
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Boolean isStripeDirect = manifest.isStripeDirect();
        if (isStripeDirect != null) {
            z = isStripeDirect.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            return "https://stripe.com/docs/linked-accounts/faqs";
        }
        if (!z) {
            return FinancialConnectionsUrls.FAQ.merchant;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getPartnerNotice(boolean z) {
        if (z) {
            return "https://stripe.com/docs/linked-accounts/faqs";
        }
        if (!z) {
            return FinancialConnectionsUrls.PartnerNotice.merchant;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getPrivacyCenterUrl(FinancialConnectionsSessionManifest manifest) {
        boolean z;
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Boolean isStripeDirect = manifest.isStripeDirect();
        if (isStripeDirect != null) {
            z = isStripeDirect.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            return "https://stripe.com/docs/linked-accounts/faqs";
        }
        if (!z) {
            return FinancialConnectionsUrls.PrivacyCenter.merchant;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getStripeTOSUrl(FinancialConnectionsSessionManifest manifest) {
        boolean z;
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Boolean isEndUserFacing = manifest.isEndUserFacing();
        if (isEndUserFacing != null) {
            z = isEndUserFacing.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            return FinancialConnectionsUrls.StripeToS.endUser;
        }
        if (!z) {
            return FinancialConnectionsUrls.StripeToS.merchantUser;
        }
        throw new NoWhenBranchMatchedException();
    }
}
