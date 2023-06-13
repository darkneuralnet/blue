.class public final synthetic Lio/github/sceneview/ar/ArSceneView$d;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/ArSceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;Lcom/google/ar/sceneform/ArCameraNode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/github/sceneview/ar/arcore/LightEstimator;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x1

    const-class v3, Lio/github/sceneview/ar/ArSceneView;

    const-string v4, "onLightEstimationUpdate"

    const-string v5, "onLightEstimationUpdate(Lio/github/sceneview/ar/arcore/LightEstimator;)V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/github/sceneview/ar/arcore/LightEstimator;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/github/sceneview/ar/ArSceneView;

    invoke-virtual {v0, p1}, Lio/github/sceneview/ar/ArSceneView;->C0(Lio/github/sceneview/ar/arcore/LightEstimator;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/github/sceneview/ar/arcore/LightEstimator;

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/ArSceneView$d;->a(Lio/github/sceneview/ar/arcore/LightEstimator;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
