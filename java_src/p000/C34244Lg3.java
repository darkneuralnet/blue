package p000;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.afollestad.materialdialogs.MaterialDialog;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Currency;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\"\u0010$\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00040\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\"\u0010)\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00040\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001c¨\u0006/"}, m28432d2 = {"LLg3;", "LKg3;", "", "seconds", "", "G0", "", "show", "B0", "baseCost", "perMinuteCost", "Ljava/util/Currency;", "currency", "A0", "D0", "Lzg3;", C17296a.f69688o, "Lzg3;", "binding", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/Observable;", "c", "Lio/reactivex/Observable;", "C0", "()Lio/reactivex/Observable;", "positiveClicks", DateTokenConverter.CONVERTER_KEY, "E0", "negativeClicks", "Lio/reactivex/subjects/d;", "e", "Lio/reactivex/subjects/d;", "_feedbackClicks", "f", "F0", "feedbackClicks", "g", "_cancelClicks", "h", "z0", "cancelClicks", "<init>", "(Lzg3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lg3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34244Lg3 implements InterfaceC34010Kg3 {

    /* renamed from: a */
    public final C52934zg3 f21893a;

    /* renamed from: b */
    public final Context f21894b;

    /* renamed from: c */
    public final Observable<Unit> f21895c;

    /* renamed from: d */
    public final Observable<Unit> f21896d;

    /* renamed from: e */
    public final C24558d<Unit> f21897e;

    /* renamed from: f */
    public final Observable<Unit> f21898f;

    /* renamed from: g */
    public final C24558d<Unit> f21899g;

    /* renamed from: h */
    public final Observable<Unit> f21900h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Lg3$a */
    /* loaded from: classes2.dex */
    public static final class C5061a extends Lambda implements Function1<MaterialDialog, Unit> {
        public C5061a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            dialog.dismiss();
            C34244Lg3.this.f21899g.onNext(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Lg3$b */
    /* loaded from: classes2.dex */
    public static final class C5062b extends Lambda implements Function1<MaterialDialog, Unit> {
        public C5062b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MaterialDialog materialDialog) {
            invoke2(materialDialog);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MaterialDialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            dialog.dismiss();
            C34244Lg3.this.f21897e.onNext(Unit.INSTANCE);
        }
    }

    public C34244Lg3(C52934zg3 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f21893a = binding;
        this.f21894b = binding.getRoot().getContext();
        Button button = binding.f122063f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.positiveButton");
        this.f21895c = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        Button button2 = binding.f122062e;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.negativeButton");
        this.f21896d = C44626lf5.clicksThrottle$default(button2, 0L, 1, null);
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f21897e = m31902e;
        Observable<Unit> hide = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "_feedbackClicks.hide()");
        this.f21898f = hide;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f21899g = m31902e2;
        Observable<Unit> hide2 = m31902e2.hide();
        Intrinsics.checkNotNullExpressionValue(hide2, "_cancelClicks.hide()");
        this.f21900h = hide2;
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: A0 */
    public void mo96482A0(int i, int i2, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        TextView textView = this.f21893a.f122066i;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        long j = i;
        EnumC36501Ux1 enumC36501Ux1 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
        textView.setText(c51916xx1.m4408d(j, currency, enumC36501Ux1));
        this.f21893a.f122065h.setText(this.f21894b.getString(C45871nl4.on_demand_viability_test_price_subtitle, c51916xx1.m4408d(i2, currency, enumC36501Ux1)));
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: B0 */
    public void mo96481B0(boolean z) {
        Group group = this.f21893a.f122064g;
        Intrinsics.checkNotNullExpressionValue(group, "binding.priceGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: C0 */
    public Observable<Unit> mo96480C0() {
        return this.f21895c;
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: D0 */
    public void mo96479D0() {
        Context context = this.f21894b;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        MaterialDialog.title$default(MaterialDialog.message$default(MaterialDialog.positiveButton$default(MaterialDialog.negativeButton$default(new MaterialDialog(context, null, 2, null).cancelable(false), 17039360, null, new C5061a(), 2, null), Integer.valueOf(C45871nl4.on_demand_feedback_dialog_feedback_button), null, new C5062b(), 2, null), Integer.valueOf(C45871nl4.on_demand_feedback_dialog_subtitle), null, null, 6, null), Integer.valueOf(C45871nl4.on_demand_feedback_dialog_title), null, 2, null).show();
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: E0 */
    public Observable<Unit> mo96478E0() {
        return this.f21896d;
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: F0 */
    public Observable<Unit> mo96477F0() {
        return this.f21898f;
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: G0 */
    public void mo96476G0(int i) {
        long minutes = TimeUnit.SECONDS.toMinutes(i);
        TextView textView = this.f21893a.f122059b;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = this.f21894b;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setText(c51916xx1.m4401k(context, (int) minutes, true));
    }

    @Override // p000.InterfaceC34010Kg3
    /* renamed from: z0 */
    public Observable<Unit> mo96475z0() {
        return this.f21900h;
    }
}
