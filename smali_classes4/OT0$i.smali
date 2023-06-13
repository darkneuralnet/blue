.class public final LOT0$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOT0;->g(Lco/bird/android/model/Deal;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Deal;",
        ">;>;",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Deal;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/Deal;",
        "dealMap",
        "a",
        "(Ljava/util/Map;)Ljava/util/Map;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Deal;

.field public final synthetic h:LOT0;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Deal;LOT0;)V
    .locals 0

    iput-object p1, p0, LOT0$i;->g:Lco/bird/android/model/Deal;

    iput-object p2, p0, LOT0$i;->h:LOT0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ljava/util/Map;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Deal;",
            ">;>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Deal;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "dealMap"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LOT0$i;->g:Lco/bird/android/model/Deal;

    invoke-virtual {v2}, Lco/bird/android/model/Deal;->getShownAt()Lorg/joda/time/DateTime;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, v0, LOT0$i;->g:Lco/bird/android/model/Deal;

    invoke-virtual {v2}, Lco/bird/android/model/Deal;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v3, v0, LOT0$i;->g:Lco/bird/android/model/Deal;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v16

    const/16 v17, 0xfff

    const/16 v18, 0x0

    invoke-static/range {v3 .. v18}, Lco/bird/android/model/Deal;->copy$default(Lco/bird/android/model/Deal;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/android/model/Deal;

    move-result-object v2

    iget-object v3, v0, LOT0$i;->g:Lco/bird/android/model/Deal;

    invoke-virtual {v3}, Lco/bird/android/model/Deal;->getId()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v4, v2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v5

    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v0, LOT0$i;->h:LOT0;

    invoke-static {v3}, LOT0;->access$getPreference$p(LOT0;)Lgl;

    move-result-object v3

    invoke-virtual {v3, v2}, Lgl;->B1(Lco/bird/android/model/Deal;)V

    iget-object v3, v0, LOT0$i;->h:LOT0;

    invoke-static {v3}, LOT0;->access$getMutableDeal$p(LOT0;)La94;

    move-result-object v3

    invoke-virtual {v3}, La94;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v0, LOT0$i;->h:LOT0;

    invoke-static {v3}, LOT0;->access$getMutableDeal$p(LOT0;)La94;

    move-result-object v3

    invoke-virtual {v3}, La94;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/Deal;

    invoke-virtual {v3}, Lco/bird/android/model/Deal;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, LOT0$i;->g:Lco/bird/android/model/Deal;

    invoke-virtual {v5}, Lco/bird/android/model/Deal;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v0, LOT0$i;->h:LOT0;

    invoke-static {v3}, LOT0;->access$getMutableDeal$p(LOT0;)La94;

    move-result-object v3

    invoke-virtual {v4, v2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v3, v2}, La94;->accept(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LOT0$i;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
