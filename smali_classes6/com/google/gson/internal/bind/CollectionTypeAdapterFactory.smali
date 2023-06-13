.class public final Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCb6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$a;
    }
.end annotation


# instance fields
.field public final b:Lpz0;


# direct methods
.method public constructor <init>(Lpz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;->b:Lpz0;

    return-void
.end method


# virtual methods
.method public d(LoE1;LFb6;)LBb6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LoE1;",
            "LFb6<",
            "TT;>;)",
            "LBb6<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, LFb6;->getRawType()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, v1}, Lb;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, LFb6;->get(Ljava/lang/reflect/Type;)LFb6;

    move-result-object v1

    invoke-virtual {p1, v1}, LoE1;->p(LFb6;)LBb6;

    move-result-object v1

    iget-object v2, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;->b:Lpz0;

    invoke-virtual {v2, p2}, Lpz0;->b(LFb6;)LId3;

    move-result-object p2

    new-instance v2, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$a;

    invoke-direct {v2, p1, v0, v1, p2}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$a;-><init>(LoE1;Ljava/lang/reflect/Type;LBb6;LId3;)V

    return-object v2
.end method
