.class public final synthetic LpD5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LmD5;


# direct methods
.method public synthetic constructor <init>(LmD5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpD5;->b:LmD5;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LpD5;->b:LmD5;

    invoke-static {v0}, LmD5$i;->a(LmD5;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
