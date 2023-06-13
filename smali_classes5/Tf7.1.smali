.class public final LTf7;
.super LWe8;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lbd5;


# direct methods
.method public constructor <init>(Lbd5;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, LTf7;->a:Lbd5;

    invoke-direct {p0, p2}, LWe8;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, LTf7;->a:Lbd5;

    invoke-static {v0, p1}, Lbd5;->d(Lbd5;Landroid/os/Message;)V

    return-void
.end method
