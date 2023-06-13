.class public final Lh1$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final c:Lh1$i;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Lh1$i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh1$i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh1$i;-><init>(Z)V

    sput-object v0, Lh1$i;->c:Lh1$i;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh1;->g:Lh1$b;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lh1$b;->e(Lh1$i;Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh1$i;)V
    .locals 1

    sget-object v0, Lh1;->g:Lh1$b;

    invoke-virtual {v0, p0, p1}, Lh1$b;->d(Lh1$i;Lh1$i;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lh1$i;->a:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lh1$i;->a:Ljava/lang/Thread;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
