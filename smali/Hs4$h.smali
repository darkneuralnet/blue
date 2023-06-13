.class public final LHs4$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHs4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field public final a:LFP2$a;

.field public b:Ljava/util/concurrent/Executor;

.field public c:Lwb1;

.field public d:Lwb1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LHs4$h;->b:Ljava/util/concurrent/Executor;

    sget-object v0, LHs4;->i0:Lwb1;

    iput-object v0, p0, LHs4$h;->c:Lwb1;

    iput-object v0, p0, LHs4$h;->d:Lwb1;

    invoke-static {}, LFP2;->a()LFP2$a;

    move-result-object v0

    iput-object v0, p0, LHs4$h;->a:LFP2$a;

    return-void
.end method

.method public static synthetic a(LRc4;Lwp6$a;)V
    .locals 0

    invoke-static {p0, p1}, LHs4$h;->c(LRc4;Lwp6$a;)V

    return-void
.end method

.method public static synthetic c(LRc4;Lwp6$a;)V
    .locals 0

    invoke-virtual {p1, p0}, Lwp6$a;->e(LRc4;)Lwp6$a;

    return-void
.end method


# virtual methods
.method public b()LHs4;
    .locals 5

    new-instance v0, LHs4;

    iget-object v1, p0, LHs4$h;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, LHs4$h;->a:LFP2$a;

    invoke-virtual {v2}, LFP2$a;->a()LFP2;

    move-result-object v2

    iget-object v3, p0, LHs4$h;->c:Lwb1;

    iget-object v4, p0, LHs4$h;->d:Lwb1;

    invoke-direct {v0, v1, v2, v3, v4}, LHs4;-><init>(Ljava/util/concurrent/Executor;LFP2;Lwb1;Lwb1;)V

    return-object v0
.end method

.method public d(LRc4;)LHs4$h;
    .locals 2

    const-string v0, "The specified quality selector can\'t be null."

    invoke-static {p1, v0}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LHs4$h;->a:LFP2$a;

    new-instance v1, LIs4;

    invoke-direct {v1, p1}, LIs4;-><init>(LRc4;)V

    invoke-virtual {v0, v1}, LFP2$a;->b(Lrz0;)LFP2$a;

    return-object p0
.end method
