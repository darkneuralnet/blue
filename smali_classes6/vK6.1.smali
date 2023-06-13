.class public final LvK6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:LxK6;


# direct methods
.method public constructor <init>(LxK6;)V
    .locals 0

    iput-object p1, p0, LvK6;->c:LxK6;

    invoke-direct {p0}, LjK6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LvK6;->c:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->m(LzK6;)V

    iget-object v0, p0, LvK6;->c:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LzK6;->o(LzK6;Landroid/os/IInterface;)V

    iget-object v0, p0, LvK6;->c:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->q(LzK6;)V

    return-void
.end method
