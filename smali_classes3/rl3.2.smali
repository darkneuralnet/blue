.class public final synthetic Lrl3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LQl3;


# direct methods
.method public synthetic constructor <init>(LQl3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl3;->b:LQl3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrl3;->b:LQl3;

    invoke-static {v0}, LQl3;->K(LQl3;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
