.class public LKw2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKw2;->a()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LKw2;


# direct methods
.method public constructor <init>(LKw2;)V
    .locals 0

    iput-object p1, p0, LKw2$a;->b:LKw2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LKw2$a;->b:LKw2;

    iget-object v0, v0, LKw2;->b:LNw2;

    invoke-interface {v0}, LNw2;->b()Z

    move-result v0

    new-instance v1, LKw2$a$a;

    invoke-direct {v1, p0, p1}, LKw2$a$a;-><init>(LKw2$a;Lio/reactivex/y;)V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LKw2$a;->b:LKw2;

    iget-object v0, v0, LKw2;->a:Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.location.MODE_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, LKw2$a$b;

    invoke-direct {v0, p0, v1}, LKw2$a$b;-><init>(LKw2$a;Landroid/content/BroadcastReceiver;)V

    invoke-interface {p1, v0}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    return-void
.end method
