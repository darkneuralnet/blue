.class public final LkA1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LjA1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LnA1;",
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

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            ">;",
            "LY94<",
            "LnA1;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkA1;->a:LY94;

    iput-object p2, p0, LkA1;->b:LY94;

    iput-object p3, p0, LkA1;->c:LY94;

    iput-object p4, p0, LkA1;->d:LY94;

    iput-object p5, p0, LkA1;->e:LY94;

    iput-object p6, p0, LkA1;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LkA1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            ">;",
            "LY94<",
            "LnA1;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LkA1;"
        }
    .end annotation

    new-instance v7, LkA1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LkA1;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Lco/bird/android/model/wire/WireFrequentFlyerView;LnA1;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LEa;)LjA1;
    .locals 8

    new-instance v7, LjA1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LjA1;-><init>(Lco/bird/android/model/wire/WireFrequentFlyerView;LnA1;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LEa;)V

    return-object v7
.end method


# virtual methods
.method public b()LjA1;
    .locals 7

    iget-object v0, p0, LkA1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/model/wire/WireFrequentFlyerView;

    iget-object v0, p0, LkA1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LnA1;

    iget-object v0, p0, LkA1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LTq4;

    iget-object v0, p0, LkA1;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Le13;

    iget-object v0, p0, LkA1;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LkA1;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LEa;

    invoke-static/range {v1 .. v6}, LkA1;->c(Lco/bird/android/model/wire/WireFrequentFlyerView;LnA1;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LEa;)LjA1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LkA1;->b()LjA1;

    move-result-object v0

    return-object v0
.end method
