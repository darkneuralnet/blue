package p000;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideStatusBottomSheetButton;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\b0\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"LMH2;", "LxE;", "", "LH6;", "sections", "", "o", "Lio/reactivex/Observable;", "Lco/bird/android/model/RideStatusBottomSheetButton;", "B1", "", "rideId", "", "Pl", "dismissDialog", "LwH2;", "b", "LwH2;", "getDialog", "()LwH2;", "dialog", "LpH2;", "c", "LpH2;", "adapter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "buttonSubject", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LwH2;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MH2 */
/* loaded from: classes3.dex */
public final class MH2 extends AbstractC30071xE {

    /* renamed from: b */
    public final C50923wH2 f22944b;

    /* renamed from: c */
    public final C46774pH2 f22945c;

    /* renamed from: d */
    public final C24558d<RideStatusBottomSheetButton> f22946d;

    /* renamed from: e */
    public final RecyclerView f22947e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MH2$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5266a extends FunctionReferenceImpl implements Function1<RideStatusBottomSheetButton, Unit> {
        public C5266a(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m95453a(RideStatusBottomSheetButton p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusBottomSheetButton rideStatusBottomSheetButton) {
            m95453a(rideStatusBottomSheetButton);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MH2(BaseActivity activity, C50923wH2 dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f22944b = dialog;
        C46774pH2 c46774pH2 = new C46774pH2();
        this.f22945c = c46774pH2;
        C24558d<RideStatusBottomSheetButton> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<RideStatusBottomSheetButton>()");
        this.f22946d = m31902e;
        View view = dialog.getView();
        Intrinsics.checkNotNull(view);
        RecyclerView recyclerView = (RecyclerView) C49520tu6.m11243h(view, C36828Wh4.recyclerView);
        this.f22947e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(c46774pH2);
        c46774pH2.m19574x(new C5266a(m31902e));
    }

    /* renamed from: B1 */
    public final Observable<RideStatusBottomSheetButton> m95456B1() {
        Observable<RideStatusBottomSheetButton> hide = this.f22946d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "buttonSubject.hide()");
        return hide;
    }

    /* renamed from: Pl */
    public final boolean m95455Pl(String str) {
        return this.f22945c.m19575w(str);
    }

    @Override // p000.AbstractC9344XC, p000.H31
    public void dismissDialog() {
        this.f22944b.dismiss();
    }

    /* renamed from: o */
    public final void m95454o(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f22945c.mo24871u(sections);
    }
}
