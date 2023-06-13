package p000;

import android.content.DialogInterface;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.IssueStatusReason;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\t\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\u001c\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u0014\u0010\t\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"Lle0;", "LxE;", "Lke0;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "P", "Lco/bird/android/model/Issue;", "issue", "", "d7", "", "LH6;", "sections", "b", "dismiss", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/content/DialogInterface;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/DialogInterface;", "dialog", "Lae0;", "e", "Lae0;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/content/DialogInterface;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: le0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44611le0 extends AbstractC30071xE implements InterfaceC44018ke0 {

    /* renamed from: b */
    public final TextView f96470b;

    /* renamed from: c */
    public final RecyclerView f96471c;

    /* renamed from: d */
    public final DialogInterface f96472d;

    /* renamed from: e */
    public final C38071ae0 f96473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44611le0(BaseActivity activity, TextView issue, RecyclerView recyclerView, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f96470b = issue;
        this.f96471c = recyclerView;
        this.f96472d = dialog;
        C38071ae0 c38071ae0 = new C38071ae0();
        this.f96473e = c38071ae0;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c38071ae0);
    }

    @Override // p000.InterfaceC44018ke0
    /* renamed from: P */
    public Observable<Pair<IssueStatus, IssueStatusReason>> mo27064P() {
        return this.f96473e.m70985v();
    }

    @Override // p000.InterfaceC44018ke0
    /* renamed from: b */
    public void mo27063b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f96473e.mo24871u(sections);
    }

    @Override // p000.InterfaceC44018ke0
    /* renamed from: d7 */
    public void mo27062d7(Issue issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        TextView textView = this.f96470b;
        String string = getActivity().getString(C45871nl4.repair_cant_repair_issue_format, issue.getDisplay());
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…ue_format, issue.display)");
        textView.setText(C45097mS5.m25592n(string, issue.getDisplay(), new ForegroundColorSpan(NA0.m94301c(getActivity(), C32364Df4.birdRed))));
    }

    @Override // p000.InterfaceC44018ke0
    public void dismiss() {
        this.f96472d.dismiss();
    }
}
