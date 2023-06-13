.class public final LNz0$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNz0;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireContainerOrder;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireContainerOrder;",
        "kotlin.jvm.PlatformType",
        "containerOrder",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireContainerOrder;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LNz0;


# direct methods
.method public constructor <init>(LNz0;)V
    .locals 0

    iput-object p1, p0, LNz0$e;->g:LNz0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireContainerOrder;)V
    .locals 6

    iget-object v0, p0, LNz0$e;->g:LNz0;

    invoke-static {v0}, LNz0;->access$getTransferOrderManager$p(LNz0;)LO86;

    move-result-object v0

    const-string v1, "containerOrder"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LO86;->s(Lco/bird/android/model/wire/WireContainerOrder;)Z

    move-result v0

    iget-object v1, p0, LNz0$e;->g:LNz0;

    invoke-static {v1}, LNz0;->access$getUi$p(LNz0;)LPz0;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireContainerOrder;->getStatus()Lco/bird/android/model/constant/ContainerOrderStatus;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/ContainerOrderStatus;->IN_TRANSIT:Lco/bird/android/model/constant/ContainerOrderStatus;

    if-ne v4, v5, :cond_1

    :cond_0
    if-nez v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireContainerOrder;->getStatus()Lco/bird/android/model/constant/ContainerOrderStatus;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/ContainerOrderStatus;->RECEIVED:Lco/bird/android/model/constant/ContainerOrderStatus;

    if-eq v4, v5, :cond_2

    :cond_1
    move v4, v2

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_0
    if-eqz v0, :cond_4

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireContainerOrder;->getStatus()Lco/bird/android/model/constant/ContainerOrderStatus;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/ContainerOrderStatus;->READY_FOR_PICKUP:Lco/bird/android/model/constant/ContainerOrderStatus;

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :cond_4
    :goto_1
    invoke-virtual {v1, v4, v2}, LPz0;->Ql(ZZ)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireContainerOrder;

    invoke-virtual {p0, p1}, LNz0$e;->a(Lco/bird/android/model/wire/WireContainerOrder;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
