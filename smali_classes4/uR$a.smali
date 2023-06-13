.class public final LuR$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuR;->v1()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/BirdPlusViewResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/BirdPlusViewResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LuR;


# direct methods
.method public constructor <init>(LuR;)V
    .locals 0

    iput-object p1, p0, LuR$a;->g:LuR;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LuR;Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LuR$a;->c(LuR;Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LuR;Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LuR;->access$getBirdPlusViewDao$p(LuR;)LlR;

    move-result-object p0

    invoke-static {p1}, LjR;->j(Lco/bird/api/response/BirdPlusViewResponse;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LlR;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;
    .locals 3

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LuR$a;->g:LuR;

    invoke-static {v0}, LuR;->access$getBirdPlusViewDao$p(LuR;)LlR;

    move-result-object v0

    invoke-virtual {v0}, LlR;->b()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LuR$a;->g:LuR;

    new-instance v2, LtR;

    invoke-direct {v2, v1, p1}, LtR;-><init>(LuR;Lco/bird/api/response/BirdPlusViewResponse;)V

    invoke-static {v2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/BirdPlusViewResponse;

    invoke-virtual {p0, p1}, LuR$a;->b(Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
