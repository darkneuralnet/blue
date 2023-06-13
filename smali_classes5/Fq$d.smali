.class public final LFq$d;
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
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "Lnx2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LFq$d;

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

    new-instance v0, LFq$d;

    invoke-direct {v0}, LFq$d;-><init>()V

    sput-object v0, LFq$d;->a:LFq$d;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$d;->b:LSk1;

    const-string v0, "eventCode"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$d;->c:LSk1;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$d;->d:LSk1;

    const-string v0, "sourceExtension"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$d;->e:LSk1;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$d;->f:LSk1;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$d;->g:LSk1;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$d;->h:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnx2;LPd3;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LFq$d;->b:LSk1;

    invoke-virtual {p1}, Lnx2;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, LFq$d;->c:LSk1;

    invoke-virtual {p1}, Lnx2;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$d;->d:LSk1;

    invoke-virtual {p1}, Lnx2;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, LFq$d;->e:LSk1;

    invoke-virtual {p1}, Lnx2;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$d;->f:LSk1;

    invoke-virtual {p1}, Lnx2;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$d;->g:LSk1;

    invoke-virtual {p1}, Lnx2;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, LFq$d;->h:LSk1;

    invoke-virtual {p1}, Lnx2;->e()LB73;

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

    check-cast p1, Lnx2;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, LFq$d;->a(Lnx2;LPd3;)V

    return-void
.end method
