.class public final Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/suggestanest/SuggestNestActivity;->t1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Location;",
        "Lqc0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Landroid/location/Location;",
        "location",
        "Lqc0;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Landroid/location/Location;)Lqc0;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;

    invoke-direct {v0}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;-><init>()V

    sput-object v0, Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;->g:Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/location/Location;)Lqc0;
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    const/high16 v0, 0x418c0000    # 17.5f

    invoke-static {p1, v0}, Lrc0;->e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity$q;->a(Landroid/location/Location;)Lqc0;

    move-result-object p1

    return-object p1
.end method
