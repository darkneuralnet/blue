package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes8.dex */
public final class Visibilities {
    private static final Public DEFAULT_VISIBILITY;
    public static final Visibilities INSTANCE = new Visibilities();
    private static final Map<Visibility, Integer> ORDERED_VISIBILITIES;

    /* loaded from: classes8.dex */
    public static final class Inherited extends Visibility {
        public static final Inherited INSTANCE = new Inherited();

        private Inherited() {
            super("inherited", false);
        }
    }

    /* loaded from: classes8.dex */
    public static final class Internal extends Visibility {
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super("internal", false);
        }
    }

    /* loaded from: classes8.dex */
    public static final class InvisibleFake extends Visibility {
        public static final InvisibleFake INSTANCE = new InvisibleFake();

        private InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    /* loaded from: classes8.dex */
    public static final class Local extends Visibility {
        public static final Local INSTANCE = new Local();

        private Local() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* loaded from: classes8.dex */
    public static final class Private extends Visibility {
        public static final Private INSTANCE = new Private();

        private Private() {
            super("private", false);
        }
    }

    /* loaded from: classes8.dex */
    public static final class PrivateToThis extends Visibility {
        public static final PrivateToThis INSTANCE = new PrivateToThis();

        private PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    /* loaded from: classes8.dex */
    public static final class Protected extends Visibility {
        public static final Protected INSTANCE = new Protected();

        private Protected() {
            super("protected", true);
        }
    }

    /* loaded from: classes8.dex */
    public static final class Public extends Visibility {
        public static final Public INSTANCE = new Public();

        private Public() {
            super("public", true);
        }
    }

    /* loaded from: classes8.dex */
    public static final class Unknown extends Visibility {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", false);
        }
    }

    static {
        Map createMapBuilder;
        Map<Visibility, Integer> build;
        createMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        createMapBuilder.put(PrivateToThis.INSTANCE, 0);
        createMapBuilder.put(Private.INSTANCE, 0);
        createMapBuilder.put(Internal.INSTANCE, 1);
        createMapBuilder.put(Protected.INSTANCE, 1);
        Public r1 = Public.INSTANCE;
        createMapBuilder.put(r1, 2);
        build = MapsKt__MapsJVMKt.build(createMapBuilder);
        ORDERED_VISIBILITIES = build;
        DEFAULT_VISIBILITY = r1;
    }

    private Visibilities() {
    }

    public final Integer compareLocal$compiler_common(Visibility first, Visibility second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Map<Visibility, Integer> map = ORDERED_VISIBILITIES;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num != null && num2 != null && !Intrinsics.areEqual(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public final boolean isPrivate(Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (visibility != Private.INSTANCE && visibility != PrivateToThis.INSTANCE) {
            return false;
        }
        return true;
    }
}