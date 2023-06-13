.class public final LRK1$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->g0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LvE5;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LvE5;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LvE5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LRK1;


# direct methods
.method public constructor <init>(LRK1;)V
    .locals 0

    iput-object p1, p0, LRK1$u;->g:LRK1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LvE5;)V
    .locals 3

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    const-string v1, "received smartlock unlock event, marking as lease start complete"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LRK1$u;->g:LRK1;

    invoke-static {v0}, LRK1;->access$getBird$p(LRK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LRK1$u;->g:LRK1;

    invoke-static {v0}, LRK1;->access$getBird$p(LRK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    const-string v2, "started"

    invoke-static {v0, v1, v2}, LRK1;->access$trackResolution(LRK1;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V

    invoke-static {v0}, LRK1;->access$getItemLeaseManager$p(LRK1;)LMc2;

    move-result-object v1

    invoke-static {v0}, LRK1;->access$getBird$p(LRK1;)Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->HELMET:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-interface {v1, v0, v2}, LMc2;->q(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/enum/ItemLeaseType;)V

    :cond_0
    const-string v0, "Active lease for bird detected in new flow, closing app"

    new-array v1, p1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LRK1$u;->g:LRK1;

    invoke-static {v0}, LRK1;->access$getNavigator$p(LRK1;)Le13;

    move-result-object v0

    sget-object v1, Le13$b;->c:Le13$b;

    new-array p1, p1, [Lkotlin/Pair;

    invoke-interface {v0, v1, p1}, Le13;->W0(Le13$b;[Lkotlin/Pair;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LvE5;

    invoke-virtual {p0, p1}, LRK1$u;->a(LvE5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
