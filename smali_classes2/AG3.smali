.class public final LAG3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAG3;->a:LY94;

    iput-object p2, p0, LAG3;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LAG3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LAG3;"
        }
    .end annotation

    new-instance v0, LAG3;

    invoke-direct {v0, p0, p1}, LAG3;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LYR4;LEa;LBG3;Lcom/uber/autodispose/ScopeProvider;Le13;)LxG3;
    .locals 7

    new-instance v6, LxG3;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LxG3;-><init>(LYR4;LEa;LBG3;Lcom/uber/autodispose/ScopeProvider;Le13;)V

    return-object v6
.end method


# virtual methods
.method public b(LBG3;Lcom/uber/autodispose/ScopeProvider;Le13;)LxG3;
    .locals 2

    iget-object v0, p0, LAG3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    iget-object v1, p0, LAG3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEa;

    invoke-static {v0, v1, p1, p2, p3}, LAG3;->c(LYR4;LEa;LBG3;Lcom/uber/autodispose/ScopeProvider;Le13;)LxG3;

    move-result-object p1

    return-object p1
.end method
