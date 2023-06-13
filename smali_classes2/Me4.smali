.class public final LMe4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe4;


# instance fields
.field public final a:LNe4;


# direct methods
.method public constructor <init>(LNe4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMe4;->a:LNe4;

    return-void
.end method

.method public static b(LNe4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNe4;",
            ")",
            "LY94<",
            "LLe4;",
            ">;"
        }
    .end annotation

    new-instance v0, LMe4;

    invoke-direct {v0, p0}, LMe4;-><init>(LNe4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LsJ4;Lve4;Lcom/uber/autodispose/ScopeProvider;)LHe4;
    .locals 1

    iget-object v0, p0, LMe4;->a:LNe4;

    invoke-virtual {v0, p1, p2, p3}, LNe4;->b(LsJ4;Lve4;Lcom/uber/autodispose/ScopeProvider;)LHe4;

    move-result-object p1

    return-object p1
.end method
