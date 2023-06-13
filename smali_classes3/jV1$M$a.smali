.class public final LjV1$M$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1$M;->a(Lco/bird/android/model/identification/IdentificationIngestionResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/identification/IdentificationDebugResponse;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/identification/IdentificationDebugResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/identification/IdentificationDebugResponse;",
        "response",
        "a",
        "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/identification/IdentificationIngestionResult;


# direct methods
.method public constructor <init>(Lco/bird/android/model/identification/IdentificationIngestionResult;)V
    .locals 0

    iput-object p1, p0, LjV1$M$a;->g:Lco/bird/android/model/identification/IdentificationIngestionResult;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/identification/IdentificationDebugResponse;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/identification/IdentificationDebugResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/identification/IdentificationDebugResponse;

    if-nez p1, :cond_0

    invoke-static {}, LjV1;->access$getDEFAULT_DEBUG_RESPONSE$cp()Lco/bird/android/model/identification/IdentificationDebugResponse;

    move-result-object p1

    :cond_0
    move-object v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    iget-object v6, p0, LjV1$M$a;->g:Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string p1, "it"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/16 v8, 0x17

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Lco/bird/android/model/identification/IdentificationDebugResponse;->copy$default(Lco/bird/android/model/identification/IdentificationDebugResponse;IIDLco/bird/android/model/identification/IdentificationIngestionResult;IILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDebugResponse;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LjV1$M$a;->a(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
