.class public final LJF3$E;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;->F0(Lf13;Lco/bird/android/model/wire/WireBird;ZLjava/lang/Integer;ZZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Le13;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Le13;",
        "navigator",
        "",
        "a",
        "(Le13;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Integer;

.field public final synthetic j:Z

.field public final synthetic k:LJF3;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;ZLjava/lang/Integer;ZLJF3;)V
    .locals 0

    iput-object p1, p0, LJF3$E;->g:Lco/bird/android/model/wire/WireBird;

    iput-boolean p2, p0, LJF3$E;->h:Z

    iput-object p3, p0, LJF3$E;->i:Ljava/lang/Integer;

    iput-boolean p4, p0, LJF3$E;->j:Z

    iput-object p5, p0, LJF3$E;->k:LJF3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le13;)Ljava/lang/Boolean;
    .locals 11

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJF3$E;->g:Lco/bird/android/model/wire/WireBird;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WirePhysicalLock;

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    iget-boolean v4, p0, LJF3$E;->h:Z

    iget-object v5, p0, LJF3$E;->i:Ljava/lang/Integer;

    const/4 v6, 0x0

    iget-boolean v7, p0, LJF3$E;->j:Z

    iget-object v0, p0, LJF3$E;->g:Lco/bird/android/model/wire/WireBird;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    move-object v8, v1

    const/16 v9, 0x8

    const/4 v10, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v10}, Le13$a;->goToPhysicalLockIfEnabled$default(Le13;Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v0, p0, LJF3$E;->k:LJF3;

    iget-boolean v1, p0, LJF3$E;->h:Z

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, LJF3;->Y()Lio/reactivex/subjects/a;

    move-result-object v0

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le13;

    invoke-virtual {p0, p1}, LJF3$E;->a(Le13;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
