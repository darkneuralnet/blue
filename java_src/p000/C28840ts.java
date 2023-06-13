package p000;

import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.autopayv2plan.PlanLayout;
import co.bird.android.autopayv2plan.PlanLayoutItem;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.PlanItemModel;
import co.bird.android.model.constant.AutoPayPaymentType;
import co.bird.android.widget.CallToActionLayout;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabLayout;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C28840ts;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u00107\u001a\u000204\u0012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0015¢\u0006\u0004\bX\u0010YJ\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016J\u001a\u0010#\u001a\u00020\n2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001aH\u0016J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001aH\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\rH\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u0012\u00102\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020\u001aH\u0016J\u0010\u00103\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010=\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R!\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010@R\"\u0010F\u001a\u0010\u0012\f\u0012\n C*\u0004\u0018\u00010\n0\n0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010P¨\u0006Z"}, m28432d2 = {"Lts;", "LxE;", "Lqs;", "", "Lio/reactivex/Observable;", "Lco/bird/android/model/PlanItemModel;", "j2", "Lz24;", "b0", TransferTable.COLUMN_STATE, "", "jb", "Rg", "", "show", "Yc", DateTokenConverter.CONVERTER_KEY, "J", "mk", AbstractC3831J1.f16564d, "Q", "", "plans", "xe", "plan", "Yd", "", "balance", "Ia", "F9", "", "resId", "reloadValue", "S3", "addTermsAndConditionsLink", "Gh", "Ej", "n6", "E", "title", "vi", "y", "bonusAmount", "currency", "Y4", "enabled", "p0", "A", "token", "LG10;", "R", "S", "LT2;", "b", "LT2;", "binding", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "Rl", "()Landroid/widget/LinearLayout;", "containerView", "Lkotlin/Lazy;", "Sl", "()Lio/reactivex/Observable;", "planSelects", "Lma4;", "kotlin.jvm.PlatformType", "e", "Lma4;", "termsAndConditionsClicks", "Lco/bird/android/widget/CallToActionLayout;", "f", "Lco/bird/android/widget/CallToActionLayout;", "callToAction", "g", "Lz24;", "primaryButtonState", "Landroid/view/View;", "h", "Landroid/view/View;", "googleButtonView", "i", "paypalButtonView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/model/constant/AutoPayPaymentType;", "orderedButtonList", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LT2;Ljava/util/List;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoPayV2Ui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPayV2Ui.kt\nco/bird/android/app/feature/autopay/AutoPayV2UiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1864#2,3:239\n1855#2,2:242\n1#3:244\n*S KotlinDebug\n*F\n+ 1 AutoPayV2Ui.kt\nco/bird/android/app/feature/autopay/AutoPayV2UiImpl\n*L\n90#1:239,3\n149#1:242,2\n*E\n"})
/* renamed from: ts */
/* loaded from: classes2.dex */
public final class C28840ts extends AbstractC30071xE implements InterfaceC27711qs {

    /* renamed from: b */
    public final C7642T2 f111161b;

    /* renamed from: c */
    public final LinearLayout f111162c;

    /* renamed from: d */
    public final Lazy f111163d;

    /* renamed from: e */
    public final C45168ma4<Unit> f111164e;

    /* renamed from: f */
    public final CallToActionLayout f111165f;

    /* renamed from: g */
    public EnumC52561z24 f111166g;

    /* renamed from: h */
    public View f111167h;

