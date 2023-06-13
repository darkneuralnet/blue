.class public final synthetic Lcq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Leq0;


# direct methods
.method public synthetic constructor <init>(Leq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq0;->b:Leq0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcq0;->b:Leq0;

    invoke-static {v0}, Leq0;->c(Leq0;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
