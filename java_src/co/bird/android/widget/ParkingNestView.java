package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.wire.WireNestPhoto;
import co.bird.android.widget.ParkingNestView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001c\u0010 B#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001c\u0010#J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R;\u0010\u0019\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00120\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m28432d2 = {"Lco/bird/android/widget/ParkingNestView;", "Landroidx/cardview/widget/CardView;", "Lco/bird/android/model/ParkingNest;", "nest", "", "distance", "", "setParkingNest", "", "show", "t", "LCs6;", "k", "LCs6;", "binding", "l", "Lco/bird/android/model/ParkingNest;", "parkingNest", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/Observable;", "getMapArNestClicks", "()Lio/reactivex/Observable;", "mapArNestClicks", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ParkingNestView extends CardView {

    /* renamed from: k */
    public final C32249Cs6 f67445k;

    /* renamed from: l */
    public ParkingNest f67446l;

    /* renamed from: m */
    public final Observable<String> f67447m;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ParkingNestView$a */
    /* loaded from: classes4.dex */
    public static final class C16549a extends Lambda implements Function1<Unit, String> {
        public C16549a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ParkingNest parkingNest = ParkingNestView.this.f67446l;
            if (parkingNest == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parkingNest");
                parkingNest = null;
            }
            return parkingNest.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkingNestView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32249Cs6 m111382c = C32249Cs6.m111382c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m111382c, "inflate(context.layoutInflater, this, true)");
        this.f67445k = m111382c;
        Button button = m111382c.f4841f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.mapArNestButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C16549a c16549a = new C16549a();
        this.f67447m = clicksThrottle$default.map(new InterfaceC23492o() { // from class: nG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m54510s;
                m54510s = ParkingNestView.m54510s(Function1.this, obj);
                return m54510s;
            }
        });
    }

    /* renamed from: s */
    public static final String m54510s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    public final void setParkingNest(ParkingNest nest, float f) {
        int i;
        boolean z;
        Object firstOrNull;
        int i2;
        Intrinsics.checkNotNullParameter(nest, "nest");
        setCardBackgroundColor(getResources().getColor(C32364Df4.birdWhite));
        this.f67446l = nest;
        this.f67445k.f4844i.setText(nest.getAddress());
        this.f67445k.f4842g.setText(nest.getNotes());
        Button button = this.f67445k.f4839d;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        button.setText(C51916xx1.distance$default(c51916xx1, context, f, 0.0d, false, 12, null));
        Integer availableParkingCapacity = nest.getAvailableParkingCapacity();
        TextView textView = this.f67445k.f4837b;
        Context context2 = getContext();
        int i3 = C45871nl4.x_parking_spots;
        boolean z2 = true;
        Object[] objArr = new Object[1];
        if (availableParkingCapacity != null) {
            i = availableParkingCapacity.intValue();
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        textView.setText(context2.getString(i3, objArr));
        TextView textView2 = this.f67445k.f4837b;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.capacityTextView");
        if (availableParkingCapacity != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView2, z, 0, 2, null);
        Button button2 = this.f67445k.f4843h;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.showNearestParkingButton");
        if (availableParkingCapacity == null || availableParkingCapacity.intValue() != 0) {
            z2 = false;
        }
        C49520tu6.show$default(button2, z2, 0, 2, null);
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) nest.getPhotos());
        WireNestPhoto wireNestPhoto = (WireNestPhoto) firstOrNull;
        if (wireNestPhoto != null) {
            ComponentCallbacks2C17096a.m53138t(getContext()).m81653k(wireNestPhoto.getUrl()).m16096R0(this.f67445k.f4840e);
        } else {
            Integer availableParkingCapacity2 = nest.getAvailableParkingCapacity();
            if (availableParkingCapacity2 != null && availableParkingCapacity2.intValue() == 0) {
                i2 = C48193rg4.marker_parking_unavailable_selected;
            } else {
                i2 = C48193rg4.marker_parking_selected;
            }
            ComponentCallbacks2C17096a.m53138t(getContext()).m81654j(Integer.valueOf(i2)).m16096R0(this.f67445k.f4840e);
        }
        C49520tu6.m11233r(this);
    }

    /* renamed from: t */
    public final void m54509t(boolean z) {
        Button button = this.f67445k.f4841f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.mapArNestButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkingNestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32249Cs6 m111382c = C32249Cs6.m111382c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m111382c, "inflate(context.layoutInflater, this, true)");
        this.f67445k = m111382c;
        Button button = m111382c.f4841f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.mapArNestButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C16549a c16549a = new C16549a();
        this.f67447m = clicksThrottle$default.map(new InterfaceC23492o() { // from class: nG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m54510s;
                m54510s = ParkingNestView.m54510s(Function1.this, obj);
                return m54510s;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkingNestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32249Cs6 m111382c = C32249Cs6.m111382c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m111382c, "inflate(context.layoutInflater, this, true)");
        this.f67445k = m111382c;
        Button button = m111382c.f4841f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.mapArNestButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C16549a c16549a = new C16549a();
        this.f67447m = clicksThrottle$default.map(new InterfaceC23492o() { // from class: nG3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m54510s;
                m54510s = ParkingNestView.m54510s(Function1.this, obj);
                return m54510s;
            }
        });
    }
}
