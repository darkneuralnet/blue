package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lrb;", "Lzu;", "LPu;", "autofillNode", "", "b", C17296a.f69688o, "Landroid/view/View;", "Landroid/view/View;", "e", "()Landroid/view/View;", "view", "LQu;", "LQu;", DateTokenConverter.CONVERTER_KEY, "()LQu;", "autofillTree", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "<init>", "(Landroid/view/View;LQu;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rb */
/* loaded from: classes.dex */
public final class C27951rb implements InterfaceC31588zu {

    /* renamed from: a */
    public final View f107303a;

    /* renamed from: b */
    public final C6975Qu f107304b;

    /* renamed from: c */
    public final AutofillManager f107305c;

    public C27951rb(View view, C6975Qu autofillTree) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autofillTree, "autofillTree");
        this.f107303a = view;
        this.f107304b = autofillTree;
        AutofillManager m20824a = C27010ob.m20824a(view.getContext().getSystemService(AutofillManager.class));
        if (m20824a != null) {
            this.f107305c = m20824a;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    @Override // p000.InterfaceC31588zu
    /* renamed from: a */
    public void mo150a(C6560Pu autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.f107305c.notifyViewExited(this.f107303a, autofillNode.m89455e());
    }

    @Override // p000.InterfaceC31588zu
    /* renamed from: b */
    public void mo149b(C6560Pu autofillNode) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        C35055Os4 m89456d = autofillNode.m89456d();
        if (m89456d != null) {
            AutofillManager autofillManager = this.f107305c;
            View view = this.f107303a;
            int m89455e = autofillNode.m89455e();
            roundToInt = MathKt__MathJVMKt.roundToInt(m89456d.m91258i());
            roundToInt2 = MathKt__MathJVMKt.roundToInt(m89456d.m91255l());
            roundToInt3 = MathKt__MathJVMKt.roundToInt(m89456d.m91257j());
            roundToInt4 = MathKt__MathJVMKt.roundToInt(m89456d.m91262e());
            autofillManager.notifyViewEntered(view, m89455e, new Rect(roundToInt, roundToInt2, roundToInt3, roundToInt4));
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }

    /* renamed from: c */
    public final AutofillManager m15729c() {
        return this.f107305c;
    }

    /* renamed from: d */
    public final C6975Qu m15728d() {
        return this.f107304b;
    }

    /* renamed from: e */
    public final View m15727e() {
        return this.f107303a;
    }
}
