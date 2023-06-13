.class public final LuC2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtC2;


# instance fields
.field public final a:LvC2;


# direct methods
.method public constructor <init>(LvC2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuC2;->a:LvC2;

    return-void
.end method

.method public static b(LvC2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LvC2;",
            ")",
            "LY94<",
            "LtC2;",
            ">;"
        }
    .end annotation

    new-instance v0, LuC2;

    invoke-direct {v0, p0}, LuC2;-><init>(LvC2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;LxC2;Landroid/app/Activity;Le13;)LmC2;
    .locals 6

    iget-object v0, p0, LuC2;->a:LvC2;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LvC2;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;LxC2;Landroid/app/Activity;Le13;)LmC2;

    move-result-object p1

    return-object p1
.end method
