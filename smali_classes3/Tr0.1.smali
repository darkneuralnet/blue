.class public final synthetic LTr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lzr0;


# direct methods
.method public synthetic constructor <init>(Lzr0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTr0;->b:Lzr0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LTr0;->b:Lzr0;

    invoke-static {v0}, Lzr0$z;->a(Lzr0;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method