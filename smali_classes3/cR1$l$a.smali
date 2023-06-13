.class public final LcR1$l$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcR1$l;->e(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LcR1$l$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LcR1$l$a;

    invoke-direct {v0}, LcR1$l$a;-><init>()V

    sput-object v0, LcR1$l$a;->g:LcR1$l$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;
    .locals 1

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getStatus()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, LcR1$f;

    invoke-direct {v0, p1}, LcR1$f;-><init>(Lco/bird/android/model/persistence/BrainSwapRecord;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-virtual {p0, p1}, LcR1$l$a;->a(Lco/bird/android/model/persistence/BrainSwapRecord;)Lco/bird/android/model/persistence/BrainSwapRecord;

    move-result-object p1

    return-object p1
.end method
