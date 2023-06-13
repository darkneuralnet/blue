package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11709a;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11755r;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.InterfaceC11718e;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003W\u001c BS\b\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010&\u001a\u00020\u001f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010.\u001a\u00020+\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00106\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bR\u0010SB\u001d\b\u0017\u0012\u0006\u0010T\u001a\u00020\u0000\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bR\u0010UJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010*\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010(R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0016\u0010A\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010@R\u001b\u0010E\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010C\u001a\u0004\b,\u0010DR\u001b\u0010I\u001a\u00020F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\b:\u0010HR*\u0010M\u001a\u00020+2\u0006\u0010J\u001a\u00020+8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b7\u0010K\"\u0004\bG\u0010LR\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006X"}, m28432d2 = {"LAY2;", "LLifecycleOwner;", "LXr6;", "Landroidx/lifecycle/e;", "LPi5;", "Landroidx/lifecycle/f;", "getLifecycle", "Landroidx/lifecycle/f$a;", "event", "", "j", "n", "LWr6;", "getViewModelStore", "Landroidx/lifecycle/u$b;", "getDefaultViewModelProviderFactory", "LFE0;", "getDefaultViewModelCreationExtras", "Landroid/os/Bundle;", "outBundle", "k", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LHY2;", "c", "LHY2;", "f", "()LHY2;", "l", "(LHY2;)V", "destination", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/f$b;", "e", "Landroidx/lifecycle/f$b;", "hostLifecycleState", "LYY2;", "LYY2;", "viewModelStoreProvider", "", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "h", "savedState", "Landroidx/lifecycle/j;", "i", "Landroidx/lifecycle/j;", "lifecycle", "LOi5;", "LOi5;", "savedStateRegistryController", "Z", "savedStateRegistryAttached", "Landroidx/lifecycle/r;", "Lkotlin/Lazy;", "()Landroidx/lifecycle/r;", "defaultFactory", "Landroidx/lifecycle/p;", "m", "()Landroidx/lifecycle/p;", "savedStateHandle", "maxState", "()Landroidx/lifecycle/f$b;", "(Landroidx/lifecycle/f$b;)V", "maxLifecycle", "Landroidx/savedstate/a;", "getSavedStateRegistry", "()Landroidx/savedstate/a;", "savedStateRegistry", "<init>", "(Landroid/content/Context;LHY2;Landroid/os/Bundle;Landroidx/lifecycle/f$b;LYY2;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "(LAY2;Landroid/os/Bundle;)V", "o", C17296a.f69688o, "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: AY2 */
/* loaded from: classes.dex */
public final class AY2 implements LifecycleOwner, InterfaceC37154Xr6, InterfaceC11718e, InterfaceC35200Pi5 {

    /* renamed from: o */
    public static final C0146a f752o = new C0146a(null);

    /* renamed from: b */
    public final Context f753b;

    /* renamed from: c */
    public HY2 f754c;

    /* renamed from: d */
    public final Bundle f755d;

    /* renamed from: e */
    public AbstractC11719f.EnumC11724b f756e;

    /* renamed from: f */
    public final YY2 f757f;

    /* renamed from: g */
    public final String f758g;

    /* renamed from: h */
    public final Bundle f759h;

    /* renamed from: i */
    public C11729j f760i;

    /* renamed from: j */
    public final C34966Oi5 f761j;

    /* renamed from: k */
    public boolean f762k;

    /* renamed from: l */
    public final Lazy f763l;

    /* renamed from: m */
    public final Lazy f764m;

    /* renamed from: n */
    public AbstractC11719f.EnumC11724b f765n;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012JR\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0013"}, m28432d2 = {"LAY2$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LHY2;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/f$b;", "hostLifecycleState", "LYY2;", "viewModelStoreProvider", "", "id", "savedState", "LAY2;", C17296a.f69688o, "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: AY2$a */
    /* loaded from: classes.dex */
    public static final class C0146a {
        public /* synthetic */ C0146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AY2 m115572b(C0146a c0146a, Context context, HY2 hy2, Bundle bundle, AbstractC11719f.EnumC11724b enumC11724b, YY2 yy2, String str, Bundle bundle2, int i, Object obj) {
            Bundle bundle3;
            AbstractC11719f.EnumC11724b enumC11724b2;
            YY2 yy22;
            String str2;
            Bundle bundle4;
            if ((i & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i & 8) != 0) {
                enumC11724b2 = AbstractC11719f.EnumC11724b.CREATED;
            } else {
                enumC11724b2 = enumC11724b;
            }
            if ((i & 16) != 0) {
                yy22 = null;
            } else {
                yy22 = yy2;
            }
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return c0146a.m115573a(context, hy2, bundle3, enumC11724b2, yy22, str2, bundle4);
        }

        /* renamed from: a */
        public final AY2 m115573a(Context context, HY2 destination, Bundle bundle, AbstractC11719f.EnumC11724b hostLifecycleState, YY2 yy2, String id, Bundle bundle2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id, "id");
            return new AY2(context, destination, bundle, hostLifecycleState, yy2, id, bundle2, null);
        }

        private C0146a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"LAY2$b;", "Landroidx/lifecycle/a;", "LOr6;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/p;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/p;)LOr6;", "LPi5;", "owner", "<init>", "(LPi5;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: AY2$b */
    /* loaded from: classes.dex */
    public static final class C0147b extends AbstractC11709a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0147b(InterfaceC35200Pi5 owner) {
            super(owner, null);
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractC11709a
        /* renamed from: c */
        public <T extends AbstractC35048Or6> T mo67033c(String key, Class<T> modelClass, C11747p handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new C0148c(handle);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LAY2$c;", "LOr6;", "Landroidx/lifecycle/p;", C17296a.f69688o, "Landroidx/lifecycle/p;", "e", "()Landroidx/lifecycle/p;", "handle", "<init>", "(Landroidx/lifecycle/p;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: AY2$c */
    /* loaded from: classes.dex */
    public static final class C0148c extends AbstractC35048Or6 {

        /* renamed from: a */
        public final C11747p f766a;

        public C0148c(C11747p handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.f766a = handle;
        }

        /* renamed from: e */
        public final C11747p m115571e() {
            return this.f766a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/r;", "b", "()Landroidx/lifecycle/r;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: AY2$d */
    /* loaded from: classes.dex */
    public static final class C0149d extends Lambda implements Function0<C11755r> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0149d() {
            super(0);
            AY2.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11755r invoke() {
            Context context = AY2.this.f753b;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            AY2 ay2 = AY2.this;
            return new C11755r(application, ay2, ay2.m115584d());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/p;", "b", "()Landroidx/lifecycle/p;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: AY2$e */
    /* loaded from: classes.dex */
    public static final class C0150e extends Lambda implements Function0<C11747p> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0150e() {
            super(0);
            AY2.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11747p invoke() {
            boolean z;
            if (AY2.this.f762k) {
                if (AY2.this.f760i.mo67007b() != AbstractC11719f.EnumC11724b.DESTROYED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return ((C0148c) new C11759u(AY2.this, new C0147b(AY2.this)).m66922a(C0148c.class)).m115571e();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    public /* synthetic */ AY2(Context context, HY2 hy2, Bundle bundle, AbstractC11719f.EnumC11724b enumC11724b, YY2 yy2, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, hy2, bundle, enumC11724b, yy2, str, bundle2);
    }

    /* renamed from: d */
    public final Bundle m115584d() {
        return this.f755d;
    }

    /* renamed from: e */
    public final C11755r m115583e() {
        return (C11755r) this.f763l.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        Set<String> keySet;
        Object obj2;
        boolean z2;
        if (obj == null || !(obj instanceof AY2)) {
            return false;
        }
        AY2 ay2 = (AY2) obj;
        if (!Intrinsics.areEqual(this.f758g, ay2.f758g) || !Intrinsics.areEqual(this.f754c, ay2.f754c) || !Intrinsics.areEqual(this.f760i, ay2.f760i) || !Intrinsics.areEqual(getSavedStateRegistry(), ay2.getSavedStateRegistry())) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f755d, ay2.f755d)) {
            Bundle bundle = this.f755d;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                if (!keySet.isEmpty()) {
                    for (String str : keySet) {
                        Object obj3 = this.f755d.get(str);
                        Bundle bundle2 = ay2.f755d;
                        if (bundle2 != null) {
                            obj2 = bundle2.get(str);
                        } else {
                            obj2 = null;
                        }
                        if (!Intrinsics.areEqual(obj3, obj2)) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    z = true;
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return true;
    }

    /* renamed from: f */
    public final HY2 m115582f() {
        return this.f754c;
    }

    /* renamed from: g */
    public final String m115581g() {
        return this.f758g;
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public FE0 getDefaultViewModelCreationExtras() {
        Context context;
        Application application = null;
        C47511qX2 c47511qX2 = new C47511qX2(null, 1, null);
        Context context2 = this.f753b;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = context;
        }
        if (application != null) {
            c47511qX2.m17470c(C11759u.C11760a.f54991h, application);
        }
        c47511qX2.m17470c(C11750q.f54966a, this);
        c47511qX2.m17470c(C11750q.f54967b, this);
        Bundle bundle = this.f755d;
        if (bundle != null) {
            c47511qX2.m17470c(C11750q.f54968c, bundle);
        }
        return c47511qX2;
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public C11759u.InterfaceC11763b getDefaultViewModelProviderFactory() {
        return m115583e();
    }

    @Override // p000.LifecycleOwner
    public AbstractC11719f getLifecycle() {
        return this.f760i;
    }

    @Override // p000.InterfaceC35200Pi5
    public C11966a getSavedStateRegistry() {
        return this.f761j.m91665b();
    }

    @Override // p000.InterfaceC37154Xr6
    public C36920Wr6 getViewModelStore() {
        boolean z;
        if (this.f762k) {
            if (this.f760i.mo67007b() != AbstractC11719f.EnumC11724b.DESTROYED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                YY2 yy2 = this.f757f;
                if (yy2 != null) {
                    return yy2.mo74899b(this.f758g);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    /* renamed from: h */
    public final AbstractC11719f.EnumC11724b m115580h() {
        return this.f765n;
    }

    public int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = (this.f758g.hashCode() * 31) + this.f754c.hashCode();
        Bundle bundle = this.f755d;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = this.f755d.get(str);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return (((hashCode * 31) + this.f760i.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    /* renamed from: i */
    public final C11747p m115579i() {
        return (C11747p) this.f764m.getValue();
    }

    /* renamed from: j */
    public final void m115578j(AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC11719f.EnumC11724b m67019c = event.m67019c();
        Intrinsics.checkNotNullExpressionValue(m67019c, "event.targetState");
        this.f756e = m67019c;
        m115574n();
    }

    /* renamed from: k */
    public final void m115577k(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f761j.m91662e(outBundle);
    }

    /* renamed from: l */
    public final void m115576l(HY2 hy2) {
        Intrinsics.checkNotNullParameter(hy2, "<set-?>");
        this.f754c = hy2;
    }

    /* renamed from: m */
    public final void m115575m(AbstractC11719f.EnumC11724b maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f765n = maxState;
        m115574n();
    }

    /* renamed from: n */
    public final void m115574n() {
        if (!this.f762k) {
            this.f761j.m91664c();
            this.f762k = true;
            if (this.f757f != null) {
                C11750q.m66934c(this);
            }
            this.f761j.m91663d(this.f759h);
        }
        if (this.f756e.ordinal() < this.f765n.ordinal()) {
            this.f760i.m66995o(this.f756e);
        } else {
            this.f760i.m66995o(this.f765n);
        }
    }

    public AY2(Context context, HY2 hy2, Bundle bundle, AbstractC11719f.EnumC11724b enumC11724b, YY2 yy2, String str, Bundle bundle2) {
        Lazy lazy;
        Lazy lazy2;
        this.f753b = context;
        this.f754c = hy2;
        this.f755d = bundle;
        this.f756e = enumC11724b;
        this.f757f = yy2;
        this.f758g = str;
        this.f759h = bundle2;
        this.f760i = new C11729j(this);
        this.f761j = C34966Oi5.f27078d.m91661a(this);
        lazy = LazyKt__LazyJVMKt.lazy(new C0149d());
        this.f763l = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C0150e());
        this.f764m = lazy2;
        this.f765n = AbstractC11719f.EnumC11724b.INITIALIZED;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AY2(AY2 entry, Bundle bundle) {
        this(entry.f753b, entry.f754c, bundle, entry.f756e, entry.f757f, entry.f758g, entry.f759h);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f756e = entry.f756e;
        m115575m(entry.f765n);
    }
}
