package co.bird.android.app.feature.legacyrepair.startrepair;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.legacyrepair.startrepair.RepairDamageView;
import co.bird.android.model.BirdInspectionPoint;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u001e¢\u0006\u0004\b3\u00104J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u001e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J&\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u00065"}, m28432d2 = {"Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;", "Landroid/widget/RelativeLayout;", "", "Lco/bird/android/model/BirdInspectionPoint;", "points", "", "setInspectionPoints", "", "key", "Lio/reactivex/subjects/a;", "", "i", "f", "g", "h", "id", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/Observable;", "k", "l", "e", "point", "first", "b", "Landroid/widget/CheckBox;", "checkBox", "checkBoxSubject", "c", "inspectionPoint", "j", "", "I", "previous", "", "Ljava/util/Map;", "checkBoxChangesMap", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "checkBoxList", "checkBoxToInspectionPointMap", "checkedInspectionPointList", "uncheckedInspectionPointList", "Lgt6;", "Lgt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairDamageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairDamageView.kt\nco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes2.dex */
public final class RepairDamageView extends RelativeLayout {

    /* renamed from: b */
    public int f61501b;

    /* renamed from: c */
    public final Map<String, C24552a<Boolean>> f61502c;

    /* renamed from: d */
    public final List<CheckBox> f61503d;

    /* renamed from: e */
    public final Map<CheckBox, BirdInspectionPoint> f61504e;

    /* renamed from: f */
    public final List<BirdInspectionPoint> f61505f;

    /* renamed from: g */
    public final List<BirdInspectionPoint> f61506g;

    /* renamed from: h */
    public final C41802gt6 f61507h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "checked", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.legacyrepair.startrepair.RepairDamageView$a */
    /* loaded from: classes2.dex */
    public static final class C13762a extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ CheckBox f61508g;

        /* renamed from: h */
        public final /* synthetic */ RepairDamageView f61509h;

        /* renamed from: i */
        public final /* synthetic */ C24552a<Boolean> f61510i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13762a(CheckBox checkBox, RepairDamageView repairDamageView, C24552a<Boolean> c24552a) {
            super(1);
            this.f61508g = checkBox;
            this.f61509h = repairDamageView;
            this.f61510i = c24552a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean checked) {
            Intrinsics.checkNotNullExpressionValue(checked, "checked");
            if (checked.booleanValue()) {
                this.f61508g.setTextColor(this.f61509h.getResources().getColor(C32364Df4.red));
            } else {
                this.f61508g.setTextColor(this.f61509h.getResources().getColor(C32364Df4.black));
            }
            this.f61510i.onNext(checked);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RepairDamageView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: d */
    public static final void m60613d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public final void m60615b(BirdInspectionPoint birdInspectionPoint, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        if (!z) {
            layoutParams.addRule(3, this.f61501b);
            layoutParams.setMargins(0, C49520tu6.m11247d(this, 15), 0, 0);
        }
        CheckBox checkBox = new CheckBox(getContext());
        checkBox.setText(getContext().getResources().getString(C45871nl4.start_repair_damage_line, birdInspectionPoint.getArea(), birdInspectionPoint.getItem()));
        checkBox.setId(View.generateViewId());
        checkBox.setTextSize(16.0f);
        checkBox.setTag(birdInspectionPoint.getMobileId());
        checkBox.setPadding(checkBox.getPaddingLeft() + ((int) getResources().getDimension(C37044Xf4.mechanic_checkbox_padding)), 0, 0, 0);
        checkBox.setButtonDrawable(NA0.m94299e(getContext(), C52342yg4.mechanic_checkbox_selector));
        C24552a<Boolean> m31921g = C24552a.m31921g(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(false)");
        m60614c(checkBox, m31921g);
        addView(checkBox, layoutParams);
        m60607j(checkBox, birdInspectionPoint, m31921g);
    }

    /* renamed from: c */
    public final void m60614c(CheckBox checkBox, C24552a<Boolean> c24552a) {
        AbstractC49595u22<Boolean> m96513a = C34228Le5.m96513a(checkBox);
        final C13762a c13762a = new C13762a(checkBox, this, c24552a);
        m96513a.subscribe(new InterfaceC23484g() { // from class: Oy4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RepairDamageView.m60613d(Function1.this, obj);
            }
        });
    }

    /* renamed from: e */
    public final void m60612e() {
        if (this.f61505f.size() + this.f61506g.size() == this.f61503d.size()) {
            return;
        }
        for (CheckBox checkBox : this.f61503d) {
            BirdInspectionPoint birdInspectionPoint = this.f61504e.get(checkBox);
            if (birdInspectionPoint != null) {
                if (checkBox.isChecked()) {
                    this.f61505f.add(birdInspectionPoint);
                } else {
                    this.f61506g.add(birdInspectionPoint);
                }
            }
        }
    }

    /* renamed from: f */
    public final List<C24552a<Boolean>> m60611f() {
        List<C24552a<Boolean>> list;
        list = CollectionsKt___CollectionsKt.toList(this.f61502c.values());
        return list;
    }

    /* renamed from: g */
    public final List<BirdInspectionPoint> m60610g() {
        m60612e();
        return this.f61505f;
    }

    /* renamed from: h */
    public final List<BirdInspectionPoint> m60609h() {
        m60612e();
        return this.f61506g;
    }

    /* renamed from: i */
    public final C24552a<Boolean> m60608i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f61502c.get(key);
    }

