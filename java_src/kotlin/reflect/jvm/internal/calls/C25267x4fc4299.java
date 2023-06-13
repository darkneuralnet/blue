package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "T", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 */
/* loaded from: classes8.dex */
public final class C25267x4fc4299 extends Lambda implements Function0<String> {
    final /* synthetic */ Class<T> $annotationClass;
    final /* synthetic */ Map<String, Object> $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25267x4fc4299(Class<T> cls, Map<String, ? extends Object> map) {
        super(0);
        this.$annotationClass = cls;
        this.$values = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Class<T> cls = this.$annotationClass;
        Map<String, Object> map = this.$values;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        CollectionsKt___CollectionsKt.joinTo$default(map.entrySet(), sb, ", ", "(", ")", 0, null, C25268xd18867f3.INSTANCE, 48, null);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
