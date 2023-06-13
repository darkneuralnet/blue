package p000;

import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.constant.NestProminence;
import co.bird.android.model.constant.NestViewState;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.nestedstructures.Coordinate;
import co.bird.android.model.persistence.nestedstructures.NestAvailableSpaceDetail;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireNestAvailableSpaceDetail;
import co.bird.android.model.wire.WireNestMarker;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestMarker;", "Lco/bird/android/model/persistence/NestMarker;", C17296a.f69688o, "Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;", "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;", "b", "nest-marker_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestMarkerConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerConversion.kt\nco/bird/android/repository/nestmarker/conversion/NestMarkerConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1549#2:36\n1620#2,3:37\n*S KotlinDebug\n*F\n+ 1 NestMarkerConversion.kt\nco/bird/android/repository/nestmarker/conversion/NestMarkerConversionKt\n*L\n24#1:36\n24#1:37,3\n*E\n"})
/* renamed from: c43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38926c43 {
    /* renamed from: a */
    public static final NestMarker m61968a(WireNestMarker wireNestMarker) {
        NestViewState nestViewState;
        NestIcon nestIcon;
        ThemedColors themedColors;
        ThemedColors themedColors2;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireNestMarker, "<this>");
        String id = wireNestMarker.getId();
        Coordinate m17964c = C47311qB0.m17964c(wireNestMarker.getLocation());
        int capacity = wireNestMarker.getCapacity();
        if (wireNestMarker.getState() != NestViewState.UNKNOWN) {
            nestViewState = wireNestMarker.getState();
        } else {
            nestViewState = null;
        }
        if (wireNestMarker.getIcon() != NestIcon.UNKNOWN) {
            nestIcon = wireNestMarker.getIcon();
        } else {
            nestIcon = null;
        }
        ClientIcon secondaryIcon = wireNestMarker.getSecondaryIcon();
        WireThemedColors secondaryIconColor = wireNestMarker.getSecondaryIconColor();
        if (secondaryIconColor != null) {
            themedColors = C47311qB0.m17961f(secondaryIconColor);
        } else {
            themedColors = null;
        }
        WireThemedColors secondaryIconBackgroundColor = wireNestMarker.getSecondaryIconBackgroundColor();
        if (secondaryIconBackgroundColor != null) {
            themedColors2 = C47311qB0.m17961f(secondaryIconBackgroundColor);
        } else {
            themedColors2 = null;
        }
        NestProminence prominence = wireNestMarker.getProminence();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        List<WireNestAvailableSpaceDetail> availableSpaceDetails = wireNestMarker.getAvailableSpaceDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(availableSpaceDetails, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireNestAvailableSpaceDetail wireNestAvailableSpaceDetail : availableSpaceDetails) {
            arrayList.add(m61967b(wireNestAvailableSpaceDetail));
        }
        return new NestMarker(id, m17964c, capacity, nestViewState, nestIcon, secondaryIcon, themedColors, themedColors2, prominence, now, arrayList);
    }

    /* renamed from: b */
    public static final NestAvailableSpaceDetail m61967b(WireNestAvailableSpaceDetail wireNestAvailableSpaceDetail) {
        Intrinsics.checkNotNullParameter(wireNestAvailableSpaceDetail, "<this>");
        return new NestAvailableSpaceDetail(wireNestAvailableSpaceDetail.getCount(), wireNestAvailableSpaceDetail.getColoredIcon(), wireNestAvailableSpaceDetail.getIcon());
    }
}
