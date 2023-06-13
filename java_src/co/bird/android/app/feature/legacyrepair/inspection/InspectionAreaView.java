package co.bird.android.app.feature.legacyrepair.inspection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.legacyrepair.inspection.InspectionAreaView;
import co.bird.android.model.BirdInspectionPoint;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006."}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;", "Landroid/widget/RelativeLayout;", "", "Lco/bird/android/model/BirdInspectionPoint;", "points", "", "setInspectionPoints", "Lu22;", "", "f", "g", "point", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/BirdInspectionPoint;)V", "Landroid/widget/CheckBox;", "checkBox", "inspectionPoint", "Lio/reactivex/subjects/a;", "checkBoxObservable", "h", "(Landroid/widget/CheckBox;Lco/bird/android/model/BirdInspectionPoint;Lio/reactivex/subjects/a;)V", "", "b", "I", "previous", "", "c", "Ljava/util/List;", "checkBoxChangesList", "checkBoxList", "", "e", "Ljava/util/Map;", "checkBoxToInspectionPointMap", "checkedInspectionPointList", "Lur6;", "Lur6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionAreaView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionAreaView.kt\nco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,137:1\n180#2:138\n180#2:139\n*S KotlinDebug\n*F\n+ 1 InspectionAreaView.kt\nco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView\n*L\n69#1:138\n112#1:139\n*E\n"})
/* loaded from: classes2.dex */
public final class InspectionAreaView extends RelativeLayout {

    /* renamed from: h */
    public static final C13756a f61476h = new C13756a(null);

    /* renamed from: i */
    public static final int f61477i = 8;

    /* renamed from: b */
    public int f61478b;

    /* renamed from: c */
    public final List<C24552a<Boolean>> f61479c;

    /* renamed from: d */
    public final List<CheckBox> f61480d;

    /* renamed from: e */
    public final Map<CheckBox, BirdInspectionPoint> f61481e;

    /* renamed from: f */
    public final List<BirdInspectionPoint> f61482f;

    /* renamed from: g */
    public final C50083ur6 f61483g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView$a;", "", "", "PADDING_DP", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.legacyrepair.inspection.InspectionAreaView$a */
    /* loaded from: classes2.dex */
    public static final class C13756a {
        public /* synthetic */ C13756a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13756a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.legacyrepair.inspection.InspectionAreaView$b */
    /* loaded from: classes2.dex */
    public static final class C13757b extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ CheckBox f61484g;

        /* renamed from: h */
        public final /* synthetic */ InspectionAreaView f61485h;

