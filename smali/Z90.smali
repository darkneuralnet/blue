.class public final synthetic LZ90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# instance fields
.field public final synthetic a:LP90$f;


# direct methods
.method public synthetic constructor <init>(LP90$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ90;->a:LP90$f;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1

    iget-object v0, p0, LZ90;->a:LP90$f;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, LP90$f;->d(LP90$f;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
