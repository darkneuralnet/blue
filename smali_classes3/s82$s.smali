.class public final Ls82$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls82;->O(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WarehouseInventory;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001ar\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003 \u0007*8\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/api/response/WarehouseInventory;",
        "warehouseInventory",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "",
        "",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/WarehouseInventory;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ls82;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Ls82;I)V
    .locals 0

    iput-object p1, p0, Ls82$s;->g:Ls82;

    iput p2, p0, Ls82$s;->h:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Ls82$s;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/WarehouseInventory;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/WarehouseInventory;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "LH6;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "warehouseInventory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls82$s;->g:Ls82;

    invoke-static {v0}, Ls82;->access$getStatusConverter$p(Ls82;)LD82;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/WarehouseInventory;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget v1, p0, Ls82$s;->h:I

    invoke-interface {v0, p1, v1}, LD82;->d(Ljava/lang/String;I)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Ls82$s$a;->g:Ls82$s$a;

    new-instance v1, Lw82;

    invoke-direct {v1, v0}, Lw82;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WarehouseInventory;

    invoke-virtual {p0, p1}, Ls82$s;->b(Lco/bird/api/response/WarehouseInventory;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method