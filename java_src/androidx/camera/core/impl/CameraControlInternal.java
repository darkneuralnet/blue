package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C11213q;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    /* renamed from: a */
    public static final CameraControlInternal f52551a = new C11185a();

    /* loaded from: classes.dex */
    public static final class CameraControlException extends Exception {

        /* renamed from: b */
        public C48129ra0 f52552b;

        public CameraControlException(C48129ra0 c48129ra0) {
            this.f52552b = c48129ra0;
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$a */
    /* loaded from: classes.dex */
    public class C11185a implements CameraControlInternal {
        @Override // androidx.camera.core.impl.CameraControlInternal
        /* renamed from: a */
        public void mo16408a(C11213q.C11215b c11215b) {
        }

        @Override // androidx.camera.core.CameraControl
        /* renamed from: b */
        public ListenableFuture<Void> mo16406b(float f) {
            return IA1.m102836h(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* renamed from: c */
        public ListenableFuture<List<Void>> mo16404c(List<C11192d> list, int i, int i2) {
            return IA1.m102836h(Collections.emptyList());
        }

        @Override // androidx.camera.core.CameraControl
        /* renamed from: d */
        public ListenableFuture<Void> mo16402d(float f) {
            return IA1.m102836h(null);
        }

        @Override // androidx.camera.core.CameraControl
        /* renamed from: e */
        public ListenableFuture<Void> mo16400e(boolean z) {
            return IA1.m102836h(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* renamed from: f */
        public void mo16398f(InterfaceC11197f interfaceC11197f) {
        }

        @Override // androidx.camera.core.CameraControl
        /* renamed from: g */
        public ListenableFuture<C34611Mv1> mo16396g(C32271Cv1 c32271Cv1) {
            return IA1.m102836h(C34611Mv1.m94577b());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* renamed from: h */
        public Rect mo16394h() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* renamed from: i */
        public void mo16392i(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* renamed from: j */
        public InterfaceC11197f mo16390j() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* renamed from: k */
        public void mo16388k() {
        }
    }

    /* renamed from: androidx.camera.core.impl.CameraControlInternal$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11186b {
        /* renamed from: a */
        void mo69475a(List<C11192d> list);

        /* renamed from: b */
        void mo69474b();
    }

    /* renamed from: a */
    void mo16408a(C11213q.C11215b c11215b);

    /* renamed from: c */
    ListenableFuture<List<Void>> mo16404c(List<C11192d> list, int i, int i2);

    /* renamed from: f */
    void mo16398f(InterfaceC11197f interfaceC11197f);

    /* renamed from: h */
    Rect mo16394h();

    /* renamed from: i */
    void mo16392i(int i);

    /* renamed from: j */
    InterfaceC11197f mo16390j();

    /* renamed from: k */
    void mo16388k();
}
