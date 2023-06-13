.class public LcZ3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcZ3;->a(Landroid/content/Context;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "LBy0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/content/IntentFilter;

.field public final synthetic d:LcZ3;


# direct methods
.method public constructor <init>(LcZ3;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    iput-object p1, p0, LcZ3$a;->d:LcZ3;

    iput-object p2, p0, LcZ3$a;->b:Landroid/content/Context;

    iput-object p3, p0, LcZ3$a;->c:Landroid/content/IntentFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "LBy0;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, LcZ3$a$a;

    invoke-direct {v0, p0, p1}, LcZ3$a$a;-><init>(LcZ3$a;Lio/reactivex/y;)V

    iget-object v1, p0, LcZ3$a;->b:Landroid/content/Context;

    iget-object v2, p0, LcZ3$a;->c:Landroid/content/IntentFilter;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v1, p0, LcZ3$a;->d:LcZ3;

    new-instance v2, LcZ3$a$b;

    invoke-direct {v2, p0, v0}, LcZ3$a$b;-><init>(LcZ3$a;Landroid/content/BroadcastReceiver;)V

    invoke-static {v1, v2}, LcZ3;->b(LcZ3;Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/y;->b(Lio/reactivex/disposables/c;)V

    return-void
.end method
