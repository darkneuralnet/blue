package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
@SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,261:1\n223#2,2:262\n288#2,2:264\n766#2:271\n857#2,2:272\n196#3,5:266\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n*L\n71#1:262,2\n74#1:264,2\n87#1:271\n87#1:272,2\n77#1:266,5\n*E\n"})
/* loaded from: classes8.dex */
public final class MemberScopeKt {
    public static final Set<Name> flatMapClassifierNamesOrNull(Iterable<? extends MemberScope> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (MemberScope memberScope : iterable) {
            Set<Name> classifierNames = memberScope.getClassifierNames();
            if (classifierNames != null) {
                CollectionsKt__MutableCollectionsKt.addAll(hashSet, classifierNames);
            } else {
                return null;
            }
        }
        return hashSet;
    }
}
