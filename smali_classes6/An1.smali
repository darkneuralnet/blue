.class public LAn1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# instance fields
.field public final a:LAm1;

.field public final b:LSm1;

.field public final c:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LUv4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LU96;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LAm1;LSm1;LX94;LX94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "LSm1;",
            "LX94<",
            "LUv4;",
            ">;",
            "LX94<",
            "LU96;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAn1;->a:LAm1;

    iput-object p2, p0, LAn1;->b:LSm1;

    iput-object p3, p0, LAn1;->c:LX94;

    iput-object p4, p0, LAn1;->d:LX94;

    return-void
.end method


# virtual methods
.method public a()LBv0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-static {}, LBv0;->g()LBv0;

    move-result-object v0

    return-object v0
.end method

.method public b()LAm1;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, LAn1;->a:LAm1;

    return-object v0
.end method

.method public c()LSm1;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, LAn1;->b:LSm1;

    return-object v0
.end method

.method public d()LX94;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LX94<",
            "LUv4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LAn1;->c:LX94;

    return-object v0
.end method

.method public e()Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-static {}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getInstance()Lcom/google/firebase/perf/config/RemoteConfigManager;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/firebase/perf/session/SessionManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    return-object v0
.end method

.method public g()LX94;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LX94<",
            "LU96;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LAn1;->d:LX94;

    return-object v0
.end method
