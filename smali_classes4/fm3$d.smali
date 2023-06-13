.class public final Lfm3$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm3;->h(Ljava/util/List;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/api/response/AdjustInventoryCountResponse;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "warehouseId",
        "Lio/reactivex/K;",
        "",
        "Lco/bird/api/response/AdjustInventoryCountResponse;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/String;)Lio/reactivex/K;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lfm3;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/request/AdjustInventoryCountRequest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfm3;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfm3;",
            "Ljava/util/List<",
            "Lco/bird/api/request/AdjustInventoryCountRequest;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfm3$d;->g:Lfm3;

    iput-object p2, p0, Lfm3$d;->h:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/api/response/AdjustInventoryCountResponse;",
            ">;>;"
        }
    .end annotation

    const-string v0, "warehouseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfm3$d;->g:Lfm3;

    invoke-static {v0}, Lfm3;->access$getClient$p(Lfm3;)LWl3;

    move-result-object v0

    iget-object v1, p0, Lfm3$d;->h:Ljava/util/List;

    invoke-interface {v0, v1, p1}, LWl3;->e(Ljava/util/List;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lfm3$d;->invoke(Ljava/lang/String;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
