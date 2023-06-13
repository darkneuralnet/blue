package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LLS1;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapterDiff.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,49:1\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n18#2:90\n18#2:95\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n9#3,4:91\n9#3,4:96\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapterDiff.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapterDiff\n*L\n16#1:50\n17#1:55\n19#1:60\n20#1:65\n21#1:70\n22#1:75\n30#1:80\n34#1:85\n38#1:90\n42#1:95\n16#1:51,4\n17#1:56,4\n19#1:61,4\n20#1:66,4\n21#1:71,4\n22#1:76,4\n30#1:81,4\n34#1:86,4\n38#1:91,4\n42#1:96,4\n*E\n"})
/* renamed from: LS1 */
/* loaded from: classes3.dex */
public final class LS1 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        boolean z;
        String str;
        String m23614e;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        Object obj = null;
        if (m105817b == C42293hj4.item_selector) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof C42164hW1) {
                obj = m105816c;
            }
            C42164hW1 c42164hW1 = (C42164hW1) obj;
            if (c42164hW1 == null || (m23614e = c42164hW1.m36257e()) == null) {
                return "";
            }
        } else if (m105817b == C42293hj4.item_manual_entry_selector) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof C45704nU1) {
                obj = m105816c2;
            }
            C45704nU1 c45704nU1 = (C45704nU1) obj;
            if (c45704nU1 == null || (m23614e = c45704nU1.m23614e()) == null) {
                return "";
            }
        } else {
            boolean z2 = true;
            if (m105817b == C42293hj4.item_selector_header || m105817b == C42293hj4.item_debug_header) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object m105816c3 = adapterItem.m105816c();
                if (m105816c3 != null) {
                    z2 = m105816c3 instanceof String;
                }
                if (z2) {
                    obj = m105816c3;
                }
                str = (String) obj;
                if (str == null) {
                    return "";
                }
            } else if (m105817b == C42293hj4.item_debug) {
                Object m105816c4 = adapterItem.m105816c();
                if (!(m105816c4 instanceof C42137hT1)) {
                    m105816c4 = null;
                }
                C42137hT1 c42137hT1 = (C42137hT1) m105816c4;
                if (c42137hT1 != null) {
                    obj = c42137hT1.m36361d();
                }
                return String.valueOf(obj);
            } else if (m105817b == C42293hj4.item_form_edit_text) {
                Object m105816c5 = adapterItem.m105816c();
                if (m105816c5 != null) {
                    z2 = m105816c5 instanceof String;
                }
                if (z2) {
                    obj = m105816c5;
                }
                str = (String) obj;
                if (str == null) {
                    return "";
                }
            } else if (m105817b != C42293hj4.item_document_type) {
                return "";
            } else {
                Object m105816c6 = adapterItem.m105816c();
                if (!(m105816c6 instanceof C42164hW1)) {
                    m105816c6 = null;
                }
                C42164hW1 c42164hW12 = (C42164hW1) m105816c6;
                if (c42164hW12 != null) {
                    obj = (Pair) c42164hW12.m36256f();
                }
                return String.valueOf(obj);
            }
            return str;
        }
        return m23614e;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Object obj = null;
        if (m105816c instanceof C45704nU1) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof C45704nU1)) {
                m105816c2 = null;
            }
            C45704nU1 c45704nU1 = (C45704nU1) m105816c2;
            Object m23613f = ((C45704nU1) m105816c).m23613f();
            if (m23613f != null) {
                if (c45704nU1 != null) {
                    obj = c45704nU1.m23613f();
                }
                if (m23613f.equals(obj)) {
                    z3 = true;
                    if (!z3) {
                        return true;
                    }
                }
            }
            z3 = false;
            if (!z3) {
            }
        } else if (m105816c instanceof C44509lT1) {
            Object m105816c3 = newItem.m105816c();
            if (!(m105816c3 instanceof C44509lT1)) {
                m105816c3 = null;
            }
            C44509lT1 c44509lT1 = (C44509lT1) m105816c3;
            Object m27260e = ((C44509lT1) m105816c).m27260e();
            if (m27260e != null) {
                if (c44509lT1 != null) {
                    obj = c44509lT1.m27260e();
                }
                if (m27260e.equals(obj)) {
                    z2 = true;
                    if (!z2) {
                        return true;
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
        } else if (m105816c instanceof C42164hW1) {
            Object m105816c4 = newItem.m105816c();
            if (!(m105816c4 instanceof C42164hW1)) {
                m105816c4 = null;
            }
            C42164hW1 c42164hW1 = (C42164hW1) m105816c4;
            Object m36256f = ((C42164hW1) m105816c).m36256f();
            if (m36256f != null) {
                if (c42164hW1 != null) {
                    obj = c42164hW1.m36256f();
                }
                if (m36256f.equals(obj)) {
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        } else if (m105816c instanceof C42137hT1) {
            Object m105816c5 = newItem.m105816c();
            if (!(m105816c5 instanceof C42137hT1)) {
                m105816c5 = null;
            }
            C42137hT1 c42137hT1 = (C42137hT1) m105816c5;
            AbstractC41544gT1 m36361d = ((C42137hT1) m105816c).m36361d();
            if (c42137hT1 != null) {
                obj = c42137hT1.m36361d();
            }
            if (!Intrinsics.areEqual(m36361d, obj)) {
                return true;
            }
        }
        return false;
    }
}
