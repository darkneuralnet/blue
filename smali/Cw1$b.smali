.class public LCw1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCw1;->d(Landroid/content/Context;Lzw1;ILjava/util/concurrent/Executor;LP80;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrz0<",
        "LCw1$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LP80;


# direct methods
.method public constructor <init>(LP80;)V
    .locals 0

    iput-object p1, p0, LCw1$b;->a:LP80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LCw1$e;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, LCw1$e;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, LCw1$e;-><init>(I)V

    :cond_0
    iget-object v0, p0, LCw1$b;->a:LP80;

    invoke-virtual {v0, p1}, LP80;->b(LCw1$e;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LCw1$e;

    invoke-virtual {p0, p1}, LCw1$b;->a(LCw1$e;)V

    return-void
.end method
