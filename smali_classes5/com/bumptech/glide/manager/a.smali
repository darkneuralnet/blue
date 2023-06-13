.class public final Lcom/bumptech/glide/manager/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/manager/a$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/lifecycle/f;",
            "LUI4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/bumptech/glide/manager/b$b;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/manager/b$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/manager/a;->a:Ljava/util/Map;

    iput-object p1, p0, Lcom/bumptech/glide/manager/a;->b:Lcom/bumptech/glide/manager/b$b;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/f;)LUI4;
    .locals 1

    invoke-static {}, Lpi6;->b()V

    iget-object v0, p0, Lcom/bumptech/glide/manager/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUI4;

    return-object p1
.end method

.method public b(Landroid/content/Context;Lcom/bumptech/glide/a;Landroidx/lifecycle/f;Landroidx/fragment/app/FragmentManager;Z)LUI4;
    .locals 3

    invoke-static {}, Lpi6;->b()V

    invoke-virtual {p0, p3}, Lcom/bumptech/glide/manager/a;->a(Landroidx/lifecycle/f;)LUI4;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/bumptech/glide/manager/LifecycleLifecycle;

    invoke-direct {v0, p3}, Lcom/bumptech/glide/manager/LifecycleLifecycle;-><init>(Landroidx/lifecycle/f;)V

    iget-object v1, p0, Lcom/bumptech/glide/manager/a;->b:Lcom/bumptech/glide/manager/b$b;

    new-instance v2, Lcom/bumptech/glide/manager/a$b;

    invoke-direct {v2, p0, p4}, Lcom/bumptech/glide/manager/a$b;-><init>(Lcom/bumptech/glide/manager/a;Landroidx/fragment/app/FragmentManager;)V

    invoke-interface {v1, p2, v0, v2, p1}, Lcom/bumptech/glide/manager/b$b;->a(Lcom/bumptech/glide/a;Lwq2;LXI4;Landroid/content/Context;)LUI4;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/manager/a;->a:Ljava/util/Map;

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/bumptech/glide/manager/a$a;

    invoke-direct {p2, p0, p3}, Lcom/bumptech/glide/manager/a$a;-><init>(Lcom/bumptech/glide/manager/a;Landroidx/lifecycle/f;)V

    invoke-virtual {v0, p2}, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a(LCq2;)V

    if-eqz p5, :cond_0

    invoke-virtual {p1}, LUI4;->onStart()V

    :cond_0
    move-object v0, p1

    :cond_1
    return-object v0
.end method
