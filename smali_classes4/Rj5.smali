.class public final synthetic LRj5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LSj5;


# direct methods
.method public synthetic constructor <init>(LSj5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRj5;->b:LSj5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LRj5;->b:LSj5;

    invoke-static {v0}, LSj5;->Pl(LSj5;)V

    return-void
.end method
