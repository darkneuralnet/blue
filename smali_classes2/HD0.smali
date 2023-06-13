.class public final LHD0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LV74;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "LV74;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHD0;->a:LY94;

    iput-object p2, p0, LHD0;->b:LY94;

    iput-object p3, p0, LHD0;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LHD0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LV74;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LHD0;"
        }
    .end annotation

    new-instance v0, LHD0;

    invoke-direct {v0, p0, p1, p2}, LHD0;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LV74;Le13;LTq4;LID0;Lcom/uber/autodispose/ScopeProvider;)LED0;
    .locals 7

    new-instance v6, LED0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LED0;-><init>(LV74;Le13;LTq4;LID0;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v6
.end method


# virtual methods
.method public b(LID0;Lcom/uber/autodispose/ScopeProvider;)LED0;
    .locals 3

    iget-object v0, p0, LHD0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV74;

    iget-object v1, p0, LHD0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LHD0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    invoke-static {v0, v1, v2, p1, p2}, LHD0;->c(LV74;Le13;LTq4;LID0;Lcom/uber/autodispose/ScopeProvider;)LED0;

    move-result-object p1

    return-object p1
.end method
