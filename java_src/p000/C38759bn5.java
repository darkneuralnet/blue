package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.constant.ScrapRequestReason;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lbn5;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapterDiff.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,36:1\n18#2:37\n18#2:42\n18#2:47\n18#2:52\n9#3,4:38\n9#3,4:43\n9#3,4:48\n9#3,4:53\n*S KotlinDebug\n*F\n+ 1 ScrapAdapterDiff.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapterDiff\n*L\n13#1:37\n14#1:42\n25#1:47\n29#1:52\n13#1:38,4\n14#1:43,4\n25#1:48,4\n29#1:53,4\n*E\n"})
/* renamed from: bn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38759bn5 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        ScrapRequestReason m103408d;
        String name;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        String str = null;
        if (m105817b == C34272Lj4.item_scrap_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof String) {
                str = m105816c;
            }
            String str2 = str;
            if (str2 == null) {
                return "";
            }
            return str2;
        } else if (m105817b == C34272Lj4.item_scrap_reason) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof C33391Hp5) {
                str = m105816c2;
            }
            C33391Hp5 c33391Hp5 = str;
            if (c33391Hp5 == null || (m103408d = c33391Hp5.m103408d()) == null || (name = m103408d.name()) == null) {
                return "";
            }
            return name;
        } else if (m105817b == C34272Lj4.item_scrap_image_upload_bar) {
            return "image_upload_bar";
        } else {
            if (m105817b != C34272Lj4.item_scrap_details) {
                return "";
            }
            return "scrap_details";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        C33391Hp5 c33391Hp5 = null;
        if (m105816c instanceof C33391Hp5) {
            Object m105816c2 = newItem.m105816c();
            if (m105816c2 instanceof C33391Hp5) {
                c33391Hp5 = m105816c2;
            }
            C33391Hp5 c33391Hp52 = c33391Hp5;
            if (c33391Hp52 != null && ((C33391Hp5) m105816c).m103407e() == c33391Hp52.m103407e()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        } else if (m105816c instanceof List) {
            Object m105816c3 = newItem.m105816c();
            if (m105816c3 instanceof List) {
                c33391Hp5 = m105816c3;
            }
            if (!Intrinsics.areEqual(m105816c, c33391Hp5)) {
                return true;
            }
        }
        return false;
    }
}
