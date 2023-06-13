package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.wire.WireInventoryPart;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\t0\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"LZH3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireInventoryPart;", "v", "Lco/bird/android/model/constant/HealthStatus;", "healthStatus", "", "w", "c", "Lco/bird/android/model/constant/HealthStatus;", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "partSubject", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZH3 */
/* loaded from: classes3.dex */
public final class ZH3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public HealthStatus f48171c;

    /* renamed from: d */
    public final C24558d<WireInventoryPart> f48172d;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"LZH3$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/constant/HealthStatus;", "healthStatus", "Lxe2;", "binding", C17296a.f69688o, "b", "Lxe2;", "Landroid/view/View;", "view", "<init>", "(LZH3;Landroid/view/View;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPartAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartAdapter$PartViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n18#2:106\n9#3,4:107\n13579#4:111\n13580#4:113\n13579#4,2:114\n1#5:112\n*S KotlinDebug\n*F\n+ 1 PartAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartAdapter$PartViewHolder\n*L\n53#1:106\n53#1:107,4\n82#1:111\n82#1:113\n93#1:114,2\n*E\n"})
    /* renamed from: ZH3$a */
    /* loaded from: classes3.dex */
    public final class C10220a extends C29735w1 {

        /* renamed from: b */
        public final C51727xe2 f48173b;

        /* renamed from: c */
        public final /* synthetic */ ZH3 f48174c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPartAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartAdapter$PartViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n18#2:106\n9#3,4:107\n1#4:111\n*S KotlinDebug\n*F\n+ 1 PartAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/PartAdapter$PartViewHolder$1\n*L\n48#1:106\n48#1:107,4\n*E\n"})
        /* renamed from: ZH3$a$a */
        /* loaded from: classes3.dex */
        public static final class C10221a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ZH3 f48175g;

            /* renamed from: h */
            public final /* synthetic */ C10220a f48176h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10221a(ZH3 zh3, C10220a c10220a) {
                super(1);
                this.f48175g = zh3;
                this.f48176h = c10220a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f48175g.m94545o().m109397e(this.f48176h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof WireInventoryPart)) {
                    m105816c = null;
                }
                WireInventoryPart wireInventoryPart = (WireInventoryPart) m105816c;
                if (wireInventoryPart != null) {
                    this.f48175g.f48172d.onNext(wireInventoryPart);
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ZH3$a$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10222b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HealthStatus.values().length];
                try {
                    iArr[HealthStatus.RUNNING_LOW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HealthStatus.OUT_OF_STOCK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10220a(ZH3 zh3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f48174c = zh3;
            C51727xe2 m4911a = C51727xe2.m4911a(view);
            Intrinsics.checkNotNullExpressionValue(m4911a, "bind(view)");
            this.f48173b = m4911a;
            C34585Ms2.m94661j(view, new C10221a(zh3, this));
        }

        /* renamed from: a */
        public final void m73367a(HealthStatus healthStatus, C51727xe2 c51727xe2) {
            int i;
            if (healthStatus == null) {
                i = -1;
            } else {
                i = C10222b.$EnumSwitchMapping$0[healthStatus.ordinal()];
            }
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    TextView textView = c51727xe2.f117920d;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.healthStatusLabel");
                    C49520tu6.show$default(textView, false, 0, 2, null);
                    return;
                }
                TextView showHealthStatus$lambda$9 = c51727xe2.f117920d;
                Intrinsics.checkNotNullExpressionValue(showHealthStatus$lambda$9, "showHealthStatus$lambda$9");
                C49520tu6.show$default(showHealthStatus$lambda$9, true, 0, 2, null);
                int m94301c = NA0.m94301c(showHealthStatus$lambda$9.getContext(), C32364Df4.birdRed);
                showHealthStatus$lambda$9.setText(showHealthStatus$lambda$9.getContext().getString(C45871nl4.operator_inventory_oos_label));
                showHealthStatus$lambda$9.setTextColor(m94301c);
                Drawable[] compoundDrawables = showHealthStatus$lambda$9.getCompoundDrawables();
                if (compoundDrawables != null) {
                    Intrinsics.checkNotNullExpressionValue(compoundDrawables, "compoundDrawables");
                    int length = compoundDrawables.length;
                    while (i2 < length) {
                        Drawable drawable = compoundDrawables[i2];
                        if (drawable != null) {
                            Intrinsics.checkNotNullExpressionValue(drawable, "drawable");
                            C49520tu6.m11236o(showHealthStatus$lambda$9, drawable, m94301c);
                        }
                        i2++;
                    }
                    return;
                }
                return;
            }
            TextView showHealthStatus$lambda$6 = c51727xe2.f117920d;
            Intrinsics.checkNotNullExpressionValue(showHealthStatus$lambda$6, "showHealthStatus$lambda$6");
            C49520tu6.show$default(showHealthStatus$lambda$6, true, 0, 2, null);
            int m94301c2 = NA0.m94301c(showHealthStatus$lambda$6.getContext(), C32364Df4.birdYellow);
            showHealthStatus$lambda$6.setText(showHealthStatus$lambda$6.getContext().getString(C45871nl4.operator_inventory_running_low_label));
            showHealthStatus$lambda$6.setTextColor(m94301c2);
            Drawable[] compoundDrawables2 = showHealthStatus$lambda$6.getCompoundDrawables();
            if (compoundDrawables2 != null) {
                Intrinsics.checkNotNullExpressionValue(compoundDrawables2, "compoundDrawables");
                int length2 = compoundDrawables2.length;
                while (i2 < length2) {
                    Drawable drawable2 = compoundDrawables2[i2];
                    if (drawable2 != null) {
                        Intrinsics.checkNotNullExpressionValue(drawable2, "drawable");
                        C49520tu6.m11236o(showHealthStatus$lambda$6, drawable2, m94301c2);
                    }
                    i2++;
                }
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            AbstractC33662It6<ImageView, Bitmap> abstractC33662It6;
            Object m105816c = this.f48174c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WireInventoryPart)) {
                m105816c = null;
            }
            WireInventoryPart wireInventoryPart = (WireInventoryPart) m105816c;
            if (wireInventoryPart != null) {
                ZH3 zh3 = this.f48174c;
                this.f48173b.f117923g.setText(wireInventoryPart.displayName());
                String sku = wireInventoryPart.getSku();
                if (sku != null) {
                    this.f48173b.f117922f.setText(getContext().getString(C45871nl4.operator_inventory_part_sku, sku));
                }
                String defaultImageUrl = wireInventoryPart.getDefaultImageUrl();
                if (defaultImageUrl != null) {
                    abstractC33662It6 = ComponentCallbacks2C17096a.m53137u(this.f48173b.f117921e).m81662b().m16089a1(defaultImageUrl).m16082g1(C24847jU.m30574l()).m16096R0(this.f48173b.f117921e);
                } else {
                    abstractC33662It6 = null;
                }
                if (abstractC33662It6 == null) {
                    this.f48173b.f117921e.setImageDrawable(null);
                }
                m73367a(zh3.f48171c, this.f48173b);
            }
        }
    }

    public ZH3() {
        C24558d<WireInventoryPart> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireInventoryPart>()");
        this.f48172d = m31902e;
    }

    /* renamed from: v */
    public final Observable<WireInventoryPart> m73369v() {
        Observable<WireInventoryPart> hide = this.f48172d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "partSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final void m73368w(HealthStatus healthStatus) {
        Intrinsics.checkNotNullParameter(healthStatus, "healthStatus");
        this.f48171c = healthStatus;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C52965zj4.item_part_selection ? new C10220a(this, m41761u) : new C29735w1(m41761u);
    }
}
