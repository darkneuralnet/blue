.class public final LYs1$k$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYs1$k;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/constant/QuickCaptureState;",
        "Lorg/joda/time/DateTime;",
        "Lorg/joda/time/DateTime;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/constant/QuickCaptureState;",
        "<anonymous parameter 0>",
        "Lorg/joda/time/DateTime;",
        "timeout",
        "a",
        "(Lco/bird/android/model/constant/QuickCaptureState;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LYs1$k$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYs1$k$d;

    invoke-direct {v0}, LYs1$k$d;-><init>()V

    sput-object v0, LYs1$k$d;->g:LYs1$k$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/constant/QuickCaptureState;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "timeout"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/constant/QuickCaptureState;

    check-cast p2, Lorg/joda/time/DateTime;

    invoke-virtual {p0, p1, p2}, LYs1$k$d;->a(Lco/bird/android/model/constant/QuickCaptureState;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    return-object p1
.end method
