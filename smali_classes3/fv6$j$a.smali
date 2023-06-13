.class public final Lfv6$j$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6$j;->c(Lco/bird/android/buava/Optional;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "invoke",
        "(Ljava/lang/Long;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lcom/google/ar/core/Anchor;


# direct methods
.method public constructor <init>(Lcom/google/ar/core/Anchor;)V
    .locals 0

    iput-object p1, p0, Lfv6$j$a;->g:Lcom/google/ar/core/Anchor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Long;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lfv6$j$a;->g:Lcom/google/ar/core/Anchor;

    invoke-virtual {p1}, Lcom/google/ar/core/Anchor;->getTerrainAnchorState()Lcom/google/ar/core/Anchor$TerrainAnchorState;

    move-result-object p1

    sget-object v0, Lcom/google/ar/core/Anchor$TerrainAnchorState;->SUCCESS:Lcom/google/ar/core/Anchor$TerrainAnchorState;

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lfv6$j$a;->g:Lcom/google/ar/core/Anchor;

    invoke-virtual {p1}, Lcom/google/ar/core/Anchor;->getTerrainAnchorState()Lcom/google/ar/core/Anchor$TerrainAnchorState;

    move-result-object p1

    sget-object v0, Lcom/google/ar/core/Anchor$TerrainAnchorState;->NONE:Lcom/google/ar/core/Anchor$TerrainAnchorState;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lfv6$j$a;->invoke(Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
