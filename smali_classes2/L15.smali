.class public final synthetic LL15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Li25;


# direct methods
.method public synthetic constructor <init>(Li25;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL15;->b:Li25;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LL15;->b:Li25;

    invoke-static {v0}, Li25;->a0(Li25;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
