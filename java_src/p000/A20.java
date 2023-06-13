package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00078D@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LA20;", "LiV2;", "Lch3;", "LpV2;", Action.SCOPE_ATTRIBUTE, "", "o0", "Lnm2;", "coordinates", "t", "LC20;", "b", "LC20;", "defaultParent", "c", "localParent", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Lnm2;", "()Lnm2;", "layoutCoordinates", "g", "()LC20;", "parent", "<init>", "(LC20;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* renamed from: A20 */
/* loaded from: classes.dex */
public abstract class A20 implements InterfaceC42749iV2, InterfaceC39290ch3 {

    /* renamed from: b */
    public final C20 f40b;

    /* renamed from: c */
    public C20 f41c;

    /* renamed from: d */
    public InterfaceC45879nm2 f42d;

    public A20(C20 defaultParent) {
        Intrinsics.checkNotNullParameter(defaultParent, "defaultParent");
        this.f40b = defaultParent;
    }

    /* renamed from: b */
    public final InterfaceC45879nm2 m116181b() {
        InterfaceC45879nm2 interfaceC45879nm2 = this.f42d;
        if (interfaceC45879nm2 == null || !interfaceC45879nm2.mo23189F()) {
            return null;
        }
        return interfaceC45879nm2;
    }

    /* renamed from: g */
    public final C20 m116180g() {
        C20 c20 = this.f41c;
        return c20 == null ? this.f40b : c20;
    }

    @Override // p000.InterfaceC42749iV2
    /* renamed from: o0 */
    public void mo33854o0(InterfaceC46900pV2 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f41c = (C20) scope.mo19176a(B20.m114780a());
    }

    @Override // p000.InterfaceC39290ch3
    /* renamed from: t */
    public void mo29214t(InterfaceC45879nm2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f42d = coordinates;
    }
}
