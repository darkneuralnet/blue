.class public final LCC2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBC2;


# instance fields
.field public final a:LDC2;


# direct methods
.method public constructor <init>(LDC2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCC2;->a:LDC2;

    return-void
.end method

.method public static b(LDC2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDC2;",
            ")",
            "LY94<",
            "LBC2;",
            ">;"
        }
    .end annotation

    new-instance v0, LCC2;

    invoke-direct {v0, p0}, LCC2;-><init>(LDC2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;LRg6;Le13;)LAC2;
    .locals 1

    iget-object v0, p0, LCC2;->a:LDC2;

    invoke-virtual {v0, p1, p2, p3, p4}, LDC2;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;LRg6;Le13;)LAC2;

    move-result-object p1

    return-object p1
.end method
