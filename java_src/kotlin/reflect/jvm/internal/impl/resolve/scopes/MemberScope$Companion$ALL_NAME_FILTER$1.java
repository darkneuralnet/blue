package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
/* loaded from: classes8.dex */
public final class MemberScope$Companion$ALL_NAME_FILTER$1 extends Lambda implements Function1<Name, Boolean> {
    public static final MemberScope$Companion$ALL_NAME_FILTER$1 INSTANCE = new MemberScope$Companion$ALL_NAME_FILTER$1();

    public MemberScope$Companion$ALL_NAME_FILTER$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Name it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
