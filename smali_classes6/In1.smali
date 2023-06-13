.class public final LIn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lxn1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAm1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LX94<",
            "LUv4;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LSm1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LX94<",
            "LU96;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBv0;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LAm1;",
            ">;",
            "LY94<",
            "LX94<",
            "LUv4;",
            ">;>;",
            "LY94<",
            "LSm1;",
            ">;",
            "LY94<",
            "LX94<",
            "LU96;",
            ">;>;",
            "LY94<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "LY94<",
            "LBv0;",
            ">;",
            "LY94<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIn1;->a:LY94;

    iput-object p2, p0, LIn1;->b:LY94;

    iput-object p3, p0, LIn1;->c:LY94;

    iput-object p4, p0, LIn1;->d:LY94;

    iput-object p5, p0, LIn1;->e:LY94;

    iput-object p6, p0, LIn1;->f:LY94;

    iput-object p7, p0, LIn1;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LIn1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LAm1;",
            ">;",
            "LY94<",
            "LX94<",
            "LUv4;",
            ">;>;",
            "LY94<",
            "LSm1;",
            ">;",
            "LY94<",
            "LX94<",
            "LU96;",
            ">;>;",
            "LY94<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;",
            "LY94<",
            "LBv0;",
            ">;",
            "LY94<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;)",
            "LIn1;"
        }
    .end annotation

    new-instance v8, LIn1;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LIn1;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(LAm1;LX94;LSm1;LX94;Lcom/google/firebase/perf/config/RemoteConfigManager;LBv0;Lcom/google/firebase/perf/session/SessionManager;)Lxn1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "LX94<",
            "LUv4;",
            ">;",
            "LSm1;",
            "LX94<",
            "LU96;",
            ">;",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            "LBv0;",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ")",
            "Lxn1;"
        }
    .end annotation

    new-instance v8, Lxn1;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lxn1;-><init>(LAm1;LX94;LSm1;LX94;Lcom/google/firebase/perf/config/RemoteConfigManager;LBv0;Lcom/google/firebase/perf/session/SessionManager;)V

    return-object v8
.end method


# virtual methods
.method public b()Lxn1;
    .locals 8

    iget-object v0, p0, LIn1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LAm1;

    iget-object v0, p0, LIn1;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LX94;

    iget-object v0, p0, LIn1;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LSm1;

    iget-object v0, p0, LIn1;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LX94;

    iget-object v0, p0, LIn1;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/firebase/perf/config/RemoteConfigManager;

    iget-object v0, p0, LIn1;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LBv0;

    iget-object v0, p0, LIn1;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/google/firebase/perf/session/SessionManager;

    invoke-static/range {v1 .. v7}, LIn1;->c(LAm1;LX94;LSm1;LX94;Lcom/google/firebase/perf/config/RemoteConfigManager;LBv0;Lcom/google/firebase/perf/session/SessionManager;)Lxn1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIn1;->b()Lxn1;

    move-result-object v0

    return-object v0
.end method
