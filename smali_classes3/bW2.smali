.class public final synthetic LbW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LeW2;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LeW2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbW2;->b:LeW2;

    iput-object p2, p0, LbW2;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LbW2;->b:LeW2;

    iget-object v1, p0, LbW2;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LeW2;->d(LeW2;Ljava/lang/String;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
