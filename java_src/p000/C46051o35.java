package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideFeedbackCategoryTags;
import co.bird.android.widget.ChipWithData;
import co.bird.android.widget.SelectableButtonV2;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.share.internal.C17296a;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.play.core.review.ReviewInfo;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020?¢\u0006\u0004\bm\u0010nJ\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0010H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u0010H\u0016J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020*H\u0016J\u0010\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020*H\u0016J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J$\u00107\u001a\u00020\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u0006042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0016J\b\u00108\u001a\u00020\u0006H\u0016J\b\u00109\u001a\u00020\u0004H\u0016J\b\u0010:\u001a\u00020\u0006H\u0016R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010@R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020I0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\"\u0010S\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u00130\u00130O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010W\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010*0*0T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010Y\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010*0*0T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR0\u0010[\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b P*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00110\u00110T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010VR\u0016\u0010]\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010CR\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010CR\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010CR\u0016\u0010c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010CR)\u0010j\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010e0e0d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006o"}, m28432d2 = {"Lo35;", "LxE;", "Li35;", "Landroid/widget/TextView;", "", "selected", "", "bm", "", "chipText", "chipValue", "Lco/bird/android/widget/ChipWithData;", "Xl", "enableIssueCategoryButtons", "enableIssueCategoryTabs", "ue", "Lio/reactivex/Observable;", "", "qe", "", "rating", "X", "Fh", "hi", "J9", "Gl", "Lco/bird/android/model/RideFeedbackCategoryTags;", "categoryTags", "Hb", "enabled", "wj", "ef", "Jb", "gh", "P4", "Ta", "jc", "y4", "cf", "eh", "c", "mb", "", "T0", "o3", "Ib", "Jj", "count", "J2", "T8", "mg", "q6", "Lkotlin/Function0;", "onYes", "onNo", "y1", "D", "Y0", "f1", "LEO4;", "b", "LEO4;", "reviewManager", "LP5;", "LP5;", "binding", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lcom/google/android/material/chip/ChipGroup;", "f", "Lcom/google/android/material/chip/ChipGroup;", "chipGroup", "Lcom/google/android/material/chip/Chip;", "g", "Ljava/util/List;", "vehicleTags", "h", "otherTags", "Lma4;", "kotlin.jvm.PlatformType", "i", "Lma4;", "ratingBarChanges", "Lio/reactivex/subjects/a;", "j", "Lio/reactivex/subjects/a;", "vehicleCountSubject", "k", "otherCountSubject", "l", "selectedChips", "m", "vehicleTabSelectionState", "n", "otherTabSelectionState", "o", "vehicleTagsShown", "p", "otherTagsShown", "LXY5;", "Lcom/google/android/play/core/review/ReviewInfo;", "q", "Lkotlin/Lazy;", "Zl", "()LXY5;", "requestReviewTask", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LEO4;LP5;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o35  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46051o35 extends AbstractC30071xE implements InterfaceC42493i35 {

    /* renamed from: b */
    public final EO4 f101270b;

    /* renamed from: c */
    public final C6237P5 f101271c;

    /* renamed from: d */
    public boolean f101272d;

    /* renamed from: e */
    public boolean f101273e;

    /* renamed from: f */
    public final ChipGroup f101274f;

    /* renamed from: g */
    public final List<Chip> f101275g;

    /* renamed from: h */
    public final List<Chip> f101276h;

    /* renamed from: i */
    public final C45168ma4<Float> f101277i;

    /* renamed from: j */
    public C24552a<Integer> f101278j;

    /* renamed from: k */
    public C24552a<Integer> f101279k;

    /* renamed from: l */
    public C24552a<List<String>> f101280l;

    /* renamed from: m */
    public boolean f101281m;

    /* renamed from: n */
    public boolean f101282n;

    /* renamed from: o */
    public boolean f101283o;

    /* renamed from: p */
    public boolean f101284p;

    /* renamed from: q */
    public final Lazy f101285q;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/RatingBar;", "ratingBar", "", "rating", "", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/RatingBar;FZ)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o35$a */
    /* loaded from: classes3.dex */
    public static final class C26803a extends Lambda implements Function3<RatingBar, Float, Boolean, Unit> {
        public C26803a() {
            super(3);
        }

        /* renamed from: a */
        public final void m21876a(RatingBar ratingBar, float f, boolean z) {
            if (f < 1.0f && ratingBar != null) {
                ratingBar.setRating(1.0f);
            }
            C46051o35.this.f101277i.accept(Float.valueOf(f));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RatingBar ratingBar, Float f, Boolean bool) {
            m21876a(ratingBar, f.floatValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LXY5;", "Lcom/google/android/play/core/review/ReviewInfo;", "kotlin.jvm.PlatformType", "b", "()LXY5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: o35$b */
    /* loaded from: classes3.dex */
    public static final class C26804b extends Lambda implements Function0<XY5<ReviewInfo>> {
        public C26804b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final XY5<ReviewInfo> invoke() {
            return C46051o35.this.f101270b.mo48459a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: o35$c */
    /* loaded from: classes3.dex */
    public static final class C26805c extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f101288g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26805c(Function0<Unit> function0) {
            super(1);
            this.f101288g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f101288g.invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: o35$d */
    /* loaded from: classes3.dex */
    public static final class C26806d extends Lambda implements Function1<MaterialDialog, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f101289g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26806d(Function0<Unit> function0) {
            super(1);
            this.f101289g = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f101289g.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46051o35(BaseActivity activity, EO4 reviewManager, C6237P5 binding) {
        super(activity);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reviewManager, "reviewManager");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f101270b = reviewManager;
        this.f101271c = binding;
        ChipGroup chipGroup = binding.f27864j;
        Intrinsics.checkNotNullExpressionValue(chipGroup, "binding.ratingSelectionsChipGroup");
        this.f101274f = chipGroup;
        this.f101275g = new ArrayList();
        this.f101276h = new ArrayList();
        C45168ma4<Float> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Float>()");
        this.f101277i = m25409g;
        C24552a<Integer> m31921g = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(0)");
        this.f101278j = m31921g;
        C24552a<Integer> m31921g2 = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault(0)");
        this.f101279k = m31921g2;
        C24552a<List<String>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<MutableList<String>>()");
        this.f101280l = m31922e;
        lazy = LazyKt__LazyJVMKt.lazy(new C26804b());
        this.f101285q = lazy;
        RatingBar ratingBar = binding.f27861g;
        Intrinsics.checkNotNullExpressionValue(ratingBar, "binding.rating");
        C34585Ms2.m94651t(ratingBar, new C26803a());
        SelectableButtonV2 selectableButtonV2 = binding.f27867m;
        int i = C33309Hg4.button_selected_matte_black;
        int i2 = C32364Df4.white;
        selectableButtonV2.setSelectedBackgroundAndTextColor(i, i2);
        SelectableButtonV2 selectableButtonV22 = binding.f27867m;
        int i3 = C33309Hg4.button_deselected_white;
        int i4 = C32364Df4.black;
        selectableButtonV22.setDeselectedBackgroundAndTextColor(i3, i4);
        binding.f27859e.setSelectedBackgroundAndTextColor(i, i2);
        binding.f27859e.setDeselectedBackgroundAndTextColor(i3, i4);
        binding.f27867m.m54391b();
        binding.f27859e.m54391b();
        binding.f27857c.setOnTouchListener(new View.OnTouchListener() { // from class: j35
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m21903Ul;
                m21903Ul = C46051o35.m21903Ul(view, motionEvent);
                return m21903Ul;
            }
        });
        this.f101280l.onNext(new ArrayList());
    }

    /* renamed from: Ul */
    public static final boolean m21903Ul(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }

    /* renamed from: Vl */
    public static final void m21902Vl(C46051o35 this$0, XY5 task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.mo1421g()) {
            Object mo1423e = task.mo1423e();
            Intrinsics.checkNotNullExpressionValue(mo1423e, "task.result");
            this$0.f101270b.mo48458b(this$0.getActivity(), (ReviewInfo) mo1423e).mo1427a(new InterfaceC44031kf3() { // from class: n35
                @Override // p000.InterfaceC44031kf3
                /* renamed from: a */
                public final void mo17508a(XY5 xy5) {
                    C46051o35.m21901Wl(xy5);
                }
            });
            return;
        }
        C41318g46.m40158f(task.mo1424d(), "Exception raised while requesting in-app review flow", new Object[0]);
    }

    /* renamed from: Wl */
    public static final void m21901Wl(XY5 xy5) {
        Intrinsics.checkNotNullParameter(xy5, "<anonymous parameter 0>");
        C41318g46.m40163a("in app review attempted successfully", new Object[0]);
    }

    /* renamed from: Yl */
    public static final void m21897Yl(ChipWithData this_apply, C46051o35 this$0, CompoundButton compoundButton, boolean z) {
        boolean contains;
        boolean contains2;
        boolean contains3;
        boolean contains4;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = 1;
        if (z) {
            BaseActivity activity = this$0.getActivity();
            int i2 = C32364Df4.birdNewRoad;
            this_apply.setChipBackgroundColor(NA0.m94300d(activity, i2));
            this_apply.setRippleColorResource(i2);
            this_apply.setTextColor(NA0.m94300d(this$0.getActivity(), C32364Df4.white));
            contains3 = CollectionsKt___CollectionsKt.contains(this$0.f101275g, compoundButton);
            if (contains3) {
                C24552a<Integer> c24552a = this$0.f101278j;
                Integer value = c24552a.getValue();
                if (value != null) {
                    i = 1 + value.intValue();
                }
                c24552a.onNext(Integer.valueOf(i));
            } else {
                contains4 = CollectionsKt___CollectionsKt.contains(this$0.f101276h, compoundButton);
                if (contains4) {
                    C24552a<Integer> c24552a2 = this$0.f101279k;
                    Integer value2 = c24552a2.getValue();
                    if (value2 != null) {
                        i = 1 + value2.intValue();
                    }
                    c24552a2.onNext(Integer.valueOf(i));
                }
            }
            List<String> value3 = this$0.f101280l.getValue();
            if (value3 != null) {
                Intrinsics.checkNotNull(compoundButton, "null cannot be cast to non-null type co.bird.android.widget.ChipWithData");
                value3.add(((ChipWithData) compoundButton).m54640O());
                return;
            }
            return;
        }
        BaseActivity activity2 = this$0.getActivity();
        int i3 = C32364Df4.white;
        this_apply.setChipBackgroundColor(NA0.m94300d(activity2, i3));
        this_apply.setRippleColorResource(i3);
        this_apply.setTextColor(NA0.m94300d(this$0.getActivity(), C32364Df4.black));
        contains = CollectionsKt___CollectionsKt.contains(this$0.f101275g, compoundButton);
        int i4 = 0;
        if (contains) {
            C24552a<Integer> c24552a3 = this$0.f101278j;
            Integer value4 = c24552a3.getValue();
            if (value4 != null) {
                i4 = value4.intValue() - 1;
            }
            c24552a3.onNext(Integer.valueOf(i4));
        } else {
            contains2 = CollectionsKt___CollectionsKt.contains(this$0.f101276h, compoundButton);
            if (contains2) {
                C24552a<Integer> c24552a4 = this$0.f101279k;
                Integer value5 = c24552a4.getValue();
                if (value5 != null) {
                    i4 = value5.intValue() - 1;
                }
                c24552a4.onNext(Integer.valueOf(i4));
            }
        }
        List<String> value6 = this$0.f101280l.getValue();
        if (value6 != null) {
            Intrinsics.checkNotNull(compoundButton, "null cannot be cast to non-null type co.bird.android.widget.ChipWithData");
            value6.remove(((ChipWithData) compoundButton).m54640O());
        }
    }

    /* renamed from: am */
    public static final void m21895am(XY5 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        C41318g46.m40163a("request review complete (" + task + ")", new Object[0]);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: D */
    public void mo21921D() {
        m21896Zl().mo1427a(new InterfaceC44031kf3() { // from class: m35
            @Override // p000.InterfaceC44031kf3
            /* renamed from: a */
            public final void mo17508a(XY5 xy5) {
                C46051o35.m21895am(xy5);
            }
        });
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Fh */
    public void mo21920Fh(boolean z) {
        if (z) {
            this.f101271c.f27867m.m54389d();
        } else {
            this.f101271c.f27867m.m54391b();
        }
        mo21884mg(z);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Gl */
    public void mo21919Gl(boolean z) {
        TextView textView = this.f101271c.f27860f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.otherTab");
        m21894bm(textView, z);
        this.f101282n = z;
        mo21882q6(z);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Hb */
    public void mo21918Hb(RideFeedbackCategoryTags categoryTags) {
        Object single;
        Object single2;
        Object single3;
        Object single4;
        Intrinsics.checkNotNullParameter(categoryTags, "categoryTags");
        for (Map<String, String> map : categoryTags.getVehicleTags()) {
            List<Chip> list = this.f101275g;
            single3 = CollectionsKt___CollectionsKt.single(map.values());
            single4 = CollectionsKt___CollectionsKt.single(map.keySet());
            list.add(m21899Xl((String) single3, (String) single4));
        }
        for (Map<String, String> map2 : categoryTags.getOtherTags()) {
            List<Chip> list2 = this.f101276h;
            single = CollectionsKt___CollectionsKt.single(map2.values());
            single2 = CollectionsKt___CollectionsKt.single(map2.keySet());
            list2.add(m21899Xl((String) single, (String) single2));
        }
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Ib */
    public void mo21917Ib(boolean z) {
        SelectableButtonV2 selectableButtonV2 = this.f101271c.f27867m;
        Intrinsics.checkNotNullExpressionValue(selectableButtonV2, "binding.vehicleButton");
        C49520tu6.show$default(selectableButtonV2, z, 0, 2, null);
        SelectableButtonV2 selectableButtonV22 = this.f101271c.f27859e;
        Intrinsics.checkNotNullExpressionValue(selectableButtonV22, "binding.otherButton");
        C49520tu6.show$default(selectableButtonV22, z, 0, 2, null);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: J2 */
    public void mo21916J2(int i) {
        TextView textView;
        if (this.f101272d) {
            textView = this.f101271c.f27867m;
        } else if (this.f101273e) {
            textView = this.f101271c.f27868n;
        } else {
            textView = this.f101271c.f27867m;
        }
        Intrinsics.checkNotNullExpressionValue(textView, "when {\n      enableIssue…nding.vehicleButton\n    }");
        if (i > 0) {
            textView.setText(getActivity().getResources().getString(C45871nl4.vehicle_with_count, Integer.valueOf(i)));
        } else {
            textView.setText(getActivity().getResources().getString(C45871nl4.vehicle));
        }
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: J9 */
    public void mo21915J9(boolean z) {
        TextView textView = this.f101271c.f27868n;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.vehicleTab");
        m21894bm(textView, z);
        this.f101281m = z;
        mo21884mg(z);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Jb */
    public boolean mo21914Jb() {
        return this.f101271c.f27867m.m54390c();
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Jj */
    public void mo21913Jj(boolean z) {
        TextView textView = this.f101271c.f27868n;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.vehicleTab");
        C49520tu6.show$default(textView, z, 0, 2, null);
        TextView textView2 = this.f101271c.f27860f;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.otherTab");
        C49520tu6.show$default(textView2, z, 0, 2, null);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: P4 */
    public boolean mo21912P4() {
        return this.f101281m;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: T0 */
    public Observable<Integer> mo21907T0() {
        Observable<Integer> hide = this.f101278j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleCountSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: T8 */
    public void mo21906T8(int i) {
        TextView textView;
        if (this.f101272d) {
            textView = this.f101271c.f27859e;
        } else if (this.f101273e) {
            textView = this.f101271c.f27860f;
        } else {
            textView = this.f101271c.f27859e;
        }
        Intrinsics.checkNotNullExpressionValue(textView, "when {\n      enableIssue…binding.otherButton\n    }");
        if (i > 0) {
            textView.setText(getActivity().getResources().getString(C45871nl4.app_with_count, Integer.valueOf(i)));
        } else {
            textView.setText(getActivity().getResources().getString(C45871nl4.app));
        }
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Ta */
    public boolean mo21905Ta() {
        return this.f101282n;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: X */
    public void mo21900X(float f) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f101271c.f27861g.setRating(f);
        this.f101271c.f27857c.getText().clear();
        Integer num = 0;
        if (1.0f <= f && f <= 2.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f101271c.f27865k.setText(getActivity().getString(C45871nl4.ride_rating_low_rating_title));
            this.f101271c.f27863i.setText(getActivity().getString(C45871nl4.ride_rating_low_rating_description));
            if (this.f101272d) {
                if (!mo21914Jb() && !mo21888gh()) {
                    mo21879wj(false);
                } else {
                    mo21879wj(true);
                }
                mo21917Ib(true);
                Integer value = this.f101278j.getValue();
                if (value == null) {
                    value = num;
                }
                mo21916J2(value.intValue());
                Integer value2 = this.f101279k.getValue();
                if (value2 != null) {
                    num = value2;
                }
                mo21906T8(num.intValue());
                return;
            } else if (this.f101273e) {
                mo21879wj(true);
                mo21913Jj(true);
                if (!mo21912P4() && (mo21905Ta() || mo21912P4())) {
                    mo21919Gl(false);
                    mo21915J9(false);
                    mo21919Gl(true);
                } else {
                    mo21915J9(false);
                    mo21919Gl(false);
                    mo21915J9(true);
                }
                Integer value3 = this.f101278j.getValue();
                if (value3 == null) {
                    value3 = num;
                }
                mo21916J2(value3.intValue());
                Integer value4 = this.f101279k.getValue();
                if (value4 != null) {
                    num = value4;
                }
                mo21906T8(num.intValue());
                return;
            } else {
                mo21879wj(true);
                if (!this.f101283o) {
                    mo21884mg(true);
                }
                if (!this.f101284p) {
                    mo21882q6(true);
                    return;
                }
                return;
            }
        }
        if (2.0f <= f && f <= 4.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f101271c.f27865k.setText(getActivity().getString(C45871nl4.ride_rating_mid_rating_title));
            this.f101271c.f27863i.setText(getActivity().getString(C45871nl4.ride_rating_low_rating_description));
            if (this.f101272d) {
                if (!mo21914Jb() && !mo21888gh()) {
                    mo21879wj(false);
                } else {
                    mo21879wj(true);
                }
                mo21917Ib(true);
                Integer value5 = this.f101278j.getValue();
                if (value5 == null) {
                    value5 = num;
                }
                mo21916J2(value5.intValue());
                Integer value6 = this.f101279k.getValue();
                if (value6 != null) {
                    num = value6;
                }
                mo21906T8(num.intValue());
                return;
            } else if (this.f101273e) {
                mo21879wj(true);
                mo21913Jj(true);
                if (!mo21912P4() && (mo21905Ta() || mo21912P4())) {
                    mo21919Gl(false);
                    mo21915J9(false);
                    mo21919Gl(true);
                } else {
                    mo21915J9(false);
                    mo21919Gl(false);
                    mo21915J9(true);
                }
                Integer value7 = this.f101278j.getValue();
                if (value7 == null) {
                    value7 = num;
                }
                mo21916J2(value7.intValue());
                Integer value8 = this.f101279k.getValue();
                if (value8 != null) {
                    num = value8;
                }
                mo21906T8(num.intValue());
                return;
            } else {
                mo21879wj(true);
                if (!this.f101283o) {
                    mo21884mg(true);
                }
                if (!this.f101284p) {
                    mo21882q6(true);
                    return;
                }
                return;
            }
        }
        if (4.0f <= f && f <= 5.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f101271c.f27865k.setText(getActivity().getString(C45871nl4.ride_rating_high_rating_title));
            this.f101271c.f27863i.setText(getActivity().getString(C45871nl4.ride_rating_high_rating_description));
            if (this.f101272d) {
                mo21879wj(true);
                mo21917Ib(false);
                mo21884mg(false);
                mo21882q6(false);
                Integer value9 = this.f101278j.getValue();
                if (value9 == null) {
                    value9 = num;
                }
                mo21916J2(value9.intValue());
                Integer value10 = this.f101279k.getValue();
                if (value10 != null) {
                    num = value10;
                }
                mo21906T8(num.intValue());
            } else if (this.f101273e) {
                mo21879wj(true);
                mo21913Jj(false);
                mo21884mg(false);
                mo21882q6(false);
                Integer value11 = this.f101278j.getValue();
                if (value11 == null) {
                    value11 = num;
                }
                mo21916J2(value11.intValue());
                Integer value12 = this.f101279k.getValue();
                if (value12 != null) {
                    num = value12;
                }
                mo21906T8(num.intValue());
            } else {
                mo21879wj(true);
                if (this.f101283o) {
                    mo21884mg(false);
                }
                if (this.f101284p) {
                    mo21882q6(false);
                }
            }
        }
    }

    /* renamed from: Xl */
    public final ChipWithData m21899Xl(String str, String str2) {
        final ChipWithData chipWithData = new ChipWithData(getActivity(), null, C50021ul4.Widget_MaterialComponents_Chip_Filter);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        chipWithData.setText(upperCase);
        chipWithData.setValue(str2);
        chipWithData.setChipBackgroundColor(NA0.m94300d(getActivity(), C32364Df4.white));
        chipWithData.setTextColor(NA0.m94300d(getActivity(), C32364Df4.black));
        chipWithData.setTextAppearance(getActivity(), C32184Cl4.ChipTextAppearance);
        chipWithData.setGravity(17);
        Resources resources = chipWithData.getResources();
        int i = C37044Xf4.chip_horizontal_padding;
        chipWithData.setPadding(0, resources.getDimensionPixelSize(i), 0, chipWithData.getResources().getDimensionPixelSize(i));
        chipWithData.setChipStrokeColor(NA0.m94300d(getActivity(), C32364Df4.gray));
        chipWithData.setChipCornerRadius(chipWithData.getResources().getDimension(C37044Xf4.chip_corner_radius));
        chipWithData.setChipStrokeWidth(chipWithData.getResources().getDimension(C37044Xf4.chip_stroke_width));
        chipWithData.setTextStartPadding(chipWithData.getResources().getDimension(i));
        chipWithData.setTextEndPadding(chipWithData.getResources().getDimension(i));
        chipWithData.setClickable(true);
        chipWithData.setFocusable(true);
        chipWithData.setCheckable(true);
        chipWithData.setCheckedIconVisible(false);
        chipWithData.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k35
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C46051o35.m21897Yl(ChipWithData.this, this, compoundButton, z);
            }
        });
        return chipWithData;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: Y0 */
    public boolean mo21898Y0() {
        return m21896Zl().mo1421g();
    }

    /* renamed from: Zl */
    public final XY5<ReviewInfo> m21896Zl() {
        return (XY5) this.f101285q.getValue();
    }

    /* renamed from: bm */
    public final void m21894bm(TextView textView, boolean z) {
        Drawable m94299e;
        if (z) {
            m94299e = NA0.m94299e(getActivity(), C33309Hg4.underline);
        } else {
            m94299e = NA0.m94299e(getActivity(), C33309Hg4.underline_deselected);
        }
        textView.setBackground(m94299e);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: c */
    public Observable<Unit> mo21893c() {
        Button button = this.f101271c.f27866l;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: cf */
    public Observable<Unit> mo21892cf() {
        TextView textView = this.f101271c.f27868n;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.vehicleTab");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: ef */
    public Observable<Float> mo21891ef() {
        Observable<Float> hide = this.f101277i.startWith((C45168ma4<Float>) Float.valueOf(this.f101271c.f27861g.getRating())).hide();
        Intrinsics.checkNotNullExpressionValue(hide, "ratingBarChanges.startWi…ing.rating.rating).hide()");
        return hide;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: eh */
    public Observable<Unit> mo21890eh() {
        TextView textView = this.f101271c.f27860f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.otherTab");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: f1 */
    public void mo21889f1() {
        C41318g46.m40163a("attemptInAppReview called, waiting for review request task to complete...", new Object[0]);
        m21896Zl().mo1427a(new InterfaceC44031kf3() { // from class: l35
            @Override // p000.InterfaceC44031kf3
            /* renamed from: a */
            public final void mo17508a(XY5 xy5) {
                C46051o35.m21902Vl(C46051o35.this, xy5);
            }
        });
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: gh */
    public boolean mo21888gh() {
        return this.f101271c.f27859e.m54390c();
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: hi */
    public void mo21887hi(boolean z) {
        if (z) {
            this.f101271c.f27859e.m54389d();
        } else {
            this.f101271c.f27859e.m54391b();
        }
        mo21882q6(z);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: jc */
    public Observable<Unit> mo21886jc() {
        SelectableButtonV2 selectableButtonV2 = this.f101271c.f27867m;
        Intrinsics.checkNotNullExpressionValue(selectableButtonV2, "binding.vehicleButton");
        return C44626lf5.clicksThrottle$default(selectableButtonV2, 0L, 1, null);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: mb */
    public Observable<String> mo21885mb() {
        EditText editText = this.f101271c.f27857c;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.feedback");
        Observable<String> startWith = C44626lf5.textChanges$default(editText, 0, false, 2, null).startWith((Observable) "");
        Intrinsics.checkNotNullExpressionValue(startWith, "binding.feedback.textCha…(delay = 0).startWith(\"\")");
        return startWith;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: mg */
    public void mo21884mg(boolean z) {
        for (Chip chip : this.f101275g) {
            ChipGroup chipGroup = this.f101274f;
            if (z) {
                chipGroup.addView(chip);
            } else {
                chipGroup.removeView(chip);
            }
        }
        this.f101283o = z;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: o3 */
    public Observable<Integer> mo21883o3() {
        Observable<Integer> hide = this.f101279k.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "otherCountSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: q6 */
    public void mo21882q6(boolean z) {
        for (Chip chip : this.f101276h) {
            ChipGroup chipGroup = this.f101274f;
            if (z) {
                chipGroup.addView(chip);
            } else {
                chipGroup.removeView(chip);
            }
        }
        this.f101284p = z;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: qe */
    public Observable<List<String>> mo21881qe() {
        Observable<List<String>> hide = this.f101280l.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "selectedChips.hide()");
        return hide;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: ue */
    public void mo21880ue(boolean z, boolean z2) {
        this.f101272d = z;
        this.f101273e = z2;
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: wj */
    public void mo21879wj(boolean z) {
        EditText editText = this.f101271c.f27857c;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.feedback");
        C49520tu6.show$default(editText, z, 0, 2, null);
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: y1 */
    public void mo21878y1(Function0<Unit> onYes, Function0<Unit> onNo) {
        Intrinsics.checkNotNullParameter(onYes, "onYes");
        Intrinsics.checkNotNullParameter(onNo, "onNo");
        if (!getActivity().isFinishing()) {
            MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(getActivity(), null, 2, null), Integer.valueOf(C45871nl4.rate_app_title), null, 2, null), Integer.valueOf(C45871nl4.rate_app_question), null, null, 6, null), Integer.valueOf(C45871nl4.rate_app_yes), null, new C26805c(onYes), 2, null), Integer.valueOf(C45871nl4.rate_app_no), null, new C26806d(onNo), 2, null).show();
        }
    }

    @Override // p000.InterfaceC42493i35
    /* renamed from: y4 */
    public Observable<Unit> mo21877y4() {
        SelectableButtonV2 selectableButtonV2 = this.f101271c.f27859e;
        Intrinsics.checkNotNullExpressionValue(selectableButtonV2, "binding.otherButton");
        return C44626lf5.clicksThrottle$default(selectableButtonV2, 0L, 1, null);
    }
}
