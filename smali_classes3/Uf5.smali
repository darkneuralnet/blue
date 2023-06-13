.class public final synthetic LUf5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:[Lio/reactivex/c;


# direct methods
.method public synthetic constructor <init>([Lio/reactivex/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUf5;->b:[Lio/reactivex/c;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LUf5;->b:[Lio/reactivex/c;

    invoke-static {v0}, LYf5;->h([Lio/reactivex/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
