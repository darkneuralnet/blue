package p000;

import androidx.compose.p003ui.focus.C11309h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"LVv1;", "LUv1;", "LgV2$c;", "", "R", "S", "Landroidx/compose/ui/focus/h;", "l", "Landroidx/compose/ui/focus/h;", "e0", "()Landroidx/compose/ui/focus/h;", "f0", "(Landroidx/compose/ui/focus/h;)V", "focusRequester", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n728#2,2:85\n735#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n*L\n76#1:85,2\n80#1:87,2\n*E\n"})
/* renamed from: Vv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36717Vv1 extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC36483Uv1 {

    /* renamed from: l */
    public C11309h f39986l;

    public C36717Vv1(C11309h focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f39986l = focusRequester;
    }

    @Override // p000.InterfaceC41563gV2.AbstractC20914c
    /* renamed from: R */
    public void mo29739R() {
        super.mo29739R();
        this.f39986l.m68780d().m96701b(this);
    }

    @Override // p000.InterfaceC41563gV2.AbstractC20914c
    /* renamed from: S */
    public void mo29738S() {
        this.f39986l.m68780d().m96709A(this);
        super.mo29738S();
    }

    /* renamed from: e0 */
    public final C11309h m79230e0() {
        return this.f39986l;
    }

    /* renamed from: f0 */
    public final void m79229f0(C11309h c11309h) {
        Intrinsics.checkNotNullParameter(c11309h, "<set-?>");
        this.f39986l = c11309h;
    }
}
