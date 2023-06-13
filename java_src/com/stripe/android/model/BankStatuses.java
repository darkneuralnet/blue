package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.view.Bank;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÂ\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0014J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/BankStatuses;", "Lcom/stripe/android/core/model/StripeModel;", "statuses", "", "", "", "(Ljava/util/Map;)V", "component1", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "isOnline", "bank", "Lcom/stripe/android/view/Bank;", "isOnline$payments_core_release", "size", "size$payments_core_release", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class BankStatuses implements StripeModel {
    public static final Parcelable.Creator<BankStatuses> CREATOR = new Creator();
    private final Map<String, Boolean> statuses;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<BankStatuses> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankStatuses createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new BankStatuses(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankStatuses[] newArray(int i) {
            return new BankStatuses[i];
        }
    }

    public BankStatuses() {
        this(null, 1, null);
    }

    private final Map<String, Boolean> component1() {
        return this.statuses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankStatuses copy$default(BankStatuses bankStatuses, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = bankStatuses.statuses;
        }
        return bankStatuses.copy(map);
    }

    public final BankStatuses copy(Map<String, Boolean> statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        return new BankStatuses(statuses);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BankStatuses) && Intrinsics.areEqual(this.statuses, ((BankStatuses) obj).statuses);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.statuses.hashCode();
    }

    public final /* synthetic */ boolean isOnline$payments_core_release(Bank bank) {
        Intrinsics.checkNotNullParameter(bank, "bank");
        Boolean bool = this.statuses.get(bank.getId());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final int size$payments_core_release() {
        return this.statuses.size();
    }

    public String toString() {
        Map<String, Boolean> map = this.statuses;
        return "BankStatuses(statuses=" + map + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Map<String, Boolean> map = this.statuses;
        out.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
    }

    public BankStatuses(Map<String, Boolean> statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        this.statuses = statuses;
    }

    public /* synthetic */ BankStatuses(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
