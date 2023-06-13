.class public final synthetic LKy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lgy0;


# direct methods
.method public synthetic constructor <init>(Lgy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKy0;->b:Lgy0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKy0;->b:Lgy0;

    invoke-interface {v0}, Lgy0;->c()Lke5;

    move-result-object v0

    return-object v0
.end method
