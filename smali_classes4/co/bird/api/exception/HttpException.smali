.class public final Lco/bird/api/exception/HttpException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u0008\u001a\u0006\u0012\u0002\u0008\u00030\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/api/exception/HttpException;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "LHM4;",
        "b",
        "LHM4;",
        "getResponse",
        "()LHM4;",
        "response",
        "Ltg1;",
        "c",
        "Ltg1;",
        "errorResponse",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "",
        "a",
        "()I",
        "code",
        "<init>",
        "(LHM4;)V",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LHM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHM4<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ltg1;


# direct methods
.method public constructor <init>(LHM4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    iput-object p1, p0, Lco/bird/api/exception/HttpException;->b:LHM4;

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object p1

    iput-object p1, p0, Lco/bird/api/exception/HttpException;->c:Ltg1;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lco/bird/api/exception/HttpException;->c:Ltg1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltg1;->b()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/api/exception/HttpException;->b:LHM4;

    invoke-virtual {v0}, LHM4;->b()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/exception/HttpException;->c:Ltg1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltg1;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
