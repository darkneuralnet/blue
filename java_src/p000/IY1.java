package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, m28432d2 = {"LIY1;", "LKY1;", "Landroid/view/inputmethod/InputMethodManager;", "imm", "", "b", C17296a.f69688o, "Landroid/view/View;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IY1 */
/* loaded from: classes.dex */
public final class IY1 implements KY1 {

    /* renamed from: a */
    public final View f15871a;

    public IY1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f15871a = view;
    }

    /* renamed from: d */
    public static final void m101941d(InputMethodManager imm, IY1 this$0) {
        Intrinsics.checkNotNullParameter(imm, "$imm");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        imm.showSoftInput(this$0.f15871a, 0);
    }

    @Override // p000.KY1
    /* renamed from: a */
    public void mo98784a(InputMethodManager imm) {
        Intrinsics.checkNotNullParameter(imm, "imm");
        imm.hideSoftInputFromWindow(this.f15871a.getWindowToken(), 0);
    }

    @Override // p000.KY1
    /* renamed from: b */
    public void mo98783b(final InputMethodManager imm) {
        Intrinsics.checkNotNullParameter(imm, "imm");
        this.f15871a.post(new Runnable() { // from class: HY1
            @Override // java.lang.Runnable
            public final void run() {
                IY1.m101941d(imm, this);
            }
        });
    }
}
