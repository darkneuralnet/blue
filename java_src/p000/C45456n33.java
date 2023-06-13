package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.wire.WireFlagNestReason;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Ln33;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlaggingAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapterDiff.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,34:1\n18#2:35\n18#2:40\n9#3,4:36\n9#3,4:41\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapterDiff.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapterDiff\n*L\n14#1:35\n25#1:40\n14#1:36,4\n25#1:41,4\n*E\n"})
/* renamed from: n33  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45456n33 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        WireFlagNestReason wireFlagNestReason;
        String code;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C47630qj4.item_flag_reason) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair == null || (wireFlagNestReason = (WireFlagNestReason) pair.getFirst()) == null || (code = wireFlagNestReason.getCode()) == null) {
                return "";
            }
            return code;
        } else if (m105817b == C45268mk4.item_nest_size) {
            return "nest_size";
        } else {
            if (m105817b != C47630qj4.item_flag_comment) {
                return "";
            }
            return "comment";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) m105816c;
        if (!(pair.getSecond() instanceof Boolean)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof Pair)) {
            m105816c2 = null;
        }
        Pair pair2 = (Pair) m105816c2;
        if (pair2 != null && ((Boolean) pair.getSecond()).booleanValue() == ((Boolean) pair2.getSecond()).booleanValue()) {
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
