.class public Lxu6$a;
.super Lpa0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxu6;->r()Lpa0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxu6;


# direct methods
.method public constructor <init>(Lxu6;)V
    .locals 0

    iput-object p1, p0, Lxu6$a;->a:Lxu6;

    invoke-direct {p0}, Lpa0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lxa0;)V
    .locals 2

    invoke-super {p0, p1}, Lpa0;->b(Lxa0;)V

    iget-object v0, p0, Lxu6$a;->a:Lxu6;

    iget-object v0, v0, Lxu6;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    invoke-virtual {v1}, Landroidx/camera/core/p;->r()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-static {p1, v1}, Lxu6;->D(Lxa0;Landroidx/camera/core/impl/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method
