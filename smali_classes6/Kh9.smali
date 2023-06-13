.class public final LKh9;
.super LcH8;
.source "SourceFile"


# instance fields
.field public final synthetic c:LOo9;


# direct methods
.method public constructor <init>(LOo9;)V
    .locals 0

    iput-object p1, p0, LKh9;->c:LOo9;

    invoke-direct {p0}, LcH8;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, LKh9;->c:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    invoke-static {v0}, LOq9;->o(LOq9;)V

    iget-object v0, p0, LKh9;->c:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LOq9;->k(LOq9;Landroid/os/IInterface;)V

    iget-object v0, p0, LKh9;->c:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LOq9;->j(LOq9;Z)V

    return-void
.end method
