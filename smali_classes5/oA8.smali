.class public final synthetic LoA8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LnZ8;


# direct methods
.method public synthetic constructor <init>(LnZ8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoA8;->b:LnZ8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LoA8;->b:LnZ8;

    invoke-virtual {v0}, LnZ8;->d()V

    return-void
.end method
