package com.google.p034ar.core;

import android.media.ImageReader;
/* renamed from: com.google.ar.core.SharedCamera$$ExternalSyntheticLambda0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class SharedCamera$$ExternalSyntheticLambda0 implements ImageReader.OnImageAvailableListener {
    public static final /* synthetic */ SharedCamera$$ExternalSyntheticLambda0 INSTANCE = new SharedCamera$$ExternalSyntheticLambda0();

    private /* synthetic */ SharedCamera$$ExternalSyntheticLambda0() {
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0(imageReader);
    }
}
