.class public final synthetic LOo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LUo6;


# direct methods
.method public synthetic constructor <init>(LUo6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOo6;->b:LUo6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LOo6;->b:LUo6;

    invoke-static {v0}, LUo6;->Y(LUo6;)V

    return-void
.end method
