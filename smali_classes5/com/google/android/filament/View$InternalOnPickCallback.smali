.class Lcom/google/android/filament/View$InternalOnPickCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InternalOnPickCallback"
.end annotation


# instance fields
.field mDepth:F

.field mFragCoordsX:F

.field mFragCoordsY:F

.field mFragCoordsZ:F

.field private final mPickingQueryResult:Lcom/google/android/filament/View$PickingQueryResult;

.field mRenderable:I
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field private final mUserCallback:Lcom/google/android/filament/View$OnPickCallback;


# direct methods
.method public constructor <init>(Lcom/google/android/filament/View$OnPickCallback;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/filament/View$PickingQueryResult;

    invoke-direct {v0}, Lcom/google/android/filament/View$PickingQueryResult;-><init>()V

    iput-object v0, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mPickingQueryResult:Lcom/google/android/filament/View$PickingQueryResult;

    iput-object p1, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mUserCallback:Lcom/google/android/filament/View$OnPickCallback;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mPickingQueryResult:Lcom/google/android/filament/View$PickingQueryResult;

    iget v1, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mRenderable:I

    iput v1, v0, Lcom/google/android/filament/View$PickingQueryResult;->renderable:I

    iget v1, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mDepth:F

    iput v1, v0, Lcom/google/android/filament/View$PickingQueryResult;->depth:F

    iget-object v1, v0, Lcom/google/android/filament/View$PickingQueryResult;->fragCoords:[F

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mFragCoordsX:F

    aput v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mFragCoordsY:F

    aput v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mFragCoordsZ:F

    aput v3, v1, v2

    iget-object v1, p0, Lcom/google/android/filament/View$InternalOnPickCallback;->mUserCallback:Lcom/google/android/filament/View$OnPickCallback;

    invoke-interface {v1, v0}, Lcom/google/android/filament/View$OnPickCallback;->onPick(Lcom/google/android/filament/View$PickingQueryResult;)V

    return-void
.end method
