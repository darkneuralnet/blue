.class public final LSP0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUj5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSP0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LSP0$b;


# direct methods
.method public constructor <init>(LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LSP0$b;->b:LSP0$b;

    iput-object p1, p0, LSP0$b;->a:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LTP0;)V
    .locals 0

    invoke-direct {p0, p1}, LSP0$b;-><init>(LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LSP0$b;->i(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;

    return-void
.end method

.method public b(Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LSP0$b;->k(Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;)Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;

    return-void
.end method

.method public c(Lb02;)V
    .locals 0

    invoke-virtual {p0, p1}, LSP0$b;->h(Lb02;)Lb02;

    return-void
.end method

.method public d(Lco/bird/android/feature/transferorder/scanner/outbound/OutboundScanActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LSP0$b;->j(Lco/bird/android/feature/transferorder/scanner/outbound/OutboundScanActivity;)Lco/bird/android/feature/transferorder/scanner/outbound/OutboundScanActivity;

    return-void
.end method

.method public final e()Lg02;
    .locals 2

    new-instance v0, Lg02;

    iget-object v1, p0, LSP0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    invoke-direct {v0, v1}, Lg02;-><init>(LO86;)V

    return-object v0
.end method

.method public final f()Lw02;
    .locals 2

    new-instance v0, Lw02;

    iget-object v1, p0, LSP0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lw02;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final g()La12;
    .locals 4

    new-instance v0, La12;

    iget-object v1, p0, LSP0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, LSP0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LSP0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    invoke-direct {v0, v1, v2, v3}, La12;-><init>(LO86;Le13;LTq4;)V

    return-object v0
.end method

.method public final h(Lb02;)Lb02;
    .locals 1

    invoke-virtual {p0}, LSP0$b;->e()Lg02;

    move-result-object v0

    invoke-static {p1, v0}, Lc02;->b(Lb02;Lg02;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, Lc02;->c(Lb02;LTq4;)V

    return-object p1
.end method

.method public final i(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;
    .locals 1

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LSP0$b;->g()La12;

    move-result-object v0

    invoke-static {p1, v0}, Lt02;->c(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;La12;)V

    invoke-virtual {p0}, LSP0$b;->f()Lw02;

    move-result-object v0

    invoke-static {p1, v0}, Lt02;->a(Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;Lw02;)V

    return-object p1
.end method

.method public final j(Lco/bird/android/feature/transferorder/scanner/outbound/OutboundScanActivity;)Lco/bird/android/feature/transferorder/scanner/outbound/OutboundScanActivity;
    .locals 1

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LSP0$b;->l()Lbz3;

    move-result-object v0

    invoke-static {p1, v0}, LsC;->a(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;Lbz3;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->m2()Lwi2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi2;

    invoke-static {p1, v0}, LsC;->b(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;Lwi2;)V

    invoke-virtual {p0}, LSP0$b;->m()LFz3;

    move-result-object v0

    invoke-static {p1, v0}, LYy3;->b(Lco/bird/android/feature/transferorder/scanner/outbound/OutboundScanActivity;LFz3;)V

    return-object p1
.end method

.method public final k(Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;)Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;
    .locals 1

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LSP0$b;->l()Lbz3;

    move-result-object v0

    invoke-static {p1, v0}, LsC;->a(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;Lbz3;)V

    iget-object v0, p0, LSP0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->m2()Lwi2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi2;

    invoke-static {p1, v0}, LsC;->b(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;Lwi2;)V

    invoke-virtual {p0}, LSP0$b;->n()LYo5;

    move-result-object v0

    invoke-static {p1, v0}, LTo5;->b(Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;LYo5;)V

    return-object p1
.end method

.method public final l()Lbz3;
    .locals 2

    new-instance v0, Lbz3;

    iget-object v1, p0, LSP0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lbz3;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final m()LFz3;
    .locals 4

    new-instance v0, LFz3;

    iget-object v1, p0, LSP0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, LSP0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LSP0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    invoke-direct {v0, v1, v2, v3}, LFz3;-><init>(LO86;Le13;LTq4;)V

    return-object v0
.end method

.method public final n()LYo5;
    .locals 4

    new-instance v0, LYo5;

    iget-object v1, p0, LSP0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, LSP0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->w2()Le13;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    iget-object v3, p0, LSP0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    invoke-direct {v0, v1, v2, v3}, LYo5;-><init>(LO86;Le13;LTq4;)V

    return-object v0
.end method
