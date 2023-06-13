.class public final Lw0$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final c:Lw0$i;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Lw0$i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw0$i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw0$i;-><init>(Z)V

    sput-object v0, Lw0$i;->c:Lw0$i;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lw0;->g:Lw0$b;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lw0$b;->e(Lw0$i;Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lw0$i;)V
    .locals 1

    sget-object v0, Lw0;->g:Lw0$b;

    invoke-virtual {v0, p0, p1}, Lw0$b;->d(Lw0$i;Lw0$i;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lw0$i;->a:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lw0$i;->a:Ljava/lang/Thread;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
