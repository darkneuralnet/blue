package co.bird.android.model;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002¨\u0006\b"}, m28432d2 = {"expired", "", "Lco/bird/android/model/Deal;", "expiredOrTimedOut", "notExpired", "remainingSeconds", "", "shouldShowAgain", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DealKt {
    public static final boolean expired(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "<this>");
        DateTime expiresAt = deal.getExpiresAt();
        if (expiresAt == null || DateTime.now().compareTo((ReadableInstant) expiresAt) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean expiredOrTimedOut(Deal deal) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(deal, "<this>");
        DateTime expiresAt = deal.getExpiresAt();
        if (expiresAt != null && expiresAt.compareTo((ReadableInstant) DateTime.now()) < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        DateTime shownAt = deal.getShownAt();
        if (shownAt != null) {
            z2 = shownAt.plus(TimeUnit.SECONDS.toMillis(deal.getDuration())).isBeforeNow();
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public static final boolean notExpired(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "<this>");
        DateTime expiresAt = deal.getExpiresAt();
        if (expiresAt == null || DateTime.now().plus(TimeUnit.SECONDS.toMillis(deal.getDuration())).compareTo((ReadableInstant) expiresAt) <= 0) {
            return true;
        }
        return false;
    }

    public static final int remainingSeconds(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "<this>");
        DateTime shownAt = deal.getShownAt();
        if (shownAt != null) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(shownAt.plus(TimeUnit.SECONDS.toMillis(deal.getDuration())).getMillis() - DateTime.now().getMillis());
            if (seconds < 0) {
                return 0;
            }
            return seconds;
        }
        return deal.getDuration();
    }

    public static final boolean shouldShowAgain(Deal deal) {
        DateTime plus;
        Intrinsics.checkNotNullParameter(deal, "<this>");
        DateTime shownAt = deal.getShownAt();
        if (shownAt != null && (plus = shownAt.plus(TimeUnit.SECONDS.toMillis(deal.getDuration()))) != null) {
            return plus.isAfterNow();
        }
        return false;
    }
}
