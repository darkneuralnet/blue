.class public final synthetic Loq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lrq;


# direct methods
.method public synthetic constructor <init>(Lrq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loq;->b:Lrq;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Loq;->b:Lrq;

    invoke-static {v0}, Lrq;->q(Lrq;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
