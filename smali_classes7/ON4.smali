.class public LON4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH80;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LON4$a;,
        LON4$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "F:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LH80<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final d:LON4$b;


# instance fields
.field public final b:LlI6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LlI6<",
            "TF;>;"
        }
    .end annotation
.end field

.field public final c:LON4$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LON4$b<",
            "TE;TF;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LON4$a;

    invoke-direct {v0}, LON4$a;-><init>()V

    sput-object v0, LON4;->d:LON4$b;

    return-void
.end method

.method public constructor <init>(LlI6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlI6<",
            "TF;>;)V"
        }
    .end annotation

    sget-object v0, LON4;->d:LON4$b;

    invoke-direct {p0, p1, v0}, LON4;-><init>(LlI6;LON4$b;)V

    return-void
.end method

.method public constructor <init>(LlI6;LON4$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlI6<",
            "TF;>;",
            "LON4$b<",
            "TE;TF;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LON4;->b:LlI6;

    iput-object p2, p0, LON4;->c:LON4$b;

    return-void
.end method


# virtual methods
.method public a(Lx80;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TE;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, LON4;->b:LlI6;

    if-eqz p1, :cond_0

    invoke-static {p2}, LNN4;->h(Ljava/lang/Throwable;)LNN4;

    move-result-object p2

    invoke-virtual {p1, p2}, LlI6;->onError(Lsg1;)V

    :cond_0
    return-void
.end method

.method public b(Lx80;LHM4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TE;>;",
            "LHM4<",
            "TE;>;)V"
        }
    .end annotation

    iget-object p1, p0, LON4;->b:LlI6;

    if-eqz p1, :cond_1

    invoke-virtual {p2}, LHM4;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LON4;->b:LlI6;

    iget-object v0, p0, LON4;->c:LON4$b;

    invoke-virtual {p2}, LHM4;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p2}, LON4$b;->extract(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, LlI6;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LON4;->b:LlI6;

    invoke-static {p2}, LNN4;->g(LHM4;)LNN4;

    move-result-object p2

    invoke-virtual {p1, p2}, LlI6;->onError(Lsg1;)V

    :cond_1
    :goto_0
    return-void
.end method
