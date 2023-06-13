package p000;

import androidx.compose.p003ui.focus.InterfaceC11302e;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LPv1;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/e;", "", "focusProperties", C17296a.f69688o, "LOv1;", "b", "LOv1;", "getModifier", "()LOv1;", "modifier", "<init>", "(LOv1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35313Pv1 implements Function1<InterfaceC11302e, Unit> {

    /* renamed from: b */
    public final InterfaceC35079Ov1 f29388b;

    public C35313Pv1(InterfaceC35079Ov1 modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f29388b = modifier;
    }

    /* renamed from: a */
    public void m89424a(InterfaceC11302e focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f29388b.m91184p0(new C34845Nv1(focusProperties));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11302e interfaceC11302e) {
        m89424a(interfaceC11302e);
        return Unit.INSTANCE;
    }
}
