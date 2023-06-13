package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;", "", "language", "", "strings", "", "caseInsensitive", "", "requiredCount", "", "mustBeSatisfied", "(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)V", "getCaseInsensitive", "()Z", "getLanguage", "()Ljava/lang/String;", "getMustBeSatisfied", "getRequiredCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStrings", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "isSatisfiedBy", "haystack", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIdentificationDocumentScannerStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationDocumentScannerStrategy.kt\nco/bird/android/model/identification/IdentificationDocumentStringsRequirements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n766#2:557\n857#2:558\n1747#2,3:559\n858#2:562\n1#3:563\n*S KotlinDebug\n*F\n+ 1 IdentificationDocumentScannerStrategy.kt\nco/bird/android/model/identification/IdentificationDocumentStringsRequirements\n*L\n501#1:557\n501#1:558\n501#1:559,3\n501#1:562\n*E\n"})
/* loaded from: classes4.dex */
public final class IdentificationDocumentStringsRequirements {
    private final boolean caseInsensitive;
    private final String language;
    private final boolean mustBeSatisfied;
    private final Integer requiredCount;
    private final Set<String> strings;

    public IdentificationDocumentStringsRequirements(String language, Set<String> strings, boolean z, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.language = language;
        this.strings = strings;
        this.caseInsensitive = z;
        this.requiredCount = num;
        this.mustBeSatisfied = z2;
    }

    public static /* synthetic */ IdentificationDocumentStringsRequirements copy$default(IdentificationDocumentStringsRequirements identificationDocumentStringsRequirements, String str, Set set, boolean z, Integer num, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identificationDocumentStringsRequirements.language;
        }
        Set<String> set2 = set;
        if ((i & 2) != 0) {
            set2 = identificationDocumentStringsRequirements.strings;
        }
        Set set3 = set2;
        if ((i & 4) != 0) {
            z = identificationDocumentStringsRequirements.caseInsensitive;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            num = identificationDocumentStringsRequirements.requiredCount;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            z2 = identificationDocumentStringsRequirements.mustBeSatisfied;
        }
        return identificationDocumentStringsRequirements.copy(str, set3, z3, num2, z2);
    }

    public final String component1() {
        return this.language;
    }

    public final Set<String> component2() {
        return this.strings;
    }

    public final boolean component3() {
        return this.caseInsensitive;
    }

    public final Integer component4() {
        return this.requiredCount;
    }

    public final boolean component5() {
        return this.mustBeSatisfied;
    }

    public final IdentificationDocumentStringsRequirements copy(String language, Set<String> strings, boolean z, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return new IdentificationDocumentStringsRequirements(language, strings, z, num, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationDocumentStringsRequirements) {
            IdentificationDocumentStringsRequirements identificationDocumentStringsRequirements = (IdentificationDocumentStringsRequirements) obj;
            return Intrinsics.areEqual(this.language, identificationDocumentStringsRequirements.language) && Intrinsics.areEqual(this.strings, identificationDocumentStringsRequirements.strings) && this.caseInsensitive == identificationDocumentStringsRequirements.caseInsensitive && Intrinsics.areEqual(this.requiredCount, identificationDocumentStringsRequirements.requiredCount) && this.mustBeSatisfied == identificationDocumentStringsRequirements.mustBeSatisfied;
        }
        return false;
    }

    public final boolean getCaseInsensitive() {
        return this.caseInsensitive;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final boolean getMustBeSatisfied() {
        return this.mustBeSatisfied;
    }

    public final Integer getRequiredCount() {
        return this.requiredCount;
    }

    public final Set<String> getStrings() {
        return this.strings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.language.hashCode() * 31) + this.strings.hashCode()) * 31;
        boolean z = this.caseInsensitive;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.requiredCount;
        int hashCode2 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.mustBeSatisfied;
        return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final Set<String> isSatisfiedBy(Set<String> haystack) {
        int size;
        int coerceAtMost;
        boolean z;
        Set<String> set;
        boolean contains;
        Intrinsics.checkNotNullParameter(haystack, "haystack");
        Integer num = this.requiredCount;
        if (num != null) {
            size = num.intValue();
        } else {
            size = this.strings.size();
        }
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(size, this.strings.size());
        Set<String> set2 = this.strings;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set2.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (!(haystack instanceof Collection) || !haystack.isEmpty()) {
                for (String str2 : haystack) {
                    contains = StringsKt__StringsKt.contains(str2, str, this.caseInsensitive);
                    if (contains) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                arrayList.add(next);
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        if (set.size() < coerceAtMost) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return set;
    }

    public String toString() {
        String str = this.language;
        Set<String> set = this.strings;
        boolean z = this.caseInsensitive;
        Integer num = this.requiredCount;
        boolean z2 = this.mustBeSatisfied;
        return "IdentificationDocumentStringsRequirements(language=" + str + ", strings=" + set + ", caseInsensitive=" + z + ", requiredCount=" + num + ", mustBeSatisfied=" + z2 + ")";
    }

    public /* synthetic */ IdentificationDocumentStringsRequirements(String str, Set set, boolean z, Integer num, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, (i & 4) != 0 ? false : z, num, (i & 16) != 0 ? false : z2);
    }
}
