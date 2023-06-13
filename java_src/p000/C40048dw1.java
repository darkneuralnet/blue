package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\"\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Ldw1;", "LiV2;", "LoV2;", "Lkotlin/Function1;", "Lnm2;", "", "LpV2;", Action.SCOPE_ATTRIBUTE, "o0", "focusedBounds", "b", "Lkotlin/jvm/functions/Function1;", "handler", "c", "parent", DateTokenConverter.CONVERTER_KEY, "Lnm2;", "lastBounds", "LV94;", "getKey", "()LV94;", "key", C17296a.f69688o, "()Lkotlin/jvm/functions/Function1;", "value", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsObserverModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* renamed from: dw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40048dw1 implements InterfaceC42749iV2, InterfaceC46307oV2<Function1<? super InterfaceC45879nm2, ? extends Unit>>, Function1<InterfaceC45879nm2, Unit> {

    /* renamed from: b */
    public final Function1<InterfaceC45879nm2, Unit> f77436b;

    /* renamed from: c */
    public Function1<? super InterfaceC45879nm2, Unit> f77437c;

    /* renamed from: d */
    public InterfaceC45879nm2 f77438d;

    /* JADX WARN: Multi-variable type inference failed */
    public C40048dw1(Function1<? super InterfaceC45879nm2, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f77436b = handler;
    }

    @Override // p000.InterfaceC46307oV2
    /* renamed from: a */
    public Function1<InterfaceC45879nm2, Unit> getValue() {
        return this;
    }

    /* renamed from: b */
    public void m43496b(InterfaceC45879nm2 interfaceC45879nm2) {
        this.f77438d = interfaceC45879nm2;
        this.f77436b.invoke(interfaceC45879nm2);
        Function1<? super InterfaceC45879nm2, Unit> function1 = this.f77437c;
        if (function1 != null) {
            function1.invoke(interfaceC45879nm2);
        }
    }

    @Override // p000.InterfaceC46307oV2
    public V94<Function1<? super InterfaceC45879nm2, ? extends Unit>> getKey() {
        return C38845bw1.m62121a();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
        m43496b(interfaceC45879nm2);
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC42749iV2
    /* renamed from: o0 */
    public void mo33854o0(InterfaceC46900pV2 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function1<? super InterfaceC45879nm2, Unit> function1 = (Function1) scope.mo19176a(C38845bw1.m62121a());
        if (!Intrinsics.areEqual(function1, this.f77437c)) {
            this.f77437c = function1;
        }
    }
}
