package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.legacyrepair.inspection.InspectionAreaView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdInspectionPoint;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b4\u00105J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001e\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u00110\tH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0,0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.¨\u00066"}, m28432d2 = {"Lbi5;", "LxE;", "LYh5;", "", "Lco/bird/android/model/BirdInspectionPoint;", "points", "", "i6", "Gf", "Lio/reactivex/Observable;", "", "X3", "n9", "gb", "enabled", "z4", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "S6", "x5", "A0", DateTokenConverter.CONVERTER_KEY, "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "m", "Tl", "Lco/bird/android/app/feature/legacyrepair/inspection/InspectionAreaView;", "inspectionAreaView", "Rl", "Ul", "LS5;", "b", "LS5;", "binding", "", "c", "I", "previous", "", "", "Ljava/util/Map;", "map", "e", "areaToInspectionAreaViewMap", "Lu22;", "f", "Ljava/util/List;", "areaCheckedChangesList", "g", "checkedInspectionPointList", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LS5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bi5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38709bi5 extends AbstractC30071xE implements InterfaceC37297Yh5 {

    /* renamed from: b */
    public final C7329S5 f57982b;

    /* renamed from: c */
    public int f57983c;

    /* renamed from: d */
    public final Map<String, List<BirdInspectionPoint>> f57984d;

    /* renamed from: e */
    public final Map<String, InspectionAreaView> f57985e;

    /* renamed from: f */
    public final List<AbstractC49595u22<Boolean>> f57986f;

    /* renamed from: g */
    public final List<BirdInspectionPoint> f57987g;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "changes", "", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafetyInspectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafetyInspectionUi.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionUiImpl$inspectionAreaSelections$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,139:1\n12744#2,2:140\n*S KotlinDebug\n*F\n+ 1 SafetyInspectionUi.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionUiImpl$inspectionAreaSelections$1\n*L\n70#1:140,2\n*E\n"})
    /* renamed from: bi5$a */
    /* loaded from: classes2.dex */
    public static final class C12483a extends Lambda implements Function1<Object[], Boolean> {

        /* renamed from: g */
        public static final C12483a f57988g = new C12483a();

        public C12483a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object[] changes) {
            Intrinsics.checkNotNullParameter(changes, "changes");
            int length = changes.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (Intrinsics.areEqual(changes[i], Boolean.TRUE)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a,\u0012\u0004\u0012\u00020\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Ljava/util/ArrayList;", "Lco/bird/android/model/BirdInspectionPoint;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/util/ArrayList;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSafetyInspectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafetyInspectionUi.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionUiImpl$startRepairClicks$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,139:1\n215#2,2:140\n*S KotlinDebug\n*F\n+ 1 SafetyInspectionUi.kt\nco/bird/android/app/feature/legacyrepair/inspection/SafetyInspectionUiImpl$startRepairClicks$1\n*L\n102#1:140,2\n*E\n"})
    /* renamed from: bi5$b */
    /* loaded from: classes2.dex */
    public static final class C12484b extends Lambda implements Function1<Unit, ArrayList<BirdInspectionPoint>> {
        public C12484b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ArrayList<BirdInspectionPoint> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Map map = C38709bi5.this.f57985e;
            C38709bi5 c38709bi5 = C38709bi5.this;
            for (Map.Entry entry : map.entrySet()) {
                c38709bi5.f57987g.addAll(((InspectionAreaView) entry.getValue()).m60625g());
            }
            return new ArrayList<>(C38709bi5.this.f57987g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38709bi5(BaseActivity activity, C7329S5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f57982b = binding;
        this.f57983c = C36585Vg4.birdId;
        this.f57984d = new LinkedHashMap();
        this.f57985e = new LinkedHashMap();
        this.f57986f = new ArrayList();
        this.f57987g = new ArrayList();
    }

    /* renamed from: Sl */
    public static final Boolean m64091Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Vl */
    public static final ArrayList m64088Vl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ArrayList) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: A0 */
    public Observable<Unit> mo64097A0() {
        Button button = this.f57982b.f33143d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cantFix");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: Gf */
    public void mo64096Gf() {
        List<BirdInspectionPoint> list;
        for (String str : this.f57984d.keySet()) {
            InspectionAreaView inspectionAreaView = new InspectionAreaView(getActivity(), null, 0, 6, null);
            List<BirdInspectionPoint> list2 = this.f57984d.get(str);
            Intrinsics.checkNotNull(list2);
            list = CollectionsKt___CollectionsKt.toList(list2);
            inspectionAreaView.setInspectionPoints(list);
            m64093Rl(inspectionAreaView);
            this.f57986f.add(inspectionAreaView.m60626f());
            this.f57985e.put(str, inspectionAreaView);
        }
        m64090Tl();
    }

    /* renamed from: Rl */
    public final void m64093Rl(InspectionAreaView inspectionAreaView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.f57983c);
        inspectionAreaView.setId(View.generateViewId());
        this.f57982b.f33147h.addView(inspectionAreaView, layoutParams);
        m64089Ul(inspectionAreaView);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: S6 */
    public Observable<ArrayList<BirdInspectionPoint>> mo64092S6() {
        Button button = this.f57982b.f33148i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.startRepair");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C12484b c12484b = new C12484b();
        Observable<ArrayList<BirdInspectionPoint>> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: Zh5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                ArrayList m64088Vl;
                m64088Vl = C38709bi5.m64088Vl(Function1.this, obj);
                return m64088Vl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun startRepair…ionPointList)\n      }\n  }");
        return map;
    }

    /* renamed from: Tl */
    public final void m64090Tl() {
        ViewGroup.LayoutParams layoutParams = this.f57982b.f33148i.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(3, this.f57983c);
        this.f57982b.f33148i.setLayoutParams(layoutParams2);
    }

    /* renamed from: Ul */
    public final void m64089Ul(InspectionAreaView inspectionAreaView) {
        this.f57983c = inspectionAreaView.getId();
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: X3 */
    public Observable<Boolean> mo64087X3() {
        final C12483a c12483a = C12483a.f57988g;
        Observable<Boolean> startWith = Observable.combineLatest(this.f57986f, new InterfaceC23492o() { // from class: ai5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m64091Sl;
                m64091Sl = C38709bi5.m64091Sl(Function1.this, obj);
                return m64091Sl;
            }
        }).startWith((Observable) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(startWith, "combineLatest(areaChecke…}\n      .startWith(false)");
        return startWith;
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: d */
    public Observable<Unit> mo64086d() {
        Button button = this.f57982b.f33142c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancelRepair");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: gb */
    public void mo64085gb() {
        TextView textView = this.f57982b.f33141b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.birdId");
        C49520tu6.m11233r(textView);
        TextView textView2 = this.f57982b.f33144e;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.header");
        C49520tu6.m11233r(textView2);
        TextView textView3 = this.f57982b.f33149j;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.subHeader");
        C49520tu6.m11233r(textView3);
        Button button = this.f57982b.f33148i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.startRepair");
        C49520tu6.m11233r(button);
        Button button2 = this.f57982b.f33145f;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.notDamaged");
        C49520tu6.m11233r(button2);
        Button button3 = this.f57982b.f33143d;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.cantFix");
        C49520tu6.m11233r(button3);
        Button button4 = this.f57982b.f33142c;
        Intrinsics.checkNotNullExpressionValue(button4, "binding.cancelRepair");
        C49520tu6.m11233r(button4);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: i6 */
    public void mo64084i6(List<BirdInspectionPoint> points) {
        List<BirdInspectionPoint> mutableListOf;
        Intrinsics.checkNotNullParameter(points, "points");
        for (BirdInspectionPoint birdInspectionPoint : points) {
            if (this.f57984d.containsKey(birdInspectionPoint.getArea())) {
                List<BirdInspectionPoint> list = this.f57984d.get(birdInspectionPoint.getArea());
                Intrinsics.checkNotNull(list);
                list.add(birdInspectionPoint);
            } else {
                Map<String, List<BirdInspectionPoint>> map = this.f57984d;
                String area = birdInspectionPoint.getArea();
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(birdInspectionPoint);
                map.put(area, mutableListOf);
            }
        }
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: m */
    public void mo64083m(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f57982b.f33141b.setText(code);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: n9 */
    public void mo64082n9() {
        TextView textView = this.f57982b.f33141b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.birdId");
        C49520tu6.m11239l(textView);
        TextView textView2 = this.f57982b.f33144e;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.header");
        C49520tu6.m11239l(textView2);
        TextView textView3 = this.f57982b.f33149j;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.subHeader");
        C49520tu6.m11239l(textView3);
        Button button = this.f57982b.f33148i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.startRepair");
        C49520tu6.m11239l(button);
        Button button2 = this.f57982b.f33145f;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.notDamaged");
        C49520tu6.m11239l(button2);
        Button button3 = this.f57982b.f33143d;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.cantFix");
        C49520tu6.m11239l(button3);
        Button button4 = this.f57982b.f33142c;
        Intrinsics.checkNotNullExpressionValue(button4, "binding.cancelRepair");
        C49520tu6.m11239l(button4);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: x5 */
    public Observable<Unit> mo64081x5() {
        Button button = this.f57982b.f33145f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.notDamaged");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC37297Yh5
    /* renamed from: z4 */
    public void mo64080z4(boolean z) {
        this.f57982b.f33148i.setEnabled(z);
    }
}
