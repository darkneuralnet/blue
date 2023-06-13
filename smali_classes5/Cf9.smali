.class public final synthetic LCf9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lgg9;


# direct methods
.method public synthetic constructor <init>(Lgg9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCf9;->b:Lgg9;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LCf9;->b:Lgg9;

    invoke-virtual {v0}, Lgg9;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
