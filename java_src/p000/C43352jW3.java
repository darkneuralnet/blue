package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\u0010\u0014B%\u0012\u001c\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J*\u0010\t\u001a\f\u0012\u0004\u0012\u00028\u00000\bR\u00020\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002R*\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR,\u0010\u0012\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LjW3;", "LiW3;", "LgW3;", "T", "LhW3;", "plugin", "LjW3$a;", "e", "LjW3$c;", "f", "Lkotlin/Function2;", "LfW3;", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "factory", "LOM5;", "b", "LOM5;", "adaptersByPlugin", "", "c", "Z", "adaptersMayNeedDisposal", DateTokenConverter.CONVERTER_KEY, "LhW3;", "focusedPlugin", "()LgW3;", "focusedAdapter", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,335:1\n1#2:336\n36#3:337\n25#3:348\n1057#4,6:338\n1057#4,3:349\n1060#4,3:355\n473#5,4:344\n477#5,2:352\n481#5:358\n473#6:354\n766#7:359\n857#7,2:360\n33#8,6:362\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl\n*L\n167#1:337\n172#1:348\n167#1:338,6\n172#1:349,3\n172#1:355,3\n172#1:344,4\n172#1:352,2\n172#1:358\n172#1:354\n241#1:359\n241#1:360,2\n242#1:362,6\n*E\n"})
/* renamed from: jW3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43352jW3 implements InterfaceC42759iW3 {

    /* renamed from: a */
    public final Function2<InterfaceC42166hW3<?>, InterfaceC40980fW3, InterfaceC41573gW3> f92879a;

    /* renamed from: b */
    public final OM5<InterfaceC42166hW3<?>, C24918c<?>> f92880b;

    /* renamed from: c */
    public boolean f92881c;

    /* renamed from: d */
    public InterfaceC42166hW3<?> f92882d;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LjW3$a;", "LgW3;", "T", "", C17296a.f69688o, "LgW3;", "()LgW3;", "adapter", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "onDispose", "<init>", "(LgW3;Lkotlin/jvm/functions/Function0;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterHandle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
    /* renamed from: jW3$a */
    /* loaded from: classes.dex */
    public static final class C24916a<T extends InterfaceC41573gW3> {

        /* renamed from: a */
        public final T f92883a;

        /* renamed from: b */
        public final Function0<Boolean> f92884b;

        public C24916a(T adapter, Function0<Boolean> onDispose) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(onDispose, "onDispose");
            this.f92883a = adapter;
            this.f92884b = onDispose;
        }

        /* renamed from: a */
        public final T m30384a() {
            return this.f92883a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, m28432d2 = {"LjW3$b;", "LfW3;", "", "b", C17296a.f69688o, "LhW3;", "LhW3;", "plugin", "<init>", "(LjW3;LhW3;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jW3$b */
    /* loaded from: classes.dex */
    public final class C24917b implements InterfaceC40980fW3 {

        /* renamed from: a */
        public final InterfaceC42166hW3<?> f92885a;

        /* renamed from: b */
        public final /* synthetic */ C43352jW3 f92886b;

        public C24917b(C43352jW3 c43352jW3, InterfaceC42166hW3<?> plugin) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            this.f92886b = c43352jW3;
            this.f92885a = plugin;
        }

        @Override // p000.InterfaceC40980fW3
        /* renamed from: a */
        public void mo30383a() {
            if (Intrinsics.areEqual(this.f92886b.f92882d, this.f92885a)) {
                this.f92886b.f92882d = null;
            }
        }

        @Override // p000.InterfaceC40980fW3
        /* renamed from: b */
        public void mo30382b() {
            this.f92886b.f92882d = this.f92885a;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR+\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LjW3$c;", "LgW3;", "T", "", "", DateTokenConverter.CONVERTER_KEY, "", C17296a.f69688o, "LgW3;", "b", "()LgW3;", "adapter", "", "<set-?>", "LEX2;", "c", "()I", "e", "(I)V", "refCount", "<init>", "(LjW3;LgW3;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,335:1\n76#2:336\n102#2,2:337\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$AdapterWithRefCount\n*L\n291#1:336\n291#1:337,2\n*E\n"})
    /* renamed from: jW3$c */
    /* loaded from: classes.dex */
    public final class C24918c<T extends InterfaceC41573gW3> {

        /* renamed from: a */
        public final T f92887a;

        /* renamed from: b */
        public final EX2 f92888b;

        /* renamed from: c */
        public final /* synthetic */ C43352jW3 f92889c;

        public C24918c(C43352jW3 c43352jW3, T adapter) {
            EX2 m97025e;
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f92889c = c43352jW3;
            this.f92887a = adapter;
            m97025e = LM5.m97025e(0, null, 2, null);
            this.f92888b = m97025e;
        }

        /* renamed from: a */
        public final boolean m30381a() {
            boolean z;
            m30377e(m30379c() - 1);
            if (m30379c() >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (m30379c() != 0) {
                    return false;
                }
                this.f92889c.f92881c = true;
                return true;
            }
            throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + m30379c() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }

        /* renamed from: b */
        public final T m30380b() {
            return this.f92887a;
        }

        /* renamed from: c */
        public final int m30379c() {
            return ((Number) this.f92888b.getValue()).intValue();
        }

        /* renamed from: d */
        public final void m30378d() {
            m30377e(m30379c() + 1);
        }

        /* renamed from: e */
        public final void m30377e(int i) {
            this.f92888b.setValue(Integer.valueOf(i));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LgW3;", "T", "", "invoke", "()Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jW3$d */
    /* loaded from: classes.dex */
    public static final class C24919d extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ C24918c<T> f92890g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24919d(C24918c<T> c24918c) {
            super(0);
            this.f92890g = c24918c;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f92890g.m30381a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43352jW3(Function2<? super InterfaceC42166hW3<?>, ? super InterfaceC40980fW3, ? extends InterfaceC41573gW3> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f92879a = factory;
        this.f92880b = GM5.m105201f();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gW3] */
    /* renamed from: d */
    public final InterfaceC41573gW3 m30387d() {
        C24918c<?> c24918c = this.f92880b.get(this.f92882d);
        if (c24918c != null) {
            return c24918c.m30380b();
        }
        return null;
    }

    /* renamed from: e */
    public final <T extends InterfaceC41573gW3> C24916a<T> m30386e(InterfaceC42166hW3<T> plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        C24918c<?> c24918c = this.f92880b.get(plugin);
        if (c24918c == null) {
            c24918c = m30385f(plugin);
        }
        c24918c.m30378d();
        return new C24916a<>(c24918c.m30380b(), new C24919d(c24918c));
    }

    /* renamed from: f */
    public final <T extends InterfaceC41573gW3> C24918c<T> m30385f(InterfaceC42166hW3<T> interfaceC42166hW3) {
        InterfaceC41573gW3 invoke = this.f92879a.invoke(interfaceC42166hW3, new C24917b(this, interfaceC42166hW3));
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        C24918c<T> c24918c = new C24918c<>(this, invoke);
        this.f92880b.put(interfaceC42166hW3, c24918c);
        return c24918c;
    }
}
