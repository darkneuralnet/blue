package p000;

import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.legacyrepair.startrepair.RepairDamageView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdInspectionPoint;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J&\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0016\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"LhP5;", "LxE;", "LdP5;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lco/bird/android/model/BirdInspectionPoint;", "v7", "", "o7", "A0", "rd", "", "id", "Lio/reactivex/subjects/a;", "", "Jk", PaymentMethodOptionsParams.Blik.PARAM_CODE, "ki", "J7", "birdCode", "m", "Ljava/util/ArrayList;", "inspectionPointList", "Ui", "Lk6;", "b", "Lk6;", "binding", "Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;", "c", "Lco/bird/android/app/feature/legacyrepair/startrepair/RepairDamageView;", "repairDamageView", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "markRepairedButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lk6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hP5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42105hP5 extends AbstractC30071xE implements InterfaceC39734dP5 {

    /* renamed from: b */
    public final C25104k6 f85158b;

    /* renamed from: c */
    public final RepairDamageView f85159c;

    /* renamed from: d */
    public final Button f85160d;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/BirdInspectionPoint;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hP5$a */
    /* loaded from: classes2.dex */
    public static final class C22639a extends Lambda implements Function1<Unit, Pair<? extends List<? extends BirdInspectionPoint>, ? extends List<? extends BirdInspectionPoint>>> {
        public C22639a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<List<BirdInspectionPoint>, List<BirdInspectionPoint>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TuplesKt.m28425to(C42105hP5.this.f85159c.m60610g(), C42105hP5.this.f85158b.f93898h.m60609h());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "checkedChanges", "", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nStartRepairUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartRepairUi.kt\nco/bird/android/app/feature/legacyrepair/startrepair/StartRepairUiImpl$setInspectionPoints$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,72:1\n12744#2,2:73\n*S KotlinDebug\n*F\n+ 1 StartRepairUi.kt\nco/bird/android/app/feature/legacyrepair/startrepair/StartRepairUiImpl$setInspectionPoints$1\n*L\n64#1:73,2\n*E\n"})
    /* renamed from: hP5$b */
    /* loaded from: classes2.dex */
    public static final class C22640b extends Lambda implements Function1<Object[], Boolean> {

        /* renamed from: g */
        public static final C22640b f85162g = new C22640b();

        public C22640b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object[] checkedChanges) {
            Intrinsics.checkNotNullParameter(checkedChanges, "checkedChanges");
            int length = checkedChanges.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (Intrinsics.areEqual(checkedChanges[i], Boolean.TRUE)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "somethingIsChecked", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hP5$c */
    /* loaded from: classes2.dex */
    public static final class C22641c extends Lambda implements Function1<Boolean, Unit> {
        public C22641c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean somethingIsChecked) {
            Button button = C42105hP5.this.f85160d;
            Intrinsics.checkNotNullExpressionValue(somethingIsChecked, "somethingIsChecked");
            button.setEnabled(somethingIsChecked.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42105hP5(BaseActivity activity, C25104k6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f85158b = binding;
        this.f85159c = (RepairDamageView) C40788fB0.m41779c(activity, C36585Vg4.repairDamage);
        this.f85160d = (Button) C40788fB0.m41779c(activity, C36585Vg4.markRepaired);
    }

    /* renamed from: Sl */
    public static final Pair m36447Sl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: Tl */
    public static final Boolean m36446Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Ul */
    public static final void m36444Ul(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: A0 */
    public Observable<Unit> mo36453A0() {
        Button button = this.f85158b.f93894d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cantFix");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: J7 */
    public void mo36452J7() {
        this.f85158b.f93898h.m60605l("neck_physical_lock");
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: Jk */
    public C24552a<Boolean> mo36451Jk(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.f85158b.f93898h.m60608i(id);
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: Ui */
    public void mo36445Ui(ArrayList<BirdInspectionPoint> inspectionPointList) {
        Intrinsics.checkNotNullParameter(inspectionPointList, "inspectionPointList");
        this.f85158b.f93898h.setInspectionPoints(inspectionPointList);
        final C22640b c22640b = C22640b.f85162g;
        Observable startWith = Observable.combineLatest(this.f85158b.f93898h.m60611f(), new InterfaceC23492o() { // from class: fP5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m36446Tl;
                m36446Tl = C42105hP5.m36446Tl(Function1.this, obj);
                return m36446Tl;
            }
        }).startWith((Observable) Boolean.FALSE);
        final C22641c c22641c = new C22641c();
        startWith.subscribe(new InterfaceC23484g() { // from class: gP5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42105hP5.m36444Ul(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: ki */
    public Observable<Unit> mo36443ki(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f85158b.f93898h.m60606k("neck_physical_lock", code);
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: m */
    public void mo36442m(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        this.f85158b.f93892b.setText(birdCode);
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: o7 */
    public Observable<Unit> mo36441o7() {
        Button button = this.f85158b.f93900j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.startOver");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: rd */
    public Observable<Unit> mo36440rd() {
        Button button = this.f85158b.f93893c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancelTask");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC39734dP5
    /* renamed from: v7 */
    public Observable<Pair<List<BirdInspectionPoint>, List<BirdInspectionPoint>>> mo36439v7() {
        Button button = this.f85158b.f93896f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.markRepaired");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C22639a c22639a = new C22639a();
        Observable<Pair<List<BirdInspectionPoint>, List<BirdInspectionPoint>>> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: eP5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m36447Sl;
                m36447Sl = C42105hP5.m36447Sl(Function1.this, obj);
                return m36447Sl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun markRepairC…eckedInspectionPoints() }");
        return map;
    }
}
