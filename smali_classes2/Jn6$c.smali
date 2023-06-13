.class public final LJn6$c;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJn6;->Gk(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Jn6$c",
        "Landroid/text/style/ClickableSpan;",
        "Landroid/view/View;",
        "widget",
        "",
        "onClick",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSpans+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spans+.kt\nco/bird/android/widget/span/Spans_Kt$clickableSpan$1\n+ 2 VehicleTipUi.kt\nco/bird/android/app/feature/tip/VehicleTipUiImpl\n*L\n1#1,9:1\n67#2:10\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:LJn6;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(LJn6;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LJn6$c;->b:LJn6;

    iput-object p2, p0, LJn6$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LJn6$c;->b:LJn6;

    invoke-static {p1}, LJn6;->access$getEmergencyPhoneNumberClicks$p(LJn6;)Lma4;

    move-result-object p1

    iget-object v0, p0, LJn6$c;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method
