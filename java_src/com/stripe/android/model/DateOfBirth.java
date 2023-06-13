package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u0017H\u0016J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/model/DateOfBirth;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", DateOfBirth.PARAM_DAY, "", DateOfBirth.PARAM_MONTH, DateOfBirth.PARAM_YEAR, "(III)V", "getDay", "()I", "getMonth", "getYear", "component1", "component2", "component3", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DateOfBirth implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    @Deprecated
    private static final String PARAM_DAY = "day";
    @Deprecated
    private static final String PARAM_MONTH = "month";
    @Deprecated
    private static final String PARAM_YEAR = "year";
    private final int day;
    private final int month;
    private final int year;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DateOfBirth> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/DateOfBirth$Companion;", "", "()V", "PARAM_DAY", "", "PARAM_MONTH", "PARAM_YEAR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<DateOfBirth> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DateOfBirth createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DateOfBirth(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DateOfBirth[] newArray(int i) {
            return new DateOfBirth[i];
        }
    }

    public DateOfBirth(int i, int i2, int i3) {
        this.day = i;
        this.month = i2;
        this.year = i3;
    }

    public static /* synthetic */ DateOfBirth copy$default(DateOfBirth dateOfBirth, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dateOfBirth.day;
        }
        if ((i4 & 2) != 0) {
            i2 = dateOfBirth.month;
        }
        if ((i4 & 4) != 0) {
            i3 = dateOfBirth.year;
        }
        return dateOfBirth.copy(i, i2, i3);
    }

    public final int component1() {
        return this.day;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.year;
    }

    public final DateOfBirth copy(int i, int i2, int i3) {
        return new DateOfBirth(i, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateOfBirth) {
            DateOfBirth dateOfBirth = (DateOfBirth) obj;
            return this.day == dateOfBirth.day && this.month == dateOfBirth.month && this.year == dateOfBirth.year;
        }
        return false;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.day) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.year);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_DAY, Integer.valueOf(this.day)), TuplesKt.m28425to(PARAM_MONTH, Integer.valueOf(this.month)), TuplesKt.m28425to(PARAM_YEAR, Integer.valueOf(this.year)));
        return mapOf;
    }

    public String toString() {
        int i = this.day;
        int i2 = this.month;
        int i3 = this.year;
        return "DateOfBirth(day=" + i + ", month=" + i2 + ", year=" + i3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.day);
        out.writeInt(this.month);
        out.writeInt(this.year);
    }
}
