.class public final LOH4$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOH4;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/BirdProblem;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LHM4;",
        "",
        "Lco/bird/android/model/BirdProblem;",
        "kotlin.jvm.PlatformType",
        "damagesResponse",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOH4;


# direct methods
.method public constructor <init>(LOH4;)V
    .locals 0

    iput-object p1, p0, LOH4$b;->g:LOH4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdProblem;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    const-string v1, "bird"

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_5

    iget-object v0, p0, LOH4$b;->g:LOH4;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v0}, LOH4;->access$getNavigator$p(LOH4;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    invoke-static {v0}, LOH4;->access$getNavigator$p(LOH4;)Le13;

    move-result-object p1

    invoke-static {v0}, LOH4;->access$getBird$p(LOH4;)Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_0
    invoke-static {v0}, LOH4;->access$getLocation$p(LOH4;)Landroid/location/Location;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "location"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-static {v0}, LOH4;->access$getStartOver$p(LOH4;)Z

    move-result v0

    invoke-interface {p1, v3, v2, v0}, Le13;->j2(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;Z)V

    goto :goto_2

    :cond_2
    invoke-static {v0}, LOH4;->access$getUi$p(LOH4;)LSH4;

    move-result-object v1

    invoke-interface {v1}, LSH4;->Mi()V

    invoke-static {v0}, LOH4;->access$getUi$p(LOH4;)LSH4;

    move-result-object v0

    invoke-interface {v0, p1}, LSH4;->j4(Ljava/util/List;)V

    goto :goto_2

    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v3, p0, LOH4$b;->g:LOH4;

    invoke-static {v3}, LOH4;->access$getBird$p(LOH4;)Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p1}, LHM4;->e()Lokhttp3/ResponseBody;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "Error response when loading list of problems for Bird %s with error body %s"

    invoke-static {p1, v0}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LOH4$b;->g:LOH4;

    invoke-static {p1}, LOH4;->access$getUi$p(LOH4;)LSH4;

    move-result-object p1

    sget v0, Lnl4;->mechanic_reported_damages_failed_to_load_damages:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LOH4$b;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
