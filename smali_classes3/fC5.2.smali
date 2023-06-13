.class public final synthetic LfC5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LeC5;


# direct methods
.method public synthetic constructor <init>(LeC5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfC5;->b:LeC5;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LfC5;->b:LeC5;

    invoke-static {v0}, LeC5$f;->a(LeC5;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
