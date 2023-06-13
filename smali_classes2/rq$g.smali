.class public final Lrq$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq;->z()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lrq$b;",
        "Lio/reactivex/K<",
        "+",
        "LNp;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lrq$b;",
        "authState",
        "Lio/reactivex/K;",
        "LNp;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lrq$b;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lrq;


# direct methods
.method public constructor <init>(Lrq;)V
    .locals 0

    iput-object p1, p0, Lrq$g;->g:Lrq;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lrq$b;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq$b;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LNp;",
            ">;"
        }
    .end annotation

    const-string v0, "authState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrq$g;->g:Lrq;

    invoke-static {v0, p1}, Lrq;->access$getCurrentAuthHeader(Lrq;Lrq$b;)Lrq$d;

    move-result-object p1

    iget-object v0, p0, Lrq$g;->g:Lrq;

    invoke-virtual {p1}, Lrq$d;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0, v1}, Lrq;->access$exchangeTokens(Lrq;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p1}, Lrq$d;->b()Lcom/auth0/android/jwt/JWT;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0, v1}, Lrq;->access$refreshAccessToken(Lrq;Lcom/auth0/android/jwt/JWT;)Lio/reactivex/F;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lrq$d;->a()LNp;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    const-string p1, "just(headerResult)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrq$b;

    invoke-virtual {p0, p1}, Lrq$g;->a(Lrq$b;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
