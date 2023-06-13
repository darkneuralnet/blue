package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0087\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030<J\u0013\u0010=\u001a\u00020\"2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0007HÖ\u0001J\u0010\u0010A\u001a\u00020\"2\b\u0010>\u001a\u0004\u0018\u00010\u0000J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006C"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorOptionFilter;", "Lco/bird/android/model/persistence/OperatorFilter;", "id", "", "kind", "Lco/bird/android/model/constant/OperatorMapKind;", "ordinal", "", "type", "Lco/bird/android/model/constant/OperatorFilterType;", "label", "options", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "logicOperator", "Lco/bird/android/model/constant/FilterLogicToggleOption;", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "coloredIcon", "Lco/bird/android/model/constant/ColoredIcon;", "iconBackgroundColor", "(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getColoredIcon", "()Lco/bird/android/model/constant/ColoredIcon;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIconColor", "getId", "()Ljava/lang/String;", "isSet", "", "()Z", "getKind", "()Lco/bird/android/model/constant/OperatorMapKind;", "getLabel", "getLogicOperator", "()Lco/bird/android/model/constant/FilterLogicToggleOption;", "getOptions", "()Ljava/util/List;", "getOrdinal", "()I", "getType", "()Lco/bird/android/model/constant/OperatorFilterType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "enabledOptionValues", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "isSame", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nOperatorOptionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOptionFilter.kt\nco/bird/android/model/persistence/OperatorOptionFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1774#2,4:91\n1747#2,3:95\n1747#2,3:98\n766#2:101\n857#2,2:102\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 OperatorOptionFilter.kt\nco/bird/android/model/persistence/OperatorOptionFilter\n*L\n78#1:91,4\n79#1:95,3\n84#1:98,3\n88#1:101\n88#1:102,2\n88#1:104\n88#1:105,3\n*E\n"})
/* loaded from: classes4.dex */
public final class OperatorOptionFilter implements OperatorFilter {
    private final ColoredIcon coloredIcon;
    private final ClientIcon icon;
    private final ThemedColors iconBackgroundColor;
    private final ThemedColors iconColor;

    /* renamed from: id */
    private final String f66683id;
    private final OperatorMapKind kind;
    private final String label;
    private final FilterLogicToggleOption logicOperator;
    private final List<OperatorFilterOption> options;
    private final int ordinal;
    private final OperatorFilterType type;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperatorFilterType.values().length];
            try {
                iArr[OperatorFilterType.RANGE_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OperatorOptionFilter(String id, OperatorMapKind kind, int i, OperatorFilterType type, String label, List<OperatorFilterOption> options, FilterLogicToggleOption filterLogicToggleOption, ClientIcon clientIcon, ThemedColors themedColors, ColoredIcon coloredIcon, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f66683id = id;
        this.kind = kind;
        this.ordinal = i;
        this.type = type;
        this.label = label;
        this.options = options;
        this.logicOperator = filterLogicToggleOption;
        this.icon = clientIcon;
        this.iconColor = themedColors;
        this.coloredIcon = coloredIcon;
        this.iconBackgroundColor = themedColors2;
    }

    public final String component1() {
        return this.f66683id;
    }

    public final ColoredIcon component10() {
        return this.coloredIcon;
    }

    public final ThemedColors component11() {
        return this.iconBackgroundColor;
    }

    public final OperatorMapKind component2() {
        return this.kind;
    }

    public final int component3() {
        return this.ordinal;
    }

    public final OperatorFilterType component4() {
        return this.type;
    }

    public final String component5() {
        return this.label;
    }

    public final List<OperatorFilterOption> component6() {
        return this.options;
    }

    public final FilterLogicToggleOption component7() {
        return this.logicOperator;
    }

    public final ClientIcon component8() {
        return this.icon;
    }

    public final ThemedColors component9() {
        return this.iconColor;
    }

    public final OperatorOptionFilter copy(String id, OperatorMapKind kind, int i, OperatorFilterType type, String label, List<OperatorFilterOption> options, FilterLogicToggleOption filterLogicToggleOption, ClientIcon clientIcon, ThemedColors themedColors, ColoredIcon coloredIcon, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OperatorOptionFilter(id, kind, i, type, label, options, filterLogicToggleOption, clientIcon, themedColors, coloredIcon, themedColors2);
    }

    public final Set<String> enabledOptionValues() {
        int collectionSizeOrDefault;
        Set<String> set;
        ArrayList<OperatorFilterOption> arrayList = new ArrayList();
        for (Object obj : this.options) {
            if (((OperatorFilterOption) obj).getEnabled()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (OperatorFilterOption operatorFilterOption : arrayList) {
            arrayList2.add(operatorFilterOption.getValue());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList2);
        return set;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorOptionFilter) {
            OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) obj;
            return Intrinsics.areEqual(this.f66683id, operatorOptionFilter.f66683id) && this.kind == operatorOptionFilter.kind && this.ordinal == operatorOptionFilter.ordinal && this.type == operatorOptionFilter.type && Intrinsics.areEqual(this.label, operatorOptionFilter.label) && Intrinsics.areEqual(this.options, operatorOptionFilter.options) && this.logicOperator == operatorOptionFilter.logicOperator && this.icon == operatorOptionFilter.icon && Intrinsics.areEqual(this.iconColor, operatorOptionFilter.iconColor) && this.coloredIcon == operatorOptionFilter.coloredIcon && Intrinsics.areEqual(this.iconBackgroundColor, operatorOptionFilter.iconBackgroundColor);
        }
        return false;
    }

    public final ColoredIcon getColoredIcon() {
        return this.coloredIcon;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final ThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public String getId() {
        return this.f66683id;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public OperatorMapKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final FilterLogicToggleOption getLogicOperator() {
        return this.logicOperator;
    }

    public final List<OperatorFilterOption> getOptions() {
        return this.options;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public int getOrdinal() {
        return this.ordinal;
    }

    @Override // co.bird.android.model.persistence.OperatorFilter
    public OperatorFilterType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f66683id.hashCode() * 31) + this.kind.hashCode()) * 31) + Integer.hashCode(this.ordinal)) * 31) + this.type.hashCode()) * 31) + this.label.hashCode()) * 31) + this.options.hashCode()) * 31;
        FilterLogicToggleOption filterLogicToggleOption = this.logicOperator;
        int hashCode2 = (hashCode + (filterLogicToggleOption == null ? 0 : filterLogicToggleOption.hashCode())) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode3 = (hashCode2 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        ThemedColors themedColors = this.iconColor;
        int hashCode4 = (hashCode3 + (themedColors == null ? 0 : themedColors.hashCode())) * 31;
        ColoredIcon coloredIcon = this.coloredIcon;
        int hashCode5 = (hashCode4 + (coloredIcon == null ? 0 : coloredIcon.hashCode())) * 31;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        return hashCode5 + (themedColors2 != null ? themedColors2.hashCode() : 0);
    }

    public final boolean isSame(OperatorOptionFilter operatorOptionFilter) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (operatorOptionFilter == null) {
            return false;
        }
        if (getId().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (operatorOptionFilter.getId().length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (!Intrinsics.areEqual(getId(), operatorOptionFilter.getId()) || getType() != operatorOptionFilter.getType()) {
                    return false;
                }
                return true;
            }
        }
        if (this.label.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (operatorOptionFilter.label.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || !Intrinsics.areEqual(this.label, operatorOptionFilter.label) || getType() != operatorOptionFilter.getType()) {
            return false;
        }
        return true;
    }

    public final boolean isSet() {
        int i;
        boolean z;
        if (WhenMappings.$EnumSwitchMapping$0[getType().ordinal()] == 1) {
            if (this.options.size() <= 2) {
                return false;
            }
            List<OperatorFilterOption> list = this.options;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (OperatorFilterOption operatorFilterOption : list) {
                    if (operatorFilterOption.getEnabled() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i != 1) {
                List<OperatorFilterOption> list2 = this.options;
                List<OperatorFilterOption> subList = list2.subList(1, list2.size() - 1);
                if (!(subList instanceof Collection) || !subList.isEmpty()) {
                    for (OperatorFilterOption operatorFilterOption2 : subList) {
                        if (operatorFilterOption2.getEnabled()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    return false;
                }
            }
        } else {
            List<OperatorFilterOption> list3 = this.options;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                return false;
            }
            for (OperatorFilterOption operatorFilterOption3 : list3) {
                if (operatorFilterOption3.getEnabled()) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        String str = this.f66683id;
        OperatorMapKind operatorMapKind = this.kind;
        int i = this.ordinal;
        OperatorFilterType operatorFilterType = this.type;
        String str2 = this.label;
        List<OperatorFilterOption> list = this.options;
        FilterLogicToggleOption filterLogicToggleOption = this.logicOperator;
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        ColoredIcon coloredIcon = this.coloredIcon;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        return "OperatorOptionFilter(id=" + str + ", kind=" + operatorMapKind + ", ordinal=" + i + ", type=" + operatorFilterType + ", label=" + str2 + ", options=" + list + ", logicOperator=" + filterLogicToggleOption + ", icon=" + clientIcon + ", iconColor=" + themedColors + ", coloredIcon=" + coloredIcon + ", iconBackgroundColor=" + themedColors2 + ")";
    }

    public /* synthetic */ OperatorOptionFilter(String str, OperatorMapKind operatorMapKind, int i, OperatorFilterType operatorFilterType, String str2, List list, FilterLogicToggleOption filterLogicToggleOption, ClientIcon clientIcon, ThemedColors themedColors, ColoredIcon coloredIcon, ThemedColors themedColors2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? OperatorMapKind.UNKNOWN : operatorMapKind, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? OperatorFilterType.UNKNOWN : operatorFilterType, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? null : filterLogicToggleOption, (i2 & 128) != 0 ? null : clientIcon, (i2 & 256) != 0 ? null : themedColors, (i2 & 512) != 0 ? null : coloredIcon, (i2 & 1024) == 0 ? themedColors2 : null);
    }
}
