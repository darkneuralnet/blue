package p000;

import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.PropertyReportActionOption;
import co.bird.android.model.PropertyReportNextStepOption;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b8\u00109J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0002R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00103\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00040\u0004008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102R\"\u00105\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\n0\n008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102¨\u0006:"}, m28432d2 = {"LA94;", "LxE;", "Lz94;", "", "Lco/bird/android/model/PropertyReportActionOption;", "actions", "", "Ub", "Lio/reactivex/Observable;", "G6", "Lco/bird/android/model/PropertyReportNextStepOption;", "nextSteps", "Nc", "I6", "e", "", "count", "zl", "", "Pf", "(Ljava/lang/Integer;)V", "Landroid/text/Spanned;", "detail", "ld", "urls", "w6", "U", "", "enabled", "p", "Pl", "Ql", "LU4;", "b", "LU4;", "binding", "Lc94;", "c", "Lc94;", "getActionOptionAdapter", "()Lc94;", "actionOptionAdapter", "Le94;", DateTokenConverter.CONVERTER_KEY, "Le94;", "getNextStepOptionAdapter", "()Le94;", "nextStepOptionAdapter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "actionOptionClicks", "f", "nextStepOptionClicks", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LU4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPropertyReportUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyReportUi.kt\nco/bird/android/app/feature/propertyreport/PropertyReportUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1855#2,2:126\n*S KotlinDebug\n*F\n+ 1 PropertyReportUi.kt\nco/bird/android/app/feature/propertyreport/PropertyReportUiImpl\n*L\n90#1:126,2\n*E\n"})
/* renamed from: A94 */
/* loaded from: classes2.dex */
public final class A94 extends AbstractC30071xE implements InterfaceC52631z94 {

    /* renamed from: b */
    public final C8187U4 f204b;

    /* renamed from: c */
    public final C38977c94 f205c;

    /* renamed from: d */
    public final C40180e94 f206d;

    /* renamed from: e */
    public final C24558d<PropertyReportActionOption> f207e;

    /* renamed from: f */
    public final C24558d<PropertyReportNextStepOption> f208f;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lco/bird/android/model/PropertyReportActionOption;", "item", "", C17296a.f69688o, "(Landroid/view/View;ILco/bird/android/model/PropertyReportActionOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: A94$a */
    /* loaded from: classes2.dex */
    public static final class C0043a extends Lambda implements Function3<View, Integer, PropertyReportActionOption, Unit> {
        public C0043a() {
            super(3);
        }

        /* renamed from: a */
        public final void m116057a(View view, int i, PropertyReportActionOption item) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(item, "item");
            A94.this.f207e.onNext(item);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, PropertyReportActionOption propertyReportActionOption) {
            m116057a(view, num.intValue(), propertyReportActionOption);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lco/bird/android/model/PropertyReportNextStepOption;", "item", "", C17296a.f69688o, "(Landroid/view/View;ILco/bird/android/model/PropertyReportNextStepOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: A94$b */
    /* loaded from: classes2.dex */
    public static final class C0044b extends Lambda implements Function3<View, Integer, PropertyReportNextStepOption, Unit> {
        public C0044b() {
            super(3);
        }

        /* renamed from: a */
        public final void m116056a(View view, int i, PropertyReportNextStepOption item) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(item, "item");
            A94.this.f208f.onNext(item);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, PropertyReportNextStepOption propertyReportNextStepOption) {
            m116056a(view, num.intValue(), propertyReportNextStepOption);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A94(BaseActivity activity, C8187U4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f204b = binding;
        this.f205c = new C38977c94(activity);
        this.f206d = new C40180e94(activity);
        C24558d<PropertyReportActionOption> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<PropertyReportActionOption>()");
        this.f207e = m31902e;
        C24558d<PropertyReportNextStepOption> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<PropertyReportNextStepOption>()");
        this.f208f = m31902e2;
        binding.f36796s.setButtonEnabled(false);
        m116059Pl();
        m116058Ql();
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: G6 */
    public Observable<PropertyReportActionOption> mo1750G6() {
        Observable<PropertyReportActionOption> hide = this.f207e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "actionOptionClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: I6 */
    public Observable<PropertyReportNextStepOption> mo1749I6() {
        Observable<PropertyReportNextStepOption> hide = this.f208f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nextStepOptionClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: Nc */
    public void mo1748Nc(List<PropertyReportNextStepOption> nextSteps) {
        Intrinsics.checkNotNullParameter(nextSteps, "nextSteps");
        this.f206d.m44899C(nextSteps);
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: Pf */
    public void mo1747Pf(Integer num) {
        this.f204b.f36786i.setText(num != null ? num.toString() : null);
    }

    /* renamed from: Pl */
    public final void m116059Pl() {
        this.f204b.f36779b.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f204b.f36779b.setAdapter(this.f205c);
        this.f205c.m44888y(new C0043a());
    }

    /* renamed from: Ql */
    public final void m116058Ql() {
        this.f204b.f36782e.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f204b.f36782e.setAdapter(this.f206d);
        this.f206d.m44888y(new C0044b());
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: U */
    public String mo1746U() {
        return this.f204b.f36780c.getText().toString();
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: Ub */
    public void mo1745Ub(List<PropertyReportActionOption> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f205c.m44899C(actions);
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: e */
    public Observable<Unit> mo1744e() {
        return this.f204b.f36796s.m54693b();
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: ld */
    public void mo1743ld(Spanned spanned) {
        this.f204b.f36793p.setText(spanned);
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: p */
    public void mo1742p(boolean z) {
        this.f204b.f36796s.setButtonEnabled(z);
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: w6 */
    public void mo1741w6(List<String> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = getActivity().getResources().getDimensionPixelSize(C37044Xf4.property_report_photo_item_distance);
        for (String str : urls) {
            ImageView imageView = new ImageView(getActivity());
            ComponentCallbacks2C17096a.m53137u(imageView).m81653k(str).m16096R0(imageView);
            LinearLayout linearLayout = this.f204b.f36790m;
            linearLayout.addView(imageView, linearLayout.getChildCount() - 1, layoutParams);
        }
    }

    @Override // p000.InterfaceC52631z94
    /* renamed from: zl */
    public void mo1740zl(String str) {
        this.f204b.f36788k.setText(str);
    }
}
