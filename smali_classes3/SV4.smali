.class public final synthetic LSV4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LtW4;


# direct methods
.method public synthetic constructor <init>(LtW4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSV4;->b:LtW4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSV4;->b:LtW4;

    invoke-static {v0}, LtW4;->z(LtW4;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
