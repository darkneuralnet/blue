package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/AddressGuess;", "", "id", "", "firstLine", "secondLine", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstLine", "()Ljava/lang/String;", "getId", "getSecondLine", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AddressGuess {
    private final String firstLine;

    /* renamed from: id */
    private final String f66566id;
    private final String secondLine;

    public AddressGuess(String id, String firstLine, String secondLine) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(firstLine, "firstLine");
        Intrinsics.checkNotNullParameter(secondLine, "secondLine");
        this.f66566id = id;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    public static /* synthetic */ AddressGuess copy$default(AddressGuess addressGuess, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressGuess.f66566id;
        }
        if ((i & 2) != 0) {
            str2 = addressGuess.firstLine;
        }
        if ((i & 4) != 0) {
            str3 = addressGuess.secondLine;
        }
        return addressGuess.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f66566id;
    }

    public final String component2() {
        return this.firstLine;
    }

    public final String component3() {
        return this.secondLine;
    }

    public final AddressGuess copy(String id, String firstLine, String secondLine) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(firstLine, "firstLine");
        Intrinsics.checkNotNullParameter(secondLine, "secondLine");
        return new AddressGuess(id, firstLine, secondLine);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddressGuess) {
            AddressGuess addressGuess = (AddressGuess) obj;
            return Intrinsics.areEqual(this.f66566id, addressGuess.f66566id) && Intrinsics.areEqual(this.firstLine, addressGuess.firstLine) && Intrinsics.areEqual(this.secondLine, addressGuess.secondLine);
        }
        return false;
    }

    public final String getFirstLine() {
        return this.firstLine;
    }

    public final String getId() {
        return this.f66566id;
    }

    public final String getSecondLine() {
        return this.secondLine;
    }

    public int hashCode() {
        return (((this.f66566id.hashCode() * 31) + this.firstLine.hashCode()) * 31) + this.secondLine.hashCode();
    }

    public String toString() {
        String str = this.f66566id;
        String str2 = this.firstLine;
        String str3 = this.secondLine;
        return "AddressGuess(id=" + str + ", firstLine=" + str2 + ", secondLine=" + str3 + ")";
    }
}
