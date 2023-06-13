package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;
@Deprecated
/* loaded from: classes6.dex */
public class PlaceTypes {
    public static final Set<Integer> ALL;
    @ShowFirstParty
    private static final Set<Integer> zzaj;
    @ShowFirstParty
    private static final Set<Integer> zzak;

    static {
        Integer valueOf = Integer.valueOf((int) Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3);
        Integer valueOf2 = Integer.valueOf((int) Place.TYPE_LOCALITY);
        Integer valueOf3 = Integer.valueOf((int) Place.TYPE_POSTAL_CODE);
        Integer valueOf4 = Integer.valueOf((int) Place.TYPE_POSTAL_CODE_PREFIX);
        Integer valueOf5 = Integer.valueOf((int) Place.TYPE_POSTAL_TOWN);
        zzaj = CollectionUtils.setOf(1001, 1002, valueOf, 1005, Integer.valueOf((int) Place.TYPE_FLOOR), valueOf2, Integer.valueOf((int) Place.TYPE_POST_BOX), valueOf3, valueOf4, valueOf5, Integer.valueOf((int) Place.TYPE_PREMISE), Integer.valueOf((int) Place.TYPE_ROOM), Integer.valueOf((int) Place.TYPE_ROUTE), Integer.valueOf((int) Place.TYPE_STREET_ADDRESS), Integer.valueOf((int) Place.TYPE_SUBLOCALITY), Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_1), 1024, Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_3), Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_4), Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_5), Integer.valueOf((int) Place.TYPE_SUBPREMISE));
        zzak = CollectionUtils.setOf(1001, 1002, valueOf, 1005, valueOf2, valueOf3, valueOf4, valueOf5);
        ALL = CollectionUtils.setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 1001, 1002, valueOf, 1004, 1005, Integer.valueOf((int) Place.TYPE_FLOOR), 1007, Integer.valueOf((int) Place.TYPE_INTERSECTION), valueOf2, Integer.valueOf((int) Place.TYPE_NATURAL_FEATURE), Integer.valueOf((int) Place.TYPE_NEIGHBORHOOD), Integer.valueOf((int) Place.TYPE_POLITICAL), Integer.valueOf((int) Place.TYPE_POINT_OF_INTEREST), Integer.valueOf((int) Place.TYPE_POST_BOX), valueOf3, valueOf4, valueOf5, Integer.valueOf((int) Place.TYPE_PREMISE), Integer.valueOf((int) Place.TYPE_ROOM), Integer.valueOf((int) Place.TYPE_ROUTE), Integer.valueOf((int) Place.TYPE_STREET_ADDRESS), Integer.valueOf((int) Place.TYPE_SUBLOCALITY), Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_1), 1024, Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_3), Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_4), Integer.valueOf((int) Place.TYPE_SUBLOCALITY_LEVEL_5), Integer.valueOf((int) Place.TYPE_SUBPREMISE), Integer.valueOf((int) Place.TYPE_TRANSIT_STATION));
    }

    private PlaceTypes() {
    }
}
