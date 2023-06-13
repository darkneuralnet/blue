.class public final LRP3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAM3;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVM3;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LAM3;",
            ">;",
            "LY94<",
            "LVM3;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRP3;->a:LY94;

    iput-object p2, p0, LRP3;->b:LY94;

    iput-object p3, p0, LRP3;->c:LY94;

    iput-object p4, p0, LRP3;->d:LY94;

    iput-object p5, p0, LRP3;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LRP3;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LAM3;",
            ">;",
            "LY94<",
            "LVM3;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)",
            "LRP3;"
        }
    .end annotation

    new-instance v6, LRP3;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LRP3;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(LEa;LTq4;LAM3;LVM3;LYR4;LSP3;Lcom/uber/autodispose/ScopeProvider;Le13;)LOP3;
    .locals 10

    new-instance v9, LOP3;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LOP3;-><init>(LEa;LTq4;LAM3;LVM3;LYR4;LSP3;Lcom/uber/autodispose/ScopeProvider;Le13;)V

    return-object v9
.end method


# virtual methods
.method public b(LSP3;Lcom/uber/autodispose/ScopeProvider;Le13;)LOP3;
    .locals 9

    iget-object v0, p0, LRP3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LEa;

    iget-object v0, p0, LRP3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTq4;

    iget-object v0, p0, LRP3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LAM3;

    iget-object v0, p0, LRP3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LVM3;

    iget-object v0, p0, LRP3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LYR4;

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-static/range {v1 .. v8}, LRP3;->c(LEa;LTq4;LAM3;LVM3;LYR4;LSP3;Lcom/uber/autodispose/ScopeProvider;Le13;)LOP3;

    move-result-object p1

    return-object p1
.end method
