package co.bird.android.model;

import co.bird.android.model.persistence.common.ConstantsKt;
import co.bird.android.model.wire.WireBannerStep;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0013\b\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0003H\u0017J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/Banner;", "", Entry.TYPE_TEXT, "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "backgroundColor", "customView", "icon", "textColor", "HOW_TO_RIDE", "PERSONAL_RENTALS", "CONNECTIVITY", "DEAL", ConstantsKt.NONE, "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum Banner {
    HOW_TO_RIDE(Integer.valueOf(C45871nl4.banner_how_to_ride)),
    PERSONAL_RENTALS(Integer.valueOf(C45871nl4.long_term_rental_banner)),
    CONNECTIVITY { // from class: co.bird.android.model.Banner.CONNECTIVITY
        @Override // co.bird.android.model.Banner
        public int backgroundColor() {
            return C32364Df4.warning;
        }

        @Override // co.bird.android.model.Banner
        public Integer icon() {
            return Integer.valueOf(C48193rg4.ic_warning);
        }

        @Override // co.bird.android.model.Banner
        public int textColor() {
            return C32364Df4.black;
        }
    },
    DEAL(null, 1, null),
    NONE(Integer.valueOf(C46464ol4.empty));
    
    public static final Companion Companion = new Companion(null);
    private final Integer text;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/Banner$Companion;", "", "()V", "from", "Lco/bird/android/model/Banner;", "step", "Lco/bird/android/model/wire/WireBannerStep;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Banner from(WireBannerStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            String banner = step.getBanner();
            if (Intrinsics.areEqual(banner, "how_to_ride")) {
                return Banner.HOW_TO_RIDE;
            }
            if (Intrinsics.areEqual(banner, "personal_rentals")) {
                return Banner.PERSONAL_RENTALS;
            }
            return Banner.NONE;
        }

        private Companion() {
        }
    }

    /* synthetic */ Banner(Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(num);
    }

    public int backgroundColor() {
        return C32364Df4.colorAccent;
    }

    public Integer customView() {
        return null;
    }

    public final Integer getText() {
        return this.text;
    }

    public Integer icon() {
        return null;
    }

    public int textColor() {
        return C32364Df4.white;
    }

    Banner(Integer num) {
        this.text = num;
    }

    /* synthetic */ Banner(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
