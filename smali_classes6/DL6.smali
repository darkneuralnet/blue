.class public final LDL6;
.super LBL6;
.source "SourceFile"


# instance fields
.field public final b:LBL6;

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(LBL6;JJ)V
    .locals 0

    invoke-direct {p0}, LBL6;-><init>()V

    iput-object p1, p0, LDL6;->b:LBL6;

    invoke-virtual {p0, p2, p3}, LDL6;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, LDL6;->c:J

    add-long/2addr p1, p4

    invoke-virtual {p0, p1, p2}, LDL6;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, LDL6;->d:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    iget-wide v0, p0, LDL6;->d:J

    iget-wide v2, p0, LDL6;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final b(JJ)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-wide p1, p0, LDL6;->c:J

    invoke-virtual {p0, p1, p2}, LDL6;->d(J)J

    move-result-wide p1

    add-long/2addr p3, p1

    invoke-virtual {p0, p3, p4}, LDL6;->d(J)J

    move-result-wide p3

    iget-object v0, p0, LDL6;->b:LBL6;

    sub-long/2addr p3, p1

    invoke-virtual {v0, p1, p2, p3, p4}, LBL6;->b(JJ)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public final d(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, LDL6;->b:LBL6;

    invoke-virtual {v0}, LBL6;->a()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    iget-object p1, p0, LDL6;->b:LBL6;

    invoke-virtual {p1}, LBL6;->a()J

    move-result-wide p1

    :cond_1
    return-wide p1
.end method
