.class public final LQt1$h$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQt1$h;->g(Ljava/lang/String;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        "+",
        "Lco/bird/android/model/constant/QuickCaptureState;",
        "+",
        "Lorg/joda/time/DateTime;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/B<",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\n\u001a&\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\t0\t \u0004*\u0012\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\t0\t\u0018\u00010\u00080\u00082<\u0010\u0007\u001a8\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00060\u00060\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "LRe4;",
        "Lco/bird/android/model/persistence/Bird;",
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        "Lco/bird/android/model/constant/QuickCaptureState;",
        "kotlin.jvm.PlatformType",
        "Lorg/joda/time/DateTime;",
        "",
        "it",
        "Lio/reactivex/B;",
        "",
        "a",
        "(LRe4;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LQt1$h$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LQt1$h$a;

    invoke-direct {v0}, LQt1$h$a;-><init>()V

    sput-object v0, LQt1$h$a;->g:LQt1$h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)Lio/reactivex/B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lco/bird/android/model/persistence/Bird;",
            "Lco/bird/android/model/persistence/FlightSheetDetails;",
            "+",
            "Lco/bird/android/model/constant/QuickCaptureState;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/B<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/Observable;->never()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LQt1$h$a;->a(LRe4;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
