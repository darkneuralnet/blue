package p000;

import android.content.DialogInterface;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LQD4;", "LxE;", "LPD4;", "Lio/reactivex/Observable;", "", "doneClicks", "", "LH6;", "sections", "b", "dismiss", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "c", "Landroid/widget/Button;", "done", "Landroid/content/DialogInterface;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/DialogInterface;", "dialog", "LBD4;", "e", "LBD4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/content/DialogInterface;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QD4 */
/* loaded from: classes3.dex */
public final class QD4 extends AbstractC30071xE implements PD4 {

    /* renamed from: b */
    public final RecyclerView f30046b;

    /* renamed from: c */
    public final Button f30047c;

    /* renamed from: d */
    public final DialogInterface f30048d;

    /* renamed from: e */
    public final BD4 f30049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QD4(BaseActivity activity, RecyclerView recyclerView, Button done, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(done, "done");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f30046b = recyclerView;
        this.f30047c = done;
        this.f30048d = dialog;
        BD4 bd4 = new BD4();
        this.f30049e = bd4;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(bd4);
    }

    @Override // p000.PD4
    /* renamed from: b */
    public void mo88731b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f30049e.mo24871u(sections);
    }

    @Override // p000.PD4
    public void dismiss() {
        this.f30048d.dismiss();
    }

    @Override // p000.PD4
    public Observable<Unit> doneClicks() {
        return C44626lf5.clicksThrottle$default(this.f30047c, 0L, 1, null);
    }
}
