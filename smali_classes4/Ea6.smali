.class public interface abstract LEa6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEa6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J&\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\'\u00a8\u0006\t"
    }
    d2 = {
        "LEa6;",
        "",
        "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
        "context",
        "",
        "birdId",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireTutorialResponse;",
        "a",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Lco/bird/android/model/constant/ConfigurableTutorialContext;
        .annotation runtime LXc4;
            value = "context"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "bird_id"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "v1/tutorial/active"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireTutorialResponse;",
            ">;"
        }
    .end annotation
.end method
