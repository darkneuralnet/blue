.class public final synthetic LFd5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LYd5;

.field public final synthetic c:Z

.field public final synthetic d:LKY;

.field public final synthetic e:LbE5;

.field public final synthetic f:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(LYd5;ZLKY;LbE5;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFd5;->b:LYd5;

    iput-boolean p2, p0, LFd5;->c:Z

    iput-object p3, p0, LFd5;->d:LKY;

    iput-object p4, p0, LFd5;->e:LbE5;

    iput-object p5, p0, LFd5;->f:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LFd5;->b:LYd5;

    iget-boolean v1, p0, LFd5;->c:Z

    iget-object v2, p0, LFd5;->d:LKY;

    iget-object v3, p0, LFd5;->e:LbE5;

    iget-object v4, p0, LFd5;->f:Ljava/lang/Integer;

    invoke-static {v0, v1, v2, v3, v4}, LYd5;->D(LYd5;ZLKY;LbE5;Ljava/lang/Integer;)V

    return-void
.end method
