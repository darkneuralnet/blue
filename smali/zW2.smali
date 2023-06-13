.class public final synthetic LzW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LBW2;


# direct methods
.method public synthetic constructor <init>(LBW2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzW2;->b:LBW2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LzW2;->b:LBW2;

    invoke-static {v0}, LBW2;->a(LBW2;)V

    return-void
.end method
