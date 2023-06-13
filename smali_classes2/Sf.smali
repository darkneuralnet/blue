.class public final synthetic LSf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LPf;


# direct methods
.method public synthetic constructor <init>(LPf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSf;->b:LPf;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSf;->b:LPf;

    invoke-static {v0}, LPf$c;->c(LPf;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
