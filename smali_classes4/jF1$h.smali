.class public LjF1$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjF1;->e([Lco/bird/android/model/persistence/PendingScanEntity;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:[Lco/bird/android/model/persistence/PendingScanEntity;

.field public final synthetic c:LjF1;


# direct methods
.method public constructor <init>(LjF1;[Lco/bird/android/model/persistence/PendingScanEntity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LjF1$h;->c:LjF1;

    iput-object p2, p0, LjF1$h;->b:[Lco/bird/android/model/persistence/PendingScanEntity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LjF1$h;->c:LjF1;

    invoke-static {v0}, LjF1;->i(LjF1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LjF1$h;->c:LjF1;

    invoke-static {v0}, LjF1;->j(LjF1;)Lcf1;

    move-result-object v0

    iget-object v1, p0, LjF1$h;->b:[Lco/bird/android/model/persistence/PendingScanEntity;

    invoke-virtual {v0, v1}, Lcf1;->l([Ljava/lang/Object;)V

    iget-object v0, p0, LjF1$h;->c:LjF1;

    invoke-static {v0}, LjF1;->i(LjF1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LjF1$h;->c:LjF1;

    invoke-static {v0}, LjF1;->i(LjF1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->g()V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LjF1$h;->c:LjF1;

    invoke-static {v1}, LjF1;->i(LjF1;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LjF1$h;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
