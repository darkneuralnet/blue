.class public final LRP8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:J

.field public final c:J

.field public final synthetic d:LcQ8;


# direct methods
.method public constructor <init>(LcQ8;JJ)V
    .locals 0

    iput-object p1, p0, LRP8;->d:LcQ8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LRP8;->b:J

    iput-wide p4, p0, LRP8;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LRP8;->d:LcQ8;

    iget-object v0, v0, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LGP8;

    invoke-direct {v1, p0}, LGP8;-><init>(LRP8;)V

    invoke-virtual {v0, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method
