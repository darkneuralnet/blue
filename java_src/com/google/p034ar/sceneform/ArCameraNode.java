package com.google.p034ar.sceneform;

import com.google.p034ar.core.Camera;
import com.google.p034ar.core.Pose;
/* renamed from: com.google.ar.sceneform.ArCameraNode */
/* loaded from: classes6.dex */
public class ArCameraNode extends CameraNode {
    public ArCameraNode() {
        super(false);
    }

    @Override // com.google.p034ar.sceneform.CameraNode
    /* renamed from: U0 */
    public void mo48375U0() {
    }

    /* renamed from: X0 */
    public void m48382X0(Camera camera) {
        DZ3.m110173d(camera, "Parameter \"camera\" was null.");
        camera.getProjectionMatrix(this.f73856P.f92611a, 0, this.f73858R, this.f73859S);
        camera.getViewMatrix(m48377S0().f92611a, 0);
        Pose displayOrientedPose = camera.getDisplayOrientedPose();
        super.m33188z0(CY3.m112148b(displayOrientedPose));
        super.m33266A0(CY3.m112147c(displayOrientedPose));
        this.f73862W = true;
    }
}
