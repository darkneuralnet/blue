.class public final synthetic LHA1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHA1;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LHA1;->a:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0, p1}, LIA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
