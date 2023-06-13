.class public final LTH$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTH;->b(Ljava/lang/String;Z)Lio/reactivex/c;
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LTH;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(LTH;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, LTH$c;->g:LTH;

    iput-boolean p2, p0, LTH$c;->h:Z

    iput-object p3, p0, LTH$c;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;
    .locals 4

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LTH$c;->g:LTH;

    invoke-static {v0}, LTH;->access$getForceBluetooth(LTH;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LTH$c;->g:LTH;

    iget-boolean v1, p0, LTH$c;->h:Z

    invoke-static {v0, p1, v1}, LTH;->access$lightsBluetooth(LTH;Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LTH$c;->g:LTH;

    iget-object v1, p0, LTH$c;->i:Ljava/lang/String;

    iget-boolean v2, p0, LTH$c;->h:Z

    invoke-static {v0, v1, v2}, LTH;->access$lightsPowerline(LTH;Ljava/lang/String;Z)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v1

    const-string v2, "lightsPowerline(birdId, on).ignoreElement()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LTH$c;->g:LTH;

    iget-boolean v3, p0, LTH$c;->h:Z

    invoke-static {v2, p1, v3}, LTH;->access$lightsBluetooth(LTH;Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/c;

    move-result-object p1

    const-string v2, "lightsBluetooth(bird = bird, on = on)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, LTH;->z0(Lio/reactivex/c;Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LTH$c;->a(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
