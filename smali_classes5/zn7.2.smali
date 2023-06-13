.class public final Lzn7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lyn7;
    .locals 7

    invoke-static {}, LOJ7;->E()LNJ7;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v0, v1}, LNJ7;->r(Ljava/lang/String;)LNJ7;

    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    invoke-virtual {v0, v1}, LNJ7;->q(Ljava/lang/String;)LNJ7;

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v0, v1}, LNJ7;->p(Ljava/lang/String;)LNJ7;

    sget v1, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    invoke-virtual {v0, v1}, LNJ7;->t(I)LNJ7;

    invoke-static {}, LRJ7;->E()LQJ7;

    move-result-object v1

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object v0

    check-cast v0, LOJ7;

    invoke-virtual {v1, v0}, LQJ7;->p(LOJ7;)LQJ7;

    invoke-static {}, LUJ7;->D()LTJ7;

    move-result-object v0

    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v2}, LTJ7;->q(Ljava/lang/String;)LTJ7;

    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v0, v2}, LTJ7;->A(Ljava/lang/String;)LTJ7;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v2}, LTJ7;->t(Ljava/lang/String;)LTJ7;

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v2}, LTJ7;->r(Ljava/lang/String;)LTJ7;

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v2}, LTJ7;->p(Ljava/lang/String;)LTJ7;

    invoke-virtual {v0}, LZt7;->l()Leu7;

    move-result-object v0

    check-cast v0, LUJ7;

    invoke-virtual {v1, v0}, LQJ7;->q(LUJ7;)LQJ7;

    invoke-static {}, LlY7;->a()LRy7;

    move-result-object v0

    invoke-virtual {v0}, LRy7;->F()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LQJ7;->r(Ljava/lang/String;)LQJ7;

    invoke-virtual {v1}, LZt7;->l()Leu7;

    move-result-object v0

    check-cast v0, LRJ7;

    invoke-static {}, LlY7;->b()LHz7;

    move-result-object v1

    invoke-static {}, LaK7;->D()LZJ7;

    move-result-object v2

    invoke-virtual {v1}, LHz7;->F()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LGz7;

    invoke-static {}, LXJ7;->E()LWJ7;

    move-result-object v4

    invoke-virtual {v3}, LGz7;->F()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, LWJ7;->p(Ljava/lang/String;)LWJ7;

    invoke-virtual {v3}, LGz7;->G()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, LWJ7;->r(Ljava/lang/String;)LWJ7;

    invoke-virtual {v3}, LGz7;->D()J

    move-result-wide v5

    long-to-int v3, v5

    invoke-virtual {v4, v3}, LWJ7;->q(I)LWJ7;

    invoke-virtual {v4}, LZt7;->l()Leu7;

    move-result-object v3

    check-cast v3, LXJ7;

    invoke-virtual {v2, v3}, LZJ7;->p(LXJ7;)LZJ7;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, LZt7;->l()Leu7;

    move-result-object v1

    check-cast v1, LaK7;

    new-instance v2, LAn7;

    invoke-direct {v2, v0, v1}, LAn7;-><init>(LRJ7;LaK7;)V

    return-object v2
.end method
