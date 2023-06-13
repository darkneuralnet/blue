.class public final synthetic LgV4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LwV4;


# direct methods
.method public synthetic constructor <init>(LwV4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgV4;->b:LwV4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LgV4;->b:LwV4;

    invoke-static {v0}, LwV4;->j(LwV4;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
