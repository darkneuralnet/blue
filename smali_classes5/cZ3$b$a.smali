.class public LcZ3$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcZ3$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/E$c;

.field public final synthetic c:LcZ3$b;


# direct methods
.method public constructor <init>(LcZ3$b;Lio/reactivex/E$c;)V
    .locals 0

    iput-object p1, p0, LcZ3$b$a;->c:LcZ3$b;

    iput-object p2, p0, LcZ3$b$a;->b:Lio/reactivex/E$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, LcZ3$b$a;->c:LcZ3$b;

    iget-object v0, v0, LcZ3$b;->b:Lio/reactivex/functions/a;

    invoke-interface {v0}, Lio/reactivex/functions/a;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LcZ3$b$a;->c:LcZ3$b;

    iget-object v1, v1, LcZ3$b;->c:LcZ3;

    const-string v2, "Could not unregister receiver in UI Thread"

    invoke-virtual {v1, v2, v0}, LcZ3;->d(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    iget-object v0, p0, LcZ3$b$a;->b:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void
.end method
