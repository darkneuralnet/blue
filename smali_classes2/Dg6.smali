.class public final synthetic LDg6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LKg6;


# direct methods
.method public synthetic constructor <init>(LKg6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDg6;->b:LKg6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDg6;->b:LKg6;

    invoke-static {v0}, LKg6;->a(LKg6;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
