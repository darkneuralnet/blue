.class public final LoK4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnK4;


# instance fields
.field public final a:LpK4;


# direct methods
.method public constructor <init>(LpK4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoK4;->a:LpK4;

    return-void
.end method

.method public static b(LpK4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LpK4;",
            ")",
            "LY94<",
            "LnK4;",
            ">;"
        }
    .end annotation

    new-instance v0, LoK4;

    invoke-direct {v0, p0}, LoK4;-><init>(LpK4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LsJ4;LqK4;Lcom/uber/autodispose/ScopeProvider;)LiK4;
    .locals 1

    iget-object v0, p0, LoK4;->a:LpK4;

    invoke-virtual {v0, p1, p2, p3}, LpK4;->b(LsJ4;LqK4;Lcom/uber/autodispose/ScopeProvider;)LiK4;

    move-result-object p1

    return-object p1
.end method
