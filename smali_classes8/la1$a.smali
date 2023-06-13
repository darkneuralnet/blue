.class public Lla1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGB0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lla1;->b(LWB1;)V
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

    iput-object p1, p0, Lla1$a;->c:Lla1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lla1$a;->b:Z

    return-void
.end method


# virtual methods
.method public d(LEB0;I)V
    .locals 9

    invoke-interface {p1}, LEB0;->k2()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lla1$a;->b:Z

    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LEB0;->a3(II)D

    move-result-wide v7

    iget-object v2, p0, Lla1$a;->c:Lla1;

    invoke-interface {p1, p2, v1}, LEB0;->a3(II)D

    move-result-wide v3

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, LEB0;->a3(II)D

    move-result-wide v5

    invoke-virtual/range {v2 .. v8}, Lla1;->a(DDD)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-boolean v0, p0, Lla1$a;->b:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
