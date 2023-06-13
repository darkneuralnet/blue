.class public Lcom/google/mlkit/common/internal/CommonComponentRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 12

    sget-object v0, LZy5;->b:LEs0;

    const-class v1, LTU2;

    invoke-static {v1}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    const-class v2, LyU2;

    invoke-static {v2}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    sget-object v3, Lbf7;->a:Lbf7;

    invoke-virtual {v1, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    const-class v3, LzU2;

    invoke-static {v3}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v4

    sget-object v5, LzC7;->a:LzC7;

    invoke-virtual {v4, v5}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v4

    invoke-virtual {v4}, LEs0$b;->d()LEs0;

    move-result-object v4

    const-class v5, Lhw4;

    invoke-static {v5}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v5

    const-class v6, Lhw4$a;

    invoke-static {v6}, Lk01;->m(Ljava/lang/Class;)Lk01;

    move-result-object v7

    invoke-virtual {v5, v7}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v5

    sget-object v7, LlQ7;->a:LlQ7;

    invoke-virtual {v5, v7}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v5

    invoke-virtual {v5}, LEs0$b;->d()LEs0;

    move-result-object v5

    const-class v7, LIh1;

    invoke-static {v7}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v7

    invoke-static {v3}, Lk01;->l(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v7, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v3

    sget-object v7, LuY7;->a:LuY7;

    invoke-virtual {v3, v7}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v3

    invoke-virtual {v3}, LEs0$b;->d()LEs0;

    move-result-object v7

    const-class v3, LPj0;

    invoke-static {v3}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v8

    sget-object v9, LE68;->a:LE68;

    invoke-virtual {v8, v9}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v8

    invoke-virtual {v8}, LEs0$b;->d()LEs0;

    move-result-object v8

    const-class v9, Lel0;

    invoke-static {v9}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v9

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v9, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v3

    sget-object v9, LJe8;->a:LJe8;

    invoke-virtual {v3, v9}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v3

    invoke-virtual {v3}, LEs0$b;->d()LEs0;

    move-result-object v9

    const-class v3, Lym8;

    invoke-static {v3}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v10

    invoke-static {v2}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v10, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    sget-object v10, Lxm8;->a:Lxm8;

    invoke-virtual {v2, v10}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v2

    invoke-virtual {v2}, LEs0$b;->d()LEs0;

    move-result-object v10

    invoke-static {v6}, LEs0;->m(Ljava/lang/Class;)LEs0$b;

    move-result-object v2

    invoke-static {v3}, Lk01;->l(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v2, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    sget-object v3, Lxt8;->a:Lxt8;

    invoke-virtual {v2, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v2

    invoke-virtual {v2}, LEs0$b;->d()LEs0;

    move-result-object v11

    move-object v2, v4

    move-object v3, v5

    move-object v4, v7

    move-object v5, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v11

    invoke-static/range {v0 .. v8}, LCu7;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LCu7;

    move-result-object v0

    return-object v0
.end method
