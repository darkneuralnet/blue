.class public final synthetic Lmv6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/google/ar/core/Anchor;


# direct methods
.method public synthetic constructor <init>(Lcom/google/ar/core/Anchor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv6;->b:Lcom/google/ar/core/Anchor;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmv6;->b:Lcom/google/ar/core/Anchor;

    invoke-static {v0}, Lfv6$j;->a(Lcom/google/ar/core/Anchor;)Lco/bird/android/buava/Optional;

    move-result-object v0

    return-object v0
.end method
