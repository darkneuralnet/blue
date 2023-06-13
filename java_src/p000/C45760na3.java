package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.OperatorNotification;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lna3;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationCenterAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterAdapterDiff.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,34:1\n18#2:35\n18#2:40\n18#2:45\n9#3,4:36\n9#3,4:41\n9#3,4:46\n*S KotlinDebug\n*F\n+ 1 NotificationCenterAdapterDiff.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapterDiff\n*L\n12#1:35\n14#1:40\n28#1:45\n12#1:36,4\n14#1:41,4\n28#1:46,4\n*E\n"})
/* renamed from: na3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45760na3 implements InterfaceC2152F6 {
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
        Object obj = null;
        if (m105817b == C48815sj4.item_date_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof String) {
                obj = m105816c;
            }
            String str = (String) obj;
            if (str == null) {
                return "";
            }
            return str;
        } else if (m105817b != C48815sj4.item_notification) {
            return "";
        } else {
            Object m105816c2 = adapterItem.m105816c();
            if (!(m105816c2 instanceof Pair)) {
                m105816c2 = null;
            }
            Pair pair = (Pair) m105816c2;
            if (pair != null) {
                obj = (OperatorNotification) pair.getFirst();
            }
            if (obj instanceof OperatorNotification.Notification) {
                return ((OperatorNotification.Notification) obj).getId();
            }
            if (!(obj instanceof OperatorNotification.NotificationGroup)) {
                return "";
            }
            return ((OperatorNotification.NotificationGroup) obj).getGroupId();
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if ((m105816c instanceof String) || !(m105816c instanceof Pair)) {
            return false;
        }
        Object first = ((Pair) m105816c).getFirst();
        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type co.bird.android.model.OperatorNotification");
        OperatorNotification operatorNotification = (OperatorNotification) first;
        Object m105816c2 = newItem.m105816c();
        OperatorNotification operatorNotification2 = null;
        if (!(m105816c2 instanceof Pair)) {
            m105816c2 = null;
        }
        Pair pair = (Pair) m105816c2;
        if (pair != null) {
            operatorNotification2 = (OperatorNotification) pair.getFirst();
        }
        return Intrinsics.areEqual(operatorNotification, operatorNotification2);
    }
}