package co.bird.android.app.feature.autopay;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.autopay.InterfaceC13676b;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\b\b\u0001\u0010*\u001a\u00020)\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b+\u0010,J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001c\u0010\u0017\u001a\u00020\u0007*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010&\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010(\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006-"}, m28432d2 = {"Lco/bird/android/app/feature/autopay/c;", "LxE;", "Lco/bird/android/app/feature/autopay/b;", "", "amount", "Ljava/util/Currency;", "currency", "", "Lb", "Lio/reactivex/Observable;", "t3", "l1", "", "show", "", "hiddenState", "showProgress", "Lco/bird/android/app/feature/autopay/b$a;", "autoPayContext", "Ql", "Landroid/view/View;", "width", "height", "Pl", "b", "Landroid/view/View;", "rootView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "graphic", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "title", "e", "description", "f", "agreeButton", "g", "cancelButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.autopay.c */
/* loaded from: classes2.dex */
public final class C13678c extends AbstractC30071xE implements InterfaceC13676b {

    /* renamed from: b */
    public final View f61299b;

    /* renamed from: c */
    public final ImageView f61300c;

    /* renamed from: d */
    public final TextView f61301d;

    /* renamed from: e */
    public final TextView f61302e;

    /* renamed from: f */
    public final View f61303f;

    /* renamed from: g */
    public final View f61304g;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.autopay.c$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C13679a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC13676b.EnumC13677a.values().length];
            try {
                iArr[InterfaceC13676b.EnumC13677a.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC13676b.EnumC13677a.ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C13678c(BaseActivity baseActivity, View view, InterfaceC13676b.EnumC13677a enumC13677a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, view, (i & 4) != 0 ? InterfaceC13676b.EnumC13677a.ACTIVITY : enumC13677a);
        if ((i & 2) != 0) {
            view = baseActivity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(view, "activity.window.decorView");
        }
    }

    @Override // co.bird.android.app.feature.autopay.InterfaceC13676b
    /* renamed from: Lb */
    public void mo60814Lb(long j, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        this.f61302e.setText(getActivity().getResources().getString(C45871nl4.autopay_description, c51916xx1.m4408d(j, currency, EnumC36501Ux1.SHOW_IF_NON_ZERO), c51916xx1.m4408d(0L, currency, EnumC36501Ux1.SHOW_NEVER)));
    }

    /* renamed from: Pl */
    public final void m60813Pl(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (view.getLayoutParams() == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i2);
        } else {
            view.getLayoutParams().width = i;
            view.getLayoutParams().height = i2;
            layoutParams = view.getLayoutParams();
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: Ql */
    public final void m60812Ql(InterfaceC13676b.EnumC13677a enumC13677a) {
        int i = C13679a.$EnumSwitchMapping$0[enumC13677a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m60813Pl(this.f61299b, -1, -1);
                this.f61301d.setTextSize(2, 18.0f);
                ViewGroup.LayoutParams layoutParams = this.f61300c.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.f53965U = (int) TypedValue.applyDimension(1, 103.0f, getActivity().getResources().getDisplayMetrics());
                layoutParams2.f53974b0 = true;
                this.f61300c.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        m60813Pl(this.f61299b, -1, -2);
        this.f61301d.setTextSize(2, 16.0f);
        ViewGroup.LayoutParams layoutParams3 = this.f61300c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.f53965U = (int) TypedValue.applyDimension(1, 103.0f, getActivity().getResources().getDisplayMetrics());
        this.f61300c.setLayoutParams(layoutParams4);
    }

    @Override // co.bird.android.app.feature.autopay.InterfaceC13676b
    /* renamed from: l1 */
    public Observable<Unit> mo60811l1() {
        return C44626lf5.clicksThrottle$default(this.f61304g, 0L, 1, null);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        C49520tu6.m11232s(C49520tu6.m11243h(this.f61299b, C36585Vg4.progressBar), z, 4);
        this.f61303f.setClickable(!z);
        this.f61304g.setClickable(!z);
    }

    @Override // co.bird.android.app.feature.autopay.InterfaceC13676b
    /* renamed from: t3 */
    public Observable<Unit> mo60810t3() {
        return C44626lf5.clicksThrottle$default(this.f61303f, 0L, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13678c(BaseActivity activity, View rootView, InterfaceC13676b.EnumC13677a autoPayContext) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(autoPayContext, "autoPayContext");
        this.f61299b = rootView;
        ImageView imageView = (ImageView) C49520tu6.m11243h(rootView, C36585Vg4.graphic);
        this.f61300c = imageView;
        this.f61301d = (TextView) C49520tu6.m11243h(rootView, C36585Vg4.title);
        this.f61302e = (TextView) C49520tu6.m11243h(rootView, C36585Vg4.description);
        this.f61303f = C49520tu6.m11243h(rootView, C36585Vg4.agreeButton);
        this.f61304g = C49520tu6.m11243h(rootView, C36585Vg4.cancelButton);
        imageView.setLayerType(1, null);
        m60812Ql(autoPayContext);
    }
}
