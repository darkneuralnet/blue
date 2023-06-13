.class public final synthetic LrC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lco/bird/android/buava/Optional;

.field public final synthetic c:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/buava/Optional;Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrC;->b:Lco/bird/android/buava/Optional;

    iput-object p2, p0, LrC;->c:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LrC;->b:Lco/bird/android/buava/Optional;

    iget-object v1, p0, LrC;->c:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;

    invoke-static {v0, v1, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$c$b;->a(Lco/bird/android/buava/Optional;Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;Landroid/view/View;)V

    return-void
.end method
