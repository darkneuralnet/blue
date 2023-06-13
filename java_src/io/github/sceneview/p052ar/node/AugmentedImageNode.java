package io.github.sceneview.p052ar.node;

import android.graphics.Bitmap;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.AugmentedImage;
import com.google.p034ar.core.AugmentedImageDatabase;
import com.google.p034ar.core.Config;
import io.github.sceneview.SceneView;
import io.github.sceneview.p052ar.ArSceneView;
import io.github.sceneview.p052ar.arcore.ArSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aRC\u0010(\u001a#\u0012\u0017\u0012\u00150\u001dj\u0002`\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'RT\u00101\u001a4\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u00102\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006?"}, m28432d2 = {"Lio/github/sceneview/ar/node/AugmentedImageNode;", "Lio/github/sceneview/ar/node/ArNode;", "Lio/github/sceneview/SceneView;", "sceneView", "", "q0", "r0", "Lcom/google/ar/core/AugmentedImage;", "augmentedImage", "D1", "", "L0", "Ljava/lang/String;", "z1", "()Ljava/lang/String;", "imageName", "Landroid/graphics/Bitmap;", "M0", "Landroid/graphics/Bitmap;", "y1", "()Landroid/graphics/Bitmap;", "bitmap", "", "N0", "Ljava/lang/Float;", "B1", "()Ljava/lang/Float;", "widthInMeters", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", "exception", "O0", "Lkotlin/jvm/functions/Function1;", "A1", "()Lkotlin/jvm/functions/Function1;", "setOnError", "(Lkotlin/jvm/functions/Function1;)V", "onError", "Lkotlin/Function2;", "node", "P0", "Lkotlin/jvm/functions/Function2;", "getOnUpdate", "()Lkotlin/jvm/functions/Function2;", "setOnUpdate", "(Lkotlin/jvm/functions/Function2;)V", "onUpdate", "value", "Q0", "Lcom/google/ar/core/AugmentedImage;", "getAugmentedImage", "()Lcom/google/ar/core/AugmentedImage;", "E1", "(Lcom/google/ar/core/AugmentedImage;)V", "", "C1", "()Z", "isTracking", "p0", "isVisibleInHierarchy", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.node.AugmentedImageNode */
/* loaded from: classes6.dex */
public class AugmentedImageNode extends ArNode {

    /* renamed from: L0 */
    public final String f88065L0;

    /* renamed from: M0 */
    public final Bitmap f88066M0;

    /* renamed from: N0 */
    public final Float f88067N0;

    /* renamed from: O0 */
    public Function1<? super Exception, Unit> f88068O0;

    /* renamed from: P0 */
    public Function2<? super AugmentedImageNode, ? super AugmentedImage, Unit> f88069P0;

    /* renamed from: Q0 */
    public AugmentedImage f88070Q0;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.ar.node.AugmentedImageNode$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C23410a extends FunctionReferenceImpl implements Function1<AugmentedImage, Unit> {
        public C23410a(Object obj) {
            super(1, obj, AugmentedImageNode.class, "onAugmentedImageUpdate", "onAugmentedImageUpdate(Lcom/google/ar/core/AugmentedImage;)V", 0);
        }

        /* renamed from: a */
        public final void m33304a(AugmentedImage p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AugmentedImageNode) this.receiver).m33309D1(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AugmentedImage augmentedImage) {
            m33304a(augmentedImage);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "session", "Lcom/google/ar/core/Config;", "config", "", C17296a.f69688o, "(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.node.AugmentedImageNode$b */
    /* loaded from: classes6.dex */
    public static final class C23411b extends Lambda implements Function2<ArSession, Config, Unit> {
        public C23411b() {
            super(2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:3:0x000a, B:5:0x0011, B:13:0x0020, B:15:0x002d, B:16:0x0041, B:17:0x004c), top: B:24:0x000a }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m33303a(ArSession session, Config config) {
            boolean z;
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(config, "config");
            try {
                AugmentedImageDatabase augmentedImageDatabase = config.getAugmentedImageDatabase();
                if (augmentedImageDatabase != null) {
                    if (augmentedImageDatabase.getNumImages() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (augmentedImageDatabase == null) {
                            augmentedImageDatabase = new AugmentedImageDatabase(session);
                            AugmentedImageNode augmentedImageNode = AugmentedImageNode.this;
                            if (augmentedImageNode.m33311B1() != null) {
                                augmentedImageDatabase.addImage(augmentedImageNode.m33305z1(), augmentedImageNode.m33306y1(), augmentedImageNode.m33311B1().floatValue());
                            } else {
                                augmentedImageDatabase.addImage(augmentedImageNode.m33305z1(), augmentedImageNode.m33306y1());
                            }
                        }
                        config.setAugmentedImageDatabase(augmentedImageDatabase);
                    }
                }
                augmentedImageDatabase = null;
                if (augmentedImageDatabase == null) {
                }
                config.setAugmentedImageDatabase(augmentedImageDatabase);
            } catch (Exception e) {
                Function1<Exception, Unit> m33312A1 = AugmentedImageNode.this.m33312A1();
                if (m33312A1 != null) {
                    m33312A1.invoke(e);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ArSession arSession, Config config) {
            m33303a(arSession, config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: io.github.sceneview.ar.node.AugmentedImageNode$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C23412c extends FunctionReferenceImpl implements Function1<AugmentedImage, Unit> {
        public C23412c(Object obj) {
            super(1, obj, AugmentedImageNode.class, "onAugmentedImageUpdate", "onAugmentedImageUpdate(Lcom/google/ar/core/AugmentedImage;)V", 0);
        }

        /* renamed from: a */
        public final void m33302a(AugmentedImage p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AugmentedImageNode) this.receiver).m33309D1(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AugmentedImage augmentedImage) {
            m33302a(augmentedImage);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A1 */
    public final Function1<Exception, Unit> m33312A1() {
        return this.f88068O0;
    }

    /* renamed from: B1 */
    public final Float m33311B1() {
        return this.f88067N0;
    }

    /* renamed from: C1 */
    public boolean m33310C1() {
        AugmentedImage augmentedImage = this.f88070Q0;
        return augmentedImage != null && C43117j66.m31108a(augmentedImage);
    }

    /* renamed from: D1 */
    public final void m33309D1(AugmentedImage augmentedImage) {
        if (Intrinsics.areEqual(augmentedImage.getName(), this.f88065L0)) {
            m33308E1(augmentedImage);
        }
    }

    /* renamed from: E1 */
    public final void m33308E1(AugmentedImage augmentedImage) {
        this.f88070Q0 = augmentedImage;
        if (augmentedImage != null) {
            if (C43117j66.m31108a(augmentedImage) && m33321o1() == null) {
                m33317s1(augmentedImage.createAnchor(augmentedImage.getCenterPose()));
            }
            Function2<? super AugmentedImageNode, ? super AugmentedImage, Unit> function2 = this.f88069P0;
            if (function2 != null) {
                function2.invoke(this, augmentedImage);
            }
        }
    }

    @Override // io.github.sceneview.p052ar.node.ArNode, io.github.sceneview.node.Node
    /* renamed from: p0 */
    public boolean mo33204p0() {
        return super.mo33204p0() && m33310C1();
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: q0 */
    public void mo33175q0(SceneView sceneView) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        super.mo33175q0(sceneView);
        if (sceneView instanceof ArSceneView) {
            ArSceneView arSceneView = (ArSceneView) sceneView;
            arSceneView.m33388y0().add(new C23410a(this));
            if (this.f88066M0 != null) {
                arSceneView.m33397p0(new C23411b());
            }
        }
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: r0 */
    public void mo33174r0(SceneView sceneView) {
        ArSceneView arSceneView;
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        super.mo33174r0(sceneView);
        if (sceneView instanceof ArSceneView) {
            arSceneView = (ArSceneView) sceneView;
        } else {
            arSceneView = null;
        }
        if (arSceneView != null) {
            arSceneView.m33388y0().remove(new C23412c(this));
        }
    }

    /* renamed from: y1 */
    public final Bitmap m33306y1() {
        return this.f88066M0;
    }

    /* renamed from: z1 */
    public final String m33305z1() {
        return this.f88065L0;
    }
}
