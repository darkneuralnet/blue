.class public Lza6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LkP1;


# direct methods
.method public constructor <init>(LkP1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza6;->a:LkP1;

    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lza6;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LkP1$a;->c5(Landroid/os/IBinder;)LkP1;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lza6;

    invoke-direct {v0, p0}, Lza6;-><init>(LkP1;)V

    return-object v0
.end method
