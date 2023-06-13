.class public final synthetic Lwc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lyc0;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/util/concurrent/Executor;

.field public final synthetic e:LO80$a;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Lyc0;Landroid/content/Context;Ljava/util/concurrent/Executor;LO80$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc0;->b:Lyc0;

    iput-object p2, p0, Lwc0;->c:Landroid/content/Context;

    iput-object p3, p0, Lwc0;->d:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lwc0;->e:LO80$a;

    iput-wide p5, p0, Lwc0;->f:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lwc0;->b:Lyc0;

    iget-object v1, p0, Lwc0;->c:Landroid/content/Context;

    iget-object v2, p0, Lwc0;->d:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lwc0;->e:LO80$a;

    iget-wide v4, p0, Lwc0;->f:J

    invoke-static/range {v0 .. v5}, Lyc0;->b(Lyc0;Landroid/content/Context;Ljava/util/concurrent/Executor;LO80$a;J)V

    return-void
.end method
