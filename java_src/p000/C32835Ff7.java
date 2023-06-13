package p000;

import java.util.Map;
import java.util.Set;
/* renamed from: Ff7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32835Ff7 extends TR8 {

    /* renamed from: d */
    public String f9936d;

    /* renamed from: e */
    public Set f9937e;

    /* renamed from: f */
    public Map f9938f;

    /* renamed from: g */
    public Long f9939g;

    /* renamed from: h */
    public Long f9940h;

    public C32835Ff7(C42162hV8 c42162hV8) {
        super(c42162hV8);
    }

    @Override // p000.TR8
    /* renamed from: i */
    public final boolean mo11655i() {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:351:0x08ef
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: j */
    public final java.util.List m106760j(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            Method dump skipped, instructions count: 2817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C32835Ff7.m106760j(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    /* renamed from: k */
    public final C45946ns9 m106759k(Integer num) {
        if (this.f9938f.containsKey(num)) {
            return (C45946ns9) this.f9938f.get(num);
        }
        C45946ns9 c45946ns9 = new C45946ns9(this, this.f9936d, null);
        this.f9938f.put(num, c45946ns9);
        return c45946ns9;
    }

    /* renamed from: l */
    public final boolean m106758l(int i, int i2) {
        C45946ns9 c45946ns9 = (C45946ns9) this.f9938f.get(Integer.valueOf(i));
        if (c45946ns9 == null) {
            return false;
        }
        return C45946ns9.m22253b(c45946ns9).get(i2);
    }
}
