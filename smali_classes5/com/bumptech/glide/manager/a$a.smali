.class public Lcom/bumptech/glide/manager/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCq2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/manager/a;->b(Landroid/content/Context;Lcom/bumptech/glide/a;Landroidx/lifecycle/f;Landroidx/fragment/app/FragmentManager;Z)LUI4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroidx/lifecycle/f;

.field public final synthetic c:Lcom/bumptech/glide/manager/a;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/manager/a;Landroidx/lifecycle/f;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/manager/a$a;->c:Lcom/bumptech/glide/manager/a;

    iput-object p2, p0, Lcom/bumptech/glide/manager/a$a;->b:Landroidx/lifecycle/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/manager/a$a;->c:Lcom/bumptech/glide/manager/a;

    iget-object v0, v0, Lcom/bumptech/glide/manager/a;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/bumptech/glide/manager/a$a;->b:Landroidx/lifecycle/f;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    return-void
.end method
