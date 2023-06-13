.class public final LWv6$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/Earth;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/google/ar/core/Earth;",
        "it",
        "",
        "a",
        "(Lcom/google/ar/core/Earth;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWv6;


# direct methods
.method public constructor <init>(LWv6;)V
    .locals 0

    iput-object p1, p0, LWv6$i;->g:LWv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/Earth;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/ar/core/Earth;->getCameraGeospatialPose()Lcom/google/ar/core/GeospatialPose;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ar/core/GeospatialPose;->getHorizontalAccuracy()D

    move-result-wide v0

    iget-object v2, p0, LWv6$i;->g:LWv6;

    invoke-static {v2}, LWv6;->access$getBestAccuracyMeters$p(LWv6;)D

    move-result-wide v2

    cmpg-double v2, v0, v2

    if-gez v2, :cond_0

    iget-object v2, p0, LWv6$i;->g:LWv6;

    invoke-static {v2, v0, v1}, LWv6;->access$setBestAccuracyMeters$p(LWv6;D)V

    :cond_0
    iget-object v2, p0, LWv6$i;->g:LWv6;

    invoke-static {v2, v0, v1}, LWv6;->access$meetsAccuracy(LWv6;D)Lkotlin/Pair;

    move-result-object v0

    iget-object v1, p0, LWv6$i;->g:LWv6;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-static {v1, v2}, LWv6;->access$setRequiredAccuracy$p(LWv6;Ljava/lang/Double;)V

    iget-object v1, p0, LWv6$i;->g:LWv6;

    invoke-virtual {p1}, Lcom/google/ar/core/Earth;->getCameraGeospatialPose()Lcom/google/ar/core/GeospatialPose;

    move-result-object p1

    invoke-static {v1, p1}, LWv6;->access$setCurrentCameraGeospatialPose$p(LWv6;Lcom/google/ar/core/GeospatialPose;)V

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/Earth;

    invoke-virtual {p0, p1}, LWv6$i;->a(Lcom/google/ar/core/Earth;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
