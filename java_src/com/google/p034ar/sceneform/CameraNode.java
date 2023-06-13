package com.google.p034ar.sceneform;

import com.google.android.filament.Camera;
import io.github.sceneview.SceneView;
import io.github.sceneview.node.Node;
import java.util.Arrays;
/* renamed from: com.google.ar.sceneform.CameraNode */
/* loaded from: classes6.dex */
public class CameraNode extends Node {

    /* renamed from: Z */
    public static final C42400hu1 f73853Z = new C42400hu1(0.0f, 0.0f, 1.0f);

    /* renamed from: p0 */
    public static final C36315Uc4 f73854p0 = new C36315Uc4();

    /* renamed from: K */
    public final C43270jN2 f73855K;

    /* renamed from: P */
    public final C43270jN2 f73856P;

    /* renamed from: Q */
    public Camera f73857Q;

    /* renamed from: R */
    public float f73858R;

    /* renamed from: S */
    public float f73859S;

    /* renamed from: T */
    public float f73860T;

    /* renamed from: U */
    public boolean f73861U;

    /* renamed from: W */
    public boolean f73862W;

    /* renamed from: X */
    public float[] f73863X;

    /* renamed from: Y */
    public float[] f73864Y;

    public CameraNode() {
        this(true);
    }

    /* renamed from: O0 */
    public float m48381O0() {
        return this.f73859S;
    }

    /* renamed from: P0 */
    public float m48380P0() {
        return this.f73858R;
    }

    /* renamed from: Q0 */
    public C43270jN2 m48379Q0() {
        return this.f73856P;
    }

    /* renamed from: R0 */
    public final int m48378R0() {
        SceneView mo33227b0 = mo33227b0();
        if (mo33227b0 == null) {
            return 1080;
        }
        return mo33227b0.getHeight();
    }

    /* renamed from: S0 */
    public C43270jN2 m48377S0() {
        C43270jN2.m30751b(mo21708y(), this.f73855K);
        return this.f73855K;
    }

    /* renamed from: T0 */
    public final int m48376T0() {
        SceneView mo33227b0 = mo33227b0();
        if (mo33227b0 == null) {
            return 1920;
        }
        return mo33227b0.getWidth();
    }

    /* renamed from: U0 */
    public void mo48375U0() {
        int m48376T0 = m48376T0();
        int m48378R0 = m48378R0();
        if (m48376T0 != 0 && m48378R0 != 0) {
            m48374V0(this.f73860T, m48376T0 / m48378R0, this.f73858R, this.f73859S);
        }
    }

    /* renamed from: V0 */
    public final void m48374V0(float f, float f2, float f3, float f4) {
        if (f > 0.0f && f < 180.0f) {
            if (f2 > 0.0f) {
                float tan = ((float) Math.tan(Math.toRadians(f) * 0.5d)) * f3;
                float f5 = tan * f2;
                m48373W0(-f5, f5, -tan, tan, f3, f4);
                return;
            }
            throw new IllegalArgumentException("Parameter \"aspect\" must be greater than zero.");
        }
        throw new IllegalArgumentException("Parameter \"verticalFovInDegrees\" is out of the valid range of (0, 180) degrees.");
    }

    /* renamed from: W0 */
    public final void m48373W0(float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr = this.f73856P.f92611a;
        if (f != f2 && f3 != f4 && f5 > 0.0f && f6 > f5) {
            float f7 = 1.0f / (f2 - f);
            float f8 = 1.0f / (f4 - f3);
            float f9 = 1.0f / (f6 - f5);
            float f10 = 2.0f * f5;
            fArr[0] = f10 * f7;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f10 * f8;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = (f2 + f) * f7;
            fArr[9] = (f4 + f3) * f8;
            fArr[10] = (-(f6 + f5)) * f9;
            fArr[11] = -1.0f;
            fArr[12] = 0.0f;
            fArr[13] = 0.0f;
            fArr[14] = (-2.0f) * f6 * f5 * f9;
            fArr[15] = 0.0f;
            this.f73858R = f5;
            this.f73859S = f6;
            this.f73862W = true;
            return;
        }
        throw new IllegalArgumentException("Invalid parameters to setPerspective, valid values:  width != height, bottom != top, near > 0.0f, far > near");
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return super.m33247L();
    }

    @Override // io.github.sceneview.node.Node, p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 c35340Py1) {
        super.mo15404g(c35340Py1);
        float[] fArr = mo21708y().f92611a;
        if (!Arrays.equals(fArr, this.f73863X)) {
            this.f73863X = fArr;
            this.f73857Q.setModelMatrix(fArr);
        }
        float[] fArr2 = m48379Q0().f92611a;
        if (!Arrays.equals(fArr2, this.f73864Y)) {
            this.f73864Y = fArr2;
            double[] dArr = new double[fArr2.length];
            for (int i = 0; i < fArr2.length; i++) {
                dArr[i] = fArr2[i];
            }
            this.f73857Q.setCustomProjection(dArr, m48380P0(), m48381O0());
        }
    }

    @Override // io.github.sceneview.node.Node, p000.VX0
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
        try {
            C39939dl1.m43784c().destroyCameraComponent(this.f73857Q.getEntity());
        } catch (Exception unused) {
        }
        try {
            C39939dl1.m43783d().destroy(this.f73857Q.getEntity());
        } catch (Exception unused2) {
        }
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: v0 */
    public void mo33195v0() {
        super.mo33195v0();
    }

    public CameraNode(boolean z) {
        this.f73855K = new C43270jN2();
        this.f73856P = new C43270jN2();
        this.f73858R = 0.01f;
        this.f73859S = 30.0f;
        this.f73860T = 90.0f;
        this.f73863X = new float[16];
        this.f73864Y = new float[16];
        this.f73857Q = C40531el1.m42578b(C39939dl1.m43784c());
        this.f73861U = z;
        m33188z0(f73853Z);
        m33266A0(f73854p0);
    }
}
