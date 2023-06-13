package p000;

import androidx.compose.p003ui.focus.InterfaceC11302e;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LJc0;", "Landroidx/compose/ui/focus/e;", "", "i", "", "j", "b", "Ljava/lang/Boolean;", "canFocusValue", "value", "h", "()Z", "e", "(Z)V", "canFocus", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33737Jc0 implements InterfaceC11302e {

    /* renamed from: a */
    public static final C33737Jc0 f17897a = new C33737Jc0();

    /* renamed from: b */
    public static Boolean f17898b;

    private C33737Jc0() {
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: e */
    public void mo68792e(boolean z) {
        f17898b = Boolean.valueOf(z);
    }

    @Override // androidx.compose.p003ui.focus.InterfaceC11302e
    /* renamed from: h */
    public boolean mo68789h() {
        Boolean bool = f17898b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: i */
    public final boolean m100122i() {
        return f17898b != null;
    }

    /* renamed from: j */
    public final void m100121j() {
        f17898b = null;
    }
}
