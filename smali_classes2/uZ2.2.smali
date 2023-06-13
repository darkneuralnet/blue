.class public final synthetic LuZ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LC03;


# direct methods
.method public synthetic constructor <init>(LC03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuZ2;->b:LC03;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LuZ2;->b:LC03;

    invoke-static {v0}, LC03;->T(LC03;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
