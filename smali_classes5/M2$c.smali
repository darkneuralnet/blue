.class public final LM2$c;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "LJd1<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final a:Lak2;

.field public final b:Z

.field public c:LVL4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVL4<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lak2;LJd1;Ljava/lang/ref/ReferenceQueue;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "LJd1<",
            "*>;",
            "Ljava/lang/ref/ReferenceQueue<",
            "-",
            "LJd1<",
            "*>;>;Z)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lak2;

    iput-object p1, p0, LM2$c;->a:Lak2;

    invoke-virtual {p2}, LJd1;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p4, :cond_0

    invoke-virtual {p2}, LJd1;->e()LVL4;

    move-result-object p1

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVL4;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LM2$c;->c:LVL4;

    invoke-virtual {p2}, LJd1;->f()Z

    move-result p1

    iput-boolean p1, p0, LM2$c;->b:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LM2$c;->c:LVL4;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    return-void
.end method
