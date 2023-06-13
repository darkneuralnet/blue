package p000;

import android.net.Uri;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.model.ReservationIssueOption;
import co.bird.android.model.ReservationIssueOptionKt;
import co.bird.android.widget.SelectableButton;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J \u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014 \u001d*\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00030\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LLK4;", "LxE;", "LKK4;", "", "Lkotlin/Pair;", "", "Lio/reactivex/Observable;", "", "x1", "e", "Lco/bird/android/model/ReservationIssueOption;", "issues", "S0", "value", "F0", "U", "", "enabled", "p", "g", "Landroid/net/Uri;", "v", "url", "j", "Lr5;", "b", "Lr5;", "binding", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "photosChangeSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lr5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReservationFeedbackUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReservationFeedbackUi.kt\nco/bird/android/app/feature/reservation/ui/ReservationFeedbackUiImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n125#2:81\n152#2,3:82\n1855#3,2:85\n*S KotlinDebug\n*F\n+ 1 ReservationFeedbackUi.kt\nco/bird/android/app/feature/reservation/ui/ReservationFeedbackUiImpl\n*L\n49#1:81\n49#1:82,3\n56#1:85,2\n*E\n"})
/* renamed from: LK4 */
/* loaded from: classes2.dex */
public final class LK4 extends AbstractC30071xE implements KK4 {

    /* renamed from: b */
    public final C27842r5 f21287b;

    /* renamed from: c */
    public final C24552a<List<Uri>> f21288c;

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"LK4$a", "Lco/bird/android/imageupload/ImageUploadBar$a;", "", "Landroid/net/Uri;", "photos", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: LK4$a */
    /* loaded from: classes2.dex */
    public static final class C4887a implements ImageUploadBar.InterfaceC15989a {
        public C4887a() {
        }

        @Override // co.bird.android.imageupload.ImageUploadBar.InterfaceC15989a
        /* renamed from: a */
        public void mo8628a(List<? extends Uri> photos) {
            Intrinsics.checkNotNullParameter(photos, "photos");
            LK4.this.f21288c.onNext(photos);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LK4(BaseActivity activity, C27842r5 binding) {
        super(activity);
        List emptyList;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f21287b = binding;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<Uri>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<Uri>>(listOf())");
        this.f21288c = m31921g;
        binding.f106439e.setTitle(C45871nl4.reservation_what_issue);
        binding.f106436b.setButtonEnabled(false);
        binding.f106437c.setPhotoChangedListener(new C4887a());
    }

    @Override // p000.KK4
    /* renamed from: F0 */
    public void mo97082F0(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SelectableButton selectableButton = this.f21287b.f106439e.m60715e().get(value);
        if (selectableButton != null) {
            selectableButton.m54392d();
        }
    }

    @Override // p000.KK4
    /* renamed from: S0 */
    public void mo97081S0(List<ReservationIssueOption> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        for (ReservationIssueOption reservationIssueOption : issues) {
            this.f21287b.f106439e.m60719a(ReservationIssueOptionKt.toComplaintOption(reservationIssueOption), C37044Xf4.reservation_option_button_width);
        }
    }

    @Override // p000.KK4
    /* renamed from: U */
    public String mo97080U() {
        return this.f21287b.f106438d.getText().toString();
    }

    @Override // p000.KK4
    /* renamed from: e */
    public Observable<Unit> mo97079e() {
        return this.f21287b.f106436b.m54693b();
    }

    @Override // p000.KK4
    /* renamed from: g */
    public Observable<Unit> mo97078g() {
        ImageUploadBar imageUploadBar = this.f21287b.f106437c;
        Intrinsics.checkNotNullExpressionValue(imageUploadBar, "binding.imageUploadBar");
        return C44626lf5.clicksThrottle$default(imageUploadBar, 0L, 1, null);
    }

    @Override // p000.KK4
    /* renamed from: j */
    public void mo97077j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f21287b.f106437c.m56145s(url);
    }

    @Override // p000.KK4
    /* renamed from: p */
    public void mo97076p(boolean z) {
        this.f21287b.f106436b.setButtonEnabled(z);
    }

    @Override // p000.KK4
    /* renamed from: v */
    public Observable<List<Uri>> mo97075v() {
        Observable<List<Uri>> hide = this.f21288c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photosChangeSubject.hide()");
        return hide;
    }

    @Override // p000.KK4
    /* renamed from: x1 */
    public List<Pair<String, Observable<Unit>>> mo97074x1() {
        Map<String, SelectableButton> m60715e = this.f21287b.f106439e.m60715e();
        ArrayList arrayList = new ArrayList(m60715e.size());
        for (Map.Entry<String, SelectableButton> entry : m60715e.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), C44626lf5.clicksThrottle$default(entry.getValue(), 0L, 1, null)));
        }
        return arrayList;
    }
}
