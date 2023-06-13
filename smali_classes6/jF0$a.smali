.class public LjF0$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjF0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:LjF0;


# direct methods
.method public constructor <init>(LjF0;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, LjF0$a;->a:LjF0;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LkF0;

    iget-object v0, p0, LjF0$a;->a:LjF0;

    invoke-static {v0}, LjF0;->b(LjF0;)LcD1;

    move-result-object v0

    invoke-virtual {p1}, LkF0;->h()Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object p1

    invoke-virtual {v0, p1}, LcD1;->e(Lcom/google/android/gms/maps/model/PolylineOptions;)LMX3;

    move-result-object p1

    new-instance v0, LBZ0;

    iget-object v1, p0, LjF0$a;->a:LjF0;

    invoke-direct {v0, p1, v1}, LBZ0;-><init>(LMX3;LjF0;)V

    iget-object v1, p0, LjF0$a;->a:LjF0;

    invoke-static {v1}, LjF0;->c(LjF0;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LjF0$a;->a:LjF0;

    invoke-static {p1}, LjF0;->d(LjF0;)Lnf3;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LjF0$a;->a:LjF0;

    invoke-static {p1}, LjF0;->d(LjF0;)Lnf3;

    move-result-object p1

    invoke-interface {p1, v0}, Lnf3;->a(LhF0;)V

    :cond_0
    return-void
.end method
