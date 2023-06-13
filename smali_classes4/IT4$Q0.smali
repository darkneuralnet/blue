.class public final LIT4$Q0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->u0(Lco/bird/android/model/wire/WireRide;[B)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/FileUploadReceipt;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/wire/WireRide;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/FileUploadReceipt;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/wire/WireRide;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;

.field public final synthetic h:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireRide;)V
    .locals 0

    iput-object p1, p0, LIT4$Q0;->g:LIT4;

    iput-object p2, p0, LIT4$Q0;->h:Lco/bird/android/model/wire/WireRide;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/FileUploadReceipt;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/wire/WireRide;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/FileUploadReceipt;->component2()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LIT4$Q0;->g:LIT4;

    invoke-static {v0}, LIT4;->access$getRideClient$p(LIT4;)LNP4;

    move-result-object v0

    new-instance v1, Lco/bird/api/request/UpdateRidePhotoBody;

    iget-object v2, p0, LIT4$Q0;->h:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lco/bird/api/request/UpdateRidePhotoBody;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LNP4;->r(Lco/bird/api/request/UpdateRidePhotoBody;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/FileUploadReceipt;

    invoke-virtual {p0, p1}, LIT4$Q0;->a(Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
