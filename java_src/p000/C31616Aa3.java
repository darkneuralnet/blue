package p000;

import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C52281ya3;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, m28432d2 = {"LAa3;", "LKA;", "", "e", "", "groupId", DateTokenConverter.CONVERTER_KEY, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroidx/fragment/app/FragmentManager;I)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Aa3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31616Aa3 extends AbstractC4367KA {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31616Aa3(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
    }

    /* renamed from: d */
    public final void m115500d(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        m99111c(C52281ya3.f119758l.m3222a(groupId));
    }

    /* renamed from: e */
    public final void m115499e() {
        m99111c(C52281ya3.C30624a.newInstance$notification_center_release$default(C52281ya3.f119758l, null, 1, null));
    }
}
