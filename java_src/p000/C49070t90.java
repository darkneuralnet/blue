package p000;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.InterfaceC43988kb0;
/* renamed from: t90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49070t90 implements InterfaceC43988kb0 {

    /* renamed from: a */
    public final C35600Rb0 f109943a;

    /* renamed from: f */
    public int f109948f = 0;

    /* renamed from: c */
    public final Map<String, List<String>> f109945c = new HashMap();

    /* renamed from: e */
    public Set<Set<String>> f109947e = new HashSet();

    /* renamed from: b */
    public final List<InterfaceC43988kb0.InterfaceC25187a> f109944b = new ArrayList();

    /* renamed from: d */
    public List<InterfaceC33728Jb0> f109946d = new ArrayList();

    public C49070t90(C35600Rb0 c35600Rb0) {
        this.f109943a = c35600Rb0;
        m13002e();
    }

    @Override // p000.InterfaceC43988kb0
    /* renamed from: a */
    public void mo13006a(InterfaceC43988kb0.InterfaceC25187a interfaceC25187a) {
        this.f109944b.add(interfaceC25187a);
    }

    @Override // p000.InterfaceC43988kb0
    /* renamed from: b */
    public String mo13005b(String str) {
        if (!this.f109945c.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f109945c.get(str)) {
            for (InterfaceC33728Jb0 interfaceC33728Jb0 : this.f109946d) {
                if (str2.equals(H90.m104281a(interfaceC33728Jb0).m104280b())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // p000.InterfaceC43988kb0
    /* renamed from: c */
    public int mo13004c() {
        return this.f109948f;
    }

    @Override // p000.InterfaceC43988kb0
    /* renamed from: d */
    public void mo13003d(int i) {
        if (i != this.f109948f) {
            for (InterfaceC43988kb0.InterfaceC25187a interfaceC25187a : this.f109944b) {
                interfaceC25187a.mo23453a(this.f109948f, i);
            }
        }
        if (this.f109948f == 2 && i != 2) {
            this.f109946d.clear();
        }
        this.f109948f = i;
    }

    /* renamed from: e */
    public final void m13002e() {
        try {
            this.f109947e = this.f109943a.m86588e();
        } catch (CameraAccessExceptionCompat unused) {
            C33928Jx2.m99531c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        for (Set<String> set : this.f109947e) {
            ArrayList arrayList = new ArrayList(set);
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                if (!this.f109945c.containsKey(str)) {
                    this.f109945c.put(str, new ArrayList());
                }
                if (!this.f109945c.containsKey(str2)) {
                    this.f109945c.put(str2, new ArrayList());
                }
                this.f109945c.get(arrayList.get(0)).add((String) arrayList.get(1));
                this.f109945c.get(arrayList.get(1)).add((String) arrayList.get(0));
            }
        }
    }
}
