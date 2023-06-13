package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/PlanItemModel;", "", "planId", "", "currency", "refillAmount", "", "incentiveAmount", "planItemDescription", "Lco/bird/android/model/PlanItemDescription;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)V", "getCurrency", "()Ljava/lang/String;", "getIncentiveAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlanId", "getPlanItemDescription", "()Lco/bird/android/model/PlanItemDescription;", "getRefillAmount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lco/bird/android/model/PlanItemDescription;)Lco/bird/android/model/PlanItemModel;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PlanItemModel {
    private final String currency;
    private final Integer incentiveAmount;
    private final String planId;
    private final PlanItemDescription planItemDescription;
    private final int refillAmount;

    public PlanItemModel(String planId, String currency, int i, Integer num, PlanItemDescription planItemDescription) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.planId = planId;
        this.currency = currency;
        this.refillAmount = i;
        this.incentiveAmount = num;
        this.planItemDescription = planItemDescription;
    }

    public static /* synthetic */ PlanItemModel copy$default(PlanItemModel planItemModel, String str, String str2, int i, Integer num, PlanItemDescription planItemDescription, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = planItemModel.planId;
        }
        if ((i2 & 2) != 0) {
            str2 = planItemModel.currency;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = planItemModel.refillAmount;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            num = planItemModel.incentiveAmount;
        }
        Integer num2 = num;
        if ((i2 & 16) != 0) {
            planItemDescription = planItemModel.planItemDescription;
        }
        return planItemModel.copy(str, str3, i3, num2, planItemDescription);
    }

    public final String component1() {
        return this.planId;
    }

    public final String component2() {
        return this.currency;
    }

    public final int component3() {
        return this.refillAmount;
    }

    public final Integer component4() {
        return this.incentiveAmount;
    }

    public final PlanItemDescription component5() {
        return this.planItemDescription;
    }

    public final PlanItemModel copy(String planId, String currency, int i, Integer num, PlanItemDescription planItemDescription) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new PlanItemModel(planId, currency, i, num, planItemDescription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlanItemModel) {
            PlanItemModel planItemModel = (PlanItemModel) obj;
            return Intrinsics.areEqual(this.planId, planItemModel.planId) && Intrinsics.areEqual(this.currency, planItemModel.currency) && this.refillAmount == planItemModel.refillAmount && Intrinsics.areEqual(this.incentiveAmount, planItemModel.incentiveAmount) && this.planItemDescription == planItemModel.planItemDescription;
        }
        return false;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getIncentiveAmount() {
        return this.incentiveAmount;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final PlanItemDescription getPlanItemDescription() {
        return this.planItemDescription;
    }

    public final int getRefillAmount() {
        return this.refillAmount;
    }

    public int hashCode() {
        int hashCode = ((((this.planId.hashCode() * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.refillAmount)) * 31;
        Integer num = this.incentiveAmount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        PlanItemDescription planItemDescription = this.planItemDescription;
        return hashCode2 + (planItemDescription != null ? planItemDescription.hashCode() : 0);
    }

    public String toString() {
        String str = this.planId;
        String str2 = this.currency;
        int i = this.refillAmount;
        Integer num = this.incentiveAmount;
        PlanItemDescription planItemDescription = this.planItemDescription;
        return "PlanItemModel(planId=" + str + ", currency=" + str2 + ", refillAmount=" + i + ", incentiveAmount=" + num + ", planItemDescription=" + planItemDescription + ")";
    }
}
