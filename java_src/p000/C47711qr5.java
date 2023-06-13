package p000;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Country;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00060\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"Lqr5;", "LxE;", "Lpr5;", "", "init", "", "Lco/bird/android/model/Country;", "countries", "md", "Lio/reactivex/Observable;", "r6", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LrD0;", "c", "LrD0;", "adapter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "countryClicks", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qr5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47711qr5 extends AbstractC30071xE implements InterfaceC47118pr5 {

    /* renamed from: b */
    public final RecyclerView f105934b;

    /* renamed from: c */
    public C47922rD0 f105935c;

    /* renamed from: d */
    public final C24558d<Country> f105936d;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lco/bird/android/model/Country;", "item", "", C17296a.f69688o, "(Landroid/view/View;ILco/bird/android/model/Country;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qr5$a */
    /* loaded from: classes2.dex */
    public static final class C27710a extends Lambda implements Function3<View, Integer, Country, Unit> {
        public C27710a() {
            super(3);
        }

        /* renamed from: a */
        public final void m16905a(View view, int i, Country item) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(item, "item");
            C47711qr5.this.f105936d.onNext(item);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, Country country) {
            m16905a(view, num.intValue(), country);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47711qr5(BaseActivity activity, RecyclerView recyclerView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f105934b = recyclerView;
        C24558d<Country> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Country>()");
        this.f105936d = m31902e;
    }

    @Override // p000.InterfaceC47118pr5
    public void init() {
        this.f105935c = new C47922rD0(getActivity());
        this.f105934b.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f105934b.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        this.f105934b.addItemDecoration(new FN5(getActivity(), C37044Xf4.card_spacing));
        RecyclerView recyclerView = this.f105934b;
        C47922rD0 c47922rD0 = this.f105935c;
        C47922rD0 c47922rD02 = null;
        if (c47922rD0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c47922rD0 = null;
        }
        recyclerView.setAdapter(c47922rD0);
        C47922rD0 c47922rD03 = this.f105935c;
        if (c47922rD03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            c47922rD02 = c47922rD03;
        }
        c47922rD02.m44888y(new C27710a());
    }

    @Override // p000.InterfaceC47118pr5
    /* renamed from: md */
    public void mo16907md(List<Country> countries) {
        List mutableList;
        Intrinsics.checkNotNullParameter(countries, "countries");
        C47922rD0 c47922rD0 = this.f105935c;
        if (c47922rD0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c47922rD0 = null;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) countries);
        c47922rD0.m44899C(mutableList);
    }

    @Override // p000.InterfaceC47118pr5
    /* renamed from: r6 */
    public Observable<Country> mo16906r6() {
        Observable<Country> hide = this.f105936d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "countryClicks.hide()");
        return hide;
    }
}
