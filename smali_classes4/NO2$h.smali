.class public final LNO2$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNO2;->I(Ljava/lang/String;Ljava/lang/String;[B)Lio/reactivex/Observable;
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
        "Lco/bird/api/request/RepairJobSubmission;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/FileUploadReceipt;",
        "<name for destructuring parameter 0>",
        "Lco/bird/api/request/RepairJobSubmission;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/FileUploadReceipt;)Lco/bird/api/request/RepairJobSubmission;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LNO2$h;->g:Ljava/lang/String;

    iput-object p2, p0, LNO2$h;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/FileUploadReceipt;)Lco/bird/api/request/RepairJobSubmission;
    .locals 3

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/FileUploadReceipt;->component2()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lco/bird/api/request/RepairJobSubmission;

    iget-object v1, p0, LNO2$h;->g:Ljava/lang/String;

    iget-object v2, p0, LNO2$h;->h:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lco/bird/api/request/RepairJobSubmission;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/FileUploadReceipt;

    invoke-virtual {p0, p1}, LNO2$h;->a(Lco/bird/android/model/FileUploadReceipt;)Lco/bird/api/request/RepairJobSubmission;

    move-result-object p1

    return-object p1
.end method
