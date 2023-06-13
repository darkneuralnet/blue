.class public final Lvm3$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvm3;->W0(LYG;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "Lco/bird/api/request/TaskIdBody;",
        "+",
        "Lio/reactivex/Observable<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/Observable<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\'\u0010\u0007\u001a#\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00000\u00060\u00022\u0006\u0010\t\u001a\u00020\u0008H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lkotlin/Function1;",
        "Lco/bird/api/request/TaskIdBody;",
        "Lkotlin/ParameterName;",
        "name",
        "Lio/reactivex/Observable;",
        "f",
        "",
        "cancelTask",
        "a",
        "(Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;Z)Lio/reactivex/Observable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lvm3$l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvm3$l;

    invoke-direct {v0}, Lvm3$l;-><init>()V

    sput-object v0, Lvm3$l;->g:Lvm3$l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/api/request/TaskIdBody;",
            "+",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;Z)",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "f"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getTaskId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bird has no task"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "{\n        Observable.err\u2026rd has no task\"))\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lco/bird/api/request/TaskIdBody;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {v0, p1, p3}, Lco/bird/api/request/TaskIdBody;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/Observable;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lvm3$l;->a(Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function1;Z)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
