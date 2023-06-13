.class public final synthetic LRr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lks;


# direct methods
.method public synthetic constructor <init>(Lks;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRr;->b:Lks;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRr;->b:Lks;

    invoke-static {v0}, Lks;->B(Lks;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
