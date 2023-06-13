.class public Lla1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGB0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lla1;->g(LWB1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:Z

.field public final synthetic c:Lla1;


# direct methods
.method public constructor <init>(Lla1;)V
    .locals 0

    iput-object p1, p0, Lla1$b;->c:Lla1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lla1$b;->b:Z

    return-void
.end method


# virtual methods
.method public d(LEB0;I)V
    .locals 6

    invoke-interface {p1}, LEB0;->k2()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lla1$b;->b:Z

    return-void

    :cond_0
    invoke-interface {p1, p2}, LEB0;->W0(I)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lla1$b;->c:Lla1;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2}, LEB0;->a3(II)D

    move-result-wide v2

    invoke-interface {p1, p2, v1}, LEB0;->a3(II)D

    move-result-wide v4

    invoke-virtual {v0, v2, v3, v4, v5}, Lla1;->e(DD)D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, LEB0;->y1(IID)V

    :cond_1
    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-boolean v0, p0, Lla1$b;->b:Z

    return v0
.end method
