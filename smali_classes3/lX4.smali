.class public final synthetic LlX4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LbX4;


# direct methods
.method public synthetic constructor <init>(LbX4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlX4;->b:LbX4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LlX4;->b:LbX4;

    invoke-static {v0}, LbX4$j$b;->b(LbX4;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
