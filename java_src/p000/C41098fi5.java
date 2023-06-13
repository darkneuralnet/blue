package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lfi5;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "save-money_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSaveMoneyAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveMoneyAdapterDiff.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,25:1\n18#2:26\n18#2:31\n18#2:36\n9#3,4:27\n9#3,4:32\n9#3,4:37\n*S KotlinDebug\n*F\n+ 1 SaveMoneyAdapterDiff.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapterDiff\n*L\n9#1:26\n10#1:31\n18#1:36\n9#1:27,4\n10#1:32,4\n18#1:37,4\n*E\n"})
/* renamed from: fi5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41098fi5 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String name;
        String num;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        Integer num2 = null;
        if (m105817b == C34038Kj4.item_title) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof Integer) {
                num2 = m105816c;
            }
            Integer num3 = num2;
            if (num3 == null || (num = num3.toString()) == null) {
                return "title";
            }
            return num;
        }
        if (m105817b == C34038Kj4.item_save_money_card) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof EnumC42284hi5) {
                num2 = m105816c2;
            }
            EnumC42284hi5 enumC42284hi5 = num2;
            if (enumC42284hi5 != null && (name = enumC42284hi5.name()) != null) {
                return name;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof EnumC42284hi5)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof EnumC42284hi5)) {
            m105816c2 = null;
        }
        if (m105816c == ((EnumC42284hi5) m105816c2)) {
            return false;
        }
        return true;
    }
}
