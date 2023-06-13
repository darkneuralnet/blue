.class public final LFM0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lza3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:LFM0$b;


# direct methods
.method public constructor <init>(LFM0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFM0$c;->a:LFM0$b;

    return-void
.end method

.method public synthetic constructor <init>(LFM0$b;LHM0;)V
    .locals 0

    invoke-direct {p0, p1}, LFM0$c;-><init>(LFM0$b;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Lza3;
    .locals 3

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LFM0$d;

    iget-object v1, p0, LFM0$c;->a:LFM0$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, LFM0$d;-><init>(LFM0$b;Landroid/view/View;LIM0;)V

    return-object v0
.end method
