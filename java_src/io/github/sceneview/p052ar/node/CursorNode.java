package io.github.sceneview.p052ar.node;

import com.google.android.filament.MaterialInstance;
import com.google.android.filament.gltfio.FilamentInstance;
import com.google.p034ar.core.Anchor;
import com.google.p034ar.core.HitResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u00107\u001a\u000206\u0012\b\b\u0002\u00108\u001a\u00020%\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\u0010\b\u0002\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<\u0012)\b\u0002\u0010D\u001a#\u0012\u0017\u0012\u00150?j\u0002`@¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u0005\u0018\u00010>\u0012)\b\u0002\u0010E\u001a#\u0012\u0017\u0012\u00150\u0002j\u0002`\u0003¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010>¢\u0006\u0004\bF\u0010GJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\u0005H\u0016R2\u0010\u0014\u001a\u00060\u000bj\u0002`\f2\n\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R2\u0010\u0018\u001a\u00060\u000bj\u0002`\f2\n\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R2\u0010\u001c\u001a\u00060\u000bj\u0002`\f2\n\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\u00020%2\u0006\u0010\r\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R(\u00105\u001a\u0004\u0018\u0001002\b\u0010\r\u001a\u0004\u0018\u0001008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006H"}, m28432d2 = {"Lio/github/sceneview/ar/node/CursorNode;", "Lio/github/sceneview/ar/node/ArModelNode;", "Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", "modelInstance", "", "a1", "Lcom/google/ar/core/Anchor;", "z1", AbstractC3831J1.f16564d, "M1", "Liu1;", "Lio/github/sceneview/utils/Color;", "value", "b1", "Liu1;", "getColorTracking", "()Liu1;", "setColorTracking", "(Liu1;)V", "colorTracking", "c1", "getColorNotTracking", "setColorNotTracking", "colorNotTracking", "d1", "getColorClicked", "setColorClicked", "colorClicked", "", "e1", "J", "K1", "()J", "setClickDuration", "(J)V", "clickDuration", "", "f1", "Z", "isClicked", "()Z", "L1", "(Z)V", "g1", "m0", "E0", "isSelectable", "Lcom/google/ar/core/HitResult;", "A1", "()Lcom/google/ar/core/HitResult;", "G1", "(Lcom/google/ar/core/HitResult;)V", "hitResult", "", "modelFileLocation", "autoAnimate", "", "scaleToUnits", "Lhu1;", "Lio/github/sceneview/math/Position;", "centerOrigin", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", "error", "onError", "onLoaded", "<init>", "(Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.node.CursorNode */
/* loaded from: classes6.dex */
public class CursorNode extends ArModelNode {

    /* renamed from: b1 */
    public C42993iu1 f88072b1;

    /* renamed from: c1 */
    public C42993iu1 f88073c1;

    /* renamed from: d1 */
    public C42993iu1 f88074d1;

    /* renamed from: e1 */
    public long f88075e1;

    /* renamed from: f1 */
    public boolean f88076f1;

    /* renamed from: g1 */
    public boolean f88077g1;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "io.github.sceneview.ar.node.CursorNode$click$1", m28418f = "CursorNode.kt", m28417i = {}, m28416l = {79}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: io.github.sceneview.ar.node.CursorNode$a */
    /* loaded from: classes6.dex */
    public static final class C23413a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f88078h;

        public C23413a(Continuation<? super C23413a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23413a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C23413a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f88078h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long m33298K1 = CursorNode.this.m33298K1();
                this.f88078h = 1;
                if (C48120rZ0.m15768a(m33298K1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CursorNode.this.m33297L1(false);
            return Unit.INSTANCE;
        }
    }

    public CursorNode() {
        this(null, false, null, null, null, null, 63, null);
    }

    @Override // io.github.sceneview.p052ar.node.ArModelNode
    /* renamed from: A1 */
    public HitResult mo33301A1() {
        return super.mo33301A1();
    }

    @Override // io.github.sceneview.p052ar.node.ArNode, io.github.sceneview.node.Node
    /* renamed from: E0 */
    public void mo33258E0(boolean z) {
        this.f88077g1 = z;
    }

    @Override // io.github.sceneview.p052ar.node.ArModelNode
    /* renamed from: G1 */
    public void mo33300G1(HitResult hitResult) {
        super.mo33300G1(hitResult);
        m33296M1();
    }

    /* renamed from: J1 */
    public final void m33299J1() {
        m33297L1(true);
        AbstractC53033zq2 m33238S = m33238S();
        if (m33238S != null) {
            m33238S.m389b(new C23413a(null));
        }
    }

    /* renamed from: K1 */
    public final long m33298K1() {
        return this.f88075e1;
    }

    /* renamed from: L1 */
    public final void m33297L1(boolean z) {
        if (this.f88076f1 != z) {
            this.f88076f1 = z;
            m33296M1();
        }
    }

    /* renamed from: M1 */
    public void m33296M1() {
        MaterialInstance[] materialInstances;
        C42993iu1 c42993iu1;
        FilamentInstance m33291T0 = m33291T0();
        if (m33291T0 != null && (materialInstances = m33291T0.getMaterialInstances()) != null) {
            for (MaterialInstance it : materialInstances) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (this.f88076f1) {
                    c42993iu1 = this.f88074d1;
                } else if (m33332E1()) {
                    c42993iu1 = this.f88072b1;
                } else {
                    c42993iu1 = this.f88073c1;
                }
                JM2.m100656b(it, c42993iu1);
            }
        }
    }

    @Override // io.github.sceneview.node.ModelNode
    /* renamed from: a1 */
    public void mo33284a1(FilamentInstance filamentInstance) {
        super.mo33284a1(filamentInstance);
        m33296M1();
    }

    @Override // io.github.sceneview.p052ar.node.ArNode, io.github.sceneview.node.Node
    /* renamed from: m0 */
    public boolean mo33210m0() {
        return this.f88077g1;
    }

    @Override // io.github.sceneview.p052ar.node.ArModelNode
    /* renamed from: z1 */
    public Anchor mo33295z1() {
        Anchor mo33295z1 = super.mo33295z1();
        if (mo33295z1 != null) {
            m33299J1();
        }
        return mo33295z1;
    }

    public /* synthetic */ CursorNode(String str, boolean z, Float f, C42400hu1 c42400hu1, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "sceneview/models/cursor.glb" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : c42400hu1, (i & 16) != 0 ? null : function1, (i & 32) == 0 ? function12 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorNode(String modelFileLocation, boolean z, Float f, C42400hu1 c42400hu1, Function1<? super Exception, Unit> function1, Function1<? super FilamentInstance, Unit> function12) {
        super(modelFileLocation, z, f, c42400hu1, function1, function12);
        Intrinsics.checkNotNullParameter(modelFileLocation, "modelFileLocation");
        this.f88072b1 = C50027um0.m9789e(1.0f, 0.0f, 2, null);
        this.f88073c1 = C50027um0.m9790d(1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        this.f88074d1 = C50027um0.m9789e(0.1f, 0.0f, 2, null);
        this.f88075e1 = 250L;
    }
}