    /* renamed from: i */
    public View f111168i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28841a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AutoPayPaymentType.values().length];
            try {
                iArr[AutoPayPaymentType.PAYPAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoPayPaymentType.GOOGLE_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC52561z24.values().length];
            try {
                iArr2[EnumC52561z24.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC52561z24.PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/PlanItemModel;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts$b */
    /* loaded from: classes2.dex */
    public static final class C28842b extends Lambda implements Function0<Observable<PlanItemModel>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/material/tabs/TabLayout$g;", "tab", "Lco/bird/android/model/PlanItemModel;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/google/android/material/tabs/TabLayout$g;)Lco/bird/android/model/PlanItemModel;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts$b$a */
        /* loaded from: classes2.dex */
        public static final class C28843a extends Lambda implements Function1<TabLayout.C17910g, PlanItemModel> {

            /* renamed from: g */
            public static final C28843a f111170g = new C28843a();

            public C28843a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final PlanItemModel invoke(TabLayout.C17910g tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                View m48718e = tab.m48718e();
                Intrinsics.checkNotNull(m48718e, "null cannot be cast to non-null type co.bird.android.autopayv2plan.PlanLayoutItem");
                return ((PlanLayoutItem) m48718e).m59110b();
            }
        }

        public C28842b() {
            super(0);
        }

        /* renamed from: c */
        public static final PlanItemModel m11553c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (PlanItemModel) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<PlanItemModel> invoke() {
            PlanLayout planLayout = C28840ts.this.f111161b.f34683j;
            Intrinsics.checkNotNullExpressionValue(planLayout, "binding.planContainer");
            Observable<TabLayout.C17910g> m61081a = C39272cf5.m61081a(planLayout);
            final C28843a c28843a = C28843a.f111170g;
            return m61081a.map(new InterfaceC23492o() { // from class: us
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    PlanItemModel m11553c;
                    m11553c = C28840ts.C28842b.m11553c(Function1.this, obj);
                    return m11553c;
                }
            }).replay(1).m32084i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lz24;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lz24;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts$c */
    /* loaded from: classes2.dex */
    public static final class C28844c extends Lambda implements Function1<Unit, EnumC52561z24> {
        public C28844c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC52561z24 invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28840ts.this.f111166g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"ts$d", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ts$d */
    /* loaded from: classes2.dex */
    public static final class C28845d extends ClickableSpan {
        public C28845d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C28840ts.this.f111164e.accept(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28840ts(BaseActivity activity, C7642T2 binding, List<? extends AutoPayPaymentType> orderedButtonList) {
        super(activity);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(orderedButtonList, "orderedButtonList");
        this.f111161b = binding;
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        this.f111162c = root;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C28842b());
        this.f111163d = lazy;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f111164e = m25409g;
        CallToActionLayout callToActionLayout = binding.f34675b;
        Intrinsics.checkNotNullExpressionValue(callToActionLayout, "binding.autoPayV2Root");
        this.f111165f = callToActionLayout;
        this.f111166g = EnumC52561z24.PAYMENT;
        int i = 0;
        for (Object obj : orderedButtonList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int i3 = C28841a.$EnumSwitchMapping$0[((AutoPayPaymentType) obj).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f111167h = this.f111165f.m54692c(C39311cj4.googlepay_button, i);
                }
            } else {
                this.f111168i = this.f111165f.m54692c(C39311cj4.paypal_button, i);
            }
            i = i2;
        }
    }

    /* renamed from: Tl */
    public static final EnumC52561z24 m11570Tl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (EnumC52561z24) tmp0.invoke(obj);
    }

    /* renamed from: Ul */
    public static final void m11569Ul(C28840ts this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f111165f.setButtonsEnabled(z);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: A */
    public Observable<Unit> mo11587A() {
        Observable<Unit> clicksThrottle$default;
        View view = this.f111168i;
        if (view == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(view, 0L, 1, null)) == null) {
            Observable<Unit> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
            return empty;
        }
        return clicksThrottle$default;
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: E */
    public void mo11586E(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getString(i));
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: Ej */
    public void mo11585Ej(boolean z) {
        this.f111165f.setButtonsLabelVisibility(z);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: F9 */
    public void mo11584F9(boolean z) {
        this.f111165f.setSecondaryButtonVisibility(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC27711qs
    /* renamed from: Gh */
    public void mo11583Gh(int i, boolean z) {
        String string = getActivity().getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getString(resId)");
        if (z) {
            String string2 = getActivity().getResources().getString(C45871nl4.terms_and_conditions_apply);
            Intrinsics.checkNotNullExpressionValue(string2, "activity.resources.getSt…rms_and_conditions_apply)");
            SpannableString spannableString = new SpannableString(string + " " + string2);
            spannableString.setSpan(new C28845d(), string.length() + 1, spannableString.length(), 17);
            string = spannableString;
        }
        this.f111165f.setButtonsLabel(string);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: Ia */
    public void mo11582Ia(String balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f111161b.f34678e.setText(balance);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: J */
    public Observable<Unit> mo11581J() {
        Observable<Unit> clicksThrottle$default;
        View view = this.f111167h;
        if (view == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(view, 0L, 1, null)) == null) {
            Observable<Unit> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
            return empty;
        }
        return clicksThrottle$default;
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: J1 */
    public void mo11580J1(boolean z) {
        ImageView imageView = this.f111161b.f34681h;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.gift");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        ImageView imageView2 = this.f111161b.f34682i;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.giftBlueDot");
        C49520tu6.show$default(imageView2, z, 0, 2, null);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: Q */
    public Observable<Unit> mo11578Q() {
        ImageView imageView = this.f111161b.f34681h;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.gift");
        return C44626lf5.clicksThrottle$default(imageView, 0L, 1, null);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: R */
    public G10 mo11576R(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        try {
            return G10.m105957sa(getActivity(), token);
        } catch (InvalidArgumentException e) {
            C41318g46.m40158f(e, "There was an issue with the authorization string.", new Object[0]);
            return null;
        }
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: Rg */
    public void mo11575Rg(EnumC52561z24 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = C28841a.$EnumSwitchMapping$1[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f111165f.setButtonText(C45871nl4.autopay_v2_call_to_action);
                return;
            }
            return;
        }
        this.f111165f.setButtonText(C45871nl4.autopay_v2_call_to_action_continue);
    }

    /* renamed from: Rl */
    public LinearLayout getContainerView() {
        return this.f111162c;
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: S */
    public void mo11573S(boolean z) {
        View view = this.f111168i;
        if (view != null) {
            C49520tu6.show$default(view, z, 0, 2, null);
        }
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: S3 */
    public void mo11572S3(int i, String reloadValue) {
        Intrinsics.checkNotNullParameter(reloadValue, "reloadValue");
        this.f111161b.f34680g.setText(getActivity().getResources().getString(i, reloadValue));
    }

    /* renamed from: Sl */
    public final Observable<PlanItemModel> m11571Sl() {
        Object value = this.f111163d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-planSelects>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: Y4 */
    public void mo11568Y4(int i, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f111161b.f34677d.setText(getActivity().getString(C45871nl4.autopay_v2_google_pay_bonus, C51916xx1.f118396a.m4408d(i, C45097mS5.m25591o(currency), EnumC36501Ux1.SHOW_IF_NON_ZERO)));
        LinearLayout linearLayout = this.f111161b.f34676c;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.bonusContainer");
        C49520tu6.m11233r(linearLayout);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: Yc */
    public void mo11567Yc(boolean z) {
        this.f111165f.setButtonVisibility(z);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: Yd */
    public void mo11566Yd(PlanItemModel planItemModel) {
        String planId;
        if (planItemModel == null || (planId = planItemModel.getPlanId()) == null) {
            return;
        }
        this.f111161b.f34683j.m59113d0(planId);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: b0 */
    public Observable<EnumC52561z24> mo11565b0() {
        Observable<Unit> m54693b = this.f111165f.m54693b();
        final C28844c c28844c = new C28844c();
        Observable map = m54693b.map(new InterfaceC23492o() { // from class: ss
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC52561z24 m11570Tl;
                m11570Tl = C28840ts.m11570Tl(Function1.this, obj);
                return m11570Tl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun primaryButt… primaryButtonState }\n  }");
        return map;
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: d */
    public Observable<Unit> mo11564d() {
        return this.f111165f.m54687h();
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: j2 */
    public Observable<PlanItemModel> mo11563j2() {
        return m11571Sl();
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: jb */
    public void mo11562jb(EnumC52561z24 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f111166g = state;
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: mk */
    public Observable<Unit> mo11561mk() {
        Observable<Unit> hide = this.f111164e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "termsAndConditionsClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: n6 */
    public void mo11560n6(int i) {
        this.f111165f.setSecondaryButtonText(i);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: p0 */
    public void mo11559p0(final boolean z) {
        getHandler().postDelayed(new Runnable() { // from class: rs
            @Override // java.lang.Runnable
            public final void run() {
                C28840ts.m11569Ul(C28840ts.this, z);
            }
        }, 100L);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: vi */
    public void mo11558vi(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f111161b.f34684k.setText(title);
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: xe */
    public void mo11557xe(List<PlanItemModel> plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f111161b.f34683j.m48803O();
        for (PlanItemModel planItemModel : plans) {
            PlanLayout planLayout = this.f111161b.f34683j;
            planLayout.m48781i(planLayout.m59114c0(planItemModel));
        }
    }

    @Override // p000.InterfaceC27711qs
    /* renamed from: y */
    public void mo11556y(boolean z) {
        View view = this.f111167h;
        if (view != null) {
            C49520tu6.show$default(view, z, 0, 2, null);
        }
    }
}
