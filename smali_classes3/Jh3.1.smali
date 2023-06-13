.class public final synthetic LJh3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LNh3;


# direct methods
.method public synthetic constructor <init>(LNh3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJh3;->b:LNh3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJh3;->b:LNh3;

    invoke-static {v0}, LNh3;->b(LNh3;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
