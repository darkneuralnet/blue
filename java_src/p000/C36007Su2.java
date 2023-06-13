package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LSu2;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalHostAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostAdapterDiff.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,28:1\n18#2:29\n18#2:34\n9#3,4:30\n9#3,4:35\n*S KotlinDebug\n*F\n+ 1 LocalHostAdapterDiff.kt\nco/bird/android/feature/localhost/adapters/LocalHostAdapterDiff\n*L\n13#1:29\n21#1:34\n13#1:30,4\n21#1:35,4\n*E\n"})
/* renamed from: Su2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36007Su2 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        EnumC40897fN1 m39566c;
        String name;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C43479jj4.item_local_address) {
            return "local_address";
        }
        if (m105817b == C43479jj4.item_host) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof C41490gN1)) {
                m105816c = null;
            }
            C41490gN1 c41490gN1 = (C41490gN1) m105816c;
            if (c41490gN1 != null && (m39566c = c41490gN1.m39566c()) != null && (name = m39566c.name()) != null) {
                return name;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof C41490gN1)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof C41490gN1)) {
            m105816c2 = null;
        }
        C41490gN1 c41490gN1 = (C41490gN1) m105816c2;
        if (c41490gN1 != null && ((C41490gN1) m105816c).m39567b() == c41490gN1.m39567b()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }
}
