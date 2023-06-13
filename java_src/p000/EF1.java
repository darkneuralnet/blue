package p000;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"LEF1;", "LxE;", "LDF1;", "", "count", "", "Of", "y8", "", "LH6;", "sections", "b", "", "enabled", "Da", "Lio/reactivex/Observable;", "", "K7", "title", "Oi", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "scanCount", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", DateTokenConverter.CONVERTER_KEY, "Landroidx/constraintlayout/widget/ConstraintLayout;", "troubleshootingTipsContainer", "LlF1;", "e", "LlF1;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: EF1 */
/* loaded from: classes3.dex */
public final class EF1 extends AbstractC30071xE implements DF1 {

    /* renamed from: b */
    public final TextView f7144b;

    /* renamed from: c */
    public final RecyclerView f7145c;

    /* renamed from: d */
    public final ConstraintLayout f7146d;

    /* renamed from: e */
    public final C44383lF1 f7147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EF1(BaseActivity activity, TextView scanCount, RecyclerView recyclerView, ConstraintLayout troubleshootingTipsContainer) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scanCount, "scanCount");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(troubleshootingTipsContainer, "troubleshootingTipsContainer");
        this.f7144b = scanCount;
        this.f7145c = recyclerView;
        this.f7146d = troubleshootingTipsContainer;
        C44383lF1 c44383lF1 = new C44383lF1();
        this.f7147e = c44383lF1;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c44383lF1);
    }

    @Override // p000.DF1
    /* renamed from: Da */
    public void mo109277Da(boolean z) {
        C49520tu6.show$default(this.f7146d, z, 0, 2, null);
    }

    @Override // p000.DF1
    /* renamed from: K7 */
    public Observable<String> mo109276K7() {
        return this.f7147e.m27626v();
    }

    @Override // p000.DF1
    /* renamed from: Of */
    public void mo109275Of(int i) {
        this.f7144b.setText(getActivity().getString(C45871nl4.hard_count_scans_uploaded_format, Integer.valueOf(i)));
    }

    @Override // p000.DF1
    /* renamed from: Oi */
    public void mo109274Oi(String str) {
        getActivity().setTitle(str);
    }

    @Override // p000.DF1
    /* renamed from: b */
    public void mo109273b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f7147e.mo24871u(sections);
    }

    @Override // p000.DF1
    /* renamed from: y8 */
    public void mo109272y8(int i) {
        this.f7144b.setText(getActivity().getString(C45871nl4.hard_count_scans_failed, Integer.valueOf(i)));
        this.f7144b.setTextColor(getColor(C32364Df4.birdRed));
    }
}
