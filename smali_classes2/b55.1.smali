.class public final synthetic Lb55;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LB55;


# direct methods
.method public synthetic constructor <init>(LB55;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb55;->b:LB55;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb55;->b:LB55;

    invoke-static {v0}, LB55;->Q(LB55;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
