package p000;

import java.util.List;
/* renamed from: ok8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46458ok8 implements Nl9 {

    /* renamed from: a */
    public final /* synthetic */ C34987Ok8 f102426a;

    public C46458ok8(C34987Ok8 c34987Ok8) {
        this.f102426a = c34987Ok8;
    }

    @Override // p000.Nl9
    /* renamed from: a */
    public final void mo20549a(int i, String str, List list, boolean z, boolean z2) {
        C40448ec8 m106894n;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        m106894n = this.f102426a.f100966a.mo22258a().m106890r();
                    } else if (z) {
                        m106894n = this.f102426a.f100966a.mo22258a().m106886v();
                    } else if (!z2) {
                        m106894n = this.f102426a.f100966a.mo22258a().m106887u();
                    } else {
                        m106894n = this.f102426a.f100966a.mo22258a().m106888t();
                    }
                } else {
                    m106894n = this.f102426a.f100966a.mo22258a().m106889s();
                }
            } else if (z) {
                m106894n = this.f102426a.f100966a.mo22258a().m106891q();
            } else if (!z2) {
                m106894n = this.f102426a.f100966a.mo22258a().m106892p();
            } else {
                m106894n = this.f102426a.f100966a.mo22258a().m106893o();
            }
        } else {
            m106894n = this.f102426a.f100966a.mo22258a().m106894n();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    m106894n.m42708a(str);
                    return;
                } else {
                    m106894n.m42705d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            m106894n.m42706c(str, list.get(0), list.get(1));
            return;
        }
        m106894n.m42707b(str, list.get(0));
    }
}
