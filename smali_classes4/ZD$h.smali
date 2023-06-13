.class public final LZD$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZD;-><init>(Landroid/content/Context;LTq4;LEa;Lde5;LhY;Lgl;LDX;Lio/reactivex/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lio/reactivex/B<",
        "+",
        "LTk5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "scanMode",
        "Lio/reactivex/B;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/lang/Integer;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZD;


# direct methods
.method public constructor <init>(LZD;)V
    .locals 0

    iput-object p1, p0, LZD$h;->g:LZD;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)Lio/reactivex/B;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "LTk5;",
            ">;"
        }
    .end annotation

    const-string v0, "scanMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;

    invoke-direct {v0}, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;->b(I)Lcom/polidea/rxandroidble2/scan/ScanSettings$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;->a()Lcom/polidea/rxandroidble2/scan/ScanSettings;

    move-result-object p1

    iget-object v0, p0, LZD$h;->g:LZD;

    invoke-static {v0}, LZD;->access$getRxBleClient$p(LZD;)Lde5;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/polidea/rxandroidble2/scan/ScanFilter;

    const/4 v2, 0x0

    invoke-static {}, LZD;->access$getSCAN_FILTER$cp()Lcom/polidea/rxandroidble2/scan/ScanFilter;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, p1, v1}, Lde5;->e(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LZD$h;->a(Ljava/lang/Integer;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
