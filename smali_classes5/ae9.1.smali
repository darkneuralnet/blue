.class public final Lae9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe9;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;LSd9;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lae9;->a:Ljava/util/List;

    invoke-virtual {p2}, LSd9;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcg9;

    invoke-direct {v1, p1, p2}, Lcg9;-><init>(Landroid/content/Context;LSd9;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lqf9;)V
    .locals 2

    iget-object v0, p0, Lae9;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLe9;

    invoke-interface {v1, p1}, LLe9;->a(Lqf9;)V

    goto :goto_0

    :cond_0
    return-void
.end method
