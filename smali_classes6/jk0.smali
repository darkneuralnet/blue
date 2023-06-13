.class public final Ljk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljk0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Ljava/util/concurrent/ExecutorService;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljk0;
    .locals 1

    invoke-static {}, Ljk0$a;->a()Ljk0;

    move-result-object v0

    return-object v0
.end method

.method public static c()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Lgk0$c;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Ljk0;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljk0;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method
