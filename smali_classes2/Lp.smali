.class public interface abstract LLp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLp$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\'J:\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u000b2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00082\u0014\u0008\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\rH\'J\u0018\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0011H\'J\u0018\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0013H\'\u00a8\u0006\u0015"
    }
    d2 = {
        "LLp;",
        "",
        "Luh1;",
        "request",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/android/model/TokenPair;",
        "b",
        "",
        "authorization",
        "a",
        "Lra1;",
        "location",
        "",
        "tags",
        "Lsa1;",
        "e",
        "LOh6;",
        "c",
        "LYy2;",
        "d",
        "auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LzH1;
            value = "Authorization"
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/auth/refresh/token"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/TokenPair;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Luh1;)Lio/reactivex/F;
    .param p1    # Luh1;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/auth/exchange/token"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luh1;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/TokenPair;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(LOh6;)Lio/reactivex/F;
    .param p1    # LOh6;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/auth/magic-link/use"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOh6;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/TokenPair;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(LYy2;)Lio/reactivex/F;
    .param p1    # LYy2;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/v1/auth/google"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYy2;",
            ")",
            "Lio/reactivex/F<",
            "Lsa1;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lra1;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/F;
    .param p1    # Lra1;
        .annotation runtime LPY;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LzH1;
            value = "Location"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime LwY5;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "api/v1/auth/email"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lra1;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/F<",
            "Lsa1;",
            ">;"
        }
    .end annotation
.end method
