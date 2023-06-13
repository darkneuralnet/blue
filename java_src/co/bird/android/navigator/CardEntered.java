package co.bird.android.navigator;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J)\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006!"}, m28432d2 = {"Lco/bird/android/navigator/CardEntered;", "Lco/bird/android/navigator/ActivityResult;", "", "tokenId", "Lcom/stripe/android/model/Card;", "card", "", "isGooglePay", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Lcom/stripe/android/model/Card;", "getCard", "()Lcom/stripe/android/model/Card;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Card;Z)V", "navigator_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CardEntered extends ActivityResult {
    public static final Parcelable.Creator<CardEntered> CREATOR = new C16261a();

    /* renamed from: b */
    public final String f66782b;

    /* renamed from: c */
    public final Card f66783c;

    /* renamed from: d */
    public final boolean f66784d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.navigator.CardEntered$a */
    /* loaded from: classes4.dex */
    public static final class C16261a implements Parcelable.Creator<CardEntered> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CardEntered createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardEntered(parcel.readString(), (Card) parcel.readParcelable(CardEntered.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CardEntered[] newArray(int i) {
            return new CardEntered[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardEntered(String str, Card card, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(card, "card");
        this.f66782b = str;
        this.f66783c = card;
        this.f66784d = z;
    }

    public static /* synthetic */ CardEntered copy$default(CardEntered cardEntered, String str, Card card, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardEntered.f66782b;
        }
        if ((i & 2) != 0) {
            card = cardEntered.f66783c;
        }
        if ((i & 4) != 0) {
            z = cardEntered.f66784d;
        }
        return cardEntered.m55405a(str, card, z);
    }

    /* renamed from: a */
    public final CardEntered m55405a(String str, Card card, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new CardEntered(str, card, z);
    }

    /* renamed from: b */
    public final String m55404b() {
        return this.f66782b;
    }

    /* renamed from: c */
    public final boolean m55403c() {
        return this.f66784d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardEntered) {
            CardEntered cardEntered = (CardEntered) obj;
            return Intrinsics.areEqual(this.f66782b, cardEntered.f66782b) && Intrinsics.areEqual(this.f66783c, cardEntered.f66783c) && this.f66784d == cardEntered.f66784d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f66782b;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f66783c.hashCode()) * 31;
        boolean z = this.f66784d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f66782b;
        Card card = this.f66783c;
        boolean z = this.f66784d;
        return "CardEntered(tokenId=" + str + ", card=" + card + ", isGooglePay=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66782b);
        out.writeParcelable(this.f66783c, i);
        out.writeInt(this.f66784d ? 1 : 0);
    }

    public /* synthetic */ CardEntered(String str, Card card, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, card, (i & 4) != 0 ? false : z);
    }
}
