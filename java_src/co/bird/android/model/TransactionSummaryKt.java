package co.bird.android.model;

import co.bird.android.model.constant.IncomingTransactionKind;
import co.bird.android.model.constant.IncomingTransactionSourceKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"auxiliaryDescriptionRes", "", "Lco/bird/android/model/TransactionSummary;", "(Lco/bird/android/model/TransactionSummary;)Ljava/lang/Integer;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransactionSummaryKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransactionSummaryChargeFeatureKind.values().length];
            try {
                iArr[TransactionSummaryChargeFeatureKind.BIRD_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionSummaryChargeFeatureKind.RIDE_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IncomingTransactionSourceKind.values().length];
            try {
                iArr2[IncomingTransactionSourceKind.SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.DIRECT_CHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.AUTO_PAY_INCENTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.AUTO_PAY_REFILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.RIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.DELIVERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.BALANCE_TRANSFER.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.MONTHLY_RENTAL_SUBSCRIPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.LEASE_DELINQUENT_FEE.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.LEASE_INITIAL_CHARGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.MERCHANT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[IncomingTransactionSourceKind.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Integer auxiliaryDescriptionRes(TransactionSummary transactionSummary) {
        IncomingTransactionKind incomingTransactionKind;
        IncomingTransactionSourceKind incomingTransactionSourceKind;
        TransactionSummaryChargeFeatureKind transactionSummaryChargeFeatureKind;
        Intrinsics.checkNotNullParameter(transactionSummary, "<this>");
        TransactionSummaryTransaction transaction = transactionSummary.getTransaction();
        if (transaction != null) {
            incomingTransactionKind = transaction.getTransactionKind();
        } else {
            incomingTransactionKind = null;
        }
        TransactionSummaryTransaction transaction2 = transactionSummary.getTransaction();
        if (transaction2 != null) {
            incomingTransactionSourceKind = transaction2.getSourceKind();
        } else {
            incomingTransactionSourceKind = null;
        }
        TransactionSummaryAdhocCharge charge = transactionSummary.getCharge();
        if (charge != null) {
            transactionSummaryChargeFeatureKind = charge.getFeatureKind();
        } else {
            transactionSummaryChargeFeatureKind = null;
        }
        if (transactionSummaryChargeFeatureKind != null && transactionSummaryChargeFeatureKind != TransactionSummaryChargeFeatureKind.UNKNOWN) {
            int i = WhenMappings.$EnumSwitchMapping$0[transactionSummaryChargeFeatureKind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Integer.valueOf(C45871nl4.bird_model_unknown);
                }
                return Integer.valueOf(C45871nl4.ride_pass_purchase);
            }
            return Integer.valueOf(C45871nl4.bird_plus_subscription);
        } else if (incomingTransactionKind == IncomingTransactionKind.CREDIT && incomingTransactionSourceKind != null) {
            switch (WhenMappings.$EnumSwitchMapping$1[incomingTransactionSourceKind.ordinal()]) {
                case 1:
                    return Integer.valueOf(C45871nl4.transaction_history_item_support);
                case 2:
                    return Integer.valueOf(C45871nl4.transaction_history_item_negative_balance_charge);
                case 3:
                    return Integer.valueOf(C45871nl4.transaction_history_item_balance_bonus);
                case 4:
                    return Integer.valueOf(C45871nl4.transaction_history_item_balance_reload);
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return Integer.valueOf(C45871nl4.transaction_history_item_credit);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (incomingTransactionSourceKind == null) {
            return null;
        } else {
            switch (WhenMappings.$EnumSwitchMapping$1[incomingTransactionSourceKind.ordinal()]) {
                case 1:
                    return Integer.valueOf(C45871nl4.transaction_history_item_support);
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 11:
                case 12:
                    return null;
                case 6:
                    return Integer.valueOf(C45871nl4.transaction_history_item_delivery);
                case 8:
                    return Integer.valueOf(C45871nl4.long_term_rental_transaction_history_description);
                case 9:
                    return Integer.valueOf(C45871nl4.transaction_history_item_lease_delinquent_fee);
                case 10:
                    return Integer.valueOf(C45871nl4.transaction_history_item_lease_initial_charge);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
