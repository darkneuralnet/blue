.class public Lqp0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGB0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public b:LyB0;


# direct methods
.method public constructor <init>(LyB0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqp0$b;->b:LyB0;

    return-void
.end method


# virtual methods
.method public d(LEB0;I)V
    .locals 8

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LEB0;->a3(II)D

    move-result-wide v1

    iget-object v3, p0, Lqp0$b;->b:LyB0;

    iget-wide v3, v3, LyB0;->b:D

    add-double/2addr v1, v3

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3}, LEB0;->a3(II)D

    move-result-wide v4

    iget-object v6, p0, Lqp0$b;->b:LyB0;

    iget-wide v6, v6, LyB0;->c:D

    add-double/2addr v4, v6

    invoke-interface {p1, p2, v0, v1, v2}, LEB0;->y1(IID)V

    invoke-interface {p1, p2, v3, v4, v5}, LEB0;->y1(IID)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
