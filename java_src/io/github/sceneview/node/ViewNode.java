package io.github.sceneview.node;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.sceneform.rendering.AbstractC18039d;
import com.google.p034ar.sceneform.rendering.C18053i;
import io.github.sceneview.SceneView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR.\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lio/github/sceneview/node/ViewNode;", "Lio/github/sceneview/node/Node;", "LPy1;", "frameTime", "", "g", "Lio/github/sceneview/SceneView;", "sceneView", "q0", "r0", "P0", "N", "", "K", "I", "renderableId", "Lox4;", "value", "P", "Lox4;", "getRenderableInstance", "()Lox4;", "setRenderableInstance", "(Lox4;)V", "renderableInstance", "Lcom/google/ar/sceneform/rendering/i;", "O0", "()Lcom/google/ar/sceneform/rendering/i;", "renderable", "Q", C17296a.f69688o, "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public class ViewNode extends Node {

    /* renamed from: Q */
    public static final C23431a f88177Q = new C23431a(null);

    /* renamed from: R */
    public static final int f88178R = 8;

    /* renamed from: S */
    public static final C42400hu1 f88179S = new C42400hu1(0.0f, 0.0f, -0.1f);

    /* renamed from: T */
    public static final C36315Uc4 f88180T;

    /* renamed from: U */
    public static final C42400hu1 f88181U;

    /* renamed from: W */
    public static final C42400hu1 f88182W;

    /* renamed from: K */
    public int f88183K;

    /* renamed from: P */
    public C46584ox4 f88184P;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lio/github/sceneview/node/ViewNode$a;", "", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.ViewNode$a */
    /* loaded from: classes6.dex */
    public static final class C23431a {
        public /* synthetic */ C23431a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C23431a() {
        }
    }

    static {
        C36315Uc4 c36315Uc4 = new C36315Uc4(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        f88180T = c36315Uc4;
        f88181U = c36315Uc4.m81258e();
        f88182W = new C42400hu1(1.0f);
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: N */
    public void mo33178N() {
        C46584ox4 c46584ox4 = this.f88184P;
        if (c46584ox4 != null) {
            c46584ox4.m20231g();
        }
        super.mo33178N();
    }

    /* renamed from: O0 */
    public final C18053i m33177O0() {
        C46584ox4 c46584ox4 = this.f88184P;
        AbstractC18039d m20224n = c46584ox4 != null ? c46584ox4.m20224n() : null;
        if (m20224n instanceof C18053i) {
            return (C18053i) m20224n;
        }
        return null;
    }

    /* renamed from: P0 */
    public void m33176P0() {
        AbstractC45877nm0 abstractC45877nm0;
        int i;
        C32378Dh0 m48344f;
        mo33195v0();
        C18053i m33177O0 = m33177O0();
        if (m33177O0 != null) {
            abstractC45877nm0 = m33177O0.m48345d();
        } else {
            abstractC45877nm0 = null;
        }
        m33193w0(abstractC45877nm0);
        C18053i m33177O02 = m33177O0();
        if (m33177O02 != null && (m48344f = m33177O02.m48344f()) != null) {
            i = m48344f.m110007b();
        } else {
            i = 0;
        }
        this.f88183K = i;
    }

    @Override // io.github.sceneview.node.Node, p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 frameTime) {
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        super.mo15404g(frameTime);
        if (m33215j0()) {
            C46584ox4 c46584ox4 = this.f88184P;
            if (c46584ox4 != null) {
                c46584ox4.m20221q(mo33227b0());
            }
            C18053i m33177O0 = m33177O0();
            if (m33177O0 != null && m33177O0.m48344f().m110008a(this.f88183K)) {
                m33176P0();
            }
            C46584ox4 c46584ox42 = this.f88184P;
            if (c46584ox42 != null) {
                c46584ox42.m20219s(C39939dl1.m43777j(), c46584ox42.m20222p().f92611a);
            }
        }
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: q0 */
    public void mo33175q0(SceneView sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        super.mo33175q0(sceneView);
        C18053i m33177O0 = m33177O0();
        if (m33177O0 != null) {
            m33177O0.m48240x(sceneView.m33456e0());
        }
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: r0 */
    public void mo33174r0(SceneView sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        super.mo33174r0(sceneView);
        C18053i m33177O0 = m33177O0();
        if (m33177O0 != null) {
            m33177O0.m48239y();
        }
    }
}
