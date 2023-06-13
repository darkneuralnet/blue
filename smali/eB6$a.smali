.class public LeB6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LeB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Liz0;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:LeB6;


# direct methods
.method public constructor <init>(LeB6;Liz0;LLr2;I)V
    .locals 0

    iput-object p1, p0, LeB6$a;->h:LeB6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LeB6$a;->a:Ljava/lang/ref/WeakReference;

    iget-object p1, p2, Liz0;->Q:LXy0;

    invoke-virtual {p3, p1}, LLr2;->y(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LeB6$a;->b:I

    iget-object p1, p2, Liz0;->R:LXy0;

    invoke-virtual {p3, p1}, LLr2;->y(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LeB6$a;->c:I

    iget-object p1, p2, Liz0;->S:LXy0;

    invoke-virtual {p3, p1}, LLr2;->y(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LeB6$a;->d:I

    iget-object p1, p2, Liz0;->T:LXy0;

    invoke-virtual {p3, p1}, LLr2;->y(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LeB6$a;->e:I

    iget-object p1, p2, Liz0;->U:LXy0;

    invoke-virtual {p3, p1}, LLr2;->y(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LeB6$a;->f:I

    iput p4, p0, LeB6$a;->g:I

    return-void
.end method
