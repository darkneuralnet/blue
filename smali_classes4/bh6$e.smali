.class public final Lbh6$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbh6;->m(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireUserGuest;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireUserGuest;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "b",
        "(Lco/bird/android/model/wire/WireUserGuest;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lbh6;


# direct methods
.method public constructor <init>(Lbh6;)V
    .locals 0

    iput-object p1, p0, Lbh6$e;->g:Lbh6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/model/wire/WireUserGuest;Lco/bird/android/model/wire/WireUserGuest;)I
    .locals 0

    invoke-static {p0, p1}, Lbh6$e;->c(Lco/bird/android/model/wire/WireUserGuest;Lco/bird/android/model/wire/WireUserGuest;)I

    move-result p0

    return p0
.end method

.method public static final c(Lco/bird/android/model/wire/WireUserGuest;Lco/bird/android/model/wire/WireUserGuest;)I
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireUserGuest;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireUserGuest;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireUserGuest;)V
    .locals 2

    iget-object v0, p0, Lbh6$e;->g:Lbh6;

    invoke-static {v0}, Lbh6;->access$getMutableActiveGuests$p(Lbh6;)La94;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lch6;

    invoke-direct {v1}, Lch6;-><init>()V

    invoke-static {v0, p1, v1}, Lb94;->b(La94;Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireUserGuest;

    invoke-virtual {p0, p1}, Lbh6$e;->b(Lco/bird/android/model/wire/WireUserGuest;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
