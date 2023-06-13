package p000;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.widget.CallToActionLayout;
import com.airbnb.lottie.LottieAnimationView;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\"\u0010\u001c\u001a\u0004\u0018\u00010\u0016*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J&\u0010!\u001a\u00020\u0005*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00104\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/¨\u0006;"}, m28432d2 = {"LXL5;", "LWL5;", "LxE;", "", "resId", "", "Y", "", "show", "X4", "Lio/reactivex/Observable;", "b0", "zk", "wi", "b9", "layoutResId", "Lgx2;", "lockState", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Dc", "x9", "", "fineString", "kj", "Lm52;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Pl", "Landroid/widget/TextView;", "string", "bulletDrawableResId", "drawablePadding", "Ql", "Lcom/airbnb/lottie/LottieAnimationView;", "b", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimation", "Landroid/widget/ProgressBar;", "c", "Landroid/widget/ProgressBar;", "progressBar", "Lco/bird/android/widget/CallToActionLayout;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/CallToActionLayout;", "ctaLayout", "e", "Landroid/widget/TextView;", "instructionsTitle", "f", "instructionsBody", "g", "instructionsBody2", "h", "instructionsBody3", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockUnlockUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockUnlockUi.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,313:1\n1#2:314\n*E\n"})
/* renamed from: XL5 */
/* loaded from: classes2.dex */
public final class XL5 extends AbstractC30071xE implements WL5 {

    /* renamed from: b */
    public final LottieAnimationView f43006b;

    /* renamed from: c */
    public final ProgressBar f43007c;

    /* renamed from: d */
    public final CallToActionLayout f43008d;

    /* renamed from: e */
    public final TextView f43009e;

    /* renamed from: f */
    public final TextView f43010f;

    /* renamed from: g */
    public final TextView f43011g;

    /* renamed from: h */
    public final TextView f43012h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XL5(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f43006b = (LottieAnimationView) C40788fB0.m41779c(activity, C36585Vg4.lottieAnimation);
        ProgressBar progressBar = (ProgressBar) C40788fB0.m41779c(activity, C36585Vg4.progressBar);
        this.f43007c = progressBar;
        this.f43008d = (CallToActionLayout) C40788fB0.m41779c(activity, C36585Vg4.ctaLayout);
        this.f43009e = (TextView) C40788fB0.m41779c(activity, C36585Vg4.instructionsTitle);
        this.f43010f = (TextView) C40788fB0.m41779c(activity, C36585Vg4.instructionsBody);
        this.f43011g = (TextView) C40788fB0.m41779c(activity, C36585Vg4.instructionsBody2);
        this.f43012h = (TextView) C40788fB0.m41779c(activity, C36585Vg4.instructionsBody3);
        progressBar.setVisibility(8);
    }

    @Override // p000.WL5
    /* renamed from: Dc */
    public AbstractC23442F<DialogResponse> mo77096Dc(int i, EnumC41838gx2 lockState) {
        Intrinsics.checkNotNullParameter(lockState, "lockState");
        String string = getActivity().getString(lockState.m37292d());
        String string2 = getActivity().getString(lockState.m37294b());
        int i2 = C36585Vg4.smartlockUnlockDialogTitle;
        return H31.C3014a.dialog$default(this, i, Integer.valueOf(C36585Vg4.smartlockUnlockDialogConfirmButton), Integer.valueOf(C36585Vg4.smartlockUnlockDialogCancelButton), null, Integer.valueOf(i2), null, string2, null, null, string, null, true, false, false, null, 30120, null);
    }

    /* renamed from: Pl */
    public final String m77095Pl(C44882m52 c44882m52, Context context, String str) {
        if (c44882m52.m26363b() && str == null) {
            return null;
        }
        if (str != null) {
            return context.getString(c44882m52.m26362c(), str);
        }
        return context.getString(c44882m52.m26362c());
    }

    /* renamed from: Ql */
    public final void m77094Ql(TextView textView, String str, int i, int i2) {
        boolean z;
        textView.setText(str);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        textView.setCompoundDrawablePadding(i2);
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    @Override // p000.WL5
    /* renamed from: X4 */
    public void mo77093X4(boolean z) {
        if (z) {
            ActionBar supportActionBar = getActivity().getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo70212v(true);
            }
            getActivity().mo58977D();
            return;
        }
        ActionBar supportActionBar2 = getActivity().getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(false);
        }
    }

    @Override // p000.WL5
    /* renamed from: Y */
    public void mo77092Y(int i) {
        getActivity().setTitle(getActivity().getString(i));
    }

    @Override // p000.WL5
    /* renamed from: b0 */
    public Observable<Unit> mo77091b0() {
        return this.f43008d.m54693b();
    }

    @Override // p000.WL5
    /* renamed from: b9 */
    public void mo77090b9() {
        success(C45871nl4.smartlock_unlock_successful_toast);
    }

    @Override // p000.WL5
    /* renamed from: kj */
    public void mo77089kj(EnumC41838gx2 lockState, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        Object first;
        Object orNull;
        String str2;
        Object orNull2;
        int i;
        Intrinsics.checkNotNullParameter(lockState, "lockState");
        if (lockState.m37288h() != null) {
            this.f43006b.setAnimation(lockState.m37288h());
        } else if (lockState.m37287i() != null) {
            this.f43006b.setAnimationFromUrl(lockState.m37287i());
        } else if (lockState.m37291e() != null) {
            this.f43006b.setImageResource(lockState.m37291e().intValue());
        }
        this.f43008d.setButtonText(lockState.m37286j());
        CallToActionLayout callToActionLayout = this.f43008d;
        int i2 = 0;
        if (lockState.m37285k() != null) {
            z = true;
        } else {
            z = false;
        }
        callToActionLayout.setSecondaryButtonVisibility(z);
        Integer m37285k = lockState.m37285k();
        if (m37285k != null) {
            this.f43008d.setSecondaryButtonText(m37285k.intValue());
        }
        CallToActionLayout callToActionLayout2 = this.f43008d;
        if (lockState.m37284l() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        callToActionLayout2.setTertiaryButtonVisibility(z2);
        Integer m37284l = lockState.m37284l();
        if (m37284l != null) {
            this.f43008d.setTertiaryButtonText(m37284l.intValue());
        }
        Integer m37289g = lockState.m37289g();
        if (m37289g != null) {
            this.f43009e.setText(getActivity().getString(m37289g.intValue()));
        }
        TextView textView = this.f43009e;
        if (lockState.m37289g() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C49520tu6.m11232s(textView, z3, 4);
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) lockState.m37290f());
        String m77095Pl = m77095Pl((C44882m52) first, getActivity(), str);
        orNull = CollectionsKt___CollectionsKt.getOrNull(lockState.m37290f(), 1);
        C44882m52 c44882m52 = (C44882m52) orNull;
        String str3 = null;
        if (c44882m52 != null) {
            str2 = m77095Pl(c44882m52, getActivity(), str);
        } else {
            str2 = null;
        }
        orNull2 = CollectionsKt___CollectionsKt.getOrNull(lockState.m37290f(), 2);
        C44882m52 c44882m522 = (C44882m52) orNull2;
        if (c44882m522 != null) {
            str3 = m77095Pl(c44882m522, getActivity(), str);
        }
        if (str2 != null) {
            i = C48193rg4.ic_check_circle;
        } else {
            i = 0;
        }
        if (str2 != null) {
            i2 = (int) C40788fB0.m41780b(getActivity(), 8.0f);
        }
        m77094Ql(this.f43010f, m77095Pl, i, i2);
        m77094Ql(this.f43011g, str2, i, i2);
        m77094Ql(this.f43012h, str3, i, i2);
    }

    @Override // p000.WL5
    /* renamed from: wi */
    public Observable<Unit> mo77088wi() {
        return this.f43008d.m54686i();
    }

    @Override // p000.WL5
    /* renamed from: x9 */
    public AbstractC23442F<DialogResponse> mo77087x9(int i, EnumC41838gx2 lockState) {
        String str;
        Intrinsics.checkNotNullParameter(lockState, "lockState");
        String string = getActivity().getString(lockState.m37292d());
        Integer m37293c = lockState.m37293c();
        if (m37293c != null) {
            str = getActivity().getString(m37293c.intValue());
        } else {
            str = null;
        }
        String str2 = str;
        String string2 = getActivity().getString(lockState.m37294b());
        int i2 = C36585Vg4.smartlockLockDialogTitle;
        int i3 = C36585Vg4.smartlockLockDialogBody;
        return H31.C3014a.dialog$default(this, i, Integer.valueOf(C36585Vg4.smartlockLockDialogConfirmButton), Integer.valueOf(C36585Vg4.smartlockLockDialogCancelButton), null, Integer.valueOf(i2), Integer.valueOf(i3), string2, null, null, string, str2, true, false, false, null, 29064, null);
    }

    @Override // p000.WL5
    /* renamed from: zk */
    public Observable<Unit> mo77086zk() {
        return this.f43008d.m54687h();
    }
}
