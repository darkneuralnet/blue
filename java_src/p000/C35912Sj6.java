package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0014J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¨\u0006\u0014"}, m28432d2 = {"LSj6;", "Lg0;", "LVi6;", "", "index", "instance", "", "o", "n", "count", "b", "k", "from", "to", "e", "LgE1;", "m", "root", "<init>", "(LVi6;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* renamed from: Sj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35912Sj6 extends AbstractC20675g0<AbstractC36605Vi6> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35912Sj6(AbstractC36605Vi6 root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: b */
    public void mo8335b(int i, int i2) {
        m84979m(mo26853a()).m39835j(i, i2);
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: e */
    public void mo8333e(int i, int i2, int i3) {
        m84979m(mo26853a()).m39836i(i, i2, i3);
    }

    @Override // p000.AbstractC20675g0
    /* renamed from: k */
    public void mo8330k() {
        C41409gE1 m84979m = m84979m(m40376j());
        m84979m.m39835j(0, m84979m.m39839f());
    }

    /* renamed from: m */
    public final C41409gE1 m84979m(AbstractC36605Vi6 abstractC36605Vi6) {
        if (abstractC36605Vi6 instanceof C41409gE1) {
            return (C41409gE1) abstractC36605Vi6;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: n */
    public void mo8331g(int i, AbstractC36605Vi6 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: o */
    public void mo8332f(int i, AbstractC36605Vi6 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        m84979m(mo26853a()).m39837h(i, instance);
    }
}
