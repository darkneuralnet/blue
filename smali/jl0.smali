.class public final Ljl0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljl0$b;,
        Ljl0$a;,
        Ljl0$c;
    }
.end annotation


# instance fields
.field public final a:Ljl0$b;


# direct methods
.method public constructor <init>(Ljl0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljl0;->a:Ljl0$b;

    return-void
.end method

.method public static b()Ljl0;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Ljl0;

    new-instance v1, Ljl0$a;

    invoke-direct {v1}, Ljl0$a;-><init>()V

    invoke-direct {v0, v1}, Ljl0;-><init>(Ljl0$b;)V

    return-object v0

    :cond_0
    new-instance v0, Ljl0;

    new-instance v1, Ljl0$c;

    invoke-direct {v1}, Ljl0$c;-><init>()V

    invoke-direct {v0, v1}, Ljl0;-><init>(Ljl0$b;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ljl0;->a:Ljl0$b;

    invoke-interface {v0}, Ljl0$b;->close()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Ljl0;->a:Ljl0$b;

    invoke-interface {v0}, Ljl0$b;->a()V

    return-void
.end method
