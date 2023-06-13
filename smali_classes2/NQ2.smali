.class public final LNQ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMQ2;


# instance fields
.field public final a:LOQ2;


# direct methods
.method public constructor <init>(LOQ2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNQ2;->a:LOQ2;

    return-void
.end method

.method public static b(LOQ2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOQ2;",
            ")",
            "LY94<",
            "LMQ2;",
            ">;"
        }
    .end annotation

    new-instance v0, LNQ2;

    invoke-direct {v0, p0}, LNQ2;-><init>(LOQ2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LPQ2;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;)LLQ2;
    .locals 1

    iget-object v0, p0, LNQ2;->a:LOQ2;

    invoke-virtual {v0, p1, p2, p3, p4}, LOQ2;->b(LPQ2;Lcom/uber/autodispose/ScopeProvider;Le13;LTq4;)LLQ2;

    move-result-object p1

    return-object p1
.end method
