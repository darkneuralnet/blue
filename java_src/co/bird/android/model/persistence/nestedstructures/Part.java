package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/Part;", "", "id", "", "kind", "Lco/bird/android/model/constant/PartKind;", "key", "(Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getKey", "getKind", "()Lco/bird/android/model/constant/PartKind;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Part {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66698id;
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final String key;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final PartKind kind;

    public Part(String str, PartKind kind, String key) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f66698id = str;
        this.kind = kind;
        this.key = key;
    }

    public static /* synthetic */ Part copy$default(Part part, String str, PartKind partKind, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = part.f66698id;
        }
        if ((i & 2) != 0) {
            partKind = part.kind;
        }
        if ((i & 4) != 0) {
            str2 = part.key;
        }
        return part.copy(str, partKind, str2);
    }

    public final String component1() {
        return this.f66698id;
    }

    public final PartKind component2() {
        return this.kind;
    }

    public final String component3() {
        return this.key;
    }

    public final Part copy(String str, PartKind kind, String key) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(key, "key");
        return new Part(str, kind, key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Part) {
            Part part = (Part) obj;
            return Intrinsics.areEqual(this.f66698id, part.f66698id) && this.kind == part.kind && Intrinsics.areEqual(this.key, part.key);
        }
        return false;
    }

    public final String getId() {
        return this.f66698id;
    }

    public final String getKey() {
        return this.key;
    }

    public final PartKind getKind() {
        return this.kind;
    }

    public int hashCode() {
        String str = this.f66698id;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.key.hashCode();
    }

    public String toString() {
        String str = this.f66698id;
        PartKind partKind = this.kind;
        String str2 = this.key;
        return "Part(id=" + str + ", kind=" + partKind + ", key=" + str2 + ")";
    }
}
