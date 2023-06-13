package p000;

import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m28432d2 = {"LDH3;", "LxE;", "LCH3;", "", "Rj", "z6", "Lio/reactivex/Observable;", "u", "ma", "LI4;", "b", "LI4;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LI4;)V", "c", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DH3 */
/* loaded from: classes2.dex */
public final class DH3 extends AbstractC30071xE implements CH3 {

    /* renamed from: c */
    public static final C1440a f5484c = new C1440a(null);

    /* renamed from: d */
    public static final int f5485d = 8;

    /* renamed from: b */
    public final C3319I4 f5486b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LDH3$a;", "", "", "LOTTIE_ANIMATION_URL", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: DH3$a */
    /* loaded from: classes2.dex */
    public static final class C1440a {
        public /* synthetic */ C1440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1440a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH3(BaseActivity activity, C3319I4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f5486b = binding;
    }

    @Override // p000.CH3
    /* renamed from: Rj */
    public void mo110614Rj() {
        this.f5486b.f14425d.setAnimationFromUrl("https://static.bird.co/cruiser_street_parking_reminder.json");
        this.f5486b.f14425d.setRepeatCount(-1);
        this.f5486b.f14425d.m53539y();
    }

    @Override // p000.CH3
    /* renamed from: ma */
    public Observable<Unit> mo110613ma() {
        Button button = this.f5486b.f14424c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.parkingLearnMoreButton");
        return C45219mf5.m25214a(button);
    }

    @Override // p000.CH3
    /* renamed from: u */
    public Observable<Unit> mo110612u() {
        Button button = this.f5486b.f14426e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.parkingNextButton");
        return C45219mf5.m25214a(button);
    }

    @Override // p000.CH3
    /* renamed from: z6 */
    public void mo110611z6() {
        this.f5486b.f14430i.setText(getActivity().getString(C45871nl4.parking_rules_title_moped));
        this.f5486b.f14428g.setText(getActivity().getString(C45871nl4.parking_rules_body_moped));
        this.f5486b.f14429h.setText(getActivity().getString(C45871nl4.parking_rules_no_longer_charged));
    }
}
