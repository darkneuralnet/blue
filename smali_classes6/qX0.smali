.class public final synthetic LqX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LtX0;


# direct methods
.method public synthetic constructor <init>(LtX0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqX0;->b:LtX0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LqX0;->b:LtX0;

    invoke-static {v0}, LtX0;->d(LtX0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
