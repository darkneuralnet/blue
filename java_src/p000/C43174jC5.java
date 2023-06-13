package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LjC5;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuOrderDetailsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderDetailsAdapterDiff.kt\nco/bird/android/feature/transferorder/sku/adapters/SkuOrderDetailsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,25:1\n18#2:26\n9#3,4:27\n*S KotlinDebug\n*F\n+ 1 SkuOrderDetailsAdapterDiff.kt\nco/bird/android/feature/transferorder/sku/adapters/SkuOrderDetailsAdapterDiff\n*L\n20#1:26\n20#1:27,4\n*E\n"})
/* renamed from: jC5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43174jC5 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C35442Qj4.item_header_value) {
            return "header_section";
        }
        if (m105817b == C35442Qj4.item_header_spannable_status_cta) {
            return "sku_scanned_items";
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (m105816c instanceof C50079ur2) {
            String m9654b = ((C50079ur2) m105816c).m9654b();
            Object m105816c2 = newItem.m105816c();
            String str = null;
            if (!(m105816c2 instanceof C50079ur2)) {
                m105816c2 = null;
            }
            C50079ur2 c50079ur2 = (C50079ur2) m105816c2;
            if (c50079ur2 != null) {
                str = c50079ur2.m9654b();
            }
            if (!Intrinsics.areEqual(m9654b, str)) {
                return true;
            }
        } else if (!Intrinsics.areEqual(m105816c, newItem.m105816c())) {
            return true;
        }
        return false;
    }
}
