.class public final LAU4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lfa5;",
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
            "Le13;",
            ">;",
            "LY94<",
            "Lfa5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAU4;->a:LY94;

    iput-object p2, p0, LAU4;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LAU4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lfa5;",
            ">;)",
            "LAU4;"
        }
    .end annotation

    new-instance v0, LAU4;

    invoke-direct {v0, p0, p1}, LAU4;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Le13;Lfa5;Lcom/uber/autodispose/ScopeProvider;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LBU4;)LxU4;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le13;",
            "Lfa5;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeRiderMapAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LBU4;",
            ")",
            "LxU4;"
        }
    .end annotation

    new-instance v8, LxU4;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LxU4;-><init>(Le13;Lfa5;Lcom/uber/autodispose/ScopeProvider;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LBU4;)V

    return-object v8
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LBU4;)LxU4;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeRiderMapAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LBU4;",
            ")",
            "LxU4;"
        }
    .end annotation

    iget-object v0, p0, LAU4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le13;

    iget-object v0, p0, LAU4;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lfa5;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v1 .. v7}, LAU4;->c(Le13;Lfa5;Lcom/uber/autodispose/ScopeProvider;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LBU4;)LxU4;

    move-result-object p1

    return-object p1
.end method
