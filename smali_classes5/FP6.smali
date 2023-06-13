.class public final LFP6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3;


# instance fields
.field public final synthetic a:LjZ0;


# direct methods
.method public constructor <init>(LjZ0;)V
    .locals 0

    iput-object p1, p0, LFP6;->a:LjZ0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LAq2;)V
    .locals 2

    iget-object v0, p0, LFP6;->a:LjZ0;

    invoke-static {v0, p1}, LjZ0;->n(LjZ0;LAq2;)V

    iget-object p1, p0, LFP6;->a:LjZ0;

    invoke-static {p1}, LjZ0;->m(LjZ0;)Ljava/util/LinkedList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LcQ6;

    iget-object v1, p0, LFP6;->a:LjZ0;

    invoke-static {v1}, LjZ0;->l(LjZ0;)LAq2;

    move-result-object v1

    invoke-interface {v0, v1}, LcQ6;->a(LAq2;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LFP6;->a:LjZ0;

    invoke-static {p1}, LjZ0;->m(LjZ0;)Ljava/util/LinkedList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    iget-object p1, p0, LFP6;->a:LjZ0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LjZ0;->o(LjZ0;Landroid/os/Bundle;)V

    return-void
.end method
