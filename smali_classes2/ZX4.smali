.class public final LZX4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNP4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXW2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpM3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LNP4;",
            ">;",
            "LY94<",
            "LXW2;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZX4;->a:LY94;

    iput-object p2, p0, LZX4;->b:LY94;

    iput-object p3, p0, LZX4;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LZX4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LNP4;",
            ">;",
            "LY94<",
            "LXW2;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;)",
            "LZX4;"
        }
    .end annotation

    new-instance v0, LZX4;

    invoke-direct {v0, p0, p1, p2}, LZX4;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LNP4;LXW2;LpM3;Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)LVX4;
    .locals 8

    new-instance v7, LVX4;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LVX4;-><init>(LNP4;LXW2;LpM3;Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)V

    return-object v7
.end method


# virtual methods
.method public b(Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)LVX4;
    .locals 7

    iget-object v0, p0, LZX4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LNP4;

    iget-object v0, p0, LZX4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LXW2;

    iget-object v0, p0, LZX4;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LpM3;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v1 .. v6}, LZX4;->c(LNP4;LXW2;LpM3;Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)LVX4;

    move-result-object p1

    return-object p1
.end method
