.class public final LQP3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPP3;


# instance fields
.field public final a:LRP3;


# direct methods
.method public constructor <init>(LRP3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQP3;->a:LRP3;

    return-void
.end method

.method public static b(LRP3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRP3;",
            ")",
            "LY94<",
            "LPP3;",
            ">;"
        }
    .end annotation

    new-instance v0, LQP3;

    invoke-direct {v0, p0}, LQP3;-><init>(LRP3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LSP3;Lcom/uber/autodispose/ScopeProvider;Le13;)LOP3;
    .locals 1

    iget-object v0, p0, LQP3;->a:LRP3;

    invoke-virtual {v0, p1, p2, p3}, LRP3;->b(LSP3;Lcom/uber/autodispose/ScopeProvider;Le13;)LOP3;

    move-result-object p1

    return-object p1
.end method
