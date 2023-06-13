package kotlin.text.jdk8;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, m28432d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib-jdk8"}, m28431k = 2, m28430mv = {1, 8, 0}, m28429pn = "kotlin.text", m28428xi = 48)
@JvmName(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes8.dex */
public final class RegexExtensionsJDK8Kt {
    @SinceKotlin(version = "1.2")
    public static final MatchGroup get(MatchGroupCollection matchGroupCollection, String name) {
        MatchNamedGroupCollection matchNamedGroupCollection;
        Intrinsics.checkNotNullParameter(matchGroupCollection, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (matchGroupCollection instanceof MatchNamedGroupCollection) {
            matchNamedGroupCollection = (MatchNamedGroupCollection) matchGroupCollection;
        } else {
            matchNamedGroupCollection = null;
        }
        if (matchNamedGroupCollection != null) {
            return matchNamedGroupCollection.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
