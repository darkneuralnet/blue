package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"LQA1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "glbFileLocation", "Lcom/google/android/filament/gltfio/FilamentAsset;", "Lio/github/sceneview/model/Model;", "b", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/Buffer;", "buffer", C17296a.f69688o, "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: QA1 */
/* loaded from: classes6.dex */
public final class QA1 {

    /* renamed from: a */
    public static final QA1 f29912a = new QA1();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Ljava/nio/ByteBuffer;", "buffer", "Lcom/google/android/filament/gltfio/FilamentAsset;", "Lio/github/sceneview/model/Model;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "io.github.sceneview.model.GLBLoader$loadModel$2", m28418f = "GLBLoader.kt", m28417i = {}, m28416l = {27}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: QA1$a */
    /* loaded from: classes6.dex */
    public static final class C6690a extends SuspendLambda implements Function2<ByteBuffer, Continuation<? super FilamentAsset>, Object> {

        /* renamed from: h */
        public int f29913h;

        /* renamed from: i */
        public /* synthetic */ Object f29914i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/google/android/filament/gltfio/FilamentAsset;", "Lio/github/sceneview/model/Model;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "io.github.sceneview.model.GLBLoader$loadModel$2$1", m28418f = "GLBLoader.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: QA1$a$a */
        /* loaded from: classes6.dex */
        public static final class C6691a extends SuspendLambda implements Function2<ZC0, Continuation<? super FilamentAsset>, Object> {

            /* renamed from: h */
            public int f29915h;

            /* renamed from: i */
            public final /* synthetic */ ByteBuffer f29916i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6691a(ByteBuffer byteBuffer, Continuation<? super C6691a> continuation) {
                super(2, continuation);
                this.f29916i = byteBuffer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C6691a(this.f29916i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super FilamentAsset> continuation) {
                return ((C6691a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f29915h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return QA1.f29912a.m88849a(this.f29916i);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C6690a(Continuation<? super C6690a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6690a c6690a = new C6690a(continuation);
            c6690a.f29914i = obj;
            return c6690a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(ByteBuffer byteBuffer, Continuation<? super FilamentAsset> continuation) {
            return ((C6690a) create(byteBuffer, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29913h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC46765pG2 m84376c = T41.m84376c();
                C6691a c6691a = new C6691a((ByteBuffer) this.f29914i, null);
                this.f29913h = 1;
                obj = X30.m77504g(m84376c, c6691a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }
    }

    private QA1() {
    }

    /* renamed from: a */
    public final FilamentAsset m88849a(Buffer buffer) {
        FilamentAsset createAsset;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        AssetLoader m43785b = C39939dl1.m43785b();
        if (m43785b != null && (createAsset = m43785b.createAsset(buffer)) != null) {
            C39939dl1.m43778i().loadResources(createAsset);
            return createAsset;
        }
        return null;
    }

    /* renamed from: b */
    public final Object m88848b(Context context, String str, Continuation<? super FilamentAsset> continuation) {
        return C45042mM4.m25808d(context, str, new C6690a(null), continuation);
    }
}
