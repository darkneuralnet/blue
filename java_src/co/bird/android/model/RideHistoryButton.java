package co.bird.android.model;

import android.graphics.drawable.Drawable;
import co.bird.android.model.persistence.Bird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/RideHistoryButton;", "Lco/bird/android/model/DrawableFlightSheetButton;", Entry.TYPE_TEXT, "", "drawableStart", "Landroid/graphics/drawable/Drawable;", "drawableBottom", "drawableEnd", "drawableTop", "bird", "Lco/bird/android/model/persistence/Bird;", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lco/bird/android/model/persistence/Bird;)V", "getBird", "()Lco/bird/android/model/persistence/Bird;", "getDrawableBottom", "()Landroid/graphics/drawable/Drawable;", "getDrawableEnd", "getDrawableStart", "getDrawableTop", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideHistoryButton extends DrawableFlightSheetButton {
    private final Bird bird;
    private final Drawable drawableBottom;
    private final Drawable drawableEnd;
    private final Drawable drawableStart;
    private final Drawable drawableTop;
    private final String text;

    public /* synthetic */ RideHistoryButton(String str, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Bird bird, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? null : drawable2, (i & 8) != 0 ? null : drawable3, (i & 16) != 0 ? null : drawable4, bird);
    }

    public static /* synthetic */ RideHistoryButton copy$default(RideHistoryButton rideHistoryButton, String str, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Bird bird, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rideHistoryButton.text;
        }
        if ((i & 2) != 0) {
            drawable = rideHistoryButton.drawableStart;
        }
        Drawable drawable5 = drawable;
        if ((i & 4) != 0) {
            drawable2 = rideHistoryButton.drawableBottom;
        }
        Drawable drawable6 = drawable2;
        if ((i & 8) != 0) {
            drawable3 = rideHistoryButton.drawableEnd;
        }
        Drawable drawable7 = drawable3;
        if ((i & 16) != 0) {
            drawable4 = rideHistoryButton.drawableTop;
        }
        Drawable drawable8 = drawable4;
        if ((i & 32) != 0) {
            bird = rideHistoryButton.bird;
        }
        return rideHistoryButton.copy(str, drawable5, drawable6, drawable7, drawable8, bird);
    }

    public final String component1() {
        return this.text;
    }

    public final Drawable component2() {
        return this.drawableStart;
    }

    public final Drawable component3() {
        return this.drawableBottom;
    }

    public final Drawable component4() {
        return this.drawableEnd;
    }

    public final Drawable component5() {
        return this.drawableTop;
    }

    public final Bird component6() {
        return this.bird;
    }

    public final RideHistoryButton copy(String text, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Bird bird) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new RideHistoryButton(text, drawable, drawable2, drawable3, drawable4, bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideHistoryButton) {
            RideHistoryButton rideHistoryButton = (RideHistoryButton) obj;
            return Intrinsics.areEqual(this.text, rideHistoryButton.text) && Intrinsics.areEqual(this.drawableStart, rideHistoryButton.drawableStart) && Intrinsics.areEqual(this.drawableBottom, rideHistoryButton.drawableBottom) && Intrinsics.areEqual(this.drawableEnd, rideHistoryButton.drawableEnd) && Intrinsics.areEqual(this.drawableTop, rideHistoryButton.drawableTop) && Intrinsics.areEqual(this.bird, rideHistoryButton.bird);
        }
        return false;
    }

    public final Bird getBird() {
        return this.bird;
    }

    @Override // co.bird.android.model.DrawableFlightSheetButton
    public Drawable getDrawableBottom() {
        return this.drawableBottom;
    }

    @Override // co.bird.android.model.DrawableFlightSheetButton
    public Drawable getDrawableEnd() {
        return this.drawableEnd;
    }

    @Override // co.bird.android.model.DrawableFlightSheetButton
    public Drawable getDrawableStart() {
        return this.drawableStart;
    }

    @Override // co.bird.android.model.DrawableFlightSheetButton
    public Drawable getDrawableTop() {
        return this.drawableTop;
    }

    @Override // co.bird.android.model.FlightSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Drawable drawable = this.drawableStart;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.drawableBottom;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.drawableEnd;
        int hashCode4 = (hashCode3 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Drawable drawable4 = this.drawableTop;
        return ((hashCode4 + (drawable4 != null ? drawable4.hashCode() : 0)) * 31) + this.bird.hashCode();
    }

    public String toString() {
        String str = this.text;
        Drawable drawable = this.drawableStart;
        Drawable drawable2 = this.drawableBottom;
        Drawable drawable3 = this.drawableEnd;
        Drawable drawable4 = this.drawableTop;
        Bird bird = this.bird;
        return "RideHistoryButton(text=" + str + ", drawableStart=" + drawable + ", drawableBottom=" + drawable2 + ", drawableEnd=" + drawable3 + ", drawableTop=" + drawable4 + ", bird=" + bird + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideHistoryButton(String text, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Bird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.text = text;
        this.drawableStart = drawable;
        this.drawableBottom = drawable2;
        this.drawableEnd = drawable3;
        this.drawableTop = drawable4;
        this.bird = bird;
    }
}
