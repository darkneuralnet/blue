package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.NavigationCommand;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0000¨\u0006\t"}, m28432d2 = {"toNavigationCommand", "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "logger", "Lcom/stripe/android/core/Logger;", "args", "", "", "", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class GoNextKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Pane.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.RESET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.AUTH_OPTIONS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.LINK_CONSENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.LINK_LOGIN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final NavigationCommand toNavigationCommand(FinancialConnectionsSessionManifest.Pane pane, Logger logger, Map<String, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(pane, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(args, "args");
        switch (WhenMappings.$EnumSwitchMapping$0[pane.ordinal()]) {
            case 1:
                return NavigationDirections.INSTANCE.getInstitutionPicker();
            case 2:
                return NavigationDirections.INSTANCE.getPartnerAuth();
            case 3:
                return NavigationDirections.INSTANCE.getConsent();
            case 4:
                return NavigationDirections.INSTANCE.getAccountPicker();
            case 5:
                return NavigationDirections.INSTANCE.getSuccess();
            case 6:
                return NavigationDirections.INSTANCE.getManualEntry();
            case 7:
                return NavigationDirections.ManualEntrySuccess.INSTANCE.invoke(args);
            case 8:
                return NavigationDirections.INSTANCE.getAttachLinkedPaymentAccount();
            case 9:
                return NavigationDirections.INSTANCE.getReset();
            case 10:
                Logger.DefaultImpls.error$default(logger, "Link not supported on native flows yet. Navigating to Success.", null, 2, null);
                return NavigationDirections.INSTANCE.getSuccess();
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                throw new NotImplementedError("An operation is not implemented: " + ("Unimplemented navigation command: " + pane.getValue()));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
