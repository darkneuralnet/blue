package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001BR\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012<\u0010\u0013\u001a8\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\rø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bRP\u0010\u0013\u001a8\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\r8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"LHB5;", "LGB5;", "LG52;", "initialSize", "targetSize", "Ltm1;", "b", "(JJ)Ltm1;", "", C17296a.f69688o, "Z", "()Z", "clip", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function2;", "getSizeAnimationSpec", "()Lkotlin/jvm/functions/Function2;", "sizeAnimationSpec", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HB5 */
/* loaded from: classes.dex */
public final class HB5 implements GB5 {

    /* renamed from: a */
    public final boolean f13069a;

    /* renamed from: b */
    public final Function2<G52, G52, InterfaceC49435tm1<G52>> f13070b;

    /* JADX WARN: Multi-variable type inference failed */
    public HB5(boolean z, Function2<? super G52, ? super G52, ? extends InterfaceC49435tm1<G52>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        this.f13069a = z;
        this.f13070b = sizeAnimationSpec;
    }

    @Override // p000.GB5
    /* renamed from: a */
    public boolean mo104182a() {
        return this.f13069a;
    }

    @Override // p000.GB5
    /* renamed from: b */
    public InterfaceC49435tm1<G52> mo104181b(long j, long j2) {
        return this.f13070b.invoke(G52.m105834b(j), G52.m105834b(j2));
    }
}
