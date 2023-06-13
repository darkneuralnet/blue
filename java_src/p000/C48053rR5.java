package p000;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import p000.C46867pR5;
/* renamed from: rR5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48053rR5 implements C46867pR5.InterfaceC27293a {

    /* renamed from: a */
    public final StreamConfigurationMap f107083a;

    /* renamed from: rR5$a */
    /* loaded from: classes.dex */
    public static class C27922a {
        private C27922a() {
        }

        /* renamed from: a */
        public static Size[] m15946a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    public C48053rR5(StreamConfigurationMap streamConfigurationMap) {
        this.f107083a = streamConfigurationMap;
    }

    @Override // p000.C46867pR5.InterfaceC27293a
    /* renamed from: a */
    public StreamConfigurationMap mo15948a() {
        return this.f107083a;
    }

    @Override // p000.C46867pR5.InterfaceC27293a
    /* renamed from: c */
    public Size[] mo15947c(int i) {
        return C27922a.m15946a(this.f107083a, i);
    }
}
