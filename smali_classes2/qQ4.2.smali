.class public final LqQ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LpQ4;


# instance fields
.field public final a:LrQ4;


# direct methods
.method public constructor <init>(LrQ4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqQ4;->a:LrQ4;

    return-void
.end method

.method public static b(LrQ4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrQ4;",
            ")",
            "LY94<",
            "LpQ4;",
            ">;"
        }
    .end annotation

    new-instance v0, LqQ4;

    invoke-direct {v0, p0}, LqQ4;-><init>(LrQ4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Le13;LsQ4;)LiQ4;
    .locals 1

    iget-object v0, p0, LqQ4;->a:LrQ4;

    invoke-virtual {v0, p1, p2, p3}, LrQ4;->b(Lcom/uber/autodispose/ScopeProvider;Le13;LsQ4;)LiQ4;

    move-result-object p1

    return-object p1
.end method
