.class public LLA6$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLA6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:LLA6;


# direct methods
.method public constructor <init>(LLA6;)V
    .locals 0

    iput-object p1, p0, LLA6$c;->b:LLA6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LLA6$a;

    iget-object v0, p0, LLA6$c;->b:LLA6;

    invoke-virtual {v0, p1}, LLA6;->n(LLA6$a;)V

    return v1

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LLA6$a;

    iget-object v0, p0, LLA6$c;->b:LLA6;

    iget-object v0, v0, LLA6;->d:LUI4;

    invoke-virtual {v0, p1}, LUI4;->d(LLY5;)V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
