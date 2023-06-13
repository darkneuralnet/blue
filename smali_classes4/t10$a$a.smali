.class public final Lt10$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt10$a;->b(Lorg/joda/time/DateTime;)Lio/reactivex/h;
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lorg/joda/time/DateTime;

.field public final synthetic h:Lt10;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/joda/time/DateTime;Lt10;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lt10$a$a;->g:Lorg/joda/time/DateTime;

    iput-object p2, p0, Lt10$a$a;->h:Lt10;

    iput-object p3, p0, Lt10$a$a;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/h;
    .locals 2

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object p1

    iget-object v0, p0, Lt10$a$a;->g:Lorg/joda/time/DateTime;

    invoke-virtual {p1, v0}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt10$a$a;->h:Lt10;

    invoke-static {p1}, Lt10;->access$getBrainSwapDao$p(Lt10;)Ll10;

    move-result-object p1

    iget-object v0, p0, Lt10$a$a;->i:Ljava/lang/String;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Ll10;->g(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-virtual {p0, p1}, Lt10$a$a;->a(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
