.class public final LIT4$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->t3(Lio/reactivex/Observable;Ljava/lang/String;Lco/bird/android/model/RideState$Status;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "TT;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Object;)V"
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
.field public final synthetic g:LIT4;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/RideState$Status;


# direct methods
.method public constructor <init>(LIT4;Ljava/lang/String;Lco/bird/android/model/RideState$Status;)V
    .locals 0

    iput-object p1, p0, LIT4$u;->g:LIT4;

    iput-object p2, p0, LIT4$u;->h:Ljava/lang/String;

    iput-object p3, p0, LIT4$u;->i:Lco/bird/android/model/RideState$Status;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LIT4$u;->invoke(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LIT4$u;->g:LIT4;

    iget-object v1, p0, LIT4$u;->h:Ljava/lang/String;

    iget-object v2, p0, LIT4$u;->i:Lco/bird/android/model/RideState$Status;

    invoke-static {v0, v1, v2, p1}, LIT4;->access$resetRideStateUpdateStateWithStatus(LIT4;Ljava/lang/String;Lco/bird/android/model/RideState$Status;Ljava/lang/Object;)V

    return-void
.end method
