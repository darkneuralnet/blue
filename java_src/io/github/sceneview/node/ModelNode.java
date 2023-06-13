package io.github.sceneview.node;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.Box;
import com.google.android.filament.gltfio.Animator;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.FilamentInstance;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import io.github.sceneview.SceneView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 \u0099\u00012\u00020\u0001:\u0004\u009a\u0001\u009b\u0001B9\b\u0017\u0012\r\b\u0002\u0010\u0090\u0001\u001a\u00060#j\u0002`$\u0012\u000e\b\u0002\u0010\u0092\u0001\u001a\u00070#j\u0003`\u0091\u0001\u0012\r\b\u0002\u0010\u0093\u0001\u001a\u00060#j\u0002`H¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001B\u0093\u0001\b\u0016\u0012\u0007\u0010\u0096\u0001\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$\u0012)\b\u0002\u0010'\u001a#\u0012\u0017\u0012\u00150\u000bj\u0002`\f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012)\b\u0002\u0010*\u001a#\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0006\b\u0094\u0001\u0010\u0098\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016J\u0014\u0010\u000e\u001a\u00020\u00042\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J-\u0010\u001b\u001a\u00020\u00042%\u0010\u001a\u001a!\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0017J~\u0010(\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$2)\b\u0002\u0010'\u001a#\u0012\u0017\u0012\u00150\u000bj\u0002`\f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0093\u0001\u0010+\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$2)\b\u0002\u0010'\u001a#\u0012\u0017\u0012\u00150\u000bj\u0002`\f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00172)\b\u0002\u0010*\u001a#\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0004\b+\u0010,JG\u0010-\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u0014J\u0014\u00102\u001a\u00020\u00042\f\b\u0002\u00101\u001a\u00060#j\u0002`$J\u0018\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020 J\b\u00107\u001a\u00020\u0004H\u0016J\u0012\u00109\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\u0000H\u0016R&\u0010@\u001a\u00060#j\u0002`$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR&\u0010L\u001a\u00060#j\u0002`H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R2\u0010V\u001a\u00060Mj\u0002`N2\n\u0010O\u001a\u00060Mj\u0002`N8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR:\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u000e\u0010O\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR.\u0010m\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020f0e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lRG\u0010u\u001a'\u0012#\u0012!\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u00170n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR.\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040v0n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010p\u001a\u0004\bx\u0010r\"\u0004\by\u0010tRE\u0010\u0081\u0001\u001a#\u0012\u0017\u0012\u00150\u000bj\u0002`\f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0086\u0001\u001a\f\u0018\u00010\u0082\u0001j\u0005\u0018\u0001`\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\"\u0010\u008d\u0001\u001a\u000e\u0012\t\u0012\u000703j\u0003`\u008b\u00010\u008a\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010rR\u001a\u0010\u008f\u0001\u001a\u00060Mj\u0002`N8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010S\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009c\u0001"}, m28432d2 = {"Lio/github/sceneview/node/ModelNode;", "Lio/github/sceneview/node/RenderableNode;", "LPy1;", "frameTime", "", "g", "Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", "modelInstance", "c1", "a1", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "b1", "LP83;", "e", "LUc4;", "rotationDelta", "s0", "", "scaleFactor", "t0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", "S0", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "glbFileLocation", "", "autoAnimate", "scaleToUnits", "Lhu1;", "Lio/github/sceneview/math/Position;", "centerOrigin", "error", "onError", "Y0", "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoaded", "Z0", "(Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/github/sceneview/node/ModelNode;", "h1", "(Lcom/google/android/filament/gltfio/FilamentInstance;ZLjava/lang/Float;Lhu1;)V", "units", "f1", AnalyticsRequestV2.HEADER_ORIGIN, "Q0", "", "animationIndex", "loop", "d1", "N", "toNode", "R0", "P", "Lhu1;", "U0", "()Lhu1;", "j1", "(Lhu1;)V", "modelPosition", "Q", "LUc4;", "getModelQuaternion", "()LUc4;", "setModelQuaternion", "(LUc4;)V", "modelQuaternion", "Lio/github/sceneview/math/Scale;", "R", "V0", "k1", "modelScale", "LyM2;", "Lio/github/sceneview/math/Transform;", "value", "S", "LyM2;", "W0", "()LyM2;", "setModelTransform", "(LyM2;)V", "modelTransform", "T", "Lcom/google/android/filament/gltfio/FilamentInstance;", "T0", "()Lcom/google/android/filament/gltfio/FilamentInstance;", "g1", "(Lcom/google/android/filament/gltfio/FilamentInstance;)V", "Lcom/google/android/filament/gltfio/Animator;", "U", "Lcom/google/android/filament/gltfio/Animator;", "getAnimator", "()Lcom/google/android/filament/gltfio/Animator;", "setAnimator", "(Lcom/google/android/filament/gltfio/Animator;)V", "animator", "", "Lio/github/sceneview/node/ModelNode$b;", "W", "Ljava/util/Map;", "getPlayingAnimations", "()Ljava/util/Map;", "setPlayingAnimations", "(Ljava/util/Map;)V", "playingAnimations", "", "X", "Ljava/util/List;", "X0", "()Ljava/util/List;", "setOnModelLoaded", "(Ljava/util/List;)V", "onModelLoaded", "Lkotlin/Function0;", "Y", "getOnModelChanged", "setOnModelChanged", "onModelChanged", "Z", "Lkotlin/jvm/functions/Function1;", "getOnModelError", "()Lkotlin/jvm/functions/Function1;", "setOnModelError", "(Lkotlin/jvm/functions/Function1;)V", "onModelError", "Lcom/google/android/filament/gltfio/FilamentAsset;", "Lio/github/sceneview/model/Model;", "p0", "Lcom/google/android/filament/gltfio/FilamentAsset;", "loadedModel", "e0", "()Ljava/lang/Integer;", "transformEntity", "", "Lio/github/sceneview/renderable/Renderable;", "P0", "renderables", "i0", "worldTransform", "position", "Lio/github/sceneview/math/Rotation;", "rotation", "scale", "<init>", "(Lhu1;Lhu1;Lhu1;)V", "modelGlbFileLocation", "scaleUnits", "(Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "q0", C17296a.f69688o, "b", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public class ModelNode extends RenderableNode {

    /* renamed from: q0 */
    public static final C23414a f88081q0 = new C23414a(null);

    /* renamed from: r0 */
    public static final int f88082r0 = 8;

    /* renamed from: s0 */
    public static final C42400hu1 f88083s0 = new C42400hu1(0.0f, 0.0f, 0.0f);

    /* renamed from: t0 */
    public static final C36315Uc4 f88084t0;

    /* renamed from: u0 */
    public static final C42400hu1 f88085u0;

    /* renamed from: v0 */
    public static final C42400hu1 f88086v0;

    /* renamed from: P */
    public C42400hu1 f88087P;

    /* renamed from: Q */
    public C36315Uc4 f88088Q;

    /* renamed from: R */
    public C42400hu1 f88089R;

    /* renamed from: S */
    public C52154yM2 f88090S;

    /* renamed from: T */
    public FilamentInstance f88091T;

    /* renamed from: U */
    public Animator f88092U;

    /* renamed from: W */
    public Map<Integer, C23415b> f88093W;

    /* renamed from: X */
    public List<Function1<FilamentInstance, Unit>> f88094X;

    /* renamed from: Y */
    public List<Function0<Unit>> f88095Y;

    /* renamed from: Z */
    public Function1<? super Exception, Unit> f88096Z;

    /* renamed from: p0 */
    public FilamentAsset f88097p0;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lio/github/sceneview/node/ModelNode$a;", "", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.ModelNode$a */
    /* loaded from: classes6.dex */
    public static final class C23414a {
        public /* synthetic */ C23414a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C23414a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lio/github/sceneview/node/ModelNode$b;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "J", "b", "()J", "startTime", "Z", "()Z", "loop", "<init>", "(JZ)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.ModelNode$b */
    /* loaded from: classes6.dex */
    public static final class C23415b {

        /* renamed from: a */
        public final long f88098a;

        /* renamed from: b */
        public final boolean f88099b;

        public C23415b() {
            this(0L, false, 3, null);
        }

        /* renamed from: a */
        public final boolean m33273a() {
            return this.f88099b;
        }

        /* renamed from: b */
        public final long m33272b() {
            return this.f88098a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C23415b) {
                C23415b c23415b = (C23415b) obj;
                return this.f88098a == c23415b.f88098a && this.f88099b == c23415b.f88099b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Long.hashCode(this.f88098a) * 31;
            boolean z = this.f88099b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "PlayingAnimation(startTime=" + this.f88098a + ", loop=" + this.f88099b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C23415b(long j, boolean z) {
            this.f88098a = j;
            this.f88099b = z;
        }

        public /* synthetic */ C23415b(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? System.nanoTime() : j, (i & 2) != 0 ? true : z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", "modelInstance", "", C17296a.f69688o, "(Lcom/google/android/filament/gltfio/FilamentInstance;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.ModelNode$c */
    /* loaded from: classes6.dex */
    public static final class C23416c extends Lambda implements Function1<FilamentInstance, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C42400hu1 f88101h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23416c(C42400hu1 c42400hu1) {
            super(1);
            this.f88101h = c42400hu1;
        }

        /* renamed from: a */
        public final void m33271a(FilamentInstance modelInstance) {
            Intrinsics.checkNotNullParameter(modelInstance, "modelInstance");
            float[] center = UU2.m81468a(modelInstance).getBoundingBox().getCenter();
            C42400hu1 c42400hu1 = new C42400hu1(center[0], center[1], center[2]);
            float[] halfExtent = UU2.m81468a(modelInstance).getBoundingBox().getHalfExtent();
            C42400hu1 c42400hu12 = new C42400hu1(halfExtent[0], halfExtent[1], halfExtent[2]);
            ModelNode modelNode = ModelNode.this;
            C42400hu1 c42400hu13 = this.f88101h;
            C42400hu1 c42400hu14 = new C42400hu1(c42400hu12.m35576g() * c42400hu13.m35576g(), c42400hu12.m35575h() * c42400hu13.m35575h(), c42400hu12.m35574i() * c42400hu13.m35574i());
            C42400hu1 m35569n = new C42400hu1(c42400hu1.m35576g() + c42400hu14.m35576g(), c42400hu1.m35575h() + c42400hu14.m35575h(), c42400hu1.m35574i() + c42400hu14.m35574i()).m35569n();
            C42400hu1 m33289V0 = ModelNode.this.m33289V0();
            modelNode.m33275j1(new C42400hu1(m35569n.m35576g() * m33289V0.m35576g(), m35569n.m35575h() * m33289V0.m35575h(), m35569n.m35574i() * m33289V0.m35574i()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FilamentInstance filamentInstance) {
            m33271a(filamentInstance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00040\u0001J\u0015\u0010\u0006\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0096\u0002¨\u0006\u0007"}, m28432d2 = {"io/github/sceneview/node/ModelNode$d", "Lkotlin/Function1;", "Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", "", "modelInstance", C17296a.f69688o, "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.ModelNode$d */
    /* loaded from: classes6.dex */
    public static final class C23417d implements Function1<FilamentInstance, Unit> {

        /* renamed from: c */
        public final /* synthetic */ Function1<FilamentInstance, Unit> f88103c;

        /* JADX WARN: Multi-variable type inference failed */
        public C23417d(Function1<? super FilamentInstance, Unit> function1) {
            this.f88103c = function1;
        }

        /* renamed from: a */
        public void m33270a(FilamentInstance modelInstance) {
            Intrinsics.checkNotNullParameter(modelInstance, "modelInstance");
            ModelNode.this.m33287X0().remove(this);
            this.f88103c.invoke(modelInstance);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FilamentInstance filamentInstance) {
            m33270a(filamentInstance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    @DebugMetadata(m28419c = "io.github.sceneview.node.ModelNode", m28418f = "ModelNode.kt", m28417i = {0, 0, 0, 0, 0, 1, 1}, m28416l = {321, 323}, m28415m = "loadModelGlb", m28414n = {"this", "scaleToUnits", "centerOrigin", "onError", "autoAnimate", "this", "onError"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1"})
    /* renamed from: io.github.sceneview.node.ModelNode$e */
    /* loaded from: classes6.dex */
    public static final class C23418e extends ContinuationImpl {

        /* renamed from: h */
        public Object f88104h;

        /* renamed from: i */
        public Object f88105i;

        /* renamed from: j */
        public Object f88106j;

        /* renamed from: k */
        public Object f88107k;

        /* renamed from: l */
        public boolean f88108l;

        /* renamed from: m */
        public /* synthetic */ Object f88109m;

        /* renamed from: o */
        public int f88111o;

        public C23418e(Continuation<? super C23418e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f88109m = obj;
            this.f88111o |= Integer.MIN_VALUE;
            return ModelNode.this.m33286Y0(null, null, false, null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "io.github.sceneview.node.ModelNode$loadModelGlb$2$1", m28418f = "ModelNode.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: io.github.sceneview.node.ModelNode$f */
    /* loaded from: classes6.dex */
    public static final class C23419f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f88112h;

        /* renamed from: j */
        public final /* synthetic */ FilamentAsset f88114j;

        /* renamed from: k */
        public final /* synthetic */ boolean f88115k;

        /* renamed from: l */
        public final /* synthetic */ Float f88116l;

        /* renamed from: m */
        public final /* synthetic */ C42400hu1 f88117m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23419f(FilamentAsset filamentAsset, boolean z, Float f, C42400hu1 c42400hu1, Continuation<? super C23419f> continuation) {
            super(2, continuation);
            this.f88114j = filamentAsset;
            this.f88115k = z;
            this.f88116l = f;
            this.f88117m = c42400hu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23419f(this.f88114j, this.f88115k, this.f88116l, this.f88117m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C23419f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f88112h == 0) {
                ResultKt.throwOnFailure(obj);
                ModelNode.this.m33277h1(this.f88114j.getInstance(), this.f88115k, this.f88116l, this.f88117m);
                ModelNode modelNode = ModelNode.this;
                FilamentInstance filamentAsset = this.f88114j.getInstance();
                Intrinsics.checkNotNullExpressionValue(filamentAsset, "model.instance");
                modelNode.m33282c1(filamentAsset);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/github/sceneview/SceneView;", "sceneView", "", C17296a.f69688o, "(Lio/github/sceneview/SceneView;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.ModelNode$g */
    /* loaded from: classes6.dex */
    public static final class C23420g extends Lambda implements Function1<SceneView, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f88119h;

        /* renamed from: i */
        public final /* synthetic */ boolean f88120i;

        /* renamed from: j */
        public final /* synthetic */ Float f88121j;

        /* renamed from: k */
        public final /* synthetic */ C42400hu1 f88122k;

        /* renamed from: l */
        public final /* synthetic */ Function1<Exception, Unit> f88123l;

        /* renamed from: m */
        public final /* synthetic */ Function1<FilamentInstance, Unit> f88124m;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "io.github.sceneview.node.ModelNode$loadModelGlbAsync$1$1", m28418f = "ModelNode.kt", m28417i = {}, m28416l = {370}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: io.github.sceneview.node.ModelNode$g$a */
        /* loaded from: classes6.dex */
        public static final class C23421a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f88125h;

            /* renamed from: i */
            public final /* synthetic */ ModelNode f88126i;

            /* renamed from: j */
            public final /* synthetic */ SceneView f88127j;

            /* renamed from: k */
            public final /* synthetic */ String f88128k;

            /* renamed from: l */
            public final /* synthetic */ boolean f88129l;

            /* renamed from: m */
            public final /* synthetic */ Float f88130m;

            /* renamed from: n */
            public final /* synthetic */ C42400hu1 f88131n;

            /* renamed from: o */
            public final /* synthetic */ Function1<Exception, Unit> f88132o;

            /* renamed from: p */
            public final /* synthetic */ Function1<FilamentInstance, Unit> f88133p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C23421a(ModelNode modelNode, SceneView sceneView, String str, boolean z, Float f, C42400hu1 c42400hu1, Function1<? super Exception, Unit> function1, Function1<? super FilamentInstance, Unit> function12, Continuation<? super C23421a> continuation) {
                super(2, continuation);
                this.f88126i = modelNode;
                this.f88127j = sceneView;
                this.f88128k = str;
                this.f88129l = z;
                this.f88130m = f;
                this.f88131n = c42400hu1;
                this.f88132o = function1;
                this.f88133p = function12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C23421a(this.f88126i, this.f88127j, this.f88128k, this.f88129l, this.f88130m, this.f88131n, this.f88132o, this.f88133p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C23421a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                Function1<FilamentInstance, Unit> function1;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f88125h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ModelNode modelNode = this.f88126i;
                    Context context = this.f88127j.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "sceneView.context");
                    String str = this.f88128k;
                    boolean z = this.f88129l;
                    Float f = this.f88130m;
                    C42400hu1 c42400hu1 = this.f88131n;
                    Function1<Exception, Unit> function12 = this.f88132o;
                    this.f88125h = 1;
                    obj = modelNode.m33286Y0(context, str, z, f, c42400hu1, function12, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                FilamentInstance filamentInstance = (FilamentInstance) obj;
                if (filamentInstance != null && (function1 = this.f88133p) != null) {
                    function1.invoke(filamentInstance);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23420g(String str, boolean z, Float f, C42400hu1 c42400hu1, Function1<? super Exception, Unit> function1, Function1<? super FilamentInstance, Unit> function12) {
            super(1);
            this.f88119h = str;
            this.f88120i = z;
            this.f88121j = f;
            this.f88122k = c42400hu1;
            this.f88123l = function1;
            this.f88124m = function12;
        }

        /* renamed from: a */
        public final void m33269a(SceneView sceneView) {
            Intrinsics.checkNotNullParameter(sceneView, "sceneView");
            C31993Bq2.m113448a(sceneView.getLifecycle()).m389b(new C23421a(ModelNode.this, sceneView, this.f88119h, this.f88120i, this.f88121j, this.f88122k, this.f88123l, this.f88124m, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SceneView sceneView) {
            m33269a(sceneView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", "modelInstance", "", C17296a.f69688o, "(Lcom/google/android/filament/gltfio/FilamentInstance;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.node.ModelNode$h */
    /* loaded from: classes6.dex */
    public static final class C23422h extends Lambda implements Function1<FilamentInstance, Unit> {

        /* renamed from: h */
        public final /* synthetic */ float f88135h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23422h(float f) {
            super(1);
            this.f88135h = f;
        }

        /* renamed from: a */
        public final void m33268a(FilamentInstance modelInstance) {
            Intrinsics.checkNotNullParameter(modelInstance, "modelInstance");
            float[] halfExtent = UU2.m81468a(modelInstance).getBoundingBox().getHalfExtent();
            C42400hu1 c42400hu1 = new C42400hu1(halfExtent[0], halfExtent[1], halfExtent[2]);
            ModelNode.this.m33274k1(new C42400hu1(this.f88135h / (Math.max(c42400hu1.m35576g(), Math.max(c42400hu1.m35575h(), c42400hu1.m35574i())) * 2.0f)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FilamentInstance filamentInstance) {
            m33268a(filamentInstance);
            return Unit.INSTANCE;
        }
    }

    static {
        C36315Uc4 c36315Uc4 = new C36315Uc4(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        f88084t0 = c36315Uc4;
        f88085u0 = c36315Uc4.m81258e();
        f88086v0 = new C42400hu1(1.0f);
    }

    @JvmOverloads
    public ModelNode() {
        this(null, null, null, 7, null);
    }

    /* renamed from: e1 */
    public static /* synthetic */ void m33280e1(ModelNode modelNode, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playAnimation");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        modelNode.m33281d1(i, z);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m33276i1(ModelNode modelNode, FilamentInstance filamentInstance, boolean z, Float f, C42400hu1 c42400hu1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setModelInstance");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            f = null;
        }
        if ((i & 8) != 0) {
            c42400hu1 = null;
        }
        modelNode.m33277h1(filamentInstance, z, f, c42400hu1);
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: N */
    public void mo33178N() {
        FilamentAsset filamentAsset = this.f88097p0;
        if (filamentAsset != null) {
            VU2.m79846a(filamentAsset);
        }
        super.mo33178N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r0);
     */
    @Override // io.github.sceneview.node.RenderableNode
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Integer> mo33181P0() {
        List<Integer> emptyList;
        List<Integer> list;
        FilamentInstance m33291T0 = m33291T0();
        if (m33291T0 == null || (r0 = UU2.m81467b(m33291T0)) == null || list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    /* renamed from: Q0 */
    public final void m33294Q0(C42400hu1 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        m33292S0(new C23416c(origin));
    }

    /* renamed from: R0 */
    public ModelNode m33293R0(ModelNode toNode) {
        Intrinsics.checkNotNullParameter(toNode, "toNode");
        super.m33245M(toNode);
        m33276i1(toNode, m33291T0(), false, null, null, 14, null);
        return toNode;
    }

    /* renamed from: S0 */
    public final void m33292S0(Function1<? super FilamentInstance, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (m33291T0() != null) {
            FilamentInstance m33291T0 = m33291T0();
            Intrinsics.checkNotNull(m33291T0);
            action.invoke(m33291T0);
            return;
        }
        this.f88094X.add(new C23417d(action));
    }

    /* renamed from: T0 */
    public FilamentInstance m33291T0() {
        return this.f88091T;
    }

    /* renamed from: U0 */
    public C42400hu1 m33290U0() {
        return this.f88087P;
    }

    /* renamed from: V0 */
    public C42400hu1 m33289V0() {
        return this.f88089R;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C52154yM2 m33288W0() {
        boolean z;
        C52154yM2 c52154yM2 = this.f88090S;
        C42993iu1 m3579a = c52154yM2.m3579a();
        if (Intrinsics.areEqual(new C42400hu1(m3579a.m31660e(), m3579a.m31659f(), m3579a.m31658g()), m33290U0()) && Intrinsics.areEqual(C41491gN2.m39559f(c52154yM2), this.f88088Q)) {
            C42993iu1 m3578b = c52154yM2.m3578b();
            C42400hu1 c42400hu1 = new C42400hu1(m3578b.m31660e(), m3578b.m31659f(), m3578b.m31658g());
            C42993iu1 m3577c = c52154yM2.m3577c();
            C42400hu1 c42400hu12 = new C42400hu1(m3577c.m31660e(), m3577c.m31659f(), m3577c.m31658g());
            C42993iu1 m3576d = c52154yM2.m3576d();
            C42400hu1 c42400hu13 = new C42400hu1(m3576d.m31660e(), m3576d.m31659f(), m3576d.m31658g());
            if (Intrinsics.areEqual(new C42400hu1((float) Math.sqrt((c42400hu1.m35576g() * c42400hu1.m35576g()) + (c42400hu1.m35575h() * c42400hu1.m35575h()) + (c42400hu1.m35574i() * c42400hu1.m35574i())), (float) Math.sqrt((c42400hu12.m35576g() * c42400hu12.m35576g()) + (c42400hu12.m35575h() * c42400hu12.m35575h()) + (c42400hu12.m35574i() * c42400hu12.m35574i())), (float) Math.sqrt((c42400hu13.m35576g() * c42400hu13.m35576g()) + (c42400hu13.m35575h() * c42400hu13.m35575h()) + (c42400hu13.m35574i() * c42400hu13.m35574i()))), m33289V0())) {
                z = true;
                if (!z) {
                    c52154yM2 = null;
                }
                if (c52154yM2 != null) {
                    return C41491gN2.m39564a(m33290U0(), this.f88088Q, m33289V0());
                }
                return c52154yM2;
            }
        }
        z = false;
        if (!z) {
        }
        if (c52154yM2 != null) {
        }
    }

    /* renamed from: X0 */
    public final List<Function1<FilamentInstance, Unit>> m33287X0() {
        return this.f88094X;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:32:0x0091, B:34:0x0095, B:38:0x00a1), top: B:58:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m33286Y0(Context context, String str, boolean z, Float f, C42400hu1 c42400hu1, Function1<? super Exception, Unit> function1, Continuation<? super FilamentInstance> continuation) {
        C23418e c23418e;
        Object coroutine_suspended;
        int i;
        Function1<? super Exception, Unit> function12;
        ModelNode modelNode;
        QA1 qa1;
        Float f2;
        C42400hu1 c42400hu12;
        boolean z2;
        ModelNode modelNode2;
        FilamentAsset filamentAsset;
        FilamentAsset filamentAsset2;
        try {
            if (continuation instanceof C23418e) {
                c23418e = (C23418e) continuation;
                int i2 = c23418e.f88111o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c23418e.f88111o = i2 - Integer.MIN_VALUE;
                    Object obj = c23418e.f88109m;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c23418e.f88111o;
                    boolean z3 = true;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                filamentAsset2 = (FilamentAsset) c23418e.f88106j;
                                Function1<? super Exception, Unit> function13 = (Function1) c23418e.f88105i;
                                modelNode = (ModelNode) c23418e.f88104h;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    function12 = function13;
                                    if (filamentAsset2 != null) {
                                        return null;
                                    }
                                    try {
                                        return filamentAsset2.getInstance();
                                    } catch (Exception e) {
                                        e = e;
                                        modelNode.m33283b1(e);
                                        if (function12 == null) {
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    function12 = function13;
                                    modelNode.m33283b1(e);
                                    if (function12 == null) {
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            boolean z4 = c23418e.f88108l;
                            Function1<? super Exception, Unit> function14 = (Function1) c23418e.f88107k;
                            C42400hu1 c42400hu13 = (C42400hu1) c23418e.f88106j;
                            Float f3 = (Float) c23418e.f88105i;
                            modelNode2 = (ModelNode) c23418e.f88104h;
                            try {
                                ResultKt.throwOnFailure(obj);
                                z2 = z4;
                                f2 = f3;
                                function12 = function14;
                                c42400hu12 = c42400hu13;
                            } catch (Exception e3) {
                                e = e3;
                                function12 = function14;
                                modelNode = modelNode2;
                                modelNode.m33283b1(e);
                                if (function12 == null) {
                                }
                            }
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        try {
                            qa1 = QA1.f29912a;
                            c23418e.f88104h = this;
                            f2 = f;
                            c23418e.f88105i = f2;
                            c42400hu12 = c42400hu1;
                            c23418e.f88106j = c42400hu12;
                            function12 = function1;
                        } catch (Exception e4) {
                            e = e4;
                            function12 = function1;
                        }
                        try {
                            c23418e.f88107k = function12;
                            z2 = z;
                            c23418e.f88108l = z2;
                            c23418e.f88111o = 1;
                            obj = qa1.m88848b(context, str, c23418e);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            modelNode2 = this;
                        } catch (Exception e5) {
                            e = e5;
                            modelNode = this;
                            modelNode.m33283b1(e);
                            if (function12 == null) {
                            }
                        }
                    }
                    filamentAsset = (FilamentAsset) obj;
                    if (filamentAsset != null) {
                        return null;
                    }
                    modelNode2.f88097p0 = filamentAsset;
                    AbstractC46765pG2 m84376c = T41.m84376c();
                    if (!z2) {
                        z3 = false;
                    }
                    C23419f c23419f = new C23419f(filamentAsset, z3, f2, c42400hu12, null);
                    c23418e.f88104h = modelNode2;
                    c23418e.f88105i = function12;
                    c23418e.f88106j = filamentAsset;
                    c23418e.f88107k = null;
                    c23418e.f88111o = 2;
                    if (X30.m77504g(m84376c, c23419f, c23418e) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    filamentAsset2 = filamentAsset;
                    modelNode = modelNode2;
                    if (filamentAsset2 != null) {
                    }
                }
            }
            filamentAsset = (FilamentAsset) obj;
            if (filamentAsset != null) {
            }
        } catch (Exception e6) {
            e = e6;
            modelNode = modelNode2;
            modelNode.m33283b1(e);
            if (function12 == null) {
                return null;
            }
            function12.invoke(e);
            return null;
        }
        c23418e = new C23418e(continuation);
        Object obj2 = c23418e.f88109m;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c23418e.f88111o;
        boolean z32 = true;
        if (i == 0) {
        }
    }

    /* renamed from: Z0 */
    public final ModelNode m33285Z0(String glbFileLocation, boolean z, Float f, C42400hu1 c42400hu1, Function1<? super Exception, Unit> function1, Function1<? super FilamentInstance, Unit> function12) {
        Intrinsics.checkNotNullParameter(glbFileLocation, "glbFileLocation");
        m33241P(new C23420g(glbFileLocation, z, f, c42400hu1, function1, function12));
        return this;
    }

    /* renamed from: a1 */
    public void mo33284a1(FilamentInstance filamentInstance) {
        C38300b10 c38300b10;
        FilamentAsset m81468a;
        Box boundingBox;
        if (filamentInstance != null && (m81468a = UU2.m81468a(filamentInstance)) != null && (boundingBox = m81468a.getBoundingBox()) != null) {
            float[] halfExtent = boundingBox.getHalfExtent();
            Intrinsics.checkNotNullExpressionValue(halfExtent, "boundingBox.halfExtent");
            float[] center = boundingBox.getCenter();
            Intrinsics.checkNotNullExpressionValue(center, "boundingBox.center");
            c38300b10 = new C38300b10(new C35444Qj6(halfExtent[0], halfExtent[1], halfExtent[2]).m88129m(2.0f), new C35444Qj6(center[0], center[1], center[2]));
        } else {
            c38300b10 = null;
        }
        m33193w0(c38300b10);
        mo33195v0();
        Iterator<T> it = this.f88095Y.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    /* renamed from: b1 */
    public void m33283b1(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Function1<? super Exception, Unit> function1 = this.f88096Z;
        if (function1 != null) {
            function1.invoke(exception);
        }
    }

    /* renamed from: c1 */
    public void m33282c1(FilamentInstance modelInstance) {
        Intrinsics.checkNotNullParameter(modelInstance, "modelInstance");
        Iterator<T> it = this.f88094X.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(modelInstance);
        }
    }

    /* renamed from: d1 */
    public final void m33281d1(int i, boolean z) {
        this.f88093W.put(Integer.valueOf(i), new C23415b(0L, z, 1, null));
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: e0 */
    public Integer mo33222e0() {
        FilamentInstance m33291T0 = m33291T0();
        if (m33291T0 != null) {
            return Integer.valueOf(m33291T0.getRoot());
        }
        return null;
    }

    /* renamed from: f1 */
    public final void m33279f1(float f) {
        m33292S0(new C23422h(f));
    }

    @Override // io.github.sceneview.node.Node, p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 frameTime) {
        FilamentAsset m81468a;
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        super.mo15404g(frameTime);
        FilamentInstance m33291T0 = m33291T0();
        if (m33291T0 != null && (m81468a = UU2.m81468a(m33291T0)) != null) {
            m81468a.popRenderable();
        }
        Animator animator = this.f88092U;
        if (animator != null) {
            for (Map.Entry<Integer, C23415b> entry : this.f88093W.entrySet()) {
                int intValue = entry.getKey().intValue();
                C23415b value = entry.getValue();
                double m89216i = frameTime.m89216i(Long.valueOf(value.m33272b()));
                animator.applyAnimation(intValue, (float) m89216i);
                if (!value.m33273a() && m89216i >= animator.getAnimationDuration(intValue)) {
                    this.f88093W.remove(Integer.valueOf(intValue));
                }
            }
            animator.updateBoneMatrices();
        }
    }

    /* renamed from: g1 */
    public void m33278g1(FilamentInstance filamentInstance) {
        Animator animator;
        if (!Intrinsics.areEqual(this.f88091T, filamentInstance)) {
            this.f88091T = filamentInstance;
            int[] iArr = null;
            if (filamentInstance != null) {
                animator = filamentInstance.getAnimator();
            } else {
                animator = null;
            }
            this.f88092U = animator;
            if (filamentInstance != null) {
                iArr = filamentInstance.getEntities();
            }
            if (iArr == null) {
                iArr = new int[0];
            }
            m33260D0(iArr);
            mo33284a1(m33291T0());
        }
    }

    /* renamed from: h1 */
    public void m33277h1(FilamentInstance filamentInstance, boolean z, Float f, C42400hu1 c42400hu1) {
        m33278g1(filamentInstance);
        if (filamentInstance != null) {
            if (z && filamentInstance.getAnimator().getAnimationCount() > 0) {
                m33280e1(this, 0, false, 2, null);
            }
            if (f != null) {
                m33279f1(f.floatValue());
            }
            if (c42400hu1 != null) {
                m33294Q0(c42400hu1);
            }
        }
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: i0 */
    public C52154yM2 mo33217i0() {
        return super.mo33217i0().m3575e(m33288W0());
    }

    /* renamed from: j1 */
    public void m33275j1(C42400hu1 c42400hu1) {
        Intrinsics.checkNotNullParameter(c42400hu1, "<set-?>");
        this.f88087P = c42400hu1;
    }

    /* renamed from: k1 */
    public void m33274k1(C42400hu1 c42400hu1) {
        Intrinsics.checkNotNullParameter(c42400hu1, "<set-?>");
        this.f88089R = c42400hu1;
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: s0 */
    public void mo33201s0(P83 e, C36315Uc4 rotationDelta) {
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(rotationDelta, "rotationDelta");
        C36315Uc4 c36315Uc4 = this.f88088Q;
        this.f88088Q = new C36315Uc4((((c36315Uc4.m81262a() * rotationDelta.m81261b()) + (c36315Uc4.m81261b() * rotationDelta.m81262a())) + (c36315Uc4.m81260c() * rotationDelta.m81259d())) - (c36315Uc4.m81259d() * rotationDelta.m81260c()), ((c36315Uc4.m81262a() * rotationDelta.m81260c()) - (c36315Uc4.m81261b() * rotationDelta.m81259d())) + (c36315Uc4.m81260c() * rotationDelta.m81262a()) + (c36315Uc4.m81259d() * rotationDelta.m81261b()), (((c36315Uc4.m81262a() * rotationDelta.m81259d()) + (c36315Uc4.m81261b() * rotationDelta.m81260c())) - (c36315Uc4.m81260c() * rotationDelta.m81261b())) + (c36315Uc4.m81259d() * rotationDelta.m81262a()), (((c36315Uc4.m81262a() * rotationDelta.m81262a()) - (c36315Uc4.m81261b() * rotationDelta.m81261b())) - (c36315Uc4.m81260c() * rotationDelta.m81260c())) - (c36315Uc4.m81259d() * rotationDelta.m81259d()));
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: t0 */
    public void mo33199t0(P83 e, float f) {
        Intrinsics.checkNotNullParameter(e, "e");
        C42400hu1 m33289V0 = m33289V0();
        C42400hu1 c42400hu1 = new C42400hu1(m33289V0.m35576g() * f, m33289V0.m35575h() * f, m33289V0.m35574i() * f);
        float m33236U = m33236U();
        float m33237T = m33237T();
        float m35576g = c42400hu1.m35576g();
        if (m35576g < m33236U) {
            m35576g = m33236U;
        } else if (m35576g > m33237T) {
            m35576g = m33237T;
        }
        float m35575h = c42400hu1.m35575h();
        if (m35575h < m33236U) {
            m35575h = m33236U;
        } else if (m35575h > m33237T) {
            m35575h = m33237T;
        }
        float m35574i = c42400hu1.m35574i();
        if (m35574i >= m33236U) {
            if (m35574i > m33237T) {
                m33236U = m33237T;
            } else {
                m33236U = m35574i;
            }
        }
        m33274k1(new C42400hu1(m35576g, m35575h, m33236U));
    }

    public /* synthetic */ ModelNode(C42400hu1 c42400hu1, C42400hu1 c42400hu12, C42400hu1 c42400hu13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Node.f88136H.m33187a() : c42400hu1, (i & 2) != 0 ? Node.f88136H.m33185c() : c42400hu12, (i & 4) != 0 ? Node.f88136H.m33184d() : c42400hu13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelNode(C42400hu1 position, C42400hu1 rotation, C42400hu1 scale) {
        super(position, rotation, scale);
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f88087P = f88083s0;
        this.f88088Q = f88084t0;
        this.f88089R = f88086v0;
        this.f88090S = C41491gN2.m39564a(m33290U0(), this.f88088Q, m33289V0());
        this.f88093W = new LinkedHashMap();
        this.f88094X = new ArrayList();
        this.f88095Y = new ArrayList();
    }

    public /* synthetic */ ModelNode(String str, boolean z, Float f, C42400hu1 c42400hu1, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : c42400hu1, (i & 16) != 0 ? null : function1, (i & 32) != 0 ? null : function12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelNode(String modelGlbFileLocation, boolean z, Float f, C42400hu1 c42400hu1, Function1<? super Exception, Unit> function1, Function1<? super FilamentInstance, Unit> function12) {
        this(null, null, null, 7, null);
        Intrinsics.checkNotNullParameter(modelGlbFileLocation, "modelGlbFileLocation");
        m33285Z0(modelGlbFileLocation, z, f, c42400hu1, function1, function12);
    }
}
