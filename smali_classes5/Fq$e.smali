.class public final LFq$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "Lqx2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LFq$e;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;

.field public static final e:LSk1;

.field public static final f:LSk1;

.field public static final g:LSk1;

.field public static final h:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFq$e;

    invoke-direct {v0}, LFq$e;-><init>()V

    sput-object v0, LFq$e;->a:LFq$e;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$e;->b:LSk1;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$e;->c:LSk1;

    const-string v0, "clientInfo"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$e;->d:LSk1;

    const-string v0, "logSource"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$e;->e:LSk1;

    const-string v0, "logSourceName"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$e;->f:LSk1;

    const-string v0, "logEvent"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$e;->g:LSk1;

    const-string v0, "qosTier"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$e;->h:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqx2;LPd3;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LFq$e;->b:LSk1;

    invoke-virtual {p1}, Lqx2;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, LFq$e;->c:LSk1;

    invoke-virtual {p1}, Lqx2;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, LFq$e;->d:LSk1;

    invoke-virtual {p1}, Lqx2;->b()LIk0;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$e;->e:LSk1;

    invoke-virtual {p1}, Lqx2;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$e;->f:LSk1;

    invoke-virtual {p1}, Lqx2;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$e;->g:LSk1;

    invoke-virtual {p1}, Lqx2;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$e;->h:LSk1;

    invoke-virtual {p1}, Lqx2;->f()Lvb4;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lqx2;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, LFq$e;->a(Lqx2;LPd3;)V

    return-void
.end method
