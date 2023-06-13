.class public final LWa5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa5;


# instance fields
.field public final a:LXa5;


# direct methods
.method public constructor <init>(LXa5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWa5;->a:LXa5;

    return-void
.end method

.method public static b(LXa5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXa5;",
            ")",
            "LY94<",
            "LVa5;",
            ">;"
        }
    .end annotation

    new-instance v0, LWa5;

    invoke-direct {v0, p0}, LWa5;-><init>(LXa5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LZa5;LDU2;)LUa5;
    .locals 1

    iget-object v0, p0, LWa5;->a:LXa5;

    invoke-virtual {v0, p1, p2, p3}, LXa5;->b(Lcom/uber/autodispose/ScopeProvider;LZa5;LDU2;)LUa5;

    move-result-object p1

    return-object p1
.end method
