.class public final Lp13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo13;


# instance fields
.field public final a:Lq13;


# direct methods
.method public constructor <init>(Lq13;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp13;->a:Lq13;

    return-void
.end method

.method public static b(Lq13;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq13;",
            ")",
            "LY94<",
            "Lo13;",
            ">;"
        }
    .end annotation

    new-instance v0, Lp13;

    invoke-direct {v0, p0}, Lp13;-><init>(Lq13;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lr13;Lcom/uber/autodispose/ScopeProvider;Lma4;)Ln13;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr13;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lma4<",
            "LH2;",
            ">;)",
            "Ln13;"
        }
    .end annotation

    iget-object v0, p0, Lp13;->a:Lq13;

    invoke-virtual {v0, p1, p2, p3}, Lq13;->b(Lr13;Lcom/uber/autodispose/ScopeProvider;Lma4;)Ln13;

    move-result-object p1

    return-object p1
.end method
