.class public final synthetic LFR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LJR;


# direct methods
.method public synthetic constructor <init>(LJR;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFR;->b:LJR;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFR;->b:LJR;

    invoke-static {v0}, LJR;->p(LJR;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
