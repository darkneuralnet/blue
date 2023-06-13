package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.Place;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0004"}, m28432d2 = {"Lcom/google/android/libraries/places/api/model/Place;", "Lcom/google/android/libraries/places/api/model/AddressComponent;", "b", C17296a.f69688o, "locals-survey_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/localssurvey/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,8:1\n288#2,2:9\n288#2,2:11\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/localssurvey/ExtensionsKt\n*L\n6#1:9,2\n7#1:11,2\n*E\n"})
/* renamed from: Li1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34260Li1 {
    /* renamed from: a */
    public static final AddressComponent m96428a(Place place) {
        List<AddressComponent> asList;
        Intrinsics.checkNotNullParameter(place, "<this>");
        AddressComponents addressComponents = place.getAddressComponents();
        Object obj = null;
        if (addressComponents == null || (asList = addressComponents.asList()) == null) {
            return null;
        }
        Iterator<T> it = asList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AddressComponent) next).getTypes().contains("country")) {
                obj = next;
                break;
            }
        }
        return (AddressComponent) obj;
    }

    /* renamed from: b */
    public static final AddressComponent m96427b(Place place) {
        List<AddressComponent> asList;
        Intrinsics.checkNotNullParameter(place, "<this>");
        AddressComponents addressComponents = place.getAddressComponents();
        Object obj = null;
        if (addressComponents == null || (asList = addressComponents.asList()) == null) {
            return null;
        }
        Iterator<T> it = asList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AddressComponent) next).getTypes().contains("postal_code")) {
                obj = next;
                break;
            }
        }
        return (AddressComponent) obj;
    }
}
