.class public final LpF5$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpF5;->d(Ljava/lang/String;)Lio/reactivex/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LvE5;",
        "LvE5;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LvE5;",
        "t1",
        "t2",
        "",
        "a",
        "(LvE5;LvE5;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LpF5$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LpF5$h;

    invoke-direct {v0}, LpF5$h;-><init>()V

    sput-object v0, LpF5$h;->g:LpF5$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LvE5;LvE5;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "t1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LvE5;->b()LwE5;

    move-result-object v0

    invoke-virtual {p2}, LvE5;->b()LwE5;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LvE5;->e()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p2}, LvE5;->e()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Lorg/joda/time/Seconds;->seconds(I)Lorg/joda/time/Seconds;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/joda/time/base/BaseSingleFieldPeriod;->compareTo(Lorg/joda/time/base/BaseSingleFieldPeriod;)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LvE5;

    check-cast p2, LvE5;

    invoke-virtual {p0, p1, p2}, LpF5$h;->a(LvE5;LvE5;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
