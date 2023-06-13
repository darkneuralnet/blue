package p000;

import android.os.IBinder;
import p000.InterfaceC43880kP1;
/* renamed from: za6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52877za6 {

    /* renamed from: a */
    public final InterfaceC43880kP1 f121562a;

    public C52877za6(InterfaceC43880kP1 interfaceC43880kP1) {
        this.f121562a = interfaceC43880kP1;
    }

    /* renamed from: a */
    public static C52877za6 m1075a(IBinder iBinder) {
        InterfaceC43880kP1 m29019c5;
        if (iBinder == null) {
            m29019c5 = null;
        } else {
            m29019c5 = InterfaceC43880kP1.AbstractBinderC25155a.m29019c5(iBinder);
        }
        if (m29019c5 == null) {
            return null;
        }
        return new C52877za6(m29019c5);
    }
}
