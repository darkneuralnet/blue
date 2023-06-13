package androidx.lifecycle;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0005\u000fB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Landroidx/lifecycle/f;", "", "LFq2;", "observer", "", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "c", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "internalScopeRef", "Landroidx/lifecycle/f$b;", "b", "()Landroidx/lifecycle/f$b;", "currentState", "<init>", "()V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public abstract class AbstractC11719f {

    /* renamed from: a */
    public AtomicReference<Object> f54911a = new AtomicReference<>();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m28432d2 = {"Landroidx/lifecycle/f$a;", "", "Landroidx/lifecycle/f$b;", "c", "()Landroidx/lifecycle/f$b;", "targetState", "<init>", "(Ljava/lang/String;I)V", "Companion", C17296a.f69688o, "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.f$a */
    /* loaded from: classes.dex */
    public enum EnumC11720a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C11721a Companion = new C11721a(null);

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\n"}, m28432d2 = {"Landroidx/lifecycle/f$a$a;", "", "Landroidx/lifecycle/f$b;", TransferTable.COLUMN_STATE, "Landroidx/lifecycle/f$a;", C17296a.f69688o, "b", "c", "<init>", "()V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.f$a$a */
        /* loaded from: classes.dex */
        public static final class C11721a {

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: androidx.lifecycle.f$a$a$a */
            /* loaded from: classes.dex */
            public /* synthetic */ class C11722a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC11724b.values().length];
                    try {
                        iArr[EnumC11724b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC11724b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC11724b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC11724b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[EnumC11724b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ C11721a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final EnumC11720a m67017a(EnumC11724b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C11722a.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return EnumC11720a.ON_PAUSE;
                    }
                    return EnumC11720a.ON_STOP;
                }
                return EnumC11720a.ON_DESTROY;
            }

            @JvmStatic
            /* renamed from: b */
            public final EnumC11720a m67016b(EnumC11724b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C11722a.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            return null;
                        }
                        return EnumC11720a.ON_CREATE;
                    }
                    return EnumC11720a.ON_RESUME;
                }
                return EnumC11720a.ON_START;
            }

            @JvmStatic
            /* renamed from: c */
            public final EnumC11720a m67015c(EnumC11724b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C11722a.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return EnumC11720a.ON_RESUME;
                    }
                    return EnumC11720a.ON_START;
                }
                return EnumC11720a.ON_CREATE;
            }

            private C11721a() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: androidx.lifecycle.f$a$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class C11723b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC11720a.values().length];
                try {
                    iArr[EnumC11720a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC11720a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC11720a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC11720a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC11720a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC11720a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC11720a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @JvmStatic
        /* renamed from: b */
        public static final EnumC11720a m67020b(EnumC11724b enumC11724b) {
            return Companion.m67017a(enumC11724b);
        }

        @JvmStatic
        /* renamed from: d */
        public static final EnumC11720a m67018d(EnumC11724b enumC11724b) {
            return Companion.m67015c(enumC11724b);
        }

        /* renamed from: c */
        public final EnumC11724b m67019c() {
            switch (C11723b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return EnumC11724b.CREATED;
                case 3:
                case 4:
                    return EnumC11724b.STARTED;
                case 5:
                    return EnumC11724b.RESUMED;
                case 6:
                    return EnumC11724b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Landroidx/lifecycle/f$b;", "", TransferTable.COLUMN_STATE, "", "b", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.f$b */
    /* loaded from: classes.dex */
    public enum EnumC11724b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: b */
        public final boolean m67013b(EnumC11724b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public abstract void mo67008a(InterfaceC32929Fq2 interfaceC32929Fq2);

    /* renamed from: b */
    public abstract EnumC11724b mo67007b();

    /* renamed from: c */
    public final AtomicReference<Object> m67022c() {
        return this.f54911a;
    }

    /* renamed from: d */
    public abstract void mo67006d(InterfaceC32929Fq2 interfaceC32929Fq2);
}
