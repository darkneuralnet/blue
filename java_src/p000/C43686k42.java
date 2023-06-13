package p000;

import android.content.DialogInterface;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.InspectionContext;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"Lk42;", "LxE;", "", "passedInspection", "Lco/bird/android/model/constant/InspectionContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Rl", "Lio/reactivex/Observable;", "Pl", "Ql", "dismiss", "", "LH6;", "sections", "b", "Landroid/widget/Button;", "Landroid/widget/Button;", "primary", "c", "secondary", "Landroidx/recyclerview/widget/RecyclerView;", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/content/DialogInterface;", "e", "Landroid/content/DialogInterface;", "dialog", "LZ32;", "f", "LZ32;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;Landroid/content/DialogInterface;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43686k42 extends AbstractC30071xE {

    /* renamed from: b */
    public final Button f93856b;

    /* renamed from: c */
    public final Button f93857c;

    /* renamed from: d */
    public final RecyclerView f93858d;

    /* renamed from: e */
    public final DialogInterface f93859e;

    /* renamed from: f */
    public final Z32 f93860f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: k42$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25094a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InspectionContext.values().length];
            try {
                iArr[InspectionContext.SCANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InspectionContext.FLIGHT_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43686k42(BaseActivity activity, Button primary, Button secondary, RecyclerView recyclerView, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f93856b = primary;
        this.f93857c = secondary;
        this.f93858d = recyclerView;
        this.f93859e = dialog;
        Z32 z32 = new Z32();
        this.f93860f = z32;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(z32);
    }

    /* renamed from: Pl */
    public final Observable<Unit> m29361Pl() {
        return C44626lf5.clicksThrottle$default(this.f93856b, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final Observable<Unit> m29360Ql() {
        return C44626lf5.clicksThrottle$default(this.f93857c, 0L, 1, null);
    }

    /* renamed from: Rl */
    public final void m29359Rl(boolean z, InspectionContext context) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(context, "context");
        C49520tu6.show$default(this.f93857c, !z, 0, 2, null);
        Button button = this.f93856b;
        if (z) {
            string = getActivity().getString(C45871nl4.general_done);
        } else {
            string = getActivity().getString(C45871nl4.next);
        }
        button.setText(string);
        Button button2 = this.f93857c;
        int i = C25094a.$EnumSwitchMapping$0[context.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string2 = getActivity().getString(C45871nl4.bird_action_flight_sheet);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            string2 = getActivity().getString(C45871nl4.scanner_uppercased);
        }
        button2.setText(string2);
    }

    /* renamed from: b */
    public final void m29358b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f93860f.mo24871u(sections);
    }

    public final void dismiss() {
        this.f93859e.dismiss();
    }
}
