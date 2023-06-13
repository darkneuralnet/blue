.class public final synthetic Lvm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Len9;


# direct methods
.method public synthetic constructor <init>(Len9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvm9;->b:Len9;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvm9;->b:Len9;

    invoke-virtual {v0}, Len9;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
