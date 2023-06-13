package androidx.camera.core;

import com.google.common.util.concurrent.ListenableFuture;
/* loaded from: classes.dex */
public interface CameraControl {

    /* loaded from: classes.dex */
    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }
    }

    /* renamed from: b */
    ListenableFuture<Void> mo16406b(float f);

    /* renamed from: d */
    ListenableFuture<Void> mo16402d(float f);

    /* renamed from: e */
    ListenableFuture<Void> mo16400e(boolean z);

    /* renamed from: g */
    ListenableFuture<C34611Mv1> mo16396g(C32271Cv1 c32271Cv1);
}
