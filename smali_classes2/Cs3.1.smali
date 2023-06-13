.class public final synthetic LCs3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lts3;


# direct methods
.method public synthetic constructor <init>(Lts3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCs3;->b:Lts3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LCs3;->b:Lts3;

    invoke-static {v0}, Lts3$E;->a(Lts3;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
