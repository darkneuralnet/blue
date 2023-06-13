.class public final synthetic Lji5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lki5;


# direct methods
.method public synthetic constructor <init>(Lki5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lji5;->b:Lki5;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lji5;->b:Lki5;

    invoke-static {v0}, Lki5;->b(Lki5;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
