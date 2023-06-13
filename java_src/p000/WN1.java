package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.utils.IBLPrefilterContext;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LWN1;", "", "Lcom/google/android/filament/Texture;", "skybox", "kotlin.jvm.PlatformType", "e", "", C17296a.f69688o, "Lcom/google/android/filament/utils/IBLPrefilterContext;", "Lkotlin/Lazy;", "b", "()Lcom/google/android/filament/utils/IBLPrefilterContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;", "c", "()Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;", "equirectangularToCubemap", "Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;", DateTokenConverter.CONVERTER_KEY, "()Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;", "specularFilter", "Lcom/google/android/filament/Engine;", "engine", "<init>", "(Lcom/google/android/filament/Engine;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: WN1 */
/* loaded from: classes6.dex */
public final class WN1 {

    /* renamed from: a */
    public final Lazy f40911a;

    /* renamed from: b */
    public final Lazy f40912b;

    /* renamed from: c */
    public final Lazy f40913c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/google/android/filament/utils/IBLPrefilterContext;", "b", "()Lcom/google/android/filament/utils/IBLPrefilterContext;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: WN1$a */
    /* loaded from: classes6.dex */
    public static final class C9008a extends Lambda implements Function0<IBLPrefilterContext> {

        /* renamed from: g */
        public final /* synthetic */ Engine f40914g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9008a(Engine engine) {
            super(0);
            this.f40914g = engine;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final IBLPrefilterContext invoke() {
            return new IBLPrefilterContext(this.f40914g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;", "b", "()Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: WN1$b */
    /* loaded from: classes6.dex */
    public static final class C9009b extends Lambda implements Function0<IBLPrefilterContext.EquirectangularToCubemap> {
        public C9009b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final IBLPrefilterContext.EquirectangularToCubemap invoke() {
            return new IBLPrefilterContext.EquirectangularToCubemap(WN1.this.m78523b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;", "b", "()Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: WN1$c */
    /* loaded from: classes6.dex */
    public static final class C9010c extends Lambda implements Function0<IBLPrefilterContext.SpecularFilter> {
        public C9010c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final IBLPrefilterContext.SpecularFilter invoke() {
            return new IBLPrefilterContext.SpecularFilter(WN1.this.m78523b());
        }
    }

    public WN1(Engine engine) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(engine, "engine");
        lazy = LazyKt__LazyJVMKt.lazy(new C9008a(engine));
        this.f40911a = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C9009b());
        this.f40912b = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C9010c());
        this.f40913c = lazy3;
    }

    /* renamed from: a */
    public final void m78524a() {
        try {
            Result.Companion companion = Result.Companion;
            m78521d().destroy();
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        try {
            m78522c().destroy();
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            m78523b().destroy();
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th3));
        }
    }

    /* renamed from: b */
    public final IBLPrefilterContext m78523b() {
        return (IBLPrefilterContext) this.f40911a.getValue();
    }

    /* renamed from: c */
    public final IBLPrefilterContext.EquirectangularToCubemap m78522c() {
        return (IBLPrefilterContext.EquirectangularToCubemap) this.f40912b.getValue();
    }

    /* renamed from: d */
    public final IBLPrefilterContext.SpecularFilter m78521d() {
        return (IBLPrefilterContext.SpecularFilter) this.f40913c.getValue();
    }

    /* renamed from: e */
    public final Texture m78520e(Texture skybox) {
        Intrinsics.checkNotNullParameter(skybox, "skybox");
        return m78521d().run(skybox);
    }
}
