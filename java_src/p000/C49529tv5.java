package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* renamed from: tv5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49529tv5 {

    /* renamed from: a */
    public final InterfaceC28965c f111375a;

    /* renamed from: tv5$b */
    /* loaded from: classes.dex */
    public static final class C28964b implements InterfaceC28965c {

        /* renamed from: a */
        public final List<C36053Sz3> f111378a;

        /* renamed from: b */
        public final CameraCaptureSession.StateCallback f111379b;

        /* renamed from: c */
        public final Executor f111380c;

        /* renamed from: d */
        public final int f111381d;

        /* renamed from: e */
        public R22 f111382e = null;

        /* renamed from: f */
        public CaptureRequest f111383f = null;

        public C28964b(int i, List<C36053Sz3> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f111381d = i;
            this.f111378a = Collections.unmodifiableList(new ArrayList(list));
            this.f111379b = stateCallback;
            this.f111380c = executor;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: a */
        public Executor mo11209a() {
            return this.f111380c;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: b */
        public R22 mo11208b() {
            return this.f111382e;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo11207c() {
            return this.f111379b;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: d */
        public List<C36053Sz3> mo11206d() {
            return this.f111378a;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: e */
        public void mo11205e(R22 r22) {
            if (this.f111381d != 1) {
                this.f111382e = r22;
                return;
            }
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C28964b) {
                C28964b c28964b = (C28964b) obj;
                if (Objects.equals(this.f111382e, c28964b.f111382e) && this.f111381d == c28964b.f111381d && this.f111378a.size() == c28964b.f111378a.size()) {
                    for (int i = 0; i < this.f111378a.size(); i++) {
                        if (!this.f111378a.get(i).equals(c28964b.f111378a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: f */
        public Object mo11204f() {
            return null;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: g */
        public int mo11203g() {
            return this.f111381d;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: h */
        public void mo11202h(CaptureRequest captureRequest) {
            this.f111383f = captureRequest;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f111378a.hashCode() ^ 31;
            int i = (hashCode2 << 5) - hashCode2;
            R22 r22 = this.f111382e;
            if (r22 == null) {
                hashCode = 0;
            } else {
                hashCode = r22.hashCode();
            }
            int i2 = hashCode ^ i;
            return this.f111381d ^ ((i2 << 5) - i2);
        }
    }

    /* renamed from: tv5$c */
    /* loaded from: classes.dex */
    public interface InterfaceC28965c {
        /* renamed from: a */
        Executor mo11209a();

        /* renamed from: b */
        R22 mo11208b();

        /* renamed from: c */
        CameraCaptureSession.StateCallback mo11207c();

        /* renamed from: d */
        List<C36053Sz3> mo11206d();

        /* renamed from: e */
        void mo11205e(R22 r22);

        /* renamed from: f */
        Object mo11204f();

        /* renamed from: g */
        int mo11203g();

        /* renamed from: h */
        void mo11202h(CaptureRequest captureRequest);
    }

    public C49529tv5(int i, List<C36053Sz3> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f111375a = new C28964b(i, list, executor, stateCallback);
        } else {
            this.f111375a = new C28963a(i, list, executor, stateCallback);
        }
    }

    /* renamed from: h */
    public static List<OutputConfiguration> m11212h(List<C36053Sz3> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C36053Sz3 c36053Sz3 : list) {
            arrayList.add((OutputConfiguration) c36053Sz3.m84503g());
        }
        return arrayList;
    }

    /* renamed from: i */
    public static List<C36053Sz3> m11211i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration outputConfiguration : list) {
            arrayList.add(C36053Sz3.m84502h(outputConfiguration));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Executor m11219a() {
        return this.f111375a.mo11209a();
    }

    /* renamed from: b */
    public R22 m11218b() {
        return this.f111375a.mo11208b();
    }

    /* renamed from: c */
    public List<C36053Sz3> m11217c() {
        return this.f111375a.mo11206d();
    }

    /* renamed from: d */
    public int m11216d() {
        return this.f111375a.mo11203g();
    }

    /* renamed from: e */
    public CameraCaptureSession.StateCallback m11215e() {
        return this.f111375a.mo11207c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C49529tv5)) {
            return false;
        }
        return this.f111375a.equals(((C49529tv5) obj).f111375a);
    }

    /* renamed from: f */
    public void m11214f(R22 r22) {
        this.f111375a.mo11205e(r22);
    }

    /* renamed from: g */
    public void m11213g(CaptureRequest captureRequest) {
        this.f111375a.mo11202h(captureRequest);
    }

    public int hashCode() {
        return this.f111375a.hashCode();
    }

    /* renamed from: j */
    public Object m11210j() {
        return this.f111375a.mo11204f();
    }

    /* renamed from: tv5$a */
    /* loaded from: classes.dex */
    public static final class C28963a implements InterfaceC28965c {

        /* renamed from: a */
        public final SessionConfiguration f111376a;

        /* renamed from: b */
        public final List<C36053Sz3> f111377b;

        public C28963a(Object obj) {
            List outputConfigurations;
            this.f111376a = C48731sb0.m13971a(obj);
            outputConfigurations = C48731sb0.m13971a(obj).getOutputConfigurations();
            this.f111377b = Collections.unmodifiableList(C49529tv5.m11211i(outputConfigurations));
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: a */
        public Executor mo11209a() {
            Executor executor;
            executor = this.f111376a.getExecutor();
            return executor;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: b */
        public R22 mo11208b() {
            InputConfiguration inputConfiguration;
            inputConfiguration = this.f111376a.getInputConfiguration();
            return R22.m87400b(inputConfiguration);
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo11207c() {
            CameraCaptureSession.StateCallback stateCallback;
            stateCallback = this.f111376a.getStateCallback();
            return stateCallback;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: d */
        public List<C36053Sz3> mo11206d() {
            return this.f111377b;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: e */
        public void mo11205e(R22 r22) {
            this.f111376a.setInputConfiguration((InputConfiguration) r22.m87401a());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C28963a)) {
                return false;
            }
            return Objects.equals(this.f111376a, ((C28963a) obj).f111376a);
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: f */
        public Object mo11204f() {
            return this.f111376a;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: g */
        public int mo11203g() {
            int sessionType;
            sessionType = this.f111376a.getSessionType();
            return sessionType;
        }

        @Override // p000.C49529tv5.InterfaceC28965c
        /* renamed from: h */
        public void mo11202h(CaptureRequest captureRequest) {
            this.f111376a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.f111376a.hashCode();
            return hashCode;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C28963a(int i, List<C36053Sz3> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(C43600jv5.m29763a(i, C49529tv5.m11212h(list), executor, stateCallback));
            C44193kv5.m28159a();
        }
    }
}
