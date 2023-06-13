.class public final synthetic Lih6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lkh6;


# direct methods
.method public synthetic constructor <init>(Lkh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih6;->b:Lkh6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lih6;->b:Lkh6;

    invoke-static {v0}, Lkh6;->b(Lkh6;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
