.class public final synthetic LEP4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LFP4;


# direct methods
.method public synthetic constructor <init>(LFP4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEP4;->b:LFP4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LEP4;->b:LFP4;

    invoke-static {v0}, LFP4;->S(LFP4;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
