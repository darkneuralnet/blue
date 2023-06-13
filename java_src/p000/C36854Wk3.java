package p000;

import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireOperatorFilterOption;
import co.bird.android.model.wire.WireOperatorOptionFilter;
import co.bird.android.model.wire.WireOperatorToggleFilter;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u0012\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\t¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorOptionFilter;", "", "", "enabledOptions", "Lco/bird/android/model/constant/FilterLogicToggleOption;", "logicOperator", "Lco/bird/android/model/persistence/OperatorOptionFilter;", C17296a.f69688o, "Lco/bird/android/model/wire/WireOperatorFilterOption;", "", "enabled", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "c", "Lco/bird/android/model/wire/WireOperatorToggleFilter;", "Lco/bird/android/model/persistence/OperatorToggleFilter;", "b", "co.bird.android.repository.fleet-status"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorFilterConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterConversion.kt\nco/bird/android/repository/operatorfilter/converters/OperatorFilterConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 OperatorFilterConversion.kt\nco/bird/android/repository/operatorfilter/converters/OperatorFilterConversionKt\n*L\n19#1:55\n19#1:56,3\n*E\n"})
/* renamed from: Wk3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36854Wk3 {
    /* renamed from: a */
    public static final OperatorOptionFilter m77892a(WireOperatorOptionFilter wireOperatorOptionFilter, List<String> enabledOptions, FilterLogicToggleOption filterLogicToggleOption) {
        int collectionSizeOrDefault;
        ThemedColors themedColors;
        ThemedColors themedColors2;
        Intrinsics.checkNotNullParameter(wireOperatorOptionFilter, "<this>");
        Intrinsics.checkNotNullParameter(enabledOptions, "enabledOptions");
        String id = wireOperatorOptionFilter.getId();
        String label = wireOperatorOptionFilter.getLabel();
        OperatorMapKind kind = wireOperatorOptionFilter.getKind();
        int ordinal = wireOperatorOptionFilter.getOrdinal();
        OperatorFilterType type = wireOperatorOptionFilter.getType();
        List<WireOperatorFilterOption> options = wireOperatorOptionFilter.getOptions();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireOperatorFilterOption wireOperatorFilterOption : options) {
            arrayList.add(m77890c(wireOperatorFilterOption, enabledOptions.contains(wireOperatorFilterOption.getValue())));
        }
        ClientIcon icon = wireOperatorOptionFilter.getIcon();
        WireThemedColors iconColor = wireOperatorOptionFilter.getIconColor();
        if (iconColor != null) {
            themedColors = C47311qB0.m17961f(iconColor);
        } else {
            themedColors = null;
        }
        ColoredIcon coloredIcon = wireOperatorOptionFilter.getColoredIcon();
        WireThemedColors iconBackgroundColor = wireOperatorOptionFilter.getIconBackgroundColor();
        if (iconBackgroundColor != null) {
            themedColors2 = C47311qB0.m17961f(iconBackgroundColor);
        } else {
            themedColors2 = null;
        }
        return new OperatorOptionFilter(id, kind, ordinal, type, label, arrayList, filterLogicToggleOption, icon, themedColors, coloredIcon, themedColors2);
    }

    /* renamed from: b */
    public static final OperatorToggleFilter m77891b(WireOperatorToggleFilter wireOperatorToggleFilter, boolean z) {
        ThemedColors themedColors;
        ThemedColors themedColors2;
        Intrinsics.checkNotNullParameter(wireOperatorToggleFilter, "<this>");
        String id = wireOperatorToggleFilter.getId();
        OperatorMapKind kind = wireOperatorToggleFilter.getKind();
        int ordinal = wireOperatorToggleFilter.getOrdinal();
        OperatorFilterType type = wireOperatorToggleFilter.getType();
        String title = wireOperatorToggleFilter.getTitle();
        String toggleTitle = wireOperatorToggleFilter.getToggleTitle();
        ClientIcon icon = wireOperatorToggleFilter.getIcon();
        WireThemedColors iconColor = wireOperatorToggleFilter.getIconColor();
        if (iconColor != null) {
            themedColors = C47311qB0.m17961f(iconColor);
        } else {
            themedColors = null;
        }
        ColoredIcon coloredIcon = wireOperatorToggleFilter.getColoredIcon();
        WireThemedColors iconBackgroundColor = wireOperatorToggleFilter.getIconBackgroundColor();
        if (iconBackgroundColor != null) {
            themedColors2 = C47311qB0.m17961f(iconBackgroundColor);
        } else {
            themedColors2 = null;
        }
        return new OperatorToggleFilter(id, kind, ordinal, type, title, toggleTitle, z, icon, themedColors, coloredIcon, themedColors2);
    }

    /* renamed from: c */
    public static final OperatorFilterOption m77890c(WireOperatorFilterOption wireOperatorFilterOption, boolean z) {
        Intrinsics.checkNotNullParameter(wireOperatorFilterOption, "<this>");
        return new OperatorFilterOption(wireOperatorFilterOption.getName(), wireOperatorFilterOption.getType(), wireOperatorFilterOption.getValue(), z, wireOperatorFilterOption.getIcon(), wireOperatorFilterOption.getColoredIcon());
    }

    public static /* synthetic */ OperatorOptionFilter toPersistence$default(WireOperatorOptionFilter wireOperatorOptionFilter, List list, FilterLogicToggleOption filterLogicToggleOption, int i, Object obj) {
        if ((i & 2) != 0) {
            filterLogicToggleOption = null;
        }
        return m77892a(wireOperatorOptionFilter, list, filterLogicToggleOption);
    }
}
