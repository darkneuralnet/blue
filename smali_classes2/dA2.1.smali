.class public final LdA2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcA2;


# instance fields
.field public final a:LeA2;


# direct methods
.method public constructor <init>(LeA2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdA2;->a:LeA2;

    return-void
.end method

.method public static b(LeA2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LeA2;",
            ")",
            "LY94<",
            "LcA2;",
            ">;"
        }
    .end annotation

    new-instance v0, LdA2;

    invoke-direct {v0, p0}, LdA2;-><init>(LeA2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;LfA2;Le13;)LbA2;
    .locals 1

    iget-object v0, p0, LdA2;->a:LeA2;

    invoke-virtual {v0, p1, p2, p3, p4}, LeA2;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;LfA2;Le13;)LbA2;

    move-result-object p1

    return-object p1
.end method
