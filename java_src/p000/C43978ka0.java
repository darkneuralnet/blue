package p000;

import androidx.camera.core.impl.C11213q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C48179rf0;
/* renamed from: ka0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43978ka0 implements InterfaceC39068cJ4 {

    /* renamed from: a */
    public final C48179rf0 f94525a;

    /* renamed from: b */
    public final List<C53086zv5> f94526b;

    /* renamed from: c */
    public volatile boolean f94527c = false;

    /* renamed from: d */
    public volatile C11213q f94528d;

    public C43978ka0(C48179rf0 c48179rf0, List<C53086zv5> list) {
        boolean z = c48179rf0.f107419l == C48179rf0.EnumC27973e.OPENED;
        HZ3.m103736b(z, "CaptureSession state must be OPENED. Current state:" + c48179rf0.f107419l);
        this.f94525a = c48179rf0;
        this.f94526b = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public void m28826a() {
        this.f94527c = true;
    }

    /* renamed from: b */
    public void m28825b(C11213q c11213q) {
        this.f94528d = c11213q;
    }
}
