package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.Set;
import p000.C52891zc0;
import p000.InterfaceC32792Fb0;
import p000.InterfaceC36578Vf6;
import p000.InterfaceC51695xb0;
/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements C52891zc0.InterfaceC31059b {
        @Override // p000.C52891zc0.InterfaceC31059b
        public C52891zc0 getCameraXConfig() {
            return Camera2Config.m69664c();
        }
    }

    private Camera2Config() {
    }

    /* renamed from: c */
    public static C52891zc0 m69664c() {
        InterfaceC32792Fb0.InterfaceC2361a interfaceC2361a = new InterfaceC32792Fb0.InterfaceC2361a() { // from class: da0
            @Override // p000.InterfaceC32792Fb0.InterfaceC2361a
            /* renamed from: a */
            public final InterfaceC32792Fb0 mo44117a(Context context, AbstractC46370oc0 abstractC46370oc0, C42812ic0 c42812ic0) {
                return new C49663u90(context, abstractC46370oc0, c42812ic0);
            }
        };
        InterfaceC51695xb0.InterfaceC30238a interfaceC30238a = new InterfaceC51695xb0.InterfaceC30238a() { // from class: ea0
            @Override // p000.InterfaceC51695xb0.InterfaceC30238a
            /* renamed from: a */
            public final InterfaceC51695xb0 mo4972a(Context context, Object obj, Set set) {
                InterfaceC51695xb0 m69663d;
                m69663d = Camera2Config.m69663d(context, obj, set);
                return m69663d;
            }
        };
        return new C52891zc0.C31058a().m1027c(interfaceC2361a).m1026d(interfaceC30238a).m1023g(new InterfaceC36578Vf6.InterfaceC8719c() { // from class: fa0
            @Override // p000.InterfaceC36578Vf6.InterfaceC8719c
            /* renamed from: a */
            public final InterfaceC36578Vf6 mo41163a(Context context) {
                InterfaceC36578Vf6 m69662e;
                m69662e = Camera2Config.m69662e(context);
                return m69662e;
            }
        }).m1029a();
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC51695xb0 m69663d(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new C41606ga0(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC36578Vf6 m69662e(Context context) throws InitializationException {
        return new C45164ma0(context);
    }
}
