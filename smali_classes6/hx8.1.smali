.class public final Lhx8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:J

.field public final synthetic c:LRC8;


# direct methods
.method public constructor <init>(LRC8;J)V
    .locals 0

    iput-object p1, p0, Lhx8;->c:LRC8;

    iput-wide p2, p0, Lhx8;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lhx8;->c:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->k:Lzg8;

    iget-wide v1, p0, Lhx8;->b:J

    invoke-virtual {v0, v1, v2}, Lzg8;->b(J)V

    iget-object v0, p0, Lhx8;->c:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    iget-wide v1, p0, Lhx8;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Session timeout duration set"

    invoke-virtual {v0, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
