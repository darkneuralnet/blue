.class public Lnd5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd5;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "Lnd5$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lnd5;


# direct methods
.method public constructor <init>(Lnd5;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lnd5$a;->c:Lnd5;

    iput-object p2, p0, Lnd5$a;->b:Landroid/content/Context;

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
            "Lnd5$b;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lnd5$a$a;

    invoke-direct {v0, p0, p1}, Lnd5$a$a;-><init>(Lnd5$a;Lio/reactivex/y;)V

    iget-object v1, p0, Lnd5$a;->b:Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v1, Lnd5$a$b;

    invoke-direct {v1, p0, v0}, Lnd5$a$b;-><init>(Lnd5$a;Landroid/content/BroadcastReceiver;)V

    invoke-interface {p1, v1}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    return-void
.end method
