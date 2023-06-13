package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
/* loaded from: classes8.dex */
public interface NullabilityAnnotationStates<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final NullabilityAnnotationStates EMPTY;

        static {
            Map emptyMap;
            emptyMap = MapsKt__MapsKt.emptyMap();
            EMPTY = new NullabilityAnnotationStatesImpl(emptyMap);
        }

        private Companion() {
        }

        public final NullabilityAnnotationStates getEMPTY() {
            return EMPTY;
        }
    }

    T get(FqName fqName);
}
