.class public final LKU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJU4;


# instance fields
.field public final a:LLU4;


# direct methods
.method public constructor <init>(LLU4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKU4;->a:LLU4;

    return-void
.end method

.method public static b(LLU4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLU4;",
            ")",
            "LY94<",
            "LJU4;",
            ">;"
        }
    .end annotation

    new-instance v0, LKU4;

    invoke-direct {v0, p0}, LKU4;-><init>(LLU4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LMU4;Le13;Lcom/uber/autodispose/ScopeProvider;)LIU4;
    .locals 1

    iget-object v0, p0, LKU4;->a:LLU4;

    invoke-virtual {v0, p1, p2, p3}, LLU4;->b(LMU4;Le13;Lcom/uber/autodispose/ScopeProvider;)LIU4;

    move-result-object p1

    return-object p1
.end method
