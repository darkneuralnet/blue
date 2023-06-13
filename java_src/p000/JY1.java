package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.DB6;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u000e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\nH\u0082\u0010R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LJY1;", "LKY1;", "Landroid/view/inputmethod/InputMethodManager;", "imm", "", "b", C17296a.f69688o, "Landroid/view/View;", "Landroid/view/Window;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "c", "Landroid/view/View;", "view", "LIY1;", "LIY1;", "_immHelper21", "LhC6;", "f", "()LhC6;", "insetsControllerCompat", "e", "()LIY1;", "immHelper21", "<init>", "(Landroid/view/View;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInputMethodManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputMethodManager.kt\nandroidx/compose/ui/text/input/ImmHelper30\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* renamed from: JY1 */
/* loaded from: classes.dex */
public final class JY1 implements KY1 {

    /* renamed from: a */
    public final View f17775a;

    /* renamed from: b */
    public IY1 f17776b;

    public JY1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f17775a = view;
    }

    @Override // p000.KY1
    /* renamed from: a */
    public void mo98784a(InputMethodManager imm) {
        Intrinsics.checkNotNullParameter(imm, "imm");
        C41989hC6 m100262f = m100262f();
        if (m100262f != null) {
            m100262f.m36624a(DB6.C1428m.m110720c());
        } else {
            m100263e().mo98784a(imm);
        }
    }

    @Override // p000.KY1
    /* renamed from: b */
    public void mo98783b(InputMethodManager imm) {
        Intrinsics.checkNotNullParameter(imm, "imm");
        C41989hC6 m100262f = m100262f();
        if (m100262f != null) {
            m100262f.m36620e(DB6.C1428m.m110720c());
        } else {
            m100263e().mo98783b(imm);
        }
    }

    /* renamed from: c */
    public final Window m100265c(Context baseContext) {
        while (!(baseContext instanceof Activity)) {
            if (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
            } else {
                return null;
            }
        }
        return ((Activity) baseContext).getWindow();
    }

    /* renamed from: d */
    public final Window m100264d(View view) {
        View view2;
        while (!(view instanceof I31)) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 == null) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                Window m100265c = m100265c(context);
                if (m100265c == null) {
                    return null;
                }
                View decorView = m100265c.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "windowFromContext.decorView");
                if (decorView != view) {
                    return null;
                }
                return m100265c;
            }
            view = view2;
        }
        return ((I31) view).getWindow();
    }

    /* renamed from: e */
    public final IY1 m100263e() {
        IY1 iy1 = this.f17776b;
        if (iy1 == null) {
            IY1 iy12 = new IY1(this.f17775a);
            this.f17776b = iy12;
            return iy12;
        }
        return iy1;
    }

    /* renamed from: f */
    public final C41989hC6 m100262f() {
        Window m100264d = m100264d(this.f17775a);
        if (m100264d != null) {
            return new C41989hC6(m100264d, this.f17775a);
        }
        return null;
    }
}
