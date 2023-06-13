.class public final LD03$a0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD03;->c(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LFQ3;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LFQ3;",
        "response",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LFQ3;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LD03;


# direct methods
.method public constructor <init>(LD03;)V
    .locals 0

    iput-object p1, p0, LD03$a0;->g:LD03;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LFQ3;)Lio/reactivex/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFQ3;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LFQ3;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LD03$a0;->g:LD03;

    invoke-virtual {p1}, LD03;->H0()LM03;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/ScanMode;->ADMIN:Lco/bird/android/model/constant/ScanMode;

    sget-object v2, Lco/bird/android/model/constant/ScanIntention;->OPERATOR_ACTION:Lco/bird/android/model/constant/ScanIntention;

    sget p1, Lnl4;->operator_scan_instruction_connectivity:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LM03$a;->operatorScanForBird$default(LM03;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Integer;ZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFQ3;

    invoke-virtual {p0, p1}, LD03$a0;->a(LFQ3;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
