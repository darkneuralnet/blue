package co.bird.android.model;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u0082\u0001\u0001\r¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/DrawableFlightSheetButton;", "Lco/bird/android/model/FlightSheetButton;", "()V", "drawableBottom", "Landroid/graphics/drawable/Drawable;", "getDrawableBottom", "()Landroid/graphics/drawable/Drawable;", "drawableEnd", "getDrawableEnd", "drawableStart", "getDrawableStart", "drawableTop", "getDrawableTop", "Lco/bird/android/model/RideHistoryButton;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class DrawableFlightSheetButton extends FlightSheetButton {
    public /* synthetic */ DrawableFlightSheetButton(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Drawable getDrawableBottom();

    public abstract Drawable getDrawableEnd();

    public abstract Drawable getDrawableStart();

    public abstract Drawable getDrawableTop();

    private DrawableFlightSheetButton() {
        super(null);
    }
}
