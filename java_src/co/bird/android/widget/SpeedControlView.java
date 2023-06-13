package co.bird.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.VehicleSpeedMode;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/widget/SpeedControlView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "", "setSpeed", "Lio/reactivex/Observable;", "g", "", "notify", "e", "LFt6;", "b", "LFt6;", "binding", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "speedSelectedSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpeedControlView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeedControlView.kt\nco/bird/android/widget/SpeedControlView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1855#2,2:55\n*S KotlinDebug\n*F\n+ 1 SpeedControlView.kt\nco/bird/android/widget/SpeedControlView\n*L\n48#1:55,2\n*E\n"})
/* loaded from: classes4.dex */
public final class SpeedControlView extends ConstraintLayout {

    /* renamed from: b */
    public final C32960Ft6 f67663b;

    /* renamed from: c */
    public final C24552a<VehicleSpeedMode> f67664c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.SpeedControlView$a */
    /* loaded from: classes4.dex */
    public static final class C16582a extends Lambda implements Function1<View, Unit> {
        public C16582a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            SpeedControlView.m54379f(SpeedControlView.this, VehicleSpeedMode.SLOW, false, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.SpeedControlView$b */
    /* loaded from: classes4.dex */
    public static final class C16583b extends Lambda implements Function1<View, Unit> {
        public C16583b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            SpeedControlView.m54379f(SpeedControlView.this, VehicleSpeedMode.MED, false, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.SpeedControlView$c */
    /* loaded from: classes4.dex */
    public static final class C16584c extends Lambda implements Function1<View, Unit> {
        public C16584c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            SpeedControlView.m54379f(SpeedControlView.this, VehicleSpeedMode.FAST, false, 2, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.SpeedControlView$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16585d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VehicleSpeedMode.values().length];
            try {
                iArr[VehicleSpeedMode.SLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VehicleSpeedMode.MED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VehicleSpeedMode.FAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpeedControlView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public static /* synthetic */ void m54379f(SpeedControlView speedControlView, VehicleSpeedMode vehicleSpeedMode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        speedControlView.m54380e(vehicleSpeedMode, z);
    }

    /* renamed from: e */
    public final void m54380e(VehicleSpeedMode vehicleSpeedMode, boolean z) {
        Pair pair;
        List listOf;
        List listOf2;
        List listOf3;
        if (z) {
            this.f67664c.onNext(vehicleSpeedMode);
        }
        int i = C16585d.$EnumSwitchMapping$0[vehicleSpeedMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C32960Ft6 c32960Ft6 = this.f67663b;
                    ImageView imageView = c32960Ft6.f10455b;
                    listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{c32960Ft6.f10457d, c32960Ft6.f10456c});
                    pair = new Pair(imageView, listOf3);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                C32960Ft6 c32960Ft62 = this.f67663b;
                ImageView imageView2 = c32960Ft62.f10456c;
                listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{c32960Ft62.f10457d, c32960Ft62.f10455b});
                pair = new Pair(imageView2, listOf2);
            }
        } else {
            C32960Ft6 c32960Ft63 = this.f67663b;
            ImageView imageView3 = c32960Ft63.f10457d;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{c32960Ft63.f10456c, c32960Ft63.f10455b});
            pair = new Pair(imageView3, listOf);
        }
        ImageView imageView4 = (ImageView) pair.component1();
        imageView4.setSelected(true);
        imageView4.setImageTintList(ColorStateList.valueOf(NA0.m94301c(getContext(), C32364Df4.birdWhite)));
        for (ImageView imageView5 : (List) pair.component2()) {
            imageView5.setSelected(false);
            imageView5.setImageTintList(ColorStateList.valueOf(NA0.m94301c(getContext(), C32364Df4.birdDarkBlueGray)));
        }
    }

    /* renamed from: g */
    public final Observable<VehicleSpeedMode> m54378g() {
        Observable<VehicleSpeedMode> share = this.f67664c.share();
        Intrinsics.checkNotNullExpressionValue(share, "speedSelectedSubject.share()");
        return share;
    }

    public final void setSpeed(VehicleSpeedMode speedMode) {
        Intrinsics.checkNotNullParameter(speedMode, "speedMode");
        m54380e(speedMode, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpeedControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SpeedControlView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpeedControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C32960Ft6 m106289b = C32960Ft6.m106289b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(m106289b, "inflate(LayoutInflater.from(context), this)");
        this.f67663b = m106289b;
        C24552a<VehicleSpeedMode> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<VehicleSpeedMode>()");
        this.f67664c = m31922e;
        setBackground(NA0.m94299e(context, C33309Hg4.frame_pill_border_charcoal));
        ImageView imageView = m106289b.f10457d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.slowMode");
        C34585Ms2.m94661j(imageView, new C16582a());
        ImageView imageView2 = m106289b.f10456c;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.medMode");
        C34585Ms2.m94661j(imageView2, new C16583b());
        ImageView imageView3 = m106289b.f10455b;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.fastMode");
        C34585Ms2.m94661j(imageView3, new C16584c());
    }
}