    /* renamed from: j */
    public final void m60607j(CheckBox checkBox, BirdInspectionPoint birdInspectionPoint, C24552a<Boolean> c24552a) {
        this.f61501b = checkBox.getId();
        this.f61503d.add(checkBox);
        this.f61504e.put(checkBox, birdInspectionPoint);
        this.f61502c.put(birdInspectionPoint.getMobileId(), c24552a);
    }

    /* renamed from: k */
    public final Observable<Unit> m60606k(String id, String code) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        Iterator<T> it = this.f61503d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((CheckBox) obj).getTag(), id)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CheckBox checkBox = (CheckBox) obj;
        if (checkBox != null) {
            checkBox.setClickable(false);
            checkBox.setChecked(true);
            layoutParams.addRule(17, checkBox.getId());
            layoutParams.addRule(4, checkBox.getId());
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C40794fB6 m41751c = C40794fB6.m41751c(C40788fB0.m41772j(context), this, false);
        Intrinsics.checkNotNullExpressionValue(m41751c, "inflate(context.layoutInflater, this, false)");
        m41751c.f79649b.setText(getResources().getString(C45871nl4.physical_lock_replace_code_is, code));
        addView(m41751c.getRoot(), layoutParams);
        RelativeLayout root = m41751c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "redoView.root");
        return C45219mf5.m25214a(root);
    }

    /* renamed from: l */
    public final void m60605l(String id) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.f61503d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((CheckBox) obj).getTag(), id)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CheckBox checkBox = (CheckBox) obj;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
    }

    public final void setInspectionPoints(List<BirdInspectionPoint> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i = 0;
        for (BirdInspectionPoint birdInspectionPoint : points) {
            int i2 = i + 1;
            if (i == 0) {
                m60615b(birdInspectionPoint, true);
            } else {
                m60615b(birdInspectionPoint, false);
            }
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RepairDamageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RepairDamageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RepairDamageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61501b = C36585Vg4.repairDamageViewRoot;
        this.f61502c = new LinkedHashMap();
        this.f61503d = new ArrayList();
        this.f61504e = new LinkedHashMap();
        this.f61505f = new ArrayList();
        this.f61506g = new ArrayList();
        C41802gt6 m37361b = C41802gt6.m37361b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m37361b, "inflate(context.layoutInflater, this)");
        this.f61507h = m37361b;
    }
}
