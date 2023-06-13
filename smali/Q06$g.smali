.class public final LQ06$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ06;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ06;->l(LVr5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0012*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0008\u0010\u000c\u001a\u00020\u0004H\u0016J\u0008\u0010\r\u001a\u00020\u0004H\u0016R+\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0006R+\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010\"\u0004\u0008\u0014\u0010\u0006\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0016"
    }
    d2 = {
        "Q06$g",
        "LZ06;",
        "LCe3;",
        "point",
        "",
        "b",
        "(J)V",
        "e",
        "startPoint",
        "d",
        "delta",
        "c",
        "onStop",
        "a",
        "J",
        "getLastPosition",
        "()J",
        "setLastPosition",
        "lastPosition",
        "getDragTotalDistance",
        "setDragTotalDistance",
        "dragTotalDistance",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public final synthetic c:LQ06;

.field public final synthetic d:LVr5;


# direct methods
.method public constructor <init>(LQ06;LVr5;)V
    .locals 2

    iput-object p1, p0, LQ06$g;->c:LQ06;

    iput-object p2, p0, LQ06$g;->d:LVr5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, LQ06$g;->a:J

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, LQ06$g;->b:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LQ06$g;->d:LVr5;

    iget-object v1, p0, LQ06$g;->c:LQ06;

    invoke-virtual {v1}, LQ06;->h()LF26;

    move-result-object v1

    invoke-virtual {v1}, LF26;->h()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LWr5;->b(LVr5;J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQ06$g;->d:LVr5;

    invoke-interface {v0}, LVr5;->e()V

    :cond_0
    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public c(J)V
    .locals 9

    iget-object v0, p0, LQ06$g;->c:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->b()Lnm2;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, p0, LQ06$g;->d:LVr5;

    iget-object v0, p0, LQ06$g;->c:LQ06;

    invoke-interface {v2}, Lnm2;->F()Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v3

    invoke-virtual {v3}, LF26;->h()J

    move-result-wide v3

    invoke-static {v1, v3, v4}, LWr5;->b(LVr5;J)Z

    move-result v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    iget-wide v3, p0, LQ06$g;->b:J

    invoke-static {v3, v4, p1, p2}, LCe3;->t(JJ)J

    move-result-wide p1

    iput-wide p1, p0, LQ06$g;->b:J

    iget-wide v3, p0, LQ06$g;->a:J

    invoke-static {v3, v4, p1, p2}, LCe3;->t(JJ)J

    move-result-wide p1

    iget-wide v3, p0, LQ06$g;->a:J

    invoke-static {v0, v3, v4, p1, p2}, LQ06;->b(LQ06;JJ)Z

    move-result v0

    if-nez v0, :cond_2

    iget-wide v5, p0, LQ06$g;->a:J

    sget-object v0, LPr5;->a:LPr5$a;

    invoke-virtual {v0}, LPr5$a;->d()LPr5;

    move-result-object v8

    const/4 v7, 0x0

    move-wide v3, p1

    invoke-interface/range {v1 .. v8}, LVr5;->a(Lnm2;JJZLPr5;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iput-wide p1, p0, LQ06$g;->a:J

    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, LQ06$g;->b:J

    :cond_2
    return-void
.end method

.method public d(J)V
    .locals 4

    iget-object v0, p0, LQ06$g;->c:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->b()Lnm2;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LQ06$g;->c:LQ06;

    iget-object v2, p0, LQ06$g;->d:LVr5;

    invoke-interface {v0}, Lnm2;->F()Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    invoke-static {v1, p1, p2, p1, p2}, LQ06;->b(LQ06;JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->h()J

    move-result-wide v0

    invoke-interface {v2, v0, v1}, LVr5;->j(J)V

    goto :goto_0

    :cond_1
    sget-object v1, LPr5;->a:LPr5$a;

    invoke-virtual {v1}, LPr5$a;->g()LPr5;

    move-result-object v1

    invoke-interface {v2, v0, p1, p2, v1}, LVr5;->b(Lnm2;JLPr5;)V

    :goto_0
    iput-wide p1, p0, LQ06$g;->a:J

    :cond_2
    iget-object p1, p0, LQ06$g;->d:LVr5;

    iget-object p2, p0, LQ06$g;->c:LQ06;

    invoke-virtual {p2}, LQ06;->h()LF26;

    move-result-object p2

    invoke-virtual {p2}, LF26;->h()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LWr5;->b(LVr5;J)Z

    move-result p1

    if-nez p1, :cond_3

    return-void

    :cond_3
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, LQ06$g;->b:J

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 3

    iget-object v0, p0, LQ06$g;->d:LVr5;

    iget-object v1, p0, LQ06$g;->c:LQ06;

    invoke-virtual {v1}, LQ06;->h()LF26;

    move-result-object v1

    invoke-virtual {v1}, LF26;->h()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LWr5;->b(LVr5;J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQ06$g;->d:LVr5;

    invoke-interface {v0}, LVr5;->e()V

    :cond_0
    return-void
.end method
