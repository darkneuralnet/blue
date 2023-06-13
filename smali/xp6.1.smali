.class public Lxp6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln46;

.field public b:J

.field public c:Lr46;


# direct methods
.method public constructor <init>(Ln46;Lr46;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lxp6;->b:J

    iput-object p1, p0, Lxp6;->a:Ln46;

    iput-object p2, p0, Lxp6;->c:Lr46;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 17

    move-object/from16 v0, p0

    const-wide v1, 0x7fffffffffffffffL

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-wide v6, v3

    :goto_0
    const/4 v8, 0x3

    if-ge v5, v8, :cond_2

    iget-object v8, v0, Lxp6;->a:Ln46;

    invoke-interface {v8}, Ln46;->b()J

    move-result-wide v8

    iget-object v10, v0, Lxp6;->a:Ln46;

    invoke-interface {v10}, Ln46;->a()J

    move-result-wide v10

    iget-object v12, v0, Lxp6;->a:Ln46;

    invoke-interface {v12}, Ln46;->b()J

    move-result-wide v12

    sub-long v14, v12, v8

    if-eqz v5, :cond_0

    cmp-long v16, v14, v1

    if-gez v16, :cond_1

    :cond_0
    add-long/2addr v8, v12

    const/4 v1, 0x1

    shr-long v1, v8, v1

    sub-long v6, v10, v1

    move-wide v1, v14

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public b(J)J
    .locals 4

    iget-object v0, p0, Lxp6;->c:Lr46;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lxp6;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "VideoTimebaseConverter"

    const-string v1, "Detected video buffer timestamp is close to realtime."

    invoke-static {v0, v1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lr46;->c:Lr46;

    iput-object v0, p0, Lxp6;->c:Lr46;

    goto :goto_0

    :cond_0
    sget-object v0, Lr46;->b:Lr46;

    iput-object v0, p0, Lxp6;->c:Lr46;

    :cond_1
    :goto_0
    sget-object v0, Lxp6$a;->a:[I

    iget-object v1, p0, Lxp6;->c:Lr46;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    return-wide p1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown timebase: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lxp6;->c:Lr46;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    iget-wide v0, p0, Lxp6;->b:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lxp6;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lxp6;->b:J

    :cond_4
    iget-wide v0, p0, Lxp6;->b:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final c(J)Z
    .locals 4

    iget-object v0, p0, Lxp6;->a:Ln46;

    invoke-interface {v0}, Ln46;->b()J

    move-result-wide v0

    iget-object v2, p0, Lxp6;->a:Ln46;

    invoke-interface {v2}, Ln46;->a()J

    move-result-wide v2

    sub-long v2, p1, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
