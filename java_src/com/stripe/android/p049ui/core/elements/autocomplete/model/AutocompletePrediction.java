package com.stripe.android.p049ui.core.elements.autocomplete.model;

import android.text.SpannableString;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;", "", "primaryText", "Landroid/text/SpannableString;", "secondaryText", "placeId", "", "(Landroid/text/SpannableString;Landroid/text/SpannableString;Ljava/lang/String;)V", "getPlaceId", "()Ljava/lang/String;", "getPrimaryText", "()Landroid/text/SpannableString;", "getSecondaryText", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.autocomplete.model.AutocompletePrediction */
/* loaded from: classes7.dex */
public final class AutocompletePrediction {
    public static final int $stable = 8;
    private final String placeId;
    private final SpannableString primaryText;
    private final SpannableString secondaryText;

    public AutocompletePrediction(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.placeId = placeId;
    }

    public static /* synthetic */ AutocompletePrediction copy$default(AutocompletePrediction autocompletePrediction, SpannableString spannableString, SpannableString spannableString2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            spannableString = autocompletePrediction.primaryText;
        }
        if ((i & 2) != 0) {
            spannableString2 = autocompletePrediction.secondaryText;
        }
        if ((i & 4) != 0) {
            str = autocompletePrediction.placeId;
        }
        return autocompletePrediction.copy(spannableString, spannableString2, str);
    }

    public final SpannableString component1() {
        return this.primaryText;
    }

    public final SpannableString component2() {
        return this.secondaryText;
    }

    public final String component3() {
        return this.placeId;
    }

    public final AutocompletePrediction copy(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        return new AutocompletePrediction(primaryText, secondaryText, placeId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutocompletePrediction) {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
            return Intrinsics.areEqual(this.primaryText, autocompletePrediction.primaryText) && Intrinsics.areEqual(this.secondaryText, autocompletePrediction.secondaryText) && Intrinsics.areEqual(this.placeId, autocompletePrediction.placeId);
        }
        return false;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final SpannableString getPrimaryText() {
        return this.primaryText;
    }

    public final SpannableString getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        return (((this.primaryText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + this.placeId.hashCode();
    }

    public String toString() {
        SpannableString spannableString = this.primaryText;
        SpannableString spannableString2 = this.secondaryText;
        String str = this.placeId;
        return "AutocompletePrediction(primaryText=" + ((Object) spannableString) + ", secondaryText=" + ((Object) spannableString2) + ", placeId=" + str + ")";
    }
}
