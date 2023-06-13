.class public final synthetic LHX4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LLX4;


# direct methods
.method public synthetic constructor <init>(LLX4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHX4;->b:LLX4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LHX4;->b:LLX4;

    invoke-static {v0}, LLX4;->L1(LLX4;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
