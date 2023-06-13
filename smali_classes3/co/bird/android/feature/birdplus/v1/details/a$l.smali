.class public final Lco/bird/android/feature/birdplus/v1/details/a$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a;->D(Lco/bird/android/feature/birdplus/v1/details/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "zendeskArticleId",
        "",
        "invoke"
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
.field public final synthetic g:Lco/bird/android/feature/birdplus/v1/details/a;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$l;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$l;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$l;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getNavigator$p(Lco/bird/android/feature/birdplus/v1/details/a;)Le13;

    move-result-object v0

    if-eqz p1, :cond_0

    :goto_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$l;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getReactiveConfig$p(Lco/bird/android/feature/birdplus/v1/details/a;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getBirdPlus()Lco/bird/android/model/wire/configs/BirdPlusConfig;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/BirdPlusConfig;->getZendeskArticleId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_1
    invoke-interface {v0, v1, v2}, Le13;->w3(J)V

    return-void
.end method
