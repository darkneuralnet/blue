.class public final LpG6$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpG6;->h(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/android/model/WorkOrder;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/WorkOrder;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/WorkOrder;",
        "response",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LpG6$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LpG6$e;

    invoke-direct {v0}, LpG6$e;-><init>()V

    sput-object v0, LpG6$e;->g:LpG6$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lco/bird/android/buava/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/WorkOrder;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/WorkOrder;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/WorkOrder;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Lco/bird/api/exception/HttpException;

    invoke-direct {v0, p1}, Lco/bird/api/exception/HttpException;-><init>(LHM4;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LpG6$e;->a(LHM4;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
