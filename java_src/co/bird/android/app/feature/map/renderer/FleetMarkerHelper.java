package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.renderer.FleetMarkerHelper;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.widget.FleetMarkerPin;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\rJ*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00020\u0014*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;", "", "Lfs6;", "Lco/bird/android/model/persistence/FleetMarker;", "marker", "Landroid/graphics/PointF;", "anchorPoint", "Los6;", "binding", "", "withIcon", "", "hydrateBinding", "Lkotlin/Function1;", "setAnchorPointAsync", "calculateAnchorPoint", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Landroid/util/LruCache;", "", "Landroid/graphics/drawable/Drawable;", "iconCache", "Landroid/util/LruCache;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "getIconKey", "(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;", "iconKey", "<init>", "(Landroid/content/Context;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FleetMarkerHelper {
    public static final Companion Companion = new Companion(null);
    private static final int ICON_CACHE_SIZE = 15;
    private static final Set<Integer> STANDARD_PIN_COLOR_PROMINENCES;
    private static final IntRange STANDARD_PIN_STYLE_PROMINENCES;
    private final Context context;
    private final LruCache<String, Drawable> iconCache;
    private final Handler uiHandler;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper$Companion;", "", "()V", "ICON_CACHE_SIZE", "", "STANDARD_PIN_COLOR_PROMINENCES", "", "STANDARD_PIN_STYLE_PROMINENCES", "Lkotlin/ranges/IntRange;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{0, 2});
        STANDARD_PIN_COLOR_PROMINENCES = of;
        STANDARD_PIN_STYLE_PROMINENCES = new IntRange(0, 1);
    }

    public FleetMarkerHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.iconCache = new LruCache<>(15);
        this.uiHandler = new Handler(Looper.getMainLooper());
    }

    private final PointF anchorPoint(C41199fs6 c41199fs6, FleetMarker fleetMarker) {
        IntRange intRange = STANDARD_PIN_STYLE_PROMINENCES;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        int prominence = fleetMarker.getProminence();
        boolean z = false;
        if (first <= prominence && prominence <= last) {
            z = true;
        }
        if (z) {
            return new PointF(0.5f, c41199fs6.f80984c.getBottom() / c41199fs6.getRoot().getMeasuredHeight());
        }
        return new PointF(0.5f, (c41199fs6.f80984c.getMeasuredHeight() / 2.0f) / c41199fs6.getRoot().getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateAnchorPoint$lambda$1(Function1 setAnchorPointAsync, FleetMarkerHelper this$0, C41199fs6 binding, FleetMarker marker) {
        Intrinsics.checkNotNullParameter(setAnchorPointAsync, "$setAnchorPointAsync");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(marker, "$marker");
        setAnchorPointAsync.invoke(this$0.anchorPoint(binding, marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateAnchorPoint$lambda$2(Function1 setAnchorPointAsync, FleetMarkerHelper this$0, C46536os6 binding, FleetMarker marker) {
        Intrinsics.checkNotNullParameter(setAnchorPointAsync, "$setAnchorPointAsync");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(marker, "$marker");
        setAnchorPointAsync.invoke(this$0.anchorPoint(binding, marker));
    }

    private final String getIconKey(FleetMarker fleetMarker) {
        return fleetMarker.getFleetIcon().name();
    }

    public final void calculateAnchorPoint(final C41199fs6 binding, final FleetMarker marker, final Function1<? super PointF, Unit> setAnchorPointAsync) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(setAnchorPointAsync, "setAnchorPointAsync");
        if (binding.f80984c.getMeasuredHeight() > 0) {
            setAnchorPointAsync.invoke(anchorPoint(binding, marker));
        } else {
            this.uiHandler.post(new Runnable() { // from class: ip1
                @Override // java.lang.Runnable
                public final void run() {
                    FleetMarkerHelper.calculateAnchorPoint$lambda$1(Function1.this, this, binding, marker);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void hydrateBinding(C41199fs6 binding, FleetMarker marker, boolean z) {
        FleetMarkerPin.EnumC16508b enumC16508b;
        int lightMode;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (marker.getFleetIcon() == ClientIcon.UNKNOWN) {
            binding.f80984c.setPinStyle(FleetMarkerPin.EnumC16508b.STANDARD);
            binding.f80984c.setColor(marker.getStandardPinColor().getLightMode());
            binding.f80983b.setImageDrawable((Drawable) C50896wE2.m7192a(this.iconCache, getIconKey(marker), new FleetMarkerHelper$hydrateBinding$1(this)));
            return;
        }
        FleetMarkerPin fleetMarkerPin = binding.f80984c;
        IntRange intRange = STANDARD_PIN_STYLE_PROMINENCES;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        int prominence = marker.getProminence();
        boolean z2 = true;
        if (first <= prominence && prominence <= last) {
            enumC16508b = FleetMarkerPin.EnumC16508b.STANDARD;
        } else {
            enumC16508b = FleetMarkerPin.EnumC16508b.SMALL;
        }
        fleetMarkerPin.setPinStyle(enumC16508b);
        binding.f80984c.setPinShape(marker.getShape());
        FleetMarkerPin fleetMarkerPin2 = binding.f80984c;
        if (STANDARD_PIN_COLOR_PROMINENCES.contains(Integer.valueOf(marker.getProminence()))) {
            lightMode = marker.getStandardPinColor().getLightMode();
        } else {
            lightMode = marker.getBackgroundPinColor().getLightMode();
        }
        fleetMarkerPin2.setColor(lightMode);
        if (z) {
            int first2 = intRange.getFirst();
            int last2 = intRange.getLast();
            int prominence2 = marker.getProminence();
            if (first2 > prominence2 || prominence2 > last2) {
                z2 = false;
            }
            if (z2) {
                binding.f80983b.setImageDrawable((Drawable) C50896wE2.m7192a(this.iconCache, getIconKey(marker), new FleetMarkerHelper$hydrateBinding$2(marker, this)));
                binding.f80983b.setImageTintList(ColorStateList.valueOf(marker.getIconColor().getLightMode()));
                ConstraintLayout root = binding.getRoot();
                Double opacity = marker.getOpacity();
                root.setAlpha(opacity == null ? (float) opacity.doubleValue() : 1.0f);
            }
        }
        binding.f80983b.setImageDrawable(null);
        ConstraintLayout root2 = binding.getRoot();
        Double opacity2 = marker.getOpacity();
        root2.setAlpha(opacity2 == null ? (float) opacity2.doubleValue() : 1.0f);
    }

    public final void calculateAnchorPoint(final C46536os6 binding, final FleetMarker marker, final Function1<? super PointF, Unit> setAnchorPointAsync) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(setAnchorPointAsync, "setAnchorPointAsync");
        if (binding.f102692d.getMeasuredHeight() > 0) {
            setAnchorPointAsync.invoke(anchorPoint(binding, marker));
        } else {
            this.uiHandler.post(new Runnable() { // from class: hp1
                @Override // java.lang.Runnable
                public final void run() {
                    FleetMarkerHelper.calculateAnchorPoint$lambda$2(Function1.this, this, binding, marker);
                }
            });
        }
    }

    private final PointF anchorPoint(C46536os6 c46536os6, FleetMarker fleetMarker) {
        IntRange intRange = STANDARD_PIN_STYLE_PROMINENCES;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        int prominence = fleetMarker.getProminence();
        boolean z = false;
        if (first <= prominence && prominence <= last) {
            z = true;
        }
        if (z) {
            return new PointF(0.5f, c46536os6.f102692d.getBottom() / c46536os6.getRoot().getMeasuredHeight());
        }
        return new PointF(0.5f, (c46536os6.f102692d.getMeasuredHeight() / 2.0f) / c46536os6.getRoot().getMeasuredHeight());
    }

    public final void hydrateBinding(C46536os6 binding, FleetMarker marker) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(marker, "marker");
        binding.f102692d.setOutlineColor(marker.getStandardPinColor().getLightMode());
        binding.f102690b.setBackgroundTintList(ColorStateList.valueOf(marker.getStandardPinColor().getLightMode()));
        binding.f102690b.setImageTintList(ColorStateList.valueOf(marker.getIconColor().getLightMode()));
        binding.f102690b.setImageDrawable((Drawable) C50896wE2.m7192a(this.iconCache, getIconKey(marker), new FleetMarkerHelper$hydrateBinding$4(marker, this)));
        binding.f102691c.setText(marker.getLabel());
        ConstraintLayout root = binding.getRoot();
        Double opacity = marker.getOpacity();
        root.setAlpha(opacity != null ? (float) opacity.doubleValue() : 1.0f);
    }
}
