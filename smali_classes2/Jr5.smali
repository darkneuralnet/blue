.class public final LJr5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIr5;


# instance fields
.field public final a:LKr5;


# direct methods
.method public constructor <init>(LKr5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJr5;->a:LKr5;

    return-void
.end method

.method public static b(LKr5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKr5;",
            ")",
            "LY94<",
            "LIr5;",
            ">;"
        }
    .end annotation

    new-instance v0, LJr5;

    invoke-direct {v0, p0}, LJr5;-><init>(LKr5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LLr5;Lcom/uber/autodispose/ScopeProvider;)LHr5;
    .locals 1

    iget-object v0, p0, LJr5;->a:LKr5;

    invoke-virtual {v0, p1, p2}, LKr5;->b(LLr5;Lcom/uber/autodispose/ScopeProvider;)LHr5;

    move-result-object p1

    return-object p1
.end method
