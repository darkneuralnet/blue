package p000;

import android.widget.ProgressBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16664e;
import co.bird.android.widget.InterfaceC16662d;
import co.bird.android.widget.PillDropdownButton;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0016J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"Lza5;", "Lya5;", "LxE;", "", "show", "", "hiddenState", "", "showProgress", "Lio/reactivex/Observable;", "V0", "Fi", "", "label", "kf", "imageUrl", "N9", "", "LB1;", "options", "title", "Lio/reactivex/p;", "Ka", "Lco/bird/android/widget/PillDropdownButton;", "b", "Lco/bird/android/widget/PillDropdownButton;", "pillDropdownButton", "Landroid/widget/ProgressBar;", "c", "Landroid/widget/ProgressBar;", "progressBar", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/PillDropdownButton;Landroid/widget/ProgressBar;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderProfileUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderProfileUi.kt\nco/bird/android/app/feature/riderprofile/ui/RiderProfileUiImpl\n+ 2 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$1\n*L\n1#1,66:1\n64#2,9:67\n73#2,4:80\n819#3:76\n847#3:77\n848#3:79\n66#4:78\n*S KotlinDebug\n*F\n+ 1 RiderProfileUi.kt\nco/bird/android/app/feature/riderprofile/ui/RiderProfileUiImpl\n*L\n58#1:67,9\n58#1:80,4\n58#1:76\n58#1:77\n58#1:79\n58#1:78\n*E\n"})
/* renamed from: za5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52876za5 extends AbstractC30071xE implements InterfaceC52283ya5 {

    /* renamed from: b */
    public final PillDropdownButton f121559b;

    /* renamed from: c */
    public final ProgressBar f121560c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lco/bird/android/widget/d;", "co/bird/android/widget/a$n"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$2$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: za5$a */
    /* loaded from: classes2.dex */
    public static final class C31047a extends Lambda implements Function1<Integer, C0371B1> {

        /* renamed from: g */
        public final /* synthetic */ List f121561g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31047a(List list) {
            super(1);
            this.f121561g = list;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [co.bird.android.widget.d, B1] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C0371B1 invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (InterfaceC16662d) this.f121561g.get(it.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52876za5(BaseActivity activity, PillDropdownButton pillDropdownButton, ProgressBar progressBar) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pillDropdownButton, "pillDropdownButton");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f121559b = pillDropdownButton;
        this.f121560c = progressBar;
    }

    @Override // p000.InterfaceC52283ya5
    /* renamed from: Fi */
    public void mo1081Fi(boolean z) {
        C49520tu6.show$default(this.f121559b, z, 0, 2, null);
    }

    @Override // p000.InterfaceC52283ya5
    /* renamed from: Ka */
    public AbstractC24507p<C0371B1> mo1080Ka(List<C0371B1> options, String title) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(title, "title");
        BaseActivity activity = getActivity();
        BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.SMALL_TITLE;
        ArrayList arrayList = new ArrayList();
        for (Object obj : options) {
            InterfaceC16662d interfaceC16662d = (InterfaceC16662d) obj;
            arrayList.add(obj);
        }
        C16664e c16664e = new C16664e();
        c16664e.setArguments(C16597a.m54345a(enumC16469a, title, null, 1, arrayList));
        c16664e.show(activity.getSupportFragmentManager(), "BottomSheetOptionFragment");
        AbstractC24507p m32067H = c16664e.m54040D9().m32067H(new C16597a.C16605h(new C31047a(arrayList)));
        Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
        return m32067H;
    }

    @Override // p000.InterfaceC52283ya5
    /* renamed from: N9 */
    public void mo1079N9(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f121559b.setIcon(imageUrl);
    }

    @Override // p000.InterfaceC52283ya5
    /* renamed from: V0 */
    public Observable<Unit> mo1078V0() {
        return C44626lf5.clicksThrottle$default(this.f121559b, 0L, 1, null);
    }

    @Override // p000.InterfaceC52283ya5
    /* renamed from: kf */
    public void mo1077kf(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f121559b.setLabel(label);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        C49520tu6.m11232s(this.f121560c, z, i);
    }
}
