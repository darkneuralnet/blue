package p000;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"LrT5;", "LtP5;", "", "LUy5;", "delta", "", "Y", "X", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: rT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48071rT5 extends C36514Uy5<Integer> implements InterfaceC49220tP5<Integer> {
    public C48071rT5(int i) {
        super(1, Integer.MAX_VALUE, EnumC43674k30.DROP_OLDEST);
        mo10357b(Integer.valueOf(i));
    }

    @Override // p000.InterfaceC49220tP5
    /* renamed from: X */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(m80549K().intValue());
        }
        return valueOf;
    }

    /* renamed from: Y */
    public final boolean m15924Y(int i) {
        boolean mo10357b;
        synchronized (this) {
            mo10357b = mo10357b(Integer.valueOf(m80549K().intValue() + i));
        }
        return mo10357b;
    }
}
