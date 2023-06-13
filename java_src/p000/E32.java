package p000;

import android.os.Build;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C47317qB6;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010'\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010.\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, m28432d2 = {"LE32;", "LqB6$b;", "Ljava/lang/Runnable;", "LUe3;", "Landroid/view/View$OnAttachStateChangeListener;", "LqB6;", "animation", "", DateTokenConverter.CONVERTER_KEY, "LqB6$a;", "bounds", "f", "LDB6;", "insets", "", "runningAnimations", "e", "c", "Landroid/view/View;", "view", C17296a.f69688o, "run", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "LnC6;", "LnC6;", "getComposeInsets", "()LnC6;", "composeInsets", "", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "prepared", "getRunningAnimation", "setRunningAnimation", "runningAnimation", "g", "LDB6;", "getSavedInsets", "()LDB6;", "setSavedInsets", "(LDB6;)V", "savedInsets", "<init>", "(LnC6;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E32 */
/* loaded from: classes.dex */
public final class E32 extends C47317qB6.AbstractC27528b implements Runnable, InterfaceC36332Ue3, View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final C45547nC6 f6903d;

    /* renamed from: e */
    public boolean f6904e;

    /* renamed from: f */
    public boolean f6905f;

    /* renamed from: g */
    public DB6 f6906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E32(C45547nC6 composeInsets) {
        super(!composeInsets.m24156c());
        Intrinsics.checkNotNullParameter(composeInsets, "composeInsets");
        this.f6903d = composeInsets;
    }

    @Override // p000.InterfaceC36332Ue3
    /* renamed from: a */
    public DB6 mo7930a(View view, DB6 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f6906g = insets;
        this.f6903d.m24148k(insets);
        if (this.f6904e) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f6905f) {
            this.f6903d.m24149j(insets);
            C45547nC6.m24150i(this.f6903d, insets, 0, 2, null);
        }
        if (this.f6903d.m24156c()) {
            DB6 CONSUMED = DB6.f5337b;
            Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
            return CONSUMED;
        }
        return insets;
    }

    @Override // p000.C47317qB6.AbstractC27528b
    /* renamed from: c */
    public void mo17940c(C47317qB6 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f6904e = false;
        this.f6905f = false;
        DB6 db6 = this.f6906g;
        if (animation.m17950a() != 0 && db6 != null) {
            this.f6903d.m24149j(db6);
            this.f6903d.m24148k(db6);
            C45547nC6.m24150i(this.f6903d, db6, 0, 2, null);
        }
        this.f6906g = null;
        super.mo17940c(animation);
    }

    @Override // p000.C47317qB6.AbstractC27528b
    /* renamed from: d */
    public void mo17939d(C47317qB6 animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f6904e = true;
        this.f6905f = true;
        super.mo17939d(animation);
    }

    @Override // p000.C47317qB6.AbstractC27528b
    /* renamed from: e */
    public DB6 mo17938e(DB6 insets, List<C47317qB6> runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        C45547nC6.m24150i(this.f6903d, insets, 0, 2, null);
        if (this.f6903d.m24156c()) {
            DB6 CONSUMED = DB6.f5337b;
            Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
            return CONSUMED;
        }
        return insets;
    }

    @Override // p000.C47317qB6.AbstractC27528b
    /* renamed from: f */
    public C47317qB6.C27527a mo17937f(C47317qB6 animation, C47317qB6.C27527a bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f6904e = false;
        C47317qB6.C27527a mo17937f = super.mo17937f(animation, bounds);
        Intrinsics.checkNotNullExpressionValue(mo17937f, "super.onStart(animation, bounds)");
        return mo17937f;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6904e) {
            this.f6904e = false;
            this.f6905f = false;
            DB6 db6 = this.f6906g;
            if (db6 != null) {
                this.f6903d.m24149j(db6);
                C45547nC6.m24150i(this.f6903d, db6, 0, 2, null);
                this.f6906g = null;
            }
        }
    }
}
