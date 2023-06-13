.class public final Lco/bird/android/manager/bluetooth/internal/a$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/a;->g(Lco/bird/android/model/Vehicle;II)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "token",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/bluetooth/internal/a;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lco/bird/android/manager/bluetooth/internal/a;II)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$j;->g:Lco/bird/android/manager/bluetooth/internal/a;

    iput p2, p0, Lco/bird/android/manager/bluetooth/internal/a$j;->h:I

    iput p3, p0, Lco/bird/android/manager/bluetooth/internal/a$j;->i:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/a$j;->invoke(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a$j;->g:Lco/bird/android/manager/bluetooth/internal/a;

    iget v1, p0, Lco/bird/android/manager/bluetooth/internal/a$j;->h:I

    iget v2, p0, Lco/bird/android/manager/bluetooth/internal/a$j;->i:I

    invoke-static {v0, p1, v1, v2}, Lco/bird/android/manager/bluetooth/internal/a;->access$maxSpeedCommand(Lco/bird/android/manager/bluetooth/internal/a;Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
