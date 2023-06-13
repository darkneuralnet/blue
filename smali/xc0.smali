.class public final synthetic Lxc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lyc0;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:J

.field public final synthetic e:LO80$a;


# direct methods
.method public synthetic constructor <init>(Lyc0;Ljava/util/concurrent/Executor;JLO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxc0;->b:Lyc0;

    iput-object p2, p0, Lxc0;->c:Ljava/util/concurrent/Executor;

    iput-wide p3, p0, Lxc0;->d:J

    iput-object p5, p0, Lxc0;->e:LO80$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lxc0;->b:Lyc0;

    iget-object v1, p0, Lxc0;->c:Ljava/util/concurrent/Executor;

    iget-wide v2, p0, Lxc0;->d:J

    iget-object v4, p0, Lxc0;->e:LO80$a;

    invoke-static {v0, v1, v2, v3, v4}, Lyc0;->c(Lyc0;Ljava/util/concurrent/Executor;JLO80$a;)V

    return-void
.end method
