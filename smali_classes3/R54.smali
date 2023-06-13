.class public final synthetic LR54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lf64;


# direct methods
.method public synthetic constructor <init>(Lf64;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR54;->b:Lf64;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LR54;->b:Lf64;

    invoke-static {v0}, Lf64;->j(Lf64;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
