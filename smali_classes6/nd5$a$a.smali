.class public Lnd5$a$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd5$a;->subscribe(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/y;

.field public final synthetic b:Lnd5$a;


# direct methods
.method public constructor <init>(Lnd5$a;Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, Lnd5$a$a;->b:Lnd5$a;

    iput-object p2, p0, Lnd5$a$a;->a:Lio/reactivex/y;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p1, "android.bluetooth.adapter.extra.STATE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Lnd5;->a(I)Lnd5$b;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const-string v0, "Adapter state changed: %s"

    invoke-static {v0, p2}, Lye5;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lnd5$a$a;->a:Lio/reactivex/y;

    invoke-interface {p2, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method
