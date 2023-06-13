.class public final LAf3$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAf3;->observeLocation(Z)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LAf3$a;",
        "Lco/bird/android/model/wire/WireLocation;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LAf3$a;",
        "it",
        "Lco/bird/android/model/wire/WireLocation;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LAf3$a;)Lco/bird/android/model/wire/WireLocation;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LAf3$k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LAf3$k;

    invoke-direct {v0}, LAf3$k;-><init>()V

    sput-object v0, LAf3$k;->g:LAf3$k;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LAf3$a;)Lco/bird/android/model/wire/WireLocation;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LAf3$a;->b()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LAf3$a;

    invoke-virtual {p0, p1}, LAf3$k;->a(LAf3$a;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    return-object p1
.end method
