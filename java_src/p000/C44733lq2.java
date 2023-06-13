package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: lq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44733lq2 implements InterfaceC33026Gb0 {

    /* renamed from: b */
    public final int f96791b;

    public C44733lq2(int i) {
        this.f96791b = i;
    }

    @Override // p000.InterfaceC33026Gb0
    /* renamed from: a */
    public List<InterfaceC33728Jb0> mo26747a(List<InterfaceC33728Jb0> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC33728Jb0 interfaceC33728Jb0 : list) {
            HZ3.m103736b(interfaceC33728Jb0 instanceof InterfaceC33962Kb0, "The camera info doesn't contain internal implementation.");
            if (interfaceC33728Jb0.mo100139b() == this.f96791b) {
                arrayList.add(interfaceC33728Jb0);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public int m26746b() {
        return this.f96791b;
    }
}
