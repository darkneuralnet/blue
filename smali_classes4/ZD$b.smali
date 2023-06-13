.class public final LZD$b;
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
        "Lkotlin/Pair<",
        "+",
        "LTk5;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lco/bird/android/model/BleScanResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "",
        "<name for destructuring parameter 0>",
        "Lco/bird/android/model/BleScanResult;",
        "a",
        "(Lkotlin/Pair;)Lco/bird/android/model/BleScanResult;"
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

    iput-object p1, p0, LZD$b;->g:LZD;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lco/bird/android/model/BleScanResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "LTk5;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lco/bird/android/model/BleScanResult;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LTk5;

    new-instance v0, Lco/bird/android/model/BleScanResult;

    const-string v1, "scanResult"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LZD$b;->g:LZD;

    invoke-static {v1}, LZD;->access$getPreference$p(LZD;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->W()Lco/bird/android/model/wire/WireLocation;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lco/bird/android/model/BleScanResult;-><init>(LTk5;Lco/bird/android/model/wire/WireLocation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LZD$b;->a(Lkotlin/Pair;)Lco/bird/android/model/BleScanResult;

    move-result-object p1

    return-object p1
.end method
