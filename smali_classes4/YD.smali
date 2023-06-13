.class public final synthetic LYD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lio/reactivex/Observable;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/Observable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYD;->b:Lio/reactivex/Observable;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYD;->b:Lio/reactivex/Observable;

    invoke-static {v0}, LZD;->i(Lio/reactivex/Observable;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
