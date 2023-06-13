.class public final synthetic LV16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LW16;


# direct methods
.method public synthetic constructor <init>(LW16;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV16;->b:LW16;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LV16;->b:LW16;

    invoke-static {v0}, LW16;->g(LW16;)V

    return-void
.end method
