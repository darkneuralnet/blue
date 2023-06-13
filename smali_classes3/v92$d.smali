.class public final Lv92$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv92;->A(Lco/bird/android/model/constant/HealthStatus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/InventoryStatusResponse;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/api/response/WireInventory;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/api/response/InventoryStatusResponse;",
        "it",
        "",
        "Lco/bird/api/response/WireInventory;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/InventoryStatusResponse;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/HealthStatus;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/HealthStatus;)V
    .locals 0

    iput-object p1, p0, Lv92$d;->g:Lco/bird/android/model/constant/HealthStatus;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/InventoryStatusResponse;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/InventoryStatusResponse;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/api/response/WireInventory;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv92$d;->g:Lco/bird/android/model/constant/HealthStatus;

    invoke-static {v0, p1}, LrI1;->a(Lco/bird/android/model/constant/HealthStatus;Lco/bird/api/response/InventoryStatusResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/InventoryStatusResponse;

    invoke-virtual {p0, p1}, Lv92$d;->a(Lco/bird/api/response/InventoryStatusResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
