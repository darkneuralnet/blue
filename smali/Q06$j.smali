.class public final LQ06$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgW2;


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
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000cR+\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0014"
    }
    d2 = {
        "Q06$j",
        "LgW2;",
        "LCe3;",
        "downPosition",
        "",
        "d",
        "(J)Z",
        "dragPosition",
        "c",
        "LPr5;",
        "adjustment",
        "a",
        "(JLPr5;)Z",
        "b",
        "J",
        "getLastPosition",
        "()J",
        "setLastPosition",
        "(J)V",
        "lastPosition",
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

.field public final synthetic b:LQ06;

.field public final synthetic c:LVr5;


# direct methods
.method public constructor <init>(LQ06;LVr5;)V
    .locals 0

    iput-object p1, p0, LQ06$j;->b:LQ06;

    iput-object p2, p0, LQ06$j;->c:LVr5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, LQ06$j;->a:J

    return-void
.end method


# virtual methods
.method public a(JLPr5;)Z
    .locals 5

    const-string v0, "adjustment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ06$j;->b:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->b()Lnm2;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, LQ06$j;->c:LVr5;

    iget-object v3, p0, LQ06$j;->b:LQ06;

    invoke-interface {v0}, Lnm2;->F()Z

    move-result v4

    if-nez v4, :cond_0

    return v1

    :cond_0
    invoke-interface {v2, v0, p1, p2, p3}, LVr5;->b(Lnm2;JLPr5;)V

    iput-wide p1, p0, LQ06$j;->a:J

    invoke-virtual {v3}, LQ06;->h()LF26;

    move-result-object p1

    invoke-virtual {p1}, LF26;->h()J

    move-result-wide p1

    invoke-static {v2, p1, p2}, LWr5;->b(LVr5;J)Z

    move-result p1

    return p1

    :cond_1
    return v1
.end method

.method public b(JLPr5;)Z
    .locals 9

    const-string v0, "adjustment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ06$j;->b:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->b()Lnm2;

    move-result-object v2

    const/4 v0, 0x1

    if-eqz v2, :cond_2

    iget-object v1, p0, LQ06$j;->c:LVr5;

    iget-object v3, p0, LQ06$j;->b:LQ06;

    invoke-interface {v2}, Lnm2;->F()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    return v5

    :cond_0
    invoke-virtual {v3}, LQ06;->h()LF26;

    move-result-object v3

    invoke-virtual {v3}, LF26;->h()J

    move-result-wide v3

    invoke-static {v1, v3, v4}, LWr5;->b(LVr5;J)Z

    move-result v3

    if-nez v3, :cond_1

    return v5

    :cond_1
    iget-wide v5, p0, LQ06$j;->a:J

    const/4 v7, 0x0

    move-wide v3, p1

    move-object v8, p3

    invoke-interface/range {v1 .. v8}, LVr5;->a(Lnm2;JJZLPr5;)Z

    move-result p3

    if-ne p3, v0, :cond_2

    iput-wide p1, p0, LQ06$j;->a:J

    :cond_2
    return v0
.end method

.method public c(J)Z
    .locals 9

    iget-object v0, p0, LQ06$j;->b:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->b()Lnm2;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, p0, LQ06$j;->c:LVr5;

    iget-object v0, p0, LQ06$j;->b:LQ06;

    invoke-interface {v2}, Lnm2;->F()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    :cond_0
    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->h()J

    move-result-wide v5

    invoke-static {v1, v5, v6}, LWr5;->b(LVr5;J)Z

    move-result v0

    if-nez v0, :cond_1

    return v4

    :cond_1
    iget-wide v5, p0, LQ06$j;->a:J

    const/4 v7, 0x0

    sget-object v0, LPr5;->a:LPr5$a;

    invoke-virtual {v0}, LPr5$a;->e()LPr5;

    move-result-object v8

    move-wide v3, p1

    invoke-interface/range {v1 .. v8}, LVr5;->a(Lnm2;JJZLPr5;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-wide p1, p0, LQ06$j;->a:J

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public d(J)Z
    .locals 11

    iget-object v0, p0, LQ06$j;->b:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0}, LF26;->b()Lnm2;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    iget-object v9, p0, LQ06$j;->c:LVr5;

    iget-object v10, p0, LQ06$j;->b:LQ06;

    invoke-interface {v2}, Lnm2;->F()Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-wide v5, p0, LQ06$j;->a:J

    const/4 v7, 0x0

    sget-object v0, LPr5;->a:LPr5$a;

    invoke-virtual {v0}, LPr5$a;->e()LPr5;

    move-result-object v8

    move-object v1, v9

    move-wide v3, p1

    invoke-interface/range {v1 .. v8}, LVr5;->a(Lnm2;JJZLPr5;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-wide p1, p0, LQ06$j;->a:J

    :cond_1
    invoke-virtual {v10}, LQ06;->h()LF26;

    move-result-object p1

    invoke-virtual {p1}, LF26;->h()J

    move-result-wide p1

    invoke-static {v9, p1, p2}, LWr5;->b(LVr5;J)Z

    move-result p1

    return p1

    :cond_2
    return v0
.end method
