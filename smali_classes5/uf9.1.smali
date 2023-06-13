.class public final Luf9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWe9;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lmf9;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luf9;->a:Ljava/util/List;

    invoke-virtual {p2}, Lmf9;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lph9;

    invoke-direct {v1, p1, p2}, Lph9;-><init>(Landroid/content/Context;Lmf9;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
