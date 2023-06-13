package co.bird.android.model;

import android.os.Parcelable;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.wire.WireLocation;
import com.stripe.android.model.PaymentMethod;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u000208H\u0016J\n\u00109\u001a\u0004\u0018\u00010:H&J\n\u0010;\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>H\u0016J\u0014\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0@H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0012\u0010\u0018\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0016\u0010 \u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0014\u0010\"\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u0012\u0010$\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\rR\u0012\u0010(\u001a\u00020)X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0012\u0010,\u001a\u00020-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0012\u00100\u001a\u00020-X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0012\u00102\u001a\u00020-X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0012\u00104\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0005¨\u0006A"}, m28432d2 = {"Lco/bird/android/model/ReleaseLocationDetails;", "Landroid/os/Parcelable;", "active", "", "getActive", "()Z", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "brandNames", "", "getBrandNames", "()Ljava/util/List;", "capacity", "", "getCapacity", "()I", "claimedBy", "getClaimedBy", "enforceReleaseWindow", "getEnforceReleaseWindow", "hours", "getHours", "id", "getId", "location", "Lco/bird/android/model/wire/WireLocation;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "mustClaimToRelease", "getMustClaimToRelease", "nestId", "getNestId", "notes", "getNotes", "open", "getOpen", "photos", "getPhotos", "purpose", "Lco/bird/android/model/constant/NestPurpose;", "getPurpose", "()Lco/bird/android/model/constant/NestPurpose;", "radius", "", "getRadius", "()D", "releaseWindowEndHour", "getReleaseWindowEndHour", "releaseWindowStartHour", "getReleaseWindowStartHour", "requireReleasePhoto", "getRequireReleasePhoto", "canReleaseNow", "calendar", "Ljava/util/Calendar;", "expiresAt", "Lorg/joda/time/DateTime;", "getBrandNameToDisplay", "isClaimed", "by", "Lco/bird/android/model/User;", "releaseWindow", "Lkotlin/Pair;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public interface ReleaseLocationDetails extends Parcelable {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static boolean canReleaseNow(ReleaseLocationDetails releaseLocationDetails, Calendar calendar) {
            boolean z;
            Intrinsics.checkNotNullParameter(calendar, "calendar");
            if (!releaseLocationDetails.getEnforceReleaseWindow()) {
                return true;
            }
            int hour = ReleaseLocationDetailsKt.hour(calendar);
            Pair<Integer, Integer> releaseWindow = releaseLocationDetails.releaseWindow();
            int intValue = releaseWindow.component1().intValue();
            int intValue2 = releaseWindow.component2().intValue();
            if (intValue < intValue2) {
                if (intValue <= hour && hour <= intValue2 - 1) {
                    return true;
                }
            } else {
                if (intValue2 <= hour && hour <= intValue - 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ boolean canReleaseNow$default(ReleaseLocationDetails releaseLocationDetails, Calendar calendar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    calendar = Calendar.getInstance();
                    Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
                }
                return releaseLocationDetails.canReleaseNow(calendar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canReleaseNow");
        }

        public static String getBrandNameToDisplay(ReleaseLocationDetails releaseLocationDetails) {
            Object first;
            List<String> brandNames = releaseLocationDetails.getBrandNames();
            if (brandNames != null && brandNames.size() == 1) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) brandNames);
                return (String) first;
            }
            return null;
        }

        public static String getNestId(ReleaseLocationDetails releaseLocationDetails) {
            return null;
        }

        public static boolean isClaimed(ReleaseLocationDetails releaseLocationDetails, User by) {
            Intrinsics.checkNotNullParameter(by, "by");
            return Intrinsics.areEqual(releaseLocationDetails.getClaimedBy(), by.getId());
        }

        public static Pair<Integer, Integer> releaseWindow(ReleaseLocationDetails releaseLocationDetails) {
            return new Pair<>(Integer.valueOf((int) releaseLocationDetails.getReleaseWindowStartHour()), Integer.valueOf((int) releaseLocationDetails.getReleaseWindowEndHour()));
        }
    }

    boolean canReleaseNow(Calendar calendar);

    DateTime expiresAt();

    boolean getActive();

    String getAddress();

    String getBrandNameToDisplay();

    List<String> getBrandNames();

    int getCapacity();

    String getClaimedBy();

    boolean getEnforceReleaseWindow();

    String getHours();

    String getId();

    WireLocation getLocation();

    boolean getMustClaimToRelease();

    String getNestId();

    String getNotes();

    boolean getOpen();

    List<String> getPhotos();

    NestPurpose getPurpose();

    double getRadius();

    double getReleaseWindowEndHour();

    double getReleaseWindowStartHour();

    boolean getRequireReleasePhoto();

    boolean isClaimed(User user);

    Pair<Integer, Integer> releaseWindow();
}
