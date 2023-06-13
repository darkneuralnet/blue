.class public final LKz5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJz5;


# instance fields
.field public final a:LLz5;


# direct methods
.method public constructor <init>(LLz5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKz5;->a:LLz5;

    return-void
.end method

.method public static b(LLz5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLz5;",
            ")",
            "LY94<",
            "LJz5;",
            ">;"
        }
    .end annotation

    new-instance v0, LKz5;

    invoke-direct {v0, p0}, LKz5;-><init>(LLz5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;LNz5;Le13;)LHz5;
    .locals 1

    iget-object v0, p0, LKz5;->a:LLz5;

    invoke-virtual {v0, p1, p2, p3, p4}, LLz5;->b(Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;LNz5;Le13;)LHz5;

    move-result-object p1

    return-object p1
.end method
