.class public final LRL0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVu2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRL0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LRL0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LRL0$b;->b:LRL0$b;

    iput-object p1, p0, LRL0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LSL0;)V
    .locals 0

    invoke-direct {p0, p1}, LRL0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(LTu2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRL0$b;->b(LTu2;)LTu2;

    return-void
.end method

.method public final b(LTu2;)LTu2;
    .locals 1

    iget-object v0, p0, LRL0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r1()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    invoke-static {p1, v0}, LUu2;->a(LTu2;Landroid/content/Intent;)V

    invoke-virtual {p0}, LRL0$b;->c()Lbv2;

    move-result-object v0

    invoke-static {p1, v0}, LUu2;->c(LTu2;Lbv2;)V

    return-object p1
.end method

.method public final c()Lbv2;
    .locals 2

    new-instance v0, Lbv2;

    iget-object v1, p0, LRL0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->r()Lgl;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgl;

    invoke-direct {v0, v1}, Lbv2;-><init>(Lgl;)V

    return-object v0
.end method
