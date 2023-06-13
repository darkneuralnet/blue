.class public final synthetic LQ09;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lt19;


# direct methods
.method public synthetic constructor <init>(Lt19;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ09;->b:Lt19;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQ09;->b:Lt19;

    invoke-virtual {v0}, Lt19;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
