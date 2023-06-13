package com.stripe.android.paymentsheet;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "", "items", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "selectedIndex", "", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getSelectedIndex", "()I", "selectedItem", "getSelectedItem", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentOptionsState {
    private final List<PaymentOptionsItem> items;
    private final int selectedIndex;

    public PaymentOptionsState() {
        this(null, 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentOptionsState copy$default(PaymentOptionsState paymentOptionsState, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = paymentOptionsState.items;
        }
        if ((i2 & 2) != 0) {
            i = paymentOptionsState.selectedIndex;
        }
        return paymentOptionsState.copy(list, i);
    }

    public final List<PaymentOptionsItem> component1() {
        return this.items;
    }

    public final int component2() {
        return this.selectedIndex;
    }

    public final PaymentOptionsState copy(List<? extends PaymentOptionsItem> items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PaymentOptionsState(items, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentOptionsState) {
            PaymentOptionsState paymentOptionsState = (PaymentOptionsState) obj;
            return Intrinsics.areEqual(this.items, paymentOptionsState.items) && this.selectedIndex == paymentOptionsState.selectedIndex;
        }
        return false;
    }

    public final List<PaymentOptionsItem> getItems() {
        return this.items;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final PaymentOptionsItem getSelectedItem() {
        Object orNull;
        orNull = CollectionsKt___CollectionsKt.getOrNull(this.items, this.selectedIndex);
        return (PaymentOptionsItem) orNull;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Integer.hashCode(this.selectedIndex);
    }

    public String toString() {
        List<PaymentOptionsItem> list = this.items;
        int i = this.selectedIndex;
        return "PaymentOptionsState(items=" + list + ", selectedIndex=" + i + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsState(List<? extends PaymentOptionsItem> items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.selectedIndex = i;
    }

    public /* synthetic */ PaymentOptionsState(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? -1 : i);
    }
}
