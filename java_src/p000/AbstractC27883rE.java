package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, m28432d2 = {"LrE;", "", "LDQ5;", "headerModel", "LG6;", "l", "", "LH6;", "k", "<init>", "()V", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseStatusConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStatusConverter.kt\nco/bird/android/statusdialog/adapters/BaseStatusConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* renamed from: rE */
/* loaded from: classes4.dex */
public abstract class AbstractC27883rE {
    /* renamed from: k */
    public final List<C3023H6> m16197k(DQ5 headerModel) {
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        C3023H6 c3023h6 = new C3023H6(new ArrayList(), m16196l(headerModel), null, 4, null);
        c3023h6.m104405h(true);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
        return listOf;
    }

    /* renamed from: l */
    public final C2637G6 m16196l(DQ5 headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        return new C2637G6(headerModel, C44082kk4.item_status_header, false, 4, null);
    }
}
