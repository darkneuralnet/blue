.class public final LcR1$t;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcR1;->b(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WirePart;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Long;",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "<anonymous parameter 0>",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "a",
        "(Ljava/lang/Long;Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LcR1$t;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LcR1$t;

    invoke-direct {v0}, LcR1$t;-><init>()V

    sput-object v0, LcR1$t;->g:LcR1$t;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "record"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    check-cast p2, Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-virtual {p0, p1, p2}, LcR1$t;->a(Ljava/lang/Long;Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;

    move-result-object p1

    return-object p1
.end method