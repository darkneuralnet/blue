.class public final LGL5$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGL5;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
.field public final synthetic g:LGL5;


# direct methods
.method public constructor <init>(LGL5;)V
    .locals 0

    iput-object p1, p0, LGL5$e;->g:LGL5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LGL5$e;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 12

    const/4 p1, 0x2

    new-array v0, p1, [Lgx2;

    sget-object v1, Lgx2;->q:Lgx2;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lgx2;->r:Lgx2;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-array p1, p1, [Lgx2;

    sget-object v1, Lgx2;->s:Lgx2;

    aput-object v1, p1, v2

    sget-object v1, Lgx2;->t:Lgx2;

    aput-object v1, p1, v3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, LGL5$e;->g:LGL5;

    invoke-static {v1}, LGL5;->access$getLockState$p(LGL5;)Lgx2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "physicalLock"

    if-eqz v0, :cond_2

    iget-object v0, p0, LGL5$e;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getPhysicalLock$p(LGL5;)Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LGL5$e;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getTaskId$p(LGL5;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object p1, p0, LGL5$e;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getNavigator$p(LGL5;)Le13;

    move-result-object p1

    iget-object v0, p0, LGL5$e;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getPhysicalLock$p(LGL5;)Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WirePhysicalLock;->getBirdId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, LGL5$e;->g:LGL5;

    invoke-static {v1}, LGL5;->access$getTaskId$p(LGL5;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, LGL5$e;->g:LGL5;

    invoke-static {v2}, LGL5;->access$getUnlocking$p(LGL5;)Z

    move-result v2

    iget-object v3, p0, LGL5$e;->g:LGL5;

    invoke-static {v3}, LGL5;->access$getMapMode(LGL5;)Lco/bird/android/model/constant/MapMode;

    move-result-object v3

    invoke-interface {p1, v0, v1, v2, v3}, Le13;->B3(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/MapMode;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, LGL5$e;->g:LGL5;

    invoke-static {v0}, LGL5;->access$getLockState$p(LGL5;)Lgx2;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LGL5$e;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getRequestCode$p(LGL5;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, LGL5;->access$finish(LGL5;Ljava/lang/Integer;)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, LGL5$e;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getLockState$p(LGL5;)Lgx2;

    move-result-object p1

    sget-object v0, Lgx2;->p:Lgx2;

    if-ne p1, v0, :cond_5

    iget-object p1, p0, LGL5$e;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getNavigator$p(LGL5;)Le13;

    move-result-object v3

    iget-object p1, p0, LGL5$e;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getPhysicalLock$p(LGL5;)Lco/bird/android/model/wire/WirePhysicalLock;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    goto :goto_1

    :cond_4
    move-object v4, p1

    :goto_1
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x3c

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Le13$a;->goToPhysicalLockIfEnabled$default(Le13;Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Object;)Z

    goto :goto_2

    :cond_5
    iget-object p1, p0, LGL5$e;->g:LGL5;

    invoke-static {p1}, LGL5;->access$getNavigator$p(LGL5;)Le13;

    move-result-object p1

    const-wide v0, 0x53d3800604L

    invoke-interface {p1, v0, v1}, Le13;->w3(J)V

    :goto_2
    return-void
.end method
