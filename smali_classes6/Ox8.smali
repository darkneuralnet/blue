.class public final LOx8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public b:Lc69;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc69<",
            "TT;>;"
        }
    .end annotation
.end field

.field public c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lc69;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc69<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LOx8;->b:Lc69;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, LOx8;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(LOx8;)Lc69;
    .locals 0

    iget-object p0, p0, LOx8;->b:Lc69;

    return-object p0
.end method

.method public static synthetic b(LOx8;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, LOx8;->c:Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public final run()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LOx8;->b:Lc69;

    iput-object v0, p0, LOx8;->c:Ljava/util/concurrent/Executor;

    return-void
.end method
