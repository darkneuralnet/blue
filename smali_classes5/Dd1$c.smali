.class public LDd1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LrV0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lz41$a;

.field public volatile b:Lz41;


# direct methods
.method public constructor <init>(Lz41$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDd1$c;->a:Lz41$a;

    return-void
.end method


# virtual methods
.method public a()Lz41;
    .locals 1

    iget-object v0, p0, LDd1$c;->b:Lz41;

    if-nez v0, :cond_2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LDd1$c;->b:Lz41;

    if-nez v0, :cond_0

    iget-object v0, p0, LDd1$c;->a:Lz41$a;

    invoke-interface {v0}, Lz41$a;->build()Lz41;

    move-result-object v0

    iput-object v0, p0, LDd1$c;->b:Lz41;

    :cond_0
    iget-object v0, p0, LDd1$c;->b:Lz41;

    if-nez v0, :cond_1

    new-instance v0, LA41;

    invoke-direct {v0}, LA41;-><init>()V

    iput-object v0, p0, LDd1$c;->b:Lz41;

    :cond_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_0
    iget-object v0, p0, LDd1$c;->b:Lz41;

    return-object v0
.end method
