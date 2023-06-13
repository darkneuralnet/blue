.class public final synthetic LUo5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LO86;


# direct methods
.method public synthetic constructor <init>(LO86;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUo5;->b:LO86;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LUo5;->b:LO86;

    invoke-static {v0}, LYo5;->B0(LO86;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
