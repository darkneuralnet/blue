.class public LUI4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDy0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUI4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:LmJ4;

.field public final synthetic b:LUI4;


# direct methods
.method public constructor <init>(LUI4;LmJ4;)V
    .locals 0

    iput-object p1, p0, LUI4$b;->b:LUI4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LUI4$b;->a:LmJ4;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, LUI4$b;->b:LUI4;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, LUI4$b;->a:LmJ4;

    invoke-virtual {v0}, LmJ4;->e()V

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method
