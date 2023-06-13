.class public Lw12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNW3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw12$a;,
        Lw12$b;
    }
.end annotation


# instance fields
.field public a:LWB1;

.field public volatile b:Lw12$a;


# direct methods
.method public constructor <init>(LWB1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lw12;->b:Lw12$a;

    instance-of v0, p1, LLX3;

    if-nez v0, :cond_1

    instance-of v0, p1, LKr2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument must be Polygonal or LinearRing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lw12;->a:LWB1;

    return-void
.end method


# virtual methods
.method public a(LyB0;)I
    .locals 7

    iget-object v0, p0, Lw12;->b:Lw12$a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lw12;->b()V

    :cond_0
    new-instance v0, Lvn4;

    invoke-direct {v0, p1}, Lvn4;-><init>(LyB0;)V

    new-instance v6, Lw12$b;

    invoke-direct {v6, v0}, Lw12$b;-><init>(Lvn4;)V

    iget-object v1, p0, Lw12;->b:Lw12$a;

    iget-wide v4, p1, LyB0;->c:D

    move-wide v2, v4

    invoke-virtual/range {v1 .. v6}, Lw12$a;->c(DDLhg2;)V

    invoke-virtual {v0}, Lvn4;->b()I

    move-result p1

    return p1
.end method

.method public final declared-synchronized b()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lw12;->b:Lw12$a;

    if-nez v0, :cond_0

    new-instance v0, Lw12$a;

    iget-object v1, p0, Lw12;->a:LWB1;

    invoke-direct {v0, v1}, Lw12$a;-><init>(LWB1;)V

    iput-object v0, p0, Lw12;->b:Lw12$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lw12;->a:LWB1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
