.class public final LKw6$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKw6;->r(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LKw6;


# direct methods
.method public constructor <init>(LKw6;)V
    .locals 0

    iput-object p1, p0, LKw6$m;->g:LKw6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LKw6$m;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LKw6$m;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/u;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "bird"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LKw6$m;->g:LKw6;

    invoke-static {v1}, LKw6;->access$getBluetoothManager$p(LKw6;)LpJ;

    move-result-object v2

    const/4 v4, 0x0

    new-instance v1, LKY;

    const/4 v6, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget-object v5, v0, LKw6$m;->g:LKw6;

    invoke-static {v5}, LKw6;->access$getSessionId$p(LKw6;)Ljava/lang/String;

    move-result-object v11

    iget-object v5, v0, LKw6$m;->g:LKw6;

    invoke-static {v5}, LKw6;->access$getBulkAttemptId$p(LKw6;)Ljava/lang/String;

    move-result-object v12

    sget-object v5, LbH;->c:LbH;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    iget-object v5, v0, LKw6$m;->g:LKw6;

    invoke-virtual {v5}, LKw6;->q()Lio/reactivex/subjects/a;

    move-result-object v5

    invoke-virtual {v5}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Ljava/lang/Integer;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x61d

    const/16 v18, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v18}, LKY;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x28

    invoke-static/range {v2 .. v10}, LpJ$a;->enableDeepSleep$default(LpJ;Lco/bird/android/model/wire/WireBird;ZLKY;LbE5;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LKw6$m$a;

    iget-object v3, v0, LKw6$m;->g:LKw6;

    invoke-direct {v2, v3}, LKw6$m$a;-><init>(LKw6;)V

    new-instance v3, LNw6;

    invoke-direct {v3, v2}, LNw6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LKw6$m$b;

    iget-object v3, v0, LKw6$m;->g:LKw6;

    invoke-direct {v2, v3}, LKw6$m$b;-><init>(LKw6;)V

    new-instance v3, LOw6;

    invoke-direct {v3, v2}, LOw6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object v1

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/p;->L(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LKw6$m;->c(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
