.class public final LfF8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LwE8;

.field public final synthetic c:LwE8;

.field public final synthetic d:J

.field public final synthetic e:Z

.field public final synthetic f:LnG8;


# direct methods
.method public constructor <init>(LnG8;LwE8;LwE8;JZ)V
    .locals 0

    iput-object p1, p0, LfF8;->f:LnG8;

    iput-object p2, p0, LfF8;->b:LwE8;

    iput-object p3, p0, LfF8;->c:LwE8;

    iput-wide p4, p0, LfF8;->d:J

    iput-boolean p6, p0, LfF8;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, LfF8;->f:LnG8;

    iget-object v1, p0, LfF8;->b:LwE8;

    iget-object v2, p0, LfF8;->c:LwE8;

    iget-wide v3, p0, LfF8;->d:J

    iget-boolean v5, p0, LfF8;->e:Z

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LnG8;->s(LnG8;LwE8;LwE8;JZLandroid/os/Bundle;)V

    return-void
.end method
