.class public final LDF8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:J

.field public final synthetic c:LnG8;


# direct methods
.method public constructor <init>(LnG8;J)V
    .locals 0

    iput-object p1, p0, LDF8;->c:LnG8;

    iput-wide p2, p0, LDF8;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LDF8;->c:LnG8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->v()LaY7;

    move-result-object v0

    iget-wide v1, p0, LDF8;->b:J

    invoke-virtual {v0, v1, v2}, LaY7;->k(J)V

    iget-object v0, p0, LDF8;->c:LnG8;

    const/4 v1, 0x0

    iput-object v1, v0, LnG8;->e:LwE8;

    return-void
.end method
