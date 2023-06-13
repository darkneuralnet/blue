package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.constant.ComplaintResolutionField;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lzq0;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintResolutionAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapterDiff.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,40:1\n18#2:41\n18#2:46\n18#2:51\n18#2:56\n18#2:61\n18#2:66\n18#2:71\n18#2:76\n18#2:81\n9#3,4:42\n9#3,4:47\n9#3,4:52\n9#3,4:57\n9#3,4:62\n9#3,4:67\n9#3,4:72\n9#3,4:77\n9#3,4:82\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapterDiff.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapterDiff\n*L\n17#1:41\n18#1:46\n19#1:51\n21#1:56\n22#1:61\n23#1:66\n24#1:71\n25#1:76\n34#1:81\n17#1:42,4\n18#1:47,4\n19#1:52,4\n21#1:57,4\n22#1:62,4\n23#1:67,4\n24#1:72,4\n25#1:77,4\n34#1:82,4\n*E\n"})
/* renamed from: zq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53031zq0 implements InterfaceC2152F6 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "option", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zq0$a */
    /* loaded from: classes3.dex */
    public static final class C31516a extends Lambda implements Function1<ComplaintIssueOption, CharSequence> {

        /* renamed from: g */
        public static final C31516a f122301g = new C31516a();

        public C31516a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(ComplaintIssueOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            return option.getValue();
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b2, code lost:
        r14 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r2, null, null, null, 0, null, p000.C53031zq0.C31516a.f122301g, 31, null);
     */
    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo29b(C2637G6 adapterItem) {
        String id;
        ComplaintIssueOption complaintIssueOption;
        ComplaintResolutionField m115560b;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        EnumC41608ga2 enumC41608ga2 = null;
        if (m105817b == C36603Vi4.item_category) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof EnumC41608ga2) {
                enumC41608ga2 = m105816c;
            }
            EnumC41608ga2 enumC41608ga22 = enumC41608ga2;
            if (enumC41608ga22 == null || (id = enumC41608ga22.name()) == null) {
                return "";
            }
        } else if (m105817b == C36603Vi4.item_complaint_resolution_header) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof IH1) {
                enumC41608ga2 = m105816c2;
            }
            IH1 ih1 = enumC41608ga2;
            if (ih1 == null || (id = ih1.m102624b()) == null) {
                return "";
            }
        } else if (m105817b == C36603Vi4.item_complaint_section_header) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof C34804Nq5) {
                enumC41608ga2 = m105816c3;
            }
            C34804Nq5 c34804Nq5 = enumC41608ga2;
            if (c34804Nq5 == null || (id = c34804Nq5.m93286b()) == null) {
                return "";
            }
        } else if (m105817b == C36603Vi4.item_information) {
            return "info";
        } else {
            if (m105817b == C36603Vi4.item_take_photo) {
                Object m105816c4 = adapterItem.m105816c();
                if (m105816c4 instanceof AY5) {
                    enumC41608ga2 = m105816c4;
                }
                AY5 ay5 = enumC41608ga2;
                if (ay5 == null || (m115560b = ay5.m115560b()) == null || (id = m115560b.name()) == null) {
                    return "";
                }
            } else if (m105817b == C36603Vi4.item_issue) {
                Object m105816c5 = adapterItem.m105816c();
                if (m105816c5 instanceof Pair) {
                    enumC41608ga2 = m105816c5;
                }
                Pair pair = enumC41608ga2;
                if (pair == null || (complaintIssueOption = (ComplaintIssueOption) pair.getFirst()) == null || (id = complaintIssueOption.getValue()) == null) {
                    return "";
                }
            } else if (m105817b == C36603Vi4.item_action_taken) {
                Object m105816c6 = adapterItem.m105816c();
                if (m105816c6 instanceof List) {
                    enumC41608ga2 = m105816c6;
                }
                List list = enumC41608ga2;
                if (list == null || id == null) {
                    return "";
                }
            } else if (m105817b == C36603Vi4.item_complaint_vehicle_involved) {
                Object m105816c7 = adapterItem.m105816c();
                if (m105816c7 instanceof Bird) {
                    enumC41608ga2 = m105816c7;
                }
                Bird bird = enumC41608ga2;
                if (bird == null || (id = bird.getId()) == null) {
                    return "";
                }
            } else if (m105817b == C36603Vi4.item_scan_vehicles) {
                Object m105816c8 = adapterItem.m105816c();
                if (m105816c8 instanceof String) {
                    enumC41608ga2 = m105816c8;
                }
                String str = enumC41608ga2;
                if (str == null) {
                    return "";
                }
                return str;
            } else if (m105817b != C36603Vi4.item_additional_notes) {
                return "";
            } else {
                return "notes";
            }
        }
        return id;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof AY5)) {
            return false;
        }
        String m115557e = ((AY5) m105816c).m115557e();
        Object m105816c2 = newItem.m105816c();
        String str = null;
        if (!(m105816c2 instanceof AY5)) {
            m105816c2 = null;
        }
        AY5 ay5 = (AY5) m105816c2;
        if (ay5 != null) {
            str = ay5.m115557e();
        }
        if (Intrinsics.areEqual(m115557e, str)) {
            return false;
        }
        return true;
    }
}
