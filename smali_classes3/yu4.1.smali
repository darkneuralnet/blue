.class public final synthetic Lyu4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Luu4;


# direct methods
.method public synthetic constructor <init>(Luu4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyu4;->b:Luu4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyu4;->b:Luu4;

    invoke-static {v0}, Luu4$h;->b(Luu4;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
