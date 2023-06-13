.class public final synthetic Lik1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lgk1;


# direct methods
.method public synthetic constructor <init>(Lgk1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lik1;->b:Lgk1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lik1;->b:Lgk1;

    invoke-static {v0}, Lgk1$b;->b(Lgk1;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
