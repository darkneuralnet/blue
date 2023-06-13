.class public final Lco/bird/android/feature/birdplus/v1/details/a$k$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a$k;->invoke(Lkotlin/Pair;)Lio/reactivex/B;
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
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "",
        "a",
        "(Lkotlin/Unit;)Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/BirdPlusView;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$k$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Unit;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$k$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getZendeskArticleId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$k$a;->g:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getZendeskArticleId()Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$k$a;->a(Lkotlin/Unit;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
