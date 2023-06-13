package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C11522c {

    /* renamed from: a */
    public SparseIntArray f54207a = new SparseIntArray();

    /* renamed from: b */
    public HashMap<Integer, HashSet<WeakReference<InterfaceC11523a>>> f54208b = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11523a {
    }

    /* renamed from: a */
    public void m67779a(int i, InterfaceC11523a interfaceC11523a) {
        HashSet<WeakReference<InterfaceC11523a>> hashSet = this.f54208b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f54208b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(interfaceC11523a));
    }

    /* renamed from: b */
    public void m67778b(int i, InterfaceC11523a interfaceC11523a) {
        HashSet<WeakReference<InterfaceC11523a>> hashSet = this.f54208b.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<InterfaceC11523a>> it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC11523a> next = it.next();
            InterfaceC11523a interfaceC11523a2 = next.get();
            if (interfaceC11523a2 == null || interfaceC11523a2 == interfaceC11523a) {
                arrayList.add(next);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
