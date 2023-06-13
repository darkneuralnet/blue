package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@ShowFirstParty
/* loaded from: classes6.dex */
public abstract class zzb extends AbstractSafeParcelable {
    public static <E> List<E> zzb(Collection<E> collection) {
        if (collection != null && !collection.isEmpty()) {
            return new ArrayList(collection);
        }
        return Collections.emptyList();
    }

    public abstract Set<String> getPlaceIds();

    public boolean isRestrictedToPlacesOpenNow() {
        return false;
    }

    public static <E> Set<E> zzb(List<E> list) {
        if (list != null && !list.isEmpty()) {
            return Collections.unmodifiableSet(new HashSet(list));
        }
        return Collections.emptySet();
    }
}
