.class public final LLU5$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLU5;->O(LNU5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;+",
        "Ljava/lang/Integer;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/NestSuggestionResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\t\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0008*\u0004\u0018\u00010\u00070\u0007 \u0008*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0008*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u000626\u0010\u0005\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "LRe4;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Lco/bird/android/buava/Optional;",
        "",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/api/response/NestSuggestionResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LRe4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLU5;


# direct methods
.method public constructor <init>(LLU5;)V
    .locals 0

    iput-object p1, p0, LLU5$o;->g:LLU5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)Lio/reactivex/K;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/NestSuggestionResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    iget-object v4, p0, LLU5$o;->g:LLU5;

    invoke-static {v4}, LLU5;->access$getNestManager$p(LLU5;)Ls43;

    move-result-object v5

    iget-wide v6, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v8, v0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    const-string v0, "capacity"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v13, p1

    check-cast v13, Ljava/lang/String;

    invoke-interface/range {v5 .. v13}, Ls43;->c(DDLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {v4, p1}, LLU5;->access$progress(LLU5;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LLU5$o;->a(LRe4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
