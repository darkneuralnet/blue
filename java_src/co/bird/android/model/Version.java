package co.bird.android.model;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/Version;", "", "version", "", "(Ljava/lang/String;)V", "parts", "", "", "compareTo", LegacyRepairType.OTHER_KEY, "component1", "copy", "equals", "", "", "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Version.kt\nco/bird/android/model/Version\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n*S KotlinDebug\n*F\n+ 1 Version.kt\nco/bird/android/model/Version\n*L\n7#1:21\n7#1:22,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Version implements Comparable<Version> {
    private final List<Integer> parts;
    private final String version;

    public Version(String version) {
        List split$default;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(version, "version");
        this.version = version;
        split$default = StringsKt__StringsKt.split$default((CharSequence) version, new String[]{InstructionFileId.DOT}, false, 0, 6, (Object) null);
        List<String> list = split$default;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : list) {
            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        }
        this.parts = arrayList;
    }

    private final String component1() {
        return this.version;
    }

    public static /* synthetic */ Version copy$default(Version version, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = version.version;
        }
        return version.copy(str);
    }

    public final Version copy(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new Version(version);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Version) && Intrinsics.areEqual(this.version, ((Version) obj).version);
    }

    public int hashCode() {
        return this.version.hashCode();
    }

    public String toString() {
        String str = this.version;
        return "Version(version=" + str + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(this.parts.size(), other.parts.size());
        for (int i = 0; i < min; i++) {
            int compare = Intrinsics.compare(this.parts.get(i).intValue(), other.parts.get(i).intValue());
            if (compare != 0) {
                return compare;
            }
        }
        return Intrinsics.compare(this.parts.size(), other.parts.size());
    }
}
