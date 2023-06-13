.class public final synthetic LR90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# instance fields
.field public final synthetic a:LP90$c;


# direct methods
.method public synthetic constructor <init>(LP90$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR90;->a:LP90$c;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1

    iget-object v0, p0, LR90;->a:LP90$c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, LP90$c;->b(LP90$c;Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
