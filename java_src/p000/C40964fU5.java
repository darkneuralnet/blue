package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LfU5;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuggestNestAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapterDiff.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,28:1\n18#2:29\n18#2:34\n9#3,4:30\n9#3,4:35\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapterDiff.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapterDiff\n*L\n13#1:29\n22#1:34\n13#1:30,4\n22#1:35,4\n*E\n"})
/* renamed from: fU5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40964fU5 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        EnumC43929kU5 m30568f;
        String name;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C35208Pj4.item_suggest_nest_detail) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof C43336jU5)) {
                m105816c = null;
            }
            C43336jU5 c43336jU5 = (C43336jU5) m105816c;
            if (c43336jU5 == null || (m30568f = c43336jU5.m30568f()) == null || (name = m30568f.name()) == null) {
                return "";
            }
            return name;
        } else if (m105817b != C45268mk4.item_nest_size) {
            return "";
        } else {
            return "nest_size";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof C43336jU5)) {
            return false;
        }
        C43336jU5 c43336jU5 = (C43336jU5) m105816c;
        if (c43336jU5.m30571c()) {
            return false;
        }
        String m30572b = c43336jU5.m30572b();
        Object m105816c2 = newItem.m105816c();
        String str = null;
        if (!(m105816c2 instanceof C43336jU5)) {
            m105816c2 = null;
        }
        C43336jU5 c43336jU52 = (C43336jU5) m105816c2;
        if (c43336jU52 != null) {
            str = c43336jU52.m30572b();
        }
        if (Intrinsics.areEqual(m30572b, str)) {
            return false;
        }
        return true;
    }
}
