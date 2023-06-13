package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: u90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49663u90 implements InterfaceC32792Fb0 {

    /* renamed from: a */
    public final InterfaceC43988kb0 f111806a;

    /* renamed from: b */
    public final AbstractC46370oc0 f111807b;

    /* renamed from: c */
    public final C45777nc0 f111808c;

    /* renamed from: d */
    public final C35600Rb0 f111809d;

    /* renamed from: e */
    public final List<String> f111810e;

    /* renamed from: f */
    public final C42509i51 f111811f;

    /* renamed from: g */
    public final Map<String, J90> f111812g = new HashMap();

    public C49663u90(Context context, AbstractC46370oc0 abstractC46370oc0, C42812ic0 c42812ic0) throws InitializationException {
        this.f111807b = abstractC46370oc0;
        C35600Rb0 m86591b = C35600Rb0.m86591b(context, abstractC46370oc0.mo18567c());
        this.f111809d = m86591b;
        this.f111811f = C42509i51.m34487b(context);
        this.f111810e = m10786e(C42219hc0.m36165b(this, c42812ic0));
        C49070t90 c49070t90 = new C49070t90(m86591b);
        this.f111806a = c49070t90;
        C45777nc0 c45777nc0 = new C45777nc0(c49070t90, 1);
        this.f111808c = c45777nc0;
        c49070t90.mo13006a(c45777nc0);
    }

    @Override // p000.InterfaceC32792Fb0
    /* renamed from: a */
    public InterfaceC34196Lb0 mo10790a(String str) throws CameraUnavailableException {
        if (this.f111810e.contains(str)) {
            return new F90(this.f111809d, str, m10785f(str), this.f111806a, this.f111808c, this.f111807b.mo18568b(), this.f111807b.mo18567c(), this.f111811f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // p000.InterfaceC32792Fb0
    /* renamed from: b */
    public Set<String> mo10789b() {
        return new LinkedHashSet(this.f111810e);
    }

    @Override // p000.InterfaceC32792Fb0
    /* renamed from: c */
    public InterfaceC43988kb0 mo10788c() {
        return this.f111806a;
    }

    /* renamed from: e */
    public final List<String> m10786e(List<String> list) throws InitializationException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.equals("0") && !str.equals("1")) {
                if (m10783h(str)) {
                    arrayList.add(str);
                } else {
                    C33928Jx2.m99533a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public J90 m10785f(String str) throws CameraUnavailableException {
        try {
            J90 j90 = this.f111812g.get(str);
            if (j90 == null) {
                J90 j902 = new J90(str, this.f111809d);
                this.f111812g.put(str, j902);
                return j902;
            }
            return j90;
        } catch (CameraAccessExceptionCompat e) {
            throw C46963pc0.m19068a(e);
        }
    }

    @Override // p000.InterfaceC32792Fb0
    /* renamed from: g */
    public C35600Rb0 mo10787d() {
        return this.f111809d;
    }

    /* renamed from: h */
    public final boolean m10783h(String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f111809d.m86590c(str).m78176a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(C46963pc0.m19068a(e));
        }
    }
}
