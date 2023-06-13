.class public final synthetic Lal9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lmm9;


# direct methods
.method public synthetic constructor <init>(Lmm9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lal9;->b:Lmm9;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lal9;->b:Lmm9;

    invoke-virtual {v0}, Lmm9;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
