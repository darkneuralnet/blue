package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/DailyDropSummary;", "Landroid/os/Parcelable;", "date", "Lorg/joda/time/LocalDate;", "scoredDrops", "", "Lco/bird/android/model/ScoredDrop;", "(Lorg/joda/time/LocalDate;Ljava/util/List;)V", "getDate", "()Lorg/joda/time/LocalDate;", "getScoredDrops", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DailyDropSummary implements Parcelable {
    public static final Parcelable.Creator<DailyDropSummary> CREATOR = new Creator();
    private final LocalDate date;
    private final List<ScoredDrop> scoredDrops;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DailyDropSummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DailyDropSummary createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ScoredDrop.CREATOR.createFromParcel(parcel));
            }
            return new DailyDropSummary(localDate, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DailyDropSummary[] newArray(int i) {
            return new DailyDropSummary[i];
        }
    }

    public DailyDropSummary(LocalDate date, List<ScoredDrop> scoredDrops) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(scoredDrops, "scoredDrops");
        this.date = date;
        this.scoredDrops = scoredDrops;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyDropSummary copy$default(DailyDropSummary dailyDropSummary, LocalDate localDate, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = dailyDropSummary.date;
        }
        if ((i & 2) != 0) {
            list = dailyDropSummary.scoredDrops;
        }
        return dailyDropSummary.copy(localDate, list);
    }

    public final LocalDate component1() {
        return this.date;
    }

    public final List<ScoredDrop> component2() {
        return this.scoredDrops;
    }

    public final DailyDropSummary copy(LocalDate date, List<ScoredDrop> scoredDrops) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(scoredDrops, "scoredDrops");
        return new DailyDropSummary(date, scoredDrops);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DailyDropSummary) {
            DailyDropSummary dailyDropSummary = (DailyDropSummary) obj;
            return Intrinsics.areEqual(this.date, dailyDropSummary.date) && Intrinsics.areEqual(this.scoredDrops, dailyDropSummary.scoredDrops);
        }
        return false;
    }

    public final LocalDate getDate() {
        return this.date;
    }

    public final List<ScoredDrop> getScoredDrops() {
        return this.scoredDrops;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.scoredDrops.hashCode();
    }

    public String toString() {
        LocalDate localDate = this.date;
        List<ScoredDrop> list = this.scoredDrops;
        return "DailyDropSummary(date=" + localDate + ", scoredDrops=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeSerializable(this.date);
        List<ScoredDrop> list = this.scoredDrops;
        out.writeInt(list.size());
        for (ScoredDrop scoredDrop : list) {
            scoredDrop.writeToParcel(out, i);
        }
    }
}
