package p000;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0002R&\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lcw1;", "LiV2;", "LRg3;", "Lnm2;", "coordinates", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LpV2;", Action.SCOPE_ATTRIBUTE, "o0", C17296a.f69688o, "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "observer", "c", "Lnm2;", "layoutCoordinates", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* renamed from: cw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39456cw1 implements InterfaceC42749iV2, InterfaceC35648Rg3 {

    /* renamed from: b */
    public Function1<? super InterfaceC45879nm2, Unit> f75883b;

    /* renamed from: c */
    public InterfaceC45879nm2 f75884c;

    @Override // p000.InterfaceC35648Rg3
    /* renamed from: C */
    public void mo44810C(InterfaceC45879nm2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f75884c = coordinates;
        if (coordinates.mo23189F()) {
            m44809a();
            return;
        }
        Function1<? super InterfaceC45879nm2, Unit> function1 = this.f75883b;
        if (function1 != null) {
            function1.invoke(null);
        }
    }

    /* renamed from: a */
    public final void m44809a() {
        Function1<? super InterfaceC45879nm2, Unit> function1;
        InterfaceC45879nm2 interfaceC45879nm2 = this.f75884c;
        if (interfaceC45879nm2 != null) {
            Intrinsics.checkNotNull(interfaceC45879nm2);
            if (interfaceC45879nm2.mo23189F() && (function1 = this.f75883b) != null) {
                function1.invoke(this.f75884c);
            }
        }
    }

    @Override // p000.InterfaceC42749iV2
    /* renamed from: o0 */
    public void mo33854o0(InterfaceC46900pV2 scope) {
        Function1<? super InterfaceC45879nm2, Unit> function1;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function1<? super InterfaceC45879nm2, Unit> function12 = (Function1) scope.mo19176a(C38845bw1.m62121a());
        if (function12 == null && (function1 = this.f75883b) != null) {
            function1.invoke(null);
        }
        this.f75883b = function12;
    }
}
