.class public final LAv4$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAv4;->r0(Lio/reactivex/Observable;Lio/reactivex/Observable;LJv4;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1:",
        "Ljava/lang/Object;",
        "T2:",
        "Ljava/lang/Object;",
        "T3:",
        "Ljava/lang/Object;",
        "T4:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/i<",
        "Ljava/lang/String;",
        "TT1;TT2;TT3;TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0010\u000c\u001a\u00028\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0000\"\u0008\u0008\u0002\u0010\u0003*\u00020\u0000\"\u0008\u0008\u0003\u0010\u0004*\u00020\u0000\"\u0008\u0008\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0008\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "",
        "T",
        "T1",
        "T2",
        "T3",
        "R",
        "t",
        "t1",
        "t2",
        "t3",
        "apply",
        "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 ReleaseScanPresenter.kt\nco/bird/android/feature/release/ReleaseScanPresenter\n*L\n1#1,304:1\n218#2:305\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT1;TT2;TT3;)TR;"
        }
    .end annotation

    check-cast p4, Ljava/util/List;

    check-cast p3, Lco/bird/android/buava/Optional;

    check-cast p2, Lco/bird/android/buava/Optional;

    check-cast p1, Ljava/lang/String;

    new-instance v0, Lwb4;

    invoke-direct {v0, p1, p2, p3, p4}, Lwb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method