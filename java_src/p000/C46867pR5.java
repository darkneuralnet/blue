package p000;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
/* renamed from: pR5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46867pR5 {

    /* renamed from: a */
    public final InterfaceC27293a f103670a;

    /* renamed from: b */
    public final C41375gA3 f103671b;

    /* renamed from: pR5$a */
    /* loaded from: classes.dex */
    public interface InterfaceC27293a {
        /* renamed from: a */
        StreamConfigurationMap mo15948a();

        /* renamed from: b */
        Size[] mo17507b(int i);

        /* renamed from: c */
        Size[] mo15947c(int i);
    }

    public C46867pR5(StreamConfigurationMap streamConfigurationMap, C41375gA3 c41375gA3) {
        this.f103670a = new C47460qR5(streamConfigurationMap);
        this.f103671b = c41375gA3;
    }

    /* renamed from: d */
    public static C46867pR5 m19303d(StreamConfigurationMap streamConfigurationMap, C41375gA3 c41375gA3) {
        return new C46867pR5(streamConfigurationMap, c41375gA3);
    }

    /* renamed from: a */
    public Size[] m19306a(int i) {
        return this.f103670a.mo15947c(i);
    }

    /* renamed from: b */
    public Size[] m19305b(int i) {
        return this.f103671b.m39959b(this.f103670a.mo17507b(i), i);
    }

    /* renamed from: c */
    public StreamConfigurationMap m19304c() {
        return this.f103670a.mo15948a();
    }
}
