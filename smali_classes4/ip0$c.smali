.class public final Lip0$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lip0;->d(Lco/bird/android/model/persistence/Bird;JJ)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/Bird;",
        "Lco/bird/android/model/persistence/Bird;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Bird;",
        "wireBird",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/persistence/Bird;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lip0$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lip0$c;

    invoke-direct {v0}, Lip0$c;-><init>()V

    sput-object v0, Lip0$c;->g:Lip0$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/persistence/Bird;
    .locals 2

    const-string v0, "wireBird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getLocked()Z

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getAckLocked()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p0, p1}, Lip0$c;->a(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    return-object p1
.end method
