package io.github.sceneview.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R:\u0010\u0010\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"Lio/github/sceneview/node/LightNode;", "Lio/github/sceneview/node/Node;", "LPy1;", "frameTime", "", "g", "N", "", "Lio/github/sceneview/light/Light;", "value", "K", "Ljava/lang/Integer;", "getLight", "()Ljava/lang/Integer;", "setLight", "(Ljava/lang/Integer;)V", "light", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public class LightNode extends Node {

    /* renamed from: K */
    public Integer f88080K;

    @Override // io.github.sceneview.node.Node
    /* renamed from: N */
    public void mo33178N() {
        super.mo33178N();
        Integer num = this.f88080K;
        if (num != null) {
            C34801Nq2.m93305c(num.intValue());
        }
    }

    @Override // io.github.sceneview.node.Node, p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 frameTime) {
        Integer num;
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        super.mo15404g(frameTime);
        if (m33215j0() && (num = this.f88080K) != null) {
            int intValue = num.intValue();
            if (!Intrinsics.areEqual(C34801Nq2.m93297k(intValue), m33219g0())) {
                C34801Nq2.m93288t(intValue, m33219g0());
            }
            C36315Uc4 m33218h0 = m33218h0();
            C36315Uc4 c36315Uc4 = new C36315Uc4(new C42400hu1(0.0f, 1.0f, 0.0f, 5, null), 0.0f);
            C36315Uc4 c36315Uc42 = new C36315Uc4((((m33218h0.m81262a() * c36315Uc4.m81261b()) + (m33218h0.m81261b() * c36315Uc4.m81262a())) + (m33218h0.m81260c() * c36315Uc4.m81259d())) - (m33218h0.m81259d() * c36315Uc4.m81260c()), ((m33218h0.m81262a() * c36315Uc4.m81260c()) - (m33218h0.m81261b() * c36315Uc4.m81259d())) + (m33218h0.m81260c() * c36315Uc4.m81262a()) + (m33218h0.m81259d() * c36315Uc4.m81261b()), (((m33218h0.m81262a() * c36315Uc4.m81259d()) + (m33218h0.m81261b() * c36315Uc4.m81260c())) - (m33218h0.m81260c() * c36315Uc4.m81261b())) + (m33218h0.m81259d() * c36315Uc4.m81262a()), (((m33218h0.m81262a() * c36315Uc4.m81262a()) - (m33218h0.m81261b() * c36315Uc4.m81261b())) - (m33218h0.m81260c() * c36315Uc4.m81260c())) - (m33218h0.m81259d() * c36315Uc4.m81259d()));
            C36315Uc4 m78135c = C36783Wc4.m78135c(m33218h0);
            C36315Uc4 c36315Uc43 = new C36315Uc4((((c36315Uc42.m81262a() * m78135c.m81261b()) + (c36315Uc42.m81261b() * m78135c.m81262a())) + (c36315Uc42.m81260c() * m78135c.m81259d())) - (c36315Uc42.m81259d() * m78135c.m81260c()), ((c36315Uc42.m81262a() * m78135c.m81260c()) - (c36315Uc42.m81261b() * m78135c.m81259d())) + (c36315Uc42.m81260c() * m78135c.m81262a()) + (c36315Uc42.m81259d() * m78135c.m81261b()), (((c36315Uc42.m81262a() * m78135c.m81259d()) + (c36315Uc42.m81261b() * m78135c.m81260c())) - (c36315Uc42.m81260c() * m78135c.m81261b())) + (c36315Uc42.m81259d() * m78135c.m81262a()), (((c36315Uc42.m81262a() * m78135c.m81262a()) - (c36315Uc42.m81261b() * m78135c.m81261b())) - (c36315Uc42.m81260c() * m78135c.m81260c())) - (c36315Uc42.m81259d() * m78135c.m81259d()));
            C42400hu1 c42400hu1 = new C42400hu1(c36315Uc43.m81261b(), c36315Uc43.m81260c(), c36315Uc43.m81259d());
            if (!Intrinsics.areEqual(C34801Nq2.m93303e(intValue), c42400hu1)) {
                C34801Nq2.m93290r(intValue, c42400hu1);
            }
        }
    }
}
