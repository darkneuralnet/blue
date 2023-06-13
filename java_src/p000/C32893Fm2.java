package p000;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, m28432d2 = {"LSC2;", "LL9;", "alignmentLine", "", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Fm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32893Fm2 {
    /* renamed from: b */
    public static final int m106594b(SC2 sc2, AbstractC4750L9 abstractC4750L9) {
        boolean z;
        int m116111j;
        SC2 mo84225o1 = sc2.mo84225o1();
        if (mo84225o1 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (sc2.mo84221s1().mo1428d().containsKey(abstractC4750L9)) {
                Integer num = sc2.mo84221s1().mo1428d().get(abstractC4750L9);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int mo35854v = mo84225o1.mo35854v(abstractC4750L9);
            if (mo35854v == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            mo84225o1.m85847A1(true);
            sc2.m85842z1(true);
            sc2.mo84218y1();
            mo84225o1.m85847A1(false);
            sc2.m85842z1(false);
            if (abstractC4750L9 instanceof YM1) {
                m116111j = A52.m116110k(mo84225o1.mo84219u1());
            } else {
                m116111j = A52.m116111j(mo84225o1.mo84219u1());
            }
            return mo35854v + m116111j;
        }
        throw new IllegalStateException(("Child of " + sc2 + " cannot be null when calculating alignment line").toString());
    }
}