        /* renamed from: i */
        public final /* synthetic */ C24552a<Boolean> f61486i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13757b(CheckBox checkBox, InspectionAreaView inspectionAreaView, C24552a<Boolean> c24552a) {
            super(1);
            this.f61484g = checkBox;
            this.f61485h = inspectionAreaView;
            this.f61486i = c24552a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                this.f61484g.setTextColor(this.f61485h.getResources().getColor(C32364Df4.mechanicRed));
            } else {
                this.f61484g.setTextColor(this.f61485h.getResources().getColor(C32364Df4.mechanicBlack));
            }
            this.f61486i.onNext(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "isCheckedChangesList", "", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.legacyrepair.inspection.InspectionAreaView$c */
    /* loaded from: classes2.dex */
    public static final class C13758c extends Lambda implements Function1<Object[], Boolean> {

        /* renamed from: g */
        public static final C13758c f61487g = new C13758c();

        public C13758c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object[] isCheckedChangesList) {
            Intrinsics.checkNotNullParameter(isCheckedChangesList, "isCheckedChangesList");
            boolean z = false;
            for (Object obj : isCheckedChangesList) {
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.legacyrepair.inspection.InspectionAreaView$d */
    /* loaded from: classes2.dex */
    public static final class C13759d extends Lambda implements Function1<Boolean, Unit> {
        public C13759d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            CheckBox checkBox = InspectionAreaView.this.f61483g.f113100b;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            checkBox.setChecked(it.booleanValue());
            if (it.booleanValue()) {
                InspectionAreaView.this.f61483g.f113100b.setTextColor(InspectionAreaView.this.getResources().getColor(C32364Df4.mechanicRed));
            } else {
                InspectionAreaView.this.f61483g.f113100b.setTextColor(InspectionAreaView.this.getResources().getColor(C32364Df4.mechanicBlack));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InspectionAreaView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: e */
    public static final void m60627e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final Boolean m60623i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m60622j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m60628d(BirdInspectionPoint point) {
        Intrinsics.checkNotNullParameter(point, "point");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.f61478b);
        layoutParams.setMargins(C49520tu6.m11247d(this, 30), C49520tu6.m11247d(this, 5), C49520tu6.m11247d(this, 5), C49520tu6.m11247d(this, 5));
        CheckBox checkBox = new CheckBox(getContext());
        checkBox.setText(point.getItem());
        checkBox.setId(View.generateViewId());
        checkBox.setTextSize(16.0f);
        checkBox.setPadding(checkBox.getPaddingLeft() + ((int) getResources().getDimension(C37044Xf4.mechanic_checkbox_padding)), 0, 0, 0);
        checkBox.setButtonDrawable(C49785uM4.m10397f(getResources(), C52342yg4.mechanic_checkbox_selector, null));
        Boolean bool = Boolean.FALSE;
        C24552a<Boolean> m31921g = C24552a.m31921g(bool);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(false)");
        Observable<Boolean> startWith = C34228Le5.m96513a(checkBox).startWith((AbstractC49595u22<Boolean>) bool);
        Intrinsics.checkNotNullExpressionValue(startWith, "checkBox.checkedChanges()\n      .startWith(false)");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = startWith.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13757b c13757b = new C13757b(checkBox, this, m31921g);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: N32
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                InspectionAreaView.m60627e(Function1.this, obj);
            }
        });
        addView(checkBox, layoutParams);
        m60624h(checkBox, point, m31921g);
    }

    /* renamed from: f */
    public final AbstractC49595u22<Boolean> m60626f() {
        CheckBox checkBox = this.f61483g.f113100b;
        Intrinsics.checkNotNullExpressionValue(checkBox, "binding.type");
        return C34228Le5.m96513a(checkBox);
    }

    /* renamed from: g */
    public final List<BirdInspectionPoint> m60625g() {
        BirdInspectionPoint birdInspectionPoint;
        for (CheckBox checkBox : this.f61480d) {
            if (checkBox.isChecked() && (birdInspectionPoint = this.f61481e.get(checkBox)) != null) {
                this.f61482f.add(birdInspectionPoint);
            }
        }
        return this.f61482f;
    }

    /* renamed from: h */
    public final void m60624h(CheckBox checkBox, BirdInspectionPoint inspectionPoint, C24552a<Boolean> checkBoxObservable) {
        Intrinsics.checkNotNullParameter(checkBox, "checkBox");
        Intrinsics.checkNotNullParameter(inspectionPoint, "inspectionPoint");
        Intrinsics.checkNotNullParameter(checkBoxObservable, "checkBoxObservable");
        this.f61478b = checkBox.getId();
        this.f61480d.add(checkBox);
        this.f61481e.put(checkBox, inspectionPoint);
        this.f61479c.add(checkBoxObservable);
    }

    public final void setInspectionPoints(List<BirdInspectionPoint> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f61483g.f113100b.setText(points.get(0).getArea());
        this.f61483g.f113100b.setEnabled(false);
        this.f61483g.f113100b.setTextColor(getResources().getColor(C32364Df4.mechanicBlack));
        for (BirdInspectionPoint birdInspectionPoint : points) {
            m60628d(birdInspectionPoint);
        }
        final C13758c c13758c = C13758c.f61487g;
        Observable startWith = Observable.combineLatest(this.f61479c, new InterfaceC23492o() { // from class: L32
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m60623i;
                m60623i = InspectionAreaView.m60623i(Function1.this, obj);
                return m60623i;
            }
        }).startWith((Observable) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(startWith, "combineLatest(\n      che…lt\n    }.startWith(false)");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = startWith.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13759d c13759d = new C13759d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: M32
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                InspectionAreaView.m60622j(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InspectionAreaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InspectionAreaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InspectionAreaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61478b = C36585Vg4.type;
        this.f61479c = new ArrayList();
        this.f61480d = new ArrayList();
        this.f61481e = new LinkedHashMap();
        this.f61482f = new ArrayList();
        C50083ur6 m9648b = C50083ur6.m9648b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m9648b, "inflate(context.layoutInflater, this)");
        this.f61483g = m9648b;
        m9648b.getRoot().setPaddingRelative((int) C49347td3.m12001b(10), (int) C49347td3.m12001b(10), (int) C49347td3.m12001b(10), (int) C49347td3.m12001b(10));
    }
}
