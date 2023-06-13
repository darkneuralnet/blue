.class public LcZ3$a$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcZ3$a;->subscribe(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/y;

.field public final synthetic b:LcZ3$a;


# direct methods
.method public constructor <init>(LcZ3$a;Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, LcZ3$a$a;->b:LcZ3$a;

    iput-object p2, p0, LcZ3$a$a;->a:Lio/reactivex/y;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p2, p0, LcZ3$a$a;->a:Lio/reactivex/y;

    invoke-static {p1}, LBy0;->c(Landroid/content/Context;)LBy0;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method
