.class public final synthetic LQY4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;


# direct methods
.method public synthetic constructor <init>(Li25;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQY4;->b:Li25;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LQY4;->b:Li25;

    invoke-static {v0}, Li25;->f0(Li25;)V

    return-void
.end method
