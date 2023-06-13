package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: eQ3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40333eQ3 {

    /* renamed from: d */
    public static final List<C40333eQ3> f78384d = new ArrayList();

    /* renamed from: a */
    public Object f78385a;

    /* renamed from: b */
    public C46885pT5 f78386b;

    /* renamed from: c */
    public C40333eQ3 f78387c;

    public C40333eQ3(Object obj, C46885pT5 c46885pT5) {
        this.f78385a = obj;
        this.f78386b = c46885pT5;
    }

    /* renamed from: a */
    public static C40333eQ3 m42887a(C46885pT5 c46885pT5, Object obj) {
        List<C40333eQ3> list = f78384d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                C40333eQ3 remove = list.remove(size - 1);
                remove.f78385a = obj;
                remove.f78386b = c46885pT5;
                remove.f78387c = null;
                return remove;
            }
            return new C40333eQ3(obj, c46885pT5);
        }
    }

    /* renamed from: b */
    public static void m42886b(C40333eQ3 c40333eQ3) {
        c40333eQ3.f78385a = null;
        c40333eQ3.f78386b = null;
        c40333eQ3.f78387c = null;
        List<C40333eQ3> list = f78384d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(c40333eQ3);
            }
        }
    }
}
