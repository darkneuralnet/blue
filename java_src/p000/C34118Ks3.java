package p000;

import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, m28432d2 = {"", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ks3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34118Ks3 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "location", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ks3$a */
    /* loaded from: classes2.dex */
    public static final class C4607a extends Lambda implements Function1<Geolocation, CharSequence> {

        /* renamed from: g */
        public static final C4607a f20291g = new C4607a();

        public C4607a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(Geolocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            return longitude + " " + latitude;
        }
    }

    /* renamed from: a */
    public static final String m98214a(List<Geolocation> list) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(list, "<this>");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, C4607a.f20291g, 31, null);
        return "POLYGON((" + joinToString$default + "))";
    }
}
