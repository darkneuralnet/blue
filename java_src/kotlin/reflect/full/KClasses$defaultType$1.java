package kotlin.reflect.full;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KClassImpl;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class KClasses$defaultType$1 extends Lambda implements Function0<Type> {
    final /* synthetic */ KClass<?> $this_defaultType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClasses$defaultType$1(KClass<?> kClass) {
        super(0);
        this.$this_defaultType = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Type invoke() {
        return ((KClassImpl) this.$this_defaultType).getJClass();
    }
}
