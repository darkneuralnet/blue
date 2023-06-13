.class public final LiP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhP;


# instance fields
.field public final a:LjP;


# direct methods
.method public constructor <init>(LjP;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiP;->a:LjP;

    return-void
.end method

.method public static b(LjP;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LjP;",
            ")",
            "LY94<",
            "LhP;",
            ">;"
        }
    .end annotation

    new-instance v0, LiP;

    invoke-direct {v0, p0}, LiP;-><init>(LjP;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)LfP;
    .locals 1

    iget-object v0, p0, LiP;->a:LjP;

    invoke-virtual {v0, p1, p2, p3}, LjP;->b(LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)LfP;

    move-result-object p1

    return-object p1
.end method
