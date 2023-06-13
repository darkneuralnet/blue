.class public final LYd5$w$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYd5$w;->d(LTk5;)Lna4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lke5;",
        "Lio/reactivex/K<",
        "+[B>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lke5;",
        "connection",
        "Lio/reactivex/K;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lke5;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LYd5$w$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYd5$w$a;

    invoke-direct {v0}, LYd5$w$a;-><init>()V

    sput-object v0, LYd5$w$a;->g:LYd5$w$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lke5;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke5;",
            ")",
            "Lio/reactivex/K<",
            "+[B>;"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/GattUuid;->COMMAND:Lco/bird/android/model/GattUuid;

    invoke-virtual {v0}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/Command;->RENTAL_MODE:Lco/bird/android/model/Command;

    invoke-virtual {v1}, Lco/bird/android/model/Command;->getData()[B

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lke5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lke5;

    invoke-virtual {p0, p1}, LYd5$w$a;->a(Lke5;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
