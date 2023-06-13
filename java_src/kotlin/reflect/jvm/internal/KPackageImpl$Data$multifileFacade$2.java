package kotlin.reflect.jvm.internal;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class KPackageImpl$Data$multifileFacade$2 extends Lambda implements Function0<Class<?>> {
    final /* synthetic */ KPackageImpl.Data this$0;
    final /* synthetic */ KPackageImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kPackageImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Class<?> invoke() {
        ReflectKotlinClass kotlinClass;
        String replace$default;
        KotlinClassHeader classHeader;
        kotlinClass = this.this$0.getKotlinClass();
        String multifileClassName = (kotlinClass == null || (classHeader = kotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
        if (multifileClassName != null) {
            if (multifileClassName.length() > 0) {
                ClassLoader classLoader = this.this$1.getJClass().getClassLoader();
                replace$default = StringsKt__StringsJVMKt.replace$default(multifileClassName, (char) JsonPointer.SEPARATOR, (char) CoreConstants.DOT, false, 4, (Object) null);
                return classLoader.loadClass(replace$default);
            }
            return null;
        }
        return null;
    }
}