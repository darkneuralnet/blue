.class public final LtC3$v0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;",
        "Lco/bird/android/model/persistence/Bird;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "privateBirds",
        "a",
        "(Ljava/util/List;)Lco/bird/android/model/persistence/Bird;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOwnedBirdDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsPresenterImpl$onResume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,697:1\n288#2,2:698\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdDetailsPresenterImpl$onResume$1\n*L\n593#1:698,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LtC3;


# direct methods
.method public constructor <init>(LtC3;)V
    .locals 0

    iput-object p1, p0, LtC3$v0;->g:LtC3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lco/bird/android/model/persistence/Bird;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;)",
            "Lco/bird/android/model/persistence/Bird;"
        }
    .end annotation

    const-string v0, "privateBirds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LtC3$v0;->g:LtC3;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LtC3;->K0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lco/bird/android/model/persistence/Bird;

    iget-object p1, p0, LtC3$v0;->g:LtC3;

    invoke-virtual {p1}, LtC3;->N0()Lg46$b;

    move-result-object p1

    iget-object v0, p0, LtC3$v0;->g:LtC3;

    invoke-virtual {v0}, LtC3;->K0()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onResume in owned birds called, checking to see if private bird with id: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is present: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v2}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LtC3$v0;->a(Ljava/util/List;)Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    return-object p1
.end method
