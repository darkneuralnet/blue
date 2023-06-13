package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¨\u0006\u0005"}, m28432d2 = {"T", "LEM5;", "b", "c", C17296a.f69688o, "runtime_release"}, m28431k = 5, m28430mv = {1, 8, 0}, m28427xs = "androidx/compose/runtime/SnapshotStateKt")
/* renamed from: KM5 */
/* loaded from: classes.dex */
public final /* synthetic */ class KM5 {
    /* renamed from: a */
    public static final <T> EM5<T> m98964a() {
        V73 v73 = V73.f38666a;
        Intrinsics.checkNotNull(v73, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return v73;
    }

    /* renamed from: b */
    public static final <T> EM5<T> m98963b() {
        C44765lt4 c44765lt4 = C44765lt4.f96865a;
        Intrinsics.checkNotNull(c44765lt4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return c44765lt4;
    }

    /* renamed from: c */
    public static final <T> EM5<T> m98962c() {
        OS5 os5 = OS5.f26595a;
        Intrinsics.checkNotNull(os5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return os5;
    }
}
