.class public final Lek0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u0011\u001a\u0004\u0008\r\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lek0;",
        "",
        "LYW3;",
        "event",
        "",
        "d",
        "LjX3;",
        "prevClick",
        "newClick",
        "",
        "c",
        "b",
        "LJq6;",
        "a",
        "LJq6;",
        "viewConfiguration",
        "",
        "I",
        "()I",
        "setClicks",
        "(I)V",
        "clicks",
        "LjX3;",
        "getPrevClick",
        "()LjX3;",
        "setPrevClick",
        "(LjX3;)V",
        "<init>",
        "(LJq6;)V",
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
.field public final a:LJq6;

.field public b:I

.field public c:LjX3;


# direct methods
.method public constructor <init>(LJq6;)V
    .locals 1

    const-string v0, "viewConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lek0;->a:LJq6;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lek0;->b:I

    return v0
.end method

.method public final b(LjX3;LjX3;)Z
    .locals 2

    const-string v0, "prevClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LjX3;->f()J

    move-result-wide v0

    invoke-virtual {p1}, LjX3;->f()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, LCe3;->s(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LCe3;->m(J)F

    move-result p1

    float-to-double p1, p1

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    cmpg-double p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(LjX3;LjX3;)Z
    .locals 2

    const-string v0, "prevClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LjX3;->m()J

    move-result-wide v0

    invoke-virtual {p1}, LjX3;->m()J

    move-result-wide p1

    sub-long/2addr v0, p1

    iget-object p1, p0, Lek0;->a:LJq6;

    invoke-interface {p1}, LJq6;->c()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d(LYW3;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lek0;->c:LjX3;

    invoke-virtual {p1}, LYW3;->c()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LjX3;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Lek0;->c(LjX3;LjX3;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, p1}, Lek0;->b(LjX3;LjX3;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lek0;->b:I

    add-int/2addr v0, v1

    iput v0, p0, Lek0;->b:I

    goto :goto_0

    :cond_0
    iput v1, p0, Lek0;->b:I

    :goto_0
    iput-object p1, p0, Lek0;->c:LjX3;

    return-void
.end method
