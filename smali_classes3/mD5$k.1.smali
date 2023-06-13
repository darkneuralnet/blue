.class public final LmD5$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmD5;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuScannedItems;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireSkuScannedItems;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LmD5;


# direct methods
.method public constructor <init>(LmD5;)V
    .locals 0

    iput-object p1, p0, LmD5$k;->g:LmD5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuScannedItems;)V
    .locals 3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuScannedItems;->getSuccessfulScannedItems()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LmD5$k;->g:LmD5;

    invoke-static {v1}, LmD5;->access$getSkuModel$p(LmD5;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lco/bird/android/model/wire/WireSkuScannedItemsKt;->filteredItems(Ljava/util/List;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LmD5$k;->g:LmD5;

    invoke-static {v0}, LmD5;->access$getItemsScannedSubject$p(LmD5;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LmD5$k;->g:LmD5;

    invoke-static {p1}, LmD5;->access$getNavigator$p(LmD5;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuScannedItems;

    invoke-virtual {p0, p1}, LmD5$k;->a(Lco/bird/android/model/wire/WireSkuScannedItems;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
