.class public final Lg02$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg02;->p(Lj02;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/TestRideResponse;",
        "LxT5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/TestRideResponse;",
        "response",
        "LxT5;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/TestRideResponse;)LxT5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lg02$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg02$d;

    invoke-direct {v0}, Lg02$d;-><init>()V

    sput-object v0, Lg02$d;->g:Lg02$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/TestRideResponse;)LxT5;
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LxT5;

    invoke-virtual {p1}, Lco/bird/api/response/TestRideResponse;->getSuccessTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/response/TestRideResponse;->getSuccessMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LxT5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/TestRideResponse;

    invoke-virtual {p0, p1}, Lg02$d;->a(Lco/bird/api/response/TestRideResponse;)LxT5;

    move-result-object p1

    return-object p1
.end method
