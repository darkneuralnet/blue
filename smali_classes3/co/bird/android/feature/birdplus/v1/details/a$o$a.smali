.class public final Lco/bird/android/feature/birdplus/v1/details/a$o$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a$o;->a(Lio/reactivex/disposables/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LtQ;",
        "LtQ;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LtQ;",
        "prev",
        "a",
        "(LtQ;)LtQ;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/birdplus/v1/details/a$o$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/birdplus/v1/details/a$o$a;

    invoke-direct {v0}, Lco/bird/android/feature/birdplus/v1/details/a$o$a;-><init>()V

    sput-object v0, Lco/bird/android/feature/birdplus/v1/details/a$o$a;->g:Lco/bird/android/feature/birdplus/v1/details/a$o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LtQ;)LtQ;
    .locals 14

    const-string v0, "prev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/16 v12, 0x27d

    const/4 v13, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v13}, LtQ;->copy$default(LtQ;Lco/bird/android/model/persistence/BirdPlusView;ZZZZZZZZLjava/lang/Throwable;ILjava/lang/Object;)LtQ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LtQ;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$o$a;->a(LtQ;)LtQ;

    move-result-object p1

    return-object p1
.end method
